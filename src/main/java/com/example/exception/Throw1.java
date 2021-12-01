package com.example.exception;

import com.sun.xml.internal.org.jvnet.fastinfoset.FastInfosetException;

import java.io.FileNotFoundException;


// an example to show how throw and throws clause work

public class Throw1 {

    public static void throwMethod() throws Throw2 {
        throw new Throw2("user defined exception");
    }
    public static void main(String[] args) {
        try {
            throwMethod();
        } catch (Throw2 e){
            System.out.println(e);
        }
        System.out.println("End code");
    }
}
