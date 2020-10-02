/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servis;

import domen.Ocena;
import domen.Predmet;
import domen.Prijava;
import domen.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author student1
 */
public class ServisPrijava {

    List<Prijava> prijave;

    public ServisPrijava() {
        prijave = new ArrayList<>();
    }

    public void addPrijava(Predmet predmet, Student student, Date datumPolaganja, Ocena ocena) {
        Prijava prijava = new Prijava(student, predmet, ocena, datumPolaganja);
        //uraditi validaciju
        prijave.add(prijava);
    }

    public void prikaziSvePrijave() {
        System.out.println("Prikaz svih prijava: ");
        for (Prijava prijava : prijave) {
            System.out.println(prijava.getStudent().getIndeks()+"\t"+
                    prijava.getStudent().getIme()+" "+prijava.getStudent().getPrezime()+"\t"+
                    prijava.getPredmet().getNaziv()+"\t"+
                    prijava.getDatumPolaganja()+"\t"+prijava.getOcena());
        }
    }

}
