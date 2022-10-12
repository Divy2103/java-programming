package Assignment_7;

import java.util.ArrayList;
import java.util.Scanner;

class PersonalLoan{
      int age;
      int income;
      int experience;
      String citizenship;
      String name;

      void userinfo(){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter name");
          name = sc.next();
          System.out.println("Enter age");
          age = sc.nextInt();
          System.out.println("enter income");
          income = sc.nextInt();
          System.out.println("enter experience");
          experience = sc.nextInt();
          System.out.println("citizenship");
          citizenship = sc.next();

      }
}

public class assignment_7_3 {
    public static void main(String[] args) {
        PersonalLoan l1 = new PersonalLoan();
        PersonalLoan l2 = new PersonalLoan();
        PersonalLoan l3 = new PersonalLoan();
        PersonalLoan l4 = new PersonalLoan();
        PersonalLoan l5 = new PersonalLoan();

        System.out.println("User 1 detail :");
        l1.userinfo();
        System.out.println("User 2 detail :");
        l2.userinfo();
        System.out.println("User 3 detail :");
        l3.userinfo();
        System.out.println("User 4 detail :");
        l4.userinfo();
        System.out.println("User 5 detail :");
        l5.userinfo();


        ArrayList<PersonalLoan> ps = new ArrayList<>();
//        System.out.println(ps);
        ps.add(l1);
        ps.add(l2);
        ps.add(l3);
        ps.add(l4);
        ps.add(l5);

        System.out.println("Eligible user is :");
        for (PersonalLoan P : ps) {
            if (P.age>=21 && P.age<=60 && P.income>=15000 && P.experience>=1 && P.citizenship.equals("india")){
                System.out.println(P.name);
            }
        }
    }
}
