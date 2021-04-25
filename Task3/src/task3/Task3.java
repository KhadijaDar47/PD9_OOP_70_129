/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static String removeInteger(String line)
    {
        String newLine="";
                for (int i = 0; i < line.length(); i++) {
            if(!(line.charAt(i)>='0'&&line.charAt(i)<='9'))
            {
                newLine=newLine+line.charAt(i);
            }
        }
                return newLine;
    }
    public static String ridMultipleBlank(String line)
    {
        String newLine=line.replaceAll("\\s+"," ");
        return newLine;
    }
    public static String stringEncryption(String line)
    {
        int code;
        char newcode;
        String returncode="";
         for (int i = 0; i < line.length(); i++) {
             code=line.charAt(i);
             code=code+5*2;
             newcode=(char)code;
             returncode=returncode+newcode;
         }
         return returncode.toUpperCase();
        
    }
    
    public static void main(String[] args) {
        String line;
        int option = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Press 1 To Remove Multiple Spaces\nPress 2 To Remove Integer\nPress 3 To Encrypt String\nPress 0 To Close");
            System.out.println("Enter option: ");
            option=input.nextInt();
            switch (option) {
                case 1:
                    input.nextLine();
                    System.out.println("Please Enter the String: ");
                    line = input.nextLine();
                    System.out.println("After removing extra spaces: "+ridMultipleBlank(line));
                    break;
                case 2:
                     input.nextLine();
                    System.out.println("Please Enter the String: ");
                    line = input.nextLine();
                    System.out.println("After removing integer: "+removeInteger(line));
                    break;
                case 3:
                     input.nextLine();
                    System.out.println("Please Enter the String: ");
                    line = input.nextLine();
                    System.out.println("After Encryption: "+stringEncryption(line));
                    break;
                case 0:
                    System.out.println("System Closed");
                    break;
                default:
                    System.out.println("INVALID OPTION");
                    break;
            }
        } while (option != 0);

    }

}
