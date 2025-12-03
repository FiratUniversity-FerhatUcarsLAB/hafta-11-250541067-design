public class Exercise4_4 {

    public static int giveNumber() {
        return 42;
    }

    public static void sayBoo() {
        System.out.println("boo!");
    }

    public static void main(String[] args) {

        // 1) Bir deger donduren metodu cagirip sonucunu KULLANMAZSAN ne olur?
        // --------------------------------------------------------------------
        // Java DERLEME HATASI vermez.
        // Metot cagirilir, dondurdugu deger kaybolur ama bu bir hata degildir.
        // Sadece IDE "unused return value" uyarisi verebilir.

        giveNumber();   // (Bu satir derleme hatasi OLUSTURMAZ)


        // 2) Bir void metodu bir ifadenin icinde kullanirsan ne olur?
        // --------------------------------------------------------------------
        // Void metod DEGER dondurmez.
        // Bu nedenle bir ifadeye (expression) yerlesitirilemez.
        // Aksi durumda DERLEME HATASI olusur:
        // "void type not allowed here" veya "void cannot be used in expression".

        // System.out.println(sayBoo() + 7);
        // YUKARIDAKI SATIR DERLEME HATASI VERIR.

    }
}
