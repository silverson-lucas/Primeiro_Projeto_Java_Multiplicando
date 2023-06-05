package com.mycompany.storeproject;
import java.util.Scanner;
class StoreItems {
 String F = "CamisaPolo";
 String G = "CamisaRegata";
 String H = "VestidoLongo";
 String I = "Cropped";
 String J = "Shortsaia";
 String NomePeca;
 
 float Q;
 int A = 30;
 int B = 15;
 int C = 70;
 int D = 65;
 int E = 60;
 
 Scanner LerQTD = new Scanner(System.in);
 Scanner LerNome = new Scanner (System.in);
 Scanner GuestMore = new Scanner(System.in);
 
 public void PegarQtd(){
     System.out.println("insira o número de peças");
     this.Q = LerQTD.nextInt();}
 
 public void PegarNome(){
     System.out.println("insira o nome da peça");
     NomePeca = LerNome.next();
      if (NomePeca.equals(F) || NomePeca.equals(G) || NomePeca.equals(H) || NomePeca.equals(I) || NomePeca.equals(J)){
     System.out.println("ok, objetos recebidos");
      }else{
          System.out.println("Dados não encontrados no sistema");
      }
    } public void Multiplicando(){
        if (NomePeca.equals(F)){
            Q = Q * A;
            System.out.println("\no total em reais é de:" + Q + ",00" + "R$");
        }else if (NomePeca.equals(G)){
            Q = Q * B;
               System.out.println("\no total em reais é de:" + Q + ",00" + "R$");
        }else if (NomePeca.equals(H)){
            Q = Q * C;
              System.out.println("\no total em reais é de:" + Q + ",00" + "R$");
        }else if (NomePeca.equals(I)){
            Q = Q * D;
            System.out.println("\no valor total em reais é de:" + Q + ",00" + "R$");
        }else if (NomePeca.equals(J)){
            Q = Q * E;
            System.out.println("\no valor total em reais é de:" + Q + ",00" + "R$");
        }else{
            System.out.println("valor incorreto");
        }
    } 
}
        


