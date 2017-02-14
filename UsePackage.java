//Filename UsePackage.java
//Written by William Bartel
//Written on 09/30/2016

public class UsePackage
{
   public static void main(String[] args)
   {
      // Initializing Package class with different argument values for weight and shipping method
      Package package1 = new Package(5, 'A');
      package1.display();
      Package package2 = new Package(15, 'T');
      package2.display();
      Package package3 = new Package(25, 'M');
      package3.display();

      // Initializing InsuredPackage class with different argument values for weight and shipping method
      InsuredPackage ipackage1 = new InsuredPackage(5, 'A');
      ipackage1.display();
      InsuredPackage ipackage2 = new InsuredPackage(15, 'T');
      ipackage2.display();
      InsuredPackage ipackage3 = new InsuredPackage(25, 'M');
      ipackage3.display();
   }
}