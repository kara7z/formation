package com.youcode.formation.exo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CommandeStandardService implements CommandeService {

  @Override
  public String traiter(String reference) {
    return "Commande " + reference + " : livraison standard en 5 jours.";
  }
}
