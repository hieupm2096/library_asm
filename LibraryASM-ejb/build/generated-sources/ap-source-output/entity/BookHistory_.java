package entity;

import entity.Book;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-11T01:40:52")
@StaticMetamodel(BookHistory.class)
public class BookHistory_ { 

    public static volatile SingularAttribute<BookHistory, Book> code;
    public static volatile SingularAttribute<BookHistory, Date> borrowedDate;
    public static volatile SingularAttribute<BookHistory, Integer> id;
    public static volatile SingularAttribute<BookHistory, Date> returnedDate;

}