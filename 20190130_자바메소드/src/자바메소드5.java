// ������X, �Ű����� X
/*
 * 	��ü ����� ����� �� : 
 * 	������X, �Ű�����(O) : �۾���, ����, ����...
 * 
 * 	������ ��ü ���
 * 
 * 	->������ �ߺ��̸��� ������ �� ����
 *   �޼ҵ�� �ߺ��̸��� ������ �� �ִ�.
 */
public class �ڹٸ޼ҵ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan();
	}
	static void gugudan() //�����ذ��� ���� �޴°��� ���� �׳� ���
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=2; j<=9; j++) //��
			{
				System.out.printf("%d*%d=%2d\t",j,i,j*i);//������ ��� ����
			}
			System.out.println();
		}
	}
}
