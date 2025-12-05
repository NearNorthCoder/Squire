/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;

public class MenuEntryAdded {
    private final MenuEntry menuEntry;
    private String option;
    private String target;
    private int type;
    private int identifier;
    private int actionParam0;
    private int actionParam1;
    private boolean forceLeftClick;
    private int itemId;
    private boolean modified;

    public MenuEntryAdded(MenuEntry menuEntry) {
        this.menuEntry = menuEntry;
        this.option = menuEntry.getOption();
        this.target = menuEntry.getTarget();
        this.identifier = menuEntry.getIdentifier();
        this.type = menuEntry.getType().getId();
        this.actionParam0 = menuEntry.getParam0();
        this.actionParam1 = menuEntry.getParam1();
        this.itemId = menuEntry.getItemId();
        this.forceLeftClick = false;
    }

    public void setModified() {
        this.modified = true;
    }

    @Deprecated
    public int getParam0() {
        return this.actionParam0;
    }

    @Deprecated
    public void setParam0(int param) {
        this.actionParam0 = param;
    }

    @Deprecated
    public int getParam1() {
        return this.actionParam1;
    }

    @Deprecated
    public void setParam1(int param) {
        this.actionParam1 = param;
    }

    @Deprecated
    public int getOpcode() {
        return this.type;
    }

    @Deprecated
    public void setOpcode(int opcode) {
        this.type = opcode;
    }

    @Deprecated
    public MenuAction getMenuAction() {
        return MenuAction.of(this.type);
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MenuEntryAdded)) {
            return false;
        }
        MenuEntryAdded other = (MenuEntryAdded)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getType() != other.getType()) {
            return false;
        }
        if (this.getIdentifier() != other.getIdentifier()) {
            return false;
        }
        if (this.getActionParam0() != other.getActionParam0()) {
            return false;
        }
        if (this.getActionParam1() != other.getActionParam1()) {
            return false;
        }
        if (this.isForceLeftClick() != other.isForceLeftClick()) {
            return false;
        }
        if (this.getItemId() != other.getItemId()) {
            return false;
        }
        if (this.isModified() != other.isModified()) {
            return false;
        }
        String this$option = this.getOption();
        String other$option = other.getOption();
        if (this$option == null ? other$option != null : !this$option.equals(other$option)) {
            return false;
        }
        String this$target = this.getTarget();
        String other$target = other.getTarget();
        return !(this$target == null ? other$target != null : !this$target.equals(other$target));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MenuEntryAdded;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getType();
        result = result * 59 + this.getIdentifier();
        result = result * 59 + this.getActionParam0();
        result = result * 59 + this.getActionParam1();
        result = result * 59 + (this.isForceLeftClick() ? 79 : 97);
        result = result * 59 + this.getItemId();
        result = result * 59 + (this.isModified() ? 79 : 97);
        String $option = this.getOption();
        result = result * 59 + ($option == null ? 43 : $option.hashCode());
        String $target = this.getTarget();
        result = result * 59 + ($target == null ? 43 : $target.hashCode());
        return result;
    }

    public String toString() {
        return "MenuEntryAdded(option=" + this.getOption() + ", target=" + this.getTarget() + ", type=" + this.getType() + ", identifier=" + this.getIdentifier() + ", actionParam0=" + this.getActionParam0() + ", actionParam1=" + this.getActionParam1() + ", forceLeftClick=" + this.isForceLeftClick() + ", itemId=" + this.getItemId() + ", modified=" + this.isModified() + ")";
    }

    public MenuEntry getMenuEntry() {
        return this.menuEntry;
    }

    public String getOption() {
        return this.option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getTarget() {
        return this.target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getActionParam0() {
        return this.actionParam0;
    }

    public void setActionParam0(int actionParam0) {
        this.actionParam0 = actionParam0;
    }

    public int getActionParam1() {
        return this.actionParam1;
    }

    public void setActionParam1(int actionParam1) {
        this.actionParam1 = actionParam1;
    }

    public boolean isForceLeftClick() {
        return this.forceLeftClick;
    }

    public void setForceLeftClick(boolean forceLeftClick) {
        this.forceLeftClick = forceLeftClick;
    }

    public int getItemId() {
        return this.itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isModified() {
        return this.modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }
}

