package md.orange.academy.example.solid.dependency.inversion;

public class DependencyInversionApp {

  Area environment;

  public DependencyInversionApp(
      Area environment) {
    this.environment = environment;
  }

  public static void main(String... args) {

    DependencyInversionApp config = new DependencyInversionApp(new DevelopmentArea());
//    DependencyInversionApp config = new DependencyInversionApp(new TestArea());
    config.environment.loadConfig();
  }
}
