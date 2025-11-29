/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class x
implements o {
    private static /* synthetic */ int ah;
    private static /* synthetic */ String[] lIlIIIllIlIII;
    private static /* synthetic */ int[] lIlIIIllIlIIl;

    private static boolean lIlllIIIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static String lIlllIIIIlIIlIl(String var2, String var1) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlIIIllIlIIl[4], var5);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIlIlIll(int n2) {
        return n2 != 0;
    }

    static {
        x.lIlllIIIIlIIlll();
        x.lIlllIIIIlIIllI();
    }

    private static boolean lIlllIIIIlIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIIIIlIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlllIIIIlIIlll() {
        lIlIIIllIlIIl = new int[5];
        x.lIlIIIllIlIIl[0] = (0x76 ^ 0xE ^ (0x55 ^ 0x77)) & (0x53 ^ 0x48 ^ (0xF0 ^ 0xB1) ^ -1);
        x.lIlIIIllIlIIl[1] = 1;
        x.lIlIIIllIlIIl[2] = -1;
        x.lIlIIIllIlIIl[3] = 2 ^ 6;
        x.lIlIIIllIlIIl[4] = 2;
    }

    @Override
    public boolean D() {
        if (x.lIlllIIIIlIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIIllIlIIl[0];
        }
        if (x.lIlllIIIIlIlIIl(ah, lIlIIIllIlIIl[1])) {
            ah -= lIlIIIllIlIIl[1];
            return lIlIIIllIlIIl[0];
        }
        if (x.lIlllIIIIlIlIlI(Players.getLocal().getAnimation(), lIlIIIllIlIIl[2])) {
            return lIlIIIllIlIIl[0];
        }
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lIlllIIIIlIlIll(tileObject.getWorldLocation().equals((Object)Static.getClient().getHintArrowPoint()) ? 1 : 0) && x.lIlllIIIIlIlIII(tileObject.getName().equals(lIlIIIllIlIII[lIlIIIllIlIIl[0]]) ? 1 : 0)) {
                n2 = lIlIIIllIlIIl[1];
                0;
                if (2 <= -1) {
                    return false;
                }
            } else {
                n2 = lIlIIIllIlIIl[0];
            }
            return n2 != 0;
        });
        tileObject2.interact(lIlIIIllIlIIl[0]);
        ah = M.a(lIlIIIllIlIIl[1], lIlIIIllIlIIl[3]);
        return lIlIIIllIlIIl[1];
    }

    private static void lIlllIIIIlIIllI() {
        lIlIIIllIlIII = new String[lIlIIIllIlIIl[1]];
        x.lIlIIIllIlIII[x.lIlIIIllIlIIl[0]] = x."null";
    }
}

