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
public class SearchEngineIndex {
    private HashMap<String, ArrayList<QueryResult>> index = new HashMap<String, ArrayList<QueryResult>>();
    private ArrayList<File> files = new ArrayList<File>();

    public SearchEngineIndex(String top_level_filename){
        buildFileList(new File(top_level_filename));
    }

    public void buildFileList(File current) {
        if (current.isFile()) {
            files.add(current);
        }
        else if (current.isDirectory()) {
            File [] files = current.listFiles();  // get an array of all the files
            for (int i = 0; i < files.length; i++){
                buildFileList(files[i]);
            }
        }
    }

    public void buildIndexMap() throws IOException {
        for (File file : files){
            Document doc = Jsoup.parse(file, "UTF-8");
            Elements elements = doc.body().select("*");
            ArrayList<String> document_words = new ArrayList<String>();
            for (Element element : elements)
                document_words.addAll(  getStringsFromElement(element) );


            for(int i = 0; i < document_words.size(); i++) {

                QueryResult query = new QueryResult( file.getName(), getTextSnippet(document_words, i) );

                if(index.containsKey(document_words.get(i)))
                    ( index.get(document_words.get(i)) ).add(query);

                else{
                    ArrayList<QueryResult> query_list = new ArrayList<QueryResult>();
                    query_list.add(query);
                    index.put( document_words.get(i), query_list);
                }
            }
        }
    }

    public HashMap<String, ArrayList<QueryResult>> getIndexMap(){
      return index;
    }


    public String getTextSnippet(ArrayList<String> words, int index){
        String neighbors = "";

        for(int i = Math.max(0, index-3); i<Math.min(words.size(), index+3); i++){
            neighbors = neighbors.concat(" ");
            neighbors = neighbors.concat(words.get(i));
        }
        return neighbors;
    }




    public ArrayList<String> getStringsFromElement(Element e) {
        String txt = e.ownText().trim();
        // DO SOME MORE TEXT CLEANING /- TAKE OUT WHITESPACES ETC.
        return ( new ArrayList<String>(Arrays.asList(txt.split("[\\s]"))) );

    }

    public void cleanText(String txt){
      System.out.println();
      //  txt.replaceAll()
    }

}
