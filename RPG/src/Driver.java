import java.util.Scanner;

import javax.swing.JOptionPane;

public class Driver {
public static void main(String args[])
{


	 
		 String punch = "Punch";
		 String kick = "Kick";
		 String tackle = "Tackle";
		 String hyperSlam = "HyperSlam";	
	
	 
		 int punchDamage = 1;
		 int kickDamage = 2;
		 int tackleDamage = 3;
		 int hyper_slamdamage = 5;
	 
	 
	 
	 
		 int punchAmount = 10;
		 int kickAmount = 5;
		 int tackleAmount = 3;
		 int hyper_slamAmount = 1;
	


	
	boolean enemyAlive = true;
	int enemyHealth = 106;
	int heroHealth = 100;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Brave hero, what is your name?");
	String name = scan.next();
	
	hero Player1 = new hero();
	
	System.out.println(name + ", you have encountered a Goblin!");
	
	System.out.println("");
	
	System.out.println("Welcome to the battle scene");
	while(enemyAlive)
	{
	System.out.println("Press e to use Punch ");
	System.out.println("Press r to use Kick ");
	System.out.println("Press w to use Tackle ");
	System.out.println("Press q to use HyperSlam ");
	System.out.println(enemyHealth);
	
	String attack = scan.next();
	
	if (attack.equals("e"))
	{
		if(punchAmount > 0)
		{
			enemyHealth -=1;
			punchAmount -= 1;
		}
		 
		else
			{
				System.out.println("Sorry, you ran out of attack points for Punch.");
			}
		 
		 }
	
	
	else if (attack.equals("r"))
	{	
		if(kickAmount > 0)
		{
			enemyHealth -=2;
			kickAmount -= 1;
		}
		 
		else
			{
				System.out.println("Sorry, you ran out of attack points for Kick.");
			}
		 
	}
	
	else if (attack.equals("w"))
	{
		if(tackleAmount > 0)
		{
			enemyHealth -=3;
			hyper_slamAmount -= 1;
		}
		 
		else
			{
				System.out.println("Sorry, you ran out of attack points for Tackle.");
			}
		 
	}
	
	else if (attack.equals("q"))
	{
		
		if(hyper_slamAmount > 0)
		{
			enemyHealth -=5;
			hyper_slamAmount -= 1;
		}
		 
		else
			{
				System.out.println("Sorry, you ran out of attack points for HyperSlam.");
			}
		 
	}
	
	 if(enemyHealth <= 0)
	{
		JOptionPane.showMessageDialog(null, "You beat the goblin!!");
		enemyAlive = false;
	}
	
	}
	
	
	
}

//static String fight(int enemyHealth, )
//{
//	public String 
//}

}
