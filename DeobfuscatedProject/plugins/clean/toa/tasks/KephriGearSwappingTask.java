/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
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

@TaskDesc(name="Kephri Gear Swapping", register=true)
public class KephriGearSwappingTask
extends ToaTaskBase {

        return String.valueOf(var1);
    }

    private static boolean lIllIlIllIlIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIllIlIlII() {
        lIIllllllllll = new String[lIlIIIIIIIIII[5]];
        O.lIIllllllllll[O.lIlIIIIIIIIII[1]] = "Soldier Scarab";
        O.lIIllllllllll[O.lIlIIIIIIIIII[2]] = "Kephri";
        O.lIIllllllllll[O.lIlIIIIIIIIII[3]] = "Arcane Scarab";
        O.lIIllllllllll[O.lIlIIIIIIIIII[4]] = "Scarab Swarm";
    }

    @Inject
    public KephriGearSwappingTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static boolean lIllIlIllIlIlll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        int var2;
        String string2 = string;
        int n2 = lIlIIIIIIIIII[0];
        switch (string2.hashCode()) {
            case 829390592: {
                void var3;
                if (!O.lIllIlIllIlIllI(var3.equals(lIIllllllllll[lIlIIIIIIIIII[1]]) ? 1 : 0)) break;
                var2 = lIlIIIIIIIIII[1];

                if (3 > 0) break;
                return null;
            }
            case -2051065175: {
                void var3;
                if (!O.lIllIlIllIlIllI(var3.equals(lIIllllllllll[lIlIIIIIIIIII[2]]) ? 1 : 0)) break;
                var2 = lIlIIIIIIIIII[2];

                if (-1 <= 0) break;
                return null;
            }
            case 32389500: {
                void var3;
                if (!O.lIllIlIllIlIllI(var3.equals(lIIllllllllll[lIlIIIIIIIIII[3]]) ? 1 : 0)) break;
                var2 = lIlIIIIIIIIII[3];

                if (3 >= 1) break;
                return null;
            }
            case -2127561158: {
                void var3;
                if (!O.lIllIlIllIlIllI(var3.equals(lIIllllllllll[lIlIIIIIIIIII[4]]) ? 1 : 0)) break;
                var2 = lIlIIIIIIIIII[4];
            }
        }
        switch (var2) {
            case 0: {
                O var4;
                return var4.a(var4.aL.kephriGearSwap());
            }
            case 1: {
                O var4;
                return var4.a(var4.aL.kephriSpecialGear(), var4.aL.kephriGearSwap(), var4.aL.kephriSpecialReq());
            }
            case 2: {
                O var4;
                return var4.a(var4.aL.kephriMager());
            }
            case 3: {
                O var4;
                return var4.a(var4.aL.kephriSwarm());
            }
        }
        return new int[lIlIIIIIIIIII[1]];
    }

    static {
        O.lIllIlIllIlIlIl();
        O.lIllIlIllIlIlII();
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!O.lIllIlIllIlIlll(this.aL.kephriGearSwap().isSelected() ? 1 : 0) || !O.lIllIlIllIlIlll(this.aL.kephriMager().isSelected() ? 1 : 0) || O.lIllIlIllIlIllI(this.aL.kephriSwarm().isSelected() ? 1 : 0)) {
            bl = lIlIIIIIIIIII[2];

            if (1 == ((0x86 ^ 0xB6) & ~(0x46 ^ 0x76))) {
                return false;
            }
        } else {
            bl = lIlIIIIIIIIII[1];
        }
        return bl;
    }
}

