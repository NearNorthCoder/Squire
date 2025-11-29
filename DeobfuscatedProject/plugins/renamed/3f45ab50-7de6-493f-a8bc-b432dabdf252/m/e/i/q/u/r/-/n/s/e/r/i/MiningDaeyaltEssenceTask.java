/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.AEnum;
import m.e.i.q.u.r.-.n.s.e.r.i.GEnum;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

/* TASK: Mining Daeyalt Essence -> MiningdaeyaltessenceTask */
@TaskDesc(name="Mining Daeyalt Essence")
public class MiningDaeyaltEssenceTask
extends Task {
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ int[] lllllIIllIII;
    private static /* synthetic */ String[] lllllIIlIlll;

    private static void lIIlIIlIllIllII() {
        lllllIIllIII = new int[5];
        m.lllllIIllIII[0] = 2 & (2 ^ -1);
        m.lllllIIllIII[1] = 0x99 ^ 0x9D;
        m.lllllIIllIII[2] = 1;
        m.lllllIIllIII[3] = 0x72 ^ 0x7A;
        m.lllllIIllIII[4] = 2;
    }

    private static String lIIlIIlIllIlIlI(String var6, String var2) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lllllIIllIII[3]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllllIIllIII[4], var4);
            return new String(var5.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.lIIlIIlIllIllIl((Object)this.f.activity(), (Object)a.DAEYALT)) {
            return lllllIIllIII[0];
        }
        TileObject var7 = g.h();
        if (m.lIIlIIlIllIlllI(var7)) {
            return lllllIIllIII[0];
        }
        if (m.lIIlIIlIllIllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            m var1;
            var1.sleep(lllllIIllIII[1]);
            return lllllIIllIII[0];
        }
        var1_1.interact(lllllIIlIlll[lllllIIllIII[0]]);
        this.sleep(lllllIIllIII[1]);
        return lllllIIllIII[2];
    }

    private static boolean lIIlIIlIllIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIlIllIllIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        m.lIIlIIlIllIllII();
        m.lIIlIIlIllIlIll();
    }

    private static boolean lIIlIIlIllIlllI(Object object) {
        return object == null;
    }

    private static void lIIlIIlIllIlIll() {
        lllllIIlIlll = new String[lllllIIllIII[2]];
        m.lllllIIlIlll[m.lllllIIllIII[0]] = m."Mine";
    }
}

