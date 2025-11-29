/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
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
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Mining huge remains", priority=6, blocking=true)
public class y
extends h {
    private static /* synthetic */ int[] llIIlllIllII;
    private static /* synthetic */ String[] llIIlllIlIlI;

    private static boolean lllllllIlIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        y lllllllllllllllIlIIlIlllIllIIlII;
        if (!y.lllllllIlIlllI(this.aV.g() ? 1 : 0) || y.lllllllIlIllll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllIllII[1];
        }
        if (y.lllllllIlIlllI(Inventory.isFull() ? 1 : 0)) {
            return llIIlllIllII[1];
        }
        int[] nArray = new int[llIIlllIllII[0]];
        nArray[y.llIIlllIllII[1]] = llIIlllIllII[2];
        TileObject lllllllllllllllIlIIlIlllIllIIIll = TileObjects.getNearest((int[])nArray);
        if (y.lllllllIllIIIl(lllllllllllllllIlIIlIlllIllIIIll)) {
            return llIIlllIllII[1];
        }
        if (y.lllllllIlIlllI(Players.getLocal().isMoving() ? 1 : 0) && y.lllllllIlIlllI(lllllllllllllllIlIIlIlllIllIIlII.b((GameObject)lllllllllllllllIlIIlIlllIllIIIll) ? 1 : 0)) {
            return llIIlllIllII[0];
        }
        if (y.lllllllIllIIlI(lllllllllllllllIlIIlIlllIllIIlII.aV.o(), llIIlllIllII[3]) && y.lllllllIlIlllI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIIlllIllII[0];
        }
        var1_1.interact(llIIlllIlIlI[llIIlllIllII[1]]);
        return llIIlllIllII[0];
    }

    private static void lllllllIlIlIll() {
        llIIlllIlIlI = new String[llIIlllIllII[0]];
        y.llIIlllIlIlI[y.llIIlllIllII[1]] = y."Mine";
    }

    private static String lllllllIlIlIIl(String lllllllllllllllIlIIlIlllIlIllIll, String lllllllllllllllIlIIlIlllIlIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllIlIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllIlIlllIl.init(llIIlllIllII[3], lllllllllllllllIlIIlIlllIlIllllI);
            return new String(lllllllllllllllIlIIlIlllIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlllIlIlllII) {
            lllllllllllllllIlIIlIlllIlIlllII.printStackTrace();
            return null;
        }
    }

    @Inject
    public y(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIllII[0]];
        cArray[y.llIIlllIllII[1]] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lllllllIllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        y.lllllllIlIllIl();
        y.lllllllIlIlIll();
    }

    private static void lllllllIlIllIl() {
        llIIlllIllII = new int[4];
        y.llIIlllIllII[0] = 1;
        y.llIIlllIllII[1] = (0x82 ^ 0xB1) & ~(0x64 ^ 0x57);
        y.llIIlllIllII[2] = -(0xFFFFEF67 & 0x15BD) & (0xFFFFFFFD & 0xAFEE);
        y.llIIlllIllII[3] = 2;
    }

    private static boolean lllllllIllIIIl(Object object) {
        return object == null;
    }

    private static boolean lllllllIlIllll(int n2) {
        return n2 == 0;
    }
}

