
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Exemplo1 {
    public static void main(String[] args) {
        String nome;
        int idade;
         
      nome = JOptionPane.showInputDialog("Digite seu Nome");
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
      
      JOptionPane.showMessageDialog( null, "Boa Tarde,"+ nome + "\n" + "Voce Possui" + idade + "anos");
        
    }
}
