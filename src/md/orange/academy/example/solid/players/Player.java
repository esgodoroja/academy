package md.orange.academy.example.solid.players;

import md.orange.academy.example.solid.dependency.inversion.DevelopmentArea;
import md.orange.academy.example.solid.dependency.inversion.TestArea;
import md.orange.academy.example.solid.enums.PlayerRace;

public abstract class Player {

  String nickName;
  int agility;
  int health;
  int mana;
  short currentProgress;
  int level;
  PlayerRace playerRace;
  int bonus;
  //  Area area;
  DevelopmentArea developmentArea;
  TestArea testArea;

  /**
   *
   * @return
   */
  int simpleHint() {
    //write here smth
    return 0;
  }

  public abstract int getRaceBonus(Player player);

  //  abstract int weaponHit();
//  abstract int magicHit();
  public abstract int raceHit();

}
