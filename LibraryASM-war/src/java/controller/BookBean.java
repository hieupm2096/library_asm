/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Book;
import entity.BookFacade;
import entity.BookHistory;
import entity.BookHistoryFacade;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author hieupm2096
 */
public class BookBean {

    @EJB
    private BookHistoryFacade bookHistoryFacade;

    @EJB
    private BookFacade bookFacade;

    private List<Book> items;

    private List<BookHistory> historyItems;
    
    private String code;
    private String name;
    private String author;
    private boolean status;

    private Book currentBook;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public List<Book> getItems() {
        return bookFacade.findAll();
    }

    public List<BookHistory> getHistoryItems() {
        return bookHistoryFacade.findByCode(currentBook);
    }

    public BookBean() {
    }

    public void historyInit() {
        code = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");

        currentBook = bookFacade.findByCode(code);

        if (currentBook != null) {
            name = currentBook.getName();
            author = currentBook.getAuthor();
            status = currentBook.getStatus();
        }
    }
    
    public String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
}
