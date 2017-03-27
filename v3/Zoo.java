package Zoo;
/* import Cell
 * import cage
 * import airhabitat,landhabitat,airhabitat
 * import animal
 * import park, restaurant, road
 */

import java.io.*;
import java.util.*;

public class Zoo{

  public Cell[][] kotak;
  public Cage kandang;
  public Animal[] daftarBinatang;
  int sumAnimal;
  int height;
  int width;
  int[] pintuX = new int[10];
  int[] pintuY = new int[10];
  int numPintu;
  int entranceX, entranceY, exitX, exitY;
  	
  public Zoo(){
    /*Inisiasi banyaknya pintu*/
	numPintu = 0;
	sumAnimal = 0;
		
	/*Inisiasi panjang dan lebar map*/
	height = 15; width = 50;
	/*Inisiasi objek-objek Cell yang berupa Habitat atau Facility*/
	kotak = new Cell[15][50];

	String path = "D:\\ITB\\Informatics\\Semester 4\\oop\\tubes1\\v2 v3 cpp\\v3\\Map.txt";
	try (BufferedReader br = new BufferedReader(new FileReader(path))){
	  String sCurrentLine;
	  int str,x=0;
	  while ((sCurrentLine = br.readLine() != null) && (sCurrentLine.charAt(0)!='C')) {
	  	str = sCurrentLine.length();
	  	for (int i = 0; i < str; i++){
	  		if (sCurrentLine.charAt(i)=='|'){
	  		  //kotak[x][i] = new Road();
	  		  kotak[x][i].SetPembeda(sCurrentLine.charAt(i));
	  		  if(x==0 || x==height-1 || i==0 || i==width-1){
	  		  	pintuX[numPintu] = x;
	      		pintuY[numPintu] = i;
		  		numPintu++;
	  		  }
	  		}
	  		else if (sCurrentLine.charAt(i)=='R'){
	  		  //kotak[x][i] = new Restaurant();
		  	  kotak[x][i].SetPembeda('R');
	  		}
	  		else if (sCurrentLine.charAt(i)=='P'){
	  		  //kotak[x][i] = new Park();
		  	  kotak[x][i].SetPembeda('P');
	  		}
	  		else if (sCurrentLine.charAt(i)=='*'){
	  		  //kotak[x][i] = new Habitat();
	  		  kotak[x][i].SetPembeda('*');
	  		}
	  		else if (sCurrentLine.charAt(i)=='#'){
	  		  //kotak[x][i] = new Habitat();
	  		  kotak[x][i].SetPembeda('#');
	  		}
	  		else {
	  		  //kotak[x][i] = new Habitat();
	  		  kotak[x][i].SetPembeda('~');
	  		}
	  	}
	  	x++;
	  }	
	}
	catch (IOException e){
		System.out.println("Error io");
	}

	/*Inisialisasi objek-objek Cage*/
	kandang = new Cage[50];
	try (BufferedReader br = new BufferedReader(new FileReader(path))){
	  String sCurrentLine;
	  int str,x=0;
	  while ((sCurrentLine = br.readLine() != null) && (sCurrentLine.charAt(0)!='C')) {
	  	str = sCurrentLine.length();
	  	for (int i = 0;i < str; i++) {
	  	  if (sCurrentLine.charAt(i)!='0'){
	  	  	int t = (sCurrentLine.charAt(i) - '0');
	  	  	kandang[t].SetPos(x,i);
	  	  }
	  	}
	  	x++;
	  }	
	}
	catch (IOException e){
		System.out.println("Error io");
	}


	/*Inisialisasi objek-objek Animal*/

	daftarBinatang = new Animal[100];
	path = "D:\\ITB\\Informatics\\Semester 4\\oop\\tubes1\\v2 v3 cpp\\v3\\DaftarBinatang.txt";
	try (BufferedReader br = new BufferedReader(new FileReader(path))){
	  String sCurrentLine;
	  char kB;
	  int no,jinak;
	  int nB = 0;
	  while (sCurrentLine = br.readLine() != null) {
	  	float _berat = 0, _berat_makanan = 0;
		kB = sCurrentLine.charAt(0);
		no = (sCurrentLine.charAt(2)-'0');
		jinak = sCurrentLine.charAt(4);

		int i,_x = 0,_y = 0;		
		for(i = 6;sCurrentLine.charAt(i) != '|'; i++) {
		  _berat = (sCurrentLine.charAt(i)-'0') + _berat*10;
		}
		i++;
		for(;sCurrentLine.charAt(i) != '|'; i++) {
		  _berat_makanan = (line[i]-'0') + _berat_makanan*10;
		}
		i++;
		for(;sCurrentLine.charAt(i) != '|';i++) {
		  _x = (sCurrentLine.charAt(i)-'0') + _x*10;
		}
		i++;
		for(;sCurrentLine.charAt(i) != '|';i++) {
		  _y = (line[i]-'0') + _y*10;
		}
		kandang[no].AddAnimal(kB,jinak,_berat,_berat_makanan,_x,_y);
		daftarBinatang[nB] = kandang[no].hewan[kandang[no].Getnum_animal()-1];
		sumAnimal++;
		nB++;
	  }	
	}
	catch (IOException e){
		System.out.println("Error io");
	}

	/*Inisiasi pintu yang merupakan entrance atau exit*/
	Random randomGenerator = new Random();
	int xy1 = randomGenerator.nextInt(numPintu);
	int xy2 = randomGenerator.nextInt(numPintu);
	while (xy1==xy2){
		xy2 = randomGenerator.nextInt(numPintu);
	}
	entranceX = pintuX[xy1]; entranceY = pintuY[xy1];
  	exitX = pintuX[xy2]; exitY = pintuY[xy2];
	 

} 