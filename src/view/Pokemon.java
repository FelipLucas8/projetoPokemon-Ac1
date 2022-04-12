/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Intel i3-4010U
 */
public class Pokemon {
    
    private Double vida;
    private Double defesa;
    private Double dano;
    private Double ataque;

    public Pokemon(Double vida, Double defesa, Double dano, Double ataque) {
        this.vida = vida;
        this.defesa = defesa;
        this.dano = dano;
        this.ataque = ataque;
    }

    public Pokemon() {
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getDefesa() {
        return defesa;
    }

    public void setDefesa(Double defesa) {
        this.defesa = defesa;
    }

    public Double getDano() {
        return dano;
    }

    public void setDano(Double dano) {
        this.dano = dano;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }
    
   
    
}
