package cz.pokladna.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Michal
 */

@Entity
@Table(name = "hraci")
public class Hrac {
    @Id
    @Column(name = "idhraci")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "jm�no")
    private String jmeno;
    
    @Column(name = "p��jmen�")
    private String prijmeni;
    
    @Column(name = "datum_narozeni")
    private LocalDate datumNarozeni;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "idhraci")
    private List<Pokuta> pokuty;

    public Hrac(){
    }

    public Hrac(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public Hrac(String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }


    
    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @param prijmeni the prijmeni to set
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     * @return the datumNarozeni
     */
    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    /**
     * @param datumNarozeni the datumNarozeni to set
     */
    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    /**
     * @return the pokuty
     */
    public List<Pokuta> getPokuty() {
        return pokuty;
    }

    /**
     * @param pokuty the pokuty to set
     */
    public void setPokuty(List<Pokuta> pokuty) {
        this.pokuty = pokuty;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.jmeno != null ? this.jmeno.hashCode() : 0);
        hash = 97 * hash + (this.prijmeni != null ? this.prijmeni.hashCode() : 0);
        hash = 97 * hash + (this.datumNarozeni != null ? this.datumNarozeni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hrac other = (Hrac) obj;
        if ((this.jmeno == null) ? (other.jmeno != null) : !this.jmeno.equals(other.jmeno)) {
            return false;
        }
        if ((this.prijmeni == null) ? (other.prijmeni != null) : !this.prijmeni.equals(other.prijmeni)) {
            return false;
        }
        if (this.datumNarozeni != other.datumNarozeni && (this.datumNarozeni == null || !this.datumNarozeni.equals(other.datumNarozeni))) {
            return false;
        }
        return true;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    

}
