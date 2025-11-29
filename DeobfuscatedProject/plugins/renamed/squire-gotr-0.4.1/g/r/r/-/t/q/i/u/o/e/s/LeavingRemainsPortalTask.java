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

import g.r.r.-.t.q.i.u.o.e.s.CEnum;
import g.r.r.-.t.q.i.u.o.e.s.h_Unknown;
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

/* TASK: Leaving remains portal -> LeavingremainsportalTask */
@TaskDesc(name="Leaving remains portal", priority=5, blocking=true)
public class LeavingRemainsPortalTask
extends h_Unknown {
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

    private static String llllllIlllIIIl(String var11, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), llIIllIllllI[4]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(llIIllIllllI[3], var5);
            return new String(var2.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static String llllllIlllIIlI(String var10, String var7) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(llIIllIllllI[3], var4);
            return new String(var8.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
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
        x var3;
        if (!x.llllllIlllIlIl(this.aV.g() ? 1 : 0) || x.llllllIlllIllI(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIllIllllI[1];
        }
        if (x.llllllIlllIllI(Inventory.isFull() ? 1 : 0) && x.llllllIlllIlll((Object)var3.aV.m(), (Object)c.ACTIVATING)) {
            return llIIllIllllI[1];
        }
        TileObject var12 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.llllllIlllIlIl(tileObject.getName().equals(llIIllIlllIl[llIIllIllllI[2]]) ? 1 : 0) && x.llllllIlllIlIl(tileObject.hasAction(llIIllIlllIl[llIIllIllllI[3]]::equals) ? 1 : 0)) {
                n2 = llIIllIllllI[2];
                0;
                
                }
            } else {
                n2 = llIIllIllllI[1];
            }
            return n2 != 0;
        });
        if (x.llllllIllllIII(var12)) {
            return llIIllIllllI[1];
        }
        var1_1.interact(llIIllIlllIl[llIIllIllllI[1]]);
        return llIIllIllllI[2];
    }

    private static boolean llllllIllllIII(Object object) {
        return object == null;
    }
}

