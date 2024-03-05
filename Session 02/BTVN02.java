public class BTVN02 {
    public static void main(String[] args) {
        // In ra hinh hinh vuong

        for (int i = 0; i < 5; i++) {
            System.out.println("");

            for (int j = 0; j < 8; j++) {
                System.out.print(" * ");
            }
        }

        System.out.println();


        //In ra hinh tam giac
        for (int i = 1; i < 8; i++) {
            System.out.println("");

            for (int j = 1; j < i; j++) {
                System.out.print(" * ");
            }
        }

        System.out.println();

        //In ra hinh tam giac
        for (int i = 8; i > 0; i--) {
            System.out.println("");

            for (int j = 1; j < i; j++) {
                System.out.print(" * ");
            }
        }

        System.out.println();

        //In ra hinh tam can
        for (int i = 8; i > 0; i--) {
            System.out.println();

            for (int j = 1; j < i; j++) {
                System.out.print("-");
            }

            for (int j = 1; j <= 8; j++) {
                System.out.print("*");
            }
        }
    }
}
