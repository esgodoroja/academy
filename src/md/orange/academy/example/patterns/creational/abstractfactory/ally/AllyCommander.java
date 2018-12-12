package md.orange.academy.example.patterns.creational.abstractfactory.ally;

import md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct.Commander;

class AllyCommander implements Commander {

  static final String COMMANDER_SEND_ORDER = "Attack...";
  static final String COMMANDER_ATTACK = "Let's burn this place";
  static final String COMMANDER_PROMOTE = "I'll HELP You!!!";

  @Override
  public String promote() {
    return COMMANDER_PROMOTE;
  }

  @Override
  public String sendOrder() {
    return COMMANDER_SEND_ORDER;
  }

  @Override
  public String attack() {
    return COMMANDER_ATTACK;
  }
}
