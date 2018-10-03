package com.xfinity.wireviewer.ui;

import java.util.List;

import xfinity.com.model.network.model.RelatedTopic;

/**
 * Created by Eljo on 9/5/2018.
 */

public interface WireMvpView {

    void  showWireViewer(List<RelatedTopic> relatedTopics);

    void viewStateLoading();

    void viewStateError();

    void viewState();
}
