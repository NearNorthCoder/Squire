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
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.EEnum;
import squire.gg.hunter.SquireHerbiboarConfig;

/* TASK: Drinking stamina potion -> DrinkingstaminapotionTask */
@TaskDesc(name="Drinking stamina potion", priority=1)
public class DrinkingStaminaPotionTask
extends Task {
    @Inject
    private /* synthetic */ SquireHerbiboarConfig p;
    private static /* synthetic */ String[] lllIIllIllII;
    private static /* synthetic */ int[] lllIIllIllIl;

    private static void lIIIlIlIllIIIlI() {
        lllIIllIllIl = new int[4];
        m.lllIIllIllIl[0] = (0xF6 ^ 0xC5) & ~(0x9F ^ 0xAC);
        m.lllIIllIllIl[1] = 0xAE ^ 0x9C;
        m.lllIIllIllIl[2] = 2;
        m.lllIIllIllIl[3] = 1;
    }

    private static String lIIIlIlIllIIIII(String var1, String var7) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lllIIllIllIl[2], var5);
            return new String(var4.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        m var3;
        if (m.lIIIlIlIllIIIll((Object)this.p.useEnergyRestoration(), (Object)e.NONE)) {
            return lllIIllIllIl[0];
        }
        Item var2 = Inventory.getFirst((int[])var3.p.useEnergyRestoration().j());
        if (m.lIIIlIlIllIIlII(var2)) {
            return lllIIllIllIl[0];
        }
        if (m.lIIIlIlIllIIlIl(Movement.isWalking() ? 1 : 0)) {
            return lllIIllIllIl[0];
        }
        if (m.lIIIlIlIllIIllI(Movement.getRunEnergy(), lllIIllIllIl[1]) && m.lIIIlIlIllIIlIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            var2.interact(lllIIllIllII[lllIIllIllIl[0]]);
            var3.sleep(lllIIllIllIl[2]);
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
        m.lllIIllIllII[m.lllIIllIllIl[0]] = m."Drink";
    }
}

