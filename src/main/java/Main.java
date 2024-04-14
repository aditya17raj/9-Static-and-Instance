public class Main {
    public static class demo
  {
      int a = 10;
      static int b = 20;

      {
          System.out.println("hello from instance block");
      }

      static
      {
          System.out.println("hello from static block");
      }

      void show(){
          System.out.println("hello from void show");
      }

      static void showdetails(){
          System.out.println("hello from void showdetails");
      }
  }
  public static void main(String[] args) {
    demo dd = new demo();
    dd.show();
  }

}