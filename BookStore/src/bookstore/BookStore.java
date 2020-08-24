/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
import Models.ObjectPool;
import Models.BookPool;
import Models.TextBook;
import Models.User;
/**
 *
 * @author memory
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BookPool bookPool = BookPool.getBookPool("Math Daily", "memory", "Math");
        User testUser = new User("Mem");
        testUser.setTextBook(bookPool.borrowBook());
        System.out.println(testUser.getTextBook().name);
    }
    
}
