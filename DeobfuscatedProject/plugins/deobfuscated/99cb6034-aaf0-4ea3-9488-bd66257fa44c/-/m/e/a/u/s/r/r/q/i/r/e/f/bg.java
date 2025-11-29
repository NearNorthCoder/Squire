/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.p;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;

@TaskDesc(name="Picking up seaweed spores", priority=0x7FFFFFFF, blocking=true)
public class bg
extends Task {
    private static /* synthetic */ String[] lIlllllIllIl;
    private final /* synthetic */ SquireFarmerConfig cT;
    private static /* synthetic */ int[] lIlllllIlllI;

    private static String lllIllllllIlII(String lllllllllllllllIlIllIIIIIIIIIIlI, String lllllllllllllllIlIllIIIIIIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIIIIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIIIIIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIIIIIIIIllI.init(lIlllllIlllI[3], lllllllllllllllIlIllIIIIIIIIIlll);
            return new String(lllllllllllllllIlIllIIIIIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIIIIIIIIlIl) {
            lllllllllllllllIlIllIIIIIIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllIllllllIlIl() {
        lIlllllIllIl = new String[lIlllllIlllI[1]];
        bg.lIlllllIllIl[bg.lIlllllIlllI[0]] = bg."Take";
    }

    private static boolean lllIllllllIlll(int n2) {
        return n2 == 0;
    }

    static {
        bg.lllIllllllIllI();
        bg.lllIllllllIlIl();
    }

    private static boolean lllIlllllllIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public bg(SquireFarmerConfig squireFarmerConfig) {
        this.cT = squireFarmerConfig;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (bg.lllIllllllIlll(this.cT.fossil_island_underwaterSpores() ? 1 : 0)) {
            return lIlllllIlllI[0];
        }
        int[] nArray = new int[lIlllllIlllI[1]];
        nArray[bg.lIlllllIlllI[0]] = lIlllllIlllI[2];
        TileItem lllllllllllllllIlIllIIIIIIIIllII = TileItems.getNearest((int[])nArray);
        if (!bg.lllIlllllllIII(lllllllllllllllIlIllIIIIIIIIllII) || bg.lllIlllllllIIl(lllllllllllllllIlIllIIIIIIIIllII.getWorldLocation().getRegionID(), p.FOSSIL_ISLAND_UNDERWATER.X())) {
            return lIlllllIlllI[0];
        }
        var1_1.interact(lIlllllIllIl[lIlllllIlllI[0]]);
        return lIlllllIlllI[1];
    }

    private static void lllIllllllIllI() {
        lIlllllIlllI = new int[4];
        bg.lIlllllIlllI[0] = (0xAC ^ 0x9B) & ~(0x7E ^ 0x49);
        bg.lIlllllIlllI[1] = 1;
        bg.lIlllllIlllI[2] = -(0xFFFFFD6A & 0x2E9F) & (0xFFFFFFFF & 0x7FFB);
        bg.lIlllllIlllI[3] = 2;
    }

    private static boolean lllIlllllllIII(Object object) {
        return object != null;
    }
}

