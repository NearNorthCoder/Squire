/*
 * Deobfuscated with CFR 0.152.
 *
 * Telegrab Task
 * Task implementation for casting Telekinetic Grab on ground items.
 *
 * Original obfuscated class: aR
 * Package: i.i.b.s.c.q.r.s.s.-.u.a.e
 */
package gg.squire.basics.tasks;

import com.google.inject.Inject;
import gg.squire.basics.magic.grab.SquireTelegrabConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;

/**
 * Task that automatically casts Telekinetic Grab on configured ground items.
 * Will only attempt to grab items when inventory is not full.
 */
@TaskDesc(name = "Grabbing")
public class TelegrabTask extends Task {

    // Constants
    private static final int SLEEP_AFTER_CAST_MS = 52;
    private static final String ERROR_NO_WIDGET = "Unable to find widget for Telekinetic Grab";

    private final SquireTelegrabConfig config;

    /**
     * Constructs a new TelegrabTask.
     *
     * @param config the telegrab configuration
     */
    @Inject
    public TelegrabTask(SquireTelegrabConfig config) {
        this.config = config;
    }

    /**
     * Selects a spell widget for casting.
     * Sets the client's selected spell information for WIDGET_TARGET interactions.
     *
     * @param widgetInfo the spell's widget info
     */
    public void selectSpellWidget(WidgetInfo widgetInfo) {
        Client client = Static.getClient();
        Widget widget = client.getWidget(widgetInfo);

        if (widget == null) {
            Log.info(ERROR_NO_WIDGET);
            return;
        }

        // Set the selected spell in the client for widget targeting
        client.setSelectedSpellName("<col=00ff00>" + widget.getName() + "</col>");
        client.setSelectedSpellWidget(widget.getId());
        client.setSelectedSpellChildIndex(-1);
    }

    /**
     * Executes the telegrab task.
     * Finds the nearest configured item and casts Telekinetic Grab on it.
     *
     * @return true if the task should continue running, false otherwise
     */
    @Override
    public boolean run() {
        // Find the nearest tile item matching our target ID
        TileItem targetItem = TileItems.getNearest(config.target());

        // Don't grab if inventory is full or no item found
        if (Inventory.isFull() || targetItem == null) {
            return false;
        }

        // Select the Telekinetic Grab spell
        selectSpellWidget(SpellBook.Standard.TELEKINETIC_GRAB.getWidget());

        // Cast the spell on the ground item
        Point sceneLocation = targetItem.getTile().getSceneLocation();
        targetItem.interact(
            targetItem.getId(),
            MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.getId(),
            sceneLocation.getX(),
            sceneLocation.getY()
        );

        // Sleep briefly after casting
        sleep(SLEEP_AFTER_CAST_MS);

        return true;
    }
}
