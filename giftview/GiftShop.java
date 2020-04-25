package giftview;
import giftcontroller.GiftController;
import giftmodel.Gift;

import java.sql.*;
import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ){
            int choose;
            GiftController gift1 = new GiftController();
            Scanner input = new Scanner(System.in);
        do {
            System.out.println("0 - Exit\n1 - List book\n2 - Add book\n3 - delete book");
            System.out.print("Enter choose: ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    String strSelect = "select * from books";
                    System.out.println("the SQL statement is: " + strSelect + "\n");
                    ResultSet rset = stmt.executeQuery(strSelect);
                    while (rset.next()) {
                        System.out.println(rset.getInt("id") + ","
                                + rset.getString("author") + ","
                                + rset.getDouble("price") + ","
                                + rset.getInt("qty"));
                    }
                    break;
                case 2:
                    Gift book1 = new Gift();
                    System.out.println("Enter new infomation:");
                    System.out.print("Input bookID: ");
                    int bookID = input.nextInt();
                    System.out.print("Input bookName: ");
                    String bookName = input.next();
                    System.out.print("Input price: ");
                    float price = input.nextFloat();
                    System.out.print("Input qty: ");
                    int qty = input.nextInt();
                    book1.setQty(qty);
                    book1.setPrice(price);
                    book1.setName(bookName);
                    book1.setId(bookID);
                    int countInsert = stmt.executeUpdate(gift1.insertBook(book1));
                    System.out.println("Insert successfull");
                    break;
                case 3 :
                    System.out.print("Input bookID: ");
                    int idDelete = input.nextInt();
                    int countDelete = stmt.executeUpdate(gift1.deleteBook(idDelete));
                    System.out.println("Delete successfull");
                    break;
            }
        } while (choose != 0);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
