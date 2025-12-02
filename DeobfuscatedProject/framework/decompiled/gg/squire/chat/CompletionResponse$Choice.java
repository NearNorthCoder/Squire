/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

import gg.squire.chat.CompletionResponse;

public class CompletionResponse.Choice {
    int index;
    CompletionResponse.Message message;
    String logprobs;
    String finish_reason;

    public int getIndex() {
        return this.index;
    }

    public CompletionResponse.Message getMessage() {
        return this.message;
    }

    public String getLogprobs() {
        return this.logprobs;
    }

    public String getFinish_reason() {
        return this.finish_reason;
    }

    public String toString() {
        return "CompletionResponse.Choice(index=" + this.getIndex() + ", message=" + String.valueOf(this.getMessage()) + ", logprobs=" + this.getLogprobs() + ", finish_reason=" + this.getFinish_reason() + ")";
    }
}
