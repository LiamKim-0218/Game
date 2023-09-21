package AdventureRPG;

import java.util.ArrayList;
import java.util.List;

public class MonsterList {
    public static void main(String[] args) {
        // 몬스터를 저장할 리스트 생성
        List<Monster> monsters = new ArrayList<>();

        // 몬스터 생성 및 설정
        Monster monster1 = new Monster();
        monster1.setName("고블린");
        monster1.setMaxHp(50);
        monster1.setCurrentHp(50);
        monster1.setAttackPower(10);

        Monster monster2 = new Monster();
        monster2.setName("드래곤");
        monster2.setMaxHp(200);
        monster2.setCurrentHp(200);
        monster2.setAttackPower(30);

        Monster monster3 = new Monster();
        monster3.setName("스켈레톤");
        monster3.setMaxHp(80);
        monster3.setCurrentHp(80);
        monster3.setAttackPower(15);

        
        Monster monster4 = new Monster();
        monster3.setName("좀비");
        monster3.setMaxHp(100);
        monster3.setCurrentHp(100);
        monster3.setAttackPower(20);

        // 몬스터 리스트에 추가
        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);
        monsters.add(monster4);

        
        // 몬스터 정보 출력
        for (Monster monster : monsters) {
            System.out.println("이름: " + monster.getName());
            System.out.println("최대 체력: " + monster.getMaxHp());
            System.out.println("현재 체력: " + monster.getCurrentHp());
            System.out.println("공격력: " + monster.getAttackPower());
            System.out.println();
        }
    }
}