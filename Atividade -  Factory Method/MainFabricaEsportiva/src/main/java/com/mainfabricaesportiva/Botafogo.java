/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mainfabricaesportiva;

/**
 *
 * @author 55649
 */
public class Botafogo implements IProduto{
    private String time;
    
    public Botafogo(String time){
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void exibe_info_time() {
        System.out.println("Camisa Puma do " + time);
    }
    
    
}
