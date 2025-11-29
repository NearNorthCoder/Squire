/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.DEnum;

/* TASK: Restoring prayer -> RestoringprayerTask */
@TaskDesc(name="Restoring prayer", priority=133337)
public class RestoringPrayerTask
extends Task {
    private static /* synthetic */ String[] llllIIIIIIl;
    private final /* synthetic */ SquireBarrows Q;
    private static /* synthetic */ int[] llllIIIIIlI;

    private static boolean lIllIIlIllllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.lIllIIlIlllIlI(this.Q.h() ? 1 : 0)) {
            return llllIIIIIlI[0];
        }
        if (m.lIllIIlIlllIll(Prayers.getPoints())) {
            return llllIIIIIlI[0];
        }
        Item var21 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIIIIIlI[2]];
            stringArray[m.llllIIIIIlI[0]] = llllIIIIIIl[llllIIIIIlI[2]];
            if (m.lIllIIlIlllllI(item.hasAction(stringArray) ? 1 : 0) && (!m.lIllIIlIlllIlI(item.getName().toLowerCase().contains(llllIIIIIIl[llllIIIIIlI[3]]) ? 1 : 0) || m.lIllIIlIlllllI(item.getName().toLowerCase().contains(llllIIIIIIl[llllIIIIIlI[4]]) ? 1 : 0))) {
                n2 = llllIIIIIlI[2];
                0;
                if (((0xEC ^ 0xC4) & ~(0x3D ^ 0x15)) > 2) {
                    return false;
                }
            } else {
                n2 = llllIIIIIlI[0];
            }
            return n2 != 0;
        });
        if (m.lIllIIlIllllII(var21)) {
            return llllIIIIIlI[0];
        }
        NPC var7 = NPCs.getNearest(d::a);
        if (!m.lIllIIlIllllIl(var7) || m.lIllIIlIlllllI(var7.isDead() ? 1 : 0)) {
            return llllIIIIIlI[0];
        }
        var1_1.interact(llllIIIIIIl[llllIIIIIlI[0]]);
        this.sleep(llllIIIIIlI[1]);
        return llllIIIIIlI[2];
    }

    private static String lIllIIlIllIlIl(String var3, String var17) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), llllIIIIIlI[5]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(llllIIIIIlI[3], var1);
            return new String(var18.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    static {
        m.lIllIIlIlllIIl();
        m.lIllIIlIllIlll();
    }

    private static void lIllIIlIlllIIl() {
        llllIIIIIlI = new int[6];
        m.llllIIIIIlI[0] = (0xD2 ^ 0xC4) & ~(0xA0 ^ 0xB6);
        m.llllIIIIIlI[1] = 102 + 4 - 33 + 60 ^ 105 + 116 - 184 + 92;
        m.llllIIIIIlI[2] = 1;
        m.llllIIIIIlI[3] = 2;
        m.llllIIIIIlI[4] = 3;
        m.llllIIIIIlI[5] = 0x9A ^ 0x92;
    }

    private static boolean lIllIIlIlllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIlIlllllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public m(SquireBarrows squireBarrows) {
        this.Q = squireBarrows;
    }

    private static String lIllIIlIllIIll(String var6, String var5) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var2 = var5.toCharArray();
        int var16 = llllIIIIIlI[0];
        char[] var8 = var6.toCharArray();
        int var4 = var8.length;
        int var12 = llllIIIIIlI[0];
        while (m.lIllIIlIllllll(var12, var4)) {
            char var9 = var8[var12];
            var13.append((char)(var9 ^ var2[var16 % var2.length]));
            0;
            ++var16;
            ++var12;
            0;
            if (((1 ^ (0x51 ^ 0x48)) & (0xEE ^ 0xBE ^ (6 ^ 0x4E) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static String lIllIIlIllIlII(String var15, String var19) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llllIIIIIlI[3], var20);
            return new String(var14.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIllllIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIllllII(Object object) {
        return object == null;
    }

    private static void lIllIIlIllIlll() {
        llllIIIIIIl = new String[llllIIIIIlI[1]];
        m.llllIIIIIIl[m.llllIIIIIlI[0]] = m."Drink";
        m.llllIIIIIIl[m.llllIIIIIlI[2]] = m."Drink";
        m.llllIIIIIIl[m.llllIIIIIlI[3]] = m."prayer";
        m.llllIIIIIIl[m.llllIIIIIlI[4]] = m."restore";
    }

    private static boolean lIllIIlIlllIlI(int n2) {
        return n2 == 0;
    }
}

