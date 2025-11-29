/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.E;
import -.m.e.a.u.s.r.r.q.i.r.e.f.F;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aG;
import -.m.e.a.u.s.r.r.q.i.r.e.f.j;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Setting up birdhouse", priority=5)
public class aK
extends aG {
    private static /* synthetic */ String[] lIllllllIIIl;
    private static /* synthetic */ int[] lIllllllIIlI;

    private static boolean llllIIIIIIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static void llllIIIIIIIIIl() {
        lIllllllIIIl = new String[lIllllllIIlI[5]];
        aK.lIllllllIIIl[aK.lIllllllIIlI[1]] = aK.lllIllllllllll("CyI7JR0=", "IWRIy");
        aK.lIllllllIIIl[aK.lIllllllIIlI[0]] = aK.lllIllllllllll("Ji4RN2osKBYgLw==", "DGcSJ");
        aK.lIllllllIIIl[aK.lIllllllIIlI[4]] = aK.llllIIIIIIIIII("uNkA/jp5szw=", "mpRfl");
    }

    static {
        aK.llllIIIIIIIIlI();
        aK.llllIIIIIIIIIl();
    }

    private static boolean llllIIIIIIIIll(Object object) {
        return object != null;
    }

    private static String llllIIIIIIIIII(String lllllllllllllllIlIlIlllllIllllII, String lllllllllllllllIlIlIlllllIlllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIlllllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIlllllIlllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlllllIlllllI.init(lIllllllIIlI[4], lllllllllllllllIlIlIlllllIllllll);
            return new String(lllllllllllllllIlIlIlllllIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIlllllIllllIl) {
            lllllllllllllllIlIlIlllllIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIllllllllll(String lllllllllllllllIlIlIlllllIlIIlll, String lllllllllllllllIlIlIlllllIlIlIll) {
        lllllllllllllllIlIlIlllllIlIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllllIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIlllllIlIlIlI = new StringBuilder();
        char[] lllllllllllllllIlIlIlllllIlIlIIl = lllllllllllllllIlIlIlllllIlIlIll.toCharArray();
        int lllllllllllllllIlIlIlllllIlIlIII = lIllllllIIlI[1];
        char[] lllllllllllllllIlIlIlllllIlIIIlI = lllllllllllllllIlIlIlllllIlIIlll.toCharArray();
        int lllllllllllllllIlIlIlllllIlIIIIl = lllllllllllllllIlIlIlllllIlIIIlI.length;
        int lllllllllllllllIlIlIlllllIlIIIII = lIllllllIIlI[1];
        while (aK.llllIIIIIIIllI(lllllllllllllllIlIlIlllllIlIIIII, lllllllllllllllIlIlIlllllIlIIIIl)) {
            char lllllllllllllllIlIlIlllllIlIllIl = lllllllllllllllIlIlIlllllIlIIIlI[lllllllllllllllIlIlIlllllIlIIIII];
            lllllllllllllllIlIlIlllllIlIlIlI.append((char)(lllllllllllllllIlIlIlllllIlIllIl ^ lllllllllllllllIlIlIlllllIlIlIIl[lllllllllllllllIlIlIlllllIlIlIII % lllllllllllllllIlIlIlllllIlIlIIl.length]));
            "".length();
            ++lllllllllllllllIlIlIlllllIlIlIII;
            ++lllllllllllllllIlIlIlllllIlIIIII;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIlllllIlIlIlI);
    }

    @Inject
    protected aK(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[lIllllllIIlI[0]];
        fArray[aK.lIllllllIIlI[1]] = F.EMPTY;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    private static boolean llllIIIIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static void llllIIIIIIIIlI() {
        lIllllllIIlI = new int[6];
        aK.lIllllllIIlI[0] = " ".length();
        aK.lIllllllIIlI[1] = (0x86 ^ 0xBB) & ~(0x1A ^ 0x27);
        aK.lIllllllIIlI[2] = 0x93 ^ 0x83;
        aK.lIllllllIIlI[3] = -(0xFFFFE3F7 & 0x5DA9) & (0xFFFFEBF9 & 0x77FE);
        aK.lIllllllIIlI[4] = "  ".length();
        aK.lIllllllIIlI[5] = "   ".length();
    }

    @Override
    public boolean f(E e2) {
        TileObject tileObject = this.cu.a(e2);
        if (!aK.llllIIIIIIIIll(tileObject) || aK.llllIIIIIIIlII(tileObject.distanceTo((Locatable)Players.getLocal()), lIllllllIIlI[2])) {
            return lIllllllIIlI[1];
        }
        int[] nArray = new int[lIllllllIIlI[0]];
        nArray[aK.lIllllllIIlI[1]] = lIllllllIIlI[3];
        Item lllllllllllllllIlIlIllllllIIIlIl = Inventory.getFirst((int[])nArray);
        if (aK.llllIIIIIIIIll(lllllllllllllllIlIlIllllllIIIlIl)) {
            Item lllllllllllllllIlIlIllllllIIIlII = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(lIllllllIIIl[lIllllllIIlI[4]]));
            if (aK.llllIIIIIIIIll(lllllllllllllllIlIlIllllllIIIlII)) {
                aK lllllllllllllllIlIlIllllllIIlIII;
                lllllllllllllllIlIlIllllllIIIlII.useOn(lllllllllllllllIlIlIllllllIIIlIl);
                lllllllllllllllIlIlIllllllIIlIII.sleep(lIllllllIIlI[4]);
                return lIllllllIIlI[0];
            }
            return lIllllllIIlI[1];
        }
        if (aK.llllIIIIIIIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lIllllllIIIl[lIllllllIIlI[0]])) ? 1 : 0)) {
            return lIllllllIIlI[1];
        }
        tileObject.interact(lIllllllIIIl[lIllllllIIlI[1]]);
        return lIllllllIIlI[0];
    }
}

