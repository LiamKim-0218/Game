package AdventureRPG;

public class Character extends CharacterMade{
//    protected int[] stat = new int[] {1,0,100,100,50,50,10};
	
	int level = 1;
    int experience = 0;
    static int maxHp = 100;
    int currentHp = 100;
    int maxMp = 50;
    int currentMp = 50;
    int attackPower = 10;
    
    String name;

    
    
//    protected void character() {
//        this.name = name;
//        this.level = 1;
//        this.experience = 0;
//        this.maxHealth = 100;
//        this.currentHealth = maxHealth;
//        this.maxMana = 50;
//        this.currentMana = maxMana;
//        this.attackPower = 10;
//    }

    // 공격 메소드
    public void attack(Character enemy) {
        int damage = this.attackPower;
        enemy.takeDamage(damage);
    }

    // 데미지 처리 메소드
    public void takeDamage(int damage) {
        this.currentHp -= damage;
        if (this.currentHp < 0) {
            this.currentHp = 0;
        }
    }

    // 경험치 획득 및 레벨 업 메소드
    public void gainExperience(int experience) {
        this.experience += experience;
        if (this.experience >= 100 * this.level) {
            this.levelUp();
        }
    }
    
    // 김남균     이민규
    

    // 레벨 업 메소드
    private void levelUp() {
        this.level++;
        this.maxHp += 20;
        this.maxMp += 10;
        this.attackPower += 5;
        this.currentHp = this.maxHp;
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
