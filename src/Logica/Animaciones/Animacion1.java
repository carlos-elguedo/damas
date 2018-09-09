/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Animaciones;

import Logica.Cliks;
import static java.lang.Thread.sleep;

/**
 *
 * @author USER
 */
public class Animacion1 extends Cliks implements Runnable{
    Thread obj = new Thread(this);
    int xx,yy,xx2,yy2;
    public Animacion1(int x, int y, int x2, int y2){
        this.xx=x;
        this.yy=y;
        obj.start();
    }
    @Override
    public void run(){
        try{
        sleep(2000);
        System.out.println("dos segundos");
        }catch(InterruptedException e){
                        System.out.println("Se interrumpio");}//fin catch
    }
}
