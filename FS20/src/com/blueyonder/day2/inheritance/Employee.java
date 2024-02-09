package com.blueyonder.day2.inheritance;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private int id;
    private String name;
    private String designation;

    @Override
    public boolean equals(Object obj) {
        if(this.getClass()!=(obj.getClass())) {
            System.out.println(this.getClass()+" "+obj.getClass());
            System.out.println("Different classes.");
            return false;
        }
        Employee e=(Employee) obj;
        if(this.id!=e.id)
            return false;
        if(!this.name.equals(e.name))
            return false;
        return (this.designation.equals(e.designation));
    }

    //    @Override
    //    public String toString() {
    //        return "Employee{" +
    //                "id=" + id +
    //                ", name='" + name + '\'' +
    //                ", designation='" + designation + '\'' +
    //                '}';
    //    }
}
