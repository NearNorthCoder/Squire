/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.E;
import a.u.i.-.l.r.h.z.s.r.u.q.e.t;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Entering portal -> EnterPortalTask */
@TaskDesc(name="Entering portal", priority=1000, blocking=true)
public class F
extends E {
    private static /* synthetic */ String[] lIllIlIlIIlIl;
    private static /* synthetic */ int[] lIllIlIlIIllI;

    private static void llIIIlllllllIlI() {
        lIllIlIlIIlIl = new String[lIllIlIlIIllI[1]];
        F.lIllIlIlIIlIl[F.lIllIlIlIIllI[0]] = F."Enter";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean run() {
        void var1_1;
        F var5;
        if (!F.llIIIllllllllIl(this.aa.d() ? 1 : 0) || F.llIIIllllllllIl(this.ad() ? 1 : 0)) {
            return lIllIlIlIIllI[0];
        }
        int[] nArray = new int[lIllIlIlIIllI[1]];
        nArray[F.lIllIlIlIIllI[0]] = lIllIlIlIIllI[2];
        TileObject var6 = TileObjects.getNearest((int[])nArray);
        if (F.llIIIlllllllllI(var6)) {
            return lIllIlIlIIllI[0];
        }
        BankLoadout var3 = var5.ae();
        if (F.llIIIllllllllll(var3.needsToBank() ? 1 : 0)) {
            return lIllIlIlIIllI[0];
        }
        var1_1.interact(lIllIlIlIIlIl[lIllIlIlIIllI[0]]);
        return lIllIlIlIIllI[1];
    }

    @Inject
    protected F(SquireZulrah squireZulrah, SquireZulrahConfig squireZulrahConfig, Client client, t t2) {
        super(squireZulrah, squireZulrahConfig, client, t2);
    }

    private static boolean llIIIllllllllIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean ac() {
        return lIllIlIlIIllI[0];
    }

    private static String llIIIlllllllIIl(String var2, String var1) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIllIlIlIIllI[3]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIllIlIlIIllI[4], var4);
            return new String(var8.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void llIIIllllllllII() {
        lIllIlIlIIllI = new int[5];
        F.lIllIlIlIIllI[0] = (0x5B ^ 0x6A) & ~(0x1D ^ 0x2C);
        F.lIllIlIlIIllI[1] = 1;
        F.lIllIlIlIIllI[2] = 0xFFFFFB15 & 0x6CFF;
        F.lIllIlIlIIllI[3] = 0xBE ^ 0xB6;
        F.lIllIlIlIIllI[4] = 2;
    }

    static {
        F.llIIIllllllllII();
        F.llIIIlllllllIlI();
    }

    private static boolean llIIIllllllllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllllllllI(Object object) {
        return object == null;
    }
}

