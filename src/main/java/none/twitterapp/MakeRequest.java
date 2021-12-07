/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package none.twitterapp;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
/**
 *
 * @author Noahb
 */
public class MakeRequest {
    public OkHttpClient client = new OkHttpClient();

    public String authRequest(String url, String key, String token) throws IOException {
      Request request = new Request.Builder()
          .url(url)
          .addHeader(key, token)
          .build();

      try (Response response = client.newCall(request).execute()) {
        return response.body().string();
      }
    }
    public String request(String url) throws IOException{
        Request request = new Request.Builder()
          .url(url)
          .build();
      try (Response response = client.newCall(request).execute()) {
        return response.body().string();
      }
        
    }
}
