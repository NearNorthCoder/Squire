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
        Item lllllllllllllllIlIllIlllIllIllII = Inventory.getFirst(item -> item.hasAction(lIlllIIlIIIl[lIlllIIlIIll[3]]::equals));
        if (bd.lllIlIllIllIlI(lllllllllllllllIlIllIlllIllIllII)) {
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
        void lllllllllllllllIlIllIlllIlllIIlI;
        int n2 = lIlllIIlIIll[0];
        Iterator lllllllllllllllIlIllIlllIlllIIIl = Inventory.getAll(predicate).iterator();
        while (bd.lllIlIllIlIlll(lllllllllllllllIlIllIlllIlllIIIl.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIlIllIlllIlllIIII = (Item)lllllllllllllllIlIllIlllIlllIIIl.next();
            lllllllllllllllIlIllIlllIlllIIII.interact(lIlllIIlIIIl[lIlllIIlIIll[1]]);
            if (bd.lllIlIllIllIII((int)(--lllllllllllllllIlIllIlllIlllIIlI))) {
                return lIlllIIlIIll[2];
            }
            0;
            if (-(0xFC ^ 0xAF ^ (0x4D ^ 0x1B)) < 0) continue;
            return ((0x2D ^ 0x1B ^ (0xDA ^ 0xAF)) & (0x2A ^ 0x31 ^ (0x5A ^ 2) ^ -1)) != 0;
        }
        if (bd.lllIlIllIllIIl((int)lllllllllllllllIlIllIlllIlllIIlI, lIlllIIlIIll[0])) {
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

    private static String lllIlIllIIlIlI(String lllllllllllllllIlIllIlllIlIlllII, String lllllllllllllllIlIllIlllIlIllIll) {
        lllllllllllllllIlIllIlllIlIlllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlllIlIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIlllIlIlllll = new StringBuilder();
        char[] lllllllllllllllIlIllIlllIlIllllI = lllllllllllllllIlIllIlllIlIllIll.toCharArray();
        int lllllllllllllllIlIllIlllIlIlllIl = lIlllIIlIIll[1];
        char[] lllllllllllllllIlIllIlllIlIlIlll = lllllllllllllllIlIllIlllIlIlllII.toCharArray();
        int lllllllllllllllIlIllIlllIlIlIllI = lllllllllllllllIlIllIlllIlIlIlll.length;
        int lllllllllllllllIlIllIlllIlIlIlIl = lIlllIIlIIll[1];
        while (bd.lllIlIllIllIIl(lllllllllllllllIlIllIlllIlIlIlIl, lllllllllllllllIlIllIlllIlIlIllI)) {
            char lllllllllllllllIlIllIlllIllIIIlI = lllllllllllllllIlIllIlllIlIlIlll[lllllllllllllllIlIllIlllIlIlIlIl];
            lllllllllllllllIlIllIlllIlIlllll.append((char)(lllllllllllllllIlIllIlllIllIIIlI ^ lllllllllllllllIlIllIlllIlIllllI[lllllllllllllllIlIllIlllIlIlllIl % lllllllllllllllIlIllIlllIlIllllI.length]));
            0;
            ++lllllllllllllllIlIllIlllIlIlllIl;
            ++lllllllllllllllIlIllIlllIlIlIlIl;
            0;
            if ((0x79 ^ 0x7C) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIlllIlIlllll);
    }

    private static boolean lllIlIllIlIlll(int n2) {
        return n2 != 0;
    }

    private static String lllIlIllIIlIll(String lllllllllllllllIlIllIlllIlIIlIlI, String lllllllllllllllIlIllIlllIlIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIllIlllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIlllIlIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIlllIlIIlllI.init(lIlllIIlIIll[3], lllllllllllllllIlIllIlllIlIIllll);
            return new String(lllllllllllllllIlIllIlllIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIlllIlIIllIl) {
            lllllllllllllllIlIllIlllIlIIllIl.printStackTrace();
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

