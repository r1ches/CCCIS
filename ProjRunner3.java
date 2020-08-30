

public class ProjRunner3 {
	public static void main(String args[]) {
		
		System.out.println("This is the second running demonstration file.");
		
		System.out.println(Problem2.strongPasswordChecker("3mptyStr1ng"));
		System.out.println(Problem2.strongPasswordChecker(""));
		System.out.println(Problem2.strongPasswordChecker("123"));
		System.out.println(Problem2.strongPasswordChecker("123456"));
		System.out.println(Problem2.strongPasswordChecker("abc"));
		System.out.println(Problem2.strongPasswordChecker("qwertyuiopasdfghjklzxcvbnm"));
		System.out.println(Problem2.strongPasswordChecker("password"));
		System.out.println(Problem2.strongPasswordChecker("passsword"));
		System.out.println(Problem2.strongPasswordChecker("tacocat"));
		System.out.println(Problem2.strongPasswordChecker("TACOCAT"));
		System.out.println(Problem2.strongPasswordChecker("TacoCat"));
		System.out.println(Problem2.strongPasswordChecker("Tac0cat"));
		System.out.println(Problem2.strongPasswordChecker("aaa"));
		System.out.println(Problem2.strongPasswordChecker("aaaa"));
		System.out.println(Problem2.strongPasswordChecker("aaaaaa"));
		System.out.println(Problem2.strongPasswordChecker("AaAaAa"));
		System.out.println(Problem2.strongPasswordChecker("NullPointerException"));
		System.out.println(Problem2.strongPasswordChecker("Nu11Poin+erException"));
		System.out.println(Problem2.strongPasswordChecker("PiIsAbout3.14"));
		System.out.println(Problem2.strongPasswordChecker("πIsAbout3.14"));//greek is supported in this save file
		System.out.println(Problem2.strongPasswordChecker("♥♦♣♠○♪►"));//other UTF as well
		
		System.out.println();

		
		System.out.print("Complete");
	}
}
