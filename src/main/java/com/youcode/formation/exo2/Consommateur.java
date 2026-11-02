package com.youcode.formation.exo2;

import org.springframework.stereotype.Component;

@Component
public class Consommateur {

  private final CommandeService commandeService;

  public Consommateur(CommandeService commandeService) {
    this.commandeService = commandeService;
  }

  public String traiter(String reference) {
    return commandeService.traiter(reference);
  }
}
