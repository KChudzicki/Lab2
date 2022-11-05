public class Operators {
    public static void main(String[] args) {
        int x = 5;
        x= x + 2;
        int y = 4;

        System.out.println(x / y); // uwaga wynik całkowity, bo operandy całowites
        System.out.println(x / (double)y); // wystarczy, że jeden z argumentów będzie liczbą zmienno przecinkową
        System.out.println(3 / 2. );

        System.out.println(5 % 2); // modulo - reszta z dzielenia

        int a = 5;
        int b = -a;

        System.out.println(a);
        System.out.println(b);

        int q, w, e;
        q = 42;
        w = q++; // w=42, q=43
        e = ++q;// q=43, e=44

        System.out.println(w);
        System.out.println(e);

        int r = 0;
        int t;

        t = r++ + r++; // (0) + (1) t=1; r=2
        System.out.println("r = " + r);
        System.out.println("t = " + t);

        int n = 0;
        n = n++;
        System.out.println("n = " + n);

//        int o = 7;
//        int p = 7;
//        int i = 7;
        int i,o,p;
         i = o = p = 7;
        System.out.println(i);
         i += 2; // i = i + 2
        System.out.println(i);

        //operatory negacji
        //negacja !
        // iloczny logiczny &&
        //suma logiczna ||
        // równoważność ==
        // alternatywa rozłączna XOR !=

        //&& i || to operatory warunkowe w przeciwieństwie do & i |
        int h = 0;
        int j = 5;
        boolean test = (h < 0) && (j++ > 3); //false && true = false
        System.out.println(test);
        System.out.println(j);

        int age = 33;
        boolean test2 = !(age < 25);// negujemy falese -> true
        System.out.println(test2);
    }
}
