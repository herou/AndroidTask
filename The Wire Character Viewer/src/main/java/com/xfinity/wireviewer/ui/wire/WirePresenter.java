package com.xfinity.wireviewer.ui.wire;

import android.content.Context;
import android.util.Log;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import xfinity.com.model.network.ApiHelper;
import xfinity.com.model.network.AppApiHelper;
import xfinity.com.model.network.model.WireModel;

/**
 * Created by Eljo on 9/5/2018.
 */

public class WirePresenter implements WireMvpPresenter {

    Context context;
    WireActivity wireActivity;
    ApiHelper apiHelper;

    public WirePresenter(Context context, WireActivity wireActivity) {
        this.context = context;
        this.wireActivity = wireActivity;
        apiHelper = new AppApiHelper();
    }

    @Override
    public void getWireCharacterViewer() {
        wireActivity.viewStateLoading();
        apiHelper.getWireCharacterViewer()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<WireModel>() {
                    @Override
                    public void onCompleted() {
                        Log.d("onCompleted : ","");
                    }


                    @Override
                    public void onError(Throwable e) {
                        Log.d("Problem : ", e.getMessage());
                        wireActivity.viewStateError();

                    }

                    @Override
                    public void onNext(WireModel simpsonCharModel) {
                        if(simpsonCharModel.getRelatedTopics().size() > 0){
                            wireActivity.viewState();
                            wireActivity.showWireViewer(simpsonCharModel.getRelatedTopics());
                        }
                    }
                });
    }
}
