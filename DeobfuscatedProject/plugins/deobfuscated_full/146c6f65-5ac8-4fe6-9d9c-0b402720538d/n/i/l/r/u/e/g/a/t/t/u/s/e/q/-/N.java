/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

/* TASK: Walking home -> WalkinghomeTask */
@TaskDesc(name="Walking home", priority=1)
public class N
extends n {
    private static /* synthetic */ String[] llIIlIllIlII;
    private static /* synthetic */ int[] llIIlIllIlIl;

    private static String lllllIlllIIIll(String var1, String var4) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(llIIlIllIlIl[2], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlllIIllI(Object object) {
        return object == null;
    }

    @Override
    public boolean be() {
        Item var7;
        N var6;
        Player player = Players.getLocal();
        if (N.lllllIlllIIllI(player)) {
            return llIIlIllIlIl[1];
        }
        if (N.lllllIlllIIlll(var6.ba.N() ? 1 : 0)) {
            if (N.lllllIlllIIlll(var6.ba.a(i2 -> {
                boolean bl;
                if (!N.lllllIlllIlIIl(i2, (Object)i.CRYSTAL_SHARD) || N.lllllIlllIlIlI(i2, (Object)i.FISH)) {
                    bl = llIIlIllIlIl[0];
                    0;
                    if (((0xC9 ^ 0x95 ^ (0x64 ^ 0x77)) & (195 + 216 - 366 + 187 ^ 120 + 53 - 12 + 6 ^ -1)) != 0) {
                        return ((0x73 ^ 0x2F ^ (0xC1 ^ 0x87)) & (0x3B ^ 0x1A ^ (0x9E ^ 0xA5) ^ -1)) != 0;
                    }
                } else {
                    bl = llIIlIllIlIl[1];
                }
                return bl;
            }) ? 1 : 0)) {
                return llIIlIllIlIl[1];
            }
            if (N.lllllIlllIIlll(var6.ba.O() ? 1 : 0)) {
                return llIIlIllIlIl[1];
            }
        }
        if (N.lllllIlllIlIII(var7 = Inventory.getFirst(item -> e.ab.contains(item.getId())))) {
            var7.interact(llIIlIllIlII[llIIlIllIlIl[1]]);
            return llIIlIllIlIl[0];
        }
        return this.ba.a((l)this.ba.V().av(), player.getWorldLocation());
    }

    private static boolean lllllIlllIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIlllIlIII(Object object) {
        return object != null;
    }

    @Inject
    public N(c c2) {
        d[] dArray = new d[llIIlIllIlIl[0]];
        dArray[N.llIIlIllIlIl[1]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static void lllllIlllIIlIl() {
        llIIlIllIlIl = new int[3];
        N.llIIlIllIlIl[0] = 1;
        N.llIIlIllIlIl[1] = (43 + 126 - 90 + 73 ^ 56 + 36 - 82 + 154) & (246 + 159 - 387 + 236 ^ 82 + 159 - 102 + 55 ^ -1);
        N.llIIlIllIlIl[2] = 2;
    }

    private static boolean lllllIlllIlIIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        N.lllllIlllIIlIl();
        N.lllllIlllIIlII();
    }

    private static boolean lllllIlllIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static void lllllIlllIIlII() {
        llIIlIllIlII = new String[llIIlIllIlIl[0]];
        N.llIIlIllIlII[N.llIIlIllIlIl[1]] = N."Activate";
    }
}

