/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA02;

/**
 *
 * @author STEVAOSEVERORODRIGUE
 */
public class Veiculo {
    private String marca;
    
    public Veiculo(String marca){
        this.marca = marca;
    }
    
    public void exibirMarca(){
        System.out.println("Marca do veiculo: " + marca);
    }
}
