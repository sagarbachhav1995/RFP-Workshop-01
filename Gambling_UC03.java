
public class Gambling_UC03 {
	static int EverydayStack = 100;
    static int BetStack = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int StackIncrease = 150;
		int StackDecrease = 50;
		System.out.println("Welcome To Gambler Simulator");
		System.out.println("Every Day Stack: " + EverydayStack);
		System.out.println("Bet Price: " + BetStack);

		while (EverydayStack < StackIncrease || EverydayStack < StackDecrease) {
		double a = (double) (Math.random() * 100) % 2;
		System.out.println("ramdom");
		if (a < 0.5 && EverydayStack <= 151 ) {
		System.out.println("win the bet and stack is " + (EverydayStack+=BetStack));
			
		} 
		else {
		System.out.println("Loss the bet and stack is " + (EverydayStack-=BetStack));
		}

		}

	}

}
