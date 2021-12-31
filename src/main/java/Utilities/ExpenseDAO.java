package Utilities;

public class ExpenseDAO {

    private String date;
    private String expenseName;
    private int amount;

    public String getDate() {
        return date;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public int getAmount() {
        return amount;
    }

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
