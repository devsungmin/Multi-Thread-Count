/*
 * ���α׷� ���� : ��Ƽ�����带 �̿��� ī����
 * ������ : �輺��(2015244055)
 * ���� ���� ��¥ : 18.06.04
 * ����  ���� ��¥ : 18.06.09
 * �䱸���� :
 * 1. ���α׷��� ���۵Ǹ� ����ڴ� ī������  Max��(����)�� �Է��Ѵ�. �׸��� �Էµ�  Max���� ���� ��ü�� �ʵ��� count�� �ʱⰪ���� ���ȴ�.
 * 2. ���ν������ 2���� ������(threadA,threadB)�� �����ϰ�, ������ 2���� ��������� ���� ��ü�� �ʵ��� count�� �����ư��鼭 1�� ���ҽ�Ų��.
 * 3. �� �����尡 count�� 1���ҽ�ų�� ���� � �����尡 ���� ���ҽ��״����� ���ҵ� count���� �Բ� ��½�Ų��.
 * 4. �� ������� count���� 0�� ���� �ϸ� ����ȴ�.
 * 5. �� �����尡 ����ɶ� �������� ���Ḧ �˸��� �޼����� ��µȴ�.
 * 6. ���ν������ �� �����尡 ��� ����Ǹ� ���� ���� ��ü�� count���� ��½�Ű�� ���α׷��� �����Ѵ�.
 */

package WorkObject;

public class waitNotifyExample {
	public static void main(String[] args) {
		
		System.out.print("Enter Max Value : ");
		
		WorkObject sharedObject = new WorkObject(); // ���� ��ü�� ����
		ThreadA threadA = new ThreadA(sharedObject); //threadA ��ü�� ����
		ThreadB threadB = new ThreadB(sharedObject); //threadB ��ü�� ����
		
		threadA.start(); //threadA ����
		threadB.start(); //threadB ����
		
		//������ ���� ��� 
		try {
			threadA.join();
			System.out.println("End Thread A");
			threadB.join();
			System.out.println("End Thread B");
			
		} catch (Exception e) {
			//System.out.println("Interrupted!!");
		}
		System.out.println("��� : " +(sharedObject.count));
	}
}
