/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mainfabricaesportiva;

/**
 *
 * @author 55649
 */
public class MainFabricaEsportiva {

    public static void main(String[] args) {
        IFabricaProduto nike = new Nike();
        IProduto brasil = nike.cria_produto();
        brasil.exibe_info_time(); 
        
        IFabricaProduto adidas = new Adidas();
        IProduto flamengo = adidas.cria_produto();
        flamengo.exibe_info_time();
        
        IFabricaProduto puma = new Puma();
        IProduto botafogo = puma.cria_produto();
        botafogo.exibe_info_time();
        
        IFabricaProduto umbro = new Umbro();
        IProduto fluminense = umbro.cria_produto();
        fluminense.exibe_info_time();
        
        IFabricaProduto kappa = new Kappa();
        IProduto vasco = kappa.cria_produto();
        vasco.exibe_info_time();
        
        
        
        
        
    }
}
