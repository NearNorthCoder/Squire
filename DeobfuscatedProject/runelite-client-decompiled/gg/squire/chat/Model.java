/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

public enum Model {
    GPT35TURBO("gpt-3.5-turbo"),
    GPT4("gpt-4"),
    GPT4TURBO("gpt-4-turbo-preview");

    private final String apiName;

    private Model(String apiName) {
        this.apiName = apiName;
    }

    public String getApiName() {
        return this.apiName;
    }
}

