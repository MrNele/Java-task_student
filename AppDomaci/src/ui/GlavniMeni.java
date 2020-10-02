/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domen.Ocena;
import domen.Predmet;
import domen.Student;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import servis.ServisPredmet;
import servis.ServisPrijava;
import servis.ServisStudent;
import util.DateUtil;

/**
 *
 * @author student1
 */
public class GlavniMeni {

    public void glavniMeni() throws ParseException {
        int izbor;
        ServisPrijava sp = new ServisPrijava();
        ServisStudent ss = new ServisStudent();
        ServisPredmet spr = new ServisPredmet();
        do {
            System.out.println("Glavni meni");
            System.out.println("1.Pregled");
            System.out.println("2.Unos prijave");
            System.out.println("3.Izmena");
            System.out.println("4.Prikazi sve prijave");
            System.out.println("0.Kraj programa");
            System.out.println("Vas izbor?");
            Scanner scanner = new Scanner(System.in);
            izbor = scanner.nextInt();
            switch (izbor) {
                case 1:
                    break;
                case 2:
                    System.out.println("Unesite prijavu:");
                    System.out.println("Unesite sifru predmeta:");
                    int sifraPredmeta = scanner.nextInt();
                    try {
                        Predmet predmet = spr.getPredmet(sifraPredmeta);
                        System.out.println("Predmet pronadjen");
                        System.out.println("Unesite broj indeksa:");
                        String brojIndeksa = scanner.next();
                        Student student = ss.getStudent(brojIndeksa);
                        System.out.println("Unesite datum polaganja:(dd.MM.yyyy.)");
                        String sDatumPolaganja = scanner.next();
                        Date datumPolaganja = DateUtil.getDate(sDatumPolaganja);
                        System.out.println("Unesite ocenu: (5-10)");
                        int ocena = scanner.nextInt();

                        sp.addPrijava(predmet, student, datumPolaganja, Ocena.PET);
                        System.out.println("Prijava je uspesno dodata");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    sp.prikaziSvePrijave();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Greska pri izboru");
            }
        } while (izbor != 0);
    }
}
