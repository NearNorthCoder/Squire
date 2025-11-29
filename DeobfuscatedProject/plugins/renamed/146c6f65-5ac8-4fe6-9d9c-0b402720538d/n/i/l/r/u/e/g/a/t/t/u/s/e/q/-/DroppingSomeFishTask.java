/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.HerbType;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;

/* TASK: Dropping some fish -> DroppingsomefishTask */
@TaskDesc(name="Dropping some fish", blocking=true, priority=10)
public class DroppingSomeFishTask
extends n_Unknown {
    private static /* synthetic */ String[] llIIllIlllll;
    private static /* synthetic */ int[] llIIlllIIIII;

    private static boolean lllllllIlIlIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var3;
        D var5;
        Player player = Players.getLocal();
        if (!D.lllllllIlIIlll(this.ba.A() ? 1 : 0) || !D.lllllllIlIIlll(this.ba.V().av().e(player.getWorldLocation()) ? 1 : 0) || D.lllllllIlIIlll(player.isMoving() ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        if (D.lllllllIlIlIII(var5.ba.V().av().e(var3.getWorldLocation()) ? 1 : 0)) {
            var5.ba.a((l)var5.ba.V().av(), var3.getWorldLocation());
            0;
            return llIIlllIIIII[2];
        }
        List<Item> var6 = var5.ba.b(i.FISH);
        if (D.lllllllIlIIlll(var6.isEmpty() ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        h var11 = var5.ba.V();
        int lllllllllllllllIlIIlIlIIIIIIIIll = llIIlllIIIII[3];
        int var12 = llIIlllIIIII[1];
        Iterator<Item> var7 = var6.iterator();
        while (D.lllllllIlIIlll(var7.hasNext() ? 1 : 0)) {
            Item var2 = var7.next();
            if (D.lllllllIlIlIIl(++var12, llIIlllIIIII[3])) {
                return llIIlllIIIII[2];
            }
            var2.interact(llIIllIlllll[llIIlllIIIII[1]]);
            var11.av().k(llIIlllIIIII[2]);
            0;
            if (((184 + 154 - 223 + 85 ^ 139 + 15 - 27 + 28) & (0x6D ^ 0x3C ^ 2 ^ -1)) == 0) continue;
            return ((0x2E ^ 0x21 ^ (0x97 ^ 0x93)) & (0x63 ^ 0x48 ^ (0x60 ^ 0x40) ^ -1)) != 0;
        }
        return llIIlllIIIII[1];
    }

    @Inject
    public D(c c2) {
        d[] dArray = new d[llIIlllIIIII[0]];
        dArray[D.llIIlllIIIII[1]] = d.FIRST_ROTATION_CREATE;
        dArray[D.llIIlllIIIII[2]] = d.CREATING_T3_STAFF;
        super(c2, dArray);
    }

    private static boolean lllllllIlIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllllllIlIIlIl() {
        llIIllIlllll = new String[llIIlllIIIII[2]];
        D.llIIllIlllll[D.llIIlllIIIII[1]] = D."Drop";
    }

    private static void lllllllIlIIllI() {
        llIIlllIIIII = new int[4];
        D.llIIlllIIIII[0] = 2;
        D.llIIlllIIIII[1] = (0xF ^ 0x10 ^ (0x2D ^ 0x7D)) & (66 + 208 - 246 + 200 ^ 122 + 160 - 176 + 65 ^ -1);
        D.llIIlllIIIII[2] = 1;
        D.llIIlllIIIII[3] = 0x31 ^ 0x37;
    }

    static {
        D.lllllllIlIIllI();
        D.lllllllIlIIlIl();
    }

    private static boolean lllllllIlIIlll(int n2) {
        return n2 != 0;
    }

    private static String lllllllIlIIlII(String var9, String var1) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIIlllIIIII[0], var4);
            return new String(var10.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }
}

