package com.zzjp.lab1.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class Animal {
    @Getter @Setter @EqualsAndHashCode.Include private String name;
    @Getter @Setter private String type;
    @Getter @Setter private int age;

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
}
