/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c_Unknown;

/* TASK: Tethering to mast -> TetheringtomastTask */
@TaskDesc(name="Tethering to mast", priority=0x7FFFFFFE, blocking=true)
public class TetheringToMastTask
extends Task {
    private static /* synthetic */ int[] lIIlllIIlIIII;
    private final /* synthetic */ SquireTempoross aw;
    private final /* synthetic */ SquireTemporossConfig ax;
    private final /* synthetic */ a av;
    private static /* synthetic */ String[] lIIlllIIIllll;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        n var9;
        if (n.lIllIIlIlIIlIlI(this.av.K() ? 1 : 0)) {
            return lIIlllIIlIIII[0];
        }
        if (n.lIllIIlIlIIlIll(var9.av.k() ? 1 : 0)) {
            return lIIlllIIlIIII[0];
        }
        c var6 = var9.av.N();
        TileObject var7 = var6.W();
        if (n.lIllIIlIlIIllII(var7)) {
            return lIIlllIIlIIII[0];
        }
        NPC var2 = var9.aw.a((SceneEntity)var7);
        if (n.lIllIIlIlIIllIl(var2)) {
            return var9.aw.b((SceneEntity)var7);
        }
        var2_2.interact(lIIlllIIIllll[lIIlllIIlIIII[0]]);
        return lIIlllIIlIIII[1];
    }

    @Inject
    public n(a a2, SquireTemporossConfig squireTemporossConfig, SquireTempoross squireTempoross) {
        this.av = a2;
        this.ax = squireTemporossConfig;
        this.aw = squireTempoross;
    }

    private static void lIllIIlIlIIlIII() {
        lIIlllIIIllll = new String[lIIlllIIlIIII[1]];
        n.lIIlllIIIllll[n.lIIlllIIlIIII[0]] = n."Tether";
    }

    static {
        n.lIllIIlIlIIlIIl();
        n.lIllIIlIlIIlIII();
    }

    private static boolean lIllIIlIlIIllIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIlIIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIllII(Object object) {
        return object == null;
    }

    private static String lIllIIlIlIIIlIl(String var8, String var5) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIlllIIlIIII[2], var1);
            return new String(var3.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIlIIlIIl() {
        lIIlllIIlIIII = new int[3];
        n.lIIlllIIlIIII[0] = (0x8B ^ 0xA1) & ~(0x2B ^ 1);
        n.lIIlllIIlIIII[1] = 1;
        n.lIIlllIIlIIII[2] = 2;
    }

    private static boolean lIllIIlIlIIlIlI(int n2) {
        return n2 == 0;
    }
}

