/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

/* TASK: Grabbing a weak cell -> GrabbingaweakcellTask */
@TaskDesc(name="Grabbing a weak cell", priority=14, blocking=true)
public class k
extends h {
    private static /* synthetic */ String[] llIlIIIIIIII;
    private static /* synthetic */ int[] llIlIIIIIIIl;

    private static boolean lIIIIIIIIIIIIll(Object object) {
        return object == null;
    }

    private static String lIIIIIIIIIIIIII(String var4, String var7) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llIlIIIIIIIl[2], var6);
            return new String(var2.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        k.lIIIIIIIIIIIIlI();
        k.lIIIIIIIIIIIIIl();
    }

    @Override
    protected boolean ak() {
        k var3;
        if (!k.lIIIIIIIIIIIIll(this.aV.e()) || k.lIIIIIIIIIIIlII(Inventory.isFull() ? 1 : 0)) {
            return llIlIIIIIIIl[1];
        }
        if (k.lIIIIIIIIIIIlII(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIlIIIIIIIl[1];
        }
        GameObject var5 = var3.aV.z();
        if (k.lIIIIIIIIIIIlIl(var5) && k.lIIIIIIIIIIIlII(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            var5.interact(llIlIIIIIIII[llIlIIIIIIIl[1]]);
            return llIlIIIIIIIl[0];
        }
        return llIlIIIIIIIl[1];
    }

    private static void lIIIIIIIIIIIIIl() {
        llIlIIIIIIII = new String[llIlIIIIIIIl[0]];
        k.llIlIIIIIIII[k.llIlIIIIIIIl[1]] = k."Take";
    }

    @Inject
    public k(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIlIIIIIIIl[0]];
        cArray[k.llIlIIIIIIIl[1]] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lIIIIIIIIIIIlIl(Object object) {
        return object != null;
    }

    private static void lIIIIIIIIIIIIlI() {
        llIlIIIIIIIl = new int[3];
        k.llIlIIIIIIIl[0] = 1;
        k.llIlIIIIIIIl[1] = (0x21 ^ 4) & ~(0x8B ^ 0xAE);
        k.llIlIIIIIIIl[2] = 2;
    }
}

