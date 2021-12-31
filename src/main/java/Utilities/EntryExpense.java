package Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntryExpense {

    public void entryExpense() throws IOException {

        String date;
        String expenseName;
        int amount;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Date of transaction in 'DD/MM/YYYY' format: ");
        date = bf.readLine();

        System.out.println("Enter Expense Name: ");
        expenseName = bf.readLine();

        System.out.println("Enter Amount: ");
        amount = Integer.parseInt(bf.readLine());

        ExpenseDAO ed = new ExpenseDAO(date, expenseName, amount);

    }


}
