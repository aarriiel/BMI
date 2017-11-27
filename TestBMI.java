//U10616006 ³\®fºÕ 2017/11/27
//Input the data or read a file, and bubblesort it then output.(add a way to search)
import java.io.*;
public class TestBMI{
    	static double[] height;
    	static double[] weight;
    	static String[] gender;
    	static String[] examinationday;
    	static String[] birthday;
    	static String[] name;
    	static String[] address;
	static String[] phoneNumber;
	static int[] sortArray;
	static Account[] account=new Account[3];
	static BMI[] bmi=new BMI[3];
	public static void main(String[] args){
		String in;
		int way;

		way = Console.getWay("(0)Read File or (1)Input Data");
		if (way == 1) {
			int people = Console.getInt("Please enter the number of the people.");
			inputFile(people);
			readFile("Input.txt");
			outputFile();
		}
		else{
			readFile("Input.txt");
			outputFile();
		}
		in = Console.getAnswer("Continue?(Yes/End/Search(Y / N/ S))");
		while(in.equals("Y")||in.equals("S")) {
			if (in.equals("Y")) {
				way = Console.getWay("(0)Read File or (1)Input Data");
				if (way == 1) {
					int people = Console.getInt("Please enter the number of the people.");
					inputFile(people);
					readFile("Input.txt");
					outputFile();
				}
				else {
					readFile("Input.txt");
					outputFile();
				}
			}
			else{
   				in=Console.getString( "Please enter a name to search.");
   				int sear=linearSearch(in);
   				if(sear==-1)
   					System.out.println("Unknown.");
   				else
   					System.out.println("Name:"+name[sortArray[sear]]+", Age:"+account[sortArray[sear]].getAge()+", Address:"+address[sortArray[sear]]+", Phone:"+phoneNumber[sortArray[sear]]+", Birthday:"+birthday[sortArray[sear]]+", Gender:"+gender[sortArray[sear]]+", Height:"+height[sortArray[sear]]+", Weight:"+weight[sortArray[sear]]+", Examinationday:"+examinationday[sortArray[sear]]+", BMI:"+bmi[sortArray[sear]].getBMI()+", Status:"+bmi[sortArray[sear]].getStatus()+", Bodyfat:"+bmi[sortArray[sear]].getBodyfat(account[sortArray[sear]].getbool()));
			}
			in=Console.getAnswer("Continue?(Yes/End/Search(Y / N/ S))");
		}
	}
	public static void inputFile(int n){
		try{
			FileWriter fw=new FileWriter("Input.txt");
			for(int i=0;i<n;i++){
				String Name=Console.getString("Please enter the name.");
				String Address=Console.getString("Please enter the address.");
				String PhoneNumber=Console.getString("Please enter the phone number.");
				String Birth=Console.getDay("Please enter the birthday.(year/month/day)");
				String Gender=Console.getGender("Please enter the gender.(male or female)");
				double Height=Console.getDouble("Please enter the height.(inch)");
				double Weight=Console.getDouble("Please enter the weight.(pound)");
				String examinationday=Console.getDay("Please enter the examination day(year/month/day)");
				fw.write(Name+","+Address+","+PhoneNumber+","+Birth+","+Gender+","+Height+","+Weight+","+examinationday+".\r\n");
			}
			fw.flush();
			fw.close();
		}
		catch(IOException e){
			System.out.println("no input file.");
		}
	}
	//a method to inputfile
	public static int linearSearch(String search){
		int elements=-1;
		for(int i=0;i<name.length;i++){
			if(name[i].equals(search)){
			elements=i;
			break;
			}
		}
		return elements;
	}
	//a method to linearsearch
	public static void readFile(String s) {
    		int count = 0;
		int cal=0;
     	   	try{
            		String strFile = s;
            		BufferedReader input = new BufferedReader(new FileReader(strFile));
            		String strNum;
            		while ((strNum = input.readLine()) != null) {
                		count++;
            		}
            		height=new double[count];
            		weight=new double[count];
            		gender=new String[count];
            		examinationday=new String[count];
            		birthday=new String[count];
            		name=new String[count];
            		address=new String[count];
            		phoneNumber=new String[count];
            		sortArray = new int[count];
            		account = new Account[count];
            		bmi = new BMI[count];
            		BufferedReader inpu = new BufferedReader(new FileReader(strFile));
			while ((strNum = inpu.readLine()) != null) {
                		String[] token = strNum.split(",");
                		for (int i = 0; i < token.length; i++) {
                    			if ((i + 1) % 8 == 1)
                        			name[cal] = token[i];
                    			else if ((i + 1) % 8 == 2)
                        			address[cal] = token[i];
                    			else if ((i + 1) % 8 == 3)
                        			phoneNumber[cal] = token[i];
                    			else if ((i + 1) % 8 == 4)
                        			birthday[cal] = token[i];
                    			else if ((i + 1) % 8 == 5)
                        			gender[cal] = token[i];
                    			else if ((i + 1) % 8 == 6)
                        			height[cal] = Double.parseDouble(token[i]);
                    			else if ((i + 1) % 8 == 7)
                        			weight[cal] = Double.parseDouble(token[i]);
                    			else
                       	 			examinationday[cal] = token[i];
                		}
                		cal++;
			}
			for(int a=0;a<count;a++){
				account[a]=new Account(name[a],address[a],phoneNumber[a],birthday[a],gender[a],height[a],weight[a],examinationday[a]);
				bmi[a]=new BMI(height[a],weight[a],account[a].getAge());
			}
        	}
        	catch(Exception ex){
            		System.out.println("no read file.");
        	}
	}
	//a method to readfile
	public static void outputFile(){
    		try {
            		FileWriter fw=new FileWriter("Output.txt");
            		for (int j = 0; j < sortArray.length; j++) {
              	  	sortArray[j] = j;
            	}
            		Bubblesort bs = new Bubblesort(name, sortArray);
            		bs.bubblesort();
            		for (int i = 0; i < sortArray.length; i++) {
                		fw.write("Name:" + name[i] + ", Address:" + address[sortArray[i]] + ", Age:"+account[sortArray[i]].getAge()+", Phone:" + phoneNumber[sortArray[i]] + ", Birthday:" + birthday[sortArray[i]] + ", Gender:" + gender[sortArray[i]] + ", Height:" + String.valueOf(height[sortArray[i]]) + ", Weight:" + String.valueOf(weight[sortArray[i]]) + ", Examinationday:" + examinationday[sortArray[i]] + ", BMI:" + String.valueOf(bmi[sortArray[i]].getBMI()) + ", Status:" + bmi[sortArray[i]].getStatus() + ", Bodyfat:" + String.valueOf(bmi[sortArray[i]].getBodyfat(account[sortArray[i]].getbool()))+"%\r\n");
            		}
            		fw.flush();
            		fw.close();
        	}
       		catch(IOException e){
            		System.out.println(e);
       		}
	}
	//a method to output file
}

