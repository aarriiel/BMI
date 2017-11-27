//U10616006 ³\®fºÕ 2017/11/27
//Make the constructors.
public class BMI {
	private int age;
	private double height;
	private double weight;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	//translate the pound to kilogram
	public static final double METERS_PER_INCH = 0.0254;

	//translate the inch to meter
	public BMI(double height, double weight, int age) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return bmi;
	}

	//a method to get bmi
	public String getStatus() {
		double bmi = getBMI();

		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 24)
			return "Normal";
		else if (bmi < 27)
			return "Overweight";
		else if (bmi < 30)
			return "Mildly Obese";
		else if (bmi < 35)
			return "Moderate Obese";
		else
			return "Severe Obese";
	}
	//a method to get the status 

	public double getBodyfat(boolean gender) {
		if (gender)
			return 1.2 * getBMI() + 0.23 * age - 5.4 - 10.8 * 0;
		else
			return 1.2 * getBMI() + 0.23 * age - 5.4 - 10.8 * 1;
	}
	//a method to get the bodyfat
}