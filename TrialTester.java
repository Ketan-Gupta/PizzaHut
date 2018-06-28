public class TrialTester{
	public static void main(String args[])
	{
		ItalianPizza trial = new ItalianPizza();
		trial.name="Green Wave";
		trial.type="Veg";
		trial.toppings="Chicken";
		trial.timeForPreparation=35.5f;
	
		System.out.println(trial);
	}
}
