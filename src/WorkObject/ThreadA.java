package WorkObject;

public class ThreadA extends Thread {
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() { //��� �Ǵ� �κ�
		while(true) {
			if(workObject.count!=0)//�Է��� ���� 0�� �ƴϸ�
				workObject.methodA(); //�޼ҵ�A ȣ��
			else
				break;//�����
		}
	}
}
