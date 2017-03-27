import java.util.*;

public class Main{
	public static void main(String []args){
		
			Driver D;  //inisialisasi Driver
			Zoo B;     //inisialisasi Zoo
			int opsi;
		 
			/* Inisialisasi Matriks boolean*/
			boolean[][] matriksb = new boolean[100][100];
			for (int i=0; i<B.height; i++)
			 for (int j=0; j<B.width; j++)
				 matriksb[i][j]=false;
			Stack<Character> s = new Stack<Character>();
			boolean finished = false;

			int startx = B.entranceX;
			int starty = B.entranceY;
			int finishx = B.exitX;
			int finishy = B.exitY;
			String rute= "";
			

			do{
			System.out.println();System.out.println();
			System.out.println("=================================");
			System.out.println("===========MAIN MENU=============");
			System.out.println("=================================");
			System.out.println("=================================");
			System.out.println("=== 1. Display Virtual Zoo   ====");
			System.out.println("=== 2. Tour Virtual Zoo      ====");
			System.out.println("=== 3. Display Animal Zoo    ====");
			System.out.println("=== 4. Display Food Animal   ====");
			System.out.println("=== 5. Exit                  ====");
			System.out.println("=================================");
			System.out.println();System.out.println();
			System.out.println( "Input  : ");
			Scanner sc = new Scanner(System.in);
			opsi = sc.nextInt(); 
		
			if(opsi == 1) {
				int a,b,c,d;
				System.out.println(" Masukan kordinat kiri : "); a = sc.nextInt(); 
				System.out.println(" Masukan kordinat atas : "); b = sc.nextInt(); 
				System.out.println(" Masukan kordinat kanan: "); c = sc.nextInt();  
				System.out.println(" Masukan kordinat bawah: "); d = sc.nextInt(); 
				D.DisplayMap(B,a,b,c,d);
			}
			else
			if(opsi == 2) {
				System.out.println( "Entrance : " + "(" + startx + "," + starty + ")" );
				System.out.println( "Exit     : " + "(" + finishx + "," + finishy + ")" );
				D.GenerateRoute(B,matriksb, startx, starty, finishx,  finishy, B.height, B.width,finished,s,rute);
				System.out.println( "LETS TOUR AROUND THE ZOO!");System.out.println();
				D.TourZoo(B,startx,starty,rute);
			}
			else
			if(opsi == 3)
				D.PrintDaftarBinatang(B);
			else
			if(opsi == 4)
				D.PrintDataMakananHewan(B);
			}
			while(opsi != 5);
		}
}
