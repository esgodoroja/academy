package md.orange.academy.example.patterns.creational.abstractfactory;

import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Commander;
import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Dragon;
import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Soldier;
import md.orange.academy.example.patterns.creational.abstractfactory.ally.AllyWarriorFactory;

/**
 * AbstractFactoryExample is client. The class uses the factory to generate a family of related
 * objects.
 */
public class AbstractFactoryExample {

  public static void main(String[] args) {
    WarriorFactory warriorFactory = new AllyWarriorFactory();
    Commander allyCommander = warriorFactory.getCommander();
    Dragon allyDragon = warriorFactory.getDragon();
    Soldier allySoldier = warriorFactory.getSoldier();

    System.out.println("= Soldier = ");
    System.out.println("allySoldier.walk() = " + allySoldier.walk());
    System.out.println("allySoldier.attack() = " + allySoldier.attack());
    System.out.println("allySoldier.protect() = " + allySoldier.protect());

    System.out.println("= Commander = ");
    System.out.println("allyCommander.promote() = " + allyCommander.promote());
    System.out.println("allyCommander.sendOrder() = " + allyCommander.sendOrder());
    System.out.println("allyCommander.attack() = " + allyCommander.attack());

    System.out.println("= Dragon = ");
    System.out.println("allyDragon.fly() = " + allyDragon.fly());
    System.out.println("allyDragon.attack() = " + allyDragon.attack());
  }

}
