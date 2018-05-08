

public class SearchEngineDriver{

    public static void main(String[] args){
        SearchEngineIndex sei = new SearchEngineIndex();
        sei.buildIndex(RootFolderName);
        ArrayList<QueryResult> results = sei.getQuery(inputsearchword);
        for (element: results){
            System.out.println(element.toString())
        }






    }




}
