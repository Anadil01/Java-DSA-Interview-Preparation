public class OOPSTHREE {
    public static void main(String[] args) {
        
    }
}

interface ChessPlayer{
    void moves();
}


class Queen implements ChessPlayer{
    public void moves(){
        System.out.print("up, down, left, right, diagonal (in all 4 dirns)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.print("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.print("up, down, left, right diagonal - (by 1 step)");
    }
}