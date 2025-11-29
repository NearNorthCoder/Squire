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
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
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
import net.unethicalite.api.game.Combat;

@TaskDesc(name="wave 7 to 14 Task", priority=10)
public class s
extends Task {
    private final /* synthetic */ SquireFightCavesConfig aH;
    private static /* synthetic */ String[] llIIlIIIlIll;
    private final /* synthetic */ n aI;
    private final /* synthetic */ f aG;
    private static /* synthetic */ int[] llIIlIIIllIl;

    private static boolean lllllIIIllIIll(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public s(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.aG = f2;
        this.aH = squireFightCavesConfig;
        this.aI = n2;
    }

    public boolean run() {
        int n2 = f.p();
        if (!s.lllllIIIllIIIl(n2, llIIlIIIllIl[0]) || s.lllllIIIllIIlI(n2, llIIlIIIllIl[1])) {
            return llIIlIIIllIl[2];
        }
        SquireFightCavesPlugin.f = llIIlIIIllIl[3];
        if (s.lllllIIIllIIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
        }
        n.G();
        NPC lllllllllllllllIlIIlllllIIIlllII = NPCs.getNearest(nPC -> {
            int n2;
            NPC lllllllllllllllIlIIlllllIIIIlIIl;
            if ((!s.lllllIIIlllIII(nPC.getId(), llIIlIIIllIl[14]) || s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[15])) && s.lllllIIIllIlIl(lllllllllllllllIlIIlllllIIIIlIIl.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllIl[4]) && s.lllllIIIllIllI(lllllllllllllllIlIIlllllIIIIlIIl.isDead() ? 1 : 0)) {
                n2 = llIIlIIIllIl[3];
                "".length();
                if (" ".length() == (0x35 ^ 0x31)) {
                    return ((0x80 ^ 0xA4) & ~(0x36 ^ 0x12)) != 0;
                }
            } else {
                n2 = llIIlIIIllIl[2];
            }
            return n2 != 0;
        });
        NPC lllllllllllllllIlIIlllllIIIllIlI = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIIlllllIIIIlIll;
            if ((!s.lllllIIIlllIII(nPC.getId(), llIIlIIIllIl[12]) || s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[13])) && s.lllllIIIllIllI(lllllllllllllllIlIIlllllIIIIlIll.isDead() ? 1 : 0)) {
                bl = llIIlIIIllIl[3];
                "".length();
                if ((123 + 140 - 233 + 112 ^ 65 + 20 - 2 + 55) > (0x4C ^ 0x32 ^ (0xF4 ^ 0x8E))) {
                    return ((0x11 ^ 0x2C ^ (0xC9 ^ 0xC2)) & (0x4D ^ 0x1C ^ (9 ^ 0x6E) ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIlIIIllIl[2];
            }
            return bl;
        });
        NPC lllllllllllllllIlIIlllllIIIllIII = NPCs.getNearest(nPC -> {
            int n2;
            if (s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[11]) && s.lllllIIIllIllI(nPC.isDead() ? 1 : 0)) {
                n2 = llIIlIIIllIl[3];
                "".length();
                if ((0xC2 ^ 0xC6) > (0x4E ^ 0x4A)) {
                    return ((0x3D ^ 0x69) & ~(0x45 ^ 0x11)) != 0;
                }
            } else {
                n2 = llIIlIIIllIl[2];
            }
            return n2 != 0;
        });
        NPC lllllllllllllllIlIIlllllIIIlIlll = NPCs.getNearest(nPC -> {
            boolean bl;
            NPC lllllllllllllllIlIIlllllIIIlIIll;
            if ((!s.lllllIIIlllIII(nPC.getId(), llIIlIIIllIl[9]) || s.lllllIIIlllIIl(nPC.getId(), llIIlIIIllIl[10])) && s.lllllIIIllIllI(lllllllllllllllIlIIlllllIIIlIIll.isDead() ? 1 : 0)) {
                bl = llIIlIIIllIl[3];
                "".length();
                if ("   ".length() < "   ".length()) {
                    return ((0xAB ^ 0xA2) & ~(0x13 ^ 0x1A)) != 0;
                }
            } else {
                bl = llIIlIIIllIl[2];
            }
            return bl;
        });
        if (s.lllllIIIllIlII(lllllllllllllllIlIIlllllIIIlllII) && s.lllllIIIllIlIl(lllllllllllllllIlIIlllllIIIlllII.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllIl[4]) && (!s.lllllIIIllIlII(Players.getLocal().getInteracting()) || s.lllllIIIllIlII(Players.getLocal().getInteracting()) && s.lllllIIIllIIll(Players.getLocal().getInteracting().getName(), lllllllllllllllIlIIlllllIIIlllII.getName())) && s.lllllIIIllIllI(lllllllllllllllIlIIlllllIIIlllII.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[2]];
            lllllllllllllllIlIIlllllIIIlllII.interact(llIIlIIIlIll[llIIlIIIllIl[3]]);
            return llIIlIIIllIl[2];
        }
        if (s.lllllIIIllIlII(lllllllllllllllIlIIlllllIIIlIlll) && s.lllllIIIllIlll(lllllllllllllllIlIIlllllIIIlllII) && s.lllllIIIllIlll(Players.getLocal().getInteracting()) && s.lllllIIIllIllI(lllllllllllllllIlIIlllllIIIlIlll.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[5]];
            lllllllllllllllIlIIlllllIIIlIlll.interact(llIIlIIIlIll[llIIlIIIllIl[6]]);
            return llIIlIIIllIl[2];
        }
        if (s.lllllIIIllIlII(lllllllllllllllIlIIlllllIIIllIII) && s.lllllIIIllIlll(lllllllllllllllIlIIlllllIIIlllII) && (!s.lllllIIIllIlII(Players.getLocal().getInteracting()) || s.lllllIIIllIlII(Players.getLocal().getInteracting()) && s.lllllIIIllIIll(Players.getLocal().getInteracting().getName(), lllllllllllllllIlIIlllllIIIllIII.getName())) && s.lllllIIIllIllI(lllllllllllllllIlIIlllllIIIllIII.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[7]];
            lllllllllllllllIlIIlllllIIIllIII.interact(llIIlIIIlIll[llIIlIIIllIl[8]]);
            return llIIlIIIllIl[2];
        }
        if (s.lllllIIIllIlII(lllllllllllllllIlIIlllllIIIllIlI) && s.lllllIIIllIlll(lllllllllllllllIlIIlllllIIIlllII) && s.lllllIIIllIlll(Players.getLocal().getInteracting()) && s.lllllIIIllIllI(lllllllllllllllIlIIlllllIIIllIlI.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.h = llIIlIIIlIll[llIIlIIIllIl[4]];
            lllllllllllllllIlIIlllllIIIllIlI.interact(llIIlIIIlIll[llIIlIIIllIl[0]]);
            return llIIlIIIllIl[2];
        }
        return llIIlIIIllIl[2];
    }

    private static boolean lllllIIIllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIIIlllIII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lllllIIIlIIIII(String lllllllllllllllIlIIllllIlIllllll, String lllllllllllllllIlIIllllIlIlllllI) {
        lllllllllllllllIlIIllllIlIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllllIlIllllIl = new StringBuilder();
        char[] lllllllllllllllIlIIllllIlIlllIll = lllllllllllllllIlIIllllIlIlllllI.toCharArray();
        int lllllllllllllllIlIIllllIlIlllIIl = llIIlIIIllIl[2];
        char[] lllllllllllllllIlIIllllIlIlIllIl = lllllllllllllllIlIIllllIlIllllll.toCharArray();
        int lllllllllllllllIlIIllllIlIlIlIll = lllllllllllllllIlIIllllIlIlIllIl.length;
        int lllllllllllllllIlIIllllIlIlIlIIl = llIIlIIIllIl[2];
        while (s.lllllIIIlllIlI(lllllllllllllllIlIIllllIlIlIlIIl, lllllllllllllllIlIIllllIlIlIlIll)) {
            char lllllllllllllllIlIIllllIllIIIIIl = lllllllllllllllIlIIllllIlIlIllIl[lllllllllllllllIlIIllllIlIlIlIIl];
            lllllllllllllllIlIIllllIlIllllIl.append((char)(lllllllllllllllIlIIllllIllIIIIIl ^ lllllllllllllllIlIIllllIlIlllIll[lllllllllllllllIlIIllllIlIlllIIl % lllllllllllllllIlIIllllIlIlllIll.length]));
            "".length();
            ++lllllllllllllllIlIIllllIlIlllIIl;
            ++lllllllllllllllIlIIllllIlIlIlIIl;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIllllIlIllllIl);
    }

    private static boolean lllllIIIllIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIIIlIIIIl(String lllllllllllllllIlIIllllIllIllllI, String lllllllllllllllIlIIllllIllIlllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIlllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIllIlllII.getBytes(StandardCharsets.UTF_8)), llIIlIIIllIl[16]), "DES");
            Cipher lllllllllllllllIlIIllllIlllIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllIlllIIlIl.init(llIIlIIIllIl[5], lllllllllllllllIlIIllllIlllIlIII);
            return new String(lllllllllllllllIlIIllllIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllIlllIIIll) {
            lllllllllllllllIlIIllllIlllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIllIlII(Object object) {
        return object != null;
    }

    static {
        s.lllllIIIlIllll();
        s.lllllIIIlIIIlI();
    }

    private static boolean lllllIIIllIlll(Object object) {
        return object == null;
    }

    private static void lllllIIIlIllll() {
        llIIlIIIllIl = new int[17];
        s.llIIlIIIllIl[0] = 0xDB ^ 0xAD ^ (0xD ^ 0x7C);
        s.llIIlIIIllIl[1] = 0x35 ^ 0x3B;
        s.llIIlIIIllIl[2] = (0x71 ^ 0x47) & ~(0xBF ^ 0x89);
        s.llIIlIIIllIl[3] = " ".length();
        s.llIIlIIIllIl[4] = 123 + 110 - 69 + 21 ^ 94 + 164 - 248 + 181;
        s.llIIlIIIllIl[5] = "  ".length();
        s.llIIlIIIllIl[6] = "   ".length();
        s.llIIlIIIllIl[7] = 154 + 17 - 36 + 38 ^ 126 + 57 - 43 + 29;
        s.llIIlIIIllIl[8] = 0x52 ^ 0x57;
        s.llIIlIIIllIl[9] = -(0xFFFFCADF & 0x75A1) & (0xFFFFFCB7 & 0x4FF9);
        s.llIIlIIIllIl[10] = 0xFFFFDFFB & 0x2C36;
        s.llIIlIIIllIl[11] = 0xFFFF8EB4 & 0x7D7B;
        s.llIIlIIIllIl[12] = -(0xFFFFF003 & 0x2FFE) & (0xFFFFFDBF & 0x2E6F);
        s.llIIlIIIllIl[13] = 0xFFFF9CAF & 0x6F7F;
        s.llIIlIIIllIl[14] = 0xFFFFAEFE & 0x5D2D;
        s.llIIlIIIllIl[15] = -(0xFFFFE3D5 & 0x3D3B) & (0xFFFFADBD & 0x7F7F);
        s.llIIlIIIllIl[16] = 173 + 60 - 230 + 199 ^ 141 + 0 - 45 + 98;
    }

    private static boolean lllllIIIlllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllllIIIlIIIlI() {
        llIIlIIIlIll = new String[llIIlIIIllIl[16]];
        s.llIIlIIIlIll[s.llIIlIIIllIl[2]] = s.lllllIIIIlllll("v5UZosv7lF7V1IaRedk3GQ==", "HhWot");
        s.llIIlIIIlIll[s.llIIlIIIllIl[3]] = s.lllllIIIlIIIII("Jw4NDhIN", "fzyoq");
        s.llIIlIIIlIll[s.llIIlIIIllIl[5]] = s.lllllIIIlIIIIl("rHaN3rg+dTQr+bQJ0RQ92g==", "OvenP");
        s.llIIlIIIlIll[s.llIIlIIIllIl[6]] = s.lllllIIIIlllll("IM1L0W/OxlU=", "DLmFs");
        s.llIIlIIIlIll[s.llIIlIIIllIl[7]] = s.lllllIIIlIIIII("Nxo3NRUdBy0zVgUDIjgaVgwvOxQ=", "vnCTv");
        s.llIIlIIIlIll[s.llIIlIIIllIl[8]] = s.lllllIIIlIIIII("NjcgOC0c", "wCTYN");
        s.llIIlIIIlIll[s.llIIlIIIllIl[4]] = s.lllllIIIlIIIII("NhACCw4cDRgNTRUNEUoPGwsU", "wdvjm");
        s.llIIlIIIlIll[s.llIIlIIIllIl[0]] = s.lllllIIIIlllll("P4QNypim2MA=", "uIasW");
    }

    private static boolean lllllIIIllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllllIIIIlllll(String lllllllllllllllIlIIllllIllllIlIl, String lllllllllllllllIlIIllllIllllIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllIllllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllIllllllIl.init(llIIlIIIllIl[5], lllllllllllllllIlIIllllIllllllll);
            return new String(lllllllllllllllIlIIllllIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIllllIlllllIll) {
            lllllllllllllllIlIIllllIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIllIlIl(int n2, int n3) {
        return n2 <= n3;
    }
}

