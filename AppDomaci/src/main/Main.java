/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.GlavniMeni;

/**
 *
 * @author student1
 */
public class Main {
    public static void main(String[] args) {
        try {
            GlavniMeni gm = new GlavniMeni();
            gm.glavniMeni();
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());;
        }
    }
}
