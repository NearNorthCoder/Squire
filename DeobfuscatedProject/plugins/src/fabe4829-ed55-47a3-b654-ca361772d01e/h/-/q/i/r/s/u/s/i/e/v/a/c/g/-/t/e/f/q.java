/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

@TaskDesc(name="wave 1 to 6 Task", priority=10)
public class q
extends Task {
    private static /* synthetic */ int[] llIIlIIIIlII;
    private static /* synthetic */ String[] llIIlIIIIIll;
    private final /* synthetic */ f aA;
    private final /* synthetic */ SquireFightCavesConfig aB;
    private final /* synthetic */ n aC;

    static {
        q.lllllIIIIIIIll();
        q.lllllIIIIIIIlI();
    }

    private static boolean lllllIIIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIIIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllIIIIIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllIIIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public q(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aA = f2;
        this.aB = squireFightCavesConfig;
        this.aC = n2;
    }

    private static void lllllIIIIIIIlI() {
        llIIlIIIIIll = new String[llIIlIIIIlII[0]];
        q.llIIlIIIIIll[q.llIIlIIIIlII[1]] = q.llllIlllllllll("KEIB0NllfpZOWXXvkyvDPg==", "vBmfm");
        q.llIIlIIIIIll[q.llIIlIIIIlII[2]] = q.lllllIIIIIIIII("FxM9FCk9", "VgIuJ");
        q.llIIlIIIIIll[q.llIIlIIIIlII[3]] = q.llllIlllllllll("NE/pW9oq52OItyaxXbi+2a4+p3l/NZvh", "EQNBh");
        q.llIIlIIIIIll[q.llIIlIIIIlII[4]] = q.lllllIIIIIIIIl("kN8hiUdqwTA=", "bVklF");
        q.llIIlIIIIIll[q.llIIlIIIIlII[5]] = q.llllIlllllllll("yBrFBudMMIYhKzGgSwGnXFP80EoqIr+y", "arBDQ");
        q.llIIlIIIIIll[q.llIIlIIIIlII[6]] = q.lllllIIIIIIIII("Kz8mLBcB", "jKRMt");
    }

    private static String lllllIIIIIIIIl(String lllllllllllllllIlIlIIIIIIIIlIIll, String lllllllllllllllIlIlIIIIIIIIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), llIIlIIIIlII[12]), "DES");
            Cipher lllllllllllllllIlIlIIIIIIIIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIIIIIIlIlIl.init(llIIlIIIIlII[3], lllllllllllllllIlIlIIIIIIIIlIllI);
            return new String(lllllllllllllllIlIlIIIIIIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIIIIIIlIlII) {
            lllllllllllllllIlIlIIIIIIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static String lllllIIIIIIIII(String lllllllllllllllIlIIlllllllllIllI, String lllllllllllllllIlIIlllllllllIIII) {
        lllllllllllllllIlIIlllllllllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllllllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllllllllIlII = new StringBuilder();
        char[] lllllllllllllllIlIIlllllllllIIll = lllllllllllllllIlIIlllllllllIIII.toCharArray();
        int lllllllllllllllIlIIlllllllllIIlI = llIIlIIIIlII[1];
        char[] lllllllllllllllIlIIllllllllIllII = lllllllllllllllIlIIlllllllllIllI.toCharArray();
        int lllllllllllllllIlIIllllllllIlIll = lllllllllllllllIlIIllllllllIllII.length;
        int lllllllllllllllIlIIllllllllIlIlI = llIIlIIIIlII[1];
        while (q.lllllIIIIIlIll(lllllllllllllllIlIIllllllllIlIlI, lllllllllllllllIlIIllllllllIlIll)) {
            char lllllllllllllllIlIIlllllllllIlll = lllllllllllllllIlIIllllllllIllII[lllllllllllllllIlIIllllllllIlIlI];
            lllllllllllllllIlIIlllllllllIlII.append((char)(lllllllllllllllIlIIlllllllllIlll ^ lllllllllllllllIlIIlllllllllIIll[lllllllllllllllIlIIlllllllllIIlI % lllllllllllllllIlIIlllllllllIIll.length]));
            "".length();
            ++lllllllllllllllIlIIlllllllllIIlI;
            ++lllllllllllllllIlIIllllllllIlIlI;
            "".length();
            if ((0x6E ^ 0x15 ^ (0x25 ^ 0x5B)) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlllllllllIlII);
    }

    private static void lllllIIIIIIIll() {
        llIIlIIIIlII = new int[13];
        q.llIIlIIIIlII[0] = 0xA1 ^ 0xA7;
        q.llIIlIIIIlII[1] = (0x38 ^ 0x2C ^ (0x5D ^ 0x54)) & (0x7F ^ 0x62 ^ (0x65 ^ 0x4F) & ~(0x3D ^ 0x17) ^ -" ".length()) & ((0x25 ^ 3 ^ (0xA9 ^ 0x98)) & (0x51 ^ 0x24 ^ (0xE7 ^ 0x85) ^ -" ".length()) ^ -" ".length());
        q.llIIlIIIIlII[2] = " ".length();
        q.llIIlIIIIlII[3] = "  ".length();
        q.llIIlIIIIlII[4] = "   ".length();
        q.llIIlIIIIlII[5] = 0x4E ^ 0x4A;
        q.llIIlIIIIlII[6] = 36 + 132 - 69 + 51 ^ 133 + 124 - 200 + 90;
        q.llIIlIIIIlII[7] = -(0xFFFFF3FF & 0x5E83) & (0xFFFFDEB7 & 0x7FFA);
        q.llIIlIIIIlII[8] = -(0xFFFF9DF2 & 0x63CF) & (0xFFFF9FFF & 0x6DEF);
        q.llIIlIIIIlII[9] = -(0xFFFFDFEF & 0x6251) & (0xFFFFEF6F & 0x5EFF);
        q.llIIlIIIIlII[10] = 0xFFFFEDBD & 0x1E6E;
        q.llIIlIIIIlII[11] = -(0xFFFFBB33 & 0x77DF) & (0xFFFFFF7F & 0x3FBF);
        q.llIIlIIIIlII[12] = 0x2B ^ 0x5E ^ (5 ^ 0x78);
    }

    private static boolean lllllIIIIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIIIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lllllIIIIIIllI(Object object) {
        return object != null;
    }

    public boolean run() {
        int n2 = f.p();
        if (!q.lllllIIIIIIlII(n2, llIIlIIIIlII[0]) || q.lllllIIIIIIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llIIlIIIIlII[1];
        }
        SquireFightCavesPlugin.f = llIIlIIIIlII[2];
        NPC lllllllllllllllIlIlIIIIIIIlIIIll = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIlIIIIIIIIllIll;
            if ((!q.lllllIIIIIlIlI(nPC.getId(), llIIlIIIIlII[10]) || q.lllllIIIIIlIIl(nPC.getId(), llIIlIIIIlII[11])) && q.lllllIIIIIIlIl(lllllllllllllllIlIlIIIIIIIIllIll.isDead() ? 1 : 0)) {
                bl = llIIlIIIIlII[2];
                "".length();
                if (null != null) {
                    return ((0x1A ^ 0x28 ^ "   ".length()) & (0x80 ^ 0xB4 ^ (0x31 ^ 0x34) ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIlIIIIlII[1];
            }
            return bl;
        });
        NPC lllllllllllllllIlIlIIIIIIIlIIIlI = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIlIIIIIIIIlllIl;
            if ((!q.lllllIIIIIlIlI(nPC.getId(), llIIlIIIIlII[8]) || q.lllllIIIIIlIIl(nPC.getId(), llIIlIIIIlII[9])) && q.lllllIIIIIIlIl(lllllllllllllllIlIlIIIIIIIIlllIl.isDead() ? 1 : 0)) {
                bl = llIIlIIIIlII[2];
                "".length();
                if (((0xF9 ^ 0xB4) & ~(0x2C ^ 0x61)) != 0) {
                    return ((0xAB ^ 0x96) & ~(0xB2 ^ 0x8F)) != 0;
                }
            } else {
                bl = llIIlIIIIlII[1];
            }
            return bl;
        });
        NPC lllllllllllllllIlIlIIIIIIIlIIIIl = NPCs.getNearest(nPC -> {
            int n2;
            if (q.lllllIIIIIlIIl(nPC.getId(), llIIlIIIIlII[7]) && q.lllllIIIIIIlIl(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIIIIlII[2];
                "".length();
                if ("  ".length() == (0x42 ^ 0x4E ^ (0x59 ^ 0x51))) {
                    return ((87 + 132 - 160 + 187 ^ 65 + 84 - 110 + 124) & (0x8E ^ 0xC7 ^ (0x30 ^ 0x2C) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIlIIIIlII[1];
            }
            return n2 != 0;
        });
        if (q.lllllIIIIIIllI(lllllllllllllllIlIlIIIIIIIlIIIll) && (!q.lllllIIIIIIllI(Players.getLocal().getInteracting()) || q.lllllIIIIIIllI(Players.getLocal().getInteracting()) && q.lllllIIIIIIlll(Players.getLocal().getInteracting().getName(), lllllllllllllllIlIlIIIIIIIlIIIll.getName())) && q.lllllIIIIIIlIl(lllllllllllllllIlIlIIIIIIIlIIIll.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIll[llIIlIIIIlII[1]];
            lllllllllllllllIlIlIIIIIIIlIIIll.interact(llIIlIIIIIll[llIIlIIIIlII[2]]);
            return llIIlIIIIlII[1];
        }
        if (q.lllllIIIIIIllI(lllllllllllllllIlIlIIIIIIIlIIIIl) && q.lllllIIIIIlIII(Players.getLocal().getInteracting()) && q.lllllIIIIIIlIl(lllllllllllllllIlIlIIIIIIIlIIIIl.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIll[llIIlIIIIlII[3]];
            lllllllllllllllIlIlIIIIIIIlIIIIl.interact(llIIlIIIIIll[llIIlIIIIlII[4]]);
            return llIIlIIIIlII[1];
        }
        if (q.lllllIIIIIIllI(lllllllllllllllIlIlIIIIIIIlIIIlI) && q.lllllIIIIIlIII(Players.getLocal().getInteracting()) && q.lllllIIIIIIlIl(lllllllllllllllIlIlIIIIIIIlIIIlI.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIIIll[llIIlIIIIlII[5]];
            lllllllllllllllIlIlIIIIIIIlIIIlI.interact(llIIlIIIIIll[llIIlIIIIlII[6]]);
            return llIIlIIIIlII[1];
        }
        return llIIlIIIIlII[1];
    }

    private static String llllIlllllllll(String lllllllllllllllIlIlIIIIIIIIIIlII, String lllllllllllllllIlIlIIIIIIIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIIIIIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIIIIIIIlIII.init(llIIlIIIIlII[3], lllllllllllllllIlIlIIIIIIIIIlIIl);
            return new String(lllllllllllllllIlIlIIIIIIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIIIIIIIIlll) {
            lllllllllllllllIlIlIIIIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIIIlIlI(int n2, int n3) {
        return n2 != n3;
    }
}

