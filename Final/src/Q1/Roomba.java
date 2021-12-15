package Q1;

public class Roomba implements iRobot {
    int[][] room;
    Direction direction;
    int r;//row
    int c;//column


    public Roomba(int[][] room) {
        this.room = room;
        direction = Direction.DOWN;
        r = 0;
        c = 0;
    }

    @Override
    public boolean move() {
        if (direction == Direction.DOWN && r + 1 <= room.length - 1 && room[r + 1][c] != -1) {
            r++;
            return true;
        } else if (direction == Direction.UP && r - 1 <= 0 && room[r - 1][c] != -1 ) {
            r--;
            return true;
        } else if (direction == Direction.LEFT && c - 1 <= 0 && room[r][c - 1] != -1){
            c--;
            return true;
        } else if (direction == Direction.RIGHT && c + 1 <= room[0].length -1 && room[r][c + 1] != -1){
            c++;
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public void turnLeft() {
        direction = Direction.LEFT;

    }

    @Override
    public void turnRight() {
        direction = Direction.RIGHT;
    }

    @Override
    public void clean() {
        room[r][c] = 1;
    }
}
