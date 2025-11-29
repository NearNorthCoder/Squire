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

@TaskDesc(name="Restoring Prayer", priority=11, blocking=true)
public class l
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

    private static String lIlIllIllIIIllI(String llllllllllllllIllllIlIIIIlIlllll, String llllllllllllllIllllIlIIIIlIlllII) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIIllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIIIllIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIIIllIIIIl.init(lIIlIlllIllIl[7], llllllllllllllIllllIlIIIIllIIIlI);
            return new String(llllllllllllllIllllIlIIIIllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIIIllIIIII) {
            llllllllllllllIllllIlIIIIllIIIII.printStackTrace();
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
        TileObject llllllllllllllIllllIlIIIIlllllll = TileObjects.getFirstAt((WorldPoint)new WorldPoint(lIIlIlllIllIl[1], lIIlIlllIllIl[2], lIIlIlllIllIl[0]), (String[])stringArray);
        if (l.lIlIllIlllIlIll(llllllllllllllIllllIlIIIIlllllll)) {
            int[] nArray = new int[lIIlIlllIllIl[4]];
            nArray[l.lIIlIlllIllIl[0]] = lIIlIlllIllIl[5];
            nArray[l.lIIlIlllIllIl[3]] = lIIlIlllIllIl[6];
            nArray[l.lIIlIlllIllIl[7]] = lIIlIlllIllIl[8];
            llllllllllllllIllllIlIIIIlllllll = TileObjects.getNearest((int[])nArray);
            if (l.lIlIllIlllIlIll(llllllllllllllIllllIlIIIIlllllll)) {
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

    private static String lIlIllIllIIIlIl(String llllllllllllllIllllIlIIIIlIlIIII, String llllllllllllllIllllIlIIIIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIlllIllIl[9]), "DES");
            Cipher llllllllllllllIllllIlIIIIlIlIlII = Cipher.getInstance("DES");
            llllllllllllllIllllIlIIIIlIlIlII.init(lIIlIlllIllIl[7], llllllllllllllIllllIlIIIIlIlIlIl);
            return new String(llllllllllllllIllllIlIIIIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIIIlIlIIll) {
            llllllllllllllIllllIlIIIIlIlIIll.printStackTrace();
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

    private static String lIlIllIllIIIlII(String llllllllllllllIllllIlIIIIlllIlII, String llllllllllllllIllllIlIIIIllIlllI) {
        llllllllllllllIllllIlIIIIlllIlII = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIIIlllIIlI = new StringBuilder();
        char[] llllllllllllllIllllIlIIIIlllIIIl = llllllllllllllIllllIlIIIIllIlllI.toCharArray();
        int llllllllllllllIllllIlIIIIlllIIII = lIIlIlllIllIl[0];
        char[] llllllllllllllIllllIlIIIIllIlIlI = llllllllllllllIllllIlIIIIlllIlII.toCharArray();
        int llllllllllllllIllllIlIIIIllIlIIl = llllllllllllllIllllIlIIIIllIlIlI.length;
        int llllllllllllllIllllIlIIIIllIlIII = lIIlIlllIllIl[0];
        while (l.lIlIllIlllIllIl(llllllllllllllIllllIlIIIIllIlIII, llllllllllllllIllllIlIIIIllIlIIl)) {
            char llllllllllllllIllllIlIIIIlllIlIl = llllllllllllllIllllIlIIIIllIlIlI[llllllllllllllIllllIlIIIIllIlIII];
            llllllllllllllIllllIlIIIIlllIIlI.append((char)(llllllllllllllIllllIlIIIIlllIlIl ^ llllllllllllllIllllIlIIIIlllIIIl[llllllllllllllIllllIlIIIIlllIIII % llllllllllllllIllllIlIIIIlllIIIl.length]));
            0;
            ++llllllllllllllIllllIlIIIIlllIIII;
            ++llllllllllllllIllllIlIIIIllIlIII;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIIIIlllIIlI);
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

