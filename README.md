## LootCrateSystem

## Om programmet
Spillere kan bruge credits på at åbne forskellige crates og modtage genstande. Spillernes credits administreres automatisk, og de genstande, de modtager, gemmes i deres inventory.

## Features
- Oprettelse af spillere med brugernavn og startcredits.
- Tilføjelse og fjernelse af credits vha. removeCredits og addItems.
- Kontrol af spillerens credit-balance med exceptions.
- Oprettelse af LootCrates med ID, pris og item drop.
- Åbning af LootCrates ved brug af credits.
- Fratrækning af credits ved åbning af crates med open metoden.
- Tilføjelse og fjernelse af genstande til spillerens inventory med addItem og removeItem metoderne.
- Visning af spillerens inventory med showInventory metoden.
- Kontrol af, om en genstand findes i inventory ved at lave showInventory om til boolean i stedet for void.
- Håndtering af exceptions:
  - `NotEnoughCreditsException`
  - `NegativeAmountException`
  - `PlayerNotFoundException`
