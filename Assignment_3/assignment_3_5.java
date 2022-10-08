package Assignment_3;

import  armstrong.armstrong;          // armstrong package  and armstrong class
import  com.calculator.calculator;    // com.calculator package and calculator class
import java.util.Scanner;

public class assignment_3_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        armstrong arm = new armstrong();

        System.out.println("enter number ");
        int a = sc.nextInt();
        arm.setNumber(a);
        arm.ar();


        calculator cal = new calculator();

        System.out.println("enter number x and y");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        cal.setA(x);
        cal.setB(y);
        System.out.println("your first number is :  " + cal.getA());
        System.out.println("your second number is :   " + cal.getB());
        cal.add();
        cal.sub();
        cal.mul();
        cal.div();

    }

}
