public class QueryResult {
  //has all the information of the location of the user input
  private String word;
  private String filename;
  private String snipbit;

  public QueryResult(String word, String filename, String snipbit) {
    this.word = word;
    this.filename = filename;
    this.snipbit = snipbit;
  }

  //word = the word the user is trying to search
  public String getQuery(String word) {
    return this.word;
    //return ArrayList
  }
  //method just taking in the root and outputting the filenames in an arraylist
  public File getFileNames() {
    return this.filename;
  }
  // method that takes in that arraylists and loops through all the elements
  public File parseFile() {

  }
  //and uses them as input for jsoup
    // returns the arraylist of single words from that specific file


}
