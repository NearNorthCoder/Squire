/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

import gg.squire.chat.CompletionRequest;

public static class CompletionRequest.Message.MessageBuilder {
    private String role;
    private String content;

    CompletionRequest.Message.MessageBuilder() {
    }

    public CompletionRequest.Message.MessageBuilder role(String role) {
        this.role = role;
        return this;
    }

    public CompletionRequest.Message.MessageBuilder content(String content) {
        this.content = content;
        return this;
    }

    public CompletionRequest.Message build() {
        return new CompletionRequest.Message(this.role, this.content);
    }

    public String toString() {
        return "CompletionRequest.Message.MessageBuilder(role=" + this.role + ", content=" + this.content + ")";
    }
}
