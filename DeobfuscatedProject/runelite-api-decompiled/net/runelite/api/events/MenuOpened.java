/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import java.util.Arrays;
import java.util.Iterator;
import net.runelite.api.MenuEntry;

public class MenuOpened
implements Iterable<MenuEntry> {
    private boolean modified;
    private MenuEntry[] menuEntries;

    public MenuEntry getFirstEntry() {
        if (this.menuEntries.length > 0) {
            return this.menuEntries[this.menuEntries.length - 1];
        }
        return null;
    }

    public void setModified() {
        this.modified = true;
    }

    @Override
    public Iterator<MenuEntry> iterator() {
        return new Iterator<MenuEntry>(){
            int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < MenuOpened.this.menuEntries.length;
            }

            @Override
            public MenuEntry next() {
                return MenuOpened.this.menuEntries[this.index++];
            }
        };
    }

    public boolean isModified() {
        return this.modified;
    }

    public MenuEntry[] getMenuEntries() {
        return this.menuEntries;
    }

    public void setMenuEntries(MenuEntry[] menuEntries) {
        this.menuEntries = menuEntries;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MenuOpened)) {
            return false;
        }
        MenuOpened other = (MenuOpened)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isModified() != other.isModified()) {
            return false;
        }
        return Arrays.deepEquals(this.getMenuEntries(), other.getMenuEntries());
    }

    protected boolean canEqual(Object other) {
        return other instanceof MenuOpened;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isModified() ? 79 : 97);
        result = result * 59 + Arrays.deepHashCode(this.getMenuEntries());
        return result;
    }

    public String toString() {
        return "MenuOpened(modified=" + this.isModified() + ", menuEntries=" + Arrays.deepToString(this.getMenuEntries()) + ")";
    }
}

