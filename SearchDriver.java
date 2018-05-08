 import java.io.*;
 import java.util.*;
 import org.jsoup.Jsoup;
 import org.jsoup.nodes.Document;
 import org.jsoup.nodes.Element;
 import org.jsoup.select.Elements;
/**
 * Write a description of class QueryResult here.
 *
 */
public class SearchDriver {
  HashMap<String, ArrayList<QueryResult>> index = new HashMap<String, ArrayList<QueryResult>>();
  //define QueryResult class
  //and hashmap class

    private static ArrayList<File> htmlList = new ArrayList<File>();

    public static void visitFile(File current) {
        //File empty = new File("wildanimalsonline.com\\empty.html");
        // Now visiting the File, current
        // If it's a file and not a folder...just print it for now
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
    //this reads the files
    public static void main(String[] args) throws IOException {
    }

    public String popHashmap(String key) {
      visitFile(new File("wildanimalsonline.com\\"));
      for (File filename: htmlList){
          Document doc = Jsoup.parse(filename, "UTF-8");
          Elements elements = doc.body().select("*");
          for (Element element : elements) {
            //create a new method that gets each individual element 
              String txt = element.ownText().trim();
              if (txt.length() > 0) {
                  //DONT PRINT, PUT INTO HASH TABLE
                  //System.out.println(element.ownText());
                  if(index.containsKey(key)){
                    QueryResult myquery = new QueryResult(key, filename.getName(),)
                    index.get(key).append(myquery);
                    //which would give an arraylist
                  }
                  else{
                    ArrayList<QueryResult> newAL = new ArrayList<QueryResult>();
                    QueryResult myquery = new QueryResult(key, filename.getName(),)
                    newAl.append(myquery);
                    index.put(key,newAL)
                  }
                  //if the key exist add the location to the list
                  //otherwise add the corresponding value
              }
          }
      }
    }



}
