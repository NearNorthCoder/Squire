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
 */
package g.r.r.-.t.q.i.u.o.e.s;

import com.google.inject.Inject;
import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.e;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Emptying pouches", priority=20)
public class A
extends h {
    private static /* synthetic */ String[] llIlIIIIIIll;
    private static /* synthetic */ int[] llIlIIIIIlIl;

    @Override
    protected boolean aj() {
        return llIlIIIIIlIl[2];
    }

    private static boolean lIIIIIIIIIlIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIIIlIlll(int n2) {
        return n2 == 0;
    }

    private static void lIIIIIIIIIlIIlI() {
        llIlIIIIIIll = new String[llIlIIIIIlIl[4]];
        A.llIlIIIIIIll[A.llIlIIIIIlIl[1]] = A.lIIIIIIIIIIlIII("I5nrNuIFq6Y=", "ReyMH");
        A.llIlIIIIIIll[A.llIlIIIIIlIl[2]] = A.lIIIIIIIIIIlIII("jq5aKhTicgc=", "zshCs");
        A.llIlIIIIIIll[A.llIlIIIIIlIl[0]] = A.lIIIIIIIIIIlIII("VIPCMBBO4dE=", "TuEOV");
    }

    private static void lIIIIIIIIIlIIll() {
        llIlIIIIIlIl = new int[5];
        A.llIlIIIIIlIl[0] = "  ".length();
        A.llIlIIIIIlIl[1] = (0x99 ^ 0xB4) & ~(0x3E ^ 0x13) & ~((0x32 ^ 5) & ~(0x6E ^ 0x59));
        A.llIlIIIIIlIl[2] = " ".length();
        A.llIlIIIIIlIl[3] = 0xC ^ 9;
        A.llIlIIIIIlIl[4] = "   ".length();
    }

    private static boolean lIIIIIIIIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIIIIIIIIlIII(String lllllllllllllllIlIIlIlIlIIIIlIlI, String lllllllllllllllIlIIlIlIlIIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlIlIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlIlIIIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlIlIIIIllII.init(llIlIIIIIlIl[0], lllllllllllllllIlIIlIlIlIIIIllIl);
            return new String(lllllllllllllllIlIIlIlIlIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlIlIIIIlIll) {
            lllllllllllllllIlIIlIlIlIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIIlIllI(Object object) {
        return object == null;
    }

    static {
        A.lIIIIIIIIIlIIll();
        A.lIIIIIIIIIlIIlI();
    }

    private static boolean lIIIIIIIIIllIII(int n2) {
        return n2 > 0;
    }

    @Override
    protected boolean ak() {
        boolean bl;
        if (A.lIIIIIIIIIlIlII(this.aV.g() ? 1 : 0)) {
            return llIlIIIIIlIl[1];
        }
        if (A.lIIIIIIIIIlIlIl(Inventory.getFreeSlots(), llIlIIIIIlIl[3])) {
            return llIlIIIIIlIl[1];
        }
        String[] stringArray = new String[llIlIIIIIlIl[2]];
        stringArray[A.llIlIIIIIlIl[1]] = llIlIIIIIIll[llIlIIIIIlIl[1]];
        TileObject lllllllllllllllIlIIlIlIlIIIllIII = TileObjects.getNearest((String[])stringArray);
        if (A.lIIIIIIIIIlIllI(lllllllllllllllIlIIlIlIlIIIllIII)) {
            return llIlIIIIIlIl[1];
        }
        int lllllllllllllllIlIIlIlIlIIIlIlll = llIlIIIIIlIl[1];
        int lllllllllllllllIlIIlIlIlIIIlIllI = llIlIIIIIlIl[0];
        Iterator lllllllllllllllIlIIlIlIlIIIlIlIl = Inventory.getAll(item -> item.getName().endsWith(llIlIIIIIIll[llIlIIIIIlIl[0]])).iterator();
        while (A.lIIIIIIIIIlIlII(lllllllllllllllIlIIlIlIlIIIlIlIl.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIlIIlIlIlIIIlIlII = (Item)lllllllllllllllIlIIlIlIlIIIlIlIl.next();
            e lllllllllllllllIlIIlIlIlIIIlIIll = e.c(lllllllllllllllIlIIlIlIlIIIlIlII.getId());
            if (A.lIIIIIIIIIlIllI((Object)lllllllllllllllIlIIlIlIlIIIlIIll)) {
                "".length();
                if ("  ".length() <= "   ".length()) continue;
                return ("  ".length() & ~"  ".length()) != 0;
            }
            if (A.lIIIIIIIIIlIlll(lllllllllllllllIlIIlIlIlIIIlIllI)) {
                "".length();
                if ((0x77 ^ 0x72) != 0) break;
                return (" ".length() & ~" ".length()) != 0;
            }
            if (A.lIIIIIIIIIllIII(lllllllllllllllIlIIlIlIlIIIlIIll.ae())) {
                A lllllllllllllllIlIIlIlIlIIIllIIl;
                int lllllllllllllllIlIIlIlIlIIIlIIlI = Math.min(Inventory.getFreeSlots() - lllllllllllllllIlIIlIlIlIIIlIlll, lllllllllllllllIlIIlIlIlIIIlIIll.ae());
                if (A.lIIIIIIIIIllIIl(lllllllllllllllIlIIlIlIlIIIlIIlI)) {
                    "".length();
                    if (null == null) break;
                    return ((0x66 ^ 0x52) & ~(0x28 ^ 0x1C)) != 0;
                }
                lllllllllllllllIlIIlIlIlIIIlIlII.interact(llIlIIIIIIll[llIlIIIIIlIl[2]]);
                lllllllllllllllIlIIlIlIlIIIlIIll.d(-lllllllllllllllIlIIlIlIlIIIlIIlI);
                lllllllllllllllIlIIlIlIlIIIlIlll += lllllllllllllllIlIIlIlIlIIIlIIlI;
                --lllllllllllllllIlIIlIlIlIIIlIllI;
                lllllllllllllllIlIIlIlIlIIIllIIl.aV.r();
            }
            "".length();
            if ("   ".length() >= ((0x26 ^ 0x39) & ~(0x7D ^ 0x62))) continue;
            return ((0xE9 ^ 0xC1) & ~(0x8A ^ 0xA2)) != 0;
        }
        if (A.lIIIIIIIIIllIII(lllllllllllllllIlIIlIlIlIIIlIlll)) {
            bl = llIlIIIIIlIl[2];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x5E ^ 0x6D ^ (0x55 ^ 4)) & (214 + 179 - 214 + 69 ^ 66 + 84 - 132 + 136 ^ -" ".length())) != 0;
            }
        } else {
            bl = llIlIIIIIlIl[1];
        }
        return bl;
    }

    private static boolean lIIIIIIIIIllIIl(int n2) {
        return n2 < 0;
    }

    @Inject
    public A(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIlIIIIIlIl[0]];
        cArray[A.llIlIIIIIlIl[1]] = c.ACTIVE;
        cArray[A.llIlIIIIIlIl[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }
}

