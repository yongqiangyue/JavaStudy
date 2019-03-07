package superDemo;

public class SubClass2 extends SuperClass {
  private int n;

  public SubClass2(){
    System.out.println("SubClass2");
  }

  public SubClass2(int _n){
    super(300);
    this.n = _n;
    System.out.println("SubClass2(int _n)");
  }

  public int getNum() {
    System.out.println("SuperClass's n:" + super.getSuperN());
    System.out.println("SubClass2's n:" + this.n);
    return this.n;
  }
}