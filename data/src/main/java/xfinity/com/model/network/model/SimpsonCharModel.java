package xfinity.com.model.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ADMIN on 10/1/2018.
 */

public class SimpsonCharModel {
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("Definition")
    @Expose
    private String definition;
    @SerializedName("AbstractURL")
    @Expose
    private String abstractURL;
    @SerializedName("AbstractSource")
    @Expose
    private String abstractSource;
    @SerializedName("ImageWidth")
    @Expose
    private String imageWidth;
    @SerializedName("Infobox")
    @Expose
    private String infobox;
    @SerializedName("AnswerType")
    @Expose
    private String answerType;
    @SerializedName("Abstract")
    @Expose
    private String _abstract;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("ImageIsLogo")
    @Expose
    private String imageIsLogo;
    @SerializedName("Answer")
    @Expose
    private String answer;
    @SerializedName("Redirect")
    @Expose
    private String redirect;
    @SerializedName("Heading")
    @Expose
    private String heading;
    @SerializedName("Results")
    @Expose
    private List<Object> results = null;
    @SerializedName("AbstractText")
    @Expose
    private String abstractText;
    @SerializedName("DefinitionURL")
    @Expose
    private String definitionURL;
    @SerializedName("DefinitionSource")
    @Expose
    private String definitionSource;
    @SerializedName("Entity")
    @Expose
    private String entity;
    @SerializedName("RelatedTopics")
    @Expose
    private List<RelatedTopic> relatedTopics = null;
    @SerializedName("ImageHeight")
    @Expose
    private String imageHeight;
    @SerializedName("Type")
    @Expose
    private String type;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getAbstractURL() {
        return abstractURL;
    }

    public void setAbstractURL(String abstractURL) {
        this.abstractURL = abstractURL;
    }

    public String getAbstractSource() {
        return abstractSource;
    }

    public void setAbstractSource(String abstractSource) {
        this.abstractSource = abstractSource;
    }

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getInfobox() {
        return infobox;
    }

    public void setInfobox(String infobox) {
        this.infobox = infobox;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getImageIsLogo() {
        return imageIsLogo;
    }

    public void setImageIsLogo(String imageIsLogo) {
        this.imageIsLogo = imageIsLogo;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<Object> getResults() {
        return results;
    }

    public void setResults(List<Object> results) {
        this.results = results;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public String getDefinitionURL() {
        return definitionURL;
    }

    public void setDefinitionURL(String definitionURL) {
        this.definitionURL = definitionURL;
    }

    public String getDefinitionSource() {
        return definitionSource;
    }

    public void setDefinitionSource(String definitionSource) {
        this.definitionSource = definitionSource;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public List<RelatedTopic> getRelatedTopics() {
        return relatedTopics;
    }

    public void setRelatedTopics(List<RelatedTopic> relatedTopics) {
        this.relatedTopics = relatedTopics;
    }

    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}