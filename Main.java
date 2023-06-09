// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('b', "Belly");
        t.add('c', "Cally");
        t.add('d', "Dally");
        t.add('b', "Barney");

        System.out.println("Getting b pair: \n" + t.get('b'));
        System.out.println(t);
    }
}