package WorkObject;
import java.util.Scanner;

public class WorkObject {
	static Scanner scanner = new Scanner(System.in); // 값을 입력 받음
	static int Max=scanner.nextInt();
	static int count=Max;//카운트 변수 초기값은 Max(입력 받은 값)
	
	public synchronized void methodA() { //동기화된 메소드 a
		WorkObject.count--; //카운트 변수 1씩 감소
		System.out.println("ThreadA 동작  : " + count );
		notify(); //대기상태
		try {
			wait(); //일시정지
		} catch (InterruptedException e) {
		}
		notifyAll();
	}

	public synchronized void methodB() { //동기화된 메소드 b
		WorkObject.count--;//카운트 변수 1씩 감소
		System.out.println("ThreadB 동작  : "+ count);
		notify(); //대기 상태
		try {
			wait(); //일시정지
		} catch (InterruptedException e) {
			}
		notifyAll();
		}
	
}