/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Emil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days = MyCalendar.getNumDaysinMonth(12, -1);
        System.out.println("days = " + days);
    }
    
}
