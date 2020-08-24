/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.HashMap;
import java.lang.reflect.Array;
import Models.BookPool;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author memory
 */
public abstract class ObjectPool<O> {

    private Long deadTime;
    private Hashtable<O, Long> bookShelves;
    private Hashtable<O, Long> borrowed;

    protected abstract O create();



    public ObjectPool() {
        deadTime = new Long(10000);
        this.bookShelves = new Hashtable<O, Long>();
        this.borrowed = new Hashtable<O, Long>();
    }

    public O borrowBook() {
        long now = System.currentTimeMillis();
        O o;
        if (bookShelves.size() > 0) {
            Enumeration<O> e;
            e = bookShelves.keys();
            while (e.hasMoreElements()) {
                o = e.nextElement();
                if ((now - bookShelves.get(o)) > deadTime) {
                    // object has expired
                    bookShelves.remove(o);
                    
                    o = null;
                } else {
                    bookShelves.remove(o);
                    borrowed.put(o, now);
                    return (o);

                }
            }
        }
        // no objects available, create a new one
        o = create();
        borrowed.put(o, now);
        return (o);

    }

    public void returnBook(O o) {
        borrowed.remove(o);
        bookShelves.put(o, System.currentTimeMillis());
    }
}
