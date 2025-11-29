/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.x;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;

/* TASK: Dismantling Pitfall Trap -> DismantlingpitfalltrapTask */
@TaskDesc(name="Dismantling Pitfall Trap", priority=30, blocking=true)
public class t
extends x {
    private static /* synthetic */ String[] lllIlllIllll;
    private static /* synthetic */ int[] lllIllllIIII;

    private static boolean lIIIllIlllllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var2_2;
        TileObject var5;
        t var3;
        int[] nArray = new int[lllIllllIIII[0]];
        nArray[t.lllIllllIIII[1]] = lllIllllIIII[2];
        if (t.lIIIllIlllllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lllIllllIIII[1];
        }
        TileObject var7 = var3.a(lllIllllIIII[1]);
        if (t.lIIIllIlllllIll(var7)) {
            int[] nArray2 = new int[lllIllllIIII[0]];
            nArray2[t.lllIllllIIII[1]] = lllIllllIIII[2];
            if (t.lIIIllIlllllIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                var3.sleep(lllIllllIIII[3]);
                return lllIllllIIII[1];
            }
        }
        if (t.lIIIllIllllllII(var5 = var3.a(lllIllllIIII[0]))) {
            return lllIllllIIII[1];
        }
        var2_2.interact(lllIlllIllll[lllIllllIIII[1]]);
        return lllIllllIIII[0];
    }

    private static String lIIIllIllllIlll(String var8, String var2) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lllIllllIIII[4], var1);
            return new String(var6.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIlllllIIl() {
        lllIllllIIII = new int[5];
        t.lllIllllIIII[0] = 1;
        t.lllIllllIIII[1] = (0x90 ^ 0xA5 ^ (0x8C ^ 0xA4)) & (0x3B ^ 0x6E ^ (0x38 ^ 0x70) ^ -1);
        t.lllIllllIIII[2] = 0xFFFFBFE7 & 0x45FF;
        t.lllIllllIIII[3] = 93 + 10 - 35 + 60 ^ 2 + 42 - -26 + 62;
        t.lllIllllIIII[4] = 2;
    }

    static {
        t.lIIIllIlllllIIl();
        t.lIIIllIlllllIII();
    }

    private static boolean lIIIllIlllllIll(Object object) {
        return object != null;
    }

    @Inject
    public t(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    private static void lIIIllIlllllIII() {
        lllIlllIllll = new String[lllIllllIIII[0]];
        t.lllIlllIllll[t.lllIllllIIII[1]] = t."Dismantle";
    }

    private static boolean lIIIllIllllllII(Object object) {
        return object == null;
    }
}

