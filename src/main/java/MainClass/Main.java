package MainClass;

import Utilities.EntryExpense;
import Utilities.ShowExpense;
import Utilities.showExpenseConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
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
             System.out.println("Press 2 to show total expenses for a date");
             System.out.println("Press 3 to exit");

             System.out.println("Enter your choice: ");
             int choice = Integer.parseInt(bf.readLine());

             switch(choice){

                 case 1:
                     //add expense
                     ee.entryExpense();
                     break;

                 case 2:
                     //show expense
                     showExpenseConnection.showExpense();
                     break;
                 case 3:
                     //exit
                     flag = false;
                     System.out.println("Thank You for using expense tracker!!");
                     break;

             }

         }

     }


}
