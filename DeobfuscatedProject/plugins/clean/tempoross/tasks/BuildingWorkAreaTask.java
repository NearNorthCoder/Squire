/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;

@TaskDesc(name="Building work area", priority=0x7FFFFFFF, blocking=true)
public class BuildingWorkAreaTask
extends Task {

    private final  a ae;
    private final  Client af;

    private static boolean lIllIIlIIlIIllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public BuildingWorkAreaTask(a a2, Client client) {
        this.ae = a2;
        this.af = client;
    }

    static {
        d.lIllIIlIIlIIlII();
        d.lIllIIlIIlIIIll();
    }

    private static boolean lIllIIlIIlIlIII(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_2;
        void var2_1;
        boolean bl;
        d var1;
        if (d.lIllIIlIIlIIlIl(this.af.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllIIIlIII[0];
        }
        if (d.lIllIIlIIlIIllI(var1.ae.M() ? 1 : 0)) {
            return lIIlllIIIlIII[0];
        }
        if (d.lIllIIlIIlIIlll(var1.ae.N())) {
            return lIIlllIIIlIII[0];
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[lIIlllIIIlIII[1]];
            stringArray[d.lIIlllIIIlIII[0]] = lIIlllIIIIlll[lIIlllIIIlIII[2]];
            return nPC.hasAction(stringArray);
        });
        String[] stringArray = new String[lIIlllIIIlIII[1]];
        stringArray[d.lIIlllIIIlIII[0]] = lIIlllIIIIlll[lIIlllIIIlIII[0]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (!d.lIllIIlIIlIIlll(var2) || d.lIllIIlIIlIlIII(var3)) {
            return lIIlllIIIlIII[0];
        }
        if (d.lIllIIlIIlIlIIl(var2.getWorldLocation().getX(), var3.getWorldLocation().getX())) {
            bl = lIIlllIIIlIII[1];

            if (1 >= 3) {
                return false;
            }
        } else {
            bl = lIIlllIIIlIII[0];
        }
        boolean bl2 = bl;
        c c2 = new TemporossManager(var2_1.getWorldLocation(), var3_2.getWorldLocation(), bl2);
        this.ae.a(c2);
        System.out.println(lIIlllIIIIlll[lIIlllIIIlIII[1]]);
        return lIIlllIIIlIII[1];
    }

    private static void lIllIIlIIlIIIll() {
        lIIlllIIIIlll = new String[lIIlllIIIlIII[3]];
        d.lIIlllIIIIlll[d.lIIlllIIIlIII[0]] = "Harpoonfish cannon";
        d.lIIlllIIIIlll[d.lIIlllIIIlIII[1]] = "Successfully set work area";
        d.lIIlllIIIIlll[d.lIIlllIIIlIII[2]] = "Forfeit";
    }
}

