//U10616006 ³\®fºÕ 2017/11/27
//make the console class to confirm the input.
import java.util.Scanner;
public class Console{
	private static Scanner input = new Scanner(System.in);
	public static int getInt(String hint){
		int i=0;
		boolean isValid=false;
		while(!isValid){
			System.out.println(hint);
			if(input.hasNextInt()){
				i=input.nextInt();
				isValid=true;
			}
			else
				System.out.println("Error, you have to input the integer.");
		}
		return i;
	}
	public static int getWay(String hint){
		int i=0;
		boolean isValid=false;
		while(!isValid){
			System.out.println(hint);
			i=input.nextInt();
			if(i==0||i==1){	
				isValid=true;
			}
			else
				System.out.println("Error, you have to input 1 or 0.");
		}
		return i;
	}
	public static double getDouble(String hint){
		double d=0;
		boolean isValid=false;
		while(!isValid){
			System.out.println(hint);
			if(input.hasNextDouble()){
				d=input.nextDouble();
				isValid=true;
			}
			else
				System.out.println("Error, you have to input the double.");
		}
		return d;
	}
	public static String getString(String hint){
		System.out.println(hint);
		String line=input.next();
		input.nextLine();
		return line;	
	}
	public static String getGender(String hint){
		String ingender=null;
		boolean isValid=false;
		while(!isValid){
			System.out.println(hint);
			ingender=input.next();
			if(ingender.equals("male"))
				isValid=true;
			else if(ingender.equals("female"))
				isValid=true;
			else
				System.out.println("Error, you have to input the male or female.");
		}
		return ingender;

	}
	public static String getAnswer(String hint){
		String Answer=null;
		boolean isValid=false;
		while(!isValid){
			System.out.println(hint);
			Answer=input.next();
			if(Answer.equals("Y"))
				isValid=true;
			else if(Answer.equals("N"))
				isValid=true;
			else if(Answer.equals("S"))
				isValid=true;
			else
				System.out.println("Error, you have to input the Y or N.");
		}
		return Answer;

	}
	public static String getDay(String hint){
		String day=null;
		boolean isValid=false;
		while(!isValid){
			System.out.println(hint);
			day=input.next();
			String[] num=day.split("/");
			if(num.length==3){
				isValid=true;
			}
			else
				System.out.println("Error, please enter the year/month/day.");
		}
		return day;
	}
}