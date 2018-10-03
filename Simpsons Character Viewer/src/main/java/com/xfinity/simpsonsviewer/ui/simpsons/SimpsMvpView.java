package com.xfinity.simpsonsviewer.ui.simpsons;

import java.util.List;
import xfinity.com.model.network.model.RelatedTopic;

/**
 * Created by Eljo on 9/5/2018.
 */

public interface SimpsMvpView {

    void  showSimpsCharViewer(List<RelatedTopic> relatedTopics);

    void viewStateLoading();

    void viewStateError();

    void viewState();
}
