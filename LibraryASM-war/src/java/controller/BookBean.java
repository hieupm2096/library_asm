/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Book;
import entity.BookFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author hieupm2096
 */
@Named(value = "bookBean")
@Dependent
public class BookBean {

    @EJB
    private BookFacade bookFacade;

    private List<Book> items;

    public List<Book> getItems() {
        return bookFacade.findAll();
    }
    
    public BookBean() {
    }
    
}
