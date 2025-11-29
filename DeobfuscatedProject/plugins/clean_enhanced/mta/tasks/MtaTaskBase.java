/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.widgets.WidgetItem
 */
package gg.squire.mta.tasks;

import gg.squire.mta.MagicArenaConfig;
import java.awt.Graphics2D;
import javax.inject.Inject;
import gg.squire.mta.tasks.GameEnum2;
import net.runelite.api.widgets.WidgetItem;

public abstract class MtaTaskBase {
    protected final  MagicArenaConfig o;

    protected MagicArenaConfig e() {
        return this.o;
    }

    public abstract c d();

    public void renderItemOverlay(Graphics2D graphics2D, int n2, WidgetItem widgetItem) {
    }

    public abstract boolean c();

    @Inject
    protected MtaTaskBase(MagicArenaConfig magicArenaConfig) {
        this.o = magicArenaConfig;
    }

    public void a(Graphics2D graphics2D) {
    }
}

