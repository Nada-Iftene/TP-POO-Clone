

public class A implements Cloneable  {

	int i,j;
	
	public A (int i, int j){
		this.i=i;
		this.j=j;
	}
	public String toString(){
		return "(i= " +i +",j= " +j +" )";
	}
	public Object clone () throws CloneNotSupportedException{
		return super.clone();
	}
 public static void main(String[] args) {
	A a1= new A(1,2);
	A a2=null;
	try {
		a2 = (A)a1.clone();
	} catch (CloneNotSupportedException e) {
		
		e.printStackTrace();
	}
	System.out.println("a1= " + a1 + "a2= " + a2);
}	
}
