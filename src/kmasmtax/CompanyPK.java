/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kmasmtax;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author MeTaXaS4
 */
@Embeddable
public class CompanyPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 30)
    private String name;
    @Basic(optional = false)
    @Column(name = "AFM", nullable = false, length = 9)
    private String afm;

    public CompanyPK() {
    }

    public CompanyPK(String name, String afm) {
        this.name = name;
        this.afm = afm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        hash += (afm != null ? afm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyPK)) {
            return false;
        }
        CompanyPK other = (CompanyPK) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        if ((this.afm == null && other.afm != null) || (this.afm != null && !this.afm.equals(other.afm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "taxkmasm.CompanyPK[name=" + name + ", afm=" + afm + "]";
    }

}
