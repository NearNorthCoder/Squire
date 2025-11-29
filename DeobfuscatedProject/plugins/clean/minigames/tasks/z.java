/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.minigames.tasks;

import gg.squire.minigames.tasks.OHelper;
import gg.squire.minigames.tasks.MinigamesTaskBase;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;

public class z
extends MinigamesTaskBase {
    private final  WidgetInfo az;

    public z(String string, WidgetInfo widgetInfo) {
        super(string);
        this.az = widgetInfo;
    }

    public WidgetInfo M() {
        return this.az;
    }

    @Override
    public boolean c(o o2) {
        Widget widget = Widgets.get((WidgetInfo)this.az);
        if (z.llIIlllIIIlllI(widget)) {
            return lIIllIIIlllI[0];
        }
        widget.interact(lIIllIIIlllI[0]);
        return lIIllIIIlllI[1];
    }

    private static boolean llIIlllIIIlllI(Object object) {
        return object == null;
    }

    static {
        z.llIIlllIIIllIl();
    }
}

