/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="PrayFlick", priority=0x7FFFFFFE)
public class PrayflickTask
extends Task {

    private final  SquireMoonsOfPerilConfig N;

    private static boolean lIIlIllIllIllII(int n) {
        return n >= 0;
    }

        return String.valueOf(var1);
    }

    @Inject
    public PrayflickTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.N = squireMoonsOfPerilConfig;
    }

    private static boolean lIIlIllIllIlIll(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2;
        void var3;
        double d2 = l.k();
        double d3 = this.N.eatAtHpPercent();
        String[] stringArray = new String[lIIIIIIIllIlI[0]];
        stringArray[f.lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[1]];
        if (f.lIIlIllIllIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIIIIIllIlI[0]];
            stringArray2[f.lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[0]];
            Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIllIII[lIIIIIIIllIlI[2]]);
            return lIIIIIIIllIlI[1];
        }
        if (f.lIIlIllIllIllII(f.lIIlIllIllIlIIl((double)var3, (double)var2))) {
            return lIIIIIIIllIlI[1];
        }
        String[] stringArray3 = new String[lIIIIIIIllIlI[0]];
        stringArray3[f.lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[3]];
        if (f.lIIlIllIllIlIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
            System.out.println(lIIIIIIIllIII[lIIIIIIIllIlI[4]]);
            SquireMoonsOfPeril.g = lIIIIIIIllIII[lIIIIIIIllIlI[5]];
            String[] stringArray4 = new String[lIIIIIIIllIlI[0]];
            stringArray4[f.lIIIIIIIllIlI[1]] = lIIIIIIIllIII[lIIIIIIIllIlI[6]];
            Inventory.getFirst((String[])stringArray4).interact(lIIIIIIIllIII[lIIIIIIIllIlI[7]]);
            return lIIIIIIIllIlI[0];
        }
        return lIIIIIIIllIlI[0];
    }

    private static int lIIlIllIllIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static void lIIlIllIllIIllI() {
        lIIIIIIIllIII = new String[lIIIIIIIllIlI[8]];
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[1]] = "Vial";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[0]] = "Vial";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[2]] = "Drop";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[3]] = "Cooked bream";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[4]] = "Eating";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[5]] = "Eating";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[6]] = "Cooked bream";
        f.lIIIIIIIllIII[f.lIIIIIIIllIlI[7]] = "Eat";
    }

    static {
        f.lIIlIllIllIlIII();
        f.lIIlIllIllIIllI();
    }

    private static boolean lIIlIllIlllIIIl(int n, int n2) {
        return n < n2;
    }

}

