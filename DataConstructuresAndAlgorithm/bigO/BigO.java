package bigo;
/*
 * Let's suppose the run time of every line is unit_time
 */
public class BigO {

	int cal1(int n) {
		int sum = 0;				//unit_time * 1
		int i = 1;					//unit_time * 1
		for(; i <= n; ++i) {		//unit_time * n
			sum = sum + i;			//unit_time * n
		}
		return sum;					//sum the above, total is (2n+2)*unit_time
	}
	
	int cal2(int n) {
		int sum = 0;				//unit_time * 1
		int i = 1;					//unit_time * 1
		int j = 1;					//unit_time * 1
		for(; i <= n; ++i) {		//unit_time * n
			j = 1;					//unit_time * n
			for(; j <= n; ++j) {	//unit_time * n^2
				sum = sum + i * j;	//unit_time * n^2
			}
		}
		return sum;					//sum the above, total is (2n^2+2n+3)*unit_time
	}
	/*
	 * conclusion:
	 * ���д����ִ��ʱ��T(n)��ÿ�д����ִ�д��������ȡ�
	 *  			T(n) = O(f(n))
	 *  T(n):	��ʾ����ִ��ʱ��
	 *  n:		��ʾ���ݹ�ģ��С
	 *  f(n):	��ʾÿ�д����ִ�д����ܺͣ���һ�����ʽ
	 *  O:		��ʾ�����ִ��ʱ��T(n)��f(n)���ʽ������
	 *  
	 *  ����cal1������: T(n)=O(2n+2), cal2������: T(n)=O(2n^2+2n+3)
	 *  
	 *  �����	��Oʱ�临�Ӷȱ�ʾ��
	 *  ��������ʾ��������ִ�е�ʱ�䣬���Ǳ�ʾ����ִ��ʱ�������ݹ�ģ�����ı仯���ƣ�
	 *  ����Ҳ�н���ʱ�临�Ӷ�(asymptotic time complexity)�����ʱ�临�Ӷȡ�
	 *  
	 *  ��n�ܴ�ʱ����ʽ�еĵͽס�������ϵ�������ֲ��������������ƣ����Զ����Ժ��ԣ�
	 *  ֻ���¼һ����������Ϳ����ˣ����������δ����ʱ�临�Ӷȷֱ���Ա�ʾΪ��
	 *  	T(n) = O(n);		T(n) = O(n^2);
	 */
	
	/*
	 * ʱ�临�Ӷȷ����ļ��ɣ�
	 * 	1. ֻ��עѭ��ִ�д�������һ�δ��롣 �磺cal1��ֻ����10/11�д���
	 * 	2. �ӷ������ܸ��Ӷȵ������������Ƕδ���ĸ��Ӷȡ�
	 * 		��� T1(n) = O(f(n), T2(n) = O(g(n)), ��ô��
	 * 		T(n) = T1(n)+T2(n) = max(O(f(n)),O(g(n))) = O(max(f(n),g(n)))
	 * 	3. �˷�����Ƕ�״���ĸ��Ӷȵ���Ƕ��������븴�Ӷȵĳ˻���
	 * 		��� T1(n) = O(f(n), T2(n) = O(g(n)), ��ô��
	 * 		T(n) = T1(n)*T2(n) = O(f(n))*O(g(n)) = O(f(n)*g(n))
	 * 
	 * ������ʱ�临�Ӷ������� 
	 * 	������		O(1)
	 * 	������		O(logn)
	 * 	���Խ�		O(n)
	 * 	���Զ�����	O(nlogn)
	 * 	ƽ����		O(n^2)		������	O(n^3)		k�η���	O(n^k)
	 * 	ָ����		O(2^n)
	 * 	�׳˽�		O(n!)
	 * 	
	 */
	
	/*
	 * �ռ临�Ӷ� ȫ�� �����ռ临�Ӷ�(asymptotic space complexity)
	 * ��ʾ�㷨�Ĵ洢�ռ������ݹ�ģ֮���������ϵ��
	 * �����Ŀռ临�Ӷȣ� O(1), O(n), O(n^2)
	 */
}
