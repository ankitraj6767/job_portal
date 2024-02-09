package com.blueyonder.day3.inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person extends Human {
    private String name;
    private String fathersName;
    private String mothersName;
    private String occupation;

    public void introducing() {
    }
}
