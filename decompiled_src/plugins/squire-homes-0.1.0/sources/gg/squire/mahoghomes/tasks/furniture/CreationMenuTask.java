package gg.squire.mahoghomes.tasks.furniture;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesConfig;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Building contract furniture", priority = 10, blocking = true)
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/furniture/CreationMenuTask.class */
public class CreationMenuTask extends Task {
    private static final int CREATION_GROUP_ID = 458;
    private static final int CREATION_OPTIONS_CHILD_ID = 1;
    private final SquireHomesConfig config;

    @Inject
    public CreationMenuTask(SquireHomesConfig config) {
        this.config = config;
    }

    public boolean run() {
        Widget widget = Widgets.get((int) CREATION_GROUP_ID, (int) CREATION_OPTIONS_CHILD_ID);
        if (!Widgets.isVisible(widget)) {
            return false;
        }
        Keyboard.type(this.config.contract().getDialogOption());
        return true;
    }
}
