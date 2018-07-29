

public class D extends A{
	int k;
	
	public D(int i, int j){
		super(i,j);
		k=0;
		
	}
	
	public String toString(){
		return ("(k=" + k + ")" + super.toString());
	}
	
	public static void main(String[] args)  {
		D d1= new D(1,2);
		d1.k = 2;
		D d2=null;
		try {
			d2 = (D) d1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("d1 = " + d1 + "d2= " + d2);
	}

}
