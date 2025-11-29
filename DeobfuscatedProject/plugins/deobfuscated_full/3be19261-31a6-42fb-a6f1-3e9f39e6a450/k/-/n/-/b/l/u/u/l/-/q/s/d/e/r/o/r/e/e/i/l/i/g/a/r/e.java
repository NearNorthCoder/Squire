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

/* TASK: Starting -> StartingTask */
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
        e var7;
        if (e.llIlIIIlIllIII(this.t.i() ? 1 : 0)) {
            return lIIlllIlllll[0];
        }
        BankLoadout var4 = (BankLoadout)var7.u.loadout().selected(BankLoadout.class);
        if (e.llIlIIIlIllIIl(var4)) {
            Log.error((String)lIIlllIllllI[lIIlllIlllll[0]]);
            var7.t.forceStop();
            return lIIlllIlllll[1];
        }
        if (e.llIlIIIlIllIII(var7.u.dragonLocation().p().contains((Locatable)Players.getLocal()) ? 1 : 0) && e.llIlIIIlIllIlI(var4.needsToBank() ? 1 : 0)) {
            var7.t.a(lIIlllIlllll[1]);
        }
        this.t.b(lIIlllIlllll[0]);
        return lIIlllIlllll[1];
    }

    private static void llIlIIIlIlIllI() {
        lIIlllIllllI = new String[lIIlllIlllll[1]];
        e.lIIlllIllllI[e.lIIlllIlllll[0]] = e."No loadout selected";
    }

    private static void llIlIIIlIlIlll() {
        lIIlllIlllll = new int[3];
        e.lIIlllIlllll[0] = (0x24 ^ 0x7A ^ (0x9E ^ 0xA2)) & (0x31 ^ 0x47 ^ (0x10 ^ 4) ^ -1);
        e.lIIlllIlllll[1] = 1;
        e.lIIlllIlllll[2] = 2;
    }

    @Inject
    public e(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig, Client client) {
        this.t = squireBlueDragonKiller;
        this.u = squireBlueDragonKillerConfig;
        this.v = client;
    }

    private static String llIlIIIlIlIlIl(String var5, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIIlllIlllll[2], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }
}

