package entity;

import entity.BookHistory;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-13T01:27:20")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> code;
    public static volatile ListAttribute<Book, BookHistory> bookHistoryList;
    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, String> name;
    public static volatile SingularAttribute<Book, Boolean> status;

}