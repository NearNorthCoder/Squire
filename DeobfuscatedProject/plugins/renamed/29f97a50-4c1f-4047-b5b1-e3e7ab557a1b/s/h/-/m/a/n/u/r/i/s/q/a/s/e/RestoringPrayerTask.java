/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.widgets.Prayers
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Restoring Prayer -> RestoringprayerTask */
@TaskDesc(name="Restoring Prayer", priority=11, blocking=true)
public class RestoringPrayerTask
extends Task {
    private static final /* synthetic */ Logger W;
    private static /* synthetic */ String[] lIIlIlllIIIII;
    private static /* synthetic */ int[] lIIlIlllIllIl;

    static {
        l.lIlIllIlllIlIIl();
        l.lIlIllIlllIlIII();
        W = LoggerFactory.getLogger(l.class);
    }

    private static boolean lIlIllIlllIlIll(Object object) {
        return object == null;
    }

    private static String lIlIllIllIIIllI(String var16, String var9) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIlIlllIllIl[7], var12);
            return new String(var5.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (l.lIlIllIlllIlIlI(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            return lIIlIlllIllIl[0];
        }
        String[] stringArray = new String[lIIlIlllIllIl[3]];
        stringArray[l.lIIlIlllIllIl[0]] = lIIlIlllIIIII[lIIlIlllIllIl[0]];
        TileObject var14 = TileObjects.getFirstAt((WorldPoint)new WorldPoint(lIIlIlllIllIl[1], lIIlIlllIllIl[2], lIIlIlllIllIl[0]), (String[])stringArray);
        if (l.lIlIllIlllIlIll(var14)) {
            int[] nArray = new int[lIIlIlllIllIl[4]];
            nArray[l.lIIlIlllIllIl[0]] = lIIlIlllIllIl[5];
            nArray[l.lIIlIlllIllIl[3]] = lIIlIlllIllIl[6];
            nArray[l.lIIlIlllIllIl[7]] = lIIlIlllIllIl[8];
            var14 = TileObjects.getNearest((int[])nArray);
            if (l.lIlIllIlllIlIll(var14)) {
                return lIIlIlllIllIl[0];
            }
        }
        if (l.lIlIllIlllIllII(Prayers.isQuickPrayerEnabled() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean)lIIlIlllIllIl[0]);
            return lIIlIlllIllIl[3];
        }
        String[] stringArray2 = new String[lIIlIlllIllIl[7]];
        stringArray2[l.lIIlIlllIllIl[0]] = lIIlIlllIIIII[lIIlIlllIllIl[3]];
        stringArray2[l.lIIlIlllIllIl[3]] = lIIlIlllIIIII[lIIlIlllIllIl[7]];
        var1_1.interact(stringArray2);
        return lIIlIlllIllIl[3];
    }

    private static String lIlIllIllIIIlIl(String var19, String var11) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIIlIlllIllIl[9]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIlIlllIllIl[7], var3);
            return new String(var18.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIlllIlIII() {
        lIIlIlllIIIII = new String[lIIlIlllIllIl[4]];
        l.lIIlIlllIIIII[l.lIIlIlllIllIl[0]] = l."Altar";
        l.lIIlIlllIIIII[l.lIIlIlllIllIl[3]] = l."Pray-at";
        l.lIIlIlllIIIII[l.lIIlIlllIllIl[7]] = l."Drink";
    }

    private static String lIlIllIllIIIlII(String var4, String var20) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var2 = var20.toCharArray();
        int var10 = lIIlIlllIllIl[0];
        char[] var6 = var4.toCharArray();
        int var8 = var6.length;
        int var13 = lIIlIlllIllIl[0];
        while (l.lIlIllIlllIllIl(var13, var8)) {
            char var17 = var6[var13];
            var7.append((char)(var17 ^ var2[var10 % var2.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static void lIlIllIlllIlIIl() {
        lIIlIlllIllIl = new int[10];
        l.lIIlIlllIllIl[0] = (0x20 ^ 0x66) & ~(0x57 ^ 0x11);
        l.lIIlIlllIllIl[1] = 0xFFFFDA7C & 0x2FAF;
        l.lIIlIlllIllIl[2] = 0xFFFF8EDA & 0x7DAD;
        l.lIIlIlllIllIl[3] = 1;
        l.lIIlIlllIllIl[4] = 3;
        l.lIIlIlllIllIl[5] = 0xFFFFF7BF & 0x7A77;
        l.lIIlIlllIllIl[6] = -(0xFFFFF787 & 0x97F) & (0xFFFFFFBE & 0x737F);
        l.lIIlIlllIllIl[7] = 2;
        l.lIIlIlllIllIl[8] = -(0xFFFFA9E3 & 0x5F9D) & (0xFFFFFFBD & 0x7BFB);
        l.lIIlIlllIllIl[9] = 22 + 110 - 34 + 49 ^ 128 + 46 - 23 + 4;
    }
}

