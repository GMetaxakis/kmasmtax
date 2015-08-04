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
@Table(name = "USERS", catalog = "", schema = "ADMIN")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUserid", query = "SELECT u FROM Users u WHERE u.userid = :userid"),
    @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByLanguage", query = "SELECT u FROM Users u WHERE u.language = :language"),
    @NamedQuery(name = "Users.findByOrname", query = "SELECT u FROM Users u WHERE u.orname = :orname"),
    @NamedQuery(name = "Users.findByOrsname", query = "SELECT u FROM Users u WHERE u.orsname = :orsname"),
    @NamedQuery(name = "Users.findByAfm", query = "SELECT u FROM Users u WHERE u.afm = :afm"),
    @NamedQuery(name = "Users.findByAdt", query = "SELECT u FROM Users u WHERE u.adt = :adt"),
    @NamedQuery(name = "Users.findByIncome", query = "SELECT u FROM Users u WHERE u.income = :income"),
    @NamedQuery(name = "Users.findBySumbill", query = "SELECT u FROM Users u WHERE u.sumbill = :sumbill")})
public class Users implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USERID", nullable = false)
    private Integer userid;
    @Basic(optional = false)
    @Column(name = "USERNAME", nullable = false, length = 30)
    private String username;
    @Basic(optional = false)
    @Column(name = "PASSWORD", nullable = false, length = 30)
    private String password;
    @Column(name = "LANGUAGE", length = 30)
    private String language;
    @Column(name = "ORNAME", length = 30)
    private String orname;
    @Column(name = "ORSNAME", length = 30)
    private String orsname;
    @Column(name = "AFM", length = 9)
    private String afm;
    @Column(name = "ADT", length = 10)
    private String adt;
    @Column(name = "INCOME", precision = 23)
    private Float income;
    @Column(name = "SUMBILL", precision = 23)
    private Float sumbill;

    public Users() {
    }

    public Users(Integer userid) {
        this.userid = userid;
    }

    public Users(Integer userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        Integer oldUserid = this.userid;
        this.userid = userid;
        changeSupport.firePropertyChange("userid", oldUserid, userid);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        String oldLanguage = this.language;
        this.language = language;
        changeSupport.firePropertyChange("language", oldLanguage, language);
    }

    public String getOrname() {
        return orname;
    }

    public void setOrname(String orname) {
        String oldOrname = this.orname;
        this.orname = orname;
        changeSupport.firePropertyChange("orname", oldOrname, orname);
    }

    public String getOrsname() {
        return orsname;
    }

    public void setOrsname(String orsname) {
        String oldOrsname = this.orsname;
        this.orsname = orsname;
        changeSupport.firePropertyChange("orsname", oldOrsname, orsname);
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        String oldAfm = this.afm;
        this.afm = afm;
        changeSupport.firePropertyChange("afm", oldAfm, afm);
    }

    public String getAdt() {
        return adt;
    }

    public void setAdt(String adt) {
        String oldAdt = this.adt;
        this.adt = adt;
        changeSupport.firePropertyChange("adt", oldAdt, adt);
    }

    public Float getIncome() {
        return income;
    }

    public void setIncome(Float income) {
        Float oldIncome = this.income;
        this.income = income;
        changeSupport.firePropertyChange("income", oldIncome, income);
    }

    public Float getSumbill() {
        return sumbill;
    }

    public void setSumbill(Float sumbill) {
        Float oldSumbill = this.sumbill;
        this.sumbill = sumbill;
        changeSupport.firePropertyChange("sumbill", oldSumbill, sumbill);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taxkmasm.Users[userid=" + userid + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
