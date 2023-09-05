package PetShop;

public class ServicoPet {
    public static void main(String[] args) {
        PetShop pet = new PetShop();

        pet.nomeCachorro = "Bob";
        pet.nomeDono = "Carolina";
        pet.buscarCachorro = false;
        pet.banhoCachorro = true;
        pet.tosaCachorro = false;

        pet.StatusServiço();
        pet.buscaDog();
        pet.banhoDog();
        pet.tosaDog();
        pet.valorTotal();
}
}
