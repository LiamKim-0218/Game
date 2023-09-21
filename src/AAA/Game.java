package AAA;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("플레이어의 이름을 입력하세요: ");
		String playerName = scanner.nextLine();

		Player player = new Player(playerName);
		Monster[] monsters = { new Monster("슬라임"), new Monster("고블린"), new Monster("드래곤") };

		int defeatedMonsters = 0; // 처치한 몬스터 수

		while (player.getHealth() > 0 && defeatedMonsters < monsters.length) {
			Monster currentMonster = monsters[defeatedMonsters];

			System.out.println("플레이어 체력: " + player.getHealth());
			System.out.println(currentMonster.getName() + " 체력: " + currentMonster.getHealth());

			System.out.println("1. 공격  2. 아이템 사용  3. 스킬 사용");
			System.out.print("선택하세요: ");
			int choice = scanner.nextInt();

			if (choice == 1) {
				// 플레이어의 공격
				int playerDamage = random.nextInt(player.getAttack());
				currentMonster.takeDamage(playerDamage);
				System.out.println(player.getName() + "이(가) " + currentMonster.getName() + "를 공격했습니다. "
						+ currentMonster.getName() + " 체력: " + currentMonster.getHealth());

				// 몬스터의 공격
				if (currentMonster.getHealth() > 0) {
					int monsterDamage = random.nextInt(currentMonster.getAttack());
					player.takeDamage(monsterDamage);
					System.out.println(currentMonster.getName() + "이(가) " + player.getName() + "를 공격했습니다. "
							+ player.getName() + " 체력: " + player.getHealth());
				} else {
					defeatedMonsters++; // 몬스터를 처치했을 때 몬스터 수 증가
					System.out.println(currentMonster.getName() + "를 처치했습니다!");
				}
			} else if (choice == 2) {
				// 아이템 사용 코드
				System.out.println("사용할 아이템을 선택하세요:");
				System.out.println("1. 회복 물약 (+20 HP)");
				System.out.println("2. 공격 강화 물약 (+5 공격력)");
				int itemChoice = scanner.nextInt();

				if (itemChoice == 1) {
					Item healthPotion = new Item("회복 물약", 20);
					player.useItem(healthPotion);
				} else if (itemChoice == 2) {
					Item attackPotion = new Item("공격 강화 물약", 5);
					player.useItem1(attackPotion);
				} else {
					System.out.println("잘못된 선택입니다.");
				}
			} else if (choice == 3) {
				// 스킬 사용 코드
				player.useSkill(currentMonster);
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}

		if (player.getHealth() <= 0) {
			System.out.println("플레이어가 패배했습니다.");
		} else {
			System.out.println("플레이어가 이겼습니다.");
			player.levelUp();
			System.out.println(player.getName() + "이(가) 레벨 업했습니다. 현재 레벨: " + player.getLevel());
		}

		scanner.close();

	}
}
