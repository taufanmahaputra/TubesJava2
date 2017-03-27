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


  public void TourZoo(Zoo Z, int startx, int starty, String str)
  {  
    System.out.println ("Ini : " << str << endl;
    int i=0;
    int posX, posY;
    char x;
    posX = startx; posY = starty;
    DisplayInteractAround(Z, posX, posY);
    while(i<str.length()){
     Gerak(Z);
     x = 'a';
     if(str[i] == 'U'){
    posX--;
    DisplayInteractAround(Z,posX,posY);
     } else
     if(str[i] == 'D'){
    posX++;
    DisplayInteractAround(Z,posX,posY);
     } else
     if(str[i] == 'R'){
    posY++;
    DisplayInteractAround(Z,posX,posY);
     } else
     if(str[i] == 'L'){
    posY--;
    DisplayInteractAround(Z,posX,posY);
     }
      
      do{
          ViewMap(Z);
    System.out.println << "Press X to continue..." << endl;
          cin >> x;
    if( x == 'X' ) i++;
      }
      while(x != 'X');
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

  public void PrintDaftarBinatang (Zoo Z){
    System.out.println("Daftar binatang-binatang yang tersedia di Bonbin Ahuy adalah :");
    for (int i = 0; i < Z.sumAnimal; i++){
      System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
      System.out.println ("Nama                   :");
        if (Z.daftarBinatang[i].kodeBinatang == 'U')
            System.out.println (("Ular");
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
 
 
        System.out.println ("Jenis Makanan          :" ;
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
}