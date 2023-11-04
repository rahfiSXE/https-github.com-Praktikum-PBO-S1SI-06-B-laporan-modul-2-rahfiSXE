public class Main
{
    public static void main(String[] args)
    {
        Buku a,b = new Buku();
        a = new Buku(" Siaga Merah "," Alistair Maclean ");
        b = new Buku();
        a.cetakKeLayar();
        b.cetakKeLayar();
    }
//    public static void main(String[] args)
//    {
//        Buku a = new Buku();
//        a.setNilai("Jurassic Park","Michael Crichton",21);
//        a.cetakKeLayar();
//    }
}