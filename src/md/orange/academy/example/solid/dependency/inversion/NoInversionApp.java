package md.orange.academy.example.solid.dependency.inversion;

public class NoInversionApp {

  DevelopmentArea developmentArea;
  TestArea testArea;

  public NoInversionApp(
      DevelopmentArea developmentArea) {
    this.developmentArea = developmentArea;
  }
  // extra constructor
  public NoInversionApp(TestArea testArea) {
    this.testArea = testArea;
  }

  public static void main(String... args) {

//    DevelopmentArea developmentArea = new DevelopmentArea();
    // not good dependency
    NoInversionApp devConfig = new NoInversionApp(new DevelopmentArea());
    devConfig.developmentArea.loadConfig();

    // used only on test environment
//    NoInversionApp testConfig = new NoInversionApp(new TestArea());
//    devConfig.developmentArea.loadConfig();

  }
}
