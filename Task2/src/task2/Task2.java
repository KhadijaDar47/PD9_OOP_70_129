/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Task2 {

    /**
     * @param line
     * @return
     */
    public static String displayVertical(String line) {
         System.out.println("Vertical Display: ");
        for (int i = 0; i < line.length(); i++) {

            System.out.println(line.charAt(i));
        }
        return "";
    }

    public static void main(String[] args) {
        String line;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The String:");
        line = input.nextLine();
        displayVertical(line);

    }

}
