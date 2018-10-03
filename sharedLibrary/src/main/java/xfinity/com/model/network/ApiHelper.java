package xfinity.com.model.network;

import rx.Observable;
import xfinity.com.model.network.model.WireModel;
import xfinity.com.model.network.model.SimpsonsModel;

/**
 * Created by root on 1/20/18.
 */

public interface ApiHelper {

      Observable<SimpsonsModel> getSimpsonsCharacterViewer();

      Observable<WireModel> getWireCharacterViewer();
}
