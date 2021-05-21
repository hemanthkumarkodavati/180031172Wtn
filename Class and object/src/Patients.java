class Patient
{
	String name;
	double hieght,wieght;
	double computeBMI(String name, double height,double wieght)
	{
		double bmi;
		bmi=(wieght)/(height*height);
		System.out.println("name of the pateint is : "+name);
		return bmi;
	}
}

public class Patients {
	public static void main(String[] args) {
		 Patient p= new  Patient();
		 System.out.println("The bmi of patient is "+p.computeBMI("Hema", 1.55, 77));
		
	}

}
