package AAA;
class Monster {
    private String name;
    private int health;
    private int attack;

    public Monster(String name) {
        this.name = name;
        this.health = 50;
        this.attack = 8;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}

