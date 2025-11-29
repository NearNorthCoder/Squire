/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping Talisman", priority=10)
public class DroppingTalismanTask
extends RunecraftingTaskBase {

    static {
        u.lIIIIIIIIlIlIIl();
        u.lIIIIIIIIlIlIII();
    }

    private static void lIIIIIIIIlIlIII() {
        llIlIIIIlIlI = new String[llIlIIIIlIll[2]];
        u.llIlIIIIlIlI[u.llIlIIIIlIll[0]] = "Drop";
        u.llIlIIIIlIlI[u.llIlIIIIlIll[1]] = "Portal talisman";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        if (u.lIIIIIIIIlIlIlI(this.aW.useTalisman() ? 1 : 0)) {
            return llIlIIIIlIll[0];
        }
        Item var1 = Inventory.getFirst(item -> item.getName().startsWith(llIlIIIIlIlI[llIlIIIIlIll[1]]));
        if (u.lIIIIIIIIlIlIll(var1)) {
            return llIlIIIIlIll[0];
        }
        var1_1.interact(llIlIIIIlIlI[llIlIIIIlIll[0]]);
        return llIlIIIIlIll[1];
    }

    private static boolean lIIIIIIIIlIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIIlIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    protected boolean aj() {
        return llIlIIIIlIll[1];
    }

    @Inject
    public DroppingTalismanTask(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, new c[llIlIIIIlIll[0]]);
    }
}

