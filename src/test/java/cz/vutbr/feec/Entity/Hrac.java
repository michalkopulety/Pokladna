/*
 * Diploma thesis: Multiple sclerosis detection
 * Author: Michal Kopulet� <xkopul02@vutbr.cz>
 * School: Brno University of Technology - Faculty of Electrical Engineering and Comunication 
 * VUT ID: 146866
 * Year: 2015/2016
 */
package cz.vutbr.feec.Entity;

import javax.persistence.*;

/**
 *
 * @author Michal
 */
@Entity
@Table(name ="hraci")
public class Hrac {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idhraci")
    private Integer id;
    
    @Column(name = "jmeno")
    private String jmeno;
    
    @Column(name = "prijmeni")
    private String prijmeni;
    
    public  Hrac(){
        
    }
    
    public Hrac(Integer id, String jmeno, String prijmeni){
        this.id = id;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;         
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
    
    
    
}
