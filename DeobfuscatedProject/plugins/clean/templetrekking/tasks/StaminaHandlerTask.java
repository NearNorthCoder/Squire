/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Stamina handler")
public class StaminaHandlerTask
extends Task {
    
    private final  TempleTrekkingConfig P;
    private final  TempleTrekkingPlugin O;

        return String.valueOf(var1);
    }

    private static boolean lIlIllllllllIIl(Object object) {
        return object == null;
    }

    private static void lIlIlllllllIlll() {
        lIIllIIllIlII = new String[lIIllIIllIlIl[4]];
        p.lIIllIIllIlII[p.lIIllIIllIlIl[0]] = "Drink";
        p.lIIllIIllIlII[p.lIIllIIllIlIl[3]] = "Stamina";
    }

    private static boolean lIlIlllllllllII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        p.lIlIllllllllIII();
        p.lIlIlllllllIlll();
    }

    @Inject
    StaminaHandlerTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        this.O = templeTrekkingPlugin;
        this.P = templeTrekkingConfig;
    }

    private static boolean lIlIllllllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllllllllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIIllIIllIlII[lIIllIIllIlIl[3]]));
        if (p.lIlIllllllllIIl(item2)) {
            return lIIllIIllIlIl[0];
        }
        if (p.lIlIllllllllIlI(Movement.getRunEnergy(), lIIllIIllIlIl[1])) {
            return lIIllIIllIlIl[0];
        }
        if (p.lIlIllllllllIll(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIIllIIllIlIl[0];
        }
        if (p.lIlIlllllllllII(Movement.getRunEnergy(), lIIllIIllIlIl[2])) {
            void var2;
            var2.interact(lIIllIIllIlII[lIIllIIllIlIl[0]]);
            return lIIllIIllIlIl[3];
        }
        return lIIllIIllIlIl[0];
    }
}

