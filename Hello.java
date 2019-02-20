//package javastudy;

public class Hello{
	final int i;
	final Person p;
	
	Hello(){
		this.i = 88;
		this.p = new Person();
	}
	public static void main(String []args){
    int i = 10;
    while(i < 20){
      // System.out.println("value of i is: " + i++);
      System.out.println(String.format("value of i is: %d", i++));
      // System.out.println("\n");
    }
		// int a , b;
		// a = 10;
		// // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
		// b = (a == 1) ? 20 : 30;
		// System.out.println( "Value of b is : " +  b );
		/*int a = 3;//定义一个变量；
        boolean b = (a<4)&&(a++<10);
        System.out.println("使用短路逻辑运算符的结果为"+b);
        System.out.println("a的结果为"+a);*/
		//B b = new B(); 
		//System.out.println(b.i);
        //b.p();  
		//Dog.info();
		//Dog.info();
		//System.out.println("hello");
		//Hello hello = new Hello();
		//System.out.println(hello.i);
		//System.out.println(hello.p.name);
	}
}

class A{
	public int i = 100;
	
	public void q(){
		System.out.println("A类中的q()");
		System.out.println(this.i);
	}
	
	public void p(){
		System.out.println(this.getClass().getName());  
        System.out.println(this.i);  
		this.q();
	}
}

class B extends A{
	public int i = 200;
	
	@Override
	public void q(){
		System.out.println("B类中的q()");
		System.out.println(this.i);
	}
	
	@Override
	public void p(){
		super.p();
		//System.out.println(this.getClass().getName());  
        //System.out.println(this.i);  
	}
}
class Dog{
	public static String name = "tom";
	static {
		System.out.println("Dog init");
	}
	
	public static void info(){
		System.out.println("a dog");
	}
}
class Person{
	final String name;
	Person(){
		this.name = "zhangsan";
	}
	Person(String _name){
		this.name = _name;
	}
}
