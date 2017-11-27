import java.util.Scanner;


public class Stars  	{
	public void printStars()	{
	
	
	int z;
		Scanner input = new Scanner(System.in);

	System.out.println("Masukkan Nilai : ");
	z=input.nextInt();

	for(int i=0;i<z;i++){
		
			for(int j=0;j<z;j++){
		System.out.print("*");
		
	}
	System.out.println("");
	}
	}
	

}