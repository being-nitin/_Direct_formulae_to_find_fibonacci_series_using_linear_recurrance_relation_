package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*

	 */
        for(int i=0;i<10;i++) {
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int num){
        return (int)(Math.pow(((1 + Math.sqrt(5))/2),num)/Math.sqrt(5));
    }
}
