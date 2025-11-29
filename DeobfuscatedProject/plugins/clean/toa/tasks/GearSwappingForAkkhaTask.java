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

@TaskDesc(name="Gear swapping for Akkha", register=true)
public class GearSwappingForAkkhaTask
extends ToaTaskBase {

    private  int aW;

    private static boolean lIllIlIIllIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIllIlIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean GearSwappingForAkkhaTask() {
        int n2;
        if (!(C.lIllIlIIllIllII(this.aL.mageGearAkkha().isSelected() ? 1 : 0) && C.lIllIlIIllIllII(this.aL.meleeGearAkkha().isSelected() ? 1 : 0) && C.lIllIlIIllIllII(this.aL.rangeGearAkkha().isSelected() ? 1 : 0) && C.lIllIlIIllIllII(this.aL.akkhaFinalSpec().isSelected() ? 1 : 0) && !C.lIllIlIIllIlIlI(this.aL.akkhaFinalNormal().isSelected() ? 1 : 0))) {
            n2 = lIIllllIlllII[2];

            if (-1 != -1) {
                return ((146 + 63 - 67 + 21 ^ 31 + 139 - 166 + 177) & (0x62 ^ 0x59 ^ (0xA5 ^ 0x88) ^ -1)) != 0;
            }
        } else {
            n2 = lIIllllIlllII[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        C var1;
        void var2;
        if (C.lIllIlIIllIlIlI(string.equals(lIIllllIllIll[lIIllllIlllII[1]]) ? 1 : 0)) {
            return this.a(this.aL.shadowAttackStyle());
        }
        if (!C.lIllIlIIllIlIlI(var2.equals(lIIllllIllIll[lIIllllIlllII[2]]) ? 1 : 0) || C.lIllIlIIllIlIll(var1.aW, lIIllllIlllII[0])) {
            return new int[lIIllllIlllII[1]];
        }
        if (C.lIllIlIIllIlIll(var1.aW, lIIllllIlllII[3])) {
            return var1.a(var1.aL.mageGearAkkha());
        }
        if (C.lIllIlIIllIlIll(var1.aW, lIIllllIlllII[4])) {
            return var1.a(var1.aL.meleeGearAkkha());
        }
        if (C.lIllIlIIllIlIll(var1.aW, lIIllllIlllII[5])) {
            return var1.a(var1.aL.rangeGearAkkha());
        }
        if (C.lIllIlIIllIlIll(var1.aW, lIIllllIlllII[6])) {
            return var1.a(var1.aL.akkhaFinalSpec(), var1.aL.akkhaFinalNormal(), var1.aL.specGearAkkhaFinalReq());
        }
        return new int[lIIllllIlllII[1]];
    }

    private static boolean lIllIlIIllIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean run() {
        String[] stringArray = new String[lIIllllIlllII[2]];
        stringArray[C.lIIllllIlllII[1]] = lIIllllIllIll[lIIllllIlllII[7]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (C.lIllIlIIllIllIl(nPC)) {
            return lIIllllIlllII[1];
        }
        this.aW = nPC.getId();
        return lIIllllIlllII[1];
    }

    @Inject
    public GearSwappingForAkkhaTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
        this.aW = lIIllllIlllII[0];
    }

        return String.valueOf(var3);
    }

    private static void lIllIlIIllIlIII() {
        lIIllllIllIll = new String[lIIllllIlllII[8]];
        C.lIIllllIllIll[C.lIIllllIlllII[1]] = "Akkha's Shadow";
        C.lIIllllIllIll[C.lIIllllIlllII[2]] = "Akkha";
        C.lIIllllIllIll[C.lIIllllIlllII[7]] = "Akkha";
    }

    private static boolean lIllIlIIllIllII(int n2) {
        return n2 == 0;
    }

    static {
        C.lIllIlIIllIlIIl();
        C.lIllIlIIllIlIII();
    }

    private static boolean lIllIlIIllIllIl(Object object) {
        return object == null;
    }
}

