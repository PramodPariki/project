package programs;

public class operater {

	public static void main(String[] args) {
		int a=4,b=0,c=0;
		System.out.println(a++);
		b=++a;
		System.out.println("B value:"+b);//6
		System.out.println("A value:"+a);//6
		c=b++ + (++a);
		System.out.println("B value:"+b);//7
		System.out.println("c value:"+c);//13
		System.out.println("A value:"+a);//7
		a=c++;
		System.out.println("A value:"+a);//13
		System.out.println("b value:"+b);//7
		System.out.println("c value:"+c);//14
		c=++b + (++a);
		System.out.println("A value:"+a);//14
		System.out.println("b value:"+b);//8
		System.out.println("c value:"+c);//22
		
		
		
		

	}

}
