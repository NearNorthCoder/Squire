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
        Iterator llllllllllllllIllIlIlIlIIlIllIIl = Inventory.getAll().iterator();
        while (h.lIllllllIIllllI(llllllllllllllIllIlIlIlIIlIllIIl.hasNext() ? 1 : 0)) {
            List<k> llllllllllllllIllIlIlIlIIlIlllII;
            Item llllllllllllllIllIlIlIlIIlIllIII = (Item)llllllllllllllIllIlIlIlIIlIllIIl.next();
            Iterator<k> llllllllllllllIllIlIlIlIIlIlIlll = llllllllllllllIllIlIlIlIIlIlllII.iterator();
            while (h.lIllllllIIllllI(llllllllllllllIllIlIlIlIIlIlIlll.hasNext() ? 1 : 0)) {
                k llllllllllllllIllIlIlIlIIlIlIllI = llllllllllllllIllIlIlIlIIlIlIlll.next();
                if (h.lIllllllIIllllI(llllllllllllllIllIlIlIlIIlIlIllI.M().equals(llllllllllllllIllIlIlIlIIlIllIII.getName()) ? 1 : 0) && h.lIllllllIIllllI(llllllllllllllIllIlIlIlIIlIlIllI.O() ? 1 : 0)) {
                    int llllllllllllllIllIlIlIlIIlIllIlI;
                    int llllllllllllllIllIlIlIlIIlIlIlIl = Prices.getItemPrice((int)llllllllllllllIllIlIlIlIIlIllIII.getId()) * llllllllllllllIllIlIlIlIIlIllIII.getQuantity();
                    if (!h.lIllllllIIlllll(llllllllllllllIllIlIlIlIIlIlIlIl, llllllllllllllIllIlIlIlIIlIllIlI)) break;
                    Item llllllllllllllIllIlIlIlIIlIllIll = llllllllllllllIllIlIlIlIIlIllIII;
                    llllllllllllllIllIlIlIlIIlIllIlI = llllllllllllllIllIlIlIlIIlIlIlIl;
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

    private static String lIllllllIIllIll(String llllllllllllllIllIlIlIlIIIlIIIlI, String llllllllllllllIllIlIlIlIIIIlllll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlIIIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIlIIIlIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIlIIIlIIlII.init(lIlIlIlIllIII[4], llllllllllllllIllIlIlIlIIIlIIlIl);
            return new String(llllllllllllllIllIlIlIlIIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIlIIIlIIIll) {
            llllllllllllllIllIlIlIlIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIIllIlI(String llllllllllllllIllIlIlIlIIIlIllIl, String llllllllllllllIllIlIlIlIIIlIllII) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlIIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIIIlIllII.getBytes(StandardCharsets.UTF_8)), lIlIlIlIllIII[6]), "DES");
            Cipher llllllllllllllIllIlIlIlIIIllIIIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIlIIIllIIIl.init(lIlIlIlIllIII[4], llllllllllllllIllIlIlIlIIIllIIlI);
            return new String(llllllllllllllIllIlIlIlIIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIlIIIllIIII) {
            llllllllllllllIllIlIlIlIIIllIIII.printStackTrace();
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

    private static String lIllllllIIllIIl(String llllllllllllllIllIlIlIlIIlIIIlII, String llllllllllllllIllIlIlIlIIIlllllI) {
        llllllllllllllIllIlIlIlIIlIIIlII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIlIIlIIIIlI = new StringBuilder();
        char[] llllllllllllllIllIlIlIlIIlIIIIIl = llllllllllllllIllIlIlIlIIIlllllI.toCharArray();
        int llllllllllllllIllIlIlIlIIlIIIIII = lIlIlIlIllIII[2];
        char[] llllllllllllllIllIlIlIlIIIlllIlI = llllllllllllllIllIlIlIlIIlIIIlII.toCharArray();
        int llllllllllllllIllIlIlIlIIIlllIIl = llllllllllllllIllIlIlIlIIIlllIlI.length;
        int llllllllllllllIllIlIlIlIIIlllIII = lIlIlIlIllIII[2];
        while (h.lIllllllIIlllll(llllllllllllllIllIlIlIlIIIlllIII, llllllllllllllIllIlIlIlIIIlllIIl)) {
            char llllllllllllllIllIlIlIlIIlIIIlIl = llllllllllllllIllIlIlIlIIIlllIlI[llllllllllllllIllIlIlIlIIIlllIII];
            llllllllllllllIllIlIlIlIIlIIIIlI.append((char)(llllllllllllllIllIlIlIlIIlIIIlIl ^ llllllllllllllIllIlIlIlIIlIIIIIl[llllllllllllllIllIlIlIlIIlIIIIII % llllllllllllllIllIlIlIlIIlIIIIIl.length]));
            0;
            ++llllllllllllllIllIlIlIlIIlIIIIII;
            ++llllllllllllllIllIlIlIlIIIlllIII;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIlIIlIIIIlI);
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

