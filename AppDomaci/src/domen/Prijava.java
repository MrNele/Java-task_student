/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author student1
 */
public class Prijava implements Serializable{
    private Student student;
    private Predmet predmet;
    private Ocena ocena;
    private Date datumPolaganja;

    public Prijava(Student student, Predmet predmet, Ocena ocena, Date datumPolaganja) {
        this.student = student;
        this.predmet = predmet;
        this.ocena = ocena;
        this.datumPolaganja = datumPolaganja;
    }

    public Date getDatumPolaganja() {
        return datumPolaganja;
    }

    public void setDatumPolaganja(Date datumPolaganja) {
        this.datumPolaganja = datumPolaganja;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public Ocena getOcena() {
        return ocena;
    }

    public void setOcena(Ocena ocena) {
        this.ocena = ocena;
    }
    
    
    
}
