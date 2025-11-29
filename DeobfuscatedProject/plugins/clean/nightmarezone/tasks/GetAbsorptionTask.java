/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Get Absorption", priority=6, blocking=true)
public class GetAbsorptionTask
extends Task {
    
    private final  SquireNightmareZone ax;
    private final  Client az;
    
    private final  SquireNightmareZoneConfig ay;

    private static boolean lIIlllllIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllllIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllllIIIllIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        r var1;
        if (r.lIIlllllIIIlIll(this.az.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIlIllIl[0];
        }
        int var2 = var1.ax.a();
        if (r.lIIlllllIIIllII(var2, var1.ay.overload())) {
            return lIIIlIIlIllIl[0];
        }
        if (r.lIIlllllIIIlIll(Dialog.isEnterInputOpen() ? 1 : 0) && r.lIIlllllIIIlIll(Dialog.getText().contains(lIIIlIIlIllII[lIIIlIIlIllIl[0]]) ? 1 : 0)) {
            Dialog.enterAmount((int)(var1.ay.overload() - var2));
            return lIIIlIIlIllIl[1];
        }
        String[] stringArray = new String[lIIIlIIlIllIl[1]];
        stringArray[r.lIIIlIIlIllIl[0]] = lIIIlIIlIllII[lIIIlIIlIllIl[1]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (r.lIIlllllIIIllIl(var3)) {
            return lIIIlIIlIllIl[0];
        }
        var2_2.interact(lIIIlIIlIllII[lIIIlIIlIllIl[2]]);
        return lIIIlIIlIllIl[1];
    }

    private static void lIIlllllIIIlIIl() {
        lIIIlIIlIllII = new String[lIIIlIIlIllIl[3]];
        r.lIIIlIIlIllII[r.lIIIlIIlIllIl[0]] = "many doses of overload";
        r.lIIIlIIlIllII[r.lIIIlIIlIllIl[1]] = "Overload potion";
        r.lIIIlIIlIllII[r.lIIIlIIlIllIl[2]] = "Take";
    }

    @Inject
    public GetAbsorptionTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.ax = squireNightmareZone;
        this.ay = squireNightmareZoneConfig;
        this.az = client;
    }

        return String.valueOf(var4);
    }

    private static boolean lIIlllllIIIlIll(int n2) {
        return n2 != 0;
    }

    static {
        r.lIIlllllIIIlIlI();
        r.lIIlllllIIIlIIl();
    }
}

