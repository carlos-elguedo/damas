/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Animaciones.Animacion1;
import interfaz.PanelJuego;
import java.applet.AudioClip;

/**
 *
 * @author USER
 */
public class Cliks extends PanelJuego{
    
    Control control = new Control();
    int fil,col,fil2,col2, ddx,ddy,dix,diy;
    int ddx1,ddx2,ddx3,ddx4,ddx5,ddx6, dix1,dix2,dix3,dix4,dix5,dix6;
    int ddy1,ddy2,ddy3,ddy4,ddy5,ddy6, diy1,diy2,diy3,diy4,diy5,diy6;
    Animacion1 ani1;
    boolean v1,v3;
    public boolean eventos(int x, int y){
        boolean ret=false;
        
        System.out.println("el llamo "+ x+" "+y);
        fil=devuelveFila(y);
        col=devuelveColumna(x);
        System.out.println("fila : "+fil+" columna : "+col);
        System.out.println(MatNum[fil][col]);
        if(turno%2==0){//turno jugador 1
            
            if(v1=pulsoBien1(fil, col)==true){
                System.out.println("Si esta ocupada 1");
                ddx=devDiagDerArribaX(fil, col);ddy=devDiagDerArribaY(fil, col);
                dix=devDiagIzqArribaX(fil, col);diy=devDiagIzqArribaY(fil, col);
                if((ddx!=9)&&(ddy!=9)){
                    System.out.println("diagonal der : x "+ddx+" y "+ddy);
                }
                if((dix!=9)&&(diy!=9)){
                    System.out.println("diagonal izq : x "+dix+" y "+diy);
                }
                
                ret=true;
                
            }else{
                System.out.println("esta vacia");
            }
        }else{//turno arriba
            if(v1=pulsoBien2(fil, col)==true){
                
                System.out.println("Si esta ocupada 2");
                ddx=devDiagDerAbajoX(fil, col);ddy=devDiagDerAbajoY(fil, col);
                dix=devDiagIzqAbajoX(fil, col);diy=devDiagIzqAbajoY(fil, col);
                if((ddx!=9)&&(ddy!=9)){
                    System.out.println("diagonal der 2 : x "+ddx+" y "+ddy);
                }
                if((dix!=9)&&(diy!=9)){
                    System.out.println("diagonal izq 2 : x "+dix+" y "+diy);
                }
                
                ret=true;
                
            }else{
                System.out.println("esta vacia");
            }
        }
        return ret;
    }
    int next;
    
    public int miraqueHay(int x, int y){
        int ret=0;
        ret=MatNum[x][y];
        return ret;
    }
    
    public void eventos2(int x, int y){
        fil2=devuelveFila(y);
        col2=devuelveColumna(x);
        System.out.println("......................................................");
        System.out.println("viejos "+fil+" "+col);
        System.out.println("nuevos "+fil2+" "+col2);
        System.out.println("diagonales der "+ddx+" "+ddy);
        System.out.println("diagonales izq "+dix+" "+diy);
        v3=esDama(fil,col);
        if(v3==true){
            eventosDama(fil2,col2);
        }else{
        //                     --------------------------------turno jugador 1
        if(turno%2==0){
            if (miraqueHay(fil2,col2)==1||miraqueHay(fil2, col2)==3){//if 1
                switch(miraqueHay(fil2,col2)){
                    case 1:
                        if((fil2==ddx)&&(col2==ddy)){//if  para si es igual a la diagonal der de arriba
                if(11==(vect[fil][col])){System.out.println("Objeto numero : 1");
                fi1.setPosicion(coordenadaX(ddy), coordenadaY(ddx)); vect[fil][col]=0;vect[fil2][col2]=11;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(12==(vect[fil][col])){System.out.println("Objeto numero : 2");
                fi2.setPosicion(coordenadaX(ddy), coordenadaY(ddx)); vect[fil][col]=0;vect[fil2][col2]=12;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(13==(vect[fil][col])){System.out.println("Objeto numero : 3");
                fi3.setPosicion(coordenadaX(ddy), coordenadaY(ddx)); vect[fil][col]=0;vect[fil2][col2]=13;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(14==(vect[fil][col])){System.out.println("Objeto numero : 4");
                fi4.setPosicion(coordenadaX(ddy), coordenadaY(ddx)); vect[fil][col]=0;vect[fil2][col2]=14;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }   
                if(15==(vect[fil][col])){System.out.println("Objeto numero : 5");
                fi5.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=15;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(16==(vect[fil][col])){System.out.println("Objeto numero : 6");
                fi6.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=16;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(17==(vect[fil][col])){System.out.println("Objeto numero : 7");
                fi7.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=17;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(18==(vect[fil][col])){System.out.println("Objeto numero : 8");
                fi8.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=18;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(19==(vect[fil][col])){System.out.println("Objeto numero : 9");
                fi9.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=19;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(30==(vect[fil][col])){System.out.println("Objeto numero : 13");
                fi10.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=30;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(31==(vect[fil][col])){System.out.println("Objeto numero : 11");
                fi11.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=31;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(32==(vect[fil][col])){System.out.println("Objeto numero : 12");
                fi12.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=32;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                compruebaDamaJ1(fil2,col2);
                ani1 = new Animacion1(2,2,2,2);
                turno+=1;
                        }//llave de cierre para la diagonal der
                if((fil2==dix)&&(col2==diy)){//if para la diagonal izquierda de arriba
                if(11==(vect[fil][col])){System.out.println("Objeto numero : 1");
                fi1.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=11;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(12==(vect[fil][col])){System.out.println("Objeto numero : 2");
                fi2.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=12;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(13==(vect[fil][col])){System.out.println("Objeto numero : 3");
                fi3.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=13;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(14==(vect[fil][col])){System.out.println("Objeto numero : 4");
                fi4.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=14;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(15==(vect[fil][col])){System.out.println("Objeto numero : 5");
                fi5.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=15;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(16==(vect[fil][col])){System.out.println("Objeto numero : 6");
                fi6.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=16;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(17==(vect[fil][col])){System.out.println("Objeto numero : 7");
                fi7.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=17;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(18==(vect[fil][col])){System.out.println("Objeto numero : 8");
                fi8.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=18;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(19==(vect[fil][col])){System.out.println("Objeto numero : 9");
                fi9.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=19;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(30==(vect[fil][col])){System.out.println("Objeto numero : 13");
                fi10.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=30;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(31==(vect[fil][col])){System.out.println("Objeto numero : 11");
                fi11.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=31;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                if(32==(vect[fil][col])){System.out.println("Objeto numero : 12");
                fi12.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=32;MatNum[fil][col]=1;MatNum[fil2][col2]=2;                }
                compruebaDamaJ1(fil2,col2);
                ani1 = new Animacion1(2,2,2,2);
                turno+=1;
                }//llave de cierre para la diagonal izq de arrina
                break;
                    case 3://caso de matar
                        if((fil2==ddx)&&(col2==ddy)){//if  para si es igual a la diagonal der de arriba
                            ddx=devDiagDerArribaX(fil2, col2);ddy=devDiagDerArribaY(fil2, col2);
                            if((ddx!=9)&&(ddy!=9)){
                                System.out.println("diagonal der 2 : x "+ddx+" y "+ddy);
                                if(miraqueHay(ddx,ddy)==1){//puede matar
                                    mataAj2(fil2,col2);
                                    if(11==(vect[fil][col])){System.out.println("Objeto numero : 1");
                                        fi1.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=11;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(12==(vect[fil][col])){System.out.println("Objeto numero : 2");
                                        fi2.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=12;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(13==(vect[fil][col])){System.out.println("Objeto numero : 3");
                                        fi3.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=13;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(14==(vect[fil][col])){System.out.println("Objeto numero : 4");
                                        fi4.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=14;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(15==(vect[fil][col])){System.out.println("Objeto numero : 5");
                                        fi5.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=15;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(16==(vect[fil][col])){System.out.println("Objeto numero : 6");
                                        fi6.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=16;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(17==(vect[fil][col])){System.out.println("Objeto numero : 7");
                                        fi7.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=17;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;               }
                                    if(18==(vect[fil][col])){System.out.println("Objeto numero : 8");
                                        fi8.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=18;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(19==(vect[fil][col])){System.out.println("Objeto numero : 9");
                                        fi9.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=19;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(30==(vect[fil][col])){System.out.println("Objeto numero : 13");
                                        fi10.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=30;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(31==(vect[fil][col])){System.out.println("Objeto numero : 11");
                                        fi11.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=31;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    if(32==(vect[fil][col])){System.out.println("Objeto numero : 12");
                                        fi12.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=32;MatNum[fil][col]=1;MatNum[ddx][ddy]=2;                }
                                    compruebaDamaJ1(ddx,ddy);
                                    turno+=1;
                                }//fin del if de la poc esta vacia
                            }//fin del if de la diagonal der correcta
                            
                        }//fin del if del diagonal der hacia arriba
                        if((fil2==dix)&&(col2==diy)){//if para la diagonal izquierda de arriba
                            System.out.println("Matar......izquierda....");
                            dix=devDiagIzqArribaX(fil2, col2);diy=devDiagIzqArribaY(fil2, col2);
                            if((dix!=9)&&(diy!=9)){    
                            System.out.println("diagonal IXQ 2 : x "+dix+" y "+diy);
                            
                                if(miraqueHay(dix,diy)==1){
                                  mataAj2(fil2,col2);  
                                        if(11==(vect[fil][col])){System.out.println("Objeto numero : 1");
                                            fi1.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=11;MatNum[fil][col]=1;MatNum[dix][diy]=2;                            }
                                        if(12==(vect[fil][col])){System.out.println("Objeto numero : 2");
                                            fi2.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=12;MatNum[fil][col]=1;MatNum[dix][diy]=2;                            }
                                        if(13==(vect[fil][col])){System.out.println("Objeto numero : 3");
                                            fi3.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=13;MatNum[fil][col]=1;MatNum[dix][diy]=2;                            }
                                        if(14==(vect[fil][col])){System.out.println("Objeto numero : 4");
                                            fi4.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=14;MatNum[fil][col]=1;MatNum[dix][diy]=2;                            }
                                        if(15==(vect[fil][col])){System.out.println("Objeto numero : 5");
                                            fi5.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=15;MatNum[fil][col]=1;MatNum[dix][diy]=2;                            }
                                        if(16==(vect[fil][col])){System.out.println("Objeto numero : 6");
                                            fi6.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=16;MatNum[fil][col]=1;MatNum[dix][diy]=2;                            }
                                        if(17==(vect[fil][col])){System.out.println("Objeto numero : 7");
                                            fi7.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=17;MatNum[fil][col]=1;MatNum[dix][diy]=2;                           }
                                        if(18==(vect[fil][col])){System.out.println("Objeto numero : 8");
                                            fi8.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=18;MatNum[fil][col]=1;MatNum[dix][diy]=2;                            }
                                        if(19==(vect[fil][col])){System.out.println("Objeto numero : 9");
                                            fi9.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=19;MatNum[fil][col]=1;MatNum[dix][diy]=2;                }
                                        if(30==(vect[fil][col])){System.out.println("Objeto numero : 13");
                                            fi10.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=30;MatNum[fil][col]=1;MatNum[dix][diy]=2;                }
                                        if(31==(vect[fil][col])){System.out.println("Objeto numero : 11");
                                            fi11.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=31;MatNum[fil][col]=1;MatNum[dix][diy]=2;                }
                                        if(32==(vect[fil][col])){System.out.println("Objeto numero : 12");
                                            fi12.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=32;MatNum[fil][col]=1;MatNum[dix][diy]=2;                }
                                        compruebaDamaJ1(dix,diy);
                                  turno+=1;
                                }//fin de la poc esta vacia y puede matar
                            }//fin del if de la diagonal izq correcta
                        }//fin del if para la diagonal izquierda de arriba
                        break;
                }//llave de switch para las 1 y 2
                
            }//llave de 1 y 2 opciones
            //
            if(miraqueHay(fil2, col2)==2){
                System.out.println("No puedes tienes un amigo JUG1");
            }//llave de encontro amigo
            
                       //---------------------------------------------------------------------------------------------------------------------------------------------------------
        }else{//            -----------------------------------turno jugador 2
            if (miraqueHay(fil2,col2)==1||miraqueHay(fil2,col2)==2){//if para las opciones 1 y 2
                switch(miraqueHay(fil2,col2)){
                    case 1:
                        if((fil2==ddx)&&(col2==ddy)){//if para opcion diagonal der de abajo
                            if(1==(vect[fil][col])){System.out.println("Objeto numero : 1");
                            f1.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=1;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(2==(vect[fil][col])){System.out.println("Objeto numero : 2");
                            f2.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=2;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(3==(vect[fil][col])){System.out.println("Objeto numero : 3");
                            f3.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=3;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(4==(vect[fil][col])){System.out.println("Objeto numero : 4");
                            f4.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=4;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(5==(vect[fil][col])){System.out.println("Objeto numero : 5");
                            f5.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=5;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(6==(vect[fil][col])){System.out.println("Objeto numero : 6");
                            f6.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=6;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(7==(vect[fil][col])){System.out.println("Objeto numero : 7");
                            f7.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=7;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(8==(vect[fil][col])){System.out.println("Objeto numero : 8");
                            f8.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=8;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(9==(vect[fil][col])){System.out.println("Objeto numero : 9");
                            f9.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=9;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(20==(vect[fil][col])){System.out.println("Objeto numero : 10");
                            f10.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=20;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(21==(vect[fil][col])){System.out.println("Objeto numero : 11");
                            f11.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=21;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(22==(vect[fil][col])){System.out.println("Objeto numero : 12");
                            f12.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[fil2][col2]=22;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            compruebaDamaJ2(fil2,col2);
                            turno+=1;
                            
                    }//fin de opcion diagonal der de abajo
                        if((fil2==dix)&&(col2==diy)){//if para diagonal izq de abajo
                            if(1==(vect[fil][col])){System.out.println("Objeto numero : 1");
                            f1.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=1;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(2==(vect[fil][col])){System.out.println("Objeto numero : 2");
                            f2.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=2;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(3==(vect[fil][col])){System.out.println("Objeto numero : 3");
                            f3.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=3;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(4==(vect[fil][col])){System.out.println("Objeto numero : 4");
                            f4.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=4;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(5==(vect[fil][col])){System.out.println("Objeto numero : 5");
                            f5.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=5;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(6==(vect[fil][col])){System.out.println("Objeto numero : 6");
                            f6.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=6;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(7==(vect[fil][col])){System.out.println("Objeto numero : 7");
                            f7.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=7;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(8==(vect[fil][col])){System.out.println("Objeto numero : 8");
                            f8.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=8;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(9==(vect[fil][col])){System.out.println("Objeto numero : 9");
                            f9.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=9;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(20==(vect[fil][col])){System.out.println("Objeto numero : 10");
                            f10.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=20;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(21==(vect[fil][col])){System.out.println("Objeto numero : 11");
                            f11.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=21;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            if(22==(vect[fil][col])){System.out.println("Objeto numero : 12");
                            f12.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[fil2][col2]=22;MatNum[fil][col]=1;MatNum[fil2][col2]=3;                }
                            compruebaDamaJ2(fil2,col2);
                        turno+=1;
                        }//fin del if para diagonal izq de abajo
                        
                        break;
                    case 2://caso de matar
                        System.out.println("Matar......");
                        if((fil2==ddx)&&(col2==ddy)){//if para opcion diagonal der de abajo
                            ddx=devDiagDerAbajoX(fil2, col2);ddy=devDiagDerAbajoY(fil2, col2);
                            if((ddx!=9)&&(ddy!=9)){
                                  System.out.println("diagonal der 2 : x "+ddx+" y "+ddy);
                                  if(miraqueHay(ddx,ddy)==1){//puede matar
                                  mataAj1(fil2,col2);
                                        if(1==(vect[fil][col])){System.out.println("Objeto numero : 1");
                                            f1.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=1;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(2==(vect[fil][col])){System.out.println("Objeto numero : 2");
                                            f2.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=2;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(3==(vect[fil][col])){System.out.println("Objeto numero : 3");
                                            f3.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=3;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(4==(vect[fil][col])){System.out.println("Objeto numero : 4");
                                            f4.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=4;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(5==(vect[fil][col])){System.out.println("Objeto numero : 5");
                                            f5.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=5;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(6==(vect[fil][col])){System.out.println("Objeto numero : 6");
                                            f6.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=6;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(7==(vect[fil][col])){System.out.println("Objeto numero : 7");
                                            f7.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=7;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(8==(vect[fil][col])){System.out.println("Objeto numero : 8");
                                            f8.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=8;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(9==(vect[fil][col])){System.out.println("Objeto numero : 9");
                                            f9.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=9;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(20==(vect[fil][col])){System.out.println("Objeto numero : 10");
                                            f10.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=20;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(21==(vect[fil][col])){System.out.println("Objeto numero : 11");
                                            f11.setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=21;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        if(22==(vect[fil][col])){System.out.println("Objeto numero : 12");
                                            f12 .setPosicion(coordenadaX(ddy), coordenadaY(ddx));vect[fil][col]=0;vect[ddx][ddy]=22;MatNum[fil][col]=1;MatNum[ddx][ddy]=3;                            }
                                        compruebaDamaJ2(ddx,ddy);
                                          turno+=1;  
                                  }//fin del puede matar
                            }//fin de las diagonales correctas
                        }//fin del if fe dia der abajo
                        if((fil2==dix)&&(col2==diy)){//if para diagonal izq de abajo
                            System.out.println("Matar......izquierda....");
                            dix=devDiagIzqAbajoX(fil2, col2);diy=devDiagIzqAbajoY(fil2, col2);
                                if((dix!=9)&&(diy!=9)){    //diagonales correctas
                                    System.out.println("diagonal ixq 2 : x "+dix+" y "+diy);
                                    if(miraqueHay(dix,diy)==1){//puede matar
                                      mataAj1(fil2,col2);
                                      if(1==(vect[fil][col])){System.out.println("Objeto numero : 1");
                                            f1.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=1;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(2==(vect[fil][col])){System.out.println("Objeto numero : 2");
                                            f2.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=2;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(3==(vect[fil][col])){System.out.println("Objeto numero : 3");
                                            f3.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=3;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(4==(vect[fil][col])){System.out.println("Objeto numero : 4");
                                            f4.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=4;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(5==(vect[fil][col])){System.out.println("Objeto numero : 5");
                                            f5.setPosicion(coordenadaX(diy), coordenadaY(dix));;vect[fil][col]=0;vect[dix][diy]=5;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(6==(vect[fil][col])){System.out.println("Objeto numero : 6");
                                            f6.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=6;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(7==(vect[fil][col])){System.out.println("Objeto numero : 7");
                                            f7.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=7;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(8==(vect[fil][col])){System.out.println("Objeto numero : 8");
                                            f8.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=8;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(9==(vect[fil][col])){System.out.println("Objeto numero : 9");
                                            f9.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=9;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(20==(vect[fil][col])){System.out.println("Objeto numero : 10");
                                            f10.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=20;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(21==(vect[fil][col])){System.out.println("Objeto numero : 11");
                                            f11.setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=21;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      if(22==(vect[fil][col])){System.out.println("Objeto numero : 12");
                                            f12 .setPosicion(coordenadaX(diy), coordenadaY(dix));vect[fil][col]=0;vect[dix][diy]=22;MatNum[fil][col]=1;MatNum[dix][diy]=3;                            }
                                      compruebaDamaJ2(dix,diy);
                                    turno+=1;
                                    }//puede matar fin
                                }//fin de las diag correctas
                        }//fin del if para diagonal izq de abajo
                        break;
                }
            }//fin del if de opciones 1 y 2
            
            if(miraqueHay(fil2, col2)==3){
                System.out.println("No puedes tienes un amigo JUG2");
            }//llave de encontro amigo
            
    }//fin del else de 2 jugador
    }//fin del else de las damas
    }

    public void moverDama(int xn, int yn){
                if(11==(vect[fil][col])){System.out.println("Objeto numero : 1");
                fi1.setPosicion(coordenadaX(yn), coordenadaY(xn)); vect[fil][col]=0;vect[xn][yn]=11;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(12==(vect[fil][col])){System.out.println("Objeto numero : 2");
                fi2.setPosicion(coordenadaX(yn), coordenadaY(xn)); vect[fil][col]=0;vect[xn][yn]=12;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(13==(vect[fil][col])){System.out.println("Objeto numero : 3");
                fi3.setPosicion(coordenadaX(yn), coordenadaY(xn)); vect[fil][col]=0;vect[xn][yn]=13;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(14==(vect[fil][col])){System.out.println("Objeto numero : 4");
                fi4.setPosicion(coordenadaX(yn), coordenadaY(xn)); vect[fil][col]=0;vect[xn][yn]=14;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }   
                if(15==(vect[fil][col])){System.out.println("Objeto numero : 5");
                fi5.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=15;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(16==(vect[fil][col])){System.out.println("Objeto numero : 6");
                fi6.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=16;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(17==(vect[fil][col])){System.out.println("Objeto numero : 7");
                fi7.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=17;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(18==(vect[fil][col])){System.out.println("Objeto numero : 8");
                fi8.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=18;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(19==(vect[fil][col])){System.out.println("Objeto numero : 9");
                fi9.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=19;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(30==(vect[fil][col])){System.out.println("Objeto numero : 13");
                fi10.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=30;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(31==(vect[fil][col])){System.out.println("Objeto numero : 11");
                fi11.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=31;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }
                if(32==(vect[fil][col])){System.out.println("Objeto numero : 12");
                fi12.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=32;MatNum[fil][col]=1;MatNum[xn][yn]=2;                }    
                //-----------------------------------------------------------------------------------------------------------------------------------
                            if(1==(vect[fil][col])){System.out.println("Objeto numero : 1");
                            f1.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=1;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(2==(vect[fil][col])){System.out.println("Objeto numero : 2");
                            f2.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=2;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(3==(vect[fil][col])){System.out.println("Objeto numero : 3");
                            f3.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=3;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(4==(vect[fil][col])){System.out.println("Objeto numero : 4");
                            f4.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=4;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(5==(vect[fil][col])){System.out.println("Objeto numero : 5");
                            f5.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=5;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(6==(vect[fil][col])){System.out.println("Objeto numero : 6");
                            f6.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=6;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(7==(vect[fil][col])){System.out.println("Objeto numero : 7");
                            f7.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=7;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(8==(vect[fil][col])){System.out.println("Objeto numero : 8");
                            f8.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=8;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(9==(vect[fil][col])){System.out.println("Objeto numero : 9");
                            f9.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=9;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(20==(vect[fil][col])){System.out.println("Objeto numero : 10");
                            f10.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=20;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(21==(vect[fil][col])){System.out.println("Objeto numero : 11");
                            f11.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=21;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                            if(22==(vect[fil][col])){System.out.println("Objeto numero : 12");
                            f12.setPosicion(coordenadaX(yn), coordenadaY(xn));vect[fil][col]=0;vect[xn][yn]=22;MatNum[fil][col]=1;MatNum[xn][yn]=3;                }
                turno+=1;
    }
    
    public void matarConDama(int xn, int yn){
        
    }
    
    public void eventosDama(int xnu,int ynue){
        if(turno%2==0){//turno jugador 1
        ddx1=devDiagDerAbajoX(fil, col);ddy1=devDiagDerAbajoY(fil, col);//diagonal der #1
        ddx2=devDiagDerAbajoX(ddx1,ddy1);ddy2=devDiagDerAbajoY(ddx1,ddy1);//diagonal der #2
        ddx3=devDiagDerAbajoX(ddx2,ddy2);ddy3=devDiagDerAbajoY(ddx2,ddy2);//diagonal der #3
        
        dix1=devDiagIzqAbajoX(fil, col);diy1 =devDiagIzqAbajoY(fil, col);//diagonal der #1
        dix2=devDiagIzqAbajoX(dix1,diy1);diy2=devDiagIzqAbajoY(dix1,diy1);//diagonal der #2
        dix3=devDiagIzqAbajoX(dix2,diy2);diy3=devDiagIzqAbajoY(dix2,diy2);//diagonal der #2
        
        
        ddx4=devDiagDerArribaX(fil, col);ddy4=devDiagDerArribaY(fil, col);//diagonal der #1
        ddx5=devDiagDerArribaX(ddx4, ddy4);ddy5=devDiagDerArribaY(ddx4, ddy4);//diagonal der #2
        ddx6=devDiagDerArribaX(ddx5, ddy5);ddy6=devDiagDerArribaY(ddx5, ddy5);//diagonal der #3
        
        dix4=devDiagIzqArribaX(fil, col);diy4=devDiagIzqArribaY(fil, col);//diagonal der #1
        dix5=devDiagIzqArribaX(dix4, diy4);diy5=devDiagIzqArribaY(dix4, diy4);//diagonal der #2
        dix6=devDiagIzqArribaX(dix5, diy5);diy6=devDiagIzqArribaY(dix5, diy5);//diagonal der #3
        //para las diagonales hacia abajo
            if ((ddx1 != 9) && (ddy1 != 9)) {
            if(ddx1==xnu&&ddy1==ynue){
                switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia abajo lista para moverse");
            }
         }//fin de las diagonales correctas
            if ((ddx2 != 9) && (ddy2 != 9)) {
             if(ddx2==xnu&&ddy2==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia abajo lista para moverse------2");
            }
         }//fin de las diagonales correctas
            if ((ddx3 != 9) && (ddy3 != 9)) {
             if(ddx3==xnu&&ddy3==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia abajo lista para moverse ----3");
            }
         }//fin de las diagonales correctas
         //-------------------------diagonles izquierdas hacia abajo
                if ((dix1 != 9) && (diy1 != 9)) {
            if(dix1==xnu&&diy1==ynue){
                switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal izquierda hacia abajo lista para moverse");
            }
         }//fin de las diagonales correctas
            if ((dix2 != 9) && (diy2 != 9)) {
             if(dix2==xnu&&diy2==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal izquierda hacia abajo lista para moverse------2");
            }
         }//fin de las diagonales correctas
            if ((dix3 != 9) && (diy3 != 9)) {
             if(dix3==xnu&&diy3==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal izquierda hacia abajo lista para moverse ----3");
            }
         }//fin de las diagonales correctas
        //para las diagonales hacia arriba
        if ((ddx4 != 9) && (ddy4 != 9)) {
            if(ddx4==xnu&&ddy4==ynue){
                switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia arriba lista para moverse");
            }
         }//fin de las diagonales correctas
            if ((ddx5 != 9) && (ddy5 != 9)) {
             if(ddx5==xnu&&ddy5==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia arriba lista para moverse------2");
            }
         }//fin de las diagonales correctas
            if ((ddx6 != 9) && (ddy6 != 9)) {
             if(ddx6==xnu&&ddy6==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia arriba lista para moverse ----3");
            }
         }//fin de las diagonales correctas
            
            if ((dix4 != 9) && (diy4 != 9)) {
            if(dix4==xnu&&diy4==ynue){
                switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal izqui hacia arriba lista para moverse");
            }
         }//fin de las diagonales correctas
            if ((dix5 != 9) && (diy5 != 9)) {
             if(dix5==xnu&&diy5==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal izqui hacia arriba lista para moverse------2");
            }
         }//fin de las diagonales correctas
            if ((dix6 != 9) && (diy6 != 9)) {
             if(dix6==xnu&&diy6==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal izqui hacia arriba lista para moverse ----3");
            }
         }//fin de las diagonales correctas
            
            
        }else{//turno jugador 2
        
        ddx1=devDiagDerArribaX(fil, col);ddy1=devDiagDerArribaY(fil, col);//diagonal der #1
        ddx2=devDiagDerArribaX(ddx1, ddy1);ddy2=devDiagDerArribaY(ddx1, ddy1);//diagonal der #2
        ddx3=devDiagDerArribaX(ddx2, ddy2);ddy3=devDiagDerArribaY(ddx2, ddy2);//diagonal der #3
        
        dix1=devDiagIzqArribaX(fil, col);diy1=devDiagIzqArribaY(fil, col);//diagonal der #1
        dix2=devDiagIzqArribaX(dix1, diy1);diy2=devDiagIzqArribaY(dix1, diy1);//diagonal der #2
        dix3=devDiagIzqArribaX(dix2, diy2);diy3=devDiagIzqArribaY(dix2, diy2);//diagonal der #3
        
        
        ddx4=devDiagDerAbajoX(fil, col);ddy4=devDiagDerAbajoY(fil, col);//diagonal der #1
        ddx5=devDiagDerAbajoX(ddx4,ddy4);ddy5=devDiagDerAbajoY(ddx4,ddy4);//diagonal der #2
        ddx6=devDiagDerAbajoX(ddx5,ddy5);ddy6=devDiagDerAbajoY(ddx5,ddy5);//diagonal der #3
        
        dix4=devDiagIzqAbajoX(fil, col);diy4 =devDiagIzqAbajoY(fil, col);//diagonal der #1
        dix5=devDiagIzqAbajoX(dix4,diy4);diy5=devDiagIzqAbajoY(dix4,diy4);//diagonal der #2
        dix6=devDiagIzqAbajoX(dix5,diy5);diy6=devDiagIzqAbajoY(dix5,diy5);//diagonal der #2
        //para las diagonales hacia arriba
        if ((ddx1 != 9) && (ddy1 != 9)) {
            if(ddx1==xnu&&ddy1==ynue){
                switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia arriba lista para moverse");
            }
         }//fin de las diagonales correctas
            if ((ddx2 != 9) && (ddy2 != 9)) {
             if(ddx2==xnu&&ddy2==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia arriba lista para moverse------2");
            }
         }//fin de las diagonales correctas
            if ((ddx3 != 9) && (ddy3 != 9)) {
             if(ddx3==xnu&&ddy3==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia a lista para moverse ----3");
            }
         }//fin de las diagonales correctas
         //-------------------------diagonles izquierdas hacia arriba
                if ((dix1 != 9) && (diy1 != 9)) {
            if(dix1==xnu&&diy1==ynue){
                switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal izquierda hacia arriba lista para moverse");
            }
         }//fin de las diagonales correctas
            if ((dix2 != 9) && (diy2 != 9)) {
             if(dix2==xnu&&diy2==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal izquierda hacia arriba lista para moverse------2");
            }
         }//fin de las diagonales correctas
            if ((dix3 != 9) && (diy3 != 9)) {
             if(dix3==xnu&&diy3==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal izquierda hacia arriba lista para moverse ----3");
            }
         }//fin de las diagonales correctas
        //para las diagonales hacia abajo
        
        if ((ddx4 != 9) && (ddy4 != 9)) {
            if(ddx4==xnu&&ddy4==ynue){
                switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia abajo lista para moverse");
            }
         }//fin de las diagonales correctas
            if ((ddx5 != 9) && (ddy5 != 9)) {
             if(ddx5==xnu&&ddy5==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia abajo lista para moverse------2");
            }
         }//fin de las diagonales correctas
            if ((ddx6 != 9) && (ddy6 != 9)) {
             if(ddx6==xnu&&ddy6==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal der hacia abajo lista para moverse ----3");
            }
         }//fin de las diagonales correctas
        
            if ((dix4 != 9) && (diy4 != 9)) {
            if(dix4==xnu&&diy4==ynue){
                switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal ixquierda hacia abajo lista para moverse");
            }
         }//fin de las diagonales correctas
            if ((dix5 != 9) && (diy5 != 9)) {
             if(dix5==xnu&&diy5==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal ixquierda hacia abajo lista para moverse------2");
            }
         }//fin de las diagonales correctas
            if ((dix6 != 9) && (diy6 != 9)) {
             if(dix6==xnu&&diy6==ynue){
                 switch(miraqueHay(xnu, ynue)){
                    case 1:
                        moverDama(xnu, ynue);
                        break;
                    case 3:
                        matarConDama(xnu, ynue);
                        break;
                    case 2:
                        System.out.println("la dama tiene un amigo en esa pocicion");
                        break;
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++diagonal ixquierda hacia abajo lista para moverse ----3");
            }
         }//fin de las diagonales correctas
            
        }//fin de las llaves de turnos
        
    }
    
    public boolean esDama(int x, int y){
        boolean ret=false;
                if(1==(vect[x][y])){System.out.println("Objeto numero : 1 is dead");
                ret=f1.getDama();
                }
                if(2==(vect[x][y])){System.out.println("Objeto numero : 2 is dead");
                ret=f2.getDama();
                }
                if(3==(vect[x][y])){System.out.println("Objeto numero : 3 is dead");
                ret=f3.getDama();
                }
                if(4==(vect[x][y])){System.out.println("Objeto numero : 4 is dead");
                ret=f4.getDama();
                }
                if(5==(vect[x][y])){System.out.println("Objeto numero : 5 is dead");
                ret=f5.getDama();
                }
                if(6==(vect[x][y])){System.out.println("Objeto numero : 6 is dead");
                ret=f6.getDama();
                }
                if(7==(vect[x][y])){System.out.println("Objeto numero : 7 is dead");
                ret=f7.getDama();
                }
                if(8==(vect[x][y])){System.out.println("Objeto numero : 8 is dead");
                ret=f8.getDama();
                }
                if(9==(vect[x][y])){System.out.println("Objeto numero : 9 is dead");
                ret=f9.getDama();
                }
                if(20==(vect[x][y])){System.out.println("Objeto numero : 10 is dead");
                ret=f10.getDama();
                }
                if(21==(vect[x][y])){System.out.println("Objeto numero : 11 is dead");
                ret=f11.getDama();
                }
                if(22==(vect[x][y])){System.out.println("Objeto numero : 12 is dead");
                ret=f12.getDama();
                }
                //-----------------------------------------------------------------------------------
                if(11==(vect[x][y])){System.out.println("Objeto numero : 1 is dead");
                ret=fi1.getDama();
                }
                if(12==(vect[x][y])){System.out.println("Objeto numero : 2 is dead");
                ret=fi2.getDama();
                }
                if(13==(vect[x][y])){System.out.println("Objeto numero : 3 is dead");
                ret=fi3.getDama();
                }
                if(14==(vect[x][y])){System.out.println("Objeto numero : 4 is dead");
                ret=fi4.getDama();
                }
                if(15==(vect[x][y])){System.out.println("Objeto numero : 5 is dead");
                ret=fi5.getDama();
                }
                if(16==(vect[x][y])){System.out.println("Objeto numero : 6 is dead");
                ret=fi6.getDama();
                }
                if(17==(vect[x][y])){System.out.println("Objeto numero : 7 is dead");
                ret=fi7.getDama();
                }
                if(18==(vect[x][y])){System.out.println("Objeto numero : 8 is dead");
                ret=fi8.getDama();
                }
                if(19==(vect[x][y])){System.out.println("Objeto numero : 9 is dead");
                ret=fi9.getDama();
                }
                if(30==(vect[x][y])){System.out.println("Objeto numero : 10 is dead");
                ret=fi10.getDama();
                }
                if(31==(vect[x][y])){System.out.println("Objeto numero : 11 is dead");
                ret=fi11.getDama();
                }
                if(32==(vect[x][y])){System.out.println("Objeto numero : 12 is dead");
                ret=fi12.getDama();
                }
                
        return ret;
    }
    public static int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,c11=0,c12=0;
    public static int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0,d8=0,d9=0,d10=0,d11=0,d12=0;
    
    public void compruebaDamaJ1(int x, int y){
         int xx,yy;
        
                if(11==(vect[x][y])){
                if(c1==0){
                xx=fi1.getPocX();yy= fi1.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi1.setDama(true);c1++;System.out.println("ficha endamada 1");
                }
                }
                }
                if(12==(vect[x][y])){
                if(c2==0){
                xx=fi2.getPocX();yy= fi2.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi2.setDama(true);c2++;System.out.println("ficha endamada 2");
                }
                }
                }
                if(13==(vect[x][y])){
                if(c3==0){
                xx=fi3.getPocX();yy= fi3.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi3.setDama(true);c3++;System.out.println("ficha endamada 3");
                }
                }
                }
                if(14==(vect[x][y])){
                if(c4==0){
                xx=fi4.getPocX();yy= fi4.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi4.setDama(true);c4++;System.out.println("ficha endamada 4");
                }
                }
                }
                if(15==(vect[x][y])){
                if(c5==0){
                xx=fi5.getPocX();yy= fi5.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi5.setDama(true);c5++;System.out.println("ficha endamada 5");
                }
                }
                }
                if(16==(vect[x][y])){
                if(c6==0){
                xx=fi6.getPocX();yy= fi6.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi6.setDama(true);c6++;System.out.println("ficha endamada 6");
                }
                }
                }
                if(17==(vect[x][y])){
                if(c7==0){
                xx=fi7.getPocX();yy= fi7.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi7.setDama(true);c7++;System.out.println("ficha endamada 7");
                }
                }
                }
                if(18==(vect[x][y])){
                if(c8==0){
                xx=fi8.getPocX();yy= fi8.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi8.setDama(true);c8++;System.out.println("ficha endamada 8");
                }
                }
                }
                if(19==(vect[x][y])){
                if(c9==0){
                xx=fi9.getPocX();yy= fi9.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi9.setDama(true);c9++;System.out.println("ficha endamada 9");
                }
                }
                }
                if(30==(vect[x][y])){
                if(c10==0){
                xx=fi10.getPocX();yy= fi10.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi10.setDama(true);c10++;System.out.println("ficha endamada 10");
                }
                }
                }
                if(31==(vect[x][y])){
                if(c11==0){
                xx=fi11.getPocX();yy= fi11.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi11.setDama(true);c11++;System.out.println("ficha endamada 11");
                }
                }
                }
                if(32==(vect[x][y])){
                if(c12==0){
                xx=fi12.getPocX();yy= fi12.getPocY();
                if((xx==212&&yy==150)||(xx==337&&yy==150)||(xx==462&&yy==150)||(xx==587&&yy==150)){
                    fi12.setDama(true);c12++;System.out.println("ficha endamada 12");
                }
                }
                }
    }
    public void compruebaDamaJ2(int x, int y){
        int xx,yy;
        
                if(1==(vect[x][y])){
                if(d1==0){
                xx=f1.getPocX();yy= f1.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f1.setDama(true);d1++;System.out.println("ficha endamada --- 1");
                }
                }
                }
                if(2==(vect[x][y])){
                if(d2==0){
                xx=f2.getPocX();yy= f2.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f2.setDama(true);d2++;System.out.println("ficha endamada --- 2");
                }
                }
                }
                if(3==(vect[x][y])){
                if(d3==0){
                xx=f3.getPocX();yy= f3.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f3.setDama(true);d3++;System.out.println("ficha endamada --- 3");
                }
                }
                }
                if(4==(vect[x][y])){
                if(d4==0){
                xx=f4.getPocX();yy= f4.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f4.setDama(true);d4++;System.out.println("ficha endamada --- 4");
                }
                }
                }
                if(5==(vect[x][y])){
                if(d5==0){
                xx=f5.getPocX();yy= f5.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f5.setDama(true);d5++;System.out.println("ficha endamada --- 5");
                }
                }
                }
                if(6==(vect[x][y])){
                if(d6==0){
                xx=f6.getPocX();yy= f6.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f6.setDama(true);d6++;System.out.println("ficha endamada --- 6");
                }
                }
                }
                if(7==(vect[x][y])){
                if(d7==0){
                xx=f7.getPocX();yy= f7.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f7.setDama(true);d7++;System.out.println("ficha endamada --- 7");
                }
                }
                }
                if(8==(vect[x][y])){
                if(d8==0){
                xx=f8.getPocX();yy= f8.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f8.setDama(true);d8++;System.out.println("ficha endamada --- 8");
                }
                }
                }
                if(9==(vect[x][y])){
                if(d9==0){
                xx=f9.getPocX();yy= f9.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f9.setDama(true);d9++;System.out.println("ficha endamada --- 9");
                }
                }
                }
                if(20==(vect[x][y])){
                if(d10==0){
                xx=f10.getPocX();yy= f10.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f10.setDama(true);d10++;System.out.println("ficha endamada --- 10");
                }
                }
                }
                if(21==(vect[x][y])){
                if(d1==0){
                xx=f11.getPocX();yy= f11.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f11.setDama(true);d11++;System.out.println("ficha endamada --- 11");
                }
                }
                }
                if(22==(vect[x][y])){
                if(d12==0){
                xx=f12.getPocX();yy= f12.getPocY();
                if((xx==150&&yy==587)||(xx==275&&yy==587)||(xx==400&&yy==587)||(xx==525&&yy==587)){
                    f12.setDama(true);d12++;System.out.println("ficha endamada --- 12");
                }
                }
                }
    }
    
    public void mataAj2(int x, int y){
                if(1==(vect[x][y])){System.out.println("Objeto numero : 1 is dead");
                f1.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(2==(vect[x][y])){System.out.println("Objeto numero : 2 is dead");
                f2.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(3==(vect[x][y])){System.out.println("Objeto numero : 3 is dead");
                f3.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(4==(vect[x][y])){System.out.println("Objeto numero : 4 is dead");
                f4.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(5==(vect[x][y])){System.out.println("Objeto numero : 5 is dead");
                f5.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(6==(vect[x][y])){System.out.println("Objeto numero : 6 is dead");
                f6.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(7==(vect[x][y])){System.out.println("Objeto numero : 7 is dead");
                f7.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(8==(vect[x][y])){System.out.println("Objeto numero : 8 is dead");
                f8.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;}
                if(9==(vect[x][y])){System.out.println("Objeto numero : 9 is dead");
                f9.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;}
                if(20==(vect[x][y])){System.out.println("Objeto numero : 10 is dead");
                f10.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;}
                if(21==(vect[x][y])){System.out.println("Objeto numero : 11 is dead");
                f11.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;}
                if(22==(vect[x][y])){System.out.println("Objeto numero : 12 is dead");
                f12.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;}
                muertesJ2+=1;
                AudioClip sonido;
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/bomba1.wav"));
                    sonido.play();
    }
    public void mataAj1(int x, int y){
                if(11==(vect[x][y])){System.out.println("Objeto numero : 1 is dead");
                fi1.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(12==(vect[x][y])){System.out.println("Objeto numero : 2 is dead");
                fi2.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(13==(vect[x][y])){System.out.println("Objeto numero : 3 is dead");
                fi3.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(14==(vect[x][y])){System.out.println("Objeto numero : 4 is dead");
                fi4.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(15==(vect[x][y])){System.out.println("Objeto numero : 5 is dead");
                fi5.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(16==(vect[x][y])){System.out.println("Objeto numero : 6 is dead");
                fi6.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(17==(vect[x][y])){System.out.println("Objeto numero : 7 is dead");
                fi7.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(18==(vect[x][y])){System.out.println("Objeto numero : 8 is dead");
                fi8.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(19==(vect[x][y])){System.out.println("Objeto numero : 9 is dead");
                fi9.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(30==(vect[x][y])){System.out.println("Objeto numero : 10 is dead");
                fi10.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(31==(vect[x][y])){System.out.println("Objeto numero : 11 is dead");
                fi11.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                if(32==(vect[x][y])){System.out.println("Objeto numero : 12 is dead");
                fi12.setEstado(false);vect[x][y]=0;MatNum[x][y]=1;                }
                muertesJ1+=1;
                AudioClip sonido;
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/bomba2.wav"));
                    sonido.play();
    }
    
    public int coordenadaX ( int y){
        int punto=0;
        if(y==0){punto = 150;}if(y==1){punto = 212;}if(y==2){punto = 275;}if(y==3){punto = 337;}if(y==4){punto = 400;}        if(y==5){punto = 462;}if(y==6){punto = 525;}if(y==7){punto = 587;}        
        return punto;
    }
    public int coordenadaY (int  x){
        int punto=0;
        if(x==0){punto = 150;}if(x==1){punto = 212;}if(x==2){punto = 275;}if(x==3){punto = 337;}if(x==4){punto = 400;}if(x==5){punto = 462;}if(x==6){punto = 525;}if(x==7){punto = 587;}        
        return punto;
    }
    
    public int devDiagDerArribaX(int x, int y){
        int xx=0;
        xx=x-1;
        if(xx<0){xx=9;}//si se pasa
        return xx;
    }
    public int devDiagDerArribaY(int x, int y){
        int xx=0;
        xx=y+1;
        if(xx>=8){xx=9;}//si se pasa
        return xx;
    }
    public int devDiagIzqArribaX(int x, int y){
        int xx=0;
        xx=x-1;
        if(xx<0){xx=9;}//si se pasa
        return xx;
    }
    public int devDiagIzqArribaY(int x, int y){
        int xx=0;
        xx=y-1;
        if(xx<0){xx=9;}//si se pasa
        return xx;
    }
    
    
    public int devDiagDerAbajoX(int x, int y){
        int xx=0;
        xx=x+1;
        if(xx>=8){xx=9;}
        return xx;
    }
    public int devDiagDerAbajoY(int x, int y){
        int xx=0;
        xx=y+1;
        if(xx>=8){xx=9;}
        return xx;
    }
    public int devDiagIzqAbajoX(int x, int y){
        int xx=0;
        xx=x+1;
        if(xx>=8){xx=9;}
        return xx;
    }
    public int devDiagIzqAbajoY(int x, int y){
        int xx=0;
        xx=y-1;
        if(xx<0){xx=9;}
        return xx;
    }
    
    public boolean pulsoBien1(int fi, int colu){
        boolean ret=false;
        if(MatNum[fi][colu]==2){ret=true;}
        return ret;
    }
    public boolean pulsoBien2(int fi, int colu){
        boolean ret=false;
        if(MatNum[fi][colu]==3){    ret=true;}
        return ret;
    }
    public int devuelveFila(int xx){
        int ret=0;
        if(xx >= 150 && xx < 212 ){ret=0;}
        if(xx >= 212 && xx < 275 ){ret=1;}
        if(xx >= 275 && xx < 337 ){ret=2;}
        if(xx >= 337 && xx < 400 ){ret=3;}
        if(xx >= 400 && xx < 462 ){ret=4;}
        if(xx >= 462 && xx < 525 ){ret=5;}
        if(xx >= 525 && xx < 587 ){ret=6;}
        if(xx >= 587 && xx < 650 ){ret=7;}
        return ret;
    }
    public int devuelveColumna(int xx){
        int ret=0;
        if (xx >= 150 && xx < 212) {
            ret = 0;
        }
        if (xx >= 212 && xx < 275) {
            ret = 1;
        }
        if (xx >= 275 && xx < 337) {
            ret = 2;
        }
        if (xx >= 337 && xx < 400) {
            ret = 3;
        }
        if (xx >= 400 && xx < 462) {
            ret = 4;
        }
        if (xx >= 462 && xx < 525) {
            ret = 5;
        }
        if (xx >= 525 && xx < 587) {
            ret = 6;
        }
        if (xx >= 587 && xx < 650) {
            ret = 7;
        }
        return ret;
    }
        public void IniciaJuego(){
            System.out.println("primer vez -2 ");
            
        }
    
}
