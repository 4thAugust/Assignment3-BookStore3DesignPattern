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
public class TextBook extends Book{
    public String subject;
    public TextBook(){
        
    }
     public TextBook(TextBook target) {
        super(target);
        if (target != null) {
            subject = target.subject;
        }
    }

    @Override
    public Book clone() {
        return new TextBook(this);
    }
}
