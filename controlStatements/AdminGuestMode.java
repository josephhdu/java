package controlStatements;

public class AdminGuestMode {
    
    public static void main(String[] args) {
        System.out.println("Hello");
        
		if(args[0].contains("--admin")){
            System.out.println("Hello, Admin!");
        } else if(args[0].contains("--guest")){
            System.out.println("Hello, guest!");
        } else if(args[0].contains("--admin") && args[0].contains("--guest")){
            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        }
        

	}

}


