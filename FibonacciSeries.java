package assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=8 , firstNum=0, secondNum=1;
System.out.println("Fibonacxi Series till " + n );
for (int i=0; i<= n; ++i) {

    System.out.println(firstNum);
     int nextNum = firstNum+secondNum;
    firstNum=secondNum;
    secondNum=nextNum;
	
}

	}

}
