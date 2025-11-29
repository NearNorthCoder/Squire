package gg.squire.warriorsGuild.model;

import java.util.List;
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/model/Defender.class */
public enum Defender {
    PRE_DRAGON(List.of(8844, 8845, 8846, 8847, 8848, 8849, 8850)),
    DRAGON(List.of(12954));
    
    private final List<Integer> defenderType;

    Defender(List list) {
        this.defenderType = list;
    }

    public List<Integer> getDefenderType() {
        return this.defenderType;
    }
}
