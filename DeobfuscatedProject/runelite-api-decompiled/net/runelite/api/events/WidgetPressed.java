/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

public class WidgetPressed {
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetPressed)) {
            return false;
        }
        WidgetPressed other = (WidgetPressed)o;
        return other.canEqual(this);
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetPressed;
    }

    public int hashCode() {
        boolean result = true;
        return 1;
    }

    public String toString() {
        return "WidgetPressed()";
    }
}

