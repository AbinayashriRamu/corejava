package com.chainsys.test;
import java.util.Scanner;
public class Rain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is it raining?(yes or no)");
        String firstString=sc.nextLine();
        String fs="yes";
        if(fs.equals(firstString)) {
            System.out.println("Please bring an umbrella !!!");
        }
        System.out.println("Enter the temperature(in celsius)");
        int c=sc.nextInt();
        sc.close();
        if(c<32) {
            System.out.println("Bring heavy jacket with you");
        }
            else if((c>32) && c<50) {
                System.out.println("Bring light jacket");
            }
            else {
                System.out.println("No need jackets");
            }
        }
}