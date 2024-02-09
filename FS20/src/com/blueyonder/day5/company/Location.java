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
public class Location {
    private float latitude;
    private float longitude;
    private String name;
}
