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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Dropping some fish", blocking=true, priority=10)
public class D
extends n {
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
        void lllllllllllllllIlIIlIlIIIIIIIllI;
        D lllllllllllllllIlIIlIlIIIIIIIlll;
        Player player = Players.getLocal();
        if (!D.lllllllIlIIlll(this.ba.A() ? 1 : 0) || !D.lllllllIlIIlll(this.ba.V().av().e(player.getWorldLocation()) ? 1 : 0) || D.lllllllIlIIlll(player.isMoving() ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        if (D.lllllllIlIlIII(lllllllllllllllIlIIlIlIIIIIIIlll.ba.V().av().e(lllllllllllllllIlIIlIlIIIIIIIllI.getWorldLocation()) ? 1 : 0)) {
            lllllllllllllllIlIIlIlIIIIIIIlll.ba.a((l)lllllllllllllllIlIIlIlIIIIIIIlll.ba.V().av(), lllllllllllllllIlIIlIlIIIIIIIllI.getWorldLocation());
            0;
            return llIIlllIIIII[2];
        }
        List<Item> lllllllllllllllIlIIlIlIIIIIIIlIl = lllllllllllllllIlIIlIlIIIIIIIlll.ba.b(i.FISH);
        if (D.lllllllIlIIlll(lllllllllllllllIlIIlIlIIIIIIIlIl.isEmpty() ? 1 : 0)) {
            return llIIlllIIIII[1];
        }
        h lllllllllllllllIlIIlIlIIIIIIIlII = lllllllllllllllIlIIlIlIIIIIIIlll.ba.V();
        int lllllllllllllllIlIIlIlIIIIIIIIll = llIIlllIIIII[3];
        int lllllllllllllllIlIIlIlIIIIIIIIlI = llIIlllIIIII[1];
        Iterator<Item> lllllllllllllllIlIIlIlIIIIIIIIIl = lllllllllllllllIlIIlIlIIIIIIIlIl.iterator();
        while (D.lllllllIlIIlll(lllllllllllllllIlIIlIlIIIIIIIIIl.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIlIIlIlIIIIIIIIII = lllllllllllllllIlIIlIlIIIIIIIIIl.next();
            if (D.lllllllIlIlIIl(++lllllllllllllllIlIIlIlIIIIIIIIlI, llIIlllIIIII[3])) {
                return llIIlllIIIII[2];
            }
            lllllllllllllllIlIIlIlIIIIIIIIII.interact(llIIllIlllll[llIIlllIIIII[1]]);
            lllllllllllllllIlIIlIlIIIIIIIlII.av().k(llIIlllIIIII[2]);
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

    private static String lllllllIlIIlII(String lllllllllllllllIlIIlIIlllllllIII, String lllllllllllllllIlIIlIIllllllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIlllllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIllllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIIlllllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIIlllllllIlI.init(llIIlllIIIII[0], lllllllllllllllIlIIlIIlllllllIll);
            return new String(lllllllllllllllIlIIlIIlllllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIlllllllIIl) {
            lllllllllllllllIlIIlIIlllllllIIl.printStackTrace();
            return null;
        }
    }
}

