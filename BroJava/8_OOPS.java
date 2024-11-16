package BroJava;

class OOPS {
  public static void main(String[] args) {
    SPS player1 = new SPS("Ashwath");
    SPS player2 = new SPS("Malini");

    player1.win();
    player2.lose();
    player1.win();
    player2.win();
    player1.win();
    SPS.winner(player1, player2);
    System.out.println(player1);
    System.out.println(player2.toString());
  }

}

class SPS {
  // SPS = Stone Paper Scissors
  // class = blueprint for objects
  // object = instance of a class
  // instance variable = a variable that is associated with an object

  String Name;
  int points;

  // constructor = special method that is called when an object is instantiated
  SPS(String Name) {
    this.Name = Name;
    this.points = 0;
  }

  // methods = functions that are associated with an object
  void win() {
    this.points += 1;
  }

  void lose() {
    this.points -= 1;
  }

  // passing object as parameter
  static void winner(SPS player1, SPS player2) {
    if (player1.points > player2.points) {
      System.out.println(player1.Name + " wins!");
    } else if (player1.points < player2.points) {
      System.out.println(player2.Name + " wins!");
    } else {
      System.out.println("It's a tie!");
    }
  }

  public String toString() {
    return this.Name + " : " + this.points;
  }

}
