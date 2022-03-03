package transpoze;

public class main {
    public static int[][] transpoze(int[][] matrix){
        int y = matrix[0].length;
        int x = matrix.length;
        int[][] transMatrix = new int[y][x];
        int xIndex=0;
        int yIndex=0;
        for(int[] i : matrix){
            yIndex=0;
            for (int l : i){
                transMatrix[yIndex][xIndex]=l;
                yIndex++;
            }
            xIndex++;
        }
        return transMatrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{2,3,4},{5,6,4}};
        int[][] transMatrix = transpoze(matrix);
        for(int[] i : matrix){
            for(int l : i){
                System.out.print(l+" ");
            }
            System.out.println();
        }
        System.out.println("transpoze");
        for(int[] i : transMatrix){
            for(int l : i){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
