/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

/**
 *
 * @author USER
 */
public class Fichas {
    

    public Fichas(int Color, boolean estado,int x,int y) {
        this.Color = Color;
        this.estado = estado;
        pocX = x;
        pocY = y;
        
    }
    
    /*Blanco = 0
     * Negro = 1
     * Rojo = 2
     * Axul = 3
     * Amarillo = 4
     * Verde  = 5
     */
    
    public int Color;
    public boolean estado;
    private boolean Dama;
    public int pocX;
    public int pocY;

    public int getPocX() {
        return pocX;
    }
    public int getPocY() {
        return pocY;
    }
    public void setPosicion(int x, int y) {
        this.pocX = x;
        this.pocY = y;
    }
    public boolean getEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public int getColor() {
        return Color;
    }
    public void setColor(int Color) {
        this.Color = Color;
    }
        public boolean getDama() {
        return Dama;
    }
    public void setDama(boolean Dama) {
        this.Dama = Dama;
    }


}
