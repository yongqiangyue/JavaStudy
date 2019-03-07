package animals;

public class Penguin extends Animal implements Common {
  public Penguin(String _name, int _id){
    super(_name, _id);
  }
  public void show(){
    System.out.println("my name is " + this.name);
  }
}