package Portaria;

public class ObjetoPortaria {
    public static void main(String[] args) {
        FuncaoPortaria port = new FuncaoPortaria();

        port.porteiro = "José Marcel";
        port.nomeVisita = "Carolina Murari";
        port.apMorador = 120;
        //port.liberado = true;
        port.horaEntrada = "16:52";
        port.horaSaida = "16:56";
        port.statusVisita();
        port.liberarVisita();
        port.saidaVisita();
    }
}
