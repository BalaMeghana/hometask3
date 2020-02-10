package epamhometask3;

public class CalAppli implements Methods {
	public int sum=0,sub=0,mul=1,div=1;

	public int Add(int a, int b) {
		sum=a+b;
		return sum;
	}

	public int Subtract(int a, int b) {
		if(a>b){
			sub=sub-(a-b);
		}
		else{
			sub=sub-(b-a);
			
		}
		return sub;
	}

	public int Multiply(int a, int b) {
		mul=mul*(a*b);
		return mul;
	}

	public int Division(int a, int b) {
		try{
			div=(a/b);
			return div;
		}catch(ArithmeticException e){
			System.out.print(e);
			return 0;
		}
		
	}
	


}
