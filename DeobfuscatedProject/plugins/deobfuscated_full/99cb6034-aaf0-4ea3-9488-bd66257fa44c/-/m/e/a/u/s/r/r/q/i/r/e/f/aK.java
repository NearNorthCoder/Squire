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

/* TASK: Setting up birdhouse -> SettingupbirdhouseTask */
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
        aK.lIllllllIIIl[aK.lIllllllIIlI[1]] = aK."Build";
        aK.lIllllllIIIl[aK.lIllllllIIlI[0]] = aK."bird house";
        aK.lIllllllIIIl[aK.lIllllllIIlI[4]] = aK."logs";
    }

    static {
        aK.llllIIIIIIIIlI();
        aK.llllIIIIIIIIIl();
    }

    private static boolean llllIIIIIIIIll(Object object) {
        return object != null;
    }

    private static String llllIIIIIIIIII(String var1, String var7) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIllllllIIlI[4], var5);
            return new String(var11.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIIIIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIllllllllll(String var10, String var13) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var14 = lIllllllIIlI[1];
        char[] var12 = var10.toCharArray();
        int var4 = var12.length;
        int var17 = lIllllllIIlI[1];
        while (aK.llllIIIIIIIllI(var17, var4)) {
            char var2 = var12[var17];
            var8.append((char)(var2 ^ var15[var14 % var15.length]));
            0;
            ++var14;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var8);
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
        aK.lIllllllIIlI[0] = 1;
        aK.lIllllllIIlI[1] = (0x86 ^ 0xBB) & ~(0x1A ^ 0x27);
        aK.lIllllllIIlI[2] = 0x93 ^ 0x83;
        aK.lIllllllIIlI[3] = -(0xFFFFE3F7 & 0x5DA9) & (0xFFFFEBF9 & 0x77FE);
        aK.lIllllllIIlI[4] = 2;
        aK.lIllllllIIlI[5] = 3;
    }

    @Override
    public boolean f(E e2) {
        TileObject tileObject = this.cu.a(e2);
        if (!aK.llllIIIIIIIIll(tileObject) || aK.llllIIIIIIIlII(tileObject.distanceTo((Locatable)Players.getLocal()), lIllllllIIlI[2])) {
            return lIllllllIIlI[1];
        }
        int[] nArray = new int[lIllllllIIlI[0]];
        nArray[aK.lIllllllIIlI[1]] = lIllllllIIlI[3];
        Item var16 = Inventory.getFirst((int[])nArray);
        if (aK.llllIIIIIIIIll(var16)) {
            Item var6 = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(lIllllllIIIl[lIllllllIIlI[4]]));
            if (aK.llllIIIIIIIIll(var6)) {
                aK var9;
                var6.useOn(var16);
                var9.sleep(lIllllllIIlI[4]);
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

