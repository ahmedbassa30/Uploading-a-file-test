package com;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
   int NumberofAmount1;
   int NumberofAmount2;
   int NumberofAmount3;
   String Item1;
   String Item2;
   String Item3;
   int price1;
   int price2;
   int price3;
   
   
   Scanner sc= new Scanner(System.in);
   Item1= sc.next();
   System.out.println("ادخل الصنف الاول");
   NumberofAmount1=sc.nextInt();
   System.out.println("ادخل الكمية");
   
   price1= sc.nextInt();
   System.out.println("ادخل السعر");
   
  //System.out.println("الاجمالي"+(price1*NumberofAmount1));
  Item2=sc.next();
  System.out.println(" ادخل الصنف الثاني");
  NumberofAmount2=sc.nextInt();
  System.out.println("ادخل الكمية");
  price2=sc.nextInt();
  System.out.println("ادخل السعر");
 // System.out.println("الاجمالي١+(price*NumberofAmount));
  Item3=sc.next();
  System.out.println("ادخل الصنف الثالث");
  NumberofAmount3=sc.nextInt();
  System.out.println("ادخل الكمية");
  price3=sc.nextInt();
  System.out.println("ادخل السعر");
 // System.out.println("الاجمالي"+(price*NumberofAmount));

  if
  (price1*NumberofAmount1);
  {
  System.out.println("الاجمالي"+(price1*NumberofAmount1));
  }
  
  else if
  (price2*NumberofAmount2+price1*NumberofAmount1);
  { System.out.println(price2*NumberofAmount2+price1*NumberofAmount1);
 }
 else
 //(price1*NumberofAmount1+price2*NumberofAmount2+price3*NumberofAmount3):
{ System.out.println(price1*NumberofAmount1+price2*NumberofAmount2+price3*NumberofAmount3);
}
  
  
}
}
