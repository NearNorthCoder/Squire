/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aN;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Applying compost potion to the bin", priority=31, blocking=true)
public class aL
extends aN {
    private static /* synthetic */ String[] llIIIIIlIIll;
    private static /* synthetic */ int[] llIIIIIlIlII;

    @Inject
    public aL(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static String llllIIIllIIIII(String lllllllllllllllIlIlIllIlIlIllIII, String lllllllllllllllIlIlIllIlIlIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIllIlIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), llIIIIIlIlII[2]), "DES");
            Cipher lllllllllllllllIlIlIllIlIlIllIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIllIlIlIllIlI.init(llIIIIIlIlII[3], lllllllllllllllIlIlIllIlIlIllIll);
            return new String(lllllllllllllllIlIlIllIlIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIllIlIlIllIIl) {
            lllllllllllllllIlIlIllIlIlIllIIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean I(N n2) {
        int n3;
        void lllllllllllllllIlIlIllIlIllIIllI;
        if (aL.llllIIIllIIIll(this.bS.applyCompostPotion() ? 1 : 0)) {
            return llIIIIIlIlII[0];
        }
        an lllllllllllllllIlIlIllIlIllIIlIl = lllllllllllllllIlIlIllIlIllIIllI.aI();
        au lllllllllllllllIlIlIllIlIllIIlII = lllllllllllllllIlIlIllIlIllIIlIl.aY();
        if (aL.llllIIIllIIlII((Object)lllllllllllllllIlIlIllIlIllIIlIl.aZ(), (Object)n.HARVESTABLE) && (!aL.llllIIIllIIlIl((Object)lllllllllllllllIlIlIllIlIllIIlII, (Object)au.COMPOST) || aL.llllIIIllIIlII((Object)lllllllllllllllIlIlIllIlIllIIlII, (Object)au.GIANT_COMPOST))) {
            n3 = llIIIIIlIlII[1];
            0;
            if (2 < 0) {
                return ((0x22 ^ 0x27) & ~(0x23 ^ 0x26)) != 0;
            }
        } else {
            n3 = llIIIIIlIlII[0];
        }
        return n3 != 0;
    }

    @Override
    public boolean b(TileObject tileObject) {
        Item item2 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIIIIlIIll[llIIIIIlIlII[0]]));
        if (aL.llllIIIllIIllI(item2)) {
            return llIIIIIlIlII[0];
        }
        item2.useOn(tileObject);
        return llIIIIIlIlII[1];
    }

    private static boolean llllIIIllIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static void llllIIIllIIIlI() {
        llIIIIIlIlII = new int[4];
        aL.llIIIIIlIlII[0] = (0x57 ^ 0x68) & ~(0x94 ^ 0xAB);
        aL.llIIIIIlIlII[1] = 1;
        aL.llIIIIIlIlII[2] = 0x76 ^ 0x7E;
        aL.llIIIIIlIlII[3] = 2;
    }

    private static boolean llllIIIllIIllI(Object object) {
        return object == null;
    }

    private static void llllIIIllIIIIl() {
        llIIIIIlIIll = new String[llIIIIIlIlII[1]];
        aL.llIIIIIlIIll[aL.llIIIIIlIlII[0]] = aL."compost potion";
    }

    private static boolean llllIIIllIIIll(int n2) {
        return n2 == 0;
    }

    static {
        aL.llllIIIllIIIlI();
        aL.llllIIIllIIIIl();
    }

    private static boolean llllIIIllIIlIl(Object object, Object object2) {
        return object != object2;
    }
}

