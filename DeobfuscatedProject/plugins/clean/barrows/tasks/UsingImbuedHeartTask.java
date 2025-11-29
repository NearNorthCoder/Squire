/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Using imbued heart", priority=13337, blocking=true)
public class UsingImbuedHeartTask
extends Task {
    
    private final  SquireBarrows aa;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (r.lIllIIlllllIIl(this.aa.m() ? 1 : 0) && r.lIllIIlllllIIl(this.aa.h() ? 1 : 0)) {
            return llllIIIllll[0];
        }
        int[] nArray = new int[llllIIIllll[1]];
        nArray[r.llllIIIllll[0]] = llllIIIllll[2];
        nArray[r.llllIIIllll[3]] = llllIIIllll[4];
        Item var1 = Inventory.getFirst((int[])nArray);
        if (r.lIllIIlllllIlI(var1)) {
            return llllIIIllll[0];
        }
        int var2 = Vars.getBit((int)llllIIIllll[5]);
        if (r.lIllIIlllllIll(var2)) {
            return llllIIIllll[0];
        }
        var1_1.interact(llllIIIlllI[llllIIIllll[0]]);
        return llllIIIllll[3];
    }

    private static boolean lIllIIlllllIll(int n2) {
        return n2 > 0;
    }

    private static void lIllIIllllIlll() {
        llllIIIlllI = new String[llllIIIllll[3]];
        r.llllIIIlllI[r.llllIIIllll[0]] = "Invigorate";
    }

    private static boolean lIllIIlllllIIl(int n2) {
        return n2 == 0;
    }

    static {
        r.lIllIIlllllIII();
        r.lIllIIllllIlll();
    }

    @Inject
    public UsingImbuedHeartTask(SquireBarrows squireBarrows) {
        this.aa = squireBarrows;
    }

    private static boolean lIllIIlllllIlI(Object object) {
        return object == null;
    }

}

