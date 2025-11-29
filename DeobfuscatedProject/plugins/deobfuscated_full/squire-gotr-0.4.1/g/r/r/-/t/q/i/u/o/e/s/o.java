/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
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
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Mining extra fragments -> MiningextrafragmentsTask */
@TaskDesc(name="Mining extra fragments", priority=1)
public class o
extends h {
    private static /* synthetic */ String[] llIIllllIIlI;
    private static /* synthetic */ int[] llIIllllIIll;

    private static void llllllllIIIllI() {
        llIIllllIIll = new int[5];
        o.llIIllllIIll[0] = 1;
        o.llIIllllIIll[1] = (0x5E ^ 0x66) & ~(0x71 ^ 0x49);
        o.llIIllllIIll[2] = -(0xFFFFD597 & 0x3B7D) & (0xFFFFBFFE & 0xFBFF);
        o.llIIllllIIll[3] = 0xFFFFEEC5 & 0xBBFF;
        o.llIIllllIIll[4] = 2;
    }

    @Override
    protected boolean ak() {
        WorldPoint worldPoint;
        o var6;
        if (!o.llllllllIIIlll(Inventory.isFull() ? 1 : 0) || !o.llllllllIIlIII(this.aV.g() ? 1 : 0) || !o.llllllllIIIlll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0) || o.llllllllIIlIII(SquireGOTRPlugin.h.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIllllIIll[1];
        }
        if (o.llllllllIIIlll(var6.aV.c() ? 1 : 0)) {
            return llIIllllIIll[1];
        }
        int[] nArray = new int[llIIllllIIll[0]];
        nArray[o.llIIllllIIll[1]] = llIIllllIIll[2];
        TileObject var5 = TileObjects.getNearest((int[])nArray);
        if (o.llllllllIIlIIl(var5)) {
            worldPoint = Players.getLocal().getWorldLocation();
            0;
            if (-3 > 0) {
                return (2 & ~2) != 0;
            }
        } else {
            worldPoint = var5.getWorldLocation();
        }
        int[] nArray2 = new int[llIIllllIIll[0]];
        nArray2[o.llIIllllIIll[1]] = llIIllllIIll[3];
        TileObject var4 = TileObjects.getNearest((WorldPoint)worldPoint, (int[])nArray2);
        if (o.llllllllIIlIIl(var4)) {
            return llIIllllIIll[1];
        }
        Player var8 = Players.getLocal();
        if (o.llllllllIIlIII(var8.isAnimating() ? 1 : 0)) {
            return llIIllllIIll[0];
        }
        if (o.llllllllIIIlll(var6.b((GameObject)var4) ? 1 : 0)) {
            var4.interact(llIIllllIIlI[llIIllllIIll[1]]);
            var6.sleep(llIIllllIIll[4]);
        }
        return llIIllllIIll[0];
    }

    private static boolean llllllllIIIlll(int n2) {
        return n2 == 0;
    }

    static {
        o.llllllllIIIllI();
        o.llllllllIIIlIl();
    }

    private static String llllllllIIIlII(String var2, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llIIllllIIll[4], var9);
            return new String(var7.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void llllllllIIIlIl() {
        llIIllllIIlI = new String[llIIllllIIll[0]];
        o.llIIllllIIlI[o.llIIllllIIll[1]] = o."Mine";
    }

    private static boolean llllllllIIlIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public o(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllllIIll[0]];
        cArray[o.llIIllllIIll[1]] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean llllllllIIlIIl(Object object) {
        return object == null;
    }
}

