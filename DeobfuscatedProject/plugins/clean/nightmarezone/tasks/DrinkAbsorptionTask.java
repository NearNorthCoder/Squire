/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Drink Absorption", priority=19, blocking=true)
public class DrinkAbsorptionTask
extends Task {
    
    private  int J;
    private final  SquireNightmareZoneConfig G;
    
    private  int I;
    private  boolean K;
    private final  SquireNightmareZone F;
    private final  Client H;

    private static boolean lIIllllIlIIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        e.lIIllllIIllllll();
        e.lIIllllIIlllIIl();
    }

    @Inject
    public DrinkAbsorptionTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.I = lIIIlIIIlIlII[0];
        this.J = lIIIlIIIlIlII[1];
        this.K = lIIIlIIIlIlII[2];
        this.F = squireNightmareZone;
        this.G = squireNightmareZoneConfig;
        this.H = client;
    }

        return String.valueOf(var1);
    }

    private static void lIIllllIIlllIIl() {
        lIIIlIIIlIIIl = new String[lIIIlIIIlIlII[7]];
        e.lIIIlIIIlIIIl[e.lIIIlIIIlIlII[2]] = "Absorption potion is null D:";
        e.lIIIlIIIlIIIl[e.lIIIlIIIlIlII[5]] = "Drink";
        e.lIIIlIIIlIIIl[e.lIIIlIIIlIlII[6]] = "Absorption (";
    }

    private static boolean lIIllllIlIIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        e var2;
        if (e.lIIllllIlIIIIII(this.G.absorption())) {
            return lIIIlIIIlIlII[2];
        }
        if (e.lIIllllIlIIIIII(var2.H.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIlII[2];
        }
        int var3 = Static.getClient().getVarbitValue(lIIIlIIIlIlII[3]);
        if (e.lIIllllIlIIIIIl(var2.G.overload()) && e.lIIllllIlIIIIII(var3)) {
            return lIIIlIIIlIlII[2];
        }
        int var4 = Static.getClient().getVarbitValue(lIIIlIIIlIlII[4]);
        if (e.lIIllllIlIIIIlI(var2.J, var4)) {
            var2.K = lIIIlIIIlIlII[5];
        }
        if (e.lIIllllIlIIIIll(var2.I, var4)) {
            var2.K = lIIIlIIIlIlII[2];
        }
        if (e.lIIllllIlIIIIII(var2.K ? 1 : 0)) {
            return lIIIlIIIlIlII[2];
        }
        Item var5 = Inventory.getFirst(item -> item.getName().startsWith(lIIIlIIIlIIIl[lIIIlIIIlIlII[6]]));
        if (e.lIIllllIlIIIlII(var5)) {
            System.out.println(lIIIlIIIlIIIl[lIIIlIIIlIlII[2]]);
            return lIIIlIIIlIlII[2];
        }
        var3_3.interact(lIIIlIIIlIIIl[lIIIlIIIlIlII[5]]);
        return lIIIlIIIlIlII[5];
    }

    private static boolean lIIllllIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllllIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllIlIIIlII(Object object) {
        return object == null;
    }
}

