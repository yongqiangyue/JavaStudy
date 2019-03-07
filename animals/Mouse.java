package animals;

public class Mouse extends Animal {
  public Mouse(String _name, int _id){
    super(_name, _id);
  }

  public void eat(){
    System.out.println("Mouse eating...");
  }
  public void eatTest() {
    this.eat();   // this 调用自己的方法
    super.eat();  // super 调用父类方法
    System.out.println(super.name);
  }

  public void move(){
    System.out.println("老鼠可以跑.");
  }
}