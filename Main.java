import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ile liczb?");
    int liczbaLiczb = scanner.nextInt();
    int[] tab = new int[liczbaLiczb];
    for (int i=0; i < liczbaLiczb; i++) {
      System.out.println("Podaj liczbę:");
      tab[i] = scanner.nextInt();
}
    System.out.println("Odwrocona tablica:");
    for (int i=liczbaLiczb-1; i >= 0; i--){
      System.out.println(tab[i]);
    }
  }
}