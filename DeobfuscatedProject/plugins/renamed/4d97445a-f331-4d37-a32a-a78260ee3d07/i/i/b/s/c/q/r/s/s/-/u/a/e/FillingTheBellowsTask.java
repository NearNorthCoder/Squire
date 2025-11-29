/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Filling the bellows -> FillingthebellowsTask */
@TaskDesc(name="Filling the bellows")
public class FillingTheBellowsTask
extends Task {
    private /* synthetic */ boolean fo;
    private static /* synthetic */ String[] lIllIIIII;
    private static /* synthetic */ int[] lIllIIIIl;

    private static String lIIllIlIllI(String lIllllIlllIIlIl, String lIllllIlllIIlII) {
        try {
            SecretKeySpec lIllllIlllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllllIlllIIlII.getBytes(StandardCharsets.UTF_8)), lIllIIIIl[6]), "DES");
            Cipher lIllllIlllIIlll = Cipher.getInstance("DES");
            lIllllIlllIIlll.init(lIllIIIIl[1], lIllllIlllIlIII);
            return new String(lIllllIlllIIlll.doFinal(Base64.getDecoder().decode(lIllllIlllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIlllIIllI) {
            lIllllIlllIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIIllIllIII() {
        lIllIIIII = new String[lIllIIIIl[1]];
        bd.lIllIIIII[bd.lIllIIIIl[0]] = bd."Suck";
        bd.lIllIIIII[bd.lIllIIIIl[2]] = bd."Suck";
    }

    static {
        bd.lIIllIllIIl();
        bd.lIIllIllIII();
    }

    private static boolean lIIllIllIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIllIlIlll(String lIllllIllllIIII, String lIllllIllllIIIl) {
        try {
            SecretKeySpec lIllllIllllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllIllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllllIllllIlII = Cipher.getInstance("Blowfish");
            lIllllIllllIlII.init(lIllIIIIl[1], lIllllIllllIlIl);
            return new String(lIllllIllllIlII.doFinal(Base64.getDecoder().decode(lIllllIllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllllIllllIIll) {
            lIllllIllllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlllII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        bd lIllllIlllllIll;
        if (!bd.lIIllIllIlI(Players.getLocal().isAnimating() ? 1 : 0) || bd.lIIllIllIll(Players.getLocal().getInteracting())) {
            return lIllIIIIl[0];
        }
        if (bd.lIIllIllIlI(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIIIIl[0];
        }
        if (bd.lIIllIlllII(lIllllIlllllIll.ct() ? 1 : 0)) {
            return lIllIIIIl[0];
        }
        TileObject lIllllIlllllIlI = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIllIIIIl[2]];
            stringArray[bd.lIllIIIIl[0]] = lIllIIIII[lIllIIIIl[2]];
            return tileObject.hasAction(stringArray);
        });
        if (bd.lIIllIlllIl(lIllllIlllllIlI)) {
            return lIllIIIIl[0];
        }
        var1_1.interact(lIllIIIII[lIllIIIIl[0]]);
        this.sleep(lIllIIIIl[1]);
        return lIllIIIIl[2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean ct() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[lIllIIIIl[2]];
                nArray[bd.lIllIIIIl[0]] = lIllIIIIl[3];
                if (!bd.lIIllIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIllIIIIl[2]];
                nArray2[bd.lIllIIIIl[0]] = lIllIIIIl[4];
                if (!bd.lIIllIllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[lIllIIIIl[2]];
                nArray3[bd.lIllIIIIl[0]] = lIllIIIIl[5];
                if (!bd.lIIllIlllII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
            }
            n2 = lIllIIIIl[2];
            0;
            if ((0xCF ^ 0x91 ^ (0x2D ^ 0x77)) >= 0) return n2 != 0;
            return ((0x30 ^ 0x36 ^ (0 ^ 0x19)) & (95 + 77 - 167 + 143 ^ 133 + 26 - 34 + 14 ^ -1)) != 0;
        }
        n2 = lIllIIIIl[0];
        return n2 != 0;
    }

    private static boolean lIIllIlllIl(Object object) {
        return object == null;
    }

    private static void lIIllIllIIl() {
        lIllIIIIl = new int[7];
        bd.lIllIIIIl[0] = (0x6F ^ 0x2A) & ~(0xC1 ^ 0x84);
        bd.lIllIIIIl[1] = 2;
        bd.lIllIIIIl[2] = 1;
        bd.lIllIIIIl[3] = 0xFFFFBBBE & 0x4F7B;
        bd.lIllIIIIl[4] = 0xFFFFEFB9 & 0x1B7F;
        bd.lIllIIIIl[5] = -(11 + 95 - -17 + 6) & (0xFFFF9BBA & 0x6FFD);
        bd.lIllIIIIl[6] = 0xCD ^ 0x9F ^ (0x25 ^ 0x7F);
    }

    private static boolean lIIllIllIll(Object object) {
        return object != null;
    }
}

