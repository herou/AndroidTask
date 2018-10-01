package com.xfinity.wireviewer.ui;

import android.content.Context;
import android.util.Log;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import xfinity.com.model.network.ApiHelper;
import xfinity.com.model.network.AppApiHelper;
import xfinity.com.model.network.model.SimpsonCharModel;
import xfinity.com.model.network.model.SimpsonsWireModel;

/**
 * Created by Eljo on 9/5/2018.
 */

public class WireCharViewerPresenter implements WireCharViewerMvpPresenter {

    Context context;
    WireCharViewerActivity wireCharViewerActivity;
    ApiHelper apiHelper;

    public WireCharViewerPresenter(Context context, WireCharViewerActivity wireCharViewerActivity) {
        this.context = context;
        this.wireCharViewerActivity = wireCharViewerActivity;
        apiHelper = new AppApiHelper();
    }

    @Override
    public void getWireCharacterViewer() {
        apiHelper.getWireCharacterViewer()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<SimpsonsWireModel>() {
                    @Override
                    public void onCompleted() {
                        Log.d("onCompleted : ","");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("Problem : ", e.getMessage());


                    }

                    @Override
                    public void onNext(SimpsonsWireModel simpsonsWireModel) {
                        Log.d("onNext : ","");
                    }

                });
    }
}
