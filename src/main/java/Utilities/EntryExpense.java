package Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The type Entry expense.
 */
public class EntryExpense {

    /**
     * Entry expense.
     *
     * @throws IOException the io exception
     */
    public void entryExpense() throws IOException {

        String date;
        String expenseName;
        int amount;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Date of transaction in 'YYYY-MM-DD' format: ");
        date = bf.readLine();

        System.out.println("Enter Expense Name: ");
        expenseName = bf.readLine();

        System.out.println("Enter Amount: ");
        amount = Integer.parseInt(bf.readLine());

        ExpenseDAO ed = new ExpenseDAO(date, expenseName, amount);

        ExpenseConnection.insertExpense(ed);

        System.out.println(ed.toString());
    }


}
