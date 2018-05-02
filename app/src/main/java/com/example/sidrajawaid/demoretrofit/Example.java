
package com.example.sidrajawaid.demoretrofit;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example implements Serializable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("published")
    @Expose
    private String published;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    @SerializedName("posts")
    @Expose
    private Posts posts;
    @SerializedName("pages")
    @Expose
    private Pages pages;
    @SerializedName("locale")
    @Expose
    private Locale locale;
    private final static long serialVersionUID = -9208470303424300287L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param id
     * @param updated
     * @param description
     * @param locale
     * @param pages
     * @param name
     * @param posts
     * @param selfLink
     * @param published
     * @param url
     * @param kind
     */
    public Example(String kind, String id, String name, String description, String published, String updated, String url, String selfLink, Posts posts, Pages pages, Locale locale) {
        super();
        this.kind = kind;
        this.id = id;
        this.name = name;
        this.description = description;
        this.published = published;
        this.updated = updated;
        this.url = url;
        this.selfLink = selfLink;
        this.posts = posts;
        this.pages = pages;
        this.locale = locale;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Example withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Example withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Example withName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Example withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public Example withPublished(String published) {
        this.published = published;
        return this;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Example withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Example withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public Example withSelfLink(String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public Example withPosts(Posts posts) {
        this.posts = posts;
        return this;
    }

    public Pages getPages() {
        return pages;
    }

    public void setPages(Pages pages) {
        this.pages = pages;
    }

    public Example withPages(Pages pages) {
        this.pages = pages;
        return this;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Example withLocale(Locale locale) {
        this.locale = locale;
        return this;
    }
    public static int getItem(int i)
    {
        return i;
    }

}
