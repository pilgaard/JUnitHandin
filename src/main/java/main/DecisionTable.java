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
public class DecisionTable {
  
    public static int calcReimbursement(boolean deduction, String type){
        if (deduction) {
            switch (type) {
                case "Doctor":
                    return 50;
                case "Hospital":
                    return 80;
                default:
                    System.out.println("Invaild input!");
                    return 0;
            }
        } return 0;
    }
}
