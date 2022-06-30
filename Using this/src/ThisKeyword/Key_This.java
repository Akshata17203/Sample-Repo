package ThisKeyword;

public class Key_This {

	
		
	//Type1:- to refer current class instance variable
	int i;
	public void setvalue (int i) {
		this.i = i;
		System.out.println(i);
	}
	public void show() {
		System.out.println("method show is working");
	}
	//Type2:- to invoke current class method(implicitly)
	
	public void display() {
		System.out.println("Display in type 2 working");
	}
	public void ShowDisplay() {
		this.display();
	}
	//type3:-to invoke current class constructor
			Key_This(){
				System.out.println("Constructor with no parameters");
			}
			Key_This(int a){
				this();
				System.out.println("Contructor with parameters");
			}
	//type4:-to pass arguements/parameters in the method call
			void m1(Key_This kt) {
				System.out.println("Executing m1");
			}
			void m2() {
				System.out.println("m2 Executing");
				m1(this);
				
			}
	//type5:-to pass arguements/parameters in the constructor call(from another class)
			void type5() {
				Type5_In_This t = new Type5_In_This(this);
			}
	//type6:- to return the current class instance from method
			Key_This method() {
				System.out.println("Type6 executing");
				return this;
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Key_This kt = new Key_This();//this can be used for type3
		
		//type1
		kt.setvalue(100);
		kt.show();
		
		//type2
		kt.ShowDisplay();
		
		//type3
		Key_This type = new Key_This(23);
		
		//type4
		kt.m2();
		
		//type 5
		kt.type5();
		
		//type6
		kt.method();
	}

}
