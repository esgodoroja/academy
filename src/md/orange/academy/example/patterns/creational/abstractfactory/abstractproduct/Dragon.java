package md.orange.academy.example.patterns.creational.abstractfactory.abstractproduct;


import md.orange.academy.example.patterns.creational.abstractfactory.Attack;

/**
 * AbstractProduct
 */
public interface Dragon extends
    Attack {

  String fly();

}
