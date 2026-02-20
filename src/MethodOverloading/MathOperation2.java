package MethodOverloading;

public class MathOperation2 {

	void show(String msg , int num) {
		System.out.println("Name :"+msg+" ,Roll Number :"+num);
	}
	void show(int num , String msg) {
		System.out.println("Roll Number :"+num+", Name :"+msg);
}
}
