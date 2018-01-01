package edmt.dev.androidnewsapp.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by reale on 10/4/2017.
 */

public class RetrofitClient {
    private static Retrofit retrofit=null;
    public static Retrofit getClient(String baseUrl)
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
