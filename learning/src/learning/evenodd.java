package learning;

public class evenodd {
public static void main(String[] args) {
	int num = 667;
	boolean flag=((num&1)==0)?true:false;
	if(flag)
	{
       System.out.println(+num+"is even numbetr");
     }
else
    {
	System.out.println(+num+"is odd numbetr");	
     }
}
}
