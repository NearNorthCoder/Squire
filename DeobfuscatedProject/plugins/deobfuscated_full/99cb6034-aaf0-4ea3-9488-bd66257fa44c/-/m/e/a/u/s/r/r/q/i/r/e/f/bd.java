/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

/* TASK: Cleaning produce -> CleaningproduceTask */
@TaskDesc(name="Cleaning produce", priority=21)
public class bd
extends az {
    private static /* synthetic */ String[] lIlllIIlIIIl;
    private static /* synthetic */ int[] lIlllIIlIIll;

    private static void lllIlIllIlIlIl() {
        lIlllIIlIIIl = new String[lIlllIIlIIll[4]];
        bd.lIlllIIlIIIl[bd.lIlllIIlIIll[1]] = bd."Clean";
        bd.lIlllIIlIIIl[bd.lIlllIIlIIll[2]] = bd."Clean";
        bd.lIlllIIlIIIl[bd.lIlllIIlIIll[3]] = bd."Clean";
    }

    @Inject
    public bd(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static boolean lllIlIllIllIII(int n2) {
        return n2 <= 0;
    }

    public boolean run() {
        if (bd.lllIlIllIlIlll(Players.getLocal().isAnimating() ? 1 : 0)) {
            this.sleep(lIlllIIlIIll[3]);
            return lIlllIIlIIll[1];
        }
        Item var2 = Inventory.getFirst(item -> item.hasAction(lIlllIIlIIIl[lIlllIIlIIll[3]]::equals));
        if (bd.lllIlIllIllIlI(var2)) {
            return lIlllIIlIIll[1];
        }
        bd.a(item -> item.hasAction(lIlllIIlIIIl[lIlllIIlIIll[2]]::equals));
        0;
        return lIlllIIlIIll[2];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(Predicate<Item> predicate) {
        boolean bl;
        void var11;
        int n2 = lIlllIIlIIll[0];
        Iterator var12 = Inventory.getAll(predicate).iterator();
        while (bd.lllIlIllIlIlll(var12.hasNext() ? 1 : 0)) {
            Item var8 = (Item)var12.next();
            var8.interact(lIlllIIlIIIl[lIlllIIlIIll[1]]);
            if (bd.lllIlIllIllIII((int)(--var11))) {
                return lIlllIIlIIll[2];
            }
            0;
            if (-(0xFC ^ 0xAF ^ (0x4D ^ 0x1B)) < 0) continue;
            return ((0x2D ^ 0x1B ^ (0xDA ^ 0xAF)) & (0x2A ^ 0x31 ^ (0x5A ^ 2) ^ -1)) != 0;
        }
        if (bd.lllIlIllIllIIl((int)var11, lIlllIIlIIll[0])) {
            bl = lIlllIIlIIll[2];
            0;
            if (3 >= (0x8E ^ 0x9D ^ (0x61 ^ 0x76))) {
                return ((0xC4 ^ 0x8C ^ (0x94 ^ 0x87)) & (55 + 99 - 81 + 138 ^ 131 + 29 - 121 + 97 ^ -1)) != 0;
            }
        } else {
            bl = lIlllIIlIIll[1];
        }
        return bl;
    }

    private static String lllIlIllIIlIlI(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var6 = var17.toCharArray();
        int var10 = lIlllIIlIIll[1];
        char[] var13 = var16.toCharArray();
        int var7 = var13.length;
        int var9 = lIlllIIlIIll[1];
        while (bd.lllIlIllIllIIl(var9, var7)) {
            char var18 = var13[var9];
            var4.append((char)(var18 ^ var6[var10 % var6.length]));
            0;
            ++var10;
            ++var9;
            0;
            if ((0x79 ^ 0x7C) > 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean lllIlIllIlIlll(int n2) {
        return n2 != 0;
    }

    private static String lllIlIllIIlIll(String var3, String var15) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlllIIlIIll[3], var1);
            return new String(var14.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lllIlIllIlIllI() {
        lIlllIIlIIll = new int[5];
        bd.lIlllIIlIIll[0] = 0x3D ^ 0x35;
        bd.lIlllIIlIIll[1] = (106 + 146 - 206 + 192 ^ 118 + 4 - 42 + 80) & (66 + 79 - -91 + 8 ^ 59 + 169 - 135 + 93 ^ -1);
        bd.lIlllIIlIIll[2] = 1;
        bd.lIlllIIlIIll[3] = 2;
        bd.lIlllIIlIIll[4] = 3;
    }

    private static boolean lllIlIllIllIlI(Object object) {
        return object == null;
    }

    private static boolean lllIlIllIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bd.lllIlIllIlIllI();
        bd.lllIlIllIlIlIl();
    }
}

