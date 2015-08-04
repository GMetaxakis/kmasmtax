/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kmasmtax;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author MeTaXaS4
 */
@Entity
@Table(name = "COMPANY", catalog = "", schema = "ADMIN")
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c"),
    @NamedQuery(name = "Company.findByName", query = "SELECT c FROM Company c WHERE c.companyPK.name = :name"),
    @NamedQuery(name = "Company.findByAfm", query = "SELECT c FROM Company c WHERE c.companyPK.afm = :afm")})
public class Company implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompanyPK companyPK;

    public Company() {
    }

    public Company(CompanyPK companyPK) {
        this.companyPK = companyPK;
    }

    public Company(String name, String afm) {
        this.companyPK = new CompanyPK(name, afm);
    }

    public CompanyPK getCompanyPK() {
        return companyPK;
    }

    public void setCompanyPK(CompanyPK companyPK) {
        this.companyPK = companyPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyPK != null ? companyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.companyPK == null && other.companyPK != null) || (this.companyPK != null && !this.companyPK.equals(other.companyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taxkmasm.Company[companyPK=" + companyPK + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
