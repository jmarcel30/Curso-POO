package Aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    

    /*Metodos*/
    void status(){
        System.out.println("O modelo da caneta é: "+ this.modelo);
        System.out.println("A cor da caneta é:  " + this.cor);
        System.out.println("A ponta da caneta é: " + this.ponta);
        System.out.println("A carga total da caneta é de: " +  this.carga +"%");
        System.out.println("Está tampada " + this.tampada) ;
        
            
        }   

    void rabiscar(){
        if(tampada == true){
            System.out.println("ERRO");
        } else {
            System.out.println("Estou escrendo");
        }

    }

    void tampar(){
        this.tampada = true;
        if(tampada == true){
            System.out.println("A caneta está tampada");
        }

    }

    void destampar(){
        this.tampada = false;
        if(tampada == false){
            System.out.println("A caneta está destampada");
        }

    }

}
