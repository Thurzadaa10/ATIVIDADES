/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args){
        
     Endereco e = new Endereco();
     e.setBairro("CENTRO");
     e.setCidade("OURINHOS");
     e.setLogradouro("RUA UM");
     e.setNumero("2");
     
     Cliente c = new Cliente();
     c.setCpf("23456");
     c.setEndereco(e);
     c.setNome("ze");
     
        JOptionPane.showMessageDialog(null, c.getEndereco().getLogradouro());
        
    }
}
