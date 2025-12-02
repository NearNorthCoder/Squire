/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

public class CompletionResponse.Message {
    String role;
    String content;

    public String getRole() {
        return this.role;
    }

    public String getContent() {
        return this.content;
    }

    public String toString() {
        return "CompletionResponse.Message(role=" + this.getRole() + ", content=" + this.getContent() + ")";
    }
}
