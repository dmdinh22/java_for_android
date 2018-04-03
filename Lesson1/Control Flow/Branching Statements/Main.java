public class Main{
	public static void main(String[] args) {
		System.out.println("Starting the countdown!");

		for (int i = 7; i >= 0; i--) {

			System.out.println(i);

			//continue; -- move past this line
			//break; -- exit out of loop

			if (i < 4) {
				continue;
				//break;
			}

			System.out.println("beep");
		}
	}
}