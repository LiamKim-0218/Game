package AdventureRPG;

import java.util.Scanner;

public class CharacterMade {
	protected  String Made() {
		Character character = new Character();
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1레벨부터 시작하는 RPG게임\n게임시작 = yes 입력");
		
		String start = scanner.nextLine();
		
		while(!start.equals("yes")){
			System.out.println("yes를 입력해주세요");
			start = scanner.nextLine();
			if(start.equals("yes")) {
				break;
			}
		}
		
		System.out.println("캐릭터를 생성해주세요");
		
		String name = scanner.nextLine();
		
		System.out.println("캐릭터명 : " + name);
		System.out.println("레벨 : " + character.level);
		System.out.println("경험치 : " + character.experience + " / 100");
		System.out.println("최대 체력 : " + character.maxHp);
//		System.out.println("현재 체력 : " + character.currentHealth);
		System.out.println("최대 마나 : " + character.maxMp);
//		System.out.println("현재 마나 : " + character.currentMana);
		System.out.println("공격력 : "+character.attackPower);
		
		
		
		return name;
		
	
	}

}
