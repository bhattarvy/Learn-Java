package com.example.exception;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exception1 {

    public static void main(String[] args) {

        // Aithmetic Exception Divided by 0
        try{
            int i =100/0;
        } catch(Exception e) {
            System.out.println(e);
        }

        // NUll pointer exception
        try{
            String s=null;
            System.out.println(s.length());
        } catch(Exception e) {
            System.out.println(e);
        }

        // Number format Exception
        try {
            String s="122a3";
            System.out.println(Integer.parseInt(s));
            System.out.println("this string can not converted to integer");
        } catch(Exception e) {
            System.out.println(e);
        }

        // Array Index out of bound exception
        try{
            int[] a= new int[5];
            a[10]=4;
        } catch (Exception e){
            System.out.println(e);
        }

        //Multiple catch block , this should be from specific to general exceptions, otherwise it will throw
        try{
            int[] a= new int[5];
            a[10]=6;
        } catch ( ArithmeticException e){
            System.out.println("Specific exceptiono");
        } catch (Exception e){
            System.out.println("General Exception");
        }

        // Nested try catch
        try{
            int[] a= new int[5];
            a[0]=10;
            try{
                int x=a[0]/0;
                System.out.println("Successfully divide with zero");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("after first try block");
            a[10]=10;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        // Nested try catch when catch exception is not of correct type then it will check the catch from nested to outer one catch
        try{
            int[] a= new int[5];
            try{
                a[10]=2;

            }catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("inner catch");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("outer catch");
        }

        // Finally block
        try{
            int[] a=new int[5];
            a[10]=2;
        } catch (Exception e){
            System.out.println("catch is excecuted");
        } finally {
            System.out.println("Finally code");
        }
    }
}
