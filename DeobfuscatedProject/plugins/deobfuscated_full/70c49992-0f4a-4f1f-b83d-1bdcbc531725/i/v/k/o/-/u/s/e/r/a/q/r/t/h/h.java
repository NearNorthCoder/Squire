/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.client.config.ConfigManager
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  org.jetbrains.annotations.Nullable
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.google.gson.Gson;
import gg.squire.client.util.Log;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.k;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigManager;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import org.jetbrains.annotations.Nullable;

@Singleton
public class h {
    private static final /* synthetic */ Gson S;
    private final /* synthetic */ ConfigManager T;
    private static /* synthetic */ int[] lIlIlIlIllIII;
    private /* synthetic */ boolean U;
    private static /* synthetic */ String[] lIlIlIlIlIlll;

    private static boolean lIllllllIlIIIII(Object object) {
        return object == null;
    }

    public Item a(Predicate<Item> predicate) {
        int[] nArray = new int[lIlIlIlIllIII[1]];
        nArray[h.lIlIlIlIllIII[2]] = lIlIlIlIllIII[3];
        if (h.lIllllllIIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIlIllIII[1]];
            nArray2[h.lIlIlIlIllIII[2]] = lIlIlIlIllIII[3];
            return Inventory.getFirst((int[])nArray2);
        }
        return Inventory.getAll().stream().filter(predicate).filter(Item::isTradable).min(Comparator.comparingInt(item -> item.getQuantity() * Prices.getItemPrice((int)item.getId()))).orElse(null);
    }

    @Nullable
    public static Item a(List<k> list) {
        Item item = null;
        int n2 = lIlIlIlIllIII[0];
        Iterator var20 = Inventory.getAll().iterator();
        while (h.lIllllllIIllllI(var20.hasNext() ? 1 : 0)) {
            List<k> var14;
            Item var12 = (Item)var20.next();
            Iterator<k> var2 = var14.iterator();
            while (h.lIllllllIIllllI(var2.hasNext() ? 1 : 0)) {
                k var1 = var2.next();
                if (h.lIllllllIIllllI(var1.M().equals(var12.getName()) ? 1 : 0) && h.lIllllllIIllllI(var1.O() ? 1 : 0)) {
                    int var7;
                    int var5 = Prices.getItemPrice((int)var12.getId()) * var12.getQuantity();
                    if (!h.lIllllllIIlllll(var5, var7)) break;
                    Item llllllllllllllIllIlIlIlIIlIllIll = var12;
                    var7 = var5;
                    0;
                    if (2 != 1) break;
                    return null;
                }
                0;
                if (3 > 0) continue;
                return null;
            }
            0;
            if (((0x1F ^ 0x23 ^ (0xA1 ^ 0xC0)) & (0x90 ^ 0xB0 ^ (0x61 ^ 0x1C) ^ -1)) <= (0x63 ^ 0x7F ^ (0x76 ^ 0x6E))) continue;
            return null;
        }
        return item;
    }

    private static void lIllllllIIlllII() {
        lIlIlIlIlIlll = new String[lIlIlIlIllIII[5]];
        h.lIlIlIlIlIlll[h.lIlIlIlIllIII[2]] = h."Trying to find a decent item to drop, but cannot";
        h.lIlIlIlIlIlll[h.lIlIlIlIllIII[1]] = h."Drop";
        h.lIlIlIlIlIlll[h.lIlIlIlIllIII[4]] = h."Eat";
    }

    private static String lIllllllIIllIll(String var3, String var15) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIlIlIlIllIII[4], var21);
            return new String(var9.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIIllIlI(String var16, String var13) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIlIlIlIllIII[6]), "DES");
            Cipher var25 = Cipher.getInstance("DES");
            var25.init(lIlIlIlIllIII[4], var17);
            return new String(var25.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIllllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public h(ConfigManager configManager) {
        this.T = configManager;
    }

    public void K() {
        Item item2 = this.a(item -> {
            String[] stringArray = new String[lIlIlIlIllIII[1]];
            stringArray[h.lIlIlIlIllIII[2]] = lIlIlIlIlIlll[lIlIlIlIllIII[4]];
            return item.hasAction(stringArray);
        });
        if (h.lIllllllIlIIIII(item2) && h.lIllllllIlIIIII(item2 = this.a(item -> lIlIlIlIllIII[1]))) {
            Log.info((String)lIlIlIlIlIlll[lIlIlIlIllIII[2]]);
            return;
        }
        item2.interact(lIlIlIlIlIlll[lIlIlIlIllIII[1]]);
    }

    private static boolean lIllllllIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllllllIIlllIl() {
        lIlIlIlIllIII = new int[7];
        h.lIlIlIlIllIII[0] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        h.lIlIlIlIllIII[1] = 1;
        h.lIlIlIlIllIII[2] = (0xDE ^ 0xC5) & ~(0x72 ^ 0x69);
        h.lIlIlIlIllIII[3] = -(0xFFFFFFF9 & 0x7927) & (0xFFFFFFFF & 0x7FF7);
        h.lIlIlIlIllIII[4] = 2;
        h.lIlIlIlIllIII[5] = 3;
        h.lIlIlIlIllIII[6] = 0x70 ^ 0x7B ^ 3;
    }

    private static String lIllllllIIllIIl(String var19, String var11) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var8 = var11.toCharArray();
        int var23 = lIlIlIlIllIII[2];
        char[] var24 = var19.toCharArray();
        int var18 = var24.length;
        int var6 = lIlIlIlIllIII[2];
        while (h.lIllllllIIlllll(var6, var18)) {
            char var22 = var24[var6];
            var4.append((char)(var22 ^ var8[var23 % var8.length]));
            0;
            ++var23;
            ++var6;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    static {
        h.lIllllllIIlllIl();
        h.lIllllllIIlllII();
        S = new Gson();
    }

    public void d(boolean bl) {
        this.U = bl;
    }

    public boolean L() {
        return this.U;
    }
}

