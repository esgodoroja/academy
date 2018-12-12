package md.orange.academy.example.patterns.creational.abstractfactory.ally;

import md.orange.academy.example.patterns.creational.abstractfactory.WarriorFactory;
import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Commander;
import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Dragon;
import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Soldier;

/**
 * ConcreteFactory. Inheriting from the AbstractFactory class, the concrete factory classes override
 * the methods that generate the suite of objects required by the client
 */
public class AllyWarriorFactory implements WarriorFactory {

  @Override
  public Commander getCommander() {
    return new AllyCommander();
  }

  @Override
  public Dragon getDragon() {
    return new AllyDragon();
  }

  @Override
  public Soldier getSoldier() {
    return new AllySoldier();
  }
}
