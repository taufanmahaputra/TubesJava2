/** @file Kuda.java
  * @brief Implementasi Kuda.
  */
  
public class Kuda extends Animal {
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
    jenis_makanan = '1';
    kode_binatang = '!';
    kode_habitat = '1';
  }

  public void Interact() {
    System.out.println("Ngiiikkkkk");
  }

  public char GetPembeda(){
    return kode_binatang;
  }  

  public void Render(){
    System.out.println(GetPembeda());
  }
}
