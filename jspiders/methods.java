class tri
{
  static double triangle(double c,double d)
  {
    double a=c*d/2;
    System.out.println("the area of the triangle is "+a);
  }
  static void rect(int a,int b)
  {
    int d=a*b;
    System.out.println("the area of the rectangle is:"+d);
  }
  static void trapez(int a,int b,int h)
  {
    int result=(a+b)+h/2;
    System.out .println("the area of the trapez is " +result);
  }
  public static void main(String[] args) 
  {
    triangle(56.2,8.8);
    rect(10,20);
    trapez(30,40,50);
    
  }
  }
        
    