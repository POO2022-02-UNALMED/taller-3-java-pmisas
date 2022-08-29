/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3.televisores;

/**
 *
 * @author paula
 */
public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;
    
    //Constructor
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.precio = 500;
        this.volumen = 1;
        TV.numTV++;
    }
    
    //Metodos
    
    public static void setNumTV(int numTV){       
        TV.numTV = numTV;
    }
    
    public static int getNumTV(){
        return TV.numTV;
    }
    
    public void turnOn(){
        this.estado = true;
    }
    
    public void turnOff(){
        this.estado = false;
    }
    
    public void canalUp(){
        if (this.estado ){
            if (this.canal<120){
                this.canal++;
            }
        }
    }
    
    public void canalDown (){
        if (this.estado){
            if (this.canal>1){
                this.canal--;
            }
        }
    }

    public void volumenUp(){
        if (this.estado){
            if (this.volumen<7){
                this.volumen++;
            }
        }
    }
    
    public void volumenDown (){
        if (this.estado){
            if (this.volumen>0){
                this.volumen--;
            }
        }
    }   
    
    //get y set
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    
    public Marca getMarca(){
        return this.marca;
    }    
    
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public void setVolumen(int volumen){
        if (volumen<=7 && volumen >=0)
        this.volumen = volumen;
    }
    
    public int getVolumen(){
        return this.volumen;
    }
    
    public void setCanal(int canal){
        if (canal <= 120 && canal>=1){
            if (this.estado == true){
                this.canal = canal; 
            }   
        }    
    }
    
    public int getCanal(){
        return this.canal;
    }
    
    public boolean getEstado(){
        return this.estado;
    }
    
    public void setControl(Control control){
        this.control= control;
    }
    
    public Control getControl(){
        return this.control;
    }
    
   
}

