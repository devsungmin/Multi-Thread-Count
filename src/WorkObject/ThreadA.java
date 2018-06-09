package WorkObject;

public class ThreadA extends Thread {
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() { //출력 되는 부분
		while(true) {
			if(workObject.count!=0)//입력한 값이 0이 아니면
				workObject.methodA(); //메소드A 호출
			else
				break;//멈춘다
		}
	}
}
