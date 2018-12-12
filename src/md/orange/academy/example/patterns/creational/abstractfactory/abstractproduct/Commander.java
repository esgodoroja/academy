package md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct;

import md.orange.academy.example.patterns.creational.abstractfactory.Attack;

public interface Commander extends
    Attack {

  String promote();
  String sendOrder();

}
