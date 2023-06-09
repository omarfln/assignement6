
public class MyTable {

    private Entry[] entries = new Entry[26];

    public void add(char a, String s) {
        int index = a - 'a';
        entries [index] = new Entry(a,s);
    }


    public String get(char c){
        int index = c - 'a';
        return entries[index].s;
    }

    @Override
    public String toString(){
        String s = "\n\nPrinting class status: \n";
        for (Entry entry: entries){
            if (entry != null) {
                s = s + entry + "\n" ;
            }
        }
        return s;
    }


    class Entry {
        char c;
        String s;

        Entry(char c, String s) {
            this.c = c;
            this.s = s;
        }
        public String toString(){
            return c + " --> " +s;
        }
    }

}