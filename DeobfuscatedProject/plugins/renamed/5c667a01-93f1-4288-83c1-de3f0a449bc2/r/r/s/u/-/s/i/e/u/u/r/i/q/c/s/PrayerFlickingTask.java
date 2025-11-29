/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.widgets.Prayers
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.widgets.Prayers;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d_Unknown;

/* TASK: Prayer Flicking -> PrayerflickingTask */
@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class PrayerFlickingTask
extends Task {
    private final /* synthetic */ SquireScurrius ak;
    private static /* synthetic */ String[] lIIlIllIlIIlI;
    private static /* synthetic */ int[] lIIlIllIlIlIl;

    @Inject
    public w(SquireScurrius squireScurrius) {
        this.ak = squireScurrius;
    }

    private static boolean lIlIllIlIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIllIlIIlIIll() {
        lIIlIllIlIIlI = new String[lIIlIllIlIlIl[1]];
        w.lIIlIllIlIIlI[w.lIIlIllIlIlIl[0]] = w."Scurrius";
        w.lIIlIllIlIIlI[w.lIIlIllIlIlIl[2]] = w."Giant rat";
    }

    private static void lIlIllIlIIlIlll() {
        lIIlIllIlIlIl = new int[4];
        w.lIIlIllIlIlIl[0] = (88 + 16 - 42 + 82 ^ 60 + 28 - 12 + 52) & (0xAF ^ 0xB4 ^ (0xCC ^ 0xC7) ^ -1);
        w.lIIlIllIlIlIl[1] = 2;
        w.lIIlIllIlIlIl[2] = 1;
        w.lIIlIllIlIlIl[3] = 0x1D ^ 0x5E ^ (0x25 ^ 0x4B);
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void var13;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.addAll(Prayers.getOffensive());
        0;
        int[] nArray = new int[lIIlIllIlIlIl[1]];
        nArray[w.lIIlIllIlIlIl[0]] = d.C;
        nArray[w.lIIlIllIlIlIl[2]] = d.D;
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (w.lIlIllIlIIlllII(projectile) && w.lIlIllIlIIlllIl(projectile.getRemainingCycles(), lIIlIllIlIlIl[3])) {
            if (w.lIlIllIlIIllllI(projectile.getId(), d.C)) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                0;
                0;
                
                }
            } else {
                var13.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                0;
                if ((128 + 51 - 60 + 42 ^ 69 + 102 - 157 + 151) == -1) {
                    return null;
                }
            }
        } else {
            var13.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return arrayList;
    }

    private static boolean lIlIllIlIIlllII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIIllIll(int n2) {
        return n2 <= 0;
    }

    public boolean run() {
        if (w.lIlIllIlIIllIIl(this.ak.c() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIlIllIlIlIl[0];
        }
        String[] stringArray = new String[lIIlIllIlIlIl[1]];
        stringArray[w.lIIlIllIlIlIl[0]] = lIIlIllIlIIlI[lIIlIllIlIlIl[0]];
        stringArray[w.lIIlIllIlIlIl[2]] = lIIlIllIlIIlI[lIIlIllIlIlIl[2]];
        NPC var16 = NPCs.getNearest((String[])stringArray);
        if (w.lIlIllIlIIllIlI(var16)) {
            Prayers.disableAll();
            return lIIlIllIlIlIl[0];
        }
        if (w.lIlIllIlIIllIll(Prayers.getPoints())) {
            w var1;
            var1.ak.e(lIIlIllIlIlIl[2]);
            return lIIlIllIlIlIl[0];
        }
        Prayers.flick(this.x());
        0;
        return lIIlIllIlIlIl[0];
    }

    static {
        w.lIlIllIlIIlIlll();
        w.lIlIllIlIIlIIll();
    }

    private static boolean lIlIllIlIIllIlI(Object object) {
        return object == null;
    }

    private static String lIlIllIlIIlIIlI(String var17, String var2) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var7 = var2.toCharArray();
        int var4 = lIIlIllIlIlIl[0];
        char[] var8 = var17.toCharArray();
        int var14 = var8.length;
        int var15 = lIIlIllIlIlIl[0];
        while (w.lIlIllIlIIlllll(var15, var14)) {
            char var10 = var8[var15];
            var3.append((char)(var10 ^ var7[var4 % var7.length]));
            0;
            ++var4;
            ++var15;
            0;
            
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIlIllIlIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllIlIIlIIIl(String var11, String var5) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIIlIllIlIlIl[1], var9);
            return new String(var12.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlIIllllI(int n2, int n3) {
        return n2 == n3;
    }
}

