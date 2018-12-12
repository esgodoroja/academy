package md.orange.academy.example.patterns.creational.abstractfactory.ally;

import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Soldier;

class AllySoldier implements Soldier {

  static final String SOLDIER_WALK = "Soldier is moving...";
  static final String SOLDIER_ATTACK = "Soldier in attack mode...";
  static final String SOLDIER_PROTECTS = "Soldier in protect mode...";


  @Override
  public String walk() {
    return SOLDIER_WALK;
  }

  @Override
  public String attack() {
    return SOLDIER_ATTACK;
  }

  @Override
  public String protect() {
    return SOLDIER_PROTECTS;
  }
}
