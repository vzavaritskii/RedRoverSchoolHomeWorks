package HW_9_1;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static void main(String[] args) {

        Fighter a = new Fighter("Harald", 20, 5);
        Fighter b = new Fighter("Harry", 5, 4);
        System.out.println(declareWinner(a, b, "Harry"));

    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equals(fighter1.name)) {
            while (fighter1.health > 0 || fighter2.health > 0) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name;
                }
            }
        } else {
            while (fighter1.health > 0 || fighter2.health > 0) {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name;
                }
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }
            }
        }
        return "error";
    }
}
