package AdventureRPG;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Fight extends Character1{
   protected Fight(String name, int level, int experience, int maxHealth, int currentHealth, int maxMana,
         int currentMana, int attackPower) {
      super(name, level, experience, maxHealth, currentHealth, maxMana, currentMana, attackPower);
      
   }

   private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    CharacterMade1 made1 = new CharacterMade1();
    // EnemyMade enemy = new EnemyMade(name, level, maxHp, currentHp, maxMp, currentMp, attackPower);
    
   
    
    static Start start = new Start();
    
//    Fight fight = new Fight();
    
 
    // 전투 메소드
    public static void startBattle() {

        
    }
    

    
    // 플레이어 선택지 메소드
    protected static int getPlayerChoice() {
        int choice = 0;
        while (true) {
            System.out.println("행동을 선택하세요:");
            System.out.println("1. 공격");
            System.out.println("2. 스킬 사용");
            System.out.println("3. 도망가기");
            choice = scanner.nextInt();
            
            switch(choice) {
            case 1:
                 System.out.println("몬스터 " + Character1.attackPower + "의 데미지를 입혔습니다!");
                 System.out.println("적에게 " + Character1.attackPower + "의 데미지를 입혔습니다!");
//                 Character1.currentHealth = Character1.currentHealth - Enemy.attackPower;
//                 if (Enemy.currentHp <= 0) {
//                     System.out.println("적을 처치하였습니다!");
//                 
//                 }break;
            
                case 2:
                // 스킬 사용
                System.out.println("사용할 스킬을 선택하세요:");
                List<Skill> skills = SkillList.getSkills(); // SkillList 클래스의 getter 메서드를 통해 skills 리스트를 가져옴
                
                for (int i = 0; i < skills.size(); i++) {
                    Skill skill = skills.get(i); // 가져온 skills 리스트를 사용
                    System.out.println((i + 1) + ". " + skill.getSkillName());
                }
                
                int skillChoice = scanner.nextInt();
                
                if (skillChoice >= 1 && skillChoice <= skills.size()) {
                    Skill selectedSkill = skills.get(skillChoice - 1);
                    if (made1.getCurrentMana() >= selectedSkill.getSpendMp()) {
                        int damage = selectedSkill.getSkillPower();
                        System.out.println("스킬 '" + selectedSkill.getSkillName() + "'을 사용하여 적에게 " + damage + "의 데미지를 입혔습니다!");
                        made1.takeDamage(damage);
                        made1.setCurrentMana(made1.getCurrentMana() - selectedSkill.getSpendMp());
                    } else {
                        System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다.");
                    }
                } else {
                    System.out.println("올바른 스킬 번호를 선택하세요.");
                }
                break;
            case 3:
               System.out.println("던전에서 도망쳤다!!!다시 재정비를 해야겠다.");
               start.Start();
               break;
               
            
            }
        }
    }
}

//
//
//
//package AdventureRPG;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Fight extends CharacterMade1 {
//    private static Scanner scanner = new Scanner(System.in);
//    private static Random random = new Random();
//    private CharacterMade1 made1;
//
//    public Fight(CharacterMade1 made1) {
//        this.made1 = made1;
//    }
//
//    // 전투 메소드
//    public void startBattle() {
//        System.out.println("던전 입장!");
//
//        while (true) {
//            int playerChoice = getPlayerChoice();
//
//            switch (playerChoice) {
//                case 1:
//                    // 공격
//                    int damage = calculatePlayerDamage();
//                    System.out.println("적에게 " + damage + "의 데미지를 입혔습니다!");
//                    made1.takeDamage(damage);
//
//                    if (made1.getCurrentHp() <= 0) {
//                        System.out.println("적을 처치하였습니다!");
//                        return;
//                    }
//                    break;
//                case 2:
//                    // 스킬 사용 (스킬은 여기서 구현)
//                    System.out.println("스킬을 사용합니다.");
//                    break;
//                case 3:
//                    // 도망가기
//                    System.out.println("도망갑니다.");
//                    return;
//                default:
//                    System.out.println("올바른 선택지가 아닙니다. 1, 2, 3 중 하나를 선택하세요.");
//                    break;
//            }
//        }
//    }
//
//    // 플레이어 선택지 메소드
//    protected int getPlayerChoice() {
//        int choice = 0;
//        while (choice < 1 || choice > 3) {
//            System.out.println("행동을 선택하세요:");
//            System.out.println("1. 공격");
//            System.out.println("2. 스킬 사용");
//            System.out.println("3. 도망가기");
//            choice = scanner.nextInt();
//        }
//        return choice;
//    }
//
//    // 플레이어의 공격 데미지 계산 (간단히 랜덤 값을 사용)
//    private int calculatePlayerDamage() {
//        return random.nextInt(20) + 10; // 랜덤한 데미지 값 (10에서 29 사이)
//    }
//}













