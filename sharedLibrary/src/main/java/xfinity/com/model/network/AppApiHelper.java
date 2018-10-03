package xfinity.com.model.network;

import rx.Observable;
import xfinity.com.model.network.model.WireModel;
import xfinity.com.model.network.model.SimpsonsModel;


/**
 * Created by root on 1/20/18.
 */

public class AppApiHelper implements ApiHelper{

    final API apiService = APIClient.getClient().create(API.class);

    @Override
    public Observable<SimpsonsModel> getSimpsonsCharacterViewer() {
        return apiService.getSimpsonsCharacterViewer();
    }

    @Override
    public Observable<WireModel> getWireCharacterViewer() {
        return apiService.getWireCharacterViewer();
    }
}
