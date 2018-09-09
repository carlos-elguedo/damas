/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static Logica.Principal.ventanaPrinc;
import interfaz.EscogeTabla;
import interfaz.PanelJuego;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author USER
 */
public class Control extends Principal{
    
    public PanelJuego objeto = new PanelJuego();
    public int tab,color1,color2;
    public int MatNum[][]= { {0,1,0,1,0,1,0,1}     , 
                             {1,0,1,0,1,0,1,0}     ,
                             {0,1,0,1,0,1,0,1}     ,
                             {1,0,1,0,1,0,1,0}     ,
                             {0,1,0,1,0,1,0,1}     ,
                             {1,0,1,0,1,0,1,0}     ,
                             {0,1,0,1,0,1,0,1}     ,
                             {1,0,1,0,1,0,1,0} }   ;
    
    

    public Control(int tab) {
        this.tab = tab;
    }
    public Control(){
        
    }
    
    public int getTab() {
        return tab;
    }

    public void setTab(int tab) {
        this.tab = tab;
    }

    boolean fichasJ1[] = {true, true, true, true, true, true, true, true};
    boolean fichasJ2[] = {true, true, true, true, true, true, true, true};
    Fichas vect [] = {null, null, null, null, null, null, null, null};
    Fichas vect2 [] = {null, null, null, null, null, null, null, null};
    
    
    public void play(int J1, int J2){
        //Fichas para jugador 1
        color1=J1;
        color2=J2;
        ventanaPrinc.setContentPane((Container)new PanelJuego(tab));
                        ventanaPrinc.setSize(800,725);      
                        ventanaPrinc.setLocation(200,30);
                        ventanaPrinc.setVisible(true);
                    //    Colocadora o = new Colocadora();
                      //  o.start();
                    new Colocadora();
        
    }
    public int coordenadaX ( int y){
        int punto=0;
        if(y==0){punto = 150;}
        if(y==1){punto = 212;}
        if(y==2){punto = 275;}
        if(y==3){punto = 337;}
        if(y==4){punto = 400;}
        if(y==5){punto = 462;}
        if(y==6){punto = 525;}
        if(y==7){punto = 587;}
        
        
        return punto;
    }
    public int coordenadaY (int  x){
        int punto=0;
        if(x==0){punto = 150;}
        if(x==1){punto = 212;}
        if(x==2){punto = 275;}
        if(x==3){punto = 337;}
        if(x==4){punto = 400;}
        if(x==5){punto = 462;}
        if(x==6){punto = 525;}
        if(x==7){punto = 587;}
        
        return punto;
    }
    
    //private class Colocadora extends Thread{
    public class Colocadora extends Thread{
                    
        JMenuBar Menu = new JMenuBar();
        
        JMenu m1 = new JMenu("Juego");
        JMenu m2 = new JMenu("Ver");
        JMenu m3 = new JMenu("Configuracion");
        JMenu m4 = new JMenu("God bay");
        
                 JMenuItem m11 = new JMenuItem("Nuevo Juego");
		 JMenuItem m12 = new JMenuItem("Historial de Jugadas");
		 JMenuItem m13 = new JMenuItem("Menu Principal");
		 JMenuItem m21 = new JMenuItem("Personalizar Fichas");
		 JMenuItem m22 = new JMenuItem("Personalizar Fondo");
		 JMenuItem m31 = new JMenuItem("Ir a configuraciones");
		 JMenuItem m41 = new JMenuItem("Reiniciar el juego");
		 JMenuItem m42 = new JMenuItem("Salir");
        
        
        public Colocadora(){
            start();
        }
    
        
        @Override
        public void run(){
                  try{
                      m11.addActionListener(new ActionListener(){@SuppressWarnings("unused")
                         @Override
                            public void actionPerformed(ActionEvent arg0) {
                                new Colocadora();
                            }});
                      m12.addActionListener(new ActionListener(){@SuppressWarnings("unused")
                         @Override
                            public void actionPerformed(ActionEvent arg0) {
				}});
                      m13.addActionListener(new ActionListener(){@SuppressWarnings("unused")
                         @Override
                            public void actionPerformed(ActionEvent arg0) {
				iniciar();
                            }});
                      m21.addActionListener(new ActionListener(){@SuppressWarnings("unused")
                         @Override
                            public void actionPerformed(ActionEvent arg0) {
				}});
                     m22.addActionListener(new ActionListener(){@SuppressWarnings("unused")
                         @Override
                            public void actionPerformed(ActionEvent arg0) {
				}});




                        sleep(3000);
                        m1.add(m11);m1.add(m12);m1.add(m13);
                        m2.add(m21);m2.add(m22);
                        m3.add(m31);
                        m4.add(m41);m4.add(m42);
                        Menu.add(m1);Menu.add(m2);Menu.add(m3);Menu.add(m4);
                        System.out.println("3 seg");        
                        ventanaPrinc.setContentPane((Container)new PanelJuego(0,color1,color2,getTab(),getJugador1(),getJugador2()));
                        ventanaPrinc.setJMenuBar(Menu);
                        ventanaPrinc.setSize(800,725);
                        ventanaPrinc.setLocation(200,30);
                        ventanaPrinc.setVisible(true);
                    //  
                             }catch(InterruptedException e){
                        System.out.println("Se interrumpio");}//fin catch
    }
        }

        public void IniciaJuego(){
            for(int i = 0 ; i<2 ; i++){
                for(int j = 0 ; j<2 ; j++){
                    if(MatNum[i][j]==1){
                        MatNum[i][j]=3;  
                    }
                }//seg for
            }//primer for
            for(int i = 7 ; i<5 ; i--){
                for(int j = 7 ; j<5 ; j--){
                    if(MatNum[i][j]==1){
                        MatNum[i][j]=2;
                    }
                }//seg for
            }//primer for
        }
        

        public String obtenerNombre(int j){
            String ret="";
            if(j==1){ret= getJugador1();}
            if(j==2){ret= getJugador2();}
            return ret;
        }
        public void Cacher(int x, int y){
            
        }
        
}


