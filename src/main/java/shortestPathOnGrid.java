import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;
import java.util.Queue;

public class DungenFindPath {
    static int R=4;
    static int C=5;
    boolean reachEnd=false;
    int movCount;
    int nodesLeftInLayer=1;
    int nodesInNextLayer=0;
    int[] dr={-1,1,0,0};  //Direction row vector
    int[] dc={0,0,1,-1};  //Direction column vector
    boolean[][] visited = new boolean[R][C];

    public static void main(String[] args) {

        int sr=0; //Starting row
        int sc=0; //Starting column
        char[][] m= new char[R][C];

        m[0][0]='S';
        m[3][3]='E';
        m[0][4]='#';
        m[2][2]='#';
        m[3][1]='#';

        System.out.println("dungen");
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(m[i][j]+"  ");
            }
            System.out.println();
        }

        DungenFindPath obj = new DungenFindPath();
        int move=obj.solve(R,C,sr,sc,m,obj);
        System.out.println(move);

        System.out.println("Visited");
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(obj.visited[i][j]+"  ");
            }
            System.out.println();
        }

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(m[i][j]+"  ");
            }
            System.out.println();
        }


    }

    public  int solve(int R, int C, int sr, int sc, char[][]m,DungenFindPath obj){
        Queue<Integer> rowQueue = new LinkedList();
        Queue<Integer> colQueue = new LinkedList();
        rowQueue.add(sr);
        colQueue.add(sc);
        visited[sr][sc]=true;
        while (!rowQueue.isEmpty() || !colQueue.isEmpty()){
            int r=rowQueue.poll();
            int c=colQueue.poll();
            System.out.println(m[r][c]);
            if(m[r][c]=='E'){
                reachEnd=true;
                System.out.println("Found the end");
                break;
            }
            for(int i=0;i<4;i++){
                int rr = r+dr[i];
                int cc = c+dc[i];
                //Check for invalid index, if index is lesser than row or column
                if(rr<0 || cc<0){
                    continue;
                }
                //Check for invalid index, if index is greater than size of the row and column
                if(rr>=R || cc>=C){
                    continue;
                }
                //If found Rock on the path skip that path
                if(m[rr][cc]=='#'){
                    continue;
                }
                //If already visited skip that path
                if(visited[rr][cc]){
                    continue;
                }
                rowQueue.add(rr);
                colQueue.add(cc);
                visited[rr][cc]=true;
                char c1 =m[rr][cc];
                if( c1!='S' &&  c1!='E') {
                    m[rr][cc] = '-';
                }
                if(c1=='E'){
                    System.out.println("========================"+c1);
                }
                System.out.println();
                obj.printMatrix(m);
                nodesInNextLayer++;
            }

            nodesLeftInLayer--;
            if(nodesLeftInLayer==0){
                nodesLeftInLayer=nodesInNextLayer;
                nodesInNextLayer=0;
                movCount++;
            }
        }
        if(reachEnd){
            return movCount;
        }
        return -1;
    }

    public void printMatrix(char[][]m){
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(m[i][j]+"  ");
            }
            System.out.println();
        }
    }




}
