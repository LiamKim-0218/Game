package AAA;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Fight{		
	}

	Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

   
    
    static Start start = new Start();
    
//    Fight fight = new Fight();
    
 
    // 전투 메소드
    public void startBattle() {
        Monster enemy = createRandomMonster(); // 랜덤한 몬스터 생성
        
        System.out.println("적 " + enemy.getName() + "이(가) 나타났습니다!");

        while (Character1.getCurrentHp() > 0 && enemy.getCurrentHp() > 0) {
            int playerChoice = getPlayerChoice();

            switch (playerChoice) {
                case 1:
                    // 공격
                    int playerDamage = calculatePlayerDamage();
                    enemy.takeDamage(playerDamage);
                    System.out.println("적 " + enemy.getName() + "에게 " + playerDamage + "의 데미지를 입혔습니다!");
                    break;
                case 2:
                    // 스킬 사용
                    Character1.useSkill(skill); // 스킬 객체를 전달해야 함
                    break;
                case 3:
                    // 도망가기
                    System.out.println("던전을 빠져나갔습니다!");
                    return; // 전투 종료
                default:
                    System.out.println("올바른 선택지가 아닙니다. 1, 2, 3 중 하나를 선택하세요.");
                    break;
            }

            // 적의 턴 (적의 공격)
            if (enemy.getCurrentHp() > 0) {
                int enemyDamage = enemy.calculateEnemyDamage();
                Character1.takeDamage(enemyDamage);
                System.out.println("적 " + enemy.getName() + "의 공격! " + enemyDamage + "의 데미지를 입었습니다!");
            }
        }

        // 전투 종료 후 결과 처리
        if (Character1.getCurrentHp() <= 0) {
            System.out.println("패배했습니다!");
            // 게임 오버 또는 다른 처리
        } else if (enemy.getCurrentHp() <= 0) {
            System.out.println("승리했습니다!");
            // 승리 처리, 경험치 획득, 레벨 업 처리
            Win win = new Win(Character1.level);
        }
    }

    // 랜덤한 몬스터 생성 메소드
    private Monster createRandomMonster() {
        // 몬스터 리스트에서 랜덤하게 하나 선택
        List<Monster> monsters = MonsterList.getMonsters();
        int randomIndex = new Random().nextInt(monsters.size());
        return monsters.get(randomIndex);
    }



    public void playerWins() {
        // 이기면 경험치 획득
        int experienceGained = 20; // 이것은 이겼을 때 얻는 경험치 양입니다. 원하는 값으로 수정하세요.
        made1.gainExperience(experienceGained);

        // 레벨 업 확인
        if (made1.getExperience() >= 100 * made1.getLevel()) {
        	made1.levelUp();
        }
    }

    // 플레이어 선택지 메소드
    protected static int getPlayerChoice() {
        int choice = 0;
        while (true) {
        	System.out.println("=================================================");
        	System.out.println("| 플레이어 이름 : "+Character1.name +"                                ");
        	System.out.println("| 레벨 : "+Character1.level +"                                       ");
        	System.out.println("| 경험치 : "+Character1.experience +"                                     ");
        	System.out.println("| 최대 체력 / 현재 체력 : " +Character1.maxHp +"/"+Character1.currentHp +"                   ");
        	System.out.println("| 최대 마나 / 현재 마나 : " +Character1.maxMp +"/"+Character1.currentMp +"                     ");
        	System.out.println("| 공격력 : "+Character1.attackPower +"                                    ");
        	System.out.println("|                                               ");
        	System.out.println("| 행동을 선택하세요:                                ");
        	System.out.println("| 1. 공격                                        ");
        	System.out.println("| 2. 스킬 사용                                    ");
        	System.out.println("| 3. 도망가기                                     ");
        	System.out.println("|                                               ");
        	System.out.println("|                                               ");	
        	System.out.println("=================================================");
        	
            choice = scanner.nextInt();
            
            switch(choice) {
            case 1:
//	            System.out.println("몬스터 " + Character1.attackPower + "의 데미지를 입혔습니다!");
//	            System.out.println("적에게 " + Character1.attackPower + "의 데미지를 입혔습니다!");
	            System.out.println("=================================================");
	          	System.out.println("| 플레이어 이름 : "+Character1.name +"                                     ");
	          	System.out.println("| 레벨 : "+Character1.level +"                                           ");
	          	System.out.println("| 경험치 : "+Character1.experience +"                                     ");
	          	System.out.println("| 최대 체력 / 현재 체력 : " +Character1.maxHp +"/"+Character1.currentHp +"  ");
	          	System.out.println("| 최대 마나 / 현재 마나 : " +Character1.maxMp +"/"+Character1.currentMp +"   ");
	          	System.out.println("| 공격력 : "+Character1.attackPower +"                                    ");
	          	System.out.println("|                                                                        ");
	          	System.out.println("|                                                                        ");
	          	System.out.println("|  몬스터 " + Character1.attackPower + "의 데미지를 입혔습니다!                 ");
	          	System.out.println("|                                									     ");
	          	System.out.println("|                               								         ");
	          	System.out.println("|                                          							     ");
	          	System.out.println("|                                            						   ");	
	          	System.out.println("=================================================");
	          	
	              
	              
//	              
////	              Character1.currentHealth = Character1.currentHealth - Enemy.attackPower;
//	              if (Enemy.currentHp <= 0) {
//	                  System.out.println("적을 처치하였습니다!");
////	              
//	              break;
//	              }
            case 2:
            	System.out.println("=================================================");
	          	System.out.println("| 플레이어 이름 : "+Character1.name +"                                     ");
	          	System.out.println("| 레벨 : "+Character1.level +"                                           ");
	          	System.out.println("| 경험치 : "+Character1.experience +"                                     ");
	          	System.out.println("| 최대 체력 / 현재 체력 : " +Character1.maxHp +"/"+Character1.currentHp +"  ");
	          	System.out.println("| 최대 마나 / 현재 마나 : " +Character1.maxMp +"/"+Character1.currentMp +"   ");
	          	System.out.println("| 공격력 : "+Character1.attackPower +"                                    ");
	          	System.out.println("|                                                                        ");
	          	System.out.println("|                                                                        ");
	          	System.out.println("|  몬스터 " + Character1.attackPower + "의 데미지를 입혔습니다!                 ");
	          	System.out.println("|                                									     ");
	          	System.out.println("|                               								         ");
	          	System.out.println("|                                          							     ");
	          	System.out.println("|                                            						   ");	
	          	System.out.println("=================================================");
	          	
            	break;
            case 3:
            	System.out.println("던전에서 도망쳤다!!!다시 재정비를 해야겠다.");
            	start.Start();
            	break;
            	
            
            }
        }
    }
}

//    // 플레이어의 공격 데미지 계산 (간단히 랜덤 값을 사용)
//    private int calculatePlayerDamage() {
//        return random.nextInt(20) + 10; // 랜덤한 데미지 값 (10에서 29 사이)
//    }
//}














