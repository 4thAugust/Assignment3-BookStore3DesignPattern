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
public class User {
    private String name;
    private TextBook textBook;
    public User(String name){
        this.name = name;
        textBook = new TextBook();
    }
    public void setTextBook(TextBook tb){
        this.textBook = tb;
    }
    public TextBook getTextBook(){
        return(textBook);
    }
    
}
