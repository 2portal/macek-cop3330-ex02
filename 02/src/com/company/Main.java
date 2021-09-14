package com.company;
import java.util.Scanner;
import java.io.*;
class Main {
    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        Scanner input = new Scanner (System.in);
        String strng= input.next();
        System.out.println(strng +" has "+ strng.length() + " characters");
    }
}