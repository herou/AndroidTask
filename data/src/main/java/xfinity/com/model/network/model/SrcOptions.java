package xfinity.com.model.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ADMIN on 10/1/2018.
 */

public class SrcOptions {
    @SerializedName("is_fanon")
    @Expose
    private Integer isFanon;
    @SerializedName("min_abstract_length")
    @Expose
    private String minAbstractLength;
    @SerializedName("is_wikipedia")
    @Expose
    private Integer isWikipedia;
    @SerializedName("skip_abstract_paren")
    @Expose
    private Integer skipAbstractParen;
    @SerializedName("directory")
    @Expose
    private String directory;
    @SerializedName("skip_qr")
    @Expose
    private String skipQr;
    @SerializedName("skip_image_name")
    @Expose
    private Integer skipImageName;
    @SerializedName("skip_abstract")
    @Expose
    private Integer skipAbstract;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("skip_icon")
    @Expose
    private Integer skipIcon;
    @SerializedName("skip_end")
    @Expose
    private String skipEnd;
    @SerializedName("source_skip")
    @Expose
    private String sourceSkip;
    @SerializedName("is_mediawiki")
    @Expose
    private Integer isMediawiki;
    @SerializedName("src_info")
    @Expose
    private String srcInfo;

    public Integer getIsFanon() {
        return isFanon;
    }

    public void setIsFanon(Integer isFanon) {
        this.isFanon = isFanon;
    }

    public String getMinAbstractLength() {
        return minAbstractLength;
    }

    public void setMinAbstractLength(String minAbstractLength) {
        this.minAbstractLength = minAbstractLength;
    }

    public Integer getIsWikipedia() {
        return isWikipedia;
    }

    public void setIsWikipedia(Integer isWikipedia) {
        this.isWikipedia = isWikipedia;
    }

    public Integer getSkipAbstractParen() {
        return skipAbstractParen;
    }

    public void setSkipAbstractParen(Integer skipAbstractParen) {
        this.skipAbstractParen = skipAbstractParen;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getSkipQr() {
        return skipQr;
    }

    public void setSkipQr(String skipQr) {
        this.skipQr = skipQr;
    }

    public Integer getSkipImageName() {
        return skipImageName;
    }

    public void setSkipImageName(Integer skipImageName) {
        this.skipImageName = skipImageName;
    }

    public Integer getSkipAbstract() {
        return skipAbstract;
    }

    public void setSkipAbstract(Integer skipAbstract) {
        this.skipAbstract = skipAbstract;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getSkipIcon() {
        return skipIcon;
    }

    public void setSkipIcon(Integer skipIcon) {
        this.skipIcon = skipIcon;
    }

    public String getSkipEnd() {
        return skipEnd;
    }

    public void setSkipEnd(String skipEnd) {
        this.skipEnd = skipEnd;
    }

    public String getSourceSkip() {
        return sourceSkip;
    }

    public void setSourceSkip(String sourceSkip) {
        this.sourceSkip = sourceSkip;
    }

    public Integer getIsMediawiki() {
        return isMediawiki;
    }

    public void setIsMediawiki(Integer isMediawiki) {
        this.isMediawiki = isMediawiki;
    }

    public String getSrcInfo() {
        return srcInfo;
    }

    public void setSrcInfo(String srcInfo) {
        this.srcInfo = srcInfo;
    }



}
