import java.util.*;
import java.io.*;

public class Driver {
  public void ViewMap (Zoo Z){
    for(int i = 0; i < Z.height; i++){
      for(int j = 0; j < Z.width; j++){
        boolean cek = false;
        int k = 0;
          while ((!cek) && (k < Z.sumAnimal)){
              if ((i == Z.daftarBinatang[k].GetPosX()) && (j == Z.daftarBinatang[k].GetPosY())){
                cek = true;
                Z.daftarBinatang[k].Render();
              }
              k++;
          }
          if (!cek){
            Z.kotak[i][j].Render();
          }
       }
       System.out.println();
    }
  }

  public void TourZoo(Zoo Z, int startx, int starty, String str){  
    System.out.println ("Ini : " + str);
    int i=0;
    int posX, posY;
    char x;
    posX = startx; posY = starty;
    DisplayInteractAround(Z, posX, posY);
    while(i < str.length()){
      Gerak(Z);
      x = 'a';
      if(str.charAt(i) == 'U'){
        posX--;
        DisplayInteractAround(Z,posX,posY);
      } else if(str.charAt(i) == 'D'){
        posX++;
        DisplayInteractAround(Z,posX,posY);
     } else if(str.charAt(i) == 'R'){
        posY++;
        DisplayInteractAround(Z,posX,posY);
     } else if(str.charAt(i) == 'L'){
        posY--;
        DisplayInteractAround(Z,posX,posY);
     }
      
    do{
        ViewMap(Z);
        System.out.println ("Press X to continue...");
        Scanner s = new Scanner(System.in);
        x = s.next().charAt(0);
        if( x == 'X' ) i++;
      } while(x != 'X');
    }
  }
  
  public void Gerak(Zoo Z){
    Random random = new Random();
    for (int i = 0; i < 33; i++){ 
      for (int j = 0;j < Z.kandang[i].GetNumAnimal(); j++){ 
          int batasRandom = Z.kandang[i].GetLuas();
          int temp = random.nextInt(batasRandom); // menggenerate angka random, mungkin masih salah 
          Z.kandang[i].hewan[j].SetPosX(Z.kandang[i].x[temp]); 
          Z.kandang[i].hewan[j].SetPosY(Z.kandang[i].y[temp]); 
      } 
    } 
  }


  public void DisplayInteractAround(Zoo Z,int posX, int posY){
    int i= 0;
    while(i < Z.sumAnimal){
      if( (Z.daftarBinatang[i].GetPosX() == posX+1) && (Z.daftarBinatang[i].GetPosY() == posY)){
        Z.daftarBinatang[i].PrintSuara();
      }
      if( (Z.daftarBinatang[i].GetPosX() == posX-1) && (Z.daftarBinatang[i].GetPosY() == posY)){
        Z.daftarBinatang[i].PrintSuara();
      }
      if( (Z.daftarBinatang[i].GetPosX() == posX) && (Z.daftarBinatang[i].GetPosY() == posY+1)){
        Z.daftarBinatang[i].PrintSuara();
      }
      if( (Z.daftarBinatang[i].GetPosX() == posX) && (Z.daftarBinatang[i].GetPosY() == posY-1)){
        Z.daftarBinatang[i].PrintSuara();
      }
      i++;
    } 
  }

  public void DisplayMap (Zoo Z, int x, int y){
  for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
        boolean cek = false;
        int k = 0;
        while ((!cek) && (k < Z.sumAnimal)){
          if ((i == Z.daftarBinatang[k].GetPosX()) && (j == Z.daftarBinatang[k].GetPosY()))   {
            cek = true;
            Z.daftarBinatang[k].Render();
            } k++;
         }
 
        if (!cek) {
           Z.kotak[i][j].Render();
         }
        }
    System.out.println();
    }
  }
  
  public void GenerateRoute (Zoo Z, boolean [][] matriksb, int x, int y, int finishx, int finishy, int height, int width, boolean finished, Stack s, String str) {
    if ((x == finishx) && (y == finishy)) {
      String dataoutput = "";
      int lengthoutput = 0;
      finished = true;
      while (!s.empty()){
        dataoutput += s.peek();
        lengthoutput++;
        s.pop();
      }
      for (int i = lengthoutput - 1; i >= 0; i--){
        str += dataoutput.charAt(i);
      }
    } else {
      matriksb[x][y] = true;
      if (((x + 1 < height) && ((Z.kotak[x+1][y].GetPembeda() == '|') || ((x + 1 == finishx) && (y == finishy))) && !matriksb[x+1][y] && !finished ) ){
        s.push('D');
        GenerateRoute (Z, matriksb, x + 1, y, finishx, finishy, height, width, finished, s, str);
      }if ((x - 1 >= 0) && ((Z.kotak[x-1][y].GetPembeda() == '|') || ((x - 1 == finishx) && (y == finishy)) ) && !matriksb[x-1][y] && !finished) {
        s.push('U');
        GenerateRoute (Z,matriksb, x - 1, y, finishx, finishy, height, width, finished, s, str);
      }if ((y - 1 >= 0) && ((Z.kotak[x][y-1].GetPembeda() == '|') || ((x == finishx) && (y - 1 == finishy))) && !matriksb[x][y-1] && !finished) {       
        s.push('L');
        GenerateRoute (Z,matriksb, x, y - 1, finishx, finishy, height, width, finished, s, str);
      }if ((y + 1 < width) && ((Z.kotak[x][y+1].GetPembeda() == '|') || ((x == finishx) && (y + 1 == finishy))) && !matriksb[x][y+1] && !finished) {         
        s.push('R');
        GenerateRoute (Z,matriksb, x, y+1, finishx, finishy, height, width,finished,s,str);
      }
      matriksb[x][y] = false;
      s.pop();
    }
  }

  public void PrintDaftarBinatang (Zoo Z){
    System.out.println("Daftar binatang-binatang yang tersedia di Bonbin Ahuy adalah :");
    for (int i = 0; i < Z.sumAnimal; i++){
      System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
      System.out.println ("Nama                   :");
        if (Z.daftarBinatang[i].kodeBinatang == 'U')
            System.out.println("Ular");
        else if (Z.daftarBinatang[i].kodeBinatang == 'c')
            System.out.println ("Cupang" );
        else if (Z.daftarBinatang[i].kodeBinatang == 't')
            System.out.println ("Teri" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'k')
            System.out.println ("Kerapu" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'm')
            System.out.println ("Mas" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'l')
            System.out.println ("Lele" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'K')
            System.out.println ("Komodo" );
        else if (Z.daftarBinatang[i].kodeBinatang == 't')
            System.out.println ("Teri" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'b')
            System.out.println ("Biawak" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'i')
            System.out.println ("Cicak" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'B')
            System.out.println ("Bunglon" );
        else if (Z.daftarBinatang[i].kodeBinatang == '$')
            System.out.println ("Cendrawasih" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'a')
            System.out.println ("Ayam" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'e')
            System.out.println ("Elang" );
        else if (Z.daftarBinatang[i].kodeBinatang == '*')
            System.out.println ("Kakatua" );
        else if (Z.daftarBinatang[i].kodeBinatang == '|')
            System.out.println ("Angsa" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'g')
            System.out.println ("Gajah" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'O')
            System.out.println ("Orangutan" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'p')
            System.out.println ("Paus" );
        else if (Z.daftarBinatang[i].kodeBinatang == 'R')
            System.out.println ("Kelelawar" );
        else if (Z.daftarBinatang[i].kodeBinatang == '~')
            System.out.println ("Kuda" );
 
 
        System.out.println ("Posisi                 :" + Z.daftarBinatang[i].x + "," + Z.daftarBinatang[i].y );
 
        System.out.println ("Habitat                :");
        if (Z.daftarBinatang[i].kodeHabitat == '0')
            System.out.println ( "Water Habitat " );
        else if (Z.daftarBinatang[i].kodeHabitat == '1')
            System.out.println ( "Land Habitat " );
        else if (Z.daftarBinatang[i].kodeHabitat == '2')
            System.out.println ( "Air Habitat " );
        else if (Z.daftarBinatang[i].kodeHabitat == '3')
            System.out.println ( "Amfibi " );
 
 
        System.out.println ("Jenis Makanan          :");
        if (Z.daftarBinatang[i].jenisMakanan == '0')
            System.out.println ( "Karnivora" );
        else if (Z.daftarBinatang[i].jenisMakanan == '1')
            System.out.println ( "Herbivora" );
        else if (Z.daftarBinatang[i].jenisMakanan == '2')
            System.out.println ( "Omnivora" );
 
        System.out.println ("Berat binatang         :" + Z.daftarBinatang[i].beratBadan + " kg" );
 
    }
  }

  public void PrintDataMakananHewan (Zoo Z){
  float totalmakanan;
    for (int i = 0; i < Z.sumAnimal; i++)
    totalmakanan+=Z.daftarBinatang[i].beratMakanan;
 
    System.out.println("Setiap harinya, Bonbin Ahuy menyediakan makanan untuk hewan sebesar.........");
    System.out.println(".........");
    System.out.println("......");
    System.out.println(".....");
    System.out.println("....");
    System.out.println("...");
    System.out.println("..");
    System.out.println(".");
 
    System.out.println(totalmakanan + " kg!!!!");
  }

};
  



//skip ke akhir dl zar h3h3



//end class Driver
//
