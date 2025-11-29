/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.mahoghomes.tasks.furniture;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesConfig;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Building contract furniture -> BuildingcontractfurnitureTask */
@TaskDesc(name="Building contract furniture", priority=10, blocking=true)
public class CreationMenuTask
extends Task {
    private static final int CREATION_GROUP_ID = 458;
    private static final int CREATION_OPTIONS_CHILD_ID = 1;
    private final SquireHomesConfig config;

    @Inject
    public CreationMenuTask(SquireHomesConfig config) {
        this.config = config;
    }

    public boolean run() {
        Widget widget = Widgets.get((int)458, (int)1);
        if (!Widgets.isVisible((Widget)widget)) {
            return false;
        }
        Keyboard.type((int)this.config.contract().getDialogOption());
        return true;
    }
}

