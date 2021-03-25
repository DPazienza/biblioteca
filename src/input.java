import java.util.InputMismatchException;
import java.util.Scanner;

public class input {

	private static Scanner input = new Scanner(System.in);
	public static Integer inpuntInt(){
		Integer x = null;
		try{
			x=input.nextInt();
		}catch(InputMismatchException e){
			System.out.println("puoi inserire solo un codice numerico mi dispiace");
			return null;

		}
		return x;
	}

	public static Double inputDouble()
	{
		Double x = null;
		try{
			x=input.nextDouble();
		}catch(Exception e){
			System.out.println("puoi inserire solo un codice numerico mi dispiace");
			return null;
		}
		return x;
	}


	public static String inputString()
	{
		String x = null;
		try{
			x=input.nextLine();
		}catch(Exception e){
			System.out.println("Errore");
			return null;
		}
		return x;
	}



}
