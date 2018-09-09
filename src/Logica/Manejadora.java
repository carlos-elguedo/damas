/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import interfaz.EscogeTabla;
import interfaz.MenuPrinc;
import interfaz.PanelJuego;
import java.awt.Container;
import java.awt.Image;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;


/**
 *
 * @author USER
 */
public class Manejadora extends Principal{
    public Image imgTab;
    JMenuBar Menu = new JMenuBar();
    JMenu m1 = new JMenu("Juego");
    JMenu m2 = new JMenu("Ver");
    JMenu m3 = new JMenu("Configuracion");
    JMenu m4 = new JMenu("God bay");
    public Manejadora(){
        
    }
    //Metodos
    public void UnJugador(){
        String nom = JOptionPane.showInputDialog(" NOMBRE del Jugador 1: ");
        if(nom==""){
            nom = JOptionPane.showInputDialog("No has ingresado nada, otra vez: ");
        }else{
            setJugador1(nom);
        }
        String nom2 = JOptionPane.showInputDialog(" NOMBRE del Jugador 2: ");
        if(nom2==""){
            nom2 = JOptionPane.showInputDialog("No has ingresado nada, otra vez: ");
        }else{
            setJugador2(nom);
        }
            TipoJuego=1;
                        ventanaPrinc.setContentPane((Container)new EscogeTabla());
                        ventanaPrinc.setSize(850,545);
                        ventanaPrinc.setLocation(200,100);
                        ventanaPrinc.setVisible(true);
       
    }
    public void DosJugadores(){
        String nom = JOptionPane.showInputDialog(" NOMBRE del Jugador 1: ");
        if(nom==null){
            nom = JOptionPane.showInputDialog("No has ingresado nada, otra vez: ");
        }else{
            setJugador1(nom);
        }
        String nom2 = JOptionPane.showInputDialog(" NOMBRE del Jugador 2: ");
        if(nom2==null){
            nom2 = JOptionPane.showInputDialog("No has ingresado nada, otra vez: ");
        }else{
            setJugador2(nom2);
        }
            TipoJuego=2;
                        Menu.add(m1);Menu.add(m2);Menu.add(m3);Menu.add(m4);
                        System.out.println("3 seg");        
                        ventanaPrinc.setContentPane((Container)new PanelJuego(0,6,7,6,nom,nom2));
                        ventanaPrinc.setJMenuBar(Menu);
                        ventanaPrinc.setSize(800,725);
                        ventanaPrinc.setLocation(200,30);
                        ventanaPrinc.setVisible(true);
       
    }
    public void Configuracion(){
        
    }
    public void Creditos(){
        
    }
    public void Salir(){
        System.exit(0);
    }
    
    /*Blanco = 0
     * Negro = 1
     * Rojo = 2
     * Axul = 3
     * Amarillo = 4
     * Verde  = 5
     */
    //Metodos manejadores de la escogencia de tablas...
    public void Cuadro1 (){
        Control play = new Control(1);
        play.play(0,1);
    }
    public void Cuadro2 (){
        Control play = new Control(2);
        play.play(2,4);
    }
    public void Cuadro3 (){
        Control play = new Control(3);
        play.play(1,3);
    }
    public void Cuadro5 (){
        Control play = new Control(5);
        play.play(0,3);
    }
    public void Cuadro4() {
        Control play = new Control(4);
        play.play(5,2);
    }
}
