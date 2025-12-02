/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayLayer
 *  net.runelite.client.ui.overlay.OverlayPosition
 */
package gg.squire.client.ui.overlay;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.fw.OverlayAddition;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

public class DebugOverlay<T extends SquirePlugin>
extends Overlay {
    private final T plugin;
    private final TaskManager taskManager;

    public DebugOverlay(T plugin) {
        this.plugin = plugin;
        this.taskManager = ((SquirePlugin)((Object)plugin)).getManager();
        this.setLayer(OverlayLayer.ABOVE_SCENE);
        this.setPosition(OverlayPosition.DYNAMIC);
    }

    public Dimension render(Graphics2D graphics) {
        if (((SquirePlugin)((Object)this.plugin)).debugOverlaysDisabled()) {
            return null;
        }
        for (Task task : this.taskManager.getTasks()) {
            if (!(task instanceof OverlayAddition)) continue;
            ((OverlayAddition)((Object)task)).render(graphics);
        }
        return null;
    }
}
