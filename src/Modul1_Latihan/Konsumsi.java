/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1_Latihan;

/**
 *
 * @author Alfin Arif
 */
public class Konsumsi<M, I> {
    private M m;
    private I i;
    
    public M getM(){
        return m;
    }
    
    public I getI(){
        return i;
    }
    
    public void setKonsumsi (M makanan, I minuman){
        this.m = makanan;
        this.i = minuman;
    }
}
