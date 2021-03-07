package com.zzjp.lab1.model;

public class ModelAPIImpl implements ModelAPI {
    @Override
    public Object createAnimal(String name, String type, int age) {
        return new Animal(name, type, age);
    }
}
