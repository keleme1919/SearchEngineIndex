import java.io.*;
import java.util.ArrayList;

  public class SearchEngineDriver {

    public static void main(String[] args) throws IOException {
        SearchEngineIndex sei = new SearchEngineIndex("wildanimalsonline.com/");
        sei.buildIndexMap();
        String input = args[0];
        //System.out.println(sei.getIndexMap().entrySet());

        ArrayList<QueryResult> queries = sei.getIndexMap().get(input);
        for (QueryResult query : queries)
            System.out.println(query.toString());
    }
}
