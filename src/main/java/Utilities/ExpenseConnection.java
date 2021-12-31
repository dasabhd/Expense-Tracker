package Utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenseConnection {

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

}
