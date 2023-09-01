package Pratica;

public class Portaria {
    String nomePorteiro;
    String nomeVisita;
    int localVisita;
    boolean liberada;
    String horaEntrada;
    String horaSaida;
    boolean statusVisita; 


    void entradaLiberada(){
        System.out.println("Entrada Liberada");
        }
    
    void entradaNegada(){
        System.out.println("Entrada Proibida");
    }
            
        




    

    void statusVisita(){
        System.out.println("O Porteiro "+ this.nomePorteiro);
        System.out.println("Está com pessoa de nome:" +this.nomeVisita+ " na portaria");
      

    }


}
