package md.orange.academy.example.patterns;

import md.orange.academy.example.patterns.creational.BuilderExample;

public class AppMain {

  public static void main(String[] args) {

    BuilderExample builderExample =
        new BuilderExample()
            .id(1L)
            .floors(4)
            .squareMeters(42.4f)
            .streetName1("A")
            .streetName2("B");
    System.out.println("builderExample = " + builderExample);

    builderExample.streetName1("X").streetName3("5").streetName4("3");

    System.out.println("builderExample after update = " + builderExample);
  }

}
