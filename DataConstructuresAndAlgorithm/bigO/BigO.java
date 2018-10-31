package bigo;
/*
 * Let's suppose the run time of every line is unit_time
 */
public class BigO {

	int cal1(int n) {
		int sum = 0;				//unit_time * 1
		int i = 1;				//unit_time * 1
		for(; i <= n; ++i) {			//unit_time * n
			sum = sum + i;			//unit_time * n
		}
		return sum;				//sum the above, total is (2n+2)*unit_time
	}
	
	int cal2(int n) {
		int sum = 0;				//unit_time * 1
		int i = 1;				//unit_time * 1
		int j = 1;				//unit_time * 1
		for(; i <= n; ++i) {			//unit_time * n
			j = 1;				//unit_time * n
			for(; j <= n; ++j) {		//unit_time * n^2
				sum = sum + i * j;	//unit_time * n^2
			}
		}
		return sum;				//sum the above, total is (2n^2+2n+3)*unit_time
	}
	/*
	 * conclusion:
	 * 所有代码的执行时间T(n)与每行代码的执行次数成正比。
	 *  			T(n) = O(f(n))
	 *  T(n):	表示代码执行时间
	 *  n:		表示数据规模大小
	 *  f(n):	表示每行代码的执行次数总和，是一个表达式
	 *  O:		表示代码的执行时间T(n)与f(n)表达式成正比
	 *  
	 *  所以cal1方法中: T(n)=O(2n+2), cal2方法中: T(n)=O(2n^2+2n+3)
	 *  
	 *  这就是	大O时间复杂度表示法
	 *  它并不表示代码真正执行的时间，而是表示代码执行时间随数据规模增长的变化趋势，
	 *  所以也叫渐进时间复杂度(asymptotic time complexity)，简称时间复杂度。
	 *  
	 *  当n很大时，公式中的低阶、常量、系数三部分并不左右增长趋势，所以都可以忽略，
	 *  只需记录一个最大量级就可以了，故上面两段代码的时间复杂度分别可以表示为：
	 *  	T(n) = O(n);		T(n) = O(n^2);
	 */
	
	/*
	 * 时间复杂度分析的技巧：
	 * 	1. 只关注循环执行次数最多的一段代码。 如：cal1中只关心10/11行代码
	 * 	2. 加法法则：总复杂度等于量级最大的那段代码的复杂度。
	 * 		如果 T1(n) = O(f(n), T2(n) = O(g(n)), 那么：
	 * 		T(n) = T1(n)+T2(n) = max(O(f(n)),O(g(n))) = O(max(f(n),g(n)))
	 * 	3. 乘法法则：嵌套代码的复杂度等于嵌套内外代码复杂度的乘积。
	 * 		如果 T1(n) = O(f(n), T2(n) = O(g(n)), 那么：
	 * 		T(n) = T1(n)*T2(n) = O(f(n))*O(g(n)) = O(f(n)*g(n))
	 * 
	 * 常见的时间复杂度量级： 
	 * 	常量阶		O(1)
	 * 	对数阶		O(logn)
	 * 	线性阶		O(n)
	 * 	线性对数阶	O(nlogn)
	 * 	平方阶		O(n^2)		立方阶	O(n^3)		k次方阶	O(n^k)
	 * 	指数阶		O(2^n)
	 * 	阶乘阶		O(n!)
	 * 	
	 */
	
	/*
	 * 空间复杂度 全称 渐进空间复杂度(asymptotic space complexity)
	 * 表示算法的存储空间与数据规模之间的增长关系。
	 * 常见的空间复杂度： O(1), O(n), O(n^2)
	 */
}
