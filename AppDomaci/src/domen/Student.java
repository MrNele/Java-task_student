/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author student1
 */
public class Student implements Serializable{
    private String indeks;
    private int godinaUpisa;
    private String ime;
    private String prezime;
    private Date datumRodjenja;

    public Student() {
    }

    public Student(String indeks, int godinaUpisa, String ime, String prezime, Date datumRodjenja) {
        this.indeks = indeks;
        this.godinaUpisa = godinaUpisa;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Student{" + "indeks=" + indeks + ", godinaUpisa=" + godinaUpisa + ", ime=" + ime + ", prezime=" + prezime + ", datumRodjenja=" + datumRodjenja + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.indeks);
        hash = 37 * hash + this.godinaUpisa;
        hash = 37 * hash + Objects.hashCode(this.ime);
        hash = 37 * hash + Objects.hashCode(this.prezime);
        hash = 37 * hash + Objects.hashCode(this.datumRodjenja);
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
        final Student other = (Student) obj;
        if (this.godinaUpisa != other.godinaUpisa) {
            return false;
        }
        if (!Objects.equals(this.indeks, other.indeks)) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
        if (!Objects.equals(this.datumRodjenja, other.datumRodjenja)) {
            return false;
        }
        return true;
    }
    
    
}
