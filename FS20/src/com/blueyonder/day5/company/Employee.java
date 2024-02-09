package com.blueyonder.day5.company;

import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int employeeID;
    private String name;
    private String designation;
    private Location location;
    private Address address;
}
