/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

/* TASK: Tick-eating boss trample -> Tick-EatingbosstrampleTask */
@TaskDesc(name="Tick-eating boss trample", priority=10)
public class z
extends n {
    private final /* synthetic */ b bI;
    private static /* synthetic */ String[] llIlIIIlllIl;
    private /* synthetic */ int bJ;
    private static /* synthetic */ int[] llIlIIIllllI;

    private static String lIIIIIIlIllIIlI(String var8, String var7) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), llIlIIIllllI[4]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llIlIIIllllI[5], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIlIlllIII(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var6;
        z var2;
        Player player = Players.getLocal();
        if (z.lIIIIIIlIllIlIl(player)) {
            return llIlIIIllllI[1];
        }
        Item var4 = Inventory.getFirst(item -> e.aH.contains(item.getId()));
        if (z.lIIIIIIlIllIlIl(var4)) {
            return llIlIIIllllI[1];
        }
        NPC var1 = var2.ba.X().aI();
        if (z.lIIIIIIlIllIlIl(var1)) {
            return llIlIIIllllI[1];
        }
        if (z.lIIIIIIlIllIllI(var1.getWorldArea().contains(var6.getWorldLocation()) ? 1 : 0)) {
            var2.bJ = Static.getClient().getTickCount();
            return llIlIIIllllI[1];
        }
        if (z.lIIIIIIlIllIlll(var1.getAnimation(), llIlIIIllllI[2])) {
            return llIlIIIllllI[1];
        }
        if (z.lIIIIIIlIlllIII(Static.getClient().getTickCount() - var2.bJ, llIlIIIllllI[3])) {
            var4.interact(llIlIIIlllIl[llIlIIIllllI[1]]);
            var2.bI.u();
            return llIlIIIllllI[0];
        }
        return llIlIIIllllI[1];
    }

    static {
        z.lIIIIIIlIllIlII();
        z.lIIIIIIlIllIIll();
    }

    private static boolean lIIIIIIlIllIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIIIIIlIllIIll() {
        llIlIIIlllIl = new String[llIlIIIllllI[0]];
        z.llIlIIIlllIl[z.llIlIIIllllI[1]] = z."Eat";
    }

    private static boolean lIIIIIIlIllIlIl(Object object) {
        return object == null;
    }

    private static void lIIIIIIlIllIlII() {
        llIlIIIllllI = new int[6];
        z.llIlIIIllllI[0] = 1;
        z.llIlIIIllllI[1] = (0x2F ^ 0x71) & ~(0xDD ^ 0x83);
        z.llIlIIIllllI[2] = -(0xFFFFF73F & 0x4EDD) & (0xFFFFE7FF & 0x7EFE);
        z.llIlIIIllllI[3] = 0xB8 ^ 0xB2;
        z.llIlIIIllllI[4] = 0x7A ^ 0x28 ^ (0x1B ^ 0x41);
        z.llIlIIIllllI[5] = 2;
    }

    @Inject
    public z(c c2, b b2) {
        d[] dArray = new d[llIlIIIllllI[0]];
        dArray[z.llIlIIIllllI[1]] = d.BOSS_FIGHT;
        super(c2, dArray);
        this.bI = b2;
    }
}

