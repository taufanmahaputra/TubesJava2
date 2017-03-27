/** @file Cell.java
  * @brief Deklarasi kelas cell yang mengimplementasi interface
  */
/** @class Cell
  * @brief Kelas untuk petak-petak pada Zoo.
  */
public class Cell implements Renderable, CellController{
  /** @brief Getter atribut pembeda (virtual).
    * 
    */
	public char GetPembeda(){
		return pembeda;
	}
	/** @brief Setter atribut pembeda (virtual).
      * 
      */
	public void SetPembeda(char X){
		pembeda = X;
	}
	/** @brief Menampilkan Renderable ke layar (virtual).
      * 
      */
	public void Render(){
		System.out.println(pembeda);
	}
	/** @brief Variabel yang digunakan untuk menyimpan kode pembeda.
      * 
      */
	protected char pembeda;
}
