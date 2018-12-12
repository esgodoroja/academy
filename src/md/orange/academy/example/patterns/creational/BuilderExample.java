package md.orange.academy.example.patterns.creational;

public class BuilderExample {

  private long id;
  private String streetName1;
  private String streetName2;
  private String streetName3;
  private String streetName4;
  private int floors;
  private float squareMeters;

  public BuilderExample() {}

  public BuilderExample id(long id) {
    this.id = id;
    return this;
  }

  public BuilderExample streetName1(String streetName) {
    this.streetName1 = streetName;
    return this;
  }
  public BuilderExample streetName2(String streetName) {
    this.streetName2 = streetName;
    return this;
  }
  public BuilderExample streetName3(String streetName) {
    this.streetName3 = streetName;
    return this;
  }
  public BuilderExample streetName4(String streetName) {
    this.streetName4 = streetName;
    return this;
  }
  public BuilderExample floors(int floors) {
    this.floors = floors;
    return this;
  }
  public BuilderExample squareMeters(float squareMeters) {
    this.squareMeters = squareMeters;
    return this;
  }
/*
  public BuilderExample(long id, String streetName1, String streetName2, String streetName3,
      String streetName4, int floors, float squareMeters) {
    this.id = id;
    this.streetName1 = streetName1;
    this.streetName2 = streetName2;
    this.streetName3 = streetName3;
    this.streetName4 = streetName4;
    this.floors = floors;
    this.squareMeters = squareMeters;
  }
  public BuilderExample(long id, String streetName1, String streetName2, String streetName3,
      int floors, float squareMeters) {
   this(id, streetName1, streetName2, streetName3, null, floors, squareMeters);
  }

  public BuilderExample(long id, String streetName1, String streetName2, int floors,
      float squareMeters) {
    this(id, streetName1, streetName2, null, null, floors, squareMeters);
  }

  public BuilderExample(long id, String streetName1, int floors, float squareMeters) {
    this(id, streetName1, null, null, null, floors, squareMeters);
  }
  */

  @Override
  public String toString() {
    return "BuilderExample{" +
        "id=" + id +
        ", streetName1='" + streetName1 + '\'' +
        ", streetName2='" + streetName2 + '\'' +
        ", streetName3='" + streetName3 + '\'' +
        ", streetName4='" + streetName4 + '\'' +
        ", floors=" + floors +
        ", squareMeters=" + squareMeters +
        '}';
  }
}
