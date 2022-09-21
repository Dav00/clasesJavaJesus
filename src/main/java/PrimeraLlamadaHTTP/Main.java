package PrimeraLlamadaHTTP;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://boredapi.com/api/activity").get().build();
        try{
            Response response = client.newCall(request).execute();
            if(response.body() == null){
                throw new RuntimeException("No ha llegao na!");
            }
            System.out.println(response.body().string());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
