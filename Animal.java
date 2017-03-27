/** @file Angsa.java
  * @brief Implementasi file Animal
  */
/** @class Animal
  * @brief Kelas yang berisi jenis-jenis binatang.
  */
public abstract class Animal extends Cell implements Renderable{
    /** @var int x
      * @brief Koordinat x;
      */
    protected int x;
    /** @var int y
      * @brief Koordinat y;
      */
    protected int y;
    /** @brief Getter atribut posisi x.
      * 
      */
    abstract int GetPosX();
    /** @brief Getter atribut posisi y.
      * 
      */
    abstract int GetPosY();
    /** @brief Setter atribut non-posisi Animal.
      * 
      * @param j Boolean kejinakan Animal.
      * @param b Nilai berat badan Animal.
      * @param bm Nilai berat makanan Animal.
      */
    abstract void SetAnimal(boolean j, float b, float bm);
    /** @brief Setter atribut posisi x.
      * 
      * @param _x Nilai atribut x.
      */
    abstract void SetPosX(int _x);
    /** @brief Setter atribut posisi y.
      * 
      * @param _y Nilai atribut y.
      */
    abstract void SetPosY(int _y);
    /** @brief Menampilkan interaksi hewan ke layar.
      * 
      */
    abstract void Interact();
    /** @brief Variabel yang menyimpan nilai berat badan dan makanan.
      * 
      */
    protected float berat_badan, berat_makanan; 
    /** @brief Boolean kejinakan, 1 bila jinak 0 jika tidak.
      * 
      */
    protected boolean jinak;
    /** @brief Variabel yang menyimpan kode, jenis makanan, dan habitat.
      * 
      */
    protected char kode_binatang, jenis_makanan, kode_habitat;
}
