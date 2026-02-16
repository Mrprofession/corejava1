package IterativeStatement;

public class breakstatementexp1 {

	public static void main(String[] args) {
		for (int i =1; i<=10;i++) {
			if (i == 7){
				System.out.println("Breaking at i ="+i);
				break;
			}
			System.out.println("i=" +i);
		}
		
	}

}
