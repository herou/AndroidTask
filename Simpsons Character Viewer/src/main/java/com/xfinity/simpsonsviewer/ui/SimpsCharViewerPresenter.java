package com.xfinity.simpsonsviewer.ui;

import android.content.Context;
import android.util.Log;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import xfinity.com.model.network.ApiHelper;
import xfinity.com.model.network.AppApiHelper;
import xfinity.com.model.network.model.SimpsonCharModel;

/**
 * Created by Eljo on 9/5/2018.
 */

public class SimpsCharViewerPresenter implements SimpsCharViewerMvpPresenter {

    Context context;
    SimpsCharViewerActivity lobbyActivity;
    ApiHelper apiHelper;

    public SimpsCharViewerPresenter(Context context, SimpsCharViewerActivity lobbyActivity) {
        this.context = context;
        this.lobbyActivity = lobbyActivity;
        apiHelper = new AppApiHelper();
    }

    @Override
    public void getSimpsonsCharacterViewer() {
        apiHelper.getSimpsonsCharacterViewer()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<SimpsonCharModel>() {
                    @Override
                    public void onCompleted() {
                        Log.d("onCompleted : ","");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("Problem : ", e.getMessage());


                    }

                    @Override
                    public void onNext(SimpsonCharModel simpsonCharModel) {
                        Log.d("onNext : ","");

                    }
                });
    }
}
