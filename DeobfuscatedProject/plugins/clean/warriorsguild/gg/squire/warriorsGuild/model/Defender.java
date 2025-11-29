/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.warriorsGuild.model;

import java.util.List;

public enum Defender {
    PRE_DRAGON(List.of(Integer.valueOf(8844), Integer.valueOf(8845), Integer.valueOf(8846), Integer.valueOf(8847), Integer.valueOf(8848), Integer.valueOf(8849), Integer.valueOf(8850))),
    DRAGON(List.of(Integer.valueOf(12954)));

    private final List<Integer> defenderType;

    private Defender(List<Integer> defenderType) {
        this.defenderType = defenderType;
    }

    public List<Integer> getDefenderType() {
        return this.defenderType;
    }
}

