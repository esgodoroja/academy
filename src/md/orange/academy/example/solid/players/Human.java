package md.orange.academy.example.solid.players;

import md.orange.academy.example.solid.interfaces.segregation.IHuman;

public class Human extends Player implements IHuman {

  @Override
  public int getRaceBonus(Player player) {
    return 0;
  }



  @Override
  public int raceHit() {
    int raceHit = 10;

    //...some logic

    return raceHit;
  }

  @Override
  public void physicalDamage() {

  }

  @Override
  public void increase(int value) {

  }

  @Override
  public void decrease(int value) {

  }
}