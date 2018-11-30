package md.orange.academy.example.solid.players;

import md.orange.academy.example.solid.interfaces.segregation.IMana;

public class Wizard extends Player implements IMana {



  @Override
  public int getRaceBonus(Player player) {
    int raceBonus = this.bonus - player.bonus;
    return raceBonus < 0 ? 0 : raceBonus;
  }

  @Override
  public int raceHit() {
    int raceHit = 10;

    //....logic here

    return raceHit;
  }

  @Override
  public void increase(int value) {

  }

  @Override
  public void decrease(int value) {

  }

  @Override
  public void increaseMana(int value) {

  }

  @Override
  public void decreaseMana(int value) {

  }
}
