/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Logica.Cliks;
import Logica.Control;
import Logica.Fichas;
import Logica.Principal;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;


/**
 *
 * @author USER
 */
public class PanelJuego extends JPanel implements MouseListener{

    
    public int x;
    public int y;
    public Image fic;
    public static int inJuego=999;
    public Image fic1,fic2,fic1Dama,fic2Dama;
    String jugador1,jugador2;
    boolean estado =false;    
    public static int inicio;
    public static Fichas f1,f2,f3,f4,f5,f6,f7,f8,  f9,f10,f11,f12; 
    public static Fichas fi1,fi2,fi3,fi4,fi5,fi6,fi7,fi8,  fi9,fi10,fi11,fi12; 
    public static int MatNum[][]= { {0,3,0,3,0,3,0,3}     , 
                                    {3,0,3,0,3,0,3,0}     ,
                                    {0,3,0,3,0,3,0,3}     ,
                                    {1,0,1,0,1,0,1,0}     ,
                                    {0,1,0,1,0,1,0,1}     ,
                                    {2,0,2,0,2,0,2,0}     ,
                                    {0,2,0,2,0,2,0,2}     ,
                                    {2,0,2,0,2,0,2,0} }   ;
    
    public int vect[][]= {
        {0,1,0,2,0,3,0,4},
        {5,0,6,0,7,0,8,0},
        {0,9,0,20,0,21,0,22},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {19,0,30,0,31,0,32,0},
        {0,11,0,12,0,13,0,14,0},
        {15,0,16,0,17,0,18,0},
    };
    int cont=0;
    static Cliks click= new Cliks();
    public static int muertesJ1=0,muertasF1=150,muertasF2=610;
    public static int muertesJ2=0;

    public PanelJuego(){}
    int Cont=0;
    public PanelJuego(int Tabla) {
        this.Tabla = Tabla;
        estado = false;
        System.out.println("-----------------------"+Tabla);
        
        if(Tabla==1){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaAmaRoj.png"));System.out.println("Entro en el 1");}
        if(Tabla==2){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaBlaNeg.png"));System.out.println("Entro en el 2");}
        if(Tabla==3){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaBlaRoj.png"));System.out.println("Entro en el 3");}
        if(Tabla==4){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaBlaAma.png"));System.out.println("Entro en el 4");}
        if(Tabla==5){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaRojNeg.png"));System.out.println("Entro en el 5");}
        if(Tabla==6){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/3d.png"));System.out.println("Entro en el 6");}
        
    }
    public PanelJuego(int modo, int color, int color2,int Tabbla, String jug1, String jug2) {
        f1= new Fichas(color, true,212,150);
        f2 = new Fichas(color, true, 337, 150);
        f3 = new Fichas(color, true, 462, 150);
        f4 = new Fichas(color, true, 587, 150);
        f5 = new Fichas(color, true, 150, 212);
        f6 = new Fichas(color, true, 275, 212);
        f7 = new Fichas(color, true, 400, 212);
        f8 = new Fichas(color, true, 525, 212);
        f9 = new Fichas(color, true, 212, 275);
        f10 = new Fichas(color, true, 337, 275);
        f11 = new Fichas(color, true, 462, 275);
        f12 = new Fichas(color, true, 587, 275);
        
jugador1=jug1;
jugador2=jug2;
if(jug2==null){
    jugador2="Maquina";
}
//  Color blanco
        if(f1.getColor()==0){fic1 = getToolkit().getImage(getClass().getResource("/imagenes/fichaBlancaA.png"));}        System.out.println("color Jugador 1"+f1.getColor());        
        if(f1.getColor()==1){fic1 = getToolkit().getImage(getClass().getResource("/imagenes/fichaNegraA.png"));}
        if(f1.getColor()==2){fic1 = getToolkit().getImage(getClass().getResource("/imagenes/fichaRojaA.png"));}
        if(f1.getColor()==3){fic1 = getToolkit().getImage(getClass().getResource("/imagenes/fichaAzulA.png"));}
        if(f1.getColor()==4){fic1 = getToolkit().getImage(getClass().getResource("/imagenes/fichaAmarillaA.png"));}  
        if(f1.getColor()==5){fic1 = getToolkit().getImage(getClass().getResource("/imagenes/fichaVerdeA.png"));}
        if(f1.getColor()==6){fic1 = getToolkit().getImage(getClass().getResource("/imagenes/ficha3dNeg.png"));}
        if(f1.getColor()==7){fic1 = getToolkit().getImage(getClass().getResource("/imagenes/ficha3dBla.png"));}
            
        if(f1.getColor()==0){fic1Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaBlancaC.GIF"));}
        if(f1.getColor()==1){fic1Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaNegraC.GIF"));}
        if(f1.getColor()==2){fic1Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaRojaC.GIF"));}
        if(f1.getColor()==3){fic1Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaAzulC.GIF"));}
        if(f1.getColor()==4){fic1Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaAmarillaC.GIF"));}  
        if(f1.getColor()==5){fic1Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaVerdeC.GIF"));}
        if(f1.getColor()==6){fic1Dama = getToolkit().getImage(getClass().getResource("/imagenes/ficha3dNegRey.png"));}
        if(f1.getColor()==7){fic1Dama = getToolkit().getImage(getClass().getResource("/imagenes/ficha3dBlaRey.png"));}
        System.out.println("entro el pinta jugador 1");
        
 fi1 = new Fichas(color2, true,212, 525);
 fi2 = new Fichas(color2, true,337, 525);
 fi3 = new Fichas(color2, true,462, 525);
 fi4 = new Fichas(color2, true,587, 525);
 fi5 = new Fichas(color2, true,150, 587);
 fi6 = new Fichas(color2, true,275, 587);
 fi7 = new Fichas(color2, true,400, 587);
 fi8 = new Fichas(color2, true,525, 587);
 fi9 = new Fichas(color2, true,150, 462);
 fi10 = new Fichas(color2, true,275, 462);
 fi11 = new Fichas(color2, true,400, 462);
 fi12 = new Fichas(color2, true,525, 462);
 
 
                System.out.println("color Jugador 2"+fi1.getColor());
        if(fi1.getColor()==0){fic2 = getToolkit().getImage(getClass().getResource("/imagenes/fichaBlancaB.png"));}
        if(fi2.getColor()==1){fic2 = getToolkit().getImage(getClass().getResource("/imagenes/fichaNegraB.png"));}
        if(fi3.getColor()==2){fic2 = getToolkit().getImage(getClass().getResource("/imagenes/fichaRojaB.png"));}
        if(fi4.getColor()==3){fic2 = getToolkit().getImage(getClass().getResource("/imagenes/fichaAzulB.png"));}
        if(fi5.getColor()==4){fic2 = getToolkit().getImage(getClass().getResource("/imagenes/fichaAmarillaB.png"));}
        if(fi6.getColor()==5){fic2 = getToolkit().getImage(getClass().getResource("/imagenes/fichaVerdeB.png"));}
        if(fi1.getColor()==6){fic2 = getToolkit().getImage(getClass().getResource("/imagenes/ficha3dNeg.png"));}
        if(fi1.getColor()==7){fic2 = getToolkit().getImage(getClass().getResource("/imagenes/ficha3dBla.png"));}
        //damas.....................................
        if(fi1.getColor()==0){fic2Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaBlancaC.GIF"));}
        if(fi1.getColor()==1){fic2Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaNegraC.GIF"));}
        if(fi1.getColor()==2){fic2Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaRojaC.GIF"));}
        if(fi1.getColor()==3){fic2Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaAzulC.GIF"));}
        if(fi1.getColor()==4){fic2Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaAmarillaC.GIF"));}  
        if(fi1.getColor()==5){fic2Dama = getToolkit().getImage(getClass().getResource("/imagenes/fichaVerdeC.GIF"));}
        if(fi1.getColor()==6){fic2Dama = getToolkit().getImage(getClass().getResource("/imagenes/ficha3dNegRey.png"));}
        if(fi1.getColor()==7){fic2Dama = getToolkit().getImage(getClass().getResource("/imagenes/ficha3dBlaRey.png"));}
                System.out.println("entro el pinta jugador 2");
     inJuego=modo;
     if(Tabbla==1){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaAmaRoj.png"));System.out.println("Entro en el 1-2");}
        if(Tabbla==2){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaBlaNeg.png"));System.out.println("Entro en el 2-2");}
        if(Tabbla==3){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaBlaRoj.png"));System.out.println("Entro en el 3-2");}
        if(Tabbla==4){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaBlaAma.png"));System.out.println("Entro en el 4-2");}
        if(Tabbla==5){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/tablaRojNeg.png"));System.out.println("Entro en el 5-2");}
        if(Tabbla==6){imgTabla = getToolkit().getImage(getClass().getResource("/imagenes/3d.png"));System.out.println("Entro en el 6");}

        addMouseListener(this);
     repaint();
    }
    
    
        private int Tabla;
        
         Image imgTabla;
         
        Image imgTitulo = getToolkit().getImage(getClass().getResource("/imagenes/titulo.png"));
        Image imgTurno1 = getToolkit().getImage(getClass().getResource("/imagenes/turnoJ1.png"));
        Image imgTurno2 = getToolkit().getImage(getClass().getResource("/imagenes/turnoJ2.png"));

    public Image getImgTabla() {
        return imgTabla;
    }
    public void setImgTabla(Image imgTabla) {
        this.imgTabla = imgTabla;
    }

    Principal obj = new Principal();
    
    boolean v=false;
    ImageObserver obs;    
    
    
    @Override
    public void paint(Graphics g){
        super.paint( g );
        
        Graphics2D g2 = (Graphics2D) g;
        Rectangle a1 = new Rectangle(0, 0, 800, 725);
        Point2D p1 = new Point2D.Double(0, 0);
        Point2D p2 = new Point2D.Double(800, 725);
        g2.setPaint(new GradientPaint(p1, Color.white, p2, Color.black));
        
        g2.fill(a1);g2.draw(a1);        
            System.out.println(inJuego);
        v=g2.drawImage(imgTabla, 150, 150,this);System.out.println("Tabla  : "+v);
        v=g2.drawImage(imgTitulo, 190, 15, this);System.out.println("titulo  : "+v);
    if(inJuego==0){
        
        if(f1.estado==true){if(f1.getDama()==true){
                g2.drawImage(fic2Dama, f1.getPocX(), f1.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f1.getPocX(), f1.getPocY(),62,62, this);System.out.println("Imagen  1: "+v+"     "+f1.getPocX()+" "+f1.getPocY());
            }
        }
        if(f2.estado==true){if(f2.getDama()==true){
                g2.drawImage(fic2Dama, f2.getPocX(), f2.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f2.getPocX(), f2.getPocY(),62,62, this);System.out.println("Imagen  2: "+v+"     "+f2.getPocX()+" "+f2.getPocY());
        }
        }
        if(f3.estado==true){if(f3.getDama()==true){
                g2.drawImage(fic2Dama, f3.getPocX(), f3.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f3.getPocX(), f3.getPocY(),62,62, this);System.out.println("Imagen  3: "+v+"     "+f3.getPocX()+" "+f3.getPocY());
        }
        }
        if(f4.estado==true){if(f4.getDama()==true){
                g2.drawImage(fic2Dama, f4.getPocX(), f4.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f4.getPocX(), f4.getPocY(),62,62, this);System.out.println("Imagen  4: "+v+"     "+f4.getPocX()+" "+f4.getPocY());
        }
        }
        if(f5.estado==true){if(f5.getDama()==true){
                g2.drawImage(fic2Dama, f5.getPocX(), f5.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f5.getPocX(), f5.getPocY(),62,62, this);System.out.println("Imagen  5: "+v+"     "+f5.getPocX()+" "+f5.getPocY());
        }
        }
        if(f6.estado==true){if(f6.getDama()==true){
                g2.drawImage(fic2Dama, f6.getPocX(), f6.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f6.getPocX(), f6.getPocY(),62,62, this);System.out.println("Imagen  6: "+v+"     "+f6.getPocX()+" "+f6.getPocY());
        }
        }
        if(f7.estado==true){if(f7.getDama()==true){
                g2.drawImage(fic2Dama, f7.getPocX(), f7.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f7.getPocX(), f7.getPocY(),62,62, this);System.out.println("Imagen  7: "+v+"     "+f7.getPocX()+" "+f7.getPocY());
        }
        }
        if(f8.estado==true){if(f8.getDama()==true){
                g2.drawImage(fic2Dama, f8.getPocX(), f8.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f8.getPocX(), f8.getPocY(),62,62, this);System.out.println("Imagen  8: "+v+"     "+f8.getPocX()+" "+f8.getPocY());
        }
        }
        if(f9.estado==true){if(f9.getDama()==true){
                g2.drawImage(fic2Dama, f9.getPocX(), f9.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f9.getPocX(), f9.getPocY(),62,62, this);System.out.println("Imagen  9: "+v+"     "+f9.getPocX()+" "+f9.getPocY());
        }
        }
        if(f10.estado==true){if(f10.getDama()==true){
                g2.drawImage(fic2Dama, f10.getPocX(), f10.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f10.getPocX(), f10.getPocY(),62,62, this);System.out.println("Imagen  10: "+v+"     "+f10.getPocX()+" "+f10.getPocY());
        }
        }
        if(f11.estado==true){if(f11.getDama()==true){
                g2.drawImage(fic2Dama, f11.getPocX(), f11.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f11.getPocX(), f11.getPocY(),62,62, this);System.out.println("Imagen  11: "+v+"     "+f11.getPocX()+" "+f11.getPocY());
        }
        }
        if(f12.estado==true){if(f12.getDama()==true){
                g2.drawImage(fic2Dama, f12.getPocX(), f12.getPocY(),62,62, this);
            }else{v=g2.drawImage(fic2, f12.getPocX(), f12.getPocY(),62,62, this);System.out.println("Imagen  12: "+v+"     "+f12.getPocX()+" "+f12.getPocY());
        }
        }
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,      ");
        
        if(fi1.estado==true){if(fi1.getDama()==true){
                g2.drawImage(fic1Dama, fi1.getPocX(), fi1.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi1.getPocX(), fi1.getPocY(),62,62, this);System.out.println("Imagen  1: "+v+"     "+fi1.getPocX()+" "+fi1.getPocY());
        }
        }
        if(fi2.estado==true){if(fi2.getDama()==true){
                g2.drawImage(fic1Dama, fi2.getPocX(), fi2.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi2.getPocX(), fi2.getPocY(),62,62, this);System.out.println("Imagen  2: "+v+"     "+fi2.getPocX()+" "+fi2.getPocY());
        }
        }
        if(fi3.estado==true){if(fi3.getDama()==true){
                g2.drawImage(fic1Dama, fi3.getPocX(), fi3.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi3.getPocX(), fi3.getPocY(),62,62, this);System.out.println("Imagen  3: "+v+"     "+fi3.getPocX()+" "+fi3.getPocY());
        }
        }
        if(fi4.estado==true){if(fi4.getDama()==true){
                g2.drawImage(fic1Dama, fi4.getPocX(), fi4.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi4.getPocX(), fi4.getPocY(),62,62, this);System.out.println("Imagen  4: "+v+"     "+fi4.getPocX()+" "+fi4.getPocY());
        }
        }
        if(fi5.estado==true){if(fi5.getDama()==true){
                g2.drawImage(fic1Dama, fi5.getPocX(), fi5.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi5.getPocX(), fi5.getPocY(),62,62, this);System.out.println("Imagen  5: "+v+"     "+fi5.getPocX()+" "+fi5.getPocY());
        }
        }
        if(fi6.estado==true){if(fi6.getDama()==true){
                g2.drawImage(fic1Dama, fi6.getPocX(), fi6.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi6.getPocX(), fi6.getPocY(),62,62, this);System.out.println("Imagen  6: "+v+"     "+fi6.getPocX()+" "+fi6.getPocY());
        }
        }
        if(fi7.estado==true){if(fi7.getDama()==true){
                g2.drawImage(fic1Dama, fi7.getPocX(), fi7.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi7.getPocX(), fi7.getPocY(),62,62, this);System.out.println("Imagen  7: "+v+"     "+fi7.getPocX()+" "+fi7.getPocY());
        }
        }
        if(fi8.estado==true){if(fi8.getDama()==true){
                g2.drawImage(fic1Dama, fi8.getPocX(), fi8.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi8.getPocX(), fi8.getPocY(),62,62, this);System.out.println("Imagen  8: "+v+"     "+fi8.getPocX()+" "+fi8.getPocY());
        }
        }
        if(fi9.estado==true){if(fi9.getDama()==true){
                g2.drawImage(fic1Dama, fi9.getPocX(), fi9.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi9.getPocX(), fi9.getPocY(),62,62, this);System.out.println("Imagen  9: "+v+"     "+fi9.getPocX()+" "+fi9.getPocY());
        }
        }
        if(fi10.estado==true){if(fi10.getDama()==true){
                g2.drawImage(fic1Dama, fi10.getPocX(), fi10.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi10.getPocX(), fi10.getPocY(),62,62, this);System.out.println("Imagen  10: "+v+"     "+fi10.getPocX()+" "+fi10.getPocY());
        }
        }
        if(fi11.estado==true){if(fi11.getDama()==true){
                g2.drawImage(fic1Dama, fi11.getPocX(), fi11.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi11.getPocX(), fi11.getPocY(),62,62, this);System.out.println("Imagen  11: "+v+"     "+fi11.getPocX()+" "+fi11.getPocY());
        }
        }
        if(fi12.estado==true){if(fi12.getDama()==true){
                g2.drawImage(fic1Dama, fi12.getPocX(), fi12.getPocY(),62,62, this);
            }else{
            v=g2.drawImage(fic1, fi12.getPocX(), fi12.getPocY(),62,62, this);System.out.println("Imagen  12: "+v+"     "+fi12.getPocX()+" "+fi12.getPocY());
        }
        }
        
        if(turno%2==0){
            g2.drawImage(imgTurno1, 2, 5, this);
        }else{
            g2.drawImage(imgTurno2, 2, 5, this);
        }
        //muertas--------------------------------------------------
        for(int i=0;i<muertesJ1;i++){
            g2.drawImage(fic1,700,(muertasF2-(i*30)),this);
        }
        for(int i=0;i<muertesJ2;i++){
            g2.drawImage(fic2,65,(muertasF1+(i*30)),this);
        }
        //muertas--------------------------------------------------
    }//if de juego es igual a cero
    
    }
    @Override
    public void repaint(){
        super.repaint();
    }

    public void mouseClicked(MouseEvent e) {
        
    }

    public int cont2=0;
    public static int turno=2;
    static boolean vv2=false,vv3;
    public void mousePressed(MouseEvent e) {
        if(turno%2==0){
            System.out.println("___________________________Turno jugador 1____________________________________________________");
        }else{
            System.out.println("___________________________jugador 2  Turno____________________________________________________");
        }
        System.out.println("--------------------");
        System.out.println("x = "+ e.getX());
        System.out.println("Y = "+ e.getY());
        System.out.println("--------------------");
        System.out.println("vv2 "+vv2);
        if(e.getX()>150&&e.getX()<650&&e.getY()>150&&e.getY()<650){
            
            System.out.println("entro");
            
           if(vv2==false) {
            vv2=click.eventos(e.getX(),e.getY());
           }else{
               click.eventos2(e.getX(), e.getY());
               if(turno%2==0){
               AudioClip sonido;
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Movida_1.wav"));
                    sonido.play();
               }else{
                   AudioClip sonido;
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Movida_2.wav"));
                    sonido.play();
               }
               vv2=false;
           }
        
        }else{//else viejo
            System.out.println("NOOOOOOOOOOOO");
        }
        repaint();
    }

    
    public void mouseReleased(MouseEvent e) {
        
    }

    
    public void mouseEntered(MouseEvent e) {
        
    }

    
    public void mouseExited(MouseEvent e) {
        
    }
        
    
    }