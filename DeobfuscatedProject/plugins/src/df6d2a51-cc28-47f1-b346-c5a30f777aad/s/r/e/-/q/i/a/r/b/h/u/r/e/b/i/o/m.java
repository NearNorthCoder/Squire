/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.e;
import squire.gg.hunter.SquireHerbiboarConfig;

@TaskDesc(name="Drinking stamina potion", priority=1)
public class m
extends Task {
    @Inject
    private /* synthetic */ SquireHerbiboarConfig p;
    private static /* synthetic */ String[] lllIIllIllII;
    private static /* synthetic */ int[] lllIIllIllIl;

    private static void lIIIlIlIllIIIlI() {
        lllIIllIllIl = new int[4];
        m.lllIIllIllIl[0] = (0xF6 ^ 0xC5) & ~(0x9F ^ 0xAC);
        m.lllIIllIllIl[1] = 0xAE ^ 0x9C;
        m.lllIIllIllIl[2] = "  ".length();
        m.lllIIllIllIl[3] = " ".length();
    }

    private static String lIIIlIlIllIIIII(String lllllllllllllllIIllIIllllIllllII, String lllllllllllllllIIllIIllllIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIllllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIllllIlllllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIllllIlllllI.init(lllIIllIllIl[2], lllllllllllllllIIllIIllllIllllll);
            return new String(lllllllllllllllIIllIIllllIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIllllIllllIl) {
            lllllllllllllllIIllIIllllIllllIl.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        m lllllllllllllllIIllIIlllllIIIlIl;
        if (m.lIIIlIlIllIIIll((Object)this.p.useEnergyRestoration(), (Object)e.NONE)) {
            return lllIIllIllIl[0];
        }
        Item lllllllllllllllIIllIIlllllIIIlII = Inventory.getFirst((int[])lllllllllllllllIIllIIlllllIIIlIl.p.useEnergyRestoration().j());
        if (m.lIIIlIlIllIIlII(lllllllllllllllIIllIIlllllIIIlII)) {
            return lllIIllIllIl[0];
        }
        if (m.lIIIlIlIllIIlIl(Movement.isWalking() ? 1 : 0)) {
            return lllIIllIllIl[0];
        }
        if (m.lIIIlIlIllIIllI(Movement.getRunEnergy(), lllIIllIllIl[1]) && m.lIIIlIlIllIIlIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            lllllllllllllllIIllIIlllllIIIlII.interact(lllIIllIllII[lllIIllIllIl[0]]);
            lllllllllllllllIIllIIlllllIIIlIl.sleep(lllIIllIllIl[2]);
            return lllIIllIllIl[3];
        }
        return lllIIllIllIl[0];
    }

    private static boolean lIIIlIlIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlIllIIlII(Object object) {
        return object == null;
    }

    private static boolean lIIIlIlIllIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIlIllIIlIl(int n2) {
        return n2 == 0;
    }

    static {
        m.lIIIlIlIllIIIlI();
        m.lIIIlIlIllIIIIl();
    }

    private static void lIIIlIlIllIIIIl() {
        lllIIllIllII = new String[lllIIllIllIl[3]];
        m.lllIIllIllII[m.lllIIllIllIl[0]] = m.lIIIlIlIllIIIII("oxE76ttOoTg=", "cFlAV");
    }
}

