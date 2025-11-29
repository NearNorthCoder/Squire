/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import gg.squire.driftnet.SquireDriftNetConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Start Banking", priority=0x7FFFFFFE, blocking=true)
public class f
extends Task {
    private final /* synthetic */ SquireDriftNetConfig A;
    private final /* synthetic */ SquireDriftNet y;
    private static /* synthetic */ String[] lIlIIIIIIIll;
    private final /* synthetic */ Client z;
    private static /* synthetic */ int[] lIlIIIIIIlII;

    private static void llIlIIlIllIIlI() {
        lIlIIIIIIIll = new String[lIlIIIIIIlII[2]];
        f.lIlIIIIIIIll[f.lIlIIIIIIlII[0]] = f."Logging out to start banking";
        f.lIlIIIIIIIll[f.lIlIIIIIIlII[1]] = f."Stamina";
    }

    public boolean run() {
        f lllllllllllllllIlllIlIIlIlIllIIl;
        if (f.llIlIIlIllIlIl(this.z.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIIlII[0];
        }
        if (f.llIlIIlIllIlIl(lllllllllllllllIlllIlIIlIlIllIIl.A.stamina())) {
            return lIlIIIIIIlII[0];
        }
        Item lllllllllllllllIlllIlIIlIlIllIII = Inventory.getFirst(item -> item.getName().contains(lIlIIIIIIIll[lIlIIIIIIlII[1]]));
        if (f.llIlIIlIllIllI(lllllllllllllllIlllIlIIlIlIllIII)) {
            return lIlIIIIIIlII[0];
        }
        Game.logout();
        System.out.println(lIlIIIIIIIll[lIlIIIIIIlII[0]]);
        return lIlIIIIIIlII[1];
    }

    private static boolean llIlIIlIllIlIl(int n) {
        return n == 0;
    }

    private static boolean llIlIIlIllIllI(Object object) {
        return object != null;
    }

    static {
        f.llIlIIlIllIlII();
        f.llIlIIlIllIIlI();
    }

    @Inject
    public f(SquireDriftNet squireDriftNet, Client client, SquireDriftNetConfig squireDriftNetConfig) {
        this.y = squireDriftNet;
        this.z = client;
        this.A = squireDriftNetConfig;
    }

    private static String llIlIIlIllIIII(String lllllllllllllllIlllIlIIlIlIIIIll, String lllllllllllllllIlllIlIIlIlIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlII[3]), "DES");
            Cipher lllllllllllllllIlllIlIIlIlIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIlIlIIIlIl.init(lIlIIIIIIlII[2], lllllllllllllllIlllIlIIlIlIIIllI);
            return new String(lllllllllllllllIlllIlIIlIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlIlIIIlII) {
            lllllllllllllllIlllIlIIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static String llIlIIlIllIIIl(String lllllllllllllllIlllIlIIlIlIlIIII, String lllllllllllllllIlllIlIIlIlIIllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIlIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIlIlIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIlIlIlIIlI.init(lIlIIIIIIlII[2], lllllllllllllllIlllIlIIlIlIlIIll);
            return new String(lllllllllllllllIlllIlIIlIlIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIlIlIlIIIl) {
            lllllllllllllllIlllIlIIlIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIlIllIlII() {
        lIlIIIIIIlII = new int[4];
        f.lIlIIIIIIlII[0] = (0x50 ^ 0x20 ^ (3 ^ 0x4B)) & (0x4D ^ 0x6A ^ (0xA3 ^ 0xBC) ^ -1);
        f.lIlIIIIIIlII[1] = 1;
        f.lIlIIIIIIlII[2] = 2;
        f.lIlIIIIIIlII[3] = 183 + 138 - 249 + 128 ^ 2 + 135 - 80 + 135;
    }
}

