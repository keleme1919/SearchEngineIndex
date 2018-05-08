public class SearchEngineIndex {


  public SearchEngineIndex() {
    //constructor will initiate that hashmap
    private static ArrayList<File> htmlList = new ArrayList<File>();
  }

  //word = the word the user is trying to search
  public String getQuery(String word) {
    //return ArrayList
  }
  //method just taking in the root and outputting the filenames in an arraylist
  public ArrayList<String> getFileNames() {
    if (current.isFile()) {
        htmlList.add(current);
    }
    // If it's a folder...
    else if (current.isDirectory()) {
        File [] files = current.listFiles();  // get an array of all the files
        for (int i = 0; i < files.length; i++){
            visitFile(files[i]);
        }
    }
  }
  // method that takes in that arraylists and loops through all the elements
  public File parseFile() {

  }
  //and uses them as input for jsoup
    // returns the arraylist of single words from that specific file


}
