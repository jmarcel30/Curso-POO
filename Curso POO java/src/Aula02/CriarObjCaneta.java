package Aula02;

public class CriarObjCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.modelo = "Bic";
        c1.carga = 100;
        c1.status();
        c1.rabiscar();
        

        Caneta c2 = new Caneta();

        c2.cor = "Preta";
        c2.ponta = 0.8f;
        c2.tampar();
        c2.modelo = "GIF";
        c2.carga = 90;
        c2.status();
        c2.rabiscar();

}
}
