/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author student1
 */
public class DateUtil {

    //datum se prosledjuje u formatu dd.MM.yyyy.
    public static Date getDate(String datum) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");
        try {
            return sdf.parse(datum);
        } catch (ParseException pe) {
            throw new ParseException("Datum koji ste uneli: "+datum+" nije u formatu dd.MM.yyyy.", pe.getErrorOffset());
        }
    }
}
