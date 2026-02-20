package MultipleInheritance;

public class Cub implements Lion,Lioness {
	
	void play() {
		System.out.println("Baby is playing ");
	}

	@Override
	public void hunting() {
		System.out.println("She is hunting");
		
	}

	@Override
	public void roar() {
		System.out.println("He is roaring");
		
	}
}
