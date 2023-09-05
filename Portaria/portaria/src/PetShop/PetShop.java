package PetShop;

public class PetShop {
    String nomeCachorro;
    String nomeDono;
    boolean buscarCachorro;
    boolean banhoCachorro;
    boolean tosaCachorro;
    int valorBusca;
    int valorBanho;
    int valorTosa;
    int valorTotal;




void buscaDog(){
   if(buscarCachorro == true){
    System.out.println("Indo buscar o cachorro");
    valorBusca = 30;

   } else{
    valorBusca = 0;
    System.out.println("Não precisa buscar o cahorro");
   }
}

void banhoDog(){
    if(banhoCachorro == true){
        System.out.println("Pode dar banho no Cachorro");
        valorBanho = 50;
    } else{
        valorBanho = 0;
        System.out.println("Não prescia da banho no cachorro");
    }
}

void tosaDog(){
   if(tosaCachorro == true){
    System.out.println("Pode  tosar o cachorro");
    valorTosa = 50;
   } else{
    valorTosa = 0;
    System.out.println("Não precisa tosar cachorro");
   }
}

void valorTotal(){
    valorTotal = valorBusca + valorBanho + valorTosa;
    System.out.println("O valor total dos serviços e de R$ "+ this.valorTotal);
}

void StatusServiço(){
    System.out.println("Nome do dono:"+this.nomeDono);
    System.out.println("Nome do cachorro:"+this.nomeCachorro);
}
}
