package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesConfig;
import gg.squire.mahoghomes.model.PlankSack;
import javax.inject.Inject;
import net.runelite.api.Item;
@TaskDesc(name = "Checking plank sack", priority = Integer.MAX_VALUE, blocking = true)
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/CheckSack.class */
public class CheckSack extends Task {
    private final PlankSack plankSack;
    private final SquireHomesConfig config;

    @Inject
    public CheckSack(PlankSack plankSack, SquireHomesConfig config) {
        this.plankSack = plankSack;
        this.config = config;
    }

    public boolean run() {
        Item sack;
        if (!this.config.sack() || this.plankSack.known() || (sack = this.plankSack.getItem()) == null) {
            return false;
        }
        sack.interact("Check");
        return true;
    }
}
