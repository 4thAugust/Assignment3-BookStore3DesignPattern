/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author memory
 */
public class BookPool extends ObjectPool<TextBook> {
    
    
    public static String name, writer, subject;

    private static BookPool instance = new BookPool();
    private BookPool() {
        
    }
    
    public static BookPool getBookPool(String name, String writer, String subject){
        
        
        instance.name = name;
        instance.writer = writer;
        instance.subject = subject;
        return instance;
    }

    @Override
    protected TextBook create() {
        try {
            TextBook textBook = new TextBook();
            textBook.name = this.name;
            textBook.writer = this.writer;
            textBook.subject = this.subject;
            return (textBook);
        } catch (Exception e) {
            e.printStackTrace();
            return (null);
        }
    }


    
}
