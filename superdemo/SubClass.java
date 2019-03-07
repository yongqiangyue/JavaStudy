package superDemo;

public class SubClass extends SuperClass {
  private int n;

  public SubClass(){
    System.out.println("SubClass");
  }

  public SubClass(int _n){
    super(300);
    this.n = _n;
    System.out.println("SubClass(int _n)");
  }
}