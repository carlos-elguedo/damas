/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import interfaz.Bienvwnida;
import interfaz.MenuPrinc;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Principal extends Thread{

        static JFrame ventanaPrinc = new JFrame("Super Damas");
        public String Jugador1;
        public String Jugador2;
        public int TipoJuego;
        
    public int getTipoJuego() {
        return TipoJuego;
    }
    public void setTipoJuego(int TipoJuego) {
        this.TipoJuego = TipoJuego;
    }
    public String getJugador2() {
        return Jugador2;
    }
    public void setJugador2(String Jugador2) {
        this.Jugador2 = Jugador2;
    }
    public String getJugador1() {
        return Jugador1;
    }
    public void setJugador1(String Jugador1) {
        this.Jugador1 = Jugador1;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ventanaPrinc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrinc.setResizable(false);
        ventanaPrinc.setVisible(true);
        ventanaPrinc.add(new Bienvwnida());
        ventanaPrinc.setLocation(400,150);
        ventanaPrinc.setSize(500,500);
        iniciar();
        
    }
    @Override
    public void run(){
                    try{
                        sleep(1000);
                        ventanaPrinc.setContentPane((Container)new MenuPrinc());
                        ventanaPrinc.setSize(500,630);
                        ventanaPrinc.setLocation(400,100);
                        ventanaPrinc.setVisible(true);
                        
                             }catch(InterruptedException e){
                        System.out.println("Se interrumpio");}//fin catch


    }
    public static void iniciar(){
        Principal vent = new Principal();
        vent.start();
    }
}
