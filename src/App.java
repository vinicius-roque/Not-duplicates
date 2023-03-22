public class App {
  public static void main(String[] args) throws Exception {
    String[] firstList = new String[] { "Morango", "Uva", "Acerola", "Manga" };
    String[] secondList = new String[] { "Pêra", "Cajú", "Morango", "Kiwi" };

    for (int i = 0; i < firstList.length; i++) {
      for (int j = 0; j < secondList.length; j++) {
        if (firstList[i].equals(secondList[j])) {
          System.out.println("Item em comum nas listas: " + firstList[i]);
        }
      }
    }
  }
}
