/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kmasmtax;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author MeTaXaS4
 */
@Entity
@Table(name = "BILLS", catalog = "", schema = "ADMIN")
@NamedQueries({
    @NamedQuery(name = "Bills.findAll", query = "SELECT b FROM Bills b"),
    @NamedQuery(name = "Bills.findByNumber", query = "SELECT b FROM Bills b WHERE b.number = :number"),
    @NamedQuery(name = "Bills.findByUserid", query = "SELECT b FROM Bills b WHERE b.userid = :userid"),
    @NamedQuery(name = "Bills.findByComname", query = "SELECT b FROM Bills b WHERE b.comname = :comname"),
    @NamedQuery(name = "Bills.findByAfm", query = "SELECT b FROM Bills b WHERE b.afm = :afm"),
    @NamedQuery(name = "Bills.findByAmount", query = "SELECT b FROM Bills b WHERE b.amount = :amount"),
    @NamedQuery(name = "Bills.findByDate", query = "SELECT b FROM Bills b WHERE b.date = :date"),
    @NamedQuery(name = "Bills.findByCatname", query = "SELECT b FROM Bills b WHERE b.catname = :catname")})
public class Bills implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMBER", nullable = false)
    private Integer number;
    @Basic(optional = false)
    @Column(name = "USERID", nullable = false)
    private int userid;
    @Basic(optional = false)
    @Column(name = "COMNAME", nullable = false, length = 30)
    private String comname;
    @Basic(optional = false)
    @Column(name = "AFM", nullable = false, length = 9)
    private String afm;
    @Basic(optional = false)
    @Column(name = "AMOUNT", nullable = false)
    private float amount;
    @Basic(optional = false)
    @Column(name = "DATE", nullable = false, length = 20)
    private String date;
    @Column(name = "CATNAME", length = 30)
    private String catname;

    public Bills() {
    }

    public Bills(Integer number) {
        this.number = number;
    }

    public Bills(Integer number, int userid, String comname, String afm, float amount, String date) {
        this.number = number;
        this.userid = userid;
        this.comname = comname;
        this.afm = afm;
        this.amount = amount;
        this.date = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        Integer oldNumber = this.number;
        this.number = number;
        changeSupport.firePropertyChange("number", oldNumber, number);
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        int oldUserid = this.userid;
        this.userid = userid;
        changeSupport.firePropertyChange("userid", oldUserid, userid);
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        String oldComname = this.comname;
        this.comname = comname;
        changeSupport.firePropertyChange("comname", oldComname, comname);
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        String oldAfm = this.afm;
        this.afm = afm;
        changeSupport.firePropertyChange("afm", oldAfm, afm);
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        float oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        String oldCatname = this.catname;
        this.catname = catname;
        changeSupport.firePropertyChange("catname", oldCatname, catname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (number != null ? number.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bills)) {
            return false;
        }
        Bills other = (Bills) object;
        if ((this.number == null && other.number != null) || (this.number != null && !this.number.equals(other.number))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taxkmasm.Bills[number=" + number + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
