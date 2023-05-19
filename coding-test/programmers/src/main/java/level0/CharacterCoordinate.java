package level0;

public class CharacterCoordinate {
    public int[] solution(String[] keyinput, int[] board) {
        int coordinate[] = new int[]{0, 0};
        
        for(String input : keyinput) {
            changeCoordinate(input, coordinate);
            checkCoordinate(board, coordinate);
        }
        
        return coordinate;
    }
    
    private void changeCoordinate(String input, int[] coordinate) {
        if(input.equals("left"))
            coordinate[0]--;
        if(input.equals("right"))
            coordinate[0]++;
        if(input.equals("up"))
            coordinate[1]++;
        if(input.equals("down"))
            coordinate[1]--;
    }
    
    private void checkCoordinate(int[] board, int[] coordinate) {
        for(int i = 0; i < 2; i++) {
            if(Math.abs(coordinate[i]) > board[i] / 2)
                coordinate[i] = (coordinate[i] < 0) ? -board[i] / 2 : board[i] / 2;
        }
    }
}
