package xfinity.com.model.network;

import rx.Observable;
import xfinity.com.model.network.model.SimpsonCharModel;
import xfinity.com.model.network.model.SimpsonsWireModel;

/**
 * Created by root on 1/20/18.
 */

public interface ApiHelper {

      Observable<SimpsonCharModel> getSimpsonsCharacterViewer();

      Observable<SimpsonsWireModel> getWireCharacterViewer();
}
