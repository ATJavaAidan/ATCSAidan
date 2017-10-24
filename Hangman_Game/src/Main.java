import java.util.Scanner;
class Main{
  public static void main (String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("User one, please enter your word or phase: ");
    String word = input.nextLine();
    int size=word.length();
    char[] board = new char[size];
    int temp=(size-1);
    
    for (int i=0; i<size; i++){
      while(true){
        System.out.println("Would you like to guess a char or a word?");
        String type = input.nextLine();

        if (type=="char"){
          System.out.println("What char would you like to guess?");
          char guess = input.next().charAt(0);
          checkLetter(word, guess);
        }

        if (type=="word"){
          System.out.println("What word would you like to guess?");
        }

        else{
          System.out.println("Invalid answer, please enter word or char.");
        }
      }
    }
  }


  public static void initializeBoard(String word, char[] board, int temp){
    for(int i=0; i<=temp; i++){
      if (word.charAt(i)==' '){
        board[i]=' ';
      }
      else{
        board[i]='-';
      }
    }
  }

  public static void showBoard(char[] board, int size){
    int temp=(size-1);
    for(int i=0; i<=temp; i++){
      System.out.print(board[i]);
    }
  }
  
  public static boolean checkLetter(String word, char a){
    if (word.indexOf(a)!=-1){
      return true;
    }
    else{
      return false;
    }
  }

  public static void replaceLetter(char[] board, String word, char guess){
    if (word.indexOf(guess)!=-1){
      int temp=word.indexOf(guess);
      board[temp]=guess;
      char[] wordArray = word.toCharArray();
      wordArray[temp]='?';
      word = String.valueOf(wordArray);
    }
  }

  public static void showMan(int a) {
    if (a == 0) {
      System.out.println("   ____________");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   | ");
      System.out.println("___|___");
    }
    if (a == 1) {
      System.out.println("   ____________");
      System.out.println("   |          |||");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("___|___");
    }
    if (a == 2) {
      System.out.println("   ____________");
      System.out.println("   |          |||");
      System.out.println("   |         | | |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("___|___");
    }
    if (a == 3) {
      System.out.println("   ____________");
      System.out.println("   |          |||");
      System.out.println("   |         | | |");
      System.out.println("   |          |||");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("___|___");
    }
    if (a == 4) {
      System.out.println("   ____________");
      System.out.println("   |          |||");
      System.out.println("   |         | | |");
      System.out.println("   |          |||");
      System.out.println("   |      -----|-----");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("___|___");
    }
    if (a == 5) {
      System.out.println("   ____________");
      System.out.println("   |          |||");
      System.out.println("   |         | | |");
      System.out.println("   |          |||");
      System.out.println("   |      -----|-----");
      System.out.println("   |           |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("___|___");
    }
    if (a == 6) {
      System.out.println("   ____________");
      System.out.println("   |          |||");
      System.out.println("   |         | | |");
      System.out.println("   |          |||");
      System.out.println("   |      -----|-----");
      System.out.println("   |           |");
      System.out.println("   |           |");
      System.out.println("   |");
      System.out.println("___|___");
    }
    if (a == 7) {
      System.out.println("   ____________");
      System.out.println("   |          |||");
      System.out.println("   |         | | |");
      System.out.println("   |          |||");
      System.out.println("   |      -----|-----");
      System.out.println("   |           |");
      System.out.println("   |           |");
      System.out.println("   |          | |");
      System.out.println("___|___       / \\");
    }
  }
}