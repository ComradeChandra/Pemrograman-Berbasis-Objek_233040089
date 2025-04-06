public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        ubahJari2(l2);
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
    }
    public static void ubahJari2(Lingkaran obj){
        obj.setJari2(4);
    }
}
