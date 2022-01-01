package Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The type Show expense.
 */
public class ShowExpense {

   private String month;
   private String year;

    /**
     * Sets date.
     *
     * @throws IOException the io exception
     */
    public void setDate() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the year for which the expense you want to retrieve");
        this.year = bf.readLine();

        System.out.println("Enter the month for which the expense you want to retrieve");
        this.month = bf.readLine();



    }

    /**
     * Gets month.
     *
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * Gets year.
     *
     * @return the year
     */
    public String getYear() {
        return year;
    }
}
