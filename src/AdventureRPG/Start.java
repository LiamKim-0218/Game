package AdventureRPG;

import java.util.Random;
import java.util.Scanner;

public class Start {
   private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    Fight fight = new Fight(null, 0, 0, 0, 0, 0, 0, 0);
    
    protected int Start() {
        System.out.println("던전에 입장하시겠습니까??");
        System.out.println("1. 입장");
        System.out.println("2. 게임종료");
        
        int choice = 0;
        choice = scanner.nextInt();
        switch(choice) {
        case 1:
           System.out.println("던전 입장!");
           Fight.getPlayerChoice();
           break;
        case 2:
           System.out.println("게임 종료");
           
           System.exit(0);
           break;
           
        
        }
      return choice;
        
        
        
    }
    
}













//package AdventureRPG;
//
//import java.util.Scanner;
//
//public class Start {
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        CharacterMade1 made1 = new CharacterMade1();
//        Fight fight = new Fight(made1);
//
//        System.out.println("던전에 입장하시겠습니까??");
//        System.out.println("1. 입장");
//        System.out.println("2. 게임종료");
//
//        int choice = scanner.nextInt();
//
//        switch (choice) {
//            case 1:
//                System.out.println("던전 입장!");
//                fight.startBattle();
//                break;
//            case 2:
//                System.out.println("게임 종료");
//                System.exit(0);
//                break;
//            default:
//                System.out.println("올바른 선택지가 아닙니다. 1 또는 2를 선택하세요.");
//                break;
//        }
//    }
//}



