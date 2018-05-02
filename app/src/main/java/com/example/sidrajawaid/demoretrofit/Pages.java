
package com.example.sidrajawaid.demoretrofit;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pages implements Serializable
{

    @SerializedName("totalItems")
    @Expose
    private int totalItems;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    private final static long serialVersionUID = 2187944532007100050L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pages() {
    }

    /**
     * 
     * @param totalItems
     * @param selfLink
     */
    public Pages(int totalItems, String selfLink) {
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

    public Pages withTotalItems(int totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public Pages withSelfLink(String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

}
