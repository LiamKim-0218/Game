package AdventureRPG;

public class Character1 extends CharacterMade1{
      String name;
      int level;
      int experience;
      int maxHp;
      static int currentHp;
      int maxMp;
      int currentMp;
      static int attackPower;
   public static Object currentHealth;

    protected Character1(String name,int level, int experience,int maxHp,int currentHp,int maxMp, int currentMp,int attackPower) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.maxHp = maxHp;
        Character1.currentHp = currentHp;
        this.maxMp = maxMp;
        this.currentMp = currentMp;
        Character1.attackPower = attackPower;
    }
    
    

    // 공격 메소드
    protected void attack(Character enemy) {
        int damage = Character1.attackPower;
        enemy.takeDamage(damage);
    }

    // 데미지 처리 메소드
    public void takeDamage(int damage) {
        Character1.currentHp -= damage;
        if (Character1.currentHp < 0) {
            Character1.currentHp = 0;
        }
    }

    // 경험치 획득 및 레벨 업 메소드
    public void gainExperience(int experience) {
        this.experience += experience;
        if (this.experience >= 100 * this.level) {
            this.levelUp();
        }
    }
    
    

    // 레벨 업 메소드
    private void levelUp() {
        this.level++;
        this.maxHp += 20;
        this.maxMp += 10;
        Character1.attackPower += 5;
        Character1.currentHp = this.maxHp;
        this.currentMp = this.maxMp;
        System.out.println(name + "은(는) 레벨 업 했습니다!");
    }

    // 캐릭터 정보 출력 메소드
    public void printInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("레벨: " + this.level);
        System.out.println("체력: " + this.currentHp + "/" + this.maxHp);
        System.out.println("마나: " + this.currentMp + "/" + this.maxMp);
    }   
    
    
    
    
    
    
}

