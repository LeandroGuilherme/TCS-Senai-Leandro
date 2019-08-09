/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocarro;

import java.time.Clock;
import java.util.Scanner;

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
        int v = 0;
        
        cr.tanque = 50;
        cm.tanque = 80;
        mt.tanque = 20;
        
       

       
        
        while(v != 4){
             System.out.println("Escolha qual veiculo vc dejeja ver: 1-carro 2-Caminhão 3-Moto 4-Sair ");
             Scanner vl = new Scanner(System.in);
             v = vl.nextInt();
            
            switch(v) {
                case 1:
                    
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
                 break;

                case 2:
                    
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

                    break;

                case 3:
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
                    break;

                case 4:
                   
                    break;


              default:
                  System.out.println("Opcao não existe!!!!");  
            }
         
        }
     
       
             
        
    }
    
}
