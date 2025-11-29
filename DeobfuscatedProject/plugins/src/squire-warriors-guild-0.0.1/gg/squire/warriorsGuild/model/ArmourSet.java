/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.warriorsGuild.model;

import java.util.List;

public enum ArmourSet {
    MITHRIL(List.of(Integer.valueOf(1159), Integer.valueOf(1121), Integer.valueOf(1071)));

    private final List<Integer> armourSetType;

    private ArmourSet(List<Integer> armourSetType) {
        this.armourSetType = armourSetType;
    }

    public List<Integer> getArmourSetType() {
        return this.armourSetType;
    }
}

