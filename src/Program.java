import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        PetClinic petClinic = new PetClinic();
        Client client1 = new Client("Петя", "Камушкин");
        Client client2 = new Client("Дося", "Поливалкина");
        Client client3 = new Client("Джимми", "Виноград");
        Client client4 = new Client("Валера", "Перепелкин");

        Pet pet1 = new Pet("Собака-улыбака", 57, "сучка");
        Pet pet2 = new Pet("Мышъ-гашишъ", 1, "так сразу и не разберешь");
        Pet pet3 = new Pet("Саня чык-чырык", 67, "усы");


        petClinic.addClient(client1);
        petClinic.addClient(client2);
        petClinic.addClient(client3);

        petClinic.addPetToClient(client1, pet1);
        petClinic.addPetToClient(client2, pet2);
        petClinic.addPetToClient(client3, pet3);
        petClinic.addPetToClient(client3, pet2);
        petClinic.addPetToClient(client3, pet1);
        petClinic.addPetToClient(client4, pet1);
        petClinic.addPetToClient(client4, pet3);


        System.out.println();

        petClinic.getAllClients();



    }
}
