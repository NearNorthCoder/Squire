/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

import gg.squire.chat.CompletionRequest;
import java.util.List;

public static class CompletionRequest.CompletionRequestBuilder {
    private String model;
    private List<CompletionRequest.Message> messages;
    private boolean numberOfChoices$set;
    private int numberOfChoices$value;

    CompletionRequest.CompletionRequestBuilder() {
    }

    public CompletionRequest.CompletionRequestBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CompletionRequest.CompletionRequestBuilder messages(List<CompletionRequest.Message> messages) {
        this.messages = messages;
        return this;
    }

    public CompletionRequest.CompletionRequestBuilder numberOfChoices(int numberOfChoices) {
        this.numberOfChoices$value = numberOfChoices;
        this.numberOfChoices$set = true;
        return this;
    }

    public CompletionRequest build() {
        int numberOfChoices$value = this.numberOfChoices$value;
        if (!this.numberOfChoices$set) {
            numberOfChoices$value = CompletionRequest.$default$numberOfChoices();
        }
        return new CompletionRequest(this.model, this.messages, numberOfChoices$value);
    }

    public String toString() {
        return "CompletionRequest.CompletionRequestBuilder(model=" + this.model + ", messages=" + String.valueOf(this.messages) + ", numberOfChoices$value=" + this.numberOfChoices$value + ")";
    }
}
