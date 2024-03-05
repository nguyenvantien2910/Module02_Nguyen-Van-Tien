public class BTVN03 {
    public static void main(String[] args) {
        int i = 0;
        int check;
        while (i < 100) {

            check = isprime(i);

            if (check == 1) System.out.print(i + " \n");

            ++i;
        }
    }

    private static int isprime(int n) {
        int flag = 1;
        int i = 2;

        if (n < 2) return flag = 0;
        while (i < n) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
            i++;
        }

        return flag;
    }
}
