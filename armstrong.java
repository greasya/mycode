public class Amstrong {

	public static void main(String[] args) {
		 int num = 370,  temp, total = 0 ;
int number=num;
	        
	        while (num > 0)
	        {
	            temp = num % 10;    //3 5 1
	            total = total + temp*temp*temp;  //0+3*3*3=27  27= 27+5*5*5=152 152=152+*1*1*1=153
	            num= num/10;  //153/10= 15   //15/10=1  1=1/10=0
	        }
	        System.out.println(total);
	        if(number==total)
	        {
	            System.out.println( "is an Armstrong number");	        }
	        else 
	        {
	            System.out.println( " is not an Armstrong number");	        	

	        }
	}
	
}