package pl.sdacademy;

public enum MathConstants {
  PI(3.14),
  E(2.72);

  private final double value;

  private MathConstants(double value) {
    this.value = value;
  }

  public double getValue () {
    return value;
  }
}
