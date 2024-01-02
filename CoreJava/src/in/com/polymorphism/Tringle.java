package in.com.polymorphism;

public class Tringle extends shape{
 public int height;
 public int base;
 
 public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
		public void setBase(int base) {
			this.base=base;
		}
		public int getBase() {
			return base ;
		}
			public void area(){
		int Tarea = getHeight()*getBase();
		System.out.println("Tringle area="+Tarea );	
		}
}


