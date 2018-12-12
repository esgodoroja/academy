package md.orange.academy.example.patterns.creational.abstractfactory.ally;

import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Dragon;

class AllyDragon implements Dragon {


  static final String DRAGON_FLY = "Dragon is moving...";
  static final String DRAGON_ATTACK = "Dragon attacking...";

  @Override
  public String fly() {
    return DRAGON_FLY;
  }

  @Override
  public String attack() {
    return DRAGON_ATTACK;
  }
}
