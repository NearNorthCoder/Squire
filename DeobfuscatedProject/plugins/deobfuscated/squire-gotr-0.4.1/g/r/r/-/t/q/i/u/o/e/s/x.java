/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Leaving remains portal", priority=5, blocking=true)
public class x
extends h {
    private static /* synthetic */ String[] llIIllIlllIl;
    private static /* synthetic */ int[] llIIllIllllI;

    private static void llllllIlllIlII() {
        llIIllIllllI = new int[5];
        x.llIIllIllllI[0] = 3;
        x.llIIllIllllI[1] = (0x96 ^ 0x9B) & ~(0x33 ^ 0x3E);
        x.llIIllIllllI[2] = 1;
        x.llIIllIllllI[3] = 2;
        x.llIIllIllllI[4] = 0x8B ^ 0x83;
    }

    static {
        x.llllllIlllIlII();
        x.llllllIlllIIll();
    }

    private static boolean llllllIlllIlIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public x(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllIllllI[0]];
        cArray[x.llIIllIllllI[1]] = c.ACTIVE;
        cArray[x.llIIllIllllI[2]] = c.FINISHING;
        cArray[x.llIIllIllllI[3]] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }

    private static void llllllIlllIIll() {
        llIIllIlllIl = new String[llIIllIllllI[0]];
        x.llIIllIlllIl[x.llIIllIllllI[1]] = x."Enter";
        x.llIIllIlllIl[x.llIIllIllllI[2]] = x."Portal";
        x.llIIllIlllIl[x.llIIllIllllI[3]] = x."Enter";
    }

    private static String llllllIlllIIIl(String lllllllllllllllIlIIllIIIlIlIlIll, String lllllllllllllllIlIIllIIIlIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIlIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), llIIllIllllI[4]), "DES");
            Cipher lllllllllllllllIlIIllIIIlIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIIlIlIllIl.init(llIIllIllllI[3], lllllllllllllllIlIIllIIIlIlIlllI);
            return new String(lllllllllllllllIlIIllIIIlIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIIlIlIllII) {
            lllllllllllllllIlIIllIIIlIlIllII.printStackTrace();
            return null;
        }
    }

    private static String llllllIlllIIlI(String lllllllllllllllIlIIllIIIlIIlllII, String lllllllllllllllIlIIllIIIlIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIIlIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllIIIlIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllIIIlIlIIIII.init(llIIllIllllI[3], lllllllllllllllIlIIllIIIlIlIIIIl);
            return new String(lllllllllllllllIlIIllIIIlIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllIIIlIIlllll) {
            lllllllllllllllIlIIllIIIlIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIlllIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllllIlllIllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        x lllllllllllllllIlIIllIIIlIllIllI;
        if (!x.llllllIlllIlIl(this.aV.g() ? 1 : 0) || x.llllllIlllIllI(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIllIllllI[1];
        }
        if (x.llllllIlllIllI(Inventory.isFull() ? 1 : 0) && x.llllllIlllIlll((Object)lllllllllllllllIlIIllIIIlIllIllI.aV.m(), (Object)c.ACTIVATING)) {
            return llIIllIllllI[1];
        }
        TileObject lllllllllllllllIlIIllIIIlIllIlIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.llllllIlllIlIl(tileObject.getName().equals(llIIllIlllIl[llIIllIllllI[2]]) ? 1 : 0) && x.llllllIlllIlIl(tileObject.hasAction(llIIllIlllIl[llIIllIllllI[3]]::equals) ? 1 : 0)) {
                n2 = llIIllIllllI[2];
                0;
                if (null != null) {
                    return ((138 + 178 - 130 + 8 ^ 45 + 124 - 109 + 81) & (128 + 223 - 345 + 228 ^ 51 + 66 - -44 + 4 ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIllllI[1];
            }
            return n2 != 0;
        });
        if (x.llllllIllllIII(lllllllllllllllIlIIllIIIlIllIlIl)) {
            return llIIllIllllI[1];
        }
        var1_1.interact(llIIllIlllIl[llIIllIllllI[1]]);
        return llIIllIllllI[2];
    }

    private static boolean llllllIllllIII(Object object) {
        return object == null;
    }
}

