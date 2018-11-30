package md.orange.academy.example.solid.dao;

import md.orange.academy.example.solid.players.Human;

public class HumanDaoImpl implements GenericDao<Human, Integer> {

  @Override
  public void save(Human player) {

  }


  @Override
  public void performAction(Integer input) {

  }

  @Override
  public Human getPlayer(Integer input) {
    // some logic which returns Human Object by ID
    return null;
  }
}
