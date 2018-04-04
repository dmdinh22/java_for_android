/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        Human joe = new Human("Joe", "Cool", 'M');
		joe.setBirthDate(1987,1,22); //January 22nd, 1987
		System.out.println(joe.getFullName() + " is "+ joe.getAge() + " years old");

		Human oprah = new Human("Oprah", "Winfrey", 'M');
		oprah.setBirthDate(1986,12,8);//December 08th, 1986
		System.out.println(oprah.getFullName() + " is "+ oprah.getAge() + " years old");
		joe.addPartner(oprah);
		System.out.println(joe.getFullName() + "'s partner is " +  joe.getPartnerName());
		System.out.println(oprah.getFullName() + "'s partner is " +  oprah.getPartnerName());
    }
}
