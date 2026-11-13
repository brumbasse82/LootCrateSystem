# LootCrate System

## Om programmet
Spillere kan bruge credits på at åbne forskellige crates og modtage genstande. Spillernes credits administreres automatisk, og de genstande, de modtager, gemmes i deres inventory.

## Features
- Oprettelse af spillere med brugernavn og startcredits.
- Tilføjelse og fjernelse af credits.
- Kontrol af spillerens credit-balance.
- Oprettelse af LootCrates med ID, pris og item drop.
- Åbning af LootCrates ved brug af credits.
- Fratrækning af credits ved åbning af crates.
- Tilføjelse af genstande til spillerens inventory.
- Visning af spillerens inventory.
- Fjernelse af specifikke genstande fra inventory.
- Kontrol af, om en genstand findes i inventory.
- Håndtering af exceptions:
  - `NotEnoughCreditsException`
  - `NegativeAmountException`
  - `PlayerNotFoundException`
