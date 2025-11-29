/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.widgets.Prayers
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bO;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Restoring from pool", priority=10, blocking=true)
public class bN
extends Task {
    private static /* synthetic */ int[] lllIIIIII;
    private static /* synthetic */ String[] llIllllll;
    private final /* synthetic */ SecondariesConfig gL;

    private static boolean llIIIIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIllII(Object object) {
        return object == null;
    }

    private static boolean llIIIIIlIlI(int n2) {
        return n2 != 0;
    }

    static {
        bN.llIIIIIlIII();
        bN.llIIIIIIlll();
    }

    private static void llIIIIIlIII() {
        lllIIIIII = new int[4];
        bN.lllIIIIII[0] = (0x12 ^ 0x30 ^ (0x2C ^ 3)) & (0x35 ^ 4 ^ (0x70 ^ 0x4C) ^ -1);
        bN.lllIIIIII[1] = 1;
        bN.lllIIIIII[2] = 2;
        bN.lllIIIIII[3] = 3;
    }

    private static void llIIIIIIlll() {
        llIllllll = new String[lllIIIIII[3]];
        bN.llIllllll[bN.lllIIIIII[0]] = bN."Drink";
        bN.llIllllll[bN.lllIIIIII[1]] = bN."pool";
        bN.llIllllll[bN.lllIIIIII[2]] = bN."Drink";
    }

    private static String llIIIIIIllI(String lIlIllIlIlIlIll, String lIlIllIlIlIllII) {
        try {
            SecretKeySpec lIlIllIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIlIlIllll = Cipher.getInstance("Blowfish");
            lIlIllIlIlIllll.init(lllIIIIII[2], lIlIllIlIllIIII);
            return new String(lIlIllIlIlIllll.doFinal(Base64.getDecoder().decode(lIlIllIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIlIlIlllI) {
            lIlIllIlIlIlllI.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        bN lIlIllIlIlllIII;
        if (bN.llIIIIIlIIl((Object)this.gL.secondary(), (Object)bO.SWAMP_TOAD)) {
            return lllIIIIII[0];
        }
        if (bN.llIIIIIlIlI(Prayers.getPoints())) {
            return lllIIIIII[0];
        }
        if (bN.llIIIIIlIll(lIlIllIlIlllIII.gL.restoreInPoh() ? 1 : 0)) {
            TileObject lIlIllIlIllIlll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bN.llIIIIIlIlI(tileObject.getName().toLowerCase().contains(llIllllll[lllIIIIII[1]]) ? 1 : 0)) {
                    String[] stringArray = new String[lllIIIIII[1]];
                    stringArray[bN.lllIIIIII[0]] = llIllllll[lllIIIIII[2]];
                    if (bN.llIIIIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllIIIIII[1];
                        0;
                        if (1 != 0) return n2 != 0;
                        return ((6 ^ 0x52) & ~(0x39 ^ 0x6D)) != 0;
                    }
                }
                n2 = lllIIIIII[0];
                return n2 != 0;
            });
            if (bN.llIIIIIllII(lIlIllIlIllIlll)) {
                return lllIIIIII[0];
            }
            lIlIllIlIllIlll.interact(llIllllll[lllIIIIII[0]]);
            return lllIIIIII[1];
        }
        if (bN.llIIIIIlIll(House.isInside() ? 1 : 0)) {
            return lllIIIIII[0];
        }
        return House.drinkFromPool();
    }

    @Inject
    public bN(SecondariesConfig secondariesConfig) {
        this.gL = secondariesConfig;
    }

    private static String llIIIIIIlIl(String lIlIllIlIIlllIl, String lIlIllIlIIlllII) {
        lIlIllIlIIlllIl = new String(Base64.getDecoder().decode(lIlIllIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIlIIllIll = new StringBuilder();
        char[] lIlIllIlIIllIlI = lIlIllIlIIlllII.toCharArray();
        int lIlIllIlIIllIIl = lllIIIIII[0];
        char[] lIlIllIlIIlIIll = lIlIllIlIIlllIl.toCharArray();
        int lIlIllIlIIlIIlI = lIlIllIlIIlIIll.length;
        int lIlIllIlIIlIIIl = lllIIIIII[0];
        while (bN.llIIIIIllIl(lIlIllIlIIlIIIl, lIlIllIlIIlIIlI)) {
            char lIlIllIlIIllllI = lIlIllIlIIlIIll[lIlIllIlIIlIIIl];
            lIlIllIlIIllIll.append((char)(lIlIllIlIIllllI ^ lIlIllIlIIllIlI[lIlIllIlIIllIIl % lIlIllIlIIllIlI.length]));
            0;
            ++lIlIllIlIIllIIl;
            ++lIlIllIlIIlIIIl;
            0;
            if (-(109 + 126 - 87 + 14 ^ 158 + 11 - 79 + 77) < 0) continue;
            return null;
        }
        return String.valueOf(lIlIllIlIIllIll);
    }

    private static boolean llIIIIIlIIl(Object object, Object object2) {
        return object == object2;
    }
}

