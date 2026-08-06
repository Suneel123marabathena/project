public class break2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                if (i == 2) {
                    break;
                }
                System.out.println("i:" + 1 + "j:" + j);
            }
        }
    }
}
