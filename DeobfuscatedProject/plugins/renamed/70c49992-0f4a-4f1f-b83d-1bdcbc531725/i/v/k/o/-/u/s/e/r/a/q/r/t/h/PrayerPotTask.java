/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;

/* TASK: Prayer pot -> DrinkPrayerPotionTask */
@TaskDesc(name="Prayer pot", priority=110)
public class PrayerPotTask
extends w_Unknown {
    private static /* synthetic */ int[] lIlIllIIIIIll;
    private static /* synthetic */ String[] lIlIllIIIIIlI;

    static {
        H.llIIIIIIIIIlIII();
        H.llIIIIIIIIIIlll();
    }

    private static boolean llIIIIIIIIIlIlI(Object object) {
        return object != null;
    }

    private static boolean llIIIIIIIIIllII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected H(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static void llIIIIIIIIIlIII() {
        lIlIllIIIIIll = new int[7];
        H.lIlIllIIIIIll[0] = 0x73 ^ 0x67;
        H.lIlIllIIIIIll[1] = (0xAB ^ 0x9E ^ (0x63 ^ 0x48)) & (22 + 86 - -8 + 48 ^ 12 + 134 - -28 + 12 ^ -1);
        H.lIlIllIIIIIll[2] = 1;
        H.lIlIllIIIIIll[3] = 0xFFFFB7DD & 0x4DEB;
        H.lIlIllIIIIIll[4] = 2;
        H.lIlIllIIIIIll[5] = 3;
        H.lIlIllIIIIIll[6] = 0x1D ^ 0x15;
    }

    private static boolean llIIIIIIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        if (H.llIIIIIIIIIlIIl(this.cf.getBoostedSkillLevel(Skill.PRAYER), lIlIllIIIIIll[0])) {
            return lIlIllIIIIIll[1];
        }
        int[] nArray = new int[lIlIllIIIIIll[2]];
        nArray[H.lIlIllIIIIIll[1]] = lIlIllIIIIIll[3];
        if (H.llIIIIIIIIIlIlI(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIIIIll[1];
        }
        Item var4 = Inventory.getFirst(item -> {
            int n2;
            if (!H.llIIIIIIIIIllII(item.getName().toLowerCase().contains(lIlIllIIIIIlI[lIlIllIIIIIll[2]]) ? 1 : 0) || H.llIIIIIIIIIllIl(item.getName().toLowerCase().contains(lIlIllIIIIIlI[lIlIllIIIIIll[4]]) ? 1 : 0)) {
                n2 = lIlIllIIIIIll[2];
                0;
                
                }
            } else {
                n2 = lIlIllIIIIIll[1];
            }
            return n2 != 0;
        });
        if (H.llIIIIIIIIIlIll(var4)) {
            return lIlIllIIIIIll[1];
        }
        var1_1.interact(lIlIllIIIIIlI[lIlIllIIIIIll[1]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIIIIll[2];
    }

    private static boolean llIIIIIIIIIllIl(int n2) {
        return n2 != 0;
    }

    private static void llIIIIIIIIIIlll() {
        lIlIllIIIIIlI = new String[lIlIllIIIIIll[5]];
        H.lIlIllIIIIIlI[H.lIlIllIIIIIll[1]] = H."Drink";
        H.lIlIllIIIIIlI[H.lIlIllIIIIIll[2]] = H."restore";
        H.lIlIllIIIIIlI[H.lIlIllIIIIIll[4]] = H."prayer";
    }

    private static String llIIIIIIIIIIllI(String var5, String var10) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIllIIIIIll[4], var2);
            return new String(var1.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIIIIIIlIl(String var11, String var9) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIlIllIIIIIll[6]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIlIllIIIIIll[4], var7);
            return new String(var6.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIIIlIll(Object object) {
        return object == null;
    }
}

