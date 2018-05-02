
package com.example.sidrajawaid.demoretrofit;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Locale implements Serializable
{

    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("variant")
    @Expose
    private String variant;
    private final static long serialVersionUID = 6555845731675475737L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Locale() {
    }

    /**
     * 
     * @param language
     * @param variant
     * @param country
     */
    public Locale(String language, String country, String variant) {
        super();
        this.language = language;
        this.country = country;
        this.variant = variant;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Locale withLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Locale withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public Locale withVariant(String variant) {
        this.variant = variant;
        return this;
    }

}
