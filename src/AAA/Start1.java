package AAA;

import AdventureRPG.Fight;
import java.util.Scanner;

public class Start1 {
	
	
	private static Scanner scanner = new Scanner(System.in);
	
	 protected int Start() {
	    	
	    	
	    	System.out.println("=================================================");
	    	System.out.println("|                                               |");
	    	System.out.println("|              던전에 입장하시겠습니까??              |");
	    	System.out.println("|                                               |");
	    	System.out.println("|                                               |");
	    	System.out.println("|                   1. 입장                      |");
	    	System.out.println("|                                               |");
	    	System.out.println("|                  2. 게임종료                    |");
	    	System.out.println("|                                               |");
	    	System.out.println("|                                               |");
	    	
	       
	        int choice = 0;
	        choice = scanner.nextInt();
	        switch(choice) {
	        case 1:
	        	
	        	System.out.println("=================================================");
	        	System.out.println("|                                               |");
	        	System.out.println("|                   던전 입장!                    |");
	        	System.out.println("|                                               |");
	        	System.out.println("|                                               |");
	        	System.out.println("|                                               |");
	        	System.out.println("|                                               |");
	        	System.out.println("|                                               |");
	        	System.out.println("|                                               |");
	        	System.out.println("|                                               |");
	        	System.out.println("=================================================");
	        	
	        	
	        	
	  
	        	break;
	        case 2:
	        	System.out.println("게임 종료");
	        	
	        	System.exit(0);
	        	break;
	        	
	        
	        }
			return choice;
	        
	        
	        
	    }

}
