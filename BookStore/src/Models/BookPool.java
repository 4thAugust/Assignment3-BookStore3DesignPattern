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
public class BookPool extends ObjectPool<Book> {

    private String name, writer;

    public BookPool(String name, String writer) {
        this.name = new String();
        this.writer = new String();
        this.name = name;
        this.writer = writer;
    }

    @Override
    protected Book create() {
        try {
            return (new TextBook());
        } catch (Exception e) {
            e.printStackTrace();
            return (null);
        }
    }


    
}
