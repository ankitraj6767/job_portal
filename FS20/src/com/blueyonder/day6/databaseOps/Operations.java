package com.blueyonder.day6.databaseOps;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.blueyonder.day6.databaseOps.Query.ADD_DEPARTMENT;
import static com.blueyonder.day6.databaseOps.Query.DISPLAY_PAYROLL;
import static com.blueyonder.day6.databaseOps.Query.GENERATE_PAYROLL;
import static com.blueyonder.day6.databaseOps.Query.UPDATE_DEPARTMENT;
import static com.blueyonder.day6.databaseOps.Query.DISPLAY_DEPARTMENT;

public class Operations {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BYdb", "postgres", "12345");
        Statement statement = connection.createStatement();
        Scanner sc = new Scanner(System.in);
        PreparedStatement addQuery = connection.prepareStatement(ADD_DEPARTMENT);
        PreparedStatement updateQuery = connection.prepareStatement(UPDATE_DEPARTMENT);
        PreparedStatement payrollQuery = connection.prepareCall(GENERATE_PAYROLL);
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:postgresql://localhost:5432/BYdb");
        rowSet.setUsername("postgres");
        rowSet.setPassword("12345");
        int choice;
        do {
            System.out.print("\nMenu: 1 - Add department | 2 - Update department | 3 - Display department | 4 - Generate Payroll | 5 - Exit\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addDepartment(addQuery);
                    break;
                case 2:
                    updateDepartment(updateQuery);
                    break;
                case 3:
                    displayDepartment(statement);
                    displayDepartment(rowSet);
                    break;
                case 4:
                    generatePayroll(payrollQuery, rowSet);
                    break;
                case 5:
                    System.out.println("Thank you.");
                    break;
                default:
                    System.out.println("Invalid choice, please re-enter.");
            }
        } while (choice != 5);
    }

    public static void addDepartment(PreparedStatement preparedStatement) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new department ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new department name: ");
        String name = sc.nextLine();
        System.out.print("Enter new department location: ");
        String loc = sc.nextLine();
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, loc);
        preparedStatement.executeUpdate();
    }

    public static void updateDepartment(PreparedStatement preparedStatement) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department ID whose name is to be modified: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new department name: ");
        String name = sc.nextLine();
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    public static void displayDepartment(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery(DISPLAY_DEPARTMENT);
        while (resultSet.next())
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
    }

    public static void displayDepartment(JdbcRowSet rowSet) throws SQLException {
        rowSet.setCommand(DISPLAY_DEPARTMENT);
        rowSet.execute();
        while (rowSet.next())
            System.out.println(rowSet.getInt(1) + " " + rowSet.getString(2) + " " + rowSet.getString(3));
    }

    public static void generatePayroll(PreparedStatement payrollQuery, RowSet rowSet) throws SQLException {
        payrollQuery.executeUpdate();
        rowSet.setCommand(DISPLAY_PAYROLL);
        rowSet.execute();
        while (rowSet.next())
            System.out.println(rowSet.getInt(1) + " " + rowSet.getString(2) + " " + rowSet.getDouble(3));
    }
}
