
class Calculator
{
	static double  Powerint(int num1,int num2) 
	{
		double p;
		p=Math.pow(num1,num2);
		return p;
	}
	static double  Powerdouble(double num1,double num2) 
	{
		double k;
		k=Math.pow(num1,num2);
		return k;
	}
	
}
public class Calculatorstatic {
public static void main(String[] args) {
	Calculator c=new Calculator();
	double i =c.Powerint(10,5);
	double j=c.Powerdouble(10,8);
	System.out.println(""+i);
	System.out.println(""+j);
	
	
}
}
