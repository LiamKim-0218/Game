package AAA;

import java.util.Random;

public class Player {
    private String name;
    private int level;
    private int health;
    private int attack;
    private int skillDamage; 
    private Random random;

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.health = 100;
        this.attack = 10;
        this.skillDamage = 20;
        this.random = new Random();
    }
    
    

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void levelUp() {
        level++;
        health += 20;
        attack += 5;
    }


    
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    
   
    public void takeDamage(int damage) {
        health -= damage;
    }
    
    
    public void useItem(Item item) {
        item.use(this); // 아이템 사용
    }

    public void useItem1(Item item) {
        item.use1(this); // 아이템 사용
    }
    
    public void increaseHealth(int amount) {
        health += amount;
    }
    
    public void useSkill(Monster monster) {
        if (random.nextDouble() < 0.3) { 
            int damage = random.nextInt(skillDamage);
            monster.takeDamage(damage);
            System.out.println(name + "이(가) 스킬을 사용하여 " + monster.getName() + "에게 " + damage + " 데미지를 입혔습니다.");
        } else {
            System.out.println(name + "이(가) 스킬을 사용하려 했지만 실패했습니다.");
        }
    }
    
    
}
