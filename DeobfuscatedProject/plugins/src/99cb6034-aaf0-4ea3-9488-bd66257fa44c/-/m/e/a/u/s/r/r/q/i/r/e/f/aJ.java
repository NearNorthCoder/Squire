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

@TaskDesc(name="Seeding birdhouse", priority=5)
public class aJ
extends aG {
    private static /* synthetic */ int[] lIllllIIllII;
    private static /* synthetic */ String[] lIllllIIlIll;

    private static String lllIlllIIIllIl(String lllllllllllllllIlIllIIlIlIllIIII, String lllllllllllllllIlIllIIlIlIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIlIlIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIlIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIIlIlIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIIlIlIllIIlI.init(lIllllIIllII[3], lllllllllllllllIlIllIIlIlIllIIll);
            return new String(lllllllllllllllIlIllIIlIlIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIIlIlIllIIIl) {
            lllllllllllllllIlIllIIlIlIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void lllIlllIIIlllI() {
        lIllllIIlIll = new String[lIllllIIllII[0]];
        aJ.lIllllIIlIll[aJ.lIllllIIllII[1]] = aJ.lllIlllIIIllIl("lyCAKL1f9Ps=", "YBPui");
    }

    private static boolean lllIlllIIlIIII(Object object) {
        return object != null;
    }

    private static boolean lllIlllIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected aJ(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[lIllllIIllII[0]];
        fArray[aJ.lIllllIIllII[1]] = F.BUILT;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    private static boolean lllIlllIIlIIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(E e2) {
        TileObject tileObject = this.cu.a(e2);
        if (!aJ.lllIlllIIlIIII(tileObject) || aJ.lllIlllIIlIIIl(tileObject.distanceTo((Locatable)Players.getLocal()), lIllllIIllII[2])) {
            return lIllllIIllII[1];
        }
        Item lllllllllllllllIlIllIIlIlIlllIlI = Inventory.getFirst(item -> {
            int n2;
            if (aJ.lllIlllIIlIIlI(item.isStackable() ? 1 : 0) && aJ.lllIlllIIlIIlI(item.getName().toLowerCase().contains(lIllllIIlIll[lIllllIIllII[1]]) ? 1 : 0)) {
                n2 = lIllllIIllII[0];
                "".length();
                if (-" ".length() >= 0) {
                    return ((9 ^ 0x17) & ~(0xBA ^ 0xA4)) != 0;
                }
            } else {
                n2 = lIllllIIllII[1];
            }
            return n2 != 0;
        });
        if (aJ.lllIlllIIlIIII(lllllllllllllllIlIllIIlIlIlllIlI)) {
            void lllllllllllllllIlIllIIlIlIllllII;
            aJ lllllllllllllllIlIllIIlIlIllllIl;
            void lllllllllllllllIlIllIIlIlIlllIll;
            lllllllllllllllIlIllIIlIlIlllIlI.useOn((TileObject)lllllllllllllllIlIllIIlIlIlllIll);
            lllllllllllllllIlIllIIlIlIllllIl.cu.Q().add((E)lllllllllllllllIlIllIIlIlIllllII);
            "".length();
            return lIllllIIllII[0];
        }
        return lIllllIIllII[1];
    }

    private static void lllIlllIIIllll() {
        lIllllIIllII = new int[4];
        aJ.lIllllIIllII[0] = " ".length();
        aJ.lIllllIIllII[1] = (0xDD ^ 0x9D) & ~(0x6F ^ 0x2F);
        aJ.lIllllIIllII[2] = 0x2B ^ 0x31 ^ (0x7F ^ 0x75);
        aJ.lIllllIIllII[3] = "  ".length();
    }

    static {
        aJ.lllIlllIIIllll();
        aJ.lllIlllIIIlllI();
    }
}

