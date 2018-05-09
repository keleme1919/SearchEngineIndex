import java.io.*;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Tester {

public static void main(String[] args) throws IOException {

      SearchEngineIndex searcher = new SearchEngineIndex("wildanimalsonline.com");
      searcher.popHashmap();
      // File file = new File("wildanimalsonline.com/insect/squashbug.php.html");
      // Document doc = Jsoup.parse(file, "UTF-8");
      // Elements elements = doc.body().select("*");
      // String txt = elements.ownText().trim();
      // System.out.println( txt );
      //for (Element element : elements) {
      //System.out.println(getStringsFromElement(elements));
        // for(String word : getStringsFromElement(element)){
        //   System.out.println(word);
        // }


  }

  // public String popHashmap(String key) {
  //   visitFile(new File("wildanimalsonline.com\\"));
  //   for (File filename: htmlList){
  //       Document doc = Jsoup.parse(filename, "UTF-8");
  //       Elements elements = doc.body().select("*");
  //       for (Element element : elements) {
  //         //create a new method that gets each individual element
  //           String txt = element.ownText().trim();
  //           if (txt.length() > 0) {
  //               //DONT PRINT, PUT INTO HASH TABLE
  //               //System.out.println(element.ownText());
  //               if(index.containsKey(key)){
  //                 QueryResult myquery = new QueryResult(key, filename.getName(),);
  //                 index.get(key).append(myquery);
  //                 //which would give an arraylist
  //               }
  //               else{
  //                 ArrayList<QueryResult> newAL = new ArrayList<QueryResult>();
  //                 QueryResult myquery = new QueryResult(key, filename.getName(),);
  //                 newAl.append(myquery);
  //                 index.put(key,newAL)
  //               }
  //               //if the key exist add the location to the list
  //               //otherwise add the corresponding value
  //           }
  //       }
  //   }
  // }

}
