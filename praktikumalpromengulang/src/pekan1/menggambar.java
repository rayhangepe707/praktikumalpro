package pekan1;

public class menggambar {

	public static void main(String[] args) {
		egg();
		teaCup();
		stopSign();
		hat();
		//draws the top half of an egg figuree
	}
    public static void eggTop() {
        System.out.println("  ______");
        System.out.println(" /      \\ ");
        System.out.println("/        \\");
    }    
    //draws the bottom half of an egg figuree
    public static void eggBottom() {
    	System.out.println("\\       /");
        System.out.println(" \\_____/");
    }    
    public static void egg() {
    	eggTop();
    	eggBottom();
    	System.out.println();
    }
    public static void teaCup() {
        eggBottom();
        Line();
        System.out.println();
    }
    public static void stopSign() {
    	eggTop();
    	System.out.println("| STOP |");
    	eggBottom();
    	System.out.println();
    }
    public static void hat() {
    	eggTop();
    	Line();
    }
    public static void Line() {
    	System.out.println("+----------+");
    }
}