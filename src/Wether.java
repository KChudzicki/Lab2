public class Wether {
    public static void main(String[] args) {

        float fah = 86;
        System.out.println(fah + " stopni Fah0enheita too ...");
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah+" stopni Celcjusza");

        float cel = 33;
        System.out.println(cel + " stopnie Celcjusza to ...");
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;
        System.out.println((cel + " stopni Fahrenheita"));
    }
}
