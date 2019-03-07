package superdemo;

public class SuperClass {
  private int n;

  public SuperClass(){
    System.out.println("SuperClass");
  }

  public SuperClass(int _n){
    this.n = _n;
    System.out.println("SuperClass(int _n)");
  }

  protected int getSuperN(){
    return this.n;
  }
}