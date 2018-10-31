package bigo;
/*
 * 最好情况时间复杂度(best case time complexity)
 * 最坏情况时间复杂度(worst case time complexity)
 * 平均情况时间复杂度(average case time complexity)
 * 均摊时间复杂度(amortized time complexity)
 */
public class TimeComplexity {

	//n means the length of this array
	int find(int[] array, int n, int x) {
		int i = 0;
		int pos = -1;
		for(; i < n; ++i) {
			if(array[i] == x) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	/*
	 * 最理想的情况下，x恰好是数组的第一个元素，这个时候对应的时间复杂度就是 最好情况时间复杂度。
	 * 最糟糕的情况下，x不在要查找的数据中，需要遍历整个数组，这个时候对应的时间复杂度就是 最坏情况时间复杂度。
	 */
	
	/*
	 * 平均情况时间复杂度 分析：
	 * 在查找x的过程中有n+1中情况：在数组0~n-1位置中和不在数组中。
	 * 把每种情况下查找需要遍历的元素个数加起来再除以n+1，即得到需要遍历的元素个数的平均值：
	 * 		（1+2+3+···+n+n)/n+1 = n(n+3)/2(n+1)
	 * 忽略系数、低阶、常量，得到平均时间复杂度为O(n)。
	 * 
	 * 上述分析过程没有考虑各个情况出现的概率，因此分析过程有点儿问题。考虑概率问题：
	 * 假设变量x在数组里和不在数组里的概率都是1/2，查找数据出现在0~n-1这n个位置的概率一样，即为(1/n)*(1/2)=1/2n
	 * 这样平均时间复杂度的计算过程就是：
	 * 		1*(1/2n) + 2*(1/2n) + 3*(1/2n) + ··· + n*(1/2n) + n*1/2 = (3n+1)/4 =O(n)【去掉系数和常量】
	 * 这个值就是概率论中的加权平均值，也叫期望值，所以平均时间复杂度全称应该叫
	 * 加权平均时间复杂度 或者 期望时间复杂度。
	 */
	
	/*
	 * 均摊时间复杂度 分析【摊还分析 或者叫 平摊分析】
	 */
	void insert(int[] array, int val){
		int count = 0;
		if(count == array.length) {
			int sum = 0;
			for(int i = 0; i < array.length; ++i) {
				sum = sum + array[i];
			}
			array[0] = sum;
			count = 1;
		}
		array[count] = val;
		++count;
	}
}
