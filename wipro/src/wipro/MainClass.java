package wipro;


class ClassOne {
    public void showMessage() {
        System.out.println("Hello from ClassOne!");
    }
}

class ClassTwo {
    public void displayMessage() {
        System.out.println("Greetings from ClassTwo!");
    }
}


public class MainClass {

	public static void main(String[] args) {
		 ClassOne obj1 = new ClassOne();
	     obj1.showMessage();

	     ClassTwo obj2 = new ClassTwo();
	     obj2.displayMessage();

	}

}
