import com.sun.istack.internal.NotNull;

import java.util.*;

public class PetClinic {
    private String name;

    Map<Client, HashSet<Pet>> clients = new HashMap<>();


    public void addClient(Client client) {

        if (clients.containsKey(client)) {
            System.out.println("Клиент " + client.getLastName() + " " + client.getFirstName() + " уже есть в базе.");
        } else {
            clients.put(client, new HashSet<Pet>());
            System.out.println("Клиент " + client.getLastName() + " " + client.getFirstName() + " добавлен в базу.");
        }


    }

    public void addPetToClient(Client client, Pet pet) {

        if (!clients.containsKey(client)) {
            addClient(client);
        }


        if (clients.get(client).contains(pet)) {
            System.out.println("Животное " + pet.getName() + " уже есть у клиента.");
        } else {
            clients.get(client).add(pet);
            System.out.println("Животное " + pet.getName() + " добавлено клиенту " + client.getFirstName() + " " + client.getLastName() + ".");
        }


    }

    public void getAllClients() {


        int i = 0;
        for (Map.Entry<Client, HashSet<Pet>> entry : clients.entrySet()) {
            Client client = entry.getKey();
            HashSet<Pet> pets = entry.getValue();
            System.out.print(client.getFirstName() + " " + client.getLastName() + " (");
            for (Pet pet : pets) {
                if (i == pets.size() - 1) {
                    System.out.print(pet.getName());
                } else {
                    System.out.print(pet.getName() + ", ");
                }
                i++;
            }
            System.out.print(")");
            System.out.println();
            i = 0;
        }
    }


}

