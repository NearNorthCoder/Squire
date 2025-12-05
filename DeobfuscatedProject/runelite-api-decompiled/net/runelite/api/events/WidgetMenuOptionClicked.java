/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import javax.annotation.Nullable;
import net.runelite.api.widgets.WidgetInfo;

@Deprecated
public class WidgetMenuOptionClicked {
    private String menuOption;
    private String menuTarget;
    @Nullable
    private WidgetInfo widget;
    private int widgetId;

    public String getMenuOption() {
        return this.menuOption;
    }

    public String getMenuTarget() {
        return this.menuTarget;
    }

    @Nullable
    public WidgetInfo getWidget() {
        return this.widget;
    }

    public int getWidgetId() {
        return this.widgetId;
    }

    public void setMenuOption(String menuOption) {
        this.menuOption = menuOption;
    }

    public void setMenuTarget(String menuTarget) {
        this.menuTarget = menuTarget;
    }

    public void setWidget(@Nullable WidgetInfo widget) {
        this.widget = widget;
    }

    public void setWidgetId(int widgetId) {
        this.widgetId = widgetId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetMenuOptionClicked)) {
            return false;
        }
        WidgetMenuOptionClicked other = (WidgetMenuOptionClicked)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getWidgetId() != other.getWidgetId()) {
            return false;
        }
        String this$menuOption = this.getMenuOption();
        String other$menuOption = other.getMenuOption();
        if (this$menuOption == null ? other$menuOption != null : !this$menuOption.equals(other$menuOption)) {
            return false;
        }
        String this$menuTarget = this.getMenuTarget();
        String other$menuTarget = other.getMenuTarget();
        if (this$menuTarget == null ? other$menuTarget != null : !this$menuTarget.equals(other$menuTarget)) {
            return false;
        }
        WidgetInfo this$widget = this.getWidget();
        WidgetInfo other$widget = other.getWidget();
        return !(this$widget == null ? other$widget != null : !((Object)((Object)this$widget)).equals((Object)other$widget));
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetMenuOptionClicked;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getWidgetId();
        String $menuOption = this.getMenuOption();
        result = result * 59 + ($menuOption == null ? 43 : $menuOption.hashCode());
        String $menuTarget = this.getMenuTarget();
        result = result * 59 + ($menuTarget == null ? 43 : $menuTarget.hashCode());
        WidgetInfo $widget = this.getWidget();
        result = result * 59 + ($widget == null ? 43 : ((Object)((Object)$widget)).hashCode());
        return result;
    }

    public String toString() {
        return "WidgetMenuOptionClicked(menuOption=" + this.getMenuOption() + ", menuTarget=" + this.getMenuTarget() + ", widget=" + String.valueOf((Object)this.getWidget()) + ", widgetId=" + this.getWidgetId() + ")";
    }
}

