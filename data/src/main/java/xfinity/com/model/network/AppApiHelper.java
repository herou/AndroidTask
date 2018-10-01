package xfinity.com.model.network;

import rx.Observable;
import xfinity.com.model.network.model.SimpsonCharModel;
import xfinity.com.model.network.model.SimpsonsWireModel;


/**
 * Created by root on 1/20/18.
 */

public class AppApiHelper implements ApiHelper{

    final API apiService = APIClient.getClient().create(API.class);

    @Override
    public Observable<SimpsonCharModel> getSimpsonsCharacterViewer() {
        return apiService.getSimpsonsCharacterViewer();
    }

    @Override
    public Observable<SimpsonsWireModel> getWireCharacterViewer() {
        return apiService.getWireCharacterViewer();
    }
}
