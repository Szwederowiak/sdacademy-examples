package pl.sdacademy.gracz;

public class BossMonster implements Monster {

  @Override
  public void takeDamage(int damage) {
    System.out.println(String.format("Boss takes %d damage", damage));
  }
}
