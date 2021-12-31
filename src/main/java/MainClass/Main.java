package MainClass;

import Utilities.EntryExpense;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

     public static void main(String[] args) throws IOException {

         System.out.println("||Welcome to Daily Expense Tracker||");
         System.out.println("||--------------------------------||");
         System.out.println("<<-------------------------------->>");

         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

         EntryExpense ee = new EntryExpense();

         boolean flag  = true;

         while(flag){

             System.out.println("<--Instructions-->");
             System.out.println("Press 1 to add expense");
             System.out.println("Press 2 to exit");

             System.out.println("Enter your choice: ");
             int choice = Integer.parseInt(bf.readLine());

             switch(choice){

                 case 1:
                     //add expense
                     ee.entryExpense();
                     break;

                 case 2:
                     //exit
                     flag = false;
                     System.out.println("Thank You for using expense tracker!!");
                     break;

             }

         }

     }


}
