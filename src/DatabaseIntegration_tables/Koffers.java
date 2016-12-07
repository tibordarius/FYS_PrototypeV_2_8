/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseIntegration_tables;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author T. v Duykeren
 */
@Entity
@Table(name = "koffers", catalog = "fys", schema = "")
@NamedQueries({
    @NamedQuery(name = "Koffers.findAll", query = "SELECT k FROM Koffers k"),
    @NamedQuery(name = "Koffers.findByIdKoffers", query = "SELECT k FROM Koffers k WHERE k.koffersPK.idKoffers = :idKoffers"),
    @NamedQuery(name = "Koffers.findByGewicht", query = "SELECT k FROM Koffers k WHERE k.gewicht = :gewicht"),
    @NamedQuery(name = "Koffers.findByKleur", query = "SELECT k FROM Koffers k WHERE k.kleur = :kleur"),
    @NamedQuery(name = "Koffers.findByVorm", query = "SELECT k FROM Koffers k WHERE k.vorm = :vorm"),
    @NamedQuery(name = "Koffers.findByMerk", query = "SELECT k FROM Koffers k WHERE k.merk = :merk"),
    @NamedQuery(name = "Koffers.findByPassagiersidPassagiers", query = "SELECT k FROM Koffers k WHERE k.koffersPK.passagiersidPassagiers = :passagiersidPassagiers")})
public class Koffers implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KoffersPK koffersPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Gewicht")
    private Double gewicht;
    @Column(name = "Kleur")
    private String kleur;
    @Column(name = "Vorm")
    private String vorm;
    @Column(name = "Merk")
    private String merk;

    public Koffers() {
    }

    public Koffers(KoffersPK koffersPK) {
        this.koffersPK = koffersPK;
    }

    public Koffers(int idKoffers, int passagiersidPassagiers) {
        this.koffersPK = new KoffersPK(idKoffers, passagiersidPassagiers);
    }

    public KoffersPK getKoffersPK() {
        return koffersPK;
    }

    public void setKoffersPK(KoffersPK koffersPK) {
        this.koffersPK = koffersPK;
    }

    public Double getGewicht() {
        return gewicht;
    }

    public void setGewicht(Double gewicht) {
        Double oldGewicht = this.gewicht;
        this.gewicht = gewicht;
        changeSupport.firePropertyChange("gewicht", oldGewicht, gewicht);
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        String oldKleur = this.kleur;
        this.kleur = kleur;
        changeSupport.firePropertyChange("kleur", oldKleur, kleur);
    }

    public String getVorm() {
        return vorm;
    }

    public void setVorm(String vorm) {
        String oldVorm = this.vorm;
        this.vorm = vorm;
        changeSupport.firePropertyChange("vorm", oldVorm, vorm);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        String oldMerk = this.merk;
        this.merk = merk;
        changeSupport.firePropertyChange("merk", oldMerk, merk);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (koffersPK != null ? koffersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Koffers)) {
            return false;
        }
        Koffers other = (Koffers) object;
        if ((this.koffersPK == null && other.koffersPK != null) || (this.koffersPK != null && !this.koffersPK.equals(other.koffersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DatabaseIntegration_tables.Koffers[ koffersPK=" + koffersPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
