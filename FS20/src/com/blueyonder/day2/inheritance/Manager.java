package com.blueyonder.day2.inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Manager extends Employee {
    private int travelAllowance;
    private int teamSize;

    public Manager(int id, String name, String designation, int travelAllowance, int teamSize) {
        super(id, name, designation);
        this.travelAllowance = travelAllowance;
        this.teamSize = teamSize;
    }
}
