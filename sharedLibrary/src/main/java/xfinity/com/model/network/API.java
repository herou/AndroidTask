package xfinity.com.model.network;
import retrofit2.http.GET;
import rx.Observable;
import xfinity.com.model.network.model.SimpsonCharModel;
import xfinity.com.model.network.model.SimpsonsWireModel;

/**
 * Created by root on 1/20/18.
 */

public interface API {

    @GET("?q=simpsons+characters&format=json")
    Observable<SimpsonCharModel> getSimpsonsCharacterViewer();

    @GET("?q=the+wire+characters&format=json")
    Observable<SimpsonsWireModel> getWireCharacterViewer();
}

