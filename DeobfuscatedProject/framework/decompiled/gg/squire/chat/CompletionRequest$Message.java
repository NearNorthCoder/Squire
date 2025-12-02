/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

public static class CompletionRequest.Message {
    String role;
    String content;

    CompletionRequest.Message(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public static MessageBuilder builder() {
        return new MessageBuilder();
    }

    public static class MessageBuilder {
        private String role;
        private String content;

        MessageBuilder() {
        }

        public MessageBuilder role(String role) {
            this.role = role;
            return this;
        }

        public MessageBuilder content(String content) {
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
}
