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

    public static int wordCounter(String line) {
        int count=1;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i)==' ')
            {
                count++;
            }
        }
        return count;
    }
     public static int vowelCounter(String line) {
        int count=0;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i)=='a'||line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u')
            {
                count++;
            }
        }
        return count;
    }
      public static int puncCounter(String line) {
        int count=0;
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i)=='.'||line.charAt(i)==','||line.charAt(i)==':'||line.charAt(i)==';'||line.charAt(i)=='?')
            {
                count++;
            }
        }
        return count;
    }
    

    public static void main(String[] args) {
        String line;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        line = input.nextLine();
        System.out.println("Contain words: "+wordCounter(line));
        System.out.println("Contain Vowels: "+vowelCounter(line));
        System.out.println("Contain Punction: "+puncCounter(line));

    }

}
