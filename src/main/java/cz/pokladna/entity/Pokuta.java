package cz.pokladna.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author Michal
 */

@Entity
@Table(name = "pokuty")
public class Pokuta {
    @Id
    @Column(name = "idpokuty")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    
    @Column(name ="popis")
    private String popis;
    
    @Column(name = "datum")
    private LocalDate datum;
    
    @Column(name = "suma")
    private Double suma;

    public Pokuta() {
    }

    public Pokuta(String popis, LocalDate datum, Double suma) {
        this.popis = popis;
        this.datum = datum;
        this.suma = suma;
    }

    
    
    /**
     * @return the popis
     */
    public String getPopis() {
        return popis;
    }

    /**
     * @param popis the popis to set
     */
    public void setPopis(String popis) {
        this.popis = popis;
    }

    /**
     * @return the datum
     */
    public LocalDate getDatum() {
        return datum;
    }

    /**
     * @param datum the datum to set
     */
    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    /**
     * @return the suma
     */
    public Double getSuma() {
        return suma;
    }

    /**
     * @param suma the suma to set
     */
    public void setSuma(Double suma) {
        this.suma = suma;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.getPopis() != null ? this.getPopis().hashCode() : 0);
        hash = 59 * hash + (this.getDatum() != null ? this.getDatum().hashCode() : 0);
        hash = 59 * hash + (this.getSuma() != null ? this.getSuma().hashCode() : 0);
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
        final Pokuta other = (Pokuta) obj;
        if ((this.getPopis() == null) ? (other.getPopis() != null) : !this.popis.equals(other.popis)) {
            return false;
        }
        if (this.getDatum() != other.getDatum() && (this.getDatum() == null || !this.datum.equals(other.datum))) {
            return false;
        }
        if (this.getSuma() != other.getSuma() && (this.getSuma() == null || !this.suma.equals(other.suma))) {
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
