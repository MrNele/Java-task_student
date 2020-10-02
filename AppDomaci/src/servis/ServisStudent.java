/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servis;

import domen.Student;
import java.text.ParseException;
import util.DateUtil;

/**
 *
 * @author student1
 */
public class ServisStudent {

    private Student studenti[];

    public ServisStudent() throws ParseException {
        studenti = new Student[4];
        studenti[0] = new Student("2019/0001", 2019, "Pera", "Peric", DateUtil.getDate("01.03.2000."));
        studenti[1] = new Student("2019/0002", 2019, "Laza", "Lazic", DateUtil.getDate("03.01.2001."));
        studenti[2] = new Student("2019/0003", 2019, "Maja", "Majic", DateUtil.getDate("04.05.2002."));
        studenti[3] = new Student("2019/0004", 2019, "Una", "Unic", DateUtil.getDate("03.08.2003."));
    }

    public Student getStudent(String brojIndeksa) throws Exception {
        for (int i = 0; i < studenti.length; i++) {
            Student student = studenti[i];
            if (brojIndeksa.equalsIgnoreCase(student.getIndeks())) {
                return student;
            }
        }
        throw new Exception("Student sa brojem indeksa :" + brojIndeksa + " ne postoji.");
    }

}
