package edmt.dev.androidnewsapp.Interface;

import edmt.dev.androidnewsapp.Model.News;
import edmt.dev.androidnewsapp.Model.WebSite;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by reale on 10/4/2017.
 */

public interface NewsService {
    @GET("v1/sources?language=en")
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
