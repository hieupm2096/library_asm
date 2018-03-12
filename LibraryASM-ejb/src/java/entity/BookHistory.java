/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hieupm2096
 */
@Entity
@Table(name = "BookHistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookHistory.findAll", query = "SELECT b FROM BookHistory b")
    , @NamedQuery(name = "BookHistory.findById", query = "SELECT b FROM BookHistory b WHERE b.id = :id")
    , @NamedQuery(name = "BookHistory.findByBorrowedDate", query = "SELECT b FROM BookHistory b WHERE b.borrowedDate = :borrowedDate")
    , @NamedQuery(name = "BookHistory.findByReturnedDate", query = "SELECT b FROM BookHistory b WHERE b.returnedDate = :returnedDate")})
public class BookHistory implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "_borrowed_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date borrowedDate;
    @Column(name = "_returned_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnedDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "_expire_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expireDate;

    @JoinColumn(name = "_reader_id", referencedColumnName = "_id")
    @ManyToOne
    private Reader readerId;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue
    @Column(name = "_id")
    private Integer id;
    
    @JoinColumn(name = "_code", referencedColumnName = "_code")
    @ManyToOne
    private Book code;

    public BookHistory() {
    }

    public BookHistory(Integer id) {
        this.id = id;
    }

    public BookHistory(Integer id, Date borrowedDate) {
        this.id = id;
        this.borrowedDate = borrowedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    public Book getCode() {
        return code;
    }

    public void setCode(Book code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookHistory)) {
            return false;
        }
        BookHistory other = (BookHistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.BookHistory[ id=" + id + " ]";
    }

    public Reader getReaderId() {
        return readerId;
    }

    public void setReaderId(Reader readerId) {
        this.readerId = readerId;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
    
}
