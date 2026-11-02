package com.youcode.formation.runner;

import com.youcode.externe.AuditExterne;
import com.youcode.formation.exo2.Consommateur;
import com.youcode.formation.exo4.CompteurPrototype;
import com.youcode.formation.exo4.CompteurSingleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

  private final ApplicationContext applicationContext;
  private final Consommateur consommateur;
  private final AuditExterne auditExterne;

  public DemoRunner(ApplicationContext applicationContext, Consommateur consommateur,
      AuditExterne auditExterne) {
    this.applicationContext = applicationContext;
    this.consommateur = consommateur;
    this.auditExterne = auditExterne;
  }

  @Override
  public void run(String... args) {
    System.out.println("=== Exercice 2 : une interface, deux implémentations ===");
    System.out.println(consommateur.traiter("CMD-001"));

    System.out.println("=== Exercice 3 : bean externe ===");
    System.out.println(auditExterne.info());

    System.out.println("=== Exercice 4 : singleton vs prototype ===");
    CompteurSingleton singleton1 = applicationContext.getBean(CompteurSingleton.class);
    CompteurSingleton singleton2 = applicationContext.getBean(CompteurSingleton.class);
    System.out.printf("singleton -> id1=%s, id2=%s, == %s%n",
        singleton1.getId(), singleton2.getId(), singleton1 == singleton2);

    CompteurPrototype prototype1 = applicationContext.getBean(CompteurPrototype.class);
    CompteurPrototype prototype2 = applicationContext.getBean(CompteurPrototype.class);
    System.out.printf("prototype -> id1=%s, id2=%s, == %s%n",
        prototype1.getId(), prototype2.getId(), prototype1 == prototype2);

    System.out.println("Utiliser un prototype lorsqu'on a besoin d'une nouvelle instance "
        + "avec un état indépendant à chaque demande du bean.");
  }
}
