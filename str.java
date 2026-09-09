public class str{
    public static void main (String args[]) {
        String s1 = "java";
        String s2 = "jaVa";
        if (s1 == s2){
            System.out.println("both are same");
        }
        else{
            System.out.println("not same");
        }
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("same");
        }
        else{
            System.out.println("not");
        }
    }
}