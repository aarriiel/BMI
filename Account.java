//U10616006 ³\®fºÕ 2017/11/27
//make a constructors
public class Account{
	private String Name;
	private String Gender;
	private String Phonenumber;
	private String Address;
	private boolean gender;
	private String birth;
	private String examinationday;
	private double Height;
	private double Weight;
	public Account(String Name, String Address, String Phonenumber, String birth,String Gender,double Weight,double Height,String examinationday){
		this.Name=Name;
		this.Gender=Gender;
 		this.Phonenumber=Phonenumber;
		this.Address=Address;
		this.birth=birth;
		this.Weight=Weight;
		this.Height=Height;
		this.examinationday=examinationday;
	}
	public boolean getbool(){
		if(getGender().equals("male"))
			gender=false;
		else
			gender=true;
		return gender;	
	}
	
	//a method to get the boolean
	public String getName(){
		return Name;
	}
	//a method to get name
	public String getGender(){
		return Gender;
	}
	//a method to get gender
	public String getPhonenumber(){
		return Phonenumber;
	}
	//a method to get phone number
	public String getAddress(){
		return Address;
	}
	//a method to get address
	public String getBirth(){
		return birth;
	}
	//a method to get birthbay
	public String getExaminationday(){return examinationday;}
	//a method to get examination day
	public int getAge(){
		String[] newd=examinationday.split("/");
		String[] far=birth.split("/");
		int newyear=Integer.parseInt(newd[0]);
		int faryear=Integer.parseInt(far[0]);
		int newmonth=Integer.parseInt(newd[1]);
		int farmonth=Integer.parseInt(far[1]);
		int newday=Integer.parseInt(newd[2]);
		int farday=Integer.parseInt(far[2]);
		if(newmonth>farmonth){
			return newyear-faryear;
		}
		else if(newmonth==farmonth){
			if(newday>=farday)
				return newyear-faryear;
			else
				return newyear-faryear-1;	
		}
		else
			return newyear-faryear-1;	

	}
	//a method to get age
	public double getHeight(){
		return Height;
	}
	//a method to get height
	public double getWeight(){
		return Weight;
	}
	//a method to get weight
}