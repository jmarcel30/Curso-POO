package Portaria;

public class FuncaoPortaria {
    
   public String porteiro;
   public String nomeVisita;
   private int apMorador;
   public boolean liberado;
   protected String horaEntrada;
   protected  String horaSaida;

    
    public void statusVisita(){
        System.out.println("Porteiro de serviço:"+this.porteiro);
        System.out.println("Nome da visita:"+ this.nomeVisita);
        System.out.println("Apartamento solicitado: ap "+this.apMorador);
        System.out.println("Hora da entrada:"+this.horaEntrada+"Horas");
        
    }
    protected void saidaVisita(){
      if(horaSaida == ""){
        System.out.println("A visita continua ativa");
      } else{
        System.out.println("A visita está inativa saida as:" +this.horaSaida);
      }
    
    }

    protected void liberarVisita(){
        if(liberado == true){ 
           
            System.out.println("Visita está liberada");

        }

    }


    public void barrarVisita(){
        if(liberado ==  false){
            
            System.out.println("Visita não liberada");

        }

    }
}
