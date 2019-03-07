package animals;

public class Animal {
  protected String name;
  private int id;

  public Animal(String _name, int _id){
    this.name = _name;
    this.id = _id;
  }

  public void eat(){
    System.out.println("Animal eating...");
    System.out.println(this.name + " eating...");
  }

  public void sleep() {
    System.out.println(this.name + " sleeping...");
  }

  public void move(){
    System.out.println("动物可以移动.");
  }

  public void introduction() {
    System.out.println("大家好！我是"         + this.id + "号" + this.name + "."); 
  }
}