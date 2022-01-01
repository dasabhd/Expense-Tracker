package Utilities;

import java.io.IOException;

/**
 * The type Show expense connection.
 */
public class showExpenseConnection {

    /**
     * Show expense.
     *
     * @throws IOException the io exception
     */
    public static void showExpense() throws IOException {

        ShowExpense SE = new ShowExpense();

        SE.setDate();

        ExpenseConnection.showExpensebyMonth(SE);

    }

}
