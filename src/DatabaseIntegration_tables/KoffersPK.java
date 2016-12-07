/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseIntegration_tables;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author T. v Duykeren
 */
@Embeddable
public class KoffersPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idKoffers")
    private int idKoffers;
    @Basic(optional = false)
    @Column(name = "Passagiers_idPassagiers")
    private int passagiersidPassagiers;

    public KoffersPK() {
    }

    public KoffersPK(int idKoffers, int passagiersidPassagiers) {
        this.idKoffers = idKoffers;
        this.passagiersidPassagiers = passagiersidPassagiers;
    }

    public int getIdKoffers() {
        return idKoffers;
    }

    public void setIdKoffers(int idKoffers) {
        this.idKoffers = idKoffers;
    }

    public int getPassagiersidPassagiers() {
        return passagiersidPassagiers;
    }

    public void setPassagiersidPassagiers(int passagiersidPassagiers) {
        this.passagiersidPassagiers = passagiersidPassagiers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idKoffers;
        hash += (int) passagiersidPassagiers;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KoffersPK)) {
            return false;
        }
        KoffersPK other = (KoffersPK) object;
        if (this.idKoffers != other.idKoffers) {
            return false;
        }
        if (this.passagiersidPassagiers != other.passagiersidPassagiers) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatabaseIntegration_tables.KoffersPK[ idKoffers=" + idKoffers + ", passagiersidPassagiers=" + passagiersidPassagiers + " ]";
    }
    
}
