/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tana_
 */
@Entity
@Table(name = "STUDENTVACCINEDATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studentvaccinedata.findAll", query = "SELECT s FROM Studentvaccinedata s"),
    @NamedQuery(name = "Studentvaccinedata.findBySeq", query = "SELECT s FROM Studentvaccinedata s WHERE s.seq = :seq"),
    @NamedQuery(name = "Studentvaccinedata.findById", query = "SELECT s FROM Studentvaccinedata s WHERE s.id = :id"),
    @NamedQuery(name = "Studentvaccinedata.findByVactype", query = "SELECT s FROM Studentvaccinedata s WHERE s.vactype = :vactype"),
    @NamedQuery(name = "Studentvaccinedata.findByVacno", query = "SELECT s FROM Studentvaccinedata s WHERE s.vacno = :vacno")})
public class Studentvaccinedata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SEQ")
    private Integer seq;
    @Size(max = 30)
    @Column(name = "ID")
    private String id;
    @Size(max = 30)
    @Column(name = "VACTYPE")
    private String vactype;
    @Column(name = "VACNO")
    private Integer vacno;

    public Studentvaccinedata() {
    }

    public Studentvaccinedata(Integer seq) {
        this.seq = seq;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVactype() {
        return vactype;
    }

    public void setVactype(String vactype) {
        this.vactype = vactype;
    }

    public Integer getVacno() {
        return vacno;
    }

    public void setVacno(Integer vacno) {
        this.vacno = vacno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seq != null ? seq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentvaccinedata)) {
            return false;
        }
        Studentvaccinedata other = (Studentvaccinedata) object;
        if ((this.seq == null && other.seq != null) || (this.seq != null && !this.seq.equals(other.seq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Studentvaccinedata[ seq=" + seq + " ]";
    }
    
}
