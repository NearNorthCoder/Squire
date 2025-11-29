/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.slayer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.slayer.tasks.GameEnum;

@TaskDesc(name="Checking for Task", priority=0x7FFFFFFF, blocking=true)
public class CheckingForTask
extends Task {

    private static final  Logger z;
    private final  SquireSkipperPlugin A;

    private static boolean lIlllIllIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIlllIllIIIlllI();
        e.lIlllIllIIIIIIl();
        z = LoggerFactory.getLogger(CheckingForTask.class);
    }

    @Inject
    public CheckingForTask(SquireSkipperPlugin squireSkipperPlugin) {
        this.A = squireSkipperPlugin;
    }

    private static void lIlllIllIIIIIIl() {
        lIlIIlIlIIllI = new String[lIlIIlIlIlIIl[5]];
        e.lIlIIlIlIIllI[e.lIlIIlIlIlIIl[1]] = "Check";
        e.lIlIIlIlIIllI[e.lIlIIlIlIlIIl[2]] = "Check";
        e.lIlIIlIlIIllI[e.lIlIIlIlIlIIl[4]] = "slayer helm";
    }

        return String.valueOf(var1);
    }

    private static boolean lIlllIllIIlIIII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        b b2 = this.A.b();
        this.A.d(Static.getClient().getVarbitValue(lIlIIlIlIlIIl[0]));
        if (!e.lIlllIllIIIllll((Object)b2) || e.lIlllIllIIlIIII(this.A.c() ? 1 : 0)) {
            return lIlIIlIlIlIIl[1];
        }
        Item var2 = Equipment.getFirst(item -> item.getName().toLowerCase().contains(lIlIIlIlIIllI[lIlIIlIlIlIIl[4]]));
        if (e.lIlllIllIIlIIIl(var2)) {
            var2.interact(lIlIIlIlIIllI[lIlIIlIlIlIIl[1]]);
            return lIlIIlIlIlIIl[2];
        }
        int[] nArray = new int[lIlIIlIlIlIIl[2]];
        nArray[e.lIlIIlIlIlIIl[1]] = lIlIIlIlIlIIl[3];
        Item var3 = Inventory.getFirst((int[])nArray);
        if (e.lIlllIllIIlIIIl(var3)) {
            var3.interact(lIlIIlIlIIllI[lIlIIlIlIlIIl[2]]);
            return lIlIIlIlIlIIl[2];
        }
        return lIlIIlIlIlIIl[1];
    }

    private static boolean lIlllIllIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIllIIlIIIl(Object object) {
        return object != null;
    }
}

