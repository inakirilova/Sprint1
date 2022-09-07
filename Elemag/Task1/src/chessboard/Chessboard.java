package chessboard;

public class Chessboard {
    private int width;
    private int height;

    public Chessboard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printBoard(){
        for (int i = 1; i < this.height + 1; i++){
            System.out.println();

            for(int j = 1; j < this.width + 1; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if(j % 2 == 0){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
