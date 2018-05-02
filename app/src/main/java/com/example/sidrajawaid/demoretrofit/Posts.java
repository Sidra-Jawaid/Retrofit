
package com.example.sidrajawaid.demoretrofit;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Posts implements Serializable
{

    @SerializedName("totalItems")
    @Expose
    private int totalItems;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    private final static long serialVersionUID = -9013930226379739255L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Posts() {
    }

    /**
     * 
     * @param totalItems
     * @param selfLink
     */
    public Posts(int totalItems, String selfLink) {
        super();
        this.totalItems = totalItems;
        this.selfLink = selfLink;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public Posts withTotalItems(int totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public Posts withSelfLink(String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

}
