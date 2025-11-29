/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.d;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.f;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s;

@TaskDesc(name="Agitator task")
public class j
extends Task {
    private static /* synthetic */ int[] lllllllIlIll;
    private final /* synthetic */ SquireMixologyConfig R;
    private static /* synthetic */ String[] lllllllIlIlI;
    final /* synthetic */ int Q = 5674;

    private static boolean lIIlIlIlIlIIllI(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public j(SquireMixologyConfig squireMixologyConfig) {
        this.Q = lllllllIlIll[0];
        this.R = squireMixologyConfig;
    }

    private static boolean lIIlIlIlIlIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        j.lIIlIlIlIlIIIIl();
        j.lIIlIlIlIIlllll();
    }

    private static boolean lIIlIlIlIlIIIll(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        j lllllllllllllllIIlIIIlIIlIlIlIIl;
        if (j.lIIlIlIlIlIIIlI(s.e() ? 1 : 0)) {
            return lllllllIlIll[1];
        }
        if (j.lIIlIlIlIlIIIll((Object)lllllllllllllllIIlIIIlIIlIlIlIIl.R.pluginMode(), (Object)d.MINIGAME)) {
            return lllllllIlIll[1];
        }
        if (j.lIIlIlIlIlIIIlI(s.a(lllllllIlIll[2], lllllllIlIll[3], lllllllIlIll[4]) ? 1 : 0)) {
            return lllllllIlIll[1];
        }
        if (j.lIIlIlIlIlIIIlI(Players.getLocal().isIdle() ? 1 : 0)) {
            return lllllllIlIll[1];
        }
        if (j.lIIlIlIlIlIIlII((Object)lllllllllllllllIIlIIIlIIlIlIlIIl.R.potionStrategy(), (Object)f.MULTI_ORDER)) {
            if (j.lIIlIlIlIlIIIlI(s.g() ? 1 : 0) && j.lIIlIlIlIlIIlIl(Vars.getBit((int)lllllllIlIll[3]), lllllllIlIll[5])) {
                return lllllllIlIll[1];
            }
            s.j();
            if (j.lIIlIlIlIlIIllI(SquireMixology.x, lllllllIlIll[0])) {
                return lllllllIlIll[1];
            }
        }
        if (j.lIIlIlIlIlIIIll((Object)lllllllllllllllIIlIIIlIIlIlIlIIl.R.potionStrategy(), (Object)f.MULTI_ORDER) && j.lIIlIlIlIlIIllI(SquireMixology.r, lllllllIlIll[0])) {
            return lllllllIlIll[1];
        }
        SquireMixology.g = lllllllIlIlI[lllllllIlIll[1]];
        int[] nArray = new int[lllllllIlIll[5]];
        nArray[j.lllllllIlIll[1]] = lllllllIlIll[4];
        TileObjects.getNearest((int[])nArray).interact(lllllllIlIll[1]);
        return lllllllIlIll[1];
    }

    private static void lIIlIlIlIIlllll() {
        lllllllIlIlI = new String[lllllllIlIll[5]];
        j.lllllllIlIlI[j.lllllllIlIll[1]] = j."Homogenising";
    }

    private static boolean lIIlIlIlIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIlIlIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIIlIlIlIIllllI(String lllllllllllllllIIlIIIlIIlIlIIIIl, String lllllllllllllllIIlIIIlIIlIIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIIlIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIIlIIlIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIIlIIlIlIIIll.init(lllllllIlIll[6], lllllllllllllllIIlIIIlIIlIlIIlII);
            return new String(lllllllllllllllIIlIIIlIIlIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIIlIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIlIIlIlIIIlI) {
            lllllllllllllllIIlIIIlIIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIlIlIIIIl() {
        lllllllIlIll = new int[7];
        j.lllllllIlIll[0] = -(0xFFFFEFE2 & 0x719F) & (0xFFFFFFFB & 0x77AF);
        j.lllllllIlIll[1] = (0x7A ^ 0x2D) & ~(0xFD ^ 0xAA);
        j.lllllllIlIll[2] = 0xFFFF8F8A & 0x7BFF;
        j.lllllllIlIll[3] = 0xFFFFAC49 & 0x7FF7;
        j.lllllllIlIll[4] = 0xFFFFFCDF & 0xDB7E;
        j.lllllllIlIll[5] = 1;
        j.lllllllIlIll[6] = 2;
    }
}

