/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.rangingguild.SquireRangingGuild;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

/* TASK: Shooting Target -> ShootingtargetTask */
@TaskDesc(name="Shooting Target")
public class ShootingTargetTask
extends Task {
    private static /* synthetic */ int[] lIIIIlll;
    private static /* synthetic */ String[] lIIIIllI;
    private final /* synthetic */ SquireRangingGuild ga;

    private static void lIIIIIIlll() {
        lIIIIlll = new int[5];
        bx.lIIIIlll[0] = 3 & (3 ^ -1);
        bx.lIIIIlll[1] = 1;
        bx.lIIIIlll[2] = -(0xFFFFFED9 & 0x19AF) & (0xFFFFDFFE & 0x3BFB);
        bx.lIIIIlll[3] = 0xFFFFEDFF & 0x3F8F;
        bx.lIIIIlll[4] = 2;
    }

    private static void lIIIIIIllI() {
        lIIIIllI = new String[lIIIIlll[4]];
        bx.lIIIIllI[bx.lIIIIlll[0]] = bx."Wield";
        bx.lIIIIllI[bx.lIIIIlll[1]] = bx."Fire-at";
    }

    private static String lIIIIIIlIl(String lllIIIlllllIlIl, String lllIIIlllllIlII) {
        try {
            SecretKeySpec lllIIIllllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIlllllIlll = Cipher.getInstance("Blowfish");
            lllIIIlllllIlll.init(lIIIIlll[4], lllIIIllllllIII);
            return new String(lllIIIlllllIlll.doFinal(Base64.getDecoder().decode(lllIIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIIlllllIllI) {
            lllIIIlllllIllI.printStackTrace();
            return null;
        }
    }

    static {
        bx.lIIIIIIlll();
        bx.lIIIIIIllI();
    }

    private static boolean lIIIIIlIII(int n2) {
        return n2 != 0;
    }

    private static String lIIIIIIlII(String lllIIlIIIIIIlIl, String lllIIlIIIIIlIIl) {
        lllIIlIIIIIIlIl = new String(Base64.getDecoder().decode(lllIIlIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlIIIIIlIII = new StringBuilder();
        char[] lllIIlIIIIIIlll = lllIIlIIIIIlIIl.toCharArray();
        int lllIIlIIIIIIllI = lIIIIlll[0];
        char[] lllIIlIIIIIIIII = lllIIlIIIIIIlIl.toCharArray();
        int lllIIIlllllllll = lllIIlIIIIIIIII.length;
        int lllIIIllllllllI = lIIIIlll[0];
        while (bx.lIIIIIlIll(lllIIIllllllllI, lllIIIlllllllll)) {
            char lllIIlIIIIIlIll = lllIIlIIIIIIIII[lllIIIllllllllI];
            lllIIlIIIIIlIII.append((char)(lllIIlIIIIIlIll ^ lllIIlIIIIIIlll[lllIIlIIIIIIllI % lllIIlIIIIIIlll.length]));
            0;
            ++lllIIlIIIIIIllI;
            ++lllIIIllllllllI;
            0;
            
            return null;
        }
        return String.valueOf(lllIIlIIIIIlIII);
    }

    private static boolean lIIIIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        if (bx.lIIIIIlIII(this.ga.cq() ? 1 : 0)) {
            return lIIIIlll[0];
        }
        int[] nArray = new int[lIIIIlll[1]];
        nArray[bx.lIIIIlll[0]] = lIIIIlll[2];
        if (bx.lIIIIIlIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIIlll[1]];
            nArray2[bx.lIIIIlll[0]] = lIIIIlll[2];
            if (bx.lIIIIIlIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIIlll[1]];
                nArray3[bx.lIIIIlll[0]] = lIIIIlll[2];
                Inventory.getFirst((int[])nArray3).interact(lIIIIllI[lIIIIlll[0]]);
            }
        }
        int[] nArray4 = new int[lIIIIlll[1]];
        nArray4[bx.lIIIIlll[0]] = lIIIIlll[3];
        TileObject lllIIlIIIIlIlIl = TileObjects.getNearest((int[])nArray4);
        if (bx.lIIIIIlIlI(lllIIlIIIIlIlIl)) {
            lllIIlIIIIlIlIl.interact(lIIIIllI[lIIIIlll[1]]);
        }
        return lIIIIlll[1];
    }

    @Inject
    public bx(SquireRangingGuild squireRangingGuild) {
        this.ga = squireRangingGuild;
    }

    private static boolean lIIIIIlIlI(Object object) {
        return object != null;
    }
}

