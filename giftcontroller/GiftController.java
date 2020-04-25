package giftcontroller;
import giftmodel.Gift;

public class GiftController {
    String sqlInsert,sqlDelete;
    public String insertBook(Gift books){
        sqlInsert = "Insert into books(id,author,price,qty) values(" + books.getId() + ",'" + books.getName() + "'," + books.getPrice() + "," + books.getQty() + ")";
        return sqlInsert;
        }
    public String deleteBook(int idDelete){
        sqlDelete = "Delete from books where id = " + idDelete;
        return sqlDelete;
    }
}

