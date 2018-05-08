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
public class SearchDriver
{   
    private static ArrayList<File> htmlList = new ArrayList<File>();
    
    public static void main(String[] args) throws IOException {
        visitFile(new File("wildanimalsonline.com\\"));
        for (File ele: htmlList){
            Document doc = Jsoup.parse(ele, "UTF-8");
            Elements elements = doc.body().select("*");
            for (Element element : elements) {
                String txt = element.ownText().trim();
                if (txt.length() > 0) {
                    //DONT PRINT, PUT INTO HASH TABLE
                    System.out.println(element.ownText());
                }
            }
        }
        
      }
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
    
    
}
