/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;

@TaskDesc(name="Warden gear swapping", register=true)
public class WardenGearSwappingTask
extends ToaTaskBase {

        return String.valueOf(var1);
    }

    private static boolean lIllIlIIlIlIIlI(Object object) {
        return object == null;
    }

    static {
        H.lIllIlIIlIIllll();
        H.lIllIlIIlIIlllI();
    }

    @Override
    public boolean C() {
        int n2;
        if (!H.lIllIlIIlIlIIIl(this.aL.mageP2Warden().isSelected() ? 1 : 0) || !H.lIllIlIIlIlIIIl(this.aL.rangedP2Warden().isSelected() ? 1 : 0) || !H.lIllIlIIlIlIIIl(this.aL.normalCore().isSelected() ? 1 : 0) || H.lIllIlIIlIlIIII(this.aL.specialCore().isSelected() ? 1 : 0)) {
            n2 = lIIllllIlIIIl[1];

            }
        } else {
            n2 = lIIllllIlIIIl[0];
        }
        return n2 != 0;
    }

    private static boolean lIllIlIIlIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        H var2;
        void var3;
        if (H.lIllIlIIlIlIIII(string.equals(lIIllllIlIIII[lIIllllIlIIIl[0]]) ? 1 : 0)) {
            return this.a(this.aL.specialCore(), this.aL.normalCore(), this.aL.specGearCore());
        }
        if (H.lIllIlIIlIlIIII(var3.equals(lIIllllIlIIII[lIIllllIlIIIl[1]]) ? 1 : 0)) {
            return var2.a(var2.aL.skullsGear());
        }
        if (H.lIllIlIIlIlIIIl(var3.equals(lIIllllIlIIII[lIIllllIlIIIl[2]]) ? 1 : 0) && H.lIllIlIIlIlIIIl(var3.equals(lIIllllIlIIII[lIIllllIlIIIl[3]]) ? 1 : 0)) {
            return new int[lIIllllIlIIIl[0]];
        }
        String[] stringArray = new String[lIIllllIlIIIl[1]];
        stringArray[H.lIIllllIlIIIl[0]] = var3;
        NPC var4 = NPCs.getNearest((String[])stringArray);
        if (H.lIllIlIIlIlIIlI(var4)) {
            return new int[lIIllllIlIIIl[0]];
        }
        int var5 = var4.getId();
        if (!H.lIllIlIIlIlIIll(var5, lIIllllIlIIIl[4]) || H.lIllIlIIlIlIlII(var5, lIIllllIlIIIl[5])) {
            return var2.a(var2.aL.rangedP2Warden());
        }
        if (!H.lIllIlIIlIlIIll(var5, lIIllllIlIIIl[6]) || H.lIllIlIIlIlIlII(var5, lIIllllIlIIIl[7])) {
            return var2.a(var2.aL.mageP2Warden());
        }
        if (!H.lIllIlIIlIlIIll(var5, lIIllllIlIIIl[8]) || !H.lIllIlIIlIlIIll(var5, lIIllllIlIIIl[9]) || !H.lIllIlIIlIlIIll(var5, lIIllllIlIIIl[10]) || H.lIllIlIIlIlIlII(var5, lIIllllIlIIIl[11])) {
            return var2.a(var2.aL.finalWardenSpec(), var2.aL.finalWardenGear(), var2.aL.specFinalReq());
        }
        return new int[lIIllllIlIIIl[0]];
    }

    private static boolean lIllIlIIlIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIIlIlIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIlIIlIIlllI() {
        lIIllllIlIIII = new String[lIIllllIlIIIl[12]];
        H.lIIllllIlIIII[H.lIIllllIlIIIl[0]] = "Core";
        H.lIIllllIlIIII[H.lIIllllIlIIIl[1]] = "Energy Siphon";
        H.lIIllllIlIIII[H.lIIllllIlIIIl[2]] = "Tumeken's Warden";
        H.lIIllllIlIIII[H.lIIllllIlIIIl[3]] = "Elidinis' Warden";
    }

    @Inject
    public WardenGearSwappingTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static boolean lIllIlIIlIlIIII(int n2) {
        return n2 != 0;
    }
}

