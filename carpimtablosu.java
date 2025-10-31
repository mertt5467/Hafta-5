package hafta5;

public class carpimtablosu {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int toplam = j * i;
                System.out.print(toplam + "\t");
            }
            System.out.println();
        }
    }
}
