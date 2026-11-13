import models.Player;
import models.LootCrate;
import exceptions.NegativeAmountException;
import exceptions.NotEnoughCreditsException;
import exceptions.PlayerNotFoundException;

public class LootCrateSystem {
    public static void main(String [] args) {

        // Opretter objekter
        Player lucas = new Player("Lucas", 500);
        LootCrate crate = new LootCrate("Rare", 200, "Thors Hammer");
        LootCrate crate1 = new LootCrate("Common", 100, "Wooden Sword");

        // Try catch
        try {
            crate.open(lucas);
            crate1.open(lucas);
        } catch (NotEnoughCreditsException e) {
            System.out.println(e.getMessage());
        }

        lucas.removeItem("Wooden Sword");
        lucas.showInventory();
        }
}