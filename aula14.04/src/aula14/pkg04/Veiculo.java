/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14.pkg04;

/**
 *
 * @author Aluno
 */
public class Veiculo {
   private String modelo;
   private String marca;
   private double valor;
   private boolean novo;
   
   public String getModelo(){
       return modelo;
   }
   
   public void setModelo(String Modelo){
       this.modelo = modelo;
       
   }
   
   public String getMarca(){
       return marca;
   }
   
   public void setMarca(String Marca){
       this.marca = marca;
   }
   
   public double getValor(){
       return valor;
   }
   
   public void setValor(double valor){
       this.valor = valor;
   }
   
   public boolean isNovo(){
       return novo;
   }
   
   public void setNovo(boolean novo){
       this.novo = novo;
   }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
