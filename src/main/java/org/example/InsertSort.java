package org.example;
//插入排序
public class InsertSort {
    public static void main(String[] args)
    {

        int n=6;
        int[] a =new int[]{3,5,6,3,2,1};
        insertionSort(a,n);
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void insertionSort(int[] a ,int n)
    {
        if (n<=1) return;
        for (int i=1;i<n;++i)
        {
            int value=a[i];//保存需要插入的元素，便于后续移动元素时，覆盖对应下标的元素
            int j=i-1;//从需要插入元素下标的前一个位置开始
            //查找插入的位置
            for (;j>=0;--j)
            {
                if (a[j]>value)//比较数值比要插入数值大，相等的不进行交换
                {
                    a[j+1]=a[j];//交换数据
                }
                else
                {
                    break;//退出内部for循环
                }
            }
            a[j+1]=value;//插入数据,j+1是因为第二层for循环结束之后，会让j多减1，所有需要加回来
        }
    }
}
