package xfinity.com.model.network;
import retrofit2.http.GET;
import rx.Observable;
import xfinity.com.model.network.model.WireModel;
import xfinity.com.model.network.model.SimpsonsModel;

/**
 * Created by root on 1/20/18.
 */

public interface API {

    @GET("?q=simpsons+characters&format=json")
    Observable<SimpsonsModel> getSimpsonsCharacterViewer();

    @GET("?q=the+wire+characters&format=json")
    Observable<WireModel> getWireCharacterViewer();
}

