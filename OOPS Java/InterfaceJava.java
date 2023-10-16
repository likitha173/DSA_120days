public class InterfaceJava {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
}


interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, diagonal (in all 4 dirns)");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, diagonal (By one step)");
    }
}