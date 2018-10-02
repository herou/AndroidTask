package com.xfinity.simpsonsviewer.ui.simpsons;

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

public class SimpsPresenter implements SimpsMvpPresenter {

    Context context;
    SimpsActivity simpsCharViewerActivity;
    ApiHelper apiHelper;

    public SimpsPresenter(Context context, SimpsActivity simpsCharViewerActivity) {
        this.context = context;
        this.simpsCharViewerActivity = simpsCharViewerActivity;
        apiHelper = new AppApiHelper();
    }

    @Override
    public void getSimpsonsCharacterViewer() {
        simpsCharViewerActivity.viewStateLoading();
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
                        simpsCharViewerActivity.viewStateError();

                    }

                    @Override
                    public void onNext(SimpsonCharModel simpsonCharModel) {
                        if(simpsonCharModel.getRelatedTopics().size() > 0){
                            simpsCharViewerActivity.viewState();
                            simpsCharViewerActivity.showSimpsCharViewer(simpsonCharModel.getRelatedTopics());
                        }
                    }
                });
    }
}
