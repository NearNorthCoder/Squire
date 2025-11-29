/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.CEnum;
import g.r.r.-.t.q.i.u.o.e.s.h_Unknown;
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
import net.unethicalite.api.movement.Reachable;

/* TASK: Grabbing uncharged cells -> GrabbingunchargedcellsTask */
@TaskDesc(name="Grabbing uncharged cells", priority=15, blocking=true)
public class GrabbingUnchargedCellsTask
extends h_Unknown {
    private static /* synthetic */ String[] llIIlllllIII;
    private static /* synthetic */ int[] llIIlllllIll;

    static {
        j.lllllllllIIIll();
        j.lllllllllIIIlI();
    }

    private static boolean lllllllllIlIII(Object object) {
        return object != null;
    }

    private static String llllllllIlllll(String var7, String var4) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(llIIlllllIll[3], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllllIIllI(int n2) {
        return n2 != 0;
    }

    private static void lllllllllIIIlI() {
        llIIlllllIII = new String[llIIlllllIll[0]];
        j.llIIlllllIII[j.llIIlllllIll[1]] = j."Take-10";
    }

    @Override
    protected boolean ak() {
        j var6;
        if (j.lllllllllIIlIl(this.aV.d(), llIIlllllIll[2])) {
            return llIIlllllIll[1];
        }
        if (j.lllllllllIIllI(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllllIll[1];
        }
        GameObject var1 = var6.aV.y();
        if (j.lllllllllIlIII(var1) && j.lllllllllIIllI(Reachable.isInteractable((Locatable)var1) ? 1 : 0)) {
            var1.interact(llIIlllllIII[llIIlllllIll[1]]);
            return llIIlllllIll[0];
        }
        return llIIlllllIll[1];
    }

    private static boolean lllllllllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllllllllIIIll() {
        llIIlllllIll = new int[4];
        j.llIIlllllIll[0] = 1;
        j.llIIlllllIll[1] = (0xB7 ^ 0xAA) & ~(0x7B ^ 0x66);
        j.llIIlllllIll[2] = 0x63 ^ 0x69;
        j.llIIlllllIll[3] = 2;
    }

    @Inject
    public j(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllllIll[0]];
        cArray[j.llIIlllllIll[1]] = c.ACTIVATING;
        super(squireGOTRPlugin, cArray);
    }
}

