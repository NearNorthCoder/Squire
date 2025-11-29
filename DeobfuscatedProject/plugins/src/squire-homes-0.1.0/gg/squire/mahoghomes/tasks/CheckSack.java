/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 */
package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesConfig;
import gg.squire.mahoghomes.model.PlankSack;
import javax.inject.Inject;
import net.runelite.api.Item;

@TaskDesc(name="Checking plank sack", priority=0x7FFFFFFF, blocking=true)
public class CheckSack
extends Task {
    private final PlankSack plankSack;
    private final SquireHomesConfig config;

    @Inject
    public CheckSack(PlankSack plankSack, SquireHomesConfig config) {
        this.plankSack = plankSack;
        this.config = config;
    }

    public boolean run() {
        if (!this.config.sack()) {
            return false;
        }
        if (this.plankSack.known()) {
            return false;
        }
        Item sack = this.plankSack.getItem();
        if (sack == null) {
            return false;
        }
        sack.interact("Check");
        return true;
    }
}

