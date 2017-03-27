import java.io.*;
public class Cage {
  protected static int id_cage;
  public int[] x = new int[30];
  public int[] y = new int[30];
  public int num_animal;
  public int luas_cage;
  public Animal[] hewan = new Animal[20];
  
  Cage() {
    num_animal = 0;
    luas_cage = 0;
    id_cage++;
  }

  public void SetPos(int _x, int_y) {
    x[luas_cage] = _x;
    y[luas_cage] = _y;
    luas_cage++;
  }
	
  public int GetPosX(int i){
    return x[i];
  }

  public int GetPosY(int j){
    return y[j];
  }
  
  void AddAnimal(char kb, bool _jinak, float _berat, float _berat_makanan, int _x, int _y) {
  if (kb == 't') {
    hewan[num_animal] = new Teri;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'c') {
    hewan[num_animal] = new Cupang;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == '<') {
    hewan[num_animal] = new Kerapu;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'm') {
    hewan[num_animal] = new Mas;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'l') {
    hewan[num_animal] = new Lele;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'U') {
    hewan[num_animal] = new Ular;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'k') {
    hewan[num_animal] = new Komodo;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'b') {
    hewan[num_animal] = new Biawak;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'i') {
    hewan[num_animal] = new Cicak;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'B') {
    hewan[num_animal] = new Bunglon;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == '$') {
    hewan[num_animal] = new Cendrawasih;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'a') {
    hewan[num_animal] = new Ayam;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'e') {
    hewan[num_animal] = new Elang;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == '+') {
    hewan[num_animal] = new Kakatua;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == '-') {
    hewan[num_animal] = new Angsa;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'g') {
    hewan[num_animal] = new Gajah;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'O') {
    hewan[num_animal] = new Orangutan;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'p') {
    hewan[num_animal] = new Paus;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == 'W') {
    hewan[num_animal] = new Kelelawar;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
  } else
  if (kb == '!') {
    hewan[num_animal] = new Kuda;
    hewan[num_animal].SetAnimal(_jinak, _berat, _berat_makanan);
    hewan[num_animal].SetPosX(_x);
    hewan[num_animal].SetPosY(_y);
	  }
    num_animal++;
  }
  
  public int GetLuas() {
    return luas_cage;
  }

  public int Getnum_animal() {
    return num_animal;
  }
}
