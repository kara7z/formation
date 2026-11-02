package com.youcode.formation.exo2;

import org.springframework.stereotype.Service;

@Service
public class CommandeExpressService implements CommandeService {

  @Override
  public String traiter(String reference) {
    return "Commande " + reference + " : livraison express en 24h.";
  }
}
