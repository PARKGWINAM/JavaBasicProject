// ������
/*
 *  ó�� �� -> ��¸� �Ѵ� -> sysout
 *      -> ��� ���� �޾Ƽ� ó��(�����ų�) -> return
 *      
 *  ����ڷκ��� ���� �Ѱ� �޾Ƽ� ����ض� -> void (������ ��� ���� ���� ��)
 *  
 */
public class �ڹٸ޼ҵ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=3;
		gugudan(dan);
		
		star(3);
		System.out.println("��������:100");
		star(10);
		System.out.println("��������:90");
		star(10);
		System.out.println("��������:80");
		
	}
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
	}
	

	static void star(int count) 
	{
		for(int i=0; i<count; i++)
		
		System.out.print("��");
		}
}
