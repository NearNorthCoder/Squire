package gg.squire.warriorsGuild.model;

import java.util.List;
/* loaded from: squire-warriors-guild-0.0.1.jar:gg/squire/warriorsGuild/model/ArmourSet.class */
public enum ArmourSet {
    MITHRIL(List.of(1159, 1121, 1071));
    
    private final List<Integer> armourSetType;

    ArmourSet(List list) {
        this.armourSetType = list;
    }

    public List<Integer> getArmourSetType() {
        return this.armourSetType;
    }
}
