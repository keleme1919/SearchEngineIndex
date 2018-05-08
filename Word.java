//hellohihi
/**
 * Write a description of class Word here.
 *
 */
public class Word
{
    String word;
    String fileName;
    int row;
    int col;

    public Word(String word, String fileName, int row, int col){
        this.word = word;
        this.fileName = fileName;
        this.row = row;
        this.col = col;
    }
    public String getFileName(){
        return this.fileName;
    }
    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }

}
