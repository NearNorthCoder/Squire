/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Removing net", priority=10, blocking=true)
public class i
extends Task {
    private static final /* synthetic */ int J;
    private static /* synthetic */ int[] lIlIIIIlIIlI;
    private static final /* synthetic */ int N;
    private static final /* synthetic */ int M;
    private static final /* synthetic */ int L;
    private static /* synthetic */ String[] lIlIIIIlIIIl;
    private final /* synthetic */ Client P;
    private final /* synthetic */ SquireDriftNet O;
    private static final /* synthetic */ int K;
    private static final /* synthetic */ int H;
    private static final /* synthetic */ int I;

    private static boolean llIlIIllllllII(Object object) {
        return object != null;
    }

    private static String llIlIIllllIIll(String lllllllllllllllIlllIIlllIIllIIll, String lllllllllllllllIlllIIlllIIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlllIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlllIIllIlIl.init(lIlIIIIlIIlI[4], lllllllllllllllIlllIIlllIIllIllI);
            return new String(lllllllllllllllIlllIIlllIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllIIllIlII) {
            lllllllllllllllIlllIIlllIIllIlII.printStackTrace();
            return null;
        }
    }

    @Inject
    public i(SquireDriftNet squireDriftNet, Client client) {
        this.O = squireDriftNet;
        this.P = client;
    }

    private static boolean llIlIIlllllIll(int n, int n2) {
        return n == n2;
    }

    private static void llIlIIllllIlll() {
        lIlIIIIlIIlI = new int[14];
        i.lIlIIIIlIIlI[0] = (8 ^ 0xE) & ~(0x5E ^ 0x58);
        i.lIlIIIIlIIlI[1] = 0xFFFF9EF5 & 0x77BF;
        i.lIlIIIIlIIlI[2] = -(0xFFFFFDE1 & 0x6A1F) & (0xFFFFFFFF & 0x7EB7);
        i.lIlIIIIlIIlI[3] = -(0xFFFFEEE1 & 0x5D3F) & (0xFFFFDF7F & 0x6EFF);
        i.lIlIIIIlIIlI[4] = 2;
        i.lIlIIIIlIIlI[5] = 0x51 ^ 0x3D ^ (0xF3 ^ 0x92);
        i.lIlIIIIlIIlI[6] = 0x16 ^ 0x62 ^ (0xBB ^ 0xC5);
        i.lIlIIIIlIIlI[7] = 1;
        i.lIlIIIIlIIlI[8] = 3;
        i.lIlIIIIlIIlI[9] = 0xAF ^ 0xC6 ^ (0x49 ^ 0x27);
        i.lIlIIIIlIIlI[10] = 0x3D ^ 0x39;
        i.lIlIIIIlIIlI[11] = 0x5F ^ 0x5A;
        i.lIlIIIIlIIlI[12] = 0xA ^ 0xC;
        i.lIlIIIIlIIlI[13] = 0x43 ^ 0x4B;
    }

    private static boolean llIlIIlllllIII(int n) {
        return n == 0;
    }

    private static boolean llIlIIlllllllI(int n, int n2) {
        return n < n2;
    }

    static {
        i.llIlIIllllIlll();
        i.llIlIIllllIllI();
        J = lIlIIIIlIIlI[3];
        H = lIlIIIIlIIlI[1];
        M = lIlIIIIlIIlI[5];
        N = lIlIIIIlIIlI[9];
        K = lIlIIIIlIIlI[4];
        L = lIlIIIIlIIlI[5];
        I = lIlIIIIlIIlI[2];
    }

    private static boolean llIlIIllllllIl(int n) {
        return n != 0;
    }

    public boolean run() {
        if (i.llIlIIlllllIII(this.P.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIlIIlI[0];
        }
        int lllllllllllllllIlllIIlllIllIIllI = Static.getClient().getVarbitValue(lIlIIIIlIIlI[1]);
        int lllllllllllllllIlllIIlllIllIIlIl = Static.getClient().getVarbitValue(lIlIIIIlIIlI[2]);
        Widget lllllllllllllllIlllIIlllIllIIlII = Widgets.get((int)lIlIIIIlIIlI[3], (int)lIlIIIIlIIlI[4], (int)lIlIIIIlIIlI[5]);
        if (i.llIlIIlllllIIl(lllllllllllllllIlllIIlllIllIIlII)) {
            TileObject lllllllllllllllIlllIIlllIllIIIll;
            if ((!i.llIlIIlllllIlI(lllllllllllllllIlllIIlllIllIIllI, lIlIIIIlIIlI[6]) || i.llIlIIlllllIll(lllllllllllllllIlllIIlllIllIIlIl, lIlIIIIlIIlI[6])) && i.llIlIIllllllII(lllllllllllllllIlllIIlllIllIIIll = TileObjects.getNearest(tileObject -> {
                int n;
                if (i.llIlIIllllllIl(tileObject.getName().equals(lIlIIIIlIIIl[lIlIIIIlIIlI[12]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIIlIIlI[7]];
                    stringArray[i.lIlIIIIlIIlI[0]] = lIlIIIIlIIIl[lIlIIIIlIIlI[9]];
                    if (i.llIlIIllllllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = lIlIIIIlIIlI[7];
                        0;
                        if (((0x5E ^ 0x10) & ~(0x4E ^ 0)) != 3) return n != 0;
                        return ((0x6A ^ 0x7B) & ~(0x5C ^ 0x4D)) != 0;
                    }
                }
                n = lIlIIIIlIIlI[0];
                return n != 0;
            }))) {
                lllllllllllllllIlllIIlllIllIIIll.interact(lIlIIIIlIIIl[lIlIIIIlIIlI[0]]);
                return lIlIIIIlIIlI[7];
            }
            return lIlIIIIlIIlI[0];
        }
        Widget lllllllllllllllIlllIIlllIllIIIll = Widgets.get((int)lIlIIIIlIIlI[3], (int)lIlIIIIlIIlI[5]);
        if (i.llIlIIllllllII(lllllllllllllllIlllIIlllIllIIIll) && i.llIlIIllllllIl(lllllllllllllllIlllIIlllIllIIIll.isVisible() ? 1 : 0)) {
            i lllllllllllllllIlllIIlllIllIIlll;
            lllllllllllllllIlllIIlllIllIIIll.interact(lIlIIIIlIIIl[lIlIIIIlIIlI[7]]);
            System.out.println(lIlIIIIlIIIl[lIlIIIIlIIlI[4]]);
            lllllllllllllllIlllIIlllIllIIlll.O.a(lIlIIIIlIIlI[7]);
            lllllllllllllllIlllIIlllIllIIlII.interact(lIlIIIIlIIIl[lIlIIIIlIIlI[8]]);
            return lIlIIIIlIIlI[7];
        }
        Widget lllllllllllllllIlllIIlllIllIIIlI = Widgets.get((int)lIlIIIIlIIlI[3], (int)lIlIIIIlIIlI[9]);
        if (i.llIlIIllllllII(lllllllllllllllIlllIIlllIllIIIlI)) {
            System.out.println(lIlIIIIlIIIl[lIlIIIIlIIlI[10]]);
            lllllllllllllllIlllIIlllIllIIIlI.interact(lIlIIIIlIIIl[lIlIIIIlIIlI[11]]);
            return lIlIIIIlIIlI[7];
        }
        return lIlIIIIlIIlI[0];
    }

    private static boolean llIlIIlllllIIl(Object object) {
        return object == null;
    }

    private static boolean llIlIIlllllIlI(int n, int n2) {
        return n != n2;
    }

    private static void llIlIIllllIllI() {
        lIlIIIIlIIIl = new String[lIlIIIIlIIlI[13]];
        i.lIlIIIIlIIIl[i.lIlIIIIlIIlI[0]] = i."Harvest";
        i.lIlIIIIlIIIl[i.lIlIIIIlIIlI[7]] = i."Bank all";
        i.lIlIIIIlIIIl[i.lIlIIIIlIIlI[4]] = i."bankAllTextWidget";
        i.lIlIIIIlIIIl[i.lIlIIIIlIIlI[8]] = i."Close";
        i.lIlIIIIlIIIl[i.lIlIIIIlIIlI[10]] = i."bankAllWidget";
        i.lIlIIIIlIIIl[i.lIlIIIIlIIlI[11]] = i."Bank all";
        i.lIlIIIIlIIIl[i.lIlIIIIlIIlI[12]] = i."Drift net (full)";
        i.lIlIIIIlIIIl[i.lIlIIIIlIIlI[9]] = i."Harvest";
    }

    private static String llIlIIllllIlIl(String lllllllllllllllIlllIIlllIlIIIIll, String lllllllllllllllIlllIIlllIlIIIIlI) {
        lllllllllllllllIlllIIlllIlIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIlllIlIIIllI = new StringBuilder();
        char[] lllllllllllllllIlllIIlllIlIIIlIl = lllllllllllllllIlllIIlllIlIIIIlI.toCharArray();
        int lllllllllllllllIlllIIlllIlIIIlII = lIlIIIIlIIlI[0];
        char[] lllllllllllllllIlllIIlllIIlllllI = lllllllllllllllIlllIIlllIlIIIIll.toCharArray();
        int lllllllllllllllIlllIIlllIIllllIl = lllllllllllllllIlllIIlllIIlllllI.length;
        int lllllllllllllllIlllIIlllIIllllII = lIlIIIIlIIlI[0];
        while (i.llIlIIlllllllI(lllllllllllllllIlllIIlllIIllllII, lllllllllllllllIlllIIlllIIllllIl)) {
            char lllllllllllllllIlllIIlllIlIIlIIl = lllllllllllllllIlllIIlllIIlllllI[lllllllllllllllIlllIIlllIIllllII];
            lllllllllllllllIlllIIlllIlIIIllI.append((char)(lllllllllllllllIlllIIlllIlIIlIIl ^ lllllllllllllllIlllIIlllIlIIIlIl[lllllllllllllllIlllIIlllIlIIIlII % lllllllllllllllIlllIIlllIlIIIlIl.length]));
            0;
            ++lllllllllllllllIlllIIlllIlIIIlII;
            ++lllllllllllllllIlllIIlllIIllllII;
            0;
            if ((0xCD ^ 0xB6 ^ 54 + 64 - 55 + 64) > -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIlllIlIIIllI);
    }

    private static String llIlIIlllIllII(String lllllllllllllllIlllIIlllIlIllIII, String lllllllllllllllIlllIIlllIlIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIlI[13]), "DES");
            Cipher lllllllllllllllIlllIIlllIlIllIlI = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllIlIllIlI.init(lIlIIIIlIIlI[4], lllllllllllllllIlllIIlllIlIllIll);
            return new String(lllllllllllllllIlllIIlllIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllIlIllIIl) {
            lllllllllllllllIlllIIlllIlIllIIl.printStackTrace();
            return null;
        }
    }
}

