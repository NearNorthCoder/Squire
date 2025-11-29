package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
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
import net.unethicalite.client.Static;
@TaskDesc(name = "wave 15 to 30 Task", priority = 10)
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.p  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/p.class */
public class p extends Task {
    private final /* synthetic */ n az;
    private final /* synthetic */ f ax;
    private static /* synthetic */ int[] llIIIlllIIlI;
    private final /* synthetic */ SquireFightCavesConfig ay;
    private static /* synthetic */ String[] llIIIlllIIIl;

    static {
        llllIllIllIIll();
        llllIllIllIIlI();
    }

    private static String llllIllIllIIII(String lllllllllllllllIlIlIIIlIlIIlIIlI, String lllllllllllllllIlIlIIIlIlIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlllIIlI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIlIlIIlIIll) {
            lllllllllllllllIlIlIIIlIlIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllIlllllI(int i, int i2) {
        return i != i2;
    }

    private static boolean llllIllIlllIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v185, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v209, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    public boolean run() {
        int p = f.p();
        if (!llllIllIllIlII(p, llIIIlllIIlI[0]) || llllIllIllIlIl(p, llIIIlllIIlI[1])) {
            return llIIIlllIIlI[2];
        }
        SquireFightCavesPlugin.f = llIIIlllIIlI[3];
        if (llllIllIllIllI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if ((!llllIllIlllllI(npc.getId(), llIIIlllIIlI[25]) || llllIllIlllIII(npc.getId(), llIIIlllIIlI[26])) && llllIllIllIlIl(npc.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIlllIIlI[5]) && llllIllIlllIlI(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIIlllIIlI[3];
                "".length();
                return ((149 ^ 197) ^ (58 ^ 110)) <= " ".length() ? ((((89 + 38) - 36) + 147) ^ (((122 + 175) - 295) + 188)) & (((((71 + 101) - 84) + 39) ^ (120 ^ 87)) ^ (-" ".length())) : r0;
            }
            return llIIIlllIIlI[2];
        });
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            if ((!llllIllIlllllI(npc2.getId(), llIIIlllIIlI[23]) || llllIllIlllIII(npc2.getId(), llIIIlllIIlI[24])) && llllIllIlllIlI(npc2.isDead() ? 1 : 0)) {
                ?? r0 = llIIIlllIIlI[3];
                "".length();
                return "   ".length() <= 0 ? ((((150 + 108) - 252) + 241) ^ (((93 + 109) - 42) + 25)) & (((35 ^ 46) ^ (80 ^ 19)) ^ (-" ".length())) : r0;
            }
            return llIIIlllIIlI[2];
        });
        NPC nearest3 = NPCs.getNearest(npc3 -> {
            if (llllIllIlllIII(npc3.getId(), llIIIlllIIlI[22]) && llllIllIlllIlI(npc3.isDead() ? 1 : 0)) {
                ?? r0 = llIIIlllIIlI[3];
                "".length();
                return ((106 ^ 92) ^ (45 ^ 31)) < " ".length() ? ((((145 + 139) - 137) + 97) ^ (((38 + 131) - 103) + 97)) & (((44 ^ 109) ^ (167 ^ 177)) ^ (-" ".length())) : r0;
            }
            return llIIIlllIIlI[2];
        });
        NPC nearest4 = NPCs.getNearest(npc4 -> {
            if ((!llllIllIlllllI(npc4.getId(), llIIIlllIIlI[18]) || llllIllIlllIII(npc4.getId(), llIIIlllIIlI[19])) && llllIllIlllIlI(npc4.isDead() ? 1 : 0)) {
                ?? r0 = llIIIlllIIlI[3];
                "".length();
                return (((74 ^ 108) ^ (126 ^ 23)) & (((69 ^ 9) ^ "   ".length()) ^ (-" ".length()))) > ((59 ^ 62) ^ " ".length()) ? ((52 ^ 82) ^ (78 ^ 51)) & (((((83 + 80) - 12) + 21) ^ (((178 + 111) - 222) + 116)) ^ (-" ".length())) : r0;
            }
            return llIIIlllIIlI[2];
        });
        NPC nearest5 = NPCs.getNearest(npc5 -> {
            if ((!llllIllIlllllI(npc5.getId(), llIIIlllIIlI[20]) || llllIllIlllIII(npc5.getId(), llIIIlllIIlI[21])) && llllIllIlllIlI(npc5.isDead() ? 1 : 0)) {
                ?? r0 = llIIIlllIIlI[3];
                "".length();
                return ((((4 + 12) - (-73)) + 56) ^ (((18 + 120) - 10) + 21)) <= 0 ? ((191 ^ 199) ^ (7 ^ 48)) & (((43 ^ 82) ^ (189 ^ 139)) ^ (-" ".length())) : r0;
            }
            return llIIIlllIIlI[2];
        });
        if (!llllIllIllIlll(nearest4) || !llllIllIllIlll(nearest5) || !llllIllIlllIII(f.r(), f.u()) || !llllIllIlllIIl(f.r()) || !llllIllIlllIIl(f.u()) || llllIllIllIlll(NPCs.getNearest(npc6 -> {
            if (!(llllIllIlllllI(npc6.getId(), llIIIlllIIlI[18]) && llllIllIlllllI(npc6.getId(), llIIIlllIIlI[19]) && llllIllIlllllI(npc6.getId(), llIIIlllIIlI[20]) && !llllIllIlllIII(npc6.getId(), llIIIlllIIlI[21])) && llllIllIlllIlI(npc6.isDead() ? 1 : 0)) {
                ?? r0 = llIIIlllIIlI[3];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlllIIlI[2];
        }))) {
        }
        n.G();
        if (llllIllIlllIII(f.D, llIIIlllIIlI[4]) && llllIllIllIlll(nearest5) && llllIllIlllIlI(nearest5.isDead() ? 1 : 0) && llllIllIlllIll(Players.getLocal().getInteracting())) {
            SquireFightCavesPlugin.f0h = llIIIlllIIIl[llIIIlllIIlI[2]];
            nearest5.interact(llIIIlllIIIl[llIIIlllIIlI[3]]);
            return llIIIlllIIlI[2];
        } else if (llllIllIllIlll(nearest) && llllIllIllIlIl(nearest.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIlllIIlI[5]) && ((!llllIllIlllIlI(nearest.isMoving() ? 1 : 0) || llllIllIllllII(nearest.getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) && ((!llllIllIllIlll(Players.getLocal().getInteracting()) || (llllIllIllIlll(Players.getLocal().getInteracting()) && llllIllIllIllI(Players.getLocal().getInteracting().getName(), nearest.getName()))) && llllIllIlllIlI(nearest.isDead() ? 1 : 0)))) {
            SquireFightCavesPlugin.f0h = llIIIlllIIIl[llIIIlllIIlI[6]];
            nearest.interact(llIIIlllIIIl[llIIIlllIIlI[7]]);
            return llIIIlllIIlI[2];
        } else if (llllIllIllIlll(nearest5) && llllIllIllIlll(nearest4) && llllIllIlllIll(Players.getLocal().getInteracting()) && llllIllIlllIlI(n.c(nearest5.getWorldArea().toWorldPointList()) ? 1 : 0) && llllIllIllllIl(nearest5.getWorldLocation().distanceTo(n.an), llIIIlllIIlI[8]) && llllIllIllllIl(nearest5.getWorldLocation().distanceTo(n.am), llIIIlllIIlI[8]) && llllIllIlllIlI(nearest5.isMoving() ? 1 : 0) && llllIllIllllIl(Players.getLocal().getWorldLocation().distanceTo(nearest5.getWorldLocation()), llIIIlllIIlI[9])) {
            SquireFightCavesPlugin.f0h = llIIIlllIIIl[llIIIlllIIlI[5]];
            nearest4.interact(llIIIlllIIIl[llIIIlllIIlI[9]]);
            return llIIIlllIIlI[2];
        } else {
            if (llllIllIllIlll(nearest5) && llllIllIlllIll(nearest) && llllIllIlllllI(f.D, llIIIlllIIlI[4]) && llllIllIllIlIl(nearest5.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIlllIIlI[10]) && ((!llllIllIllIlll(Players.getLocal().getInteracting()) || ((llllIllIllllII(n.c(nearest5.getWorldArea().toWorldPointList()) ? 1 : 0) && !llllIllIllllII(n.F() ? 1 : 0)) || (llllIllIllIlll(Players.getLocal().getInteracting()) && llllIllIllIllI(Players.getLocal().getInteracting().getName(), nearest5.getName())))) && llllIllIlllIlI(nearest5.isDead() ? 1 : 0))) {
                if (!llllIllIlllIlI(n.c(nearest5.getWorldArea().toWorldPointList()) ? 1 : 0) || llllIllIllllII(nearest5.isMoving() ? 1 : 0)) {
                    n.e(nearest5);
                }
                if (llllIllIlllIlI(n.c(nearest5.getWorldArea().toWorldPointList()) ? 1 : 0) && llllIllIlllIlI(Players.getLocal().isMoving() ? 1 : 0) && llllIllIlllIlI(nearest5.isMoving() ? 1 : 0)) {
                    SquireFightCavesPlugin.f0h = llIIIlllIIIl[llIIIlllIIlI[11]];
                    nearest5.interact(llIIIlllIIIl[llIIIlllIIlI[8]]);
                    return llIIIlllIIlI[2];
                }
            }
            if (llllIllIllIlll(nearest4) && llllIllIlllIll(nearest5) && llllIllIlllIll(Players.getLocal().getInteracting()) && llllIllIlllIlI(nearest4.isDead() ? 1 : 0)) {
                SquireFightCavesPlugin.f0h = llIIIlllIIIl[llIIIlllIIlI[12]];
                nearest4.interact(llIIIlllIIIl[llIIIlllIIlI[13]]);
                return llIIIlllIIlI[2];
            } else if (llllIllIllIlll(nearest3) && llllIllIlllIll(nearest5) && ((!llllIllIllIlll(Players.getLocal().getInteracting()) || (llllIllIllIlll(Players.getLocal().getInteracting()) && llllIllIllIllI(Players.getLocal().getInteracting().getName(), nearest3.getName()))) && llllIllIlllIlI(nearest3.isDead() ? 1 : 0))) {
                SquireFightCavesPlugin.f0h = llIIIlllIIIl[llIIIlllIIlI[14]];
                nearest3.interact(llIIIlllIIIl[llIIIlllIIlI[15]]);
                return llIIIlllIIlI[2];
            } else if (llllIllIllIlll(nearest2) && llllIllIlllIll(nearest5) && llllIllIlllIll(Players.getLocal().getInteracting()) && llllIllIlllIlI(nearest2.isDead() ? 1 : 0)) {
                SquireFightCavesPlugin.f0h = llIIIlllIIIl[llIIIlllIIlI[16]];
                nearest2.interact(llIIIlllIIIl[llIIIlllIIlI[17]]);
                return llIIIlllIIlI[2];
            } else {
                return llIIIlllIIlI[2];
            }
        }
    }

    private static boolean llllIllIlllIIl(int i) {
        return i > 0;
    }

    private static void llllIllIllIIll() {
        llIIIlllIIlI = new int[27];
        llIIIlllIIlI[0] = 160 ^ 191;
        llIIIlllIIlI[1] = 67 ^ 77;
        llIIIlllIIlI[2] = ((87 ^ 104) ^ (38 ^ 94)) & (((((93 + 66) - (-48)) + 26) ^ (((26 + 166) - 145) + 127)) ^ (-" ".length()));
        llIIIlllIIlI[3] = " ".length();
        llIIIlllIIlI[4] = (((6 + 33) - (-87)) + 44) ^ (((160 + 43) - 182) + 159);
        llIIIlllIIlI[5] = (95 ^ 114) ^ (139 ^ 162);
        llIIIlllIIlI[6] = "  ".length();
        llIIIlllIIlI[7] = "   ".length();
        llIIIlllIIlI[8] = (((42 + 107) - 124) + 172) ^ (((84 + 60) - (-13)) + 37);
        llIIIlllIIlI[9] = (((11 + 89) - 20) + 56) ^ (((105 + 126) - 110) + 20);
        llIIIlllIIlI[10] = 173 ^ 185;
        llIIIlllIIlI[11] = (116 ^ 22) ^ (39 ^ 67);
        llIIIlllIIlI[12] = 41 ^ 33;
        llIIIlllIIlI[13] = 10 ^ 3;
        llIIIlllIIlI[14] = (((139 + 8) - 36) + 73) ^ (((6 + 10) - (-148)) + 14);
        llIIIlllIIlI[15] = 134 ^ 141;
        llIIIlllIIlI[16] = 82 ^ 94;
        llIIIlllIIlI[17] = (0 ^ 19) ^ (58 ^ 36);
        llIIIlllIIlI[18] = (-((-21045) & 21439)) & (-20485) & 23999;
        llIIIlllIIlI[19] = (-((-2105) & 7038)) & (-8329) & 16383;
        llIIIlllIIlI[20] = (-((-119) & 1023)) & (-20485) & 24511;
        llIIIlllIIlI[21] = (-((-6441) & 14700)) & (-4481) & 15863;
        llIIIlllIIlI[22] = (-((-2081) & 30827)) & (-262) & 32127;
        llIIIlllIIlI[23] = (-((-275) & 29139)) & (-769) & 32750;
        llIIIlllIIlI[24] = (-((-20535) & 29239)) & (-4561) & 16383;
        llIIIlllIIlI[25] = (-17172) & 20287;
        llIIIlllIIlI[26] = (-29185) & 32301;
    }

    private static boolean llllIllIllIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String llllIllIlIllll(String lllllllllllllllIlIlIIIlIlIIIIlIl, String lllllllllllllllIlIlIIIlIlIIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlIlIIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIlIIIIlII.getBytes(StandardCharsets.UTF_8)), llIIIlllIIlI[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlllIIlI[6], lllllllllllllllIlIlIIIlIlIIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIlIlIIIIllI) {
            lllllllllllllllIlIlIIIlIlIIIIllI.printStackTrace();
            return null;
        }
    }

    private static String llllIllIllIIIl(String lllllllllllllllIlIlIIIlIlIlIIlll, String lllllllllllllllIlIlIIIlIlIlIIllI) {
        String lllllllllllllllIlIlIIIlIlIlIIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIlIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIlIlIlIIlIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIIIlIlIlIIllI.toCharArray();
        int lllllllllllllllIlIlIIIlIlIlIIIll = llIIIlllIIlI[2];
        char[] charArray2 = lllllllllllllllIlIlIIIlIlIlIIlll2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIlIlIIIlIlIIllIll = llIIIlllIIlI[2];
        while (llllIllIllIlII(lllllllllllllllIlIlIIIlIlIIllIll, length)) {
            char lllllllllllllllIlIlIIIlIlIlIlIII = charArray2[lllllllllllllllIlIlIIIlIlIIllIll];
            lllllllllllllllIlIlIIIlIlIlIIlIl.append((char) (lllllllllllllllIlIlIIIlIlIlIlIII ^ charArray[lllllllllllllllIlIlIIIlIlIlIIIll % charArray.length]));
            "".length();
            lllllllllllllllIlIlIIIlIlIlIIIll++;
            lllllllllllllllIlIlIIIlIlIIllIll++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIIIlIlIlIIlIl);
    }

    private static boolean llllIllIllllII(int i) {
        return i != 0;
    }

    private static boolean llllIllIlllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean llllIllIllIlII(int i, int i2) {
        return i < i2;
    }

    private static void llllIllIllIIlI() {
        llIIIlllIIIl = new String[llIIIlllIIlI[1]];
        llIIIlllIIIl[llIIIlllIIlI[2]] = llllIllIlIllll("wW4dXEtq6Q5DeungqoYusA==", "Mewaz");
        llIIIlllIIIl[llIIIlllIIlI[3]] = llllIllIllIIII("8YPIEMs9Zec=", "yRkhT");
        llIIIlllIIIl[llIIIlllIIlI[6]] = llllIllIllIIIl("BDEQKCQuLAouZycsFi0=", "EEdIG");
        llIIIlllIIIl[llIIIlllIIlI[7]] = llllIllIllIIII("hlMhLMFUjWs=", "IrYba");
        llIIIlllIIIl[llIIIlllIIlI[5]] = llllIllIlIllll("I/JENWJT2im0Pzuxwvm7SA024UKRaf7i", "eblbF");
        llIIIlllIIIl[llIIIlllIIlI[9]] = llllIllIllIIII("jPdqamIY/h0=", "yYPhY");
        llIIIlllIIIl[llIIIlllIIlI[11]] = llllIllIllIIII("BvW7EYZCOLSdpuik+kjkDQ==", "MGpwH");
        llIIIlllIIIl[llIIIlllIIlI[8]] = llllIllIllIIII("1ok+xWT1l3Q=", "lrgtw");
        llIIIlllIIIl[llIIIlllIIlI[12]] = llllIllIllIIII("+NzBvJQl5ITR9YkJfACX+Q==", "fFaFy");
        llIIIlllIIIl[llIIIlllIIlI[13]] = llllIllIlIllll("gchJ5m51rT8=", "GoPxD");
        llIIIlllIIIl[llIIIlllIIlI[14]] = llllIllIllIIII("ZwdQdojEOm1MV2sMdZ98B38srEu4QNyZ", "eEIHq");
        llIIIlllIIIl[llIIIlllIIlI[15]] = llllIllIllIIIl("KTc6KjsD", "hCNKX");
        llIIIlllIIIl[llIIIlllIIlI[16]] = llllIllIlIllll("NjJRiCxks+RTlOwosYglMDwDuWYM69L+", "jUNLa");
        llIIIlllIIIl[llIIIlllIIlI[17]] = llllIllIllIIIl("ODosBhUS", "yNXgv");
    }

    private static boolean llllIllIllllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llllIllIllIlll(Object obj) {
        return obj != null;
    }

    @Inject
    public p(f fVar, SquireFightCavesConfig squireFightCavesConfig, n nVar) {
        this.ax = fVar;
        this.ay = squireFightCavesConfig;
        this.az = nVar;
    }

    private static boolean llllIllIlllIll(Object obj) {
        return obj == null;
    }

    private static boolean llllIllIllIlIl(int i, int i2) {
        return i <= i2;
    }
}
