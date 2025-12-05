/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.widgets.Widget;

public class WidgetHiddenChanged {
    private Widget widget;
    private boolean hidden;

    public Widget getWidget() {
        return this.widget;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WidgetHiddenChanged)) {
            return false;
        }
        WidgetHiddenChanged other = (WidgetHiddenChanged)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isHidden() != other.isHidden()) {
            return false;
        }
        Widget this$widget = this.getWidget();
        Widget other$widget = other.getWidget();
        return !(this$widget == null ? other$widget != null : !this$widget.equals(other$widget));
    }

    protected boolean canEqual(Object other) {
        return other instanceof WidgetHiddenChanged;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isHidden() ? 79 : 97);
        Widget $widget = this.getWidget();
        result = result * 59 + ($widget == null ? 43 : $widget.hashCode());
        return result;
    }

    public String toString() {
        return "WidgetHiddenChanged(widget=" + String.valueOf(this.getWidget()) + ", hidden=" + this.isHidden() + ")";
    }
}

