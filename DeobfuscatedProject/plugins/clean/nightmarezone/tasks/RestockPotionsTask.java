/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.nightmarezone.tasks.BHelper;

@TaskDesc(name="Restock Potions", priority=200, blocking=true)
public class RestockPotionsTask
extends Task {
    private final  SquireNightmareZone aA;
    private final  Client aC;
    
    private final  SquireNightmareZoneConfig aB;

    private static boolean lIIllllIllIlllI(int n2) {
        return n2 == 0;
    }

    static {
        s.lIIllllIllIlIlI();
        s.lIIllllIllIIlll();
    }

    private static boolean lIIllllIllIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIllIllll(Object object) {
        return object == null;
    }

    public boolean run() {
        s var1;
        if (s.lIIllllIllIlIll(this.aC.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIIlII[0];
        }
        if (s.lIIllllIllIlIll(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIIlIIlIIlII[1];
        }
        int var2 = Static.getClient().getVarbitValue(b.s);
        int var3 = Static.getClient().getVarbitValue(b.t);
        if (s.lIIllllIllIllII(var2 + var1.aA.a(), var1.aB.overload()) && s.lIIllllIllIllII(var3 + var1.aA.b(), var1.aB.absorption())) {
            return lIIIlIIlIIlII[0];
        }
        Widget var4 = Widgets.get((int)lIIIlIIlIIlII[2], (int)lIIIlIIlIIlII[1], (int)lIIIlIIlIIlII[1]);
        if (!s.lIIllllIllIllIl(var4) || s.lIIllllIllIlllI(var4.isVisible() ? 1 : 0)) {
            String[] stringArray = new String[lIIIlIIlIIlII[1]];
            stringArray[s.lIIIlIIlIIlII[0]] = lIIIlIIlIIIIl[lIIIlIIlIIlII[0]];
            TileObject var5 = TileObjects.getNearest((String[])stringArray);
            if (s.lIIllllIllIllll(var5)) {
                return lIIIlIIlIIlII[0];
            }
            var5.interact(lIIIlIIlIIIIl[lIIIlIIlIIlII[1]]);
            return lIIIlIIlIIlII[1];
        }
        Widget var5 = Widgets.get((int)lIIIlIIlIIlII[2], (int)b.n, (int)b.p);
        if (s.lIIllllIlllIIII(var2, var1.aB.overload()) && s.lIIllllIllIllIl(var5)) {
            var5.interact(lIIIlIIlIIIIl[lIIIlIIlIIlII[3]]);
            return lIIIlIIlIIlII[1];
        }
        Widget var6 = Widgets.get((int)lIIIlIIlIIlII[2], (int)b.n, (int)b.q);
        if (s.lIIllllIlllIIII(var3, var1.aB.absorption()) && s.lIIllllIllIllIl(var6)) {
            var6.interact(lIIIlIIlIIIIl[lIIIlIIlIIlII[4]]);
            return lIIIlIIlIIlII[1];
        }
        return lIIIlIIlIIlII[0];
    }

    private static boolean lIIllllIllIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllllIllIllIl(Object object) {
        return object != null;
    }

    @Inject
    public RestockPotionsTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.aA = squireNightmareZone;
        this.aB = squireNightmareZoneConfig;
        this.aC = client;
    }

    private static boolean lIIllllIlllIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllllIllIIlll() {
        lIIIlIIlIIIIl = new String[lIIIlIIlIIlII[5]];
        s.lIIIlIIlIIIIl[s.lIIIlIIlIIlII[0]] = "Rewards chest";
        s.lIIIlIIlIIIIl[s.lIIIlIIlIIlII[1]] = "Search";
        s.lIIIlIIlIIIIl[s.lIIIlIIlIIlII[3]] = "Buy-10";
        s.lIIIlIIlIIIIl[s.lIIIlIIlIIlII[4]] = "Buy-10";
    }

        return String.valueOf(var7);
    }

}

