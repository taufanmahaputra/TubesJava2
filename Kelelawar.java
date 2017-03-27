/** @file Kelelawar.java
  * @brief Implementasi Kelelawar.
  */
  
public class Kelelawar extends Animal {
  public int GetPosX() {
    return x;
  }

  public int GetPosY() {
    return y;
  }

  public void SetPosX(int _x) {
    x = _x;
  }

  public void SetPosY(int _y) { 
    y = _y;
  }

  public void SetAnimal(boolean j, float b, float bm) {
    berat_badan = b;
    berat_makanan = bm;
    jinak = j;
    jenis_makanan = '2';
    kode_binatang = 'W';
    kode_habitat = '2';
  }

  public void Interact() {
    System.out.println("I AM KELELAWAR");
  }

  public char GetPembeda(){
    return kode_binatang;
  }  

  public void Render(){
    System.out.println(GetPembeda());
  }
}
