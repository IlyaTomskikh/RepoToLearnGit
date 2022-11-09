/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gitprojectmvn;

/**
 *
 * @author Ilya
 */
public class Gitprojectmvn {
    
    public static String hello() {
        return "Hello!!!";
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Hello World!" + hello() + " " + a + " + " + b + " = " + sum(a, b));
    }
}
