package com.zzjp.lab1.printer;

import com.zzjp.lab1.model.ModelAPI;
import com.zzjp.lab1.model.ModelAPIImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ModelAPI api = new ModelAPIImpl();
        Object animal = api.createAnimal("Burek", "Pies", 4);
        System.out.println(animal);
    }
}
