

abstract class hey {

   abstract void color();
  abstract void color1();
  public void color2()
  {
    System.out.println("color orange");
  }

}

class bey extends hey{
    @Override
    void color() {
        System.out.println("color res");
    }
    @Override
    void color1() {
        System.out.println("color");
    }
}

class Main {
public static void main(String[] args) {
     
    bey b=new bey();

    b.color();
    b.color1();
    b.color2();

}
    
}
