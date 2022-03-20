import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<ListPlayer> listPlayers = new LinkedList<>();

        Scanner s = new Scanner(System.in);

        boolean condition = true;
        while (condition) {
            menu();
            switch (s.nextInt()) {
                case 1:
                    String judulLagu = s.next();
                    String namaPenyanyi = s.next();
                    listPlayers.addLast(new ListPlayer(judulLagu, namaPenyanyi));
                    break;
                case 2:
                    System.out.println("1. Hapus lagu sesuai judul");
                    System.out.println("2. Hapus yang terakhir");
                    if (s.nextInt() == 1) {
                        removeWithJudul(listPlayers, s.next());
                    } else {
                        listPlayers.removeLast();
                    }
                    break;
                case 3:
                    print(listPlayers);
                    break;
                default:
                    condition = false;
                    break;
            }
        }
    }

    public static void print(LinkedList playerLists) {
        ListIterator<ListPlayer> iterator = playerLists.listIterator();


        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" - ");
            }
        }
        System.out.println();

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous());
            if (iterator.hasPrevious()) {
                System.out.print(" - ");
            }
        }

        System.out.println("\n------habis");
    }

    public static void removeWithJudul(LinkedList listPlayers, String judul) {
        ListIterator<ListPlayer> iterator = listPlayers.listIterator();
        while (iterator.hasNext());
            ListPlayer listPlayer = iterator.next();
            if (listPlayer.getJudulLagu().equals(judul))
                iterator.remove();
                System.out.println("\nberhasil hapus");
        }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Input lagu");
        System.out.println("2. Hapus lagu");
        System.out.println("3. Mainkan");
        System.out.println("4. Keluar");

    }
}