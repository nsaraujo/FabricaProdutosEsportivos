/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mainfabricaesportiva;

/**
 *
 * @author 55649
 */
public class Nike implements IFabricaProduto{


    @Override
    public IProduto cria_produto() {
        return new Brasil("Brasil");
    }

    
    
    
}
