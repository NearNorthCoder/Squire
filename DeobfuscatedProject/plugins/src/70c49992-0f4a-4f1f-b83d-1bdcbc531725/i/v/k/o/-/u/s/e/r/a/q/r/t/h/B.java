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
        B.lIlIllIIlIlII[B.lIlIllIIlIlIl[1]] = B.llIIIIIIlIIIlIl("g92QvHqS6Vw=", "AaOLs");
    }

    private static String llIIIIIIlIIIlIl(String llllllllllllllIllIlIIllIIIllIlII, String llllllllllllllIllIlIIllIIIllIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIllIIIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIllIIIllIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIllIIIllIllI.init(lIlIllIIlIlIl[5], llllllllllllllIllIlIIllIIIllIlll);
            return new String(llllllllllllllIllIlIIllIIIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllIIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIllIIIllIlIl) {
            llllllllllllllIllIlIIllIIIllIlIl.printStackTrace();
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
        B.lIlIllIIlIlIl[0] = " ".length();
        B.lIlIllIIlIlIl[1] = (97 + 214 - 240 + 183 ^ 99 + 11 - 74 + 120) & (127 + 28 - 110 + 205 ^ 64 + 0 - -72 + 16 ^ -" ".length());
        B.lIlIllIIlIlIl[2] = -(0xFFFFFC6F & 0x5BB7) & (0xFFFFDDFF & 0x7FEF);
        B.lIlIllIIlIlIl[3] = 0x66 ^ 0x2C ^ (0x13 ^ 0x6B);
        B.lIlIllIIlIlIl[4] = -(0xFFFFAF5D & 0x7CAB) & (0xFFFFAFFF & 0x7D7F);
        B.lIlIllIIlIlIl[5] = "  ".length();
        B.lIlIllIIlIlIl[6] = -(0xFFFFC92F & 0x76F4) & (0xFFFFEFBF & 0x7E7F);
        B.lIlIllIIlIlIl[7] = -(0xFFFF9525 & 0x7AFF) & (0xFFFFFFB7 & 0x5FFE);
    }

    private static boolean llIIIIIIlIIlIll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean Q() {
        B llllllllllllllIllIlIIllIIIllllIl;
        if (B.llIIIIIIlIIlIII(this.cg.c(lIlIllIIlIlIl[0]))) {
            return lIlIllIIlIlIl[1];
        }
        int[] nArray = new int[lIlIllIIlIlIl[0]];
        nArray[B.lIlIllIIlIlIl[1]] = lIlIllIIlIlIl[2];
        if (B.llIIIIIIlIIlIIl(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIlIlIl[1];
        }
        if (B.llIIIIIIlIIlIlI(llllllllllllllIllIlIIllIIIllllIl.cg.y() ? 1 : 0)) {
            return lIlIllIIlIlIl[1];
        }
        if (!B.llIIIIIIlIIlIll(Combat.isSpecEnabled() ? 1 : 0) || B.llIIIIIIlIIllII(Combat.getSpecEnergy(), lIlIllIIlIlIl[3])) {
            return lIlIllIIlIlIl[1];
        }
        if (B.llIIIIIIlIIllII(llllllllllllllIllIlIIllIIIllllIl.cg.x(), lIlIllIIlIlIl[4])) {
            return lIlIllIIlIlIl[1];
        }
        int[] nArray2 = new int[lIlIllIIlIlIl[5]];
        nArray2[B.lIlIllIIlIlIl[1]] = lIlIllIIlIlIl[6];
        nArray2[B.lIlIllIIlIlIl[0]] = lIlIllIIlIlIl[7];
        Item llllllllllllllIllIlIIllIIIllllII = Inventory.getFirst((int[])nArray2);
        if (B.llIIIIIIlIIlIIl(llllllllllllllIllIlIIllIIIllllII)) {
            if (B.llIIIIIIlIIlIlI(Inventory.isFull() ? 1 : 0)) {
                llllllllllllllIllIlIIllIIIllllIl.ch.K();
                return lIlIllIIlIlIl[0];
            }
            llllllllllllllIllIlIIllIIIllllII.interact(lIlIllIIlIlII[lIlIllIIlIlIl[1]]);
        }
        Combat.toggleSpec();
        return lIlIllIIlIlIl[0];
    }

    private static boolean llIIIIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }
}

