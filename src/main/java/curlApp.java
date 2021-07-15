import java.io.IOException;
// import java.util.Scanner; 
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class curlApp {
  OkHttpClient client = new OkHttpClient();

  String run(String url) throws IOException {
    Request request = new Request.Builder()
        .url(url)
        .build();

    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    }
  }
  
public static void wait(int ms)
{
    try
    {        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {        Thread.currentThread().interrupt();
    }
} // wait

public static void main(String[] args) throws IOException {

// Scanner userInput = new Scanner(System.in);
  // System.out.println("Enter URL with http:// - Example: http://www.google.com:");
  // String input
  // String siteToCurl = userInput.nextLine();
  // String input closed
  // userInput.close();
  int x = 1;
  while (x <= 100000 )
    {
       curlApp okhttpexample = new curlApp();
       okhttpexample.run("http://www.google.com");
      // System.out.println(okhttpresponse);
       System.out.println(x);
       x++;
       wait(500);
      } // while loop
    } // main
} // class