//**********************************************
//
//       Miguel A Rodriguez
//       CSC112
//**********************************************
	import java.util.Scanner;
public class division {


		public static void main(String[] args){
			
			int a,b;
         String another="";
		 do{	
		Scanner scan = new Scanner(System.in);
     
		
		System.out.println("Please enter Numerator: ");
		a = scan.nextInt();
		System.out.println("Please enter Denominator: ");
		b = scan.nextInt();
		
		long result = div(a, b);
		
		System.out.println(result);
		
	//}
 
   System.out.println("Would you like to continue<y or n>? ");
   another = scan.next();
   }while(another.equalsIgnoreCase("y"));
 }
		public static int div(int a, int b){
			if (b<0){
				a = a-a-a;
				b = b-b-b;
				
				
			}
			if(a<0)
				return -(div(-a, b));
			/*if(a - b==0)
				return 1;
			if (a<b)
				return 0;*/
           if(a==0)//checks for division by zero
            return 0;
          if(b==0)
          {
        System.out.println("Cannot be divided by zero!");
        return 0;
        }
      if(a==b)

       return 1;

    
     else if(a<b)

         return 0;       //recursive call
			else
         
				return (1+div(a-b,b));
		
		}
	}

