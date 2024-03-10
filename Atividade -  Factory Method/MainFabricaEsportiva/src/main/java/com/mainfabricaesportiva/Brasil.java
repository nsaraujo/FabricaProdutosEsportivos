/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mainfabricaesportiva;


/**
 *
 * @author 55649
 */
public class Brasil implements IProduto{
    private String time;
    
    public Brasil(String time){
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
        System.out.println("Camisa Nike do " + time);
    }


}
