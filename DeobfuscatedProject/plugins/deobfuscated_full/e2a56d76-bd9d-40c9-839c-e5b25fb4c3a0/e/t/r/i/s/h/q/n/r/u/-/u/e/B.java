/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.f;
import e.t.r.i.s.h.q.n.r.u.-.u.e.g;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Resetting bird snare -> ResettingbirdsnareTask */
@TaskDesc(name="Resetting bird snare", priority=15, blocking=true)
public class B
extends j {
    private static /* synthetic */ int[] llllIIIIlIlI;
    private static /* synthetic */ String[] llllIIIIlIIl;

    private static boolean lIIIlllIlIlIlll(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public B(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }

    private static boolean lIIIlllIlIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var3_3;
        void var1;
        Map<WorldPoint, f> map = this.y().h();
        if (!B.lIIIlllIlIlIlIl(map.isEmpty() ? 1 : 0) || !B.lIIIlllIlIlIlIl(Players.getLocal().isAnimating() ? 1 : 0) || B.lIIIlllIlIlIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llllIIIIlIlI[0];
        }
        f var9 = null;
        TileObject var4 = var1.keySet().iterator();
        while (B.lIIIlllIlIlIllI(var4.hasNext() ? 1 : 0)) {
            WorldPoint var8 = (WorldPoint)var4.next();
            f var3 = (f)var1.get(var8);
            if (B.lIIIlllIlIlIlll((Object)var3.q(), (Object)g.EMPTY)) {
                var9 = var3;
            }
            0;
            if (3 >= 3) continue;
            return ((0x54 ^ 1 ^ (0xA8 ^ 0xB0)) & (0x6C ^ 0x49 ^ (0x1A ^ 0x72) ^ -1)) != 0;
        }
        if (B.lIIIlllIlIllIII(var9)) {
            return llllIIIIlIlI[0];
        }
        int[] nArray = new int[llllIIIIlIlI[1]];
        nArray[B.llllIIIIlIlI[0]] = llllIIIIlIlI[2];
        var4 = TileObjects.getNearest((int[])nArray);
        if (B.lIIIlllIlIllIII(var4)) {
            return llllIIIIlIlI[0];
        }
        var3_3.interact(llllIIIIlIIl[llllIIIIlIlI[0]]);
        return llllIIIIlIlI[1];
    }

    private static void lIIIlllIlIlIlII() {
        llllIIIIlIlI = new int[4];
        B.llllIIIIlIlI[0] = (0x50 ^ 0x6C) & ~(0xA7 ^ 0x9B);
        B.llllIIIIlIlI[1] = 1;
        B.llllIIIIlIlI[2] = 0xFFFFBCFF & 0x6780;
        B.llllIIIIlIlI[3] = 2;
    }

    private static boolean lIIIlllIlIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIlIllIII(Object object) {
        return object == null;
    }

    static {
        B.lIIIlllIlIlIlII();
        B.lIIIlllIlIlIIll();
    }

    private static void lIIIlllIlIlIIll() {
        llllIIIIlIIl = new String[llllIIIIlIlI[1]];
        B.llllIIIIlIIl[B.llllIIIIlIlI[0]] = B."Dismantle";
    }

    private static String lIIIlllIlIlIIlI(String var7, String var2) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llllIIIIlIlI[3], var5);
            return new String(var10.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }
}

