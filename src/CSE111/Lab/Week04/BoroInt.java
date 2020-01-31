package CSE111.Lab.Week04;


public class BoroInt {

    public String num;

    public BoroInt(){
        this("0");
    }

    public BoroInt(String num){
        for (int i = 0; i <num.length() ; i++) {
            if((int)num.charAt(i)>57||(int)num.charAt(i)<48)
                throw new IllegalArgumentException("BoroIntErModdheNumberCharaArKisuDeyaJaiNaException");
        }
        this.num = num;
    }

    public String trim(String s){
        return s.trim();
    }

    public boolean validValue(String _val){
        for (int i = 0; i <_val.length() ; i++) {
            if((int)_val.charAt(i)>9)
                return false;
        }
        return true;
    }

    public BoroInt add(BoroInt _val){
        String result="",a,b;
        if(this.num.length()>_val.num.length()){
            a= this.num;
            b=_val.num;
        }
        else{
            a = _val.num;
            b = this.num;
        }
        int rem=0, sum=0;

        int n = b.length()-1;
        for (int i = a.length()-1; i >-1 ; i--) {
            //int sum =rem+ (int)this.num.charAt(i)+(int)b.num.charAt(n--);
            try {
                sum = rem + (int) a.charAt(i) + (int) b.charAt(n--) -48*2;
                result += sum % 10;
                rem = sum / 10;
            }
            catch (IndexOutOfBoundsException e) {
                for (int j = i; j >-0 ; j--) {
                        sum=rem+(int)a.charAt(i)-48;
                        result+=sum%10;
                        rem = sum/10;
                    }
                char reverse[] = result.toCharArray();
                reverse=reverse(reverse);
                result = new String(reverse);
                break;
                }
        }
        return new BoroInt(result);
    }
    
    private char[] reverse(char [] c){
        char a[]=c;
        for (int i = 0; i < c.length/2; i++) {
            char temp = a[i];
            a[i]=a[c.length-i-1];
            a[c.length-i-1]=temp;
        }
        return a;
    }
    
    public void setNum(BoroInt num){
        this.num = num.num;
    }
}
