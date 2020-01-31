package Assignment;

public class StringFunctions{

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StringFunctions(String value) {
        setValue(value);
    }

    public String toString(){
        return String.format("%s",value);
    }

    public int length (){
        char c[]=value.toCharArray();
        int i=0;
        try{
            while(true){
                c[i]=0;
                i++;
            }
        }
        finally{
            return i;
        }
    }

    public boolean equals(String value){
        boolean flag=true;
        char []c=this.value.toCharArray();
        char []c2=value.toCharArray();
        if(c.length==c2.length){
            for(int i=0;i<c.length;i++){
                if (c[i]!=c2[i]){
                    flag=false;
                    break;
                }
            }
        }
        else
            flag=false;
        return flag;
    }

    public String toUpperCase() {
        char[] c = value.toCharArray();
        for(int i = 0; i < c.length; ++i) {
            int n = c[i];
            if (n > 96 && n < 123) {
                c[i] = (char)(n - 32);
            }
        }
        value = new String(c);
        return value;
    }

    public String toLowerCase() {
        char[] c = value.toCharArray();
        for(int i = 0; i < c.length; ++i) {
            int n = c[i];
            if (n > 63 && n < 91) {
                c[i] = (char)(n + 32);
            }
        }
        value = new String(c);
        return value;
    }

    public String replace(String o,String n){
        String ss[]=new String[value.length()];
        for(int i=0;i<value.length();i++){
            ss[i]=""+value.charAt(i);
        }
        String c1=""+o.charAt(0);//for comparaing the first char
        for(int i=0;i<ss.length;i++){
            if (ss[i].equals(c1)){//comparing if the first charecter is same as replacing string first char
                String ch="";
                try{
                    for(int k=i;k<i+o.length();k++){
                        ch+=ss[k];
                    }
                }
                catch (Exception e){}
                if(ch.equals(o)){//comparing if ch is the replaceable string
                    ss[i]=n;//assigning new replace string to the first index
                    int k=i;
                    for (int j=i+o.length();j<ss.length;j++){//moving the rest of ss[] values an index backward
                        ss[++i]=ss[j];
                    }
                    for (int l=i+1;l<ss.length;l++){//for clearing remaining value of extra indexes
                        ss[l]="";
                    }
                    i=k;
                }
            }
        }
        value="";

        for (int i=0;i<ss.length;i++){
            value+=ss[i];
        }
        return value;
    }
}