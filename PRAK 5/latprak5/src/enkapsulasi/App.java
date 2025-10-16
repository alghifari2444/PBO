package enkapsulasi;
public class App {
    public static void main(String[] args) throws Exception {
       Person orang1 = new Person();

       orang1.setNama ("Brayen");
       orang1.setumur(43);
       orang1.setalamat("Jakarta");

       System.out.println(orang1.getNama());
       System.out.println(orang1.getumur());
       System.out.println(orang1.getalamat());
    }
    
}
