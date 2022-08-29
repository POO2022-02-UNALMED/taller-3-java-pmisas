/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3.televisores;

/**
 *
 * @author paula
 */
public class Control {
    private TV tv;
    
    public void turnOff(){
        this.tv.turnOff();
    }
    
    public void turnOn(){
        this.tv.turnOn();
    }

    public void volumenUp(){
        this.tv.volumenUp();
    }
    
    public void volumenDown(){
        this.tv.volumenDown();
    }    
    
    public void canalUp(){
        this.tv.canalUp();
    }
    
    public void canalDown (){
        this.tv.canalDown();
    }
    
    public void setCanal(int canal){
        this.tv.setCanal(canal);
    }   
    
    public void enlazar(TV tv){
        this.tv = tv;
        this.tv.setControl(this);
    }
    
    public void setTv(TV tv){
        this.tv=tv;
    }
    
    public TV getTv(){
        return this.tv;
    }
    
}

