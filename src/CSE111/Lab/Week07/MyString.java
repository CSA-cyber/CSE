package CSE111.Lab.Week07;

public class MyString {

    public String s;
    char c[];

    public MyString(){

    }

    public MyString(String s){
        this.s = s;
        c=s.toCharArray();
    }

    public MyString(char []c){
        this.c= c;
    }

    public int length(){
        return c.length;
    }

    public char charAt(int index){
        return c[index];
    }

    public boolean startsWith(String prefix){
        for (int i = 0; i <prefix.length() ; i++) {
            if(s.charAt(i)!=prefix.charAt(i))
                return false;
        }
        return true;
    }

    public boolean startsWith(MyString prefix){
        for (int i = 0; i <prefix.length() ; i++) {
            if(s.charAt(i)!=prefix.charAt(i))
                return false;
        }
        return true;
    }

    public boolean endsWith(MyString suffix){
        for (int i = suffix.length()-1; i >-1 ; i--) {
            if(s.charAt(i)!=suffix.charAt(i))
                return false;
        }
        return true;
    }

    public String replaceFirst(char old, char n){
        for (int i = 0; i <c.length ; i++) {
            if(c[i]==old){
                c[i]=n;
                break;
            }
        }
        String s="";
        for (int i = 0; i <c.length ; i++) {
            s+=c[i];
        }
        return s;
    }

    public String replaceAll(char old, char n){
        for (int i = 0; i <c.length ; i++) {
            if(c[i]==old){
                c[i]=n;
            }
        }
        String s="";
        for (int i = 0; i <c.length ; i++) {
            s+=c[i];
        }
        return s;
    }

    public String replaceLast(char old, char n){
        for (int i = c.length-1; i >-1 ; i--) {
            if(c[i]==old){
                c[i]=n;
                break;
            }
        }
        String s="";
        for (int i = 0; i <c.length ; i++) {
            s+=c[i];
        }
        return s;
    }

    public boolean equalsIgnoreCase(MyString s){
        for (int i = 0; i <c.length ; i++) {
            if ((int) c[i] > 64 && (int) c[i] < 91){
                if (c[i] != s.charAt(i) || (int)c[i] != ((int)s.charAt(i)+32))
                    return false;
            }
            else if ((int)c[i]>96&&(int)c[i]<123){
                if (c[i] != s.charAt(i )|| (int)c[i] != ((int)s.charAt(i)-32))
                    return false;
            }
        }
        return true;
    }

    public boolean equals(MyString s){
        for (int i = 0; i <c.length ; i++) {
            if(c[i]!=s.charAt(i))
                return false;
        }
        return true;
    }

    public String toUpperCase(){
        char c[]=this.c;
        for (int i = 0; i <c.length ; i++) {
            if ((int)c[i]>96&&(int)c[i]<123)
                c[i]=(char)((int)c[i]-32);
        }
        return toString(c);
    }

    public String toLowerCase(){
        char c[]=this.c;
        for (int i = 0; i <c.length ; i++) {
            if ((int)c[i]>64&&(int)c[i]<91)
                c[i]=(char)((int)c[i]+32);
        }
        return toString(c);
    }

    public String toString(){
        return this.s;
    }

    public String toString(char c[]){
        String s="";
        for (int i = 0; i <c.length ; i++) {
            s+=c[i];
        }
        return s;
    }

    public String substring(int start, int end){
        String s="";
        for (int i = start; i <end ; i++) {
            s+=c[i];
        }
        return s;
    }

    public String substring(int start){
        return substring(start,c.length-1);
    }

    public int indexOf(char c){
        for (int i = 0; i <this.c.length ; i++) {
            if(this.c[i]==c)
                return i;
        }
        return -1;
    }

    public int lastIndexOf(char c){
        for (int i = this.c.length-1; i >-1 ; i--) {
            if(this.c[i]==c)
                return i;
        }
        return -1;
    }

    public boolean contains(char c[]){
        for (int i = 0; i <this.c.length ; i++) {
            if(this.c[i]==c[0]){
                for (int j = 1; j <c.length ; j++) {
                    if(c[j]!=this.c[i++])
                        return false;
                }
            }
            if(i==this.c.length-1)
                return false;
        }
        return true;
    }

    public String trim(){
        String s="";
        int n=-1;
        for (int i = 0; i <c.length ; i++) {
            if(this.c[i]==' ' && n>-1)
                continue;
            else if(c[this.c.length-i-1]==' ')
                continue;
            n=i;
            s+=c[i];
        }
        return s;
    }

    public String concat(MyString s1, MyString s2){
       return s1.s+s2.s;
    }

    public boolean isEmpty(){
        return s.length()==0;
    }

    public int compareTo(MyString s){
        if (this.equals(s))
            return 0;
        else if (this.charAt(0)>s.charAt(0))
            return +1;
        else
            return -1;
    }
    public int compareToIgnoreCase(MyString s){
        String n1= this.s.toLowerCase();
        String n2= s.toLowerCase();
        if (n1.equals(n2))
            return 0;
        else if (n1.charAt(0)>n2.charAt(0))
            return +1;
        else
            return -1;

    }

    public int indexOf(char c, int index){
        for (int i = index; i <this.c.length ; i++) {
            if(this.c[i]==c)
                return i;
        }
        return -1;
    }

    public int lastIndexOf(char c, int index){
        for (int i = this.c.length-1; i >=index ; i--) {
            if(this.c[i]==c)
                return i;
        }
        return -1;
    }

    public String replace(String o, String n){
        MyString s = new MyString(this.s),
                 current = new MyString(o),
                 next = new MyString(n);

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==current.charAt(0)){
               MyString temp = new MyString(s.substring(i,i+current.length()));
               if (temp.equals(current)){
                   MyString part1 = new MyString(s.substring(0,i)),
                            remaining = new MyString(s.substring(i+current.length(),s.length()));

                   s = new MyString(concat(part1,next));
                   s = new MyString(concat(s, remaining));
                   i+=current.length();
               }
            }
        }
        return s.toString();
    }
}
