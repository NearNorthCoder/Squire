/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 */
package m.u.a.-.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.MagicArenaConfig;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.u.a.-.e.s.q.t.i.r.i;
import m.u.a.-.e.s.q.t.i.r.j;
import m.u.a.-.e.s.q.t.i.r.w;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;

/* TASK: Enchantment room -> EnchantmentroomTask */
@TaskDesc(name="Enchantment room", priority=5, blocking=true)
public class u
extends w<j> {
    private static /* synthetic */ int[] lllIlIllllIl;
    @Inject
    private /* synthetic */ MagicArenaConfig j;
    private static /* synthetic */ String[] lllIlIlllIll;

    static {
        u.lIIIllIIlIlIllI();
        u.lIIIllIIlIlIIll();
    }

    private static boolean lIIIllIIlIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var2_2;
        u var7;
        i var6;
        String[] stringArray = new String[lllIlIllllIl[1]];
        stringArray[u.lllIlIllllIl[0]] = lllIlIlllIll[lllIlIllllIl[1]];
        if (u.lIIIllIIlIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lllIlIllllIl[1]];
            stringArray2[u.lllIlIllllIl[0]] = lllIlIlllIll[lllIlIllllIl[2]];
            Inventory.dropAll((String[])stringArray2);
            0;
        }
        if (u.lIIIllIIlIllIII((Object)(var6 = (i)Stream.of(i.values()).filter(i::z).findFirst().orElse(null)))) {
            return lllIlIllllIl[0];
        }
        if (u.lIIIllIIlIlIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIlIlllIll[lllIlIllllIl[4]])) ? 1 : 0)) {
            Magic.cast((Spell)var7.L(), (Item)Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIlIlllIll[lllIlIllllIl[3]])));
            return lllIlIllllIl[1];
        }
        String[] stringArray3 = new String[lllIlIllllIl[1]];
        stringArray3[u.lllIlIllllIl[0]] = var6.v();
        if (u.lIIIllIIlIlIlll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
            String[] stringArray4 = new String[lllIlIllllIl[1]];
            stringArray4[u.lllIlIllllIl[0]] = var6.v();
            Magic.cast((Spell)var7.L(), (Item)Inventory.getFirst((String[])stringArray4));
            return lllIlIllllIl[1];
        }
        String[] stringArray5 = new String[lllIlIllllIl[1]];
        stringArray5[u.lllIlIllllIl[0]] = var6.y();
        TileObject var12 = TileObjects.getNearest((String[])stringArray5);
        if (u.lIIIllIIlIllIII(var12)) {
            return lllIlIllllIl[0];
        }
        var2_2.interact(lllIlIllllIl[0]);
        return lllIlIllllIl[1];
    }

    private static String lIIIllIIlIlIIII(String var1, String var21) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lllIlIllllIl[2], var17);
            return new String(var4.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Inject
    private u(j j2, SquireMTA squireMTA) {
        super(j2, squireMTA);
    }

    private static boolean lIIIllIIlIlIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIIllIIlIlIllI() {
        lllIlIllllIl = new int[7];
        u.lllIlIllllIl[0] = (0x1B ^ 0x5C) & ~(0x47 ^ 0);
        u.lllIlIllllIl[1] = 1;
        u.lllIlIllllIl[2] = 2;
        u.lllIlIllllIl[3] = 3;
        u.lllIlIllllIl[4] = 0x2D ^ 0x7B ^ (0xE1 ^ 0xB3);
        u.lllIlIllllIl[5] = 0x88 ^ 0x8D;
        u.lllIlIllllIl[6] = 0xB7 ^ 0xA7 ^ (0x2E ^ 0x36);
    }

    private static String lIIIllIIlIlIIIl(String var2, String var18) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lllIlIllllIl[6]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lllIlIllllIl[2], var3);
            return new String(var14.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean a(Item item) {
        int n2;
        if (u.lIIIllIIlIlIlll(item.getName().toLowerCase().contains(lllIlIlllIll[lllIlIllllIl[0]]) ? 1 : 0) && u.lIIIllIIlIlIlll(Stream.of(this.j.maximumEnchant().t().getRuneNames()).anyMatch(string -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            n2 = lllIlIllllIl[1];
            0;
            if (2 == 0) {
                return false;
            }
        } else {
            n2 = lllIlIllllIl[0];
        }
        return n2 != 0;
    }

    @Override
    public Spell L() {
        return this.j.maximumEnchant().u();
    }

    private static void lIIIllIIlIlIIll() {
        lllIlIlllIll = new String[lllIlIllllIl[5]];
        u.lllIlIlllIll[u.lllIlIllllIl[0]] = u."staff";
        u.lllIlIlllIll[u.lllIlIllllIl[1]] = u."Orb";
        u.lllIlIlllIll[u.lllIlIllllIl[2]] = u."Orb";
        u.lllIlIlllIll[u.lllIlIllllIl[3]] = u."dragonstone";
        u.lllIlIlllIll[u.lllIlIllllIl[4]] = u."dragonstone";
    }

    private static boolean lIIIllIIlIllIII(Object object) {
        return object == null;
    }

    private static String lIIIllIIlIlIIlI(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var10 = var16.toCharArray();
        int var11 = lllIlIllllIl[0];
        char[] var5 = var15.toCharArray();
        int var19 = var5.length;
        int var20 = lllIlIllllIl[0];
        while (u.lIIIllIIlIllIIl(var20, var19)) {
            char var9 = var5[var20];
            var22.append((char)(var9 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var20;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var22);
    }
}

