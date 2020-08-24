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
public abstract class Book {
    public int page;
    public String name;

    public Book() {
    }

    public Book(Book target) {
        if (target != null) {
            this.page = target.page;
            this.name = target.name;
        }
    }

    public abstract Book clone();

    
}
