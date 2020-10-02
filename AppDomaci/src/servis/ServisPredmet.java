/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servis;

import domen.Predmet;

/**
 *
 * @author student1
 */
public class ServisPredmet {

    private Predmet predmeti[] = {
        new Predmet(1, "Programiranje 1"),
        new Predmet(2, "Matematika 1"),
        new Predmet(3, "Programiranje 2")
    };

    public Predmet getPredmet(int sifra) throws Exception {
        for (int i = 0; i < predmeti.length; i++) {
            Predmet predmet = predmeti[i];
            if (sifra == predmet.getSifra()) {
                return predmet;
            }
        }
        // baci izuzetak ako ne pronadjes predmet
        throw new Exception("Predmet sa sifrom " + sifra + " ne postoji!");
    }
}
