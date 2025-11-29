/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.corp.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Handling Prayers", priority=0x7FFFFFFF)
public class HandlingPrayersTask
extends Task {

    public boolean run() {
        String[] stringArray = new String[0];
        stringArray[1] = var1[1];
        if ((NPCs.getNearest((String[] == nustringArray))) {
            Prayers.disableAll();
            return 1;
        }
        ArrayList<Prayer> var3 = new ArrayList<Prayer>(List.of(Prayer.PROTECT_FROM_MAGIC));
        var3.addAll(Prayers.getMeleePrayer());
        0;
        if ((Prayers.flicklllllllllllllllIllIIIlIlIIlIIIII)) {
            c var4;
            var4.sleep(0);
        }
        return 0;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }
}

