package WorkObject;

public class ThreadB extends Thread{
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject ) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {  // ��� �Ǵ� �κ�
		while(true) {
			if(workObject.count!=0)//count���� 0�� �ƴϸ�
				workObject.methodB(); //�޼ҵ�B ȣ��
			else
				break; //�����
		}
	}
}
