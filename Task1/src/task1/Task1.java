/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Task1 {

    public static int wordCounter(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int vowelCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')) {
                count++;
            }
        }
        return count;
    }

    public static int puncCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == ':' || s.charAt(i) == ';' || s.charAt(i) == '?') {
                count++;
            }
        }
        return count;
    }

    public static Boolean findSubString(String s) {
        Boolean flag = false;
        if (s.contains("the")) {
            flag = true;
            System.out.println("the is a part of the string");
        } else {
            System.out.println("the is not a part of the string");
        }
        return flag;
    }

    public static void main(String[] args) {
        String line;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        line = input.nextLine();
        System.out.println("Number Of words: " + wordCounter(line));
        System.out.println("Number Of Vowels: " + vowelCounter(line));
        System.out.println("Number Of Punctions: " + puncCounter(line));
        System.out.print("Substring: " + findSubString(line));

    }
}
