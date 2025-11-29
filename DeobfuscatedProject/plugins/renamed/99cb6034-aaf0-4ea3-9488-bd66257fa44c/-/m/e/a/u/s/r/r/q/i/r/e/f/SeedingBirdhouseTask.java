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

import -.m.e.a.u.s.r.r.q.i.r.e.f.EEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.FEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aG_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.j_Unknown;
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

/* TASK: Seeding birdhouse -> SeedingbirdhouseTask */
@TaskDesc(name="Seeding birdhouse", priority=5)
public class SeedingBirdhouseTask
extends aG_Unknown {
    private static /* synthetic */ int[] lIllllIIllII;
    private static /* synthetic */ String[] lIllllIIlIll;

    private static String lllIlllIIIllIl(String var7, String var2) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIllllIIllII[3], var9);
            return new String(var8.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lllIlllIIIlllI() {
        lIllllIIlIll = new String[lIllllIIllII[0]];
        aJ.lIllllIIlIll[aJ.lIllllIIllII[1]] = aJ."seed";
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
        Item var6 = Inventory.getFirst(item -> {
            int n2;
            if (aJ.lllIlllIIlIIlI(item.isStackable() ? 1 : 0) && aJ.lllIlllIIlIIlI(item.getName().toLowerCase().contains(lIllllIIlIll[lIllllIIllII[1]]) ? 1 : 0)) {
                n2 = lIllllIIllII[0];
                0;
                if (-1 >= 0) {
                    return false;
                }
            } else {
                n2 = lIllllIIllII[1];
            }
            return n2 != 0;
        });
        if (aJ.lllIlllIIlIIII(var6)) {
            void var4;
            aJ var3;
            void var5;
            var6.useOn((TileObject)var5);
            var3.cu.Q().add((E)var4);
            0;
            return lIllllIIllII[0];
        }
        return lIllllIIllII[1];
    }

    private static void lllIlllIIIllll() {
        lIllllIIllII = new int[4];
        aJ.lIllllIIllII[0] = 1;
        aJ.lIllllIIllII[1] = (0xDD ^ 0x9D) & ~(0x6F ^ 0x2F);
        aJ.lIllllIIllII[2] = 0x2B ^ 0x31 ^ (0x7F ^ 0x75);
        aJ.lIllllIIllII[3] = 2;
    }

    static {
        aJ.lllIlllIIIllll();
        aJ.lllIlllIIIlllI();
    }
}

