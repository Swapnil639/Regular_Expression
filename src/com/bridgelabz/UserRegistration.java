package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Last name :");
        String firstName=scanner.next();
        Matcher matcher =  pattern.matcher(firstName);
        if(matcher.matches())
            System.out.println("Valid");
        else
            System.out.println("InValid");
    }
}
