package WorkObject;
import java.util.Scanner;

public class WorkObject {
	static Scanner scanner = new Scanner(System.in); // ���� �Է� ����
	static int Max=scanner.nextInt();
	static int count=Max;//ī��Ʈ ���� �ʱⰪ�� Max(�Է� ���� ��)
	
	public synchronized void methodA() { //����ȭ�� �޼ҵ� a
		WorkObject.count--; //ī��Ʈ ���� 1�� ����
		System.out.println("ThreadA ����  : " + count );
		notify(); //������
		try {
			wait(); //�Ͻ�����
		} catch (InterruptedException e) {
		}
		notifyAll();
	}

	public synchronized void methodB() { //����ȭ�� �޼ҵ� b
		WorkObject.count--;//ī��Ʈ ���� 1�� ����
		System.out.println("ThreadB ����  : "+ count);
		notify(); //��� ����
		try {
			wait(); //�Ͻ�����
		} catch (InterruptedException e) {
			}
		notifyAll();
		}
	
}