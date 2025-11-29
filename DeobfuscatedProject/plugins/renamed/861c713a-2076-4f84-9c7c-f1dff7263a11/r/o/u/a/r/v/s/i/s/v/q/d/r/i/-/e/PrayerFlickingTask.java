/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.g_Unknown;

/* TASK: Prayer Flicking -> PrayerflickingTask */
@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class PrayerFlickingTask
extends Task {
    private static /* synthetic */ String[] lIlIlIIIIlllI;
    private static /* synthetic */ int[] lIlIlIIIIllll;

    public boolean run() {
        int[] nArray = new int[lIlIlIIIIllll[0]];
        nArray[C.lIlIlIIIIllll[1]] = g.T;
        nArray[C.lIlIlIIIIllll[2]] = g.U;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        String[] stringArray = new String[lIlIlIIIIllll[2]];
        stringArray[C.lIlIlIIIIllll[1]] = lIlIlIIIIlllI[lIlIlIIIIllll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (!C.lIllllIlIIllIlI(nPC) || !C.lIllllIlIIllIlI(nPC.getInteracting()) || C.lIllllIlIIllIll(tileObject)) {
            Prayers.disableAll();
            return lIlIlIIIIllll[1];
        }
        if (C.lIllllIlIIlllII(Prayers.getPoints())) {
            return lIlIlIIIIllll[1];
        }
        Prayers.flick(this.W());
        0;
        return lIlIlIIIIllll[1];
    }

    private static boolean lIllllIlIIllIll(Object object) {
        return object == null;
    }

    private static boolean lIllllIlIIllIlI(Object object) {
        return object != null;
    }

    private static boolean lIllllIlIIlllII(int n2) {
        return n2 <= 0;
    }

    private static void lIllllIlIIllIIl() {
        lIlIlIIIIllll = new int[7];
        C.lIlIlIIIIllll[0] = 2;
        C.lIlIlIIIIllll[1] = 1 & ~1;
        C.lIlIlIIIIllll[2] = 1;
        C.lIlIlIIIIllll[3] = -(0xFFFFF5FB & 0x4A3F) & (0xFFFFEFFF & 0x5F7F);
        C.lIlIlIIIIllll[4] = 0x59 ^ 0xC ^ (0xDB ^ 0x86);
        C.lIlIlIIIIllll[5] = 3;
        C.lIlIlIIIIllll[6] = 0xA6 ^ 0x9A;
    }

    static {
        C.lIllllIlIIllIIl();
        C.lIllllIlIIllIII();
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> W() {
        void var4;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if (C.lIllllIlIIlllIl(Static.getClient().getVarbitValue(lIlIlIIIIllll[3]), lIlIlIIIIllll[4])) {
            Prayer[] prayerArray = new Prayer[lIlIlIIIIllll[5]];
            prayerArray[C.lIlIlIIIIllll[1]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[C.lIlIlIIIIllll[2]] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[C.lIlIlIIIIllll[0]] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);
            0;
            0;
            if (3 <= 1) {
                return null;
            }
        } else {
            var4.add(Prayer.PIETY);
            0;
        }
        int[] nArray = new int[lIlIlIIIIllll[2]];
        nArray[C.lIlIlIIIIllll[1]] = g.S;
        Projectile var1 = Projectiles.getNearest((int[])nArray);
        if (C.lIllllIlIIllIlI(var1) && C.lIllllIlIIllllI(var1.getRemainingCycles(), lIlIlIIIIllll[6]) && C.lIllllIlIIlllll(var1.getRemainingCycles())) {
            var4.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            0;
            if (3 == 0) {
                return null;
            }
        } else {
            var4.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return arrayList;
    }

    private static boolean lIllllIlIIlllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllllIlIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllllIlIIlIlll(String var3, String var2) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIlIIIIllll[0], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void lIllllIlIIllIII() {
        lIlIlIIIIlllI = new String[lIlIlIIIIllll[2]];
        C.lIlIlIIIIlllI[C.lIlIlIIIIllll[1]] = C."Vardorvis";
    }

    private static boolean lIllllIlIIlllIl(int n2, int n3) {
        return n2 != n3;
    }
}

