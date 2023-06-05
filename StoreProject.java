//Sisteminha que simula uma loja de roupas,voltado para o atendente, onde ele insere o tipo da roupa e a quantidade e o sistema calcula o total das peças
//Versão 0.0.1

package com.mycompany.storeproject;
public class StoreProject {
//Foi instanciado um objeto S1 da classe StoreItems 
    public static void main(String[] args) {
        System.out.println("Nome das peças:" + "\nCamisaPolo - 30,00 R$" + "\nCamisaRegata - 15,00 R$" + "\nVestidoLongo 70,00 R$" + "\nCropped - 65,00 R$" + "\nShortsaia - 60,00R$");
        StoreItems S1 = new StoreItems();
        S1.PegarQtd();
        S1.PegarNome();
        S1.Multiplicando();
        
        
    }
}
