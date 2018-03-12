package entity;

import entity.Book;
import entity.Reader;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-13T01:27:20")
@StaticMetamodel(BookHistory.class)
public class BookHistory_ { 

    public static volatile SingularAttribute<BookHistory, Book> code;
    public static volatile SingularAttribute<BookHistory, Date> borrowedDate;
    public static volatile SingularAttribute<BookHistory, Date> expireDate;
    public static volatile SingularAttribute<BookHistory, Integer> id;
    public static volatile SingularAttribute<BookHistory, Reader> readerId;
    public static volatile SingularAttribute<BookHistory, Date> returnedDate;

}