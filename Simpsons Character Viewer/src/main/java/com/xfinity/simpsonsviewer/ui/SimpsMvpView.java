package com.xfinity.simpsonsviewer.ui;

import java.util.List;

import xfinity.com.model.network.model.RelatedTopic;

/**
 * Created by Eljo on 9/5/2018.
 */

public interface SimpsMvpView {

    void  showSimpsCharViewer(List<RelatedTopic> relatedTopics);
}
