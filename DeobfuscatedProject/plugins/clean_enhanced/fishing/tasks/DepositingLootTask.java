/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Depositing Loot")
public class DepositingLootTask
extends Task {
    private static final  Logger w;
    
    private  int q;
    private final  SquireFisherConfig x;
    
    private final  SquireFisherPlugin y;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        d var9;
        if ((Widgets.isVisible((Widget == 0)Widgets.get((int)0, (int)1)) ? 1 : 0)) {
            return 2;
        }
        if ((var9.y.e( == 0) ? 1 : 0)) {
            return 2;
        }
        if ((Widgets.isVisible(WidgetWidgets.get((int)0, (int)1)) ? 1 : 0)) {
            Widgets.get((int)0, (int)3).interact(var2[2]);
            var9.y.a(2);
        }
        return 4;
    }

    static {
        d.var10();
        d.var11();
        w = LoggerFactory.getLogger(DepositingLootTask.class);
    }

    @Inject
    public DepositingLootTask(SquireFisherConfig squireFisherConfig, SquireFisherPlugin squireFisherPlugin) {
        this.x = squireFisherConfig;
        this.y = squireFisherPlugin;
    }
}

