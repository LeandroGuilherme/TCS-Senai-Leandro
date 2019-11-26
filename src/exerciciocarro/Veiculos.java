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
public abstract class Veiculos implements interfacecarro {
   
    protected int tanque;
    protected boolean acelerarstatus;
    protected boolean ligdesstatuts;
    protected boolean pneu;
    protected boolean trocarpneu;
    protected float precocombustivel;

    /*public Veiculos(int tanque, boolean acelerarstatus, boolean ligdesstatuts, boolean pneu, boolean trocarpneu) {
        this.tanque = tanque;
        this.acelerarstatus = acelerarstatus;
        this.ligdesstatuts = ligdesstatuts;
        this.pneu = pneu;
        this.trocarpneu = trocarpneu;
    }*/
    
    protected void veiculos(){
        this.tanque = 100;
        this.acelerarstatus = false;
        this.ligdesstatuts = false;
        this.pneu = true;
        this.trocarpneu = false;
        this.precocombustivel = precocombustivel;
        
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public boolean isAcelerarstatus() {
        return acelerarstatus;
    }

    public void setAcelerarstatus(boolean acelerarstatus) {
        this.acelerarstatus = acelerarstatus;
    }

    public boolean isLigdesstatuts() {
        return ligdesstatuts;
    }

    public void setLigdesstatuts(boolean ligdesstatuts) {
        this.ligdesstatuts = ligdesstatuts;
    }

    public boolean isPneu() {
        return pneu;
    }

    public void setPneu(boolean pneu) {
        this.pneu = pneu;
    }

    public boolean isTrocarpneu() {
        return trocarpneu;
    }

    public void setTrocarpneu(boolean trocarpneu) {
        this.trocarpneu = trocarpneu;
    }

    public float getPrecocombustivel() {
        return precocombustivel;
    }

    public void setPrecocombustivel(float precocombustivel) {
        this.precocombustivel = precocombustivel;
    }
}
