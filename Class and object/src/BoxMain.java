class Box
{
	int hi,br,le;
	 Box(int l,int b, int h)
	
	{
		le=l;
		br=b;
		hi=h;
		
	}
   int Volume()
	{
		int v;
		v=le*br*hi;
		return v;
	}
}
public class BoxMain {
	public static void main(String[] args) {
		Box bx= new Box(10,11,25);
		System.out.println("the volume is:"+bx.Volume());
	}

}
