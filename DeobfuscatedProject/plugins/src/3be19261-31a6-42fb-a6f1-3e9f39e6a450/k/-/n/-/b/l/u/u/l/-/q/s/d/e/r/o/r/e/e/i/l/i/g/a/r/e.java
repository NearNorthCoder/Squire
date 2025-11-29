/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Starting")
public class e
extends Task {
    private static /* synthetic */ String[] lIIlllIllllI;
    private final /* synthetic */ Client v;
    private static /* synthetic */ int[] lIIlllIlllll;
    private final /* synthetic */ SquireBlueDragonKiller t;
    private final /* synthetic */ SquireBlueDragonKillerConfig u;

    static {
        e.llIlIIIlIlIlll();
        e.llIlIIIlIlIllI();
    }

    private static boolean llIlIIIlIllIlI(int n) {
        return n != 0;
    }

    private static boolean llIlIIIlIllIII(int n) {
        return n == 0;
    }

    private static boolean llIlIIIlIllIIl(Object object) {
        return object == null;
    }

    public boolean run() {
        e lllllllllllllllIlllIlIlIIlIlllII;
        if (e.llIlIIIlIllIII(this.t.i() ? 1 : 0)) {
            return lIIlllIlllll[0];
        }
        BankLoadout lllllllllllllllIlllIlIlIIlIllIll = (BankLoadout)lllllllllllllllIlllIlIlIIlIlllII.u.loadout().selected(BankLoadout.class);
        if (e.llIlIIIlIllIIl(lllllllllllllllIlllIlIlIIlIllIll)) {
            Log.error((String)lIIlllIllllI[lIIlllIlllll[0]]);
            lllllllllllllllIlllIlIlIIlIlllII.t.forceStop();
            return lIIlllIlllll[1];
        }
        if (e.llIlIIIlIllIII(lllllllllllllllIlllIlIlIIlIlllII.u.dragonLocation().p().contains((Locatable)Players.getLocal()) ? 1 : 0) && e.llIlIIIlIllIlI(lllllllllllllllIlllIlIlIIlIllIll.needsToBank() ? 1 : 0)) {
            lllllllllllllllIlllIlIlIIlIlllII.t.a(lIIlllIlllll[1]);
        }
        this.t.b(lIIlllIlllll[0]);
        return lIIlllIlllll[1];
    }

    private static void llIlIIIlIlIllI() {
        lIIlllIllllI = new String[lIIlllIlllll[1]];
        e.lIIlllIllllI[e.lIIlllIlllll[0]] = e.llIlIIIlIlIlIl("wOAt2IYKJty7aOm86HgBorJzZiGeKCbW", "UmxLi");
    }

    private static void llIlIIIlIlIlll() {
        lIIlllIlllll = new int[3];
        e.lIIlllIlllll[0] = (0x24 ^ 0x7A ^ (0x9E ^ 0xA2)) & (0x31 ^ 0x47 ^ (0x10 ^ 4) ^ -" ".length());
        e.lIIlllIlllll[1] = " ".length();
        e.lIIlllIlllll[2] = "  ".length();
    }

    @Inject
    public e(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, Client client) {
        this.t = squireBlueDragonKiller;
        this.u = squireBlueDragonKillerConfig;
        this.v = client;
    }

    private static String llIlIIIlIlIlIl(String lllllllllllllllIlllIlIlIIlIlIIIl, String lllllllllllllllIlllIlIlIIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIlIIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIlIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIlIIlIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIlIIlIlIlIl.init(lIIlllIlllll[2], lllllllllllllllIlllIlIlIIlIlIllI);
            return new String(lllllllllllllllIlllIlIlIIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIlIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIlIIlIlIlII) {
            lllllllllllllllIlllIlIlIIlIlIlII.printStackTrace();
            return null;
        }
    }
}

