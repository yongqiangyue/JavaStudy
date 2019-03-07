import animals.Animal;
import animals.Mouse;
import animals.Penguin;
import superdemo.SubClass;
import superdemo.SubClass2;

public class Main{
  public static void main(String []args ) {

    Animal a = new Mouse("yueyq", 1);
    a.move();
    if(a instanceof Mouse){
      Mouse m = (Mouse)a;
      m.move();
    }

    // System.out.println("------SubClass 类继承------");
    // SubClass sc1 = new SubClass();
    // SubClass sc2 = new SubClass(100); 
    // System.out.println("------SubClass2 类继承------");
    // SubClass2 sc3 = new SubClass2();
    // SubClass2 sc4 = new SubClass2(200); 
    // System.out.println(sc4.getNum());
    // Animal a = new Animal("yueyq", 1);
    // a.eat();
    // Mouse m = new Mouse("zhangsan", 2);
    // m.eatTest();
    // a.sleep();
    // a.introduction();
    // System.out.println("");
    // Penguin b = new Penguin("zhangsc", 2);
    // b.eat();
    // b.sleep();
    // b.introduction();
    // b.show();
  }
}