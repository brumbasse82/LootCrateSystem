package models;
import exceptions.NotEnoughCreditsException;

public class LootCrate {
    private String crateId;
    private int cratePrice;
    private String itemDrop;

    // Konstruktør
    public LootCrate(String crateId, int cratePrice, String itemDrop) {
        this.crateId = crateId;
        this.cratePrice = cratePrice;
        this.itemDrop = itemDrop;
    }

    // Åben crate
    public void open(Player player) throws NotEnoughCreditsException {
        if (player.getCredits() < cratePrice) {
            throw new NotEnoughCreditsException("Du har ikke nok credits!");
        } else {
            player.removeCredits(cratePrice);
            System.out.println(player.getUsername() + " er i gang med at åbne en " + crateId +  " crate");
            player.addItem(itemDrop);
            System.out.println(player.getUsername() + " har lige åbnet en/et " + itemDrop + "!");
        }
    }
}

