package enkapsulasi;

public class Person {
    private String nama;
    private int umur;
    private String alamat;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public void setumur(int umur){
        this.umur = umur;
    }


    public int getumur() {
        return umur;
    }

    public void setalamat(String alamat){
        this.alamat = alamat;
    }


    public String getalamat() {
        return alamat;
    }

    
}
