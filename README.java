# joke
import.jav.util.*;
class PrimeCheck
{ public static void main()
 { int num,tmp;
   boolean c;
  System.out.println("Enter a number for check:");
  Scanner s= new Scanner(System.in);
  num=s.nextInt();
  for(int i=2;i<=num/2;++i)
    { tmp=num%i;
      if(tmp==0)
      c=false
      { System.out.println(num + " is not Prime Number");}
    }
    else if(tmp!=0)
      {c=true; 
     System.out.println(num + " is not Prime Number");}
  
 
 }


}
