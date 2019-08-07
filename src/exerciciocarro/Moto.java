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
public class Moto extends Veiculos {
   
    @Override
    public void ligar() {
        
        if(isLigdesstatuts() == true){
          System.out.println("Moto Ja Ligado");   
        }else if(getTanque() > 0 ){
             setLigdesstatuts(true);
          System.out.println("Ligando Moto");  
        }else if(getTanque() <= 0 ){
            System.out.println("Voce não pode ligar a moto seu tanque esta vaziu");
            System.out.println("Seu tanque esta em: " + getTanque());
            
        }
    }

    @Override
    public void desligar() {
            
       if(isLigdesstatuts() == false){
           System.out.println("Moto Ja Desligado");    
       }else{
           setLigdesstatuts(false);
           System.out.println("Desligando Moto");
       }
      
    }

    @Override
    
    public void acelerar() {
        
        if(isAcelerarstatus() == true){
            setTanque(getTanque()-5);
        }else if(getTanque() <= 20 ){
            System.out.println("Você precisa abastecer");
            System.out.println("Seu tanque esta em: " + getTanque());
        }else if(getTanque() == 0){
            setLigdesstatuts(false);
            System.out.println("Seu Carro desligou por falta de gasolina");
            System.out.println("Voce precisa abastecer seu tanque esta em: " + getTanque());
        }
    }

    @Override
    public void tanque() {
        getTanque();
    }

    @Override
    public void abastecer() {
        
        setPrecocombustivel(4.90f);
        System.out.println("O preço do gasolina é " + getPrecocombustivel());
        
        if(getTanque() < 100 ){
            this.setTanque(this.getTanque()+10);
        }else if(getTanque() == 100){
            System.out.println("Tanque já cheio");
        }
    }

    @Override
    public void trocarpneu() {
        
        if(isPneu() == true){
            System.out.println("Seu pneu esta normal");
        }else{
            setTrocarpneu(true);
            System.out.println("Trocando Pneu....");
            setPneu(true);
            System.out.println("Seu Pneu foi Trocado");
            
        }
    }

    @Override
    public void estourarpneu() {
        
        if(isPneu() == false){
            System.out.println("Seu pneu ja estourou pare de andar");
        }else{
            setPneu(false);
            System.out.println("Seu pneu estourou");
        }
            
    } 
}
