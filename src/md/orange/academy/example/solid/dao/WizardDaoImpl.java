package md.orange.academy.example.solid.dao;

import md.orange.academy.example.solid.players.Wizard;

public class WizardDaoImpl implements GenericDao<Wizard, String> {

  @Override
  public void save(Wizard player) {

  }

  @Override
  public Wizard getPlayer(String input) {
    //implement logic which return Wizard object by nickName

    return null;
  }

  @Override
  public void performAction(String input) {

  }
}
