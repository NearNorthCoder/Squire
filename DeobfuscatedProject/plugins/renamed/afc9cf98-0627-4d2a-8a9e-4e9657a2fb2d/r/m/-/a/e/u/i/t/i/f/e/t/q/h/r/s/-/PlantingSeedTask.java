/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.FEnum;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i_Unknown;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

/* TASK: Planting Seed -> PlantingseedTask */
@TaskDesc(name="Planting Seed", priority=10, blocking=true)
public class PlantingSeedTask
extends r {
    private static /* synthetic */ String[] lIIlllllIIlIl;
    private final /* synthetic */ SquireTitheConfig aa;
    private static /* synthetic */ int[] lIIlllllIIllI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        s var3;
        void var24;
        Item item2 = Inventory.getFirst(item -> item.getName().endsWith(lIIlllllIIlIl[lIIlllllIIllI[4]]));
        if (s.lIllIlIllIlIlll(item2)) {
            return lIIlllllIIllI[0];
        }
        if (s.lIllIlIllIllIII(var24.getQuantity(), var3.Z.u())) {
            return lIIlllllIIllI[0];
        }
        if (s.lIllIlIllIllIII(var3.Z.v(), lIIlllllIIllI[1] * var3.Z.u())) {
            return lIIlllllIIllI[0];
        }
        if (s.lIllIlIllIllIIl(var3.Z.q()) && s.lIllIlIllIllIlI(Movement.getRunEnergy(), lIIlllllIIllI[2]) && s.lIllIlIllIllIll(var3.aa.waitForEnergy() ? 1 : 0)) {
            return lIIlllllIIllI[0];
        }
        List var4 = Inventory.getAll(item -> item.getName().contains(lIIlllllIIlIl[lIIlllllIIllI[3]]));
        if (s.lIllIlIllIlllII(var4.size())) {
            Iterator var2 = var4.iterator();
            while (s.lIllIlIllIllIll(var2.hasNext() ? 1 : 0)) {
                Item var13 = (Item)var2.next();
                var13.interact(lIIlllllIIlIl[lIIlllllIIllI[0]]);
                0;
                if (3 == 3) continue;
                return false;
            }
            return lIIlllllIIllI[3];
        }
        TileObject var2 = var3.Z.a(tileObject -> {
            boolean bl;
            if (s.lIllIlIllIlllIl((Object)f.d(tileObject.getId()), (Object)f.EMPTY)) {
                bl = lIIlllllIIllI[3];
                0;
                if (-1 == 2) {
                    return ((0x6A ^ 0x51 ^ (0xC2 ^ 0xA7)) & (0x2D ^ 0x1B ^ (0x15 ^ 0x7D) ^ -1)) != 0;
                }
            } else {
                bl = lIIlllllIIllI[0];
            }
            return bl;
        });
        if (s.lIllIlIllIlIlll(var2)) {
            return lIIlllllIIllI[0];
        }
        item2.useOn((TileObject)var3_4);
        return lIIlllllIIllI[3];
    }

    private static String lIllIlIllIlIIll(String var21, String var1) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIIlllllIIllI[6]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIIlllllIIllI[4], var6);
            return new String(var8.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllIlIlll(Object object) {
        return object == null;
    }

    @Inject
    protected s(i i2, SquireTitheConfig squireTitheConfig) {
        super(i2);
        this.aa = squireTitheConfig;
    }

    private static void lIllIlIllIlIllI() {
        lIIlllllIIllI = new int[7];
        s.lIIlllllIIllI[0] = 1 & (1 ^ -1);
        s.lIIlllllIIllI[1] = 0x64 ^ 0xF ^ (0xCC ^ 0xA3);
        s.lIIlllllIIllI[2] = 39 + 57 - 70 + 187 ^ 100 + 134 - 78 + 21;
        s.lIIlllllIIllI[3] = 1;
        s.lIIlllllIIllI[4] = 2;
        s.lIIlllllIIllI[5] = 3;
        s.lIIlllllIIllI[6] = 0 ^ 0x11 ^ (0xB5 ^ 0xAC);
    }

    private static boolean lIllIlIllIlllIl(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIlIllIlIlII(String var14, String var5) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIIlllllIIllI[4], var17);
            return new String(var23.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllIllIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIlIllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIllIllIIl(int n2) {
        return n2 <= 0;
    }

    private static boolean lIllIlIllIlllII(int n2) {
        return n2 > 0;
    }

    private static void lIllIlIllIlIlIl() {
        lIIlllllIIlIl = new String[lIIlllllIIllI[5]];
        s.lIIlllllIIlIl[s.lIIlllllIIllI[0]] = s."Wear";
        s.lIIlllllIIlIl[s.lIIlllllIIllI[3]] = s."Graceful";
        s.lIIlllllIIlIl[s.lIIlllllIIllI[4]] = s."seed";
    }

    private static String lIllIlIllIlIIlI(String var12, String var22) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var22.toCharArray();
        int var19 = lIIlllllIIllI[0];
        char[] var9 = var12.toCharArray();
        int var15 = var9.length;
        int var20 = lIIlllllIIllI[0];
        while (s.lIllIlIllIllIII(var20, var15)) {
            char var18 = var9[var20];
            var10.append((char)(var18 ^ var11[var19 % var11.length]));
            0;
            ++var19;
            ++var20;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    static {
        s.lIllIlIllIlIllI();
        s.lIllIlIllIlIlIl();
    }

    private static boolean lIllIlIllIllIll(int n2) {
        return n2 != 0;
    }
}

