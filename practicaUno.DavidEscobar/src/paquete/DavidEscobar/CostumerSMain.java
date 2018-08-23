/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.DavidEscobar;

/**
 *
 * @author Alumno
 */
public class CostumerSMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CostumerSneakers hype1 = new CostumerSneakers();
        CostumerSneakers hype2 = new CostumerSneakers("Reebok");
        CostumerSneakers hype3 = new CostumerSneakers("Panam","RTD","Ready to Die");
        CostumerSneakers hype4 = new CostumerSneakers("Adidas","Ultraboost","Triple Black","1");
        CostumerSneakers hype5 = new CostumerSneakers("Nike","Air Max 1/97","Sean Wotherspoon","7","8000");

        System.out.println(hype1.toString());
        System.out.println(hype2.toString());
        System.out.println(hype3.toString());
        System.out.println(hype4.toString());
        System.out.println(hype5.toString());
    }   
    
}
