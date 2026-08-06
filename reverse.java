public class reverse {
    public static void main(String[] args) {
        String a="Suneel";
        int rev=0;
        while(a!=0){
            int digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }
    }
}
