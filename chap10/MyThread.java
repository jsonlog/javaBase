// �̳�Tread��
public class MyThread extends Thread
{ // count��������ͳ�ƴ�ӡ�Ĵ������������
	private static int count = 0;

	public MyThread(String name)
	{
		super(name);
	}

	public static void main(String[] args)
	{// main������ʼ
		MyThread p = new MyThread("t1"); // ����һ���߳�ʵ��
		p.start(); // ִ���߳�
		// ���߳�main����ִ��һ��ѭ��
		for (int i = 0; i < 5; i++) {
			count++;
			// ���߳��д�ӡcount+��main��������ֵ��������
			System.out.println(count + ": main");
		}
	}

	public void run()
	{// �߳�������е�run��������
		for (int i = 0; i < 5; i++) {
			count++;
			System.out.println(count + ":" + this.getName());
		}
	}
}
