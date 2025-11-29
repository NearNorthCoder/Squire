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

@TaskDesc(name="Gear Swapping Zebak", register=true)
public class GearSwappingZebakTask
extends ToaTaskBase {

    private static boolean lIllIlIlIIllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIlIIlIllI() {
        lIIlllllIlIll = new String[lIIlllllIllII[4]];
        Q.lIIlllllIlIll[Q.lIIlllllIllII[0]] = "Zebak";
        Q.lIIlllllIlIll[Q.lIIlllllIllII[2]] = "Jug";
        Q.lIIlllllIlIll[Q.lIIlllllIllII[1]] = "Wave";
        Q.lIIlllllIlIll[Q.lIIlllllIllII[3]] = "Crocodile";
    }

    static {
        Q.lIllIlIlIIlIlll();
        Q.lIllIlIlIIlIllI();
    }

    @Inject
    public GearSwappingZebakTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static boolean lIllIlIlIIllIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!Q.lIllIlIlIIllIlI(this.aL.gearSwapZebak().isSelected() ? 1 : 0) || Q.lIllIlIlIIllIII(this.aL.gearSwapCrocodile().isSelected() ? 1 : 0)) {
            bl = lIIlllllIllII[2];

            if (((0x35 ^ 0x1F ^ (0x32 ^ 0x37)) & (99 + 44 - 65 + 49 ^ (2 ^ 0x52) ^ -1)) > 0) {
                return ((156 + 155 - 309 + 237 ^ 122 + 154 - 142 + 59) & (0x4B ^ 0x23 ^ (0x6D ^ 0x2B) ^ -1)) != 0;
            }
        } else {
            bl = lIIlllllIllII[0];
        }
        return bl;
    }

    private static boolean lIllIlIlIIllIIl(Object object) {
        return object != null;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        void var2;
        Q var3;
        if (Q.lIllIlIlIIllIII(string.equals(lIIlllllIlIll[lIIlllllIllII[0]]) ? 1 : 0)) {
            String[] stringArray = new String[lIIlllllIllII[1]];
            stringArray[Q.lIIlllllIllII[0]] = lIIlllllIlIll[lIIlllllIllII[2]];
            stringArray[Q.lIIlllllIllII[2]] = lIIlllllIlIll[lIIlllllIllII[1]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (Q.lIllIlIlIIllIIl(nPC)) {
                return this.a(this.aL.gearSwapZebak());
            }
            return var3.a(var3.aL.specGearZebak(), var3.aL.gearSwapZebak(), var3.aL.specGearZebakReq());
        }
        if (Q.lIllIlIlIIllIII(var2.equals(lIIlllllIlIll[lIIlllllIllII[3]]) ? 1 : 0)) {
            return var3.a(var3.aL.gearSwapCrocodile());
        }
        return new int[lIIlllllIllII[0]];
    }
}

