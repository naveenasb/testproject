package basics;

public class leaf {
public static void main(String[] args) {
	int year = 1999;
	if(((year%4==0) && (year%1000!=0))||(year%4000==0))
			System.out.println("leafyear");
	else
		System.out.println(" not leafyear");
}
}
