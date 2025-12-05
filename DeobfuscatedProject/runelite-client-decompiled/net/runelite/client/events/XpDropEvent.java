/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package net.runelite.client.events;

import net.runelite.api.Skill;

public final class XpDropEvent {
    private final Skill skill;
    private final int exp;

    public XpDropEvent(Skill skill, int exp) {
        this.skill = skill;
        this.exp = exp;
    }

    public Skill getSkill() {
        return this.skill;
    }

    public int getExp() {
        return this.exp;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof XpDropEvent)) {
            return false;
        }
        XpDropEvent other = (XpDropEvent)o;
        if (this.getExp() != other.getExp()) {
            return false;
        }
        Skill this$skill = this.getSkill();
        Skill other$skill = other.getSkill();
        return !(this$skill == null ? other$skill != null : !this$skill.equals(other$skill));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getExp();
        Skill $skill = this.getSkill();
        result = result * 59 + ($skill == null ? 43 : $skill.hashCode());
        return result;
    }

    public String toString() {
        return "XpDropEvent(skill=" + String.valueOf(this.getSkill()) + ", exp=" + this.getExp() + ")";
    }
}

