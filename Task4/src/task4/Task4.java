/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Task4 {

    /**
     */
    // Using the max() method of Math Class
    public static void FindMaxNumber() {

    }

    public static void FindEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even ");

        } else {
            System.out.println(num + " is Odd ");

        }

    }

    public static void EqualString(String a, String b) {
        if (a.equals(b)) {
            System.out.println(" The String " + a + " is Equal to the String " + b);

        } else {
            System.out.println(" The Strings Are not Equal");
        }

    }

    public static void EmptyString(String X) {
        if (X.isEmpty()) {
            System.out.println(" The String Is Empty");
        } else {
            System.out.println(" The String Is Not Empty");
        }

    }

    public static int CountSpaces(String str) {
        int space = 0;
        for(int i = 0;i < str.length();i++) 
        {
          char ch = str.charAt(i);
            if (ch == ' ') {
                space++;
            }
        }
       return space;
    }
    
    public static int DigitCounter(String s) {
       int count=0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                count = count + 1;
            }
        }

        return count;
    }
    
     public static int CapitalCounter(String cap)
    {
        int c=0;
       
        for(int i=0;i<cap.length();i++)
        {
            if(cap.charAt(i)>='A' && cap.charAt(i)<='Z')
                c++;
        }
    
    return c;
    }
    
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;

        do {

            System.out.println("Press 1 To Find Maximum Number\nPress 2 To Find Even Odd Numbers\nPress 3 To Check Equality Of Strings\nPress 4 To Check An Empty String\nPress 5 To Count White Spaces In String\nPress 6 to Count Digits\nPress 7 to Count capital Letters");
            System.out.println("Enter option: ");
            option = input.nextLine();

            switch (Integer.valueOf(option)) {

                // TODO code application logic here
                // Function 1 
                case 1:
                    int a = 0;
                    int b = 0;
                    System.out.println("Enter The First Number: ");
                    a = input.nextInt();
                    System.out.println("Enter The Second Number: ");
                    b = input.nextInt();
                    System.out.println("The Maximum Number is: " + Math.max(a, b));
                    break;
                // Function 2
                case 2:
                    int num;
                    System.out.println("Enter The Number: ");
                    num = input.nextInt();
                    FindEvenOdd(num);
                    break;

                case 3:
                    String s1;
                    String s2;
                    System.out.println("Enter The First String: ");
                    s1 = input.nextLine();
                    System.out.println("Enter The Second String: ");
                    s2 = input.nextLine();
                    Task4.EqualString(s1, s2);
                    break;

                case 4:
                    String s3;
                    System.out.println("Enter The String: ");
                    s3 = input.nextLine();
                    Task4.EmptyString(s3);
                    break;

                case 5:
                    String str;
                    System.out.println("Enter The String: ");
                    str= input.nextLine();
                    System.out.println("No of spaces: "+Task4.CountSpaces(str));
                    break;
                    
                case 6:
                    String s;
                    System.out.println("Enter The String: ");
                    s = input.nextLine();
                    System.out.println("Digits : "+Task4.DigitCounter(s));
                    break;
                    
                case 7:
                   String d;
                   System.out.println("Enter The String: ");
                   d = input.nextLine();
                   System.out.println("Capital Letters Are: " + Task4.CapitalCounter(d));
                   break;
                    

                default:
                    System.out.println("INVALID OPTION");
                    break;
                    
                    
            }

        } while (Integer.valueOf(option) != 0);
    }

}
