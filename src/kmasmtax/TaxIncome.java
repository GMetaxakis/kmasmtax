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
@Table(name = "TAX_INCOME", catalog = "", schema = "ADMIN")
@NamedQueries({
    @NamedQuery(name = "TaxIncome.findAll", query = "SELECT t FROM TaxIncome t"),
    @NamedQuery(name = "TaxIncome.findByNumber", query = "SELECT t FROM TaxIncome t WHERE t.number = :number"),
    @NamedQuery(name = "TaxIncome.findByIncome", query = "SELECT t FROM TaxIncome t WHERE t.income = :income"),
    @NamedQuery(name = "TaxIncome.findByRate", query = "SELECT t FROM TaxIncome t WHERE t.rate = :rate")})
public class TaxIncome implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMBER", nullable = false)
    private Integer number;
    @Basic(optional = false)
    @Column(name = "INCOME", nullable = false)
    private int income;
    @Basic(optional = false)
    @Column(name = "RATE", nullable = false)
    private int rate;

    public TaxIncome() {
    }

    public TaxIncome(Integer number) {
        this.number = number;
    }

    public TaxIncome(Integer number, int income, int rate) {
        this.number = number;
        this.income = income;
        this.rate = rate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        Integer oldNumber = this.number;
        this.number = number;
        changeSupport.firePropertyChange("number", oldNumber, number);
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        int oldIncome = this.income;
        this.income = income;
        changeSupport.firePropertyChange("income", oldIncome, income);
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        int oldRate = this.rate;
        this.rate = rate;
        changeSupport.firePropertyChange("rate", oldRate, rate);
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
        if (!(object instanceof TaxIncome)) {
            return false;
        }
        TaxIncome other = (TaxIncome) object;
        if ((this.number == null && other.number != null) || (this.number != null && !this.number.equals(other.number))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taxkmasm.TaxIncome[number=" + number + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
