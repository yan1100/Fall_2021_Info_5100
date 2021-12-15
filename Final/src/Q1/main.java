package Q1;

public class main {
    public static void main(String[] args) {
        int[][] room = {
                {0,0,0,0},
                {0,0,0,0},
                {-1,0,0,0},
                {0,0,-1,0}
        };

        Roomba roomba = new Roomba(room);
        roomba.turnRight();
        System.out.println(roomba.move());
        System.out.println(roomba.move());
        roomba.clean();
        System.out.println(room[0][2]);
        System.out.println(roomba.move());
        System.out.println(roomba.move());
    }
}
