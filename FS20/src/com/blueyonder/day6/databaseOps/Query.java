package com.blueyonder.day6.databaseOps;

public class Query {
    public static final String ADD_DEPARTMENT = "insert into department values (?,?,?)";
    public static final String UPDATE_DEPARTMENT = "update department set name = ? where id = ?";
    public static final String DISPLAY_DEPARTMENT = "select * from department order by id asc";
    public static final String GENERATE_PAYROLL="call generate_payroll()";
    public static final String DISPLAY_PAYROLL="select id, name, netsalary from employee order by id asc";
}
