/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.chat;

public class CompletionResponse.Usage {
    int prompt_tokens;
    int completion_tokens;
    int total_tokens;

    public int getPrompt_tokens() {
        return this.prompt_tokens;
    }

    public int getCompletion_tokens() {
        return this.completion_tokens;
    }

    public int getTotal_tokens() {
        return this.total_tokens;
    }

    public String toString() {
        return "CompletionResponse.Usage(prompt_tokens=" + this.getPrompt_tokens() + ", completion_tokens=" + this.getCompletion_tokens() + ", total_tokens=" + this.getTotal_tokens() + ")";
    }
}
