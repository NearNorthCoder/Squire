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

/* TASK: Emptying pouches -> EmptyingpouchesTask */
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
        A.llIlIIIIIIll[A.llIlIIIIIlIl[1]] = A."Altar";
        A.llIlIIIIIIll[A.llIlIIIIIlIl[2]] = A."Empty";
        A.llIlIIIIIIll[A.llIlIIIIIlIl[0]] = A."pouch";
    }

    private static void lIIIIIIIIIlIIll() {
        llIlIIIIIlIl = new int[5];
        A.llIlIIIIIlIl[0] = 2;
        A.llIlIIIIIlIl[1] = (0x99 ^ 0xB4) & ~(0x3E ^ 0x13) & ~((0x32 ^ 5) & ~(0x6E ^ 0x59));
        A.llIlIIIIIlIl[2] = 1;
        A.llIlIIIIIlIl[3] = 0xC ^ 9;
        A.llIlIIIIIlIl[4] = 3;
    }

    private static boolean lIIIIIIIIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIIIIIIIIIlIII(String var4, String var10) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llIlIIIIIlIl[0], var6);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
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
        TileObject var11 = TileObjects.getNearest((String[])stringArray);
        if (A.lIIIIIIIIIlIllI(var11)) {
            return llIlIIIIIlIl[1];
        }
        int var2 = llIlIIIIIlIl[1];
        int var8 = llIlIIIIIlIl[0];
        Iterator var3 = Inventory.getAll(item -> item.getName().endsWith(llIlIIIIIIll[llIlIIIIIlIl[0]])).iterator();
        while (A.lIIIIIIIIIlIlII(var3.hasNext() ? 1 : 0)) {
            Item var13 = (Item)var3.next();
            e var9 = e.c(var13.getId());
            if (A.lIIIIIIIIIlIllI((Object)var9)) {
                0;
                if (2 <= 3) continue;
                return (2 & ~2) != 0;
            }
            if (A.lIIIIIIIIIlIlll(var8)) {
                0;
                if ((0x77 ^ 0x72) != 0) break;
                return (1 & ~1) != 0;
            }
            if (A.lIIIIIIIIIllIII(var9.ae())) {
                A var12;
                int var7 = Math.min(Inventory.getFreeSlots() - var2, var9.ae());
                if (A.lIIIIIIIIIllIIl(var7)) {
                    0;
                    if (null == null) break;
                    return false;
                }
                var13.interact(llIlIIIIIIll[llIlIIIIIlIl[2]]);
                var9.d(-var7);
                var2 += var7;
                --var8;
                var12.aV.r();
            }
            0;
            if (3 >= ((0x26 ^ 0x39) & ~(0x7D ^ 0x62))) continue;
            return false;
        }
        if (A.lIIIIIIIIIllIII(var2)) {
            bl = llIlIIIIIlIl[2];
            0;
            if (-1 != -1) {
                return ((0x5E ^ 0x6D ^ (0x55 ^ 4)) & (214 + 179 - 214 + 69 ^ 66 + 84 - 132 + 136 ^ -1)) != 0;
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

