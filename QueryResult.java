import java.io.*;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class QueryResult {
  //has all the information of the location of the user input
  private String filename;
  private String snipbit;

  public QueryResult(String filename, String snipbit) {
    this.filename = filename;
    this.snipbit = snipbit;
  }


  public String toString() {
    //String output = "QUERY OBJECT";
    output = output.concat(": ");
    output = output.concat(this.filename);
    output= output.concat("\n");
    output = output.concat(this.snipbit);
    return output;
  }

}
