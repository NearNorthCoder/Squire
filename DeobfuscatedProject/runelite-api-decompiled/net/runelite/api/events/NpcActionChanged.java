/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.NPCComposition;

public class NpcActionChanged {
    private NPCComposition npcComposition;
    private int idx;

    public NPCComposition getNpcComposition() {
        return this.npcComposition;
    }

    public int getIdx() {
        return this.idx;
    }

    public void setNpcComposition(NPCComposition npcComposition) {
        this.npcComposition = npcComposition;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof NpcActionChanged)) {
            return false;
        }
        NpcActionChanged other = (NpcActionChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getIdx() != other.getIdx()) {
            return false;
        }
        NPCComposition this$npcComposition = this.getNpcComposition();
        NPCComposition other$npcComposition = other.getNpcComposition();
        return !(this$npcComposition == null ? other$npcComposition != null : !this$npcComposition.equals(other$npcComposition));
    }

    protected boolean canEqual(Object other) {
        return other instanceof NpcActionChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getIdx();
        NPCComposition $npcComposition = this.getNpcComposition();
        result = result * 59 + ($npcComposition == null ? 43 : $npcComposition.hashCode());
        return result;
    }

    public String toString() {
        return "NpcActionChanged(npcComposition=" + String.valueOf(this.getNpcComposition()) + ", idx=" + this.getIdx() + ")";
    }
}

