/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocarro;

/**
 *
 * @author Senai
 */
public class ExercicioCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro cr = new Carro();
        Caminhao cm = new Caminhao();
        Moto mt = new Moto();
        
        cr.tanque = 50;
        cm.tanque = 80;
        mt.tanque = 20;
        
        // CARRO //
        cr.ligar();
        cr.tanque();
        cr.acelerar();
        cr.acelerar();
        cr.estourarpneu();
        cr.desligar();
        cr.trocarpneu();
        cr.ligar();
        cr.acelerar();
        cr.acelerar();
        cr.abastecer();
        cr.desligar();
        cr.abastecer();
        cr.abastecer();
        cr.abastecer();
        cr.ligar();
        cr.acelerar();
        cr.desligar();
        
        // CAMINHAO //
        
        cm.ligar();
        cm.tanque();
        cm.acelerar();
        cm.acelerar();
        cm.estourarpneu();
        cm.desligar();
        cm.trocarpneu();
        cm.ligar();
        cm.acelerar();
        cm.acelerar();
        cm.abastecer();
        cm.desligar();
        cm.abastecer();
        cm.abastecer();
        cm.abastecer();
        cm.ligar();
        cm.acelerar();
        cm.desligar();
        
        // Moto //
        
        mt.ligar();
        mt.tanque();
        mt.acelerar();
        mt.acelerar();
        mt.estourarpneu();
        mt.desligar();
        mt.trocarpneu();
        mt.ligar();
        mt.acelerar();
        mt.acelerar();
        mt.abastecer();
        mt.desligar();
        mt.abastecer();
        mt.abastecer();
        mt.abastecer();
        mt.ligar();
        mt.acelerar();
        mt.desligar();
    }
    
}
