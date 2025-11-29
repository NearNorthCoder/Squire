/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.MinigamesManager;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;

public class ZHelper
extends MinigamesTaskBase {
    private final  WidgetInfo az;

    public ZHelper(String string, WidgetInfo widgetInfo) {
        super(string);
        this.az = widgetInfo;
    }

    public WidgetInfo M() {
        return this.az;
    }

    @Override
    public boolean c(o o2) {
        Widget widget = Widgets.get((WidgetInfo)this.az);
        if widget == null {
            return 0;
        }
        widget.interact(0);
        return 1;
    }

    static {
        z.var2();
    }
}

