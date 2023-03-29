package com.example.form_binding.model;

public class Settings {
    private String languages;
    private Integer pageSize;
    private Boolean spamsFiller;
    private String signature;

    public Settings(String languages, Integer pageSize, Boolean spamsFiller, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamsFiller = spamsFiller;
        this.signature = signature;
    }

    public Boolean getSpamsFiller() {
        return spamsFiller;
    }

    public void setSpamsFiller(Boolean spamsFiller) {
        this.spamsFiller = spamsFiller;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
