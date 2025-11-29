/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Spec -> SpecialAttackTask */
@TaskDesc(name="Spec", priority=11)
public class B
extends w {
    private static /* synthetic */ String[] lIlIllIIlIlII;
    private static /* synthetic */ int[] lIlIllIIlIlIl;

    @Inject
    protected B(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static boolean llIIIIIIlIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIIlIIlIIl(Object object) {
        return object != null;
    }

    private static void llIIIIIIlIIIllI() {
        lIlIllIIlIlII = new String[lIlIllIIlIlIl[0]];
        B.lIlIllIIlIlII[B.lIlIllIIlIlIl[1]] = B."Wield";
    }

    private static String llIIIIIIlIIIlIl(String var6, String var3) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIllIIlIlIl[5], var7);
            return new String(var1.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    static {
        B.llIIIIIIlIIIlll();
        B.llIIIIIIlIIIllI();
    }

    private static boolean llIIIIIIlIIlIII(Object object) {
        return object == null;
    }

    private static void llIIIIIIlIIIlll() {
        lIlIllIIlIlIl = new int[8];
        B.lIlIllIIlIlIl[0] = 1;
        B.lIlIllIIlIlIl[1] = (97 + 214 - 240 + 183 ^ 99 + 11 - 74 + 120) & (127 + 28 - 110 + 205 ^ 64 + 0 - -72 + 16 ^ -1);
        B.lIlIllIIlIlIl[2] = -(0xFFFFFC6F & 0x5BB7) & (0xFFFFDDFF & 0x7FEF);
        B.lIlIllIIlIlIl[3] = 0x66 ^ 0x2C ^ (0x13 ^ 0x6B);
        B.lIlIllIIlIlIl[4] = -(0xFFFFAF5D & 0x7CAB) & (0xFFFFAFFF & 0x7D7F);
        B.lIlIllIIlIlIl[5] = 2;
        B.lIlIllIIlIlIl[6] = -(0xFFFFC92F & 0x76F4) & (0xFFFFEFBF & 0x7E7F);
        B.lIlIllIIlIlIl[7] = -(0xFFFF9525 & 0x7AFF) & (0xFFFFFFB7 & 0x5FFE);
    }

    private static boolean llIIIIIIlIIlIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean Q() {
        B var5;
        if (B.llIIIIIIlIIlIII(this.cg.c(lIlIllIIlIlIl[0]))) {
            return lIlIllIIlIlIl[1];
        }
        int[] nArray = new int[lIlIllIIlIlIl[0]];
        nArray[B.lIlIllIIlIlIl[1]] = lIlIllIIlIlIl[2];
        if (B.llIIIIIIlIIlIIl(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIlIlIl[1];
        }
        if (B.llIIIIIIlIIlIlI(var5.cg.y() ? 1 : 0)) {
            return lIlIllIIlIlIl[1];
        }
        if (!B.llIIIIIIlIIlIll(Combat.isSpecEnabled() ? 1 : 0) || B.llIIIIIIlIIllII(Combat.getSpecEnergy(), lIlIllIIlIlIl[3])) {
            return lIlIllIIlIlIl[1];
        }
        if (B.llIIIIIIlIIllII(var5.cg.x(), lIlIllIIlIlIl[4])) {
            return lIlIllIIlIlIl[1];
        }
        int[] nArray2 = new int[lIlIllIIlIlIl[5]];
        nArray2[B.lIlIllIIlIlIl[1]] = lIlIllIIlIlIl[6];
        nArray2[B.lIlIllIIlIlIl[0]] = lIlIllIIlIlIl[7];
        Item var4 = Inventory.getFirst((int[])nArray2);
        if (B.llIIIIIIlIIlIIl(var4)) {
            if (B.llIIIIIIlIIlIlI(Inventory.isFull() ? 1 : 0)) {
                var5.ch.K();
                return lIlIllIIlIlIl[0];
            }
            var4.interact(lIlIllIIlIlII[lIlIllIIlIlIl[1]]);
        }
        Combat.toggleSpec();
        return lIlIllIIlIlIl[0];
    }

    private static boolean llIIIIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }
}

