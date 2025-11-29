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
        u lllllllllllllllIIllIlIIllIIlllII;
        i lllllllllllllllIIllIlIIllIIllIll;
        String[] stringArray = new String[lllIlIllllIl[1]];
        stringArray[u.lllIlIllllIl[0]] = lllIlIlllIll[lllIlIllllIl[1]];
        if (u.lIIIllIIlIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lllIlIllllIl[1]];
            stringArray2[u.lllIlIllllIl[0]] = lllIlIlllIll[lllIlIllllIl[2]];
            Inventory.dropAll((String[])stringArray2);
            "".length();
        }
        if (u.lIIIllIIlIllIII((Object)(lllllllllllllllIIllIlIIllIIllIll = (i)Stream.of(i.values()).filter(i::z).findFirst().orElse(null)))) {
            return lllIlIllllIl[0];
        }
        if (u.lIIIllIIlIlIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIlIlllIll[lllIlIllllIl[4]])) ? 1 : 0)) {
            Magic.cast((Spell)lllllllllllllllIIllIlIIllIIlllII.L(), (Item)Inventory.getFirst(item -> item.getName().toLowerCase().contains(lllIlIlllIll[lllIlIllllIl[3]])));
            return lllIlIllllIl[1];
        }
        String[] stringArray3 = new String[lllIlIllllIl[1]];
        stringArray3[u.lllIlIllllIl[0]] = lllllllllllllllIIllIlIIllIIllIll.v();
        if (u.lIIIllIIlIlIlll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
            String[] stringArray4 = new String[lllIlIllllIl[1]];
            stringArray4[u.lllIlIllllIl[0]] = lllllllllllllllIIllIlIIllIIllIll.v();
            Magic.cast((Spell)lllllllllllllllIIllIlIIllIIlllII.L(), (Item)Inventory.getFirst((String[])stringArray4));
            return lllIlIllllIl[1];
        }
        String[] stringArray5 = new String[lllIlIllllIl[1]];
        stringArray5[u.lllIlIllllIl[0]] = lllllllllllllllIIllIlIIllIIllIll.y();
        TileObject lllllllllllllllIIllIlIIllIIllIlI = TileObjects.getNearest((String[])stringArray5);
        if (u.lIIIllIIlIllIII(lllllllllllllllIIllIlIIllIIllIlI)) {
            return lllIlIllllIl[0];
        }
        var2_2.interact(lllIlIllllIl[0]);
        return lllIlIllllIl[1];
    }

    private static String lIIIllIIlIlIIII(String lllllllllllllllIIllIlIIlIllllIII, String lllllllllllllllIIllIlIIlIllllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIlIlllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIlIlllllII.init(lllIlIllllIl[2], lllllllllllllllIIllIlIIlIlllllIl);
            return new String(lllllllllllllllIIllIlIIlIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlIllllIll) {
            lllllllllllllllIIllIlIIlIllllIll.printStackTrace();
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
        u.lllIlIllllIl[1] = " ".length();
        u.lllIlIllllIl[2] = "  ".length();
        u.lllIlIllllIl[3] = "   ".length();
        u.lllIlIllllIl[4] = 0x2D ^ 0x7B ^ (0xE1 ^ 0xB3);
        u.lllIlIllllIl[5] = 0x88 ^ 0x8D;
        u.lllIlIllllIl[6] = 0xB7 ^ 0xA7 ^ (0x2E ^ 0x36);
    }

    private static String lIIIllIIlIlIIIl(String lllllllllllllllIIllIlIIlIllIllIl, String lllllllllllllllIIllIlIIlIllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), lllIlIllllIl[6]), "DES");
            Cipher lllllllllllllllIIllIlIIlIllIllll = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIlIllIllll.init(lllIlIllllIl[2], lllllllllllllllIIllIlIIlIlllIIII);
            return new String(lllllllllllllllIIllIlIIlIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIlIllIlllI) {
            lllllllllllllllIIllIlIIlIllIlllI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean a(Item item) {
        int n2;
        if (u.lIIIllIIlIlIlll(item.getName().toLowerCase().contains(lllIlIlllIll[lllIlIllllIl[0]]) ? 1 : 0) && u.lIIIllIIlIlIlll(Stream.of(this.j.maximumEnchant().t().getRuneNames()).anyMatch(string -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            n2 = lllIlIllllIl[1];
            "".length();
            if ("  ".length() == 0) {
                return ((0x6E ^ 0x4A) & ~(0xA5 ^ 0x81)) != 0;
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
        u.lllIlIlllIll[u.lllIlIllllIl[0]] = u.lIIIllIIlIlIIII("OCvxCOXux0U=", "jRqoW");
        u.lllIlIlllIll[u.lllIlIllllIl[1]] = u.lIIIllIIlIlIIII("s7PtnEh4Oks=", "KMCsz");
        u.lllIlIlllIll[u.lllIlIllllIl[2]] = u.lIIIllIIlIlIIIl("h7OTCO0hbAk=", "JwvHL");
        u.lllIlIlllIll[u.lllIlIllllIl[3]] = u.lIIIllIIlIlIIIl("YMKcy2S5qyh4qcyLekP8qw==", "HIrRq");
        u.lllIlIlllIll[u.lllIlIllllIl[4]] = u.lIIIllIIlIlIIlI("MgUbFzw4BA4fPTM=", "VwzpS");
    }

    private static boolean lIIIllIIlIllIII(Object object) {
        return object == null;
    }

    private static String lIIIllIIlIlIIlI(String lllllllllllllllIIllIlIIllIIIllll, String lllllllllllllllIIllIlIIllIIIlllI) {
        lllllllllllllllIIllIlIIllIIIllll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIllIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIllIIIllIl = new StringBuilder();
        char[] lllllllllllllllIIllIlIIllIIIllII = lllllllllllllllIIllIlIIllIIIlllI.toCharArray();
        int lllllllllllllllIIllIlIIllIIIlIll = lllIlIllllIl[0];
        char[] lllllllllllllllIIllIlIIllIIIIlIl = lllllllllllllllIIllIlIIllIIIllll.toCharArray();
        int lllllllllllllllIIllIlIIllIIIIlII = lllllllllllllllIIllIlIIllIIIIlIl.length;
        int lllllllllllllllIIllIlIIllIIIIIll = lllIlIllllIl[0];
        while (u.lIIIllIIlIllIIl(lllllllllllllllIIllIlIIllIIIIIll, lllllllllllllllIIllIlIIllIIIIlII)) {
            char lllllllllllllllIIllIlIIllIIlIIII = lllllllllllllllIIllIlIIllIIIIlIl[lllllllllllllllIIllIlIIllIIIIIll];
            lllllllllllllllIIllIlIIllIIIllIl.append((char)(lllllllllllllllIIllIlIIllIIlIIII ^ lllllllllllllllIIllIlIIllIIIllII[lllllllllllllllIIllIlIIllIIIlIll % lllllllllllllllIIllIlIIllIIIllII.length]));
            "".length();
            ++lllllllllllllllIIllIlIIllIIIlIll;
            ++lllllllllllllllIIllIlIIllIIIIIll;
            "".length();
            if ("  ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIllIIIllIl);
    }
}

