/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.banktags.tabs;

import net.runelite.client.plugins.banktags.tabs.Layout;

public class TagTab {
    private String tag;
    private int iconItemId;
    private Layout layout;

    TagTab(int iconItemId, String tag) {
        this.iconItemId = iconItemId;
        this.tag = tag;
    }

    public boolean hasLayout() {
        return this.layout != null;
    }

    public String getTag() {
        return this.tag;
    }

    public int getIconItemId() {
        return this.iconItemId;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setIconItemId(int iconItemId) {
        this.iconItemId = iconItemId;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public String toString() {
        return "TagTab(tag=" + this.getTag() + ", iconItemId=" + this.getIconItemId() + ", layout=" + String.valueOf(this.getLayout()) + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TagTab)) {
            return false;
        }
        TagTab other = (TagTab)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$tag = this.getTag();
        String other$tag = other.getTag();
        return !(this$tag == null ? other$tag != null : !this$tag.equals(other$tag));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TagTab;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $tag = this.getTag();
        result = result * 59 + ($tag == null ? 43 : $tag.hashCode());
        return result;
    }

    public TagTab() {
    }
}

