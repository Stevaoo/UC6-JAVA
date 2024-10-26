/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AULA02;

/**
 *
 * @author STEVAOSEVERORODRIGUE
 */
public class Carro {
   private String NomeDoCarro;
   private String CorDoCarro;
   private String Placa;
   private int Cavalos;
   private boolean carro;
   
   public Carro (String NomeDoCarro, String CorDoCarro, String Placa, int Cavalos, boolean carro){
       this.NomeDoCarro = NomeDoCarro;
       this.CorDoCarro = CorDoCarro;
       this.Placa = Placa;
       this.Cavalos = Cavalos;
       this.carro = carro;
   }
   
   public void Garagem () {
       System.out.println(
       "\n Bem Vindo a Garagem do Tevinho" + 
        "\n Nome do Veiculo:  " + NomeDoCarro + 
        "\n Cor do Veiculo:  " + CorDoCarro + 
        "\n Placa do Veiculo:  " + Placa + 
         "\n Cavalos do Veiculo:  " + Cavalos);
   }
   
   public void novoOUnao(){
       if(carro == true){
           System.out.println("Carro " + NomeDoCarro + " Esta novo!!!");
       } else {
           System.out.println("O carro esta Velhooo");
       }
   }
}
