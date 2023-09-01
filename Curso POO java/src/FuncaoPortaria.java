package Portaria;

public class FuncaoPortaria {
    
    String porteiro;
    String nomeVisita;
    int apMorador;
    boolean liberado;
    String horaEntrada;
    String horaSaida;

    
    void statusVisita(){
        System.out.println("Porteiro de serviço:"+this.porteiro);
        System.out.println("Nome da visita:"+ this.nomeVisita);
        System.out.println("Apartamento solicitado: ap "+this.apMorador);
        System.out.println("Hora da entrada:"+this.horaEntrada+"Horas");
        
    }
    void saidaVisita(){
      if(horaSaida == ""){
        System.out.println("A visita continua ativa");
      } else{
        System.out.println("A visita está inativa saida as:" +this.horaSaida);
      }
    
    }

    void liberarVisita(){
        if(liberado == true){ 
           
            System.out.println("Visita está liberada");

        }

    }


    void barrarVisita(){
        if(liberado ==  false){
            
            System.out.println("Visita não liberada");

        }

    }
}
