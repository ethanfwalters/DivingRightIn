import java.util.Scanner;

// bless up

public class DivingRightIn
	{

		public static int humanAge;

		public static void main(String[] args)
			{
				greetUser();
				askUserAge();

			}

		public static void greetUser()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello " + name + "!");

			}

		public static void askUserAge()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How old are you?");
				humanAge = userInput.nextInt();
				if (humanAge < 16)
					{

						System.out.println("You youngin, you're only " + humanAge + " years old!");
					}
				if (humanAge == 17)
					{
						System.out.println("Congrads, you're almost an adult, only a year away");
					}
				if (humanAge == 18)
					{
						System.out.println("You're an adult! That must be nice.");
					}
				if (humanAge < 1)
					{
						System.out.println("You cant be that young.");
					}

				double dogYears = humanAge / (double) 7;

				System.out.println("In dog years you are " + dogYears + " years old! \n");

				int extraCredit = humanAge / 4;

				System.out.println("You have survived throught " + extraCredit + " leap years. \n");

				for (int i = humanAge; i >= 1; i--)
					{ // in this i am trying to tell the person the years that
						// they have lived

						int oldYear = 2017 - i;

						int ageOfPerson = humanAge - i;

						if(i == (humanAge - 1)){
							System.out.println("In " + oldYear + " you were " + ageOfPerson + " year old.");
						}
						else{
							System.out.println("In " + oldYear + " you were " + ageOfPerson + " years old.");
						}

					}

			}

	}