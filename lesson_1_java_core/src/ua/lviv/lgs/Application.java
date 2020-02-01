package ua.lviv.lgs;

public class Application {
public static void main(String[] args) {
	
	 //========================== 1
	int a = 5;
	boolean b = true;
	double c = 24.44;
	byte d = 21;
	short e = -1;
	char f = 'f';
	long g = -234l;
	float h = 56899764f;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	
	int a1 = 45;
	boolean a2 = false;
	double a3 = 34.74;
	byte a4 = 11;
	short a5 = -1;
	char a6 = 'a';
	long a7 = -1234l;
	float a8 = 156899764f;
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	System.out.println(a5);
	System.out.println(a6);
	System.out.println(a7);
	System.out.println(a8);
	
	 //========================== 2
	int num1 = 13;
	int num2 = 192;
	System.out.println(Math.max(num1,num2));
	
	int num3 = -2;
	int num4 = -4;
	System.out.println(Math.min(num3, num4));
	
	long l1 = -113l;
	int l2 = 192;
	System.out.println(Math.max(l1,l2));
	
	float f1 = 567890;
	int f2 = -4;
	System.out.println(Math.min(num3, num4));
	
	 //========================== 3
	
		int[] array1 = { 3, 4, 8, 10, 14, 16, 19, 22, 31, 55 };
		int k = array1.length;

		int max = array1[0];
		int min = array1[0];
		for (int i = 0; i < array1.length; i++) {
			if (max < array1[i])
				max = array1[i];
			if (min > array1[i])
				min = array1[i];
			System.out.println("Max:" +max);
			System.out.println("Min:" +min);
			System.out.println(array1[i]);
			System.out.println(k);

		}

	}
}
