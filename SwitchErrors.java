public class SwitchErrors {
	
	// create enum data-type class and constants
	
	enum Coffee {MEDIUM, DARK, DECAF};

	public void myCoffee() 
    {
        //declare Coffee variable and assign values to it
        Coffee myCup = Coffee.DARK;
        
        switch (myCup)
        {
            case MEDIUM:
                System.out.println("Mild flavor.");
                break;
            case DARK:
                System.out.println("Strong flavor.");
                break;
            case DECAF:
                System.out.println("Won't keep you awake.");
                break;
            default:
                System.out.println("Never heard of it.");
        }
    }
}
