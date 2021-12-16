package week02;

import java.util.Arrays;
import java.util.Scanner;

public class KLOK {
	public static void main(String[] args) {
		final int N=5;
		double[] a=new double[N];
		Scanner sc=new Scanner(System.in);
		double sum=0;//计数器
		for(int i=0;i<a.length;i++) {
			System.out.println("请输入第"+(i+1)+"个评委的成绩：");
			a[i]=sc.nextDouble();
			sum+=a[i];
		}
		Arrays.sort(a);//对数组进行升序排序
		double grade=(sum-a[0]-a[a.length-1])/(N-2);
		//double[] b=Arrays.copyOfRange(a, 2, 5);复制a数组2-5（不包括5）到b中
		System.out.printf("总成绩%.2f,最高分%.2f,最低分%.2f",grade,a[a.length-1],a[0]);
		
	}
}
