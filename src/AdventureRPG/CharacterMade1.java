package AdventureRPG;

import java.util.Scanner;

public class CharacterMade1 {
   protected  String Made1() {
      Character1 character1 = new Character1(null, 1, 0, 100, 100, 50, 50, 10);
      
       
      
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
      
      character1.name = name;
      
      
      System.out.println("캐릭터명 : " + character1.name);
      System.out.println("레벨 : " + character1.level);
      System.out.println("경험치 : " + character1.experience + " / 100");
      System.out.println("최대 체력 : " + character1.maxHp);
      System.out.println("현재 체력 : " + character1.currentHp);
      System.out.println("최대 마나 : " + character1.maxMp);
      System.out.println("현재 마나 : " + character1.currentMp);
      System.out.println("공격력 : "+ character1.attackPower);
      
      
      
      return name;
      
   
   }

}