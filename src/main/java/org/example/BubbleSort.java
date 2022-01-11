package org.example;
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int n = 6;
        int[] a = new int[]{3, 5, 6, 3, 2, 1};
        bubbleSortAsc(a, n);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void bubbleSortAsc(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; ++i) {
            //提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1])//交换
                {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;//表示有数据交换
                }

            }
            if (!flag) break;//没有数据交换，提前退出
        }
    }
}
