package md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct;

import md.orange.academy.example.patterns.creational.abstractfactory.Attack;
import md.orange.academy.example.patterns.creational.abstractfactory.Protect;

public interface Soldier extends
    Attack,
    Protect {

  String walk();

}
