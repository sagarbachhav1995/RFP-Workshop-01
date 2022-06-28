
public class Gambling_UC04 {
	static int EverydayStack = 100;
	static int BetStack = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int StackIncrease = 150;
		int StackDecrease = 50;
		int win = 0;
		System.out.println("Welcome To Gambling");
		System.out.println("Every Day Stack is " + EverydayStack);
		System.out.println("Betting price is " + BetStack);
		for (int day = 1; day <= 20; day++) {

			while (EverydayStack > StackDecrease && EverydayStack < StackIncrease) {
				double rand = Math.random();

				if (rand < 0.5) {
					System.out.println("win the bet and stack is " + (EverydayStack += BetStack));
					win = win + 50;
					break;
				} else {
					System.out.println("Loss the bet and stack is " + (EverydayStack -= BetStack));
					win = win - 50;
					break;
				}
			}

			System.out.println("winning amount is " + win);

		}
		System.out.println(" final winning amount is " + win);

	}

}