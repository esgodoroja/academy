package md.orange.academy.example.solid;

import md.orange.academy.example.solid.dao.ElfDaoImpl;
import md.orange.academy.example.solid.dao.GenericDao;
import md.orange.academy.example.solid.players.Human;
import md.orange.academy.example.solid.players.Player;
import md.orange.academy.example.solid.players.Wizard;

public class MainApp {

  public static void main(String... args) {
    Player human = new Human();
    Player wizard = new Wizard();

    GenericDao elfDao = new ElfDaoImpl();
  }


  public int makeSpecificHit(Player player) {
    return player.raceHit();
  }
}
