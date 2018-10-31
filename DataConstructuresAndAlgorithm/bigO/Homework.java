package bigo;

public class Homework {
	int array[] = new int[10]; //大小为10的数组array
	int len = 10; //长度len
	int i = 0; //下标i
	
	//往数组中添加一个元素
	void add(int element) {
		if(i >= len) { //数组空间不够了
			//重新申请一个2倍大小的数组空间
			int new_array[] = new int[len*2];
			//把原来的array数组中的数据一次copy到new_array
			for(int j = 0; j < len; ++j) {
				new_array[j] = array[j];
			}
			//new_array复制給array，array现在大小就是2倍的len了
			array = new_array;
			len = 2 * len;
		}
		//将element放到下标为i的位置，下标i加1
		array[i] = element;
		++i;
	}
	/*
	 * 分析：
	 * 最理想的情况下，数组array有空闲空间，直接插入元素，所以最好情况时间复杂度是O(1)。
	 * 最糟糕的情况下，数组array没有空闲空间，需要创建两倍长的数组，并遍历数组，所以最坏情况时间复杂度是O(n)。
	 * 经分析，每次O(n)的时间复杂度的操作之后，都会有n此复杂度为O(1)的操作，所以均摊时间复杂度为O(1)。
	 */
}
