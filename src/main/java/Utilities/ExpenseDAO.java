package Utilities;

/**
 * The type Expense dao.
 */
public class ExpenseDAO {

    private String date;
    private String expenseName;
    private int amount;

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Gets expense name.
     *
     * @return the expense name
     */
    public String getExpenseName() {
        return expenseName;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Instantiates a new Expense dao.
     *
     * @param date        the date
     * @param expenseName the expense name
     * @param amount      the amount
     */
    public ExpenseDAO(String date, String expenseName, int amount){

        this.date = date;
        this.expenseName = expenseName;
        this.amount = amount;

    }

    @Override
    public String toString() {
        return "Expenses{" +
                "Date='" + date + '\'' +
                ", Expense Name='" + expenseName + '\'' +
                ", Amount='" + amount + '\'' +
                '}';
    }
}
