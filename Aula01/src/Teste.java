
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Teste {
    public static void main(String[] args) {
         
     int num1;
     int num2;
     int resposta;
     
       num1= Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));
        
       num2= Integer.parseInt(JOptionPane.showInputDialog("Digite Outro Numero"));
      
        resposta =(num1 * num2);
        
        JOptionPane.showMessageDialog(null,"Sua resposta é :" +resposta);
        
        
         
       
        
    }
}
