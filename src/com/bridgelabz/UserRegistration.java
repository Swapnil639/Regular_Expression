package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
        System.out.print("Enter E-mail: ");
        String email = scanner.nextLine();
        System.out.println(Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,5}", email));
    }
}
