package Utilities;

import java.sql.*;

/**
 * The type Expense connection.
 */
public class ExpenseConnection {

    /**
     * Insert expense.
     *
     * @param ed the ed
     */
    public static void insertExpense(ExpenseDAO ed){

        try{

            CP cp = new CP();
            Connection con = cp.createConnection();
            String q = "insert into expense(Date, ExpenseName, Amount) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1,ed.getDate());
            ps.setString(2, ed.getExpenseName());
            ps.setInt(3, ed.getAmount());

            ps.executeUpdate();

        }catch(SQLException e){

             e.printStackTrace();

        }

   }

    /**
     * Show expenseby month.
     *
     * @param se the se
     */
    public static void showExpensebyMonth(ShowExpense se){

        try{

            CP cp = new CP();
            Connection con = cp.createConnection();

            String month = se.getMonth();

            String year = se.getYear();

            String q = "Select * from expense where Month(Date) ="+month+" and Year(Date) ="+year;

            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(q);

            while(set.next()){

                String date = set.getString(1);
                String expenseName = set.getString(2);
                String amount = set.getString(3);

                System.out.println("********************************************************************");
                System.out.println("||Date: "+date+" Expense Name: "+expenseName+" Amount: "+amount+" ||");
                System.out.println("********************************************************************");
            }



        }catch(SQLException e){

            e.printStackTrace();

        }

    }

}
