package com.example.form_binding.model;

public class EmailBox {
    private Integer id;
    private String languages;
    private Integer pageSize;
    private Boolean spamsFiller;
    private String signature;

    public EmailBox(Integer id, String languages, Integer pageSize, Boolean spamsFiller, String signature) {
        this.id = id;
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamsFiller = spamsFiller;
        this.signature = signature;
    }

    public EmailBox(String languages, Integer pageSize, Boolean spamsFiller, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamsFiller = spamsFiller;
        this.signature = signature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
