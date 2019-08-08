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
public class Carro extends Veiculos {
    
    @Override
    public void ligar() {
        
         if(isLigdesstatuts() == true){
          System.out.println("Carro Ja Ligado");   
        }else if(getTanque() > 0 ){
             setLigdesstatuts(true);
          System.out.println("Ligando Carro");  
        }else if(getTanque() <= 0 ){
            System.out.println("Voce não pode ligar o carro seu tanque esta vaziu");
            System.out.println("Seu tanque esta em: " + getTanque());      
        }
    }

    @Override
    public void desligar() {
            
       if(isLigdesstatuts() == false){
           System.out.println("Carro Ja Desligado");    
       }else{
           setLigdesstatuts(false);
           System.out.println("Desligando Carro");
       }
      
    }

    @Override
    
    public void acelerar() {
        
        if(isPneu() == false && isLigdesstatuts() == true){
            setTanque(getTanque()-10);
            System.out.println("Acelerando..... Voce tem " + getTanque() + " de tanque sobrando");
        }else if(isPneu() == true){
            System.out.println("Voce precisa trocar o pneu para acelerar");
        }else if (isLigdesstatuts() == true){
            System.out.println("Voce precisa ligar o carro");
        }else if(getTanque() <= 20 ){
            System.out.println("Você precisa abastecer");    
        }else if(getTanque() == 0){
            setLigdesstatuts(false);
            System.out.println("Seu carro desligou por falta de combustivel");
            
        }
    }

    @Override
    public void tanque() {
        System.out.println("Seu tanque: " + getTanque());
    }

    @Override
    public void abastecer() {
        
        setPrecocombustivel(4.90f);
        System.out.println("O preço do gasolina é " + getPrecocombustivel()); 
        
        if (isLigdesstatuts() == true){
            System.out.println("O carro está ligado por favor desligue");
        }else if(getTanque() < 100 ){
            this.setTanque(this.getTanque()+10);
            System.out.println("Seu tanque esta em: " + getTanque()); 
        }else if(getTanque() == 100){
            System.out.println("Tanque já cheio");
        }
    }

    @Override
    public void trocarpneu() {
        
        if(isPneu() == false){
            System.out.println("Seu pneu esta normal");
        }else if(isLigdesstatuts() == false){
            setTrocarpneu(true);
            System.out.println("Trocando Pneu......");
            setPneu(false);
            System.out.println("Seu Pneu foi Trocado");
            
        }else{
            System.out.println("Desligue o carro para trocar o pneu");
        }
    }

    @Override
    public void estourarpneu() {
        
        if(isPneu() == true){
            System.out.println("Seu pneu ja estourou pare de andar");
        }else{
            setPneu(true);
            System.out.println("Seu pneu estourou");
        }
            
    }  
}
