package programmers;

public class MinRectangle {
    public static void main(String[] args) {
        int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution(size);
    }

    public static void solution(int[][] sizes){
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        for(int i=0; i<sizes.length; i++){
            for(int j=1; j<sizes[i].length; j++){
                if(sizes[i][j-1] < sizes[i][j]){
                    int tmp = sizes[i][j];
                    sizes[i][j] = sizes[i][j-1];
                    sizes[i][j-1] = tmp;
                }
                System.out.println(sizes[i][j]);
            }
        }
    }
}
