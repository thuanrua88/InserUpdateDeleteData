import java.sql.*;

public class JdbcUpdateTest {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
                ) {
//            String strUpdate = "update books set price = price * 0.7, qty = qty + 1 where id = 1001";
//            System.out.println("The SQL statement is : " + strUpdate + "\n");
//            int countUpdate = stmt.executeUpdate(strUpdate);
//            System.out.println(countUpdate + "records affected.\n");

//            String strSelect = "select * from books where id = 1001";
//            System.out.println("The SQL statement is: " + strSelect + "\n");
//            ResultSet rset = stmt.executeQuery(strSelect);
//            while (rset.next()){
//                System.out.println(rset.getInt("id") + ","
//                        + rset.getString("author") + ","
//                        + rset.getString("title") + ","
//                        + rset.getDouble("price") + ","
//                        + rset.getInt("qty"));
//            }

//            strUpdate = "update books set price = price + price*50/100 where title = 'A Cup of Java'";
//            countUpdate = stmt.executeUpdate(strUpdate);
//            String strSelect = "select * from books where title = 'A Cup of Java'";
//            ResultSet rset2 = stmt.executeQuery(strSelect);
//            while (rset2.next()) {
//                System.out.println(rset2.getInt("id") + ","
//                        + rset2.getString("author") + ","
//                        + rset2.getString("title") + ","
//                        + rset2.getDouble("price") + ","
//                        + rset2.getInt("qty"));
//            }

//            strUpdate = "update books set qty = 0 where title = 'A Teaspoon of Java'";
//            countUpdate = stmt.executeUpdate(strUpdate);
//            String strSelect = "select * from books where title = 'A Teaspoon of Java'";
//            ResultSet rset2 = stmt.executeQuery(strSelect);
//            while (rset2.next()) {
//                System.out.println(rset2.getInt("id") + ","
//                        + rset2.getString("author") + ","
//                        + rset2.getString("title") + ","
//                        + rset2.getDouble("price") + ","
//                        + rset2.getInt("qty"));
//            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
