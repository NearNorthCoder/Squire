/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Drink Absorption", priority=19, blocking=true)
public class e
extends Task {
    private static /* synthetic */ String[] lIIIlIIIlIIIl;
    private /* synthetic */ int J;
    private final /* synthetic */ SquireNightmareZoneConfig G;
    private static /* synthetic */ int[] lIIIlIIIlIlII;
    private /* synthetic */ int I;
    private /* synthetic */ boolean K;
    private final /* synthetic */ SquireNightmareZone F;
    private final /* synthetic */ Client H;

    private static boolean lIIllllIlIIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        e.lIIllllIIllllll();
        e.lIIllllIIlllIIl();
    }

    private static void lIIllllIIllllll() {
        lIIIlIIIlIlII = new int[9];
        e.lIIIlIIIlIlII[0] = 0xFFFFA5FE & 0x5BF5;
        e.lIIIlIIIlIlII[1] = 0x76 ^ 0x33 ^ (0x28 ^ 9);
        e.lIIIlIIIlIlII[2] = (0xB8 ^ 0x85 ^ (0x4D ^ 0x3E)) & (70 + 53 - 74 + 164 ^ 62 + 73 - 82 + 102 ^ -1);
        e.lIIIlIIIlIlII[3] = 0xFFFFCFFF & 0x3F73;
        e.lIIIlIIIlIlII[4] = -(0xFFFFF0AF & 0x3FD9) & (0xFFFFBFFD & 0x7FFE);
        e.lIIIlIIIlIlII[5] = 1;
        e.lIIIlIIIlIlII[6] = 2;
        e.lIIIlIIIlIlII[7] = 3;
        e.lIIIlIIIlIlII[8] = 0x84 ^ 0x8C;
    }

    @Inject
    public e(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.I = lIIIlIIIlIlII[0];
        this.J = lIIIlIIIlIlII[1];
        this.K = lIIIlIIIlIlII[2];
        this.F = squireNightmareZone;
        this.G = squireNightmareZoneConfig;
        this.H = client;
    }

    private static String lIIllllIIlllIII(String lllllllllllllllIIIlIIIIlIIlIIIIl, String lllllllllllllllIIIlIIIIlIIlIIIII) {
        lllllllllllllllIIIlIIIIlIIlIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIlIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlIIIIlIIlIIlII = new StringBuilder();
        char[] lllllllllllllllIIIlIIIIlIIlIIIll = lllllllllllllllIIIlIIIIlIIlIIIII.toCharArray();
        int lllllllllllllllIIIlIIIIlIIlIIIlI = lIIIlIIIlIlII[2];
        char[] lllllllllllllllIIIlIIIIlIIIlllII = lllllllllllllllIIIlIIIIlIIlIIIIl.toCharArray();
        int lllllllllllllllIIIlIIIIlIIIllIll = lllllllllllllllIIIlIIIIlIIIlllII.length;
        int lllllllllllllllIIIlIIIIlIIIllIlI = lIIIlIIIlIlII[2];
        while (e.lIIllllIlIIIIll(lllllllllllllllIIIlIIIIlIIIllIlI, lllllllllllllllIIIlIIIIlIIIllIll)) {
            char lllllllllllllllIIIlIIIIlIIlIIlll = lllllllllllllllIIIlIIIIlIIIlllII[lllllllllllllllIIIlIIIIlIIIllIlI];
            lllllllllllllllIIIlIIIIlIIlIIlII.append((char)(lllllllllllllllIIIlIIIIlIIlIIlll ^ lllllllllllllllIIIlIIIIlIIlIIIll[lllllllllllllllIIIlIIIIlIIlIIIlI % lllllllllllllllIIIlIIIIlIIlIIIll.length]));
            0;
            ++lllllllllllllllIIIlIIIIlIIlIIIlI;
            ++lllllllllllllllIIIlIIIIlIIIllIlI;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlIIIIlIIlIIlII);
    }

    private static void lIIllllIIlllIIl() {
        lIIIlIIIlIIIl = new String[lIIIlIIIlIlII[7]];
        e.lIIIlIIIlIIIl[e.lIIIlIIIlIlII[2]] = e."Absorption potion is null D:";
        e.lIIIlIIIlIIIl[e.lIIIlIIIlIlII[5]] = e."Drink";
        e.lIIIlIIIlIIIl[e.lIIIlIIIlIlII[6]] = e."Absorption (";
    }

    private static boolean lIIllllIlIIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        e lllllllllllllllIIIlIIIIlIlIIlllI;
        if (e.lIIllllIlIIIIII(this.G.absorption())) {
            return lIIIlIIIlIlII[2];
        }
        if (e.lIIllllIlIIIIII(lllllllllllllllIIIlIIIIlIlIIlllI.H.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIlII[2];
        }
        int lllllllllllllllIIIlIIIIlIlIIllIl = Static.getClient().getVarbitValue(lIIIlIIIlIlII[3]);
        if (e.lIIllllIlIIIIIl(lllllllllllllllIIIlIIIIlIlIIlllI.G.overload()) && e.lIIllllIlIIIIII(lllllllllllllllIIIlIIIIlIlIIllIl)) {
            return lIIIlIIIlIlII[2];
        }
        int lllllllllllllllIIIlIIIIlIlIIllII = Static.getClient().getVarbitValue(lIIIlIIIlIlII[4]);
        if (e.lIIllllIlIIIIlI(lllllllllllllllIIIlIIIIlIlIIlllI.J, lllllllllllllllIIIlIIIIlIlIIllII)) {
            lllllllllllllllIIIlIIIIlIlIIlllI.K = lIIIlIIIlIlII[5];
        }
        if (e.lIIllllIlIIIIll(lllllllllllllllIIIlIIIIlIlIIlllI.I, lllllllllllllllIIIlIIIIlIlIIllII)) {
            lllllllllllllllIIIlIIIIlIlIIlllI.K = lIIIlIIIlIlII[2];
        }
        if (e.lIIllllIlIIIIII(lllllllllllllllIIIlIIIIlIlIIlllI.K ? 1 : 0)) {
            return lIIIlIIIlIlII[2];
        }
        Item lllllllllllllllIIIlIIIIlIlIIlIll = Inventory.getFirst(item -> item.getName().startsWith(lIIIlIIIlIIIl[lIIIlIIIlIlII[6]]));
        if (e.lIIllllIlIIIlII(lllllllllllllllIIIlIIIIlIlIIlIll)) {
            System.out.println(lIIIlIIIlIIIl[lIIIlIIIlIlII[2]]);
            return lIIIlIIIlIlII[2];
        }
        var3_3.interact(lIIIlIIIlIIIl[lIIIlIIIlIlII[5]]);
        return lIIIlIIIlIlII[5];
    }

    private static boolean lIIllllIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIllllIIllIlII(String lllllllllllllllIIIlIIIIlIlIIIIIl, String lllllllllllllllIIIlIIIIlIlIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIlIlIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlIIIIlIlIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlIIIIlIlIIIlIl.init(lIIIlIIIlIlII[6], lllllllllllllllIIIlIIIIlIlIIIllI);
            return new String(lllllllllllllllIIIlIIIIlIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlIIIIlIlIIIlII) {
            lllllllllllllllIIIlIIIIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIllllIIllIlll(String lllllllllllllllIIIlIIIIlIIllIllI, String lllllllllllllllIIIlIIIIlIIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIlIIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIIlIlII[8]), "DES");
            Cipher lllllllllllllllIIIlIIIIlIIlllIII = Cipher.getInstance("DES");
            lllllllllllllllIIIlIIIIlIIlllIII.init(lIIIlIIIlIlII[6], lllllllllllllllIIIlIIIIlIIlllIIl);
            return new String(lllllllllllllllIIIlIIIIlIIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIlIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlIIIIlIIllIlll) {
            lllllllllllllllIIIlIIIIlIIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllIlIIIlII(Object object) {
        return object == null;
    }
}

