/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopa.de.letras;

/**
 *
 * @author CISCO
 */
public class Palabra {
    private int posIniX;
    private int posIniY;
    private int posFinX;
    private int posFinY;
    private String valor;

    public Palabra(int posIniX, int posIniY, int posFinX, int posFinY, String valor) {
        this.posIniX = posIniX;
        this.posIniY = posIniY;
        this.posFinX = posFinX;
        this.posFinY = posFinY;
        this.valor = valor;
    }

 

    public int getPosIniX() {
        return posIniX;
    }

    public void setPosIniX(int posIniX) {
        this.posIniX = posIniX;
    }

    public int getPosFinX() {
        return posFinX;
    }

    public void setPosFinX(int posFinX) {
        this.posFinX = posFinX;
    }

    public int getPosIniY() {
        return posIniY;
    }

    public void setPosIniY(int posIniY) {
        this.posIniY = posIniY;
    }

    public int getPosFinY() {
        return posFinY;
    }

    public void setPosFinY(int posFinY) {
        this.posFinY = posFinY;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

  
}
