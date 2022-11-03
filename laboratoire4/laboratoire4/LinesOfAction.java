package laboratoire4;

import java.util.HashMap;
import java.util.TreeMap;

public class LinesOfAction {
    TreeMap<String,Character> caseList = new TreeMap<String,Character>();
    int[][] board;
    String player;
    String opponent;
    public void setBoard(int[][] b, String player){
        this.board = b;
        this.player = player;
        int y=b.length+1;
        String[] x=this.buildXAxis(b[0].length);
        for (int index = 0; index < b.length; index++) {
            y--;
            for (int j = 0; j < b[index].length; j++) {
                Character c = '0';
                if (b[index][j]==2) {
                    c='R';
                }
                else if(b[index][j]==4){
                    c='N';
                }
                this.caseList.put(x[j]+y, c);
            }
        }
    }


    public void printBoard(){
        caseList.forEach((k,v)->{
            System.out.print(k);
        });
        for (int index = 0; index < board.length; index++) {
            for (int j = 0; j < board[index].length; j++) {
                String c = board[index][j]+"";
                if (board[index][j]==2) {
                    c="R";
                } 
                else if (board[index][j]==4){
                    c="N";
                }
                System.out.print(" "+c+" ");
            }
            System.out.println();
        }
    }

    public void flushBoard(String plays){
        String start;
        String end;
        String player;
    }

    private String[] buildXAxis(int size){
        String[] s = new String[size];
        int start = 65; //Start on the letter "A"
        for (int i = 0; i < s.length; i++) {
            s[i]= Character.toString((char) start++);
        }
        return s;
    }
}