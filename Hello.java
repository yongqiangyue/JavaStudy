//package javastudy;
import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.lang.reflect.Field;
import java.io.*;

public class Hello{
	final int i;
	final Person p;
	
	Hello(){
		this.i = 88;
		this.p = new Person();
	}
  public static String getType(Object o){ //获取变量类型方法
    return o.getClass().toString(); //使用int类型的getClass()方法
  } 

    private static String REGEX = "^*b";
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";

    public static String change(String s){
        s = "222";
        return s; 
    }

    public static void swap(Integer a, Integer b) throws Exception {
        System.out.println("\t进入swap函数:");
        System.out.println("\t\t交换前 a:" + a + ", b:"+b);
        int temp = a;
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        field.setInt(a, b);
        field.setInt(b, temp);
        // a = b;
        // b = temp;
    }
    private static int time = 50000;

     public static void testString () {
        String s="";
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            s += "java";
        }
        long over = System.currentTimeMillis();
        System.out.println("操作"+s.getClass().getName()+"类型使用的时间为："+(over-begin)+"毫秒");
    }
     
    public static void testStringBuffer () {
        StringBuffer sb = new StringBuffer();
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            sb.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作"+sb.getClass().getName()+"类型使用的时间为："+(over-begin)+"毫秒");
    }
     
    public static void testStringBuilder () {
        StringBuilder sb = new StringBuilder();
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            sb.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作"+sb.getClass().getName()+"类型使用的时间为："+(over-begin)+"毫秒");
    }
     
    public static void test1String () {
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            String s = "I"+"love"+"java";
        }
        long over = System.currentTimeMillis();
        System.out.println("字符串直接相加操作："+(over-begin)+"毫秒");
    }
     
    public static void test2String () {
        String s1 ="I";
        String s2 = "love";
        String s3 = "java";
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            String s = s1+s2+s3;
        }
        long over = System.currentTimeMillis();
        System.out.println("字符串间接相加操作："+(over-begin)+"毫秒");
    }

     public static void testOptimalString () {
        String s="";
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            StringBuffer sb = new StringBuffer(s);
            sb.append("java");
            s=sb.toString();
        }
        long over = System.currentTimeMillis();
        System.out.println("模拟JVM优化操作的时间为："+(over-begin)+"毫秒");
    }

    public static void main(String []args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();

        // Scanner scan = new Scanner(System.in);
        // // 从键盘接收数据
 
        // // next方式接收字符串
        // System.out.println("next方式接收：");
        // // 判断是否还有输入
        // if (scan.hasNextLine()) {
        //     String str1 = scan.nextLine();
        //     System.out.println("输入的数据为：" + str1);
        // }
        // scan.close();
        // String dirname = "/tmp";
        // File f1 = new File(dirname);
        // if (f1.isDirectory()) {
        //     System.out.println("目录 " + dirname);
        //     String s[] = f1.list();
        //     for (int i = 0; i < s.length; i++) {
        //         File f = new File(dirname + "/" + s[i]);
        //         if (f.isDirectory()) {
        //             System.out.println(s[i] + " 是一个目录");
        //         } else {
        //             System.out.println(s[i] + " 是一个文件");
        //         }
        //     }
        // } else {
        //     System.out.println(dirname + " 不是一个目录");
        // }
        //  try {
        //     byte bWrite[] = { 'A', 'B', 'C'};
        //     OutputStream os = new FileOutputStream("test.txt");
        //     for (int x = 0; x < bWrite.length; x++) {
        //         os.write(bWrite[x]); // writes the bytes
        //     }
        //     os.close();
 
        //     InputStream is = new FileInputStream("test.txt");
        //     int size = is.available();
 
        //     for (int i = 0; i < size; i++) {
        //         System.out.print((char) is.read() + "  ");
        //     }
        //     is.close();
        // } catch (IOException e) {
        //     System.out.print("Exception");
        // }
        // int b = 0;
        // b = 'A';
        // System.out.write(b);
        // System.out.write('\n');
        // testString();
        // testOptimalString();
        // testStringBuffer();
        // testStringBuilder();
        // test1String();
        // test2String();
        // String str1 = "hello world";
        // String str2 = new String("hello world");
        // String str3 = "hello world";
        // String str4 = new String("hello world");
         
        // System.out.println(str1==str2); // false
        // System.out.println(str1==str3); // true
        // System.out.println(str2==str4); // false
        // String c;
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("输入字符, 按下 'q' 键退出。");
        // do{
        //     c = (String)br.readLine();
        //     System.out.println(c);
        // }while(!c.equals("q"));
        // Integer a = 1;
        // Integer b = 2;
        // System.out.println("\t\t交换前 a:" + a + ", b:"+b);
        // Hello.swap(a, b);
        // System.out.println("\t\t交换后 a:" + a + ", b:"+b);
        // Pattern p = Pattern.compile(REGEX);
        // // 获取 matcher 对象
        // Matcher m = p.matcher(INPUT);
        // int count = 0;
 
        // while(m.find()) {
        //     count++;
        //     System.out.println("Match number "+count);
        //     System.out.println("start(): "+m.start());
        //     System.out.println("end(): "+m.end());
        // }
        // INPUT = m.replaceAll(REPLACE);
        // System.out.println(INPUT);
    //   StringBuffer sb = new StringBuffer();
    //   while(m.find()){
    //       System.out.println("Found value: " + m.group(0) );
    //      m.appendReplacement(sb,REPLACE);
    //   }
    //   m.appendTail(sb);
    //   System.out.println(sb.toString());
    // int [] intArray = new int [ ] {1,2,3,4};
    // System.out.println(intArray);
    // for(int element : intArray){
    //     System.out.println(element);
    // }
    // 数组大小
    //   int size = 10;
    //   // 定义数组
    //   double[] myList = new double[size];
    //   myList[0] = 5.6;
    //   myList[1] = 4.5;
    //   myList[2] = 3.3;
    //   myList[3] = 13.2;
    //   myList[4] = 4.0;
    //   myList[5] = 34.33;
    //   myList[6] = 34.0;
    //   myList[7] = 45.45;
    //   myList[8] = 99.993;
    //   myList[9] = 11123;
    //   // 计算所有元素的总和
    //   double total = 0;
    //   for (int i = 0; i < size; i++) {
    //      total += myList[i];
    //   }
    //   System.out.println("总和为： " + total);
    // String s = "111"; 
    // String ss = change(s);
    // System.out.println(s);
    // System.out.println(ss);
    // Pattern p = Pattern.compile(REGEX);
    // Matcher m = p.matcher(INPUT);
    // int count = 0;
    // if(m.find()){
    //     System.out.println("Found value: " + m.group(0) );
    //     System.out.println("Found value: " + m.group(1) );
        // System.out.println("Found value: " + m.group(2) );
        // System.out.println("Found value: " + m.group(3) );
    //   count++;
    //   System.out.println("Match number "+count);
    //   System.out.println("start(): "+m.start());
    //   System.out.println("end(): "+m.end());
    // }
    // Date date = new Date();
    // System.out.println(date.toString());
    // SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss"); 
    // String strTime = ft.format(date);
    // System.out.println("当前时间：" + strTime);
    // double[] myList = {1.9, 2.9, 3.4, 3.5};
    // for(double item : myList){
    //   System.out.println(item);
    // }
      
    // String h = new String("zhangsan");
    // h = h.concat(", i love you.");
    // System.out.println(h);
    // String greeting = "菜鸟教程";
    // System.out.println(greeting);
    // char []helloArray = {'菜', '鸟', '教', '程'};
    // String strHello = new String(helloArray);
    // System.out.println(strHello);
    // char a = 'a';
    // char b = '\u039a';
    // System.out.println(a);
    // System.out.println(b);
    // char[] aa = {'a', 'b','c','d'};
    // System.out.println(aa);
    // 原始字符 'a' 装箱到 Character 对象 ch 中
    // Character ch = 'a';
    // System.out.println(ch);
    // 原始字符 'x' 用 test 方法装箱
    // 返回拆箱的值到 'c'
    // char c = test('x');
    // System.out.println(c);
    // int i = 100;
    // String name = "nihao ";
    // System.out.println(name);
    // int nameInt = Integer.valueOf(name);
    // System.out.println(getType(nameInt));
    // System.out.println(Integer.valueOf(name).intValue());
    // System.out.println(getType(i));
    // int [] numbers = {10, 20, 30, 40, 50};
    // for(int x : numbers ){
    //   System.out.print( x );
    //   System.out.print(",");
    // }
    // System.out.print("\n");
    // String []names ={"James", "Larry", "Tom", "Lacy"};
    // for( String name : names ) {
    //   System.out.print( name );
    //   System.out.print(",");
    // }
      // for(int x = 10, j = 4; x < 20 && j > 0; x = x+1) {
      //   if(x % 2 == 0){
      //     j--;
      //     System.out.print("value of x : " + x );
      //   }
      //   System.out.print("\n");
      // }
    // int i = 10;
    // while(i < 20){
    //   // System.out.println("value of i is: " + i++);
    //   System.out.print(String.format("value of i is: %d", i++));
    //   System.out.print("\n");
    // }
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
