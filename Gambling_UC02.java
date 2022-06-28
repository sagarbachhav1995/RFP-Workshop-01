
public class Gambling_UC02 {
	static int EverydayStack = 100;
	static int BetStack = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Gambler Simulator");
		System.out.println("Every Day Stack: " + EverydayStack);
		System.out.println("Bet Price: " + BetStack);
		double Bet = Math.random();
		if (Bet < 0.5) {

		System.out.println("win the bet" + (EverydayStack += BetStack));
		} else
		{
		System.out.println("loss the bet " + (EverydayStack -= BetStack));
		}

	}

}