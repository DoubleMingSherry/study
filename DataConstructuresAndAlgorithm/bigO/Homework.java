package bigo;

public class Homework {
	int array[] = new int[10]; //��СΪ10������array
	int len = 10; //����len
	int i = 0; //�±�i
	
	//�����������һ��Ԫ��
	void add(int element) {
		if(i >= len) { //����ռ䲻����
			//��������һ��2����С������ռ�
			int new_array[] = new int[len*2];
			//��ԭ����array�����е�����һ��copy��new_array
			for(int j = 0; j < len; ++j) {
				new_array[j] = array[j];
			}
			//new_array���ƽoarray��array���ڴ�С����2����len��
			array = new_array;
			len = 2 * len;
		}
		//��element�ŵ��±�Ϊi��λ�ã��±�i��1
		array[i] = element;
		++i;
	}
	/*
	 * ������
	 * �����������£�����array�п��пռ䣬ֱ�Ӳ���Ԫ�أ�����������ʱ�临�Ӷ���O(1)��
	 * ����������£�����arrayû�п��пռ䣬��Ҫ���������������飬���������飬��������ʱ�临�Ӷ���O(n)��
	 * ��������ÿ��O(n)��ʱ�临�ӶȵĲ���֮�󣬶�����n�˸��Ӷ�ΪO(1)�Ĳ��������Ծ�̯ʱ�临�Ӷ�ΪO(1)��
	 */
}
