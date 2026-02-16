package IterativeStatement;

public class continuoustatementexample {

			public static void main(String[] args) {
				for (int i =1; i<=10;i++) {
					if (i == 7){
						System.out.println("Skipping at i ="+i);
						continue;
					}
					System.out.println("i=" +i);
				}
				
			}

		
	}


