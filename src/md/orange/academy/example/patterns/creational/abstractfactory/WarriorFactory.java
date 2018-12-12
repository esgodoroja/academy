package md.orange.academy.example.patterns.creational.abstractfactory;


import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Commander;
import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Dragon;
import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Soldier;

/**
 * This is an interface for the concrete factory classes that will generate new sets of
 * related objects. We can call it Abstract Factory
 */
public interface WarriorFactory {

  Commander getCommander();

  Dragon getDragon();

  Soldier getSoldier();

}
