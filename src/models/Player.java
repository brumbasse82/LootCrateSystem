package models;
import exceptions.NegativeAmountException;
import java.util.ArrayList;

public class Player {
    private String username;
    private int credits;
    private ArrayList<String> inventory = new ArrayList<>();

    // Konstruktør
    public Player(String username, int credits) {
        this.username = username;
        this.credits = credits;
    }

    // Tilføjer credits
    public void addCredits(int amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Du må ikke have negative credits!");
        }
        else {
            credits += amount;
        }
    }

    // Fjerner credits
    public void removeCredits(int amount) {
        credits -= amount;
    }

    // Getters
    public int getCredits() {
        return credits;
    }

    public String getUsername() {
        return username;
    }

    // Tilføjer items
    public void addItem(String item) {
        inventory.add(item);
    }

    // Viser inventory
    public void showInventory() {
        String header = "=====" + getUsername().toUpperCase() + "'S INVENTORY======";
        System.out.println("");
        System.out.println(header);
        for (String item : inventory) {
            System.out.println(item);
        }
        // Loop til at udskrive lige så mange "=", som der er tegn i headeren
        for (int i = 0; i < header.length(); i++) {
            System.out.print("=");
        }
    }

    public boolean removeItem(String item){
        return inventory.remove(item);
    }
}
