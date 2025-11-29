package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/k.class */
public class C0010k implements K {
    private static /* synthetic */ int[] lIllIIIIll;
    private static /* synthetic */ String[] lIllIIIIlI;

    private static boolean lIIlIlIllIlIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIIIIll[1];
    }

    private static boolean lIIlIlIlllIII(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIlllIll(int i, int i2) {
        return i < i2;
    }

    private static void ab() {
        new WorldPoint(lIllIIIIll[8], lIllIIIIll[9], lIllIIIIll[10]);
        new WorldPoint(lIllIIIIll[8], lIllIIIIll[9], lIllIIIIll[0]);
        WorldArea worldArea = new WorldArea(lIllIIIIll[11], lIllIIIIll[12], lIllIIIIll[13], lIllIIIIll[14], lIllIIIIll[0]);
        new WorldArea(lIllIIIIll[11], lIllIIIIll[12], lIllIIIIll[13], lIllIIIIll[14], lIllIIIIll[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIll[15], lIllIIIIll[16], lIllIIIIll[17], lIllIIIIll[18], lIllIIIIll[1]);
        WorldPoint worldPoint = new WorldPoint(lIllIIIIll[8], lIllIIIIll[19], lIllIIIIll[1]);
        if (lIIlIlIllIlIl(lIIlIlIllIlII(C0004e.u(), 45.0d))) {
            int[] iArr = new int[lIllIIIIll[0]];
            iArr[lIllIIIIll[1]] = lIllIIIIll[2];
            if (lIIlIlIllIIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllIIIIll[0]];
                iArr2[lIllIIIIll[1]] = lIllIIIIll[2];
                Inventory.getFirst(iArr2).interact(lIllIIIIlI[lIllIIIIll[10]]);
                Time.sleepTicks(lIllIIIIll[0]);
                "".length();
            }
        }
        if (lIIlIlIllIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[20]];
            WorldArea worldArea3 = new WorldArea(lIllIIIIll[21], lIllIIIIll[22], lIllIIIIll[23], lIllIIIIll[24], lIllIIIIll[1]);
            if (lIIlIlIllIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(lIllIIIIll[25], lIllIIIIll[26], lIllIIIIll[1]);
                if (lIIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIIIIll[27])) {
                    Movement.walkTo(worldPoint2);
                    "".length();
                    Time.sleepTicks(lIllIIIIll[0]);
                    "".length();
                }
                if (lIIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIllIIIIll[27])) {
                    String[] strArr = new String[lIllIIIIll[0]];
                    strArr[lIllIIIIll[1]] = lIllIIIIlI[lIllIIIIll[28]];
                    TileObjects.getNearest(strArr).interact(lIllIIIIlI[lIllIIIIll[29]]);
                    Time.sleepTicks(lIllIIIIll[20]);
                    "".length();
                }
            }
            if (lIIlIlIllIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlIllIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIllIIIIll[0]);
                "".length();
            }
            if (lIIlIlIllIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIIlIlIllIIlI(tileObject.getName().contains(lIllIIIIlI[lIllIIIIll[44]]) ? 1 : 0) && lIIlIlIllIIlI(worldArea2.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = lIllIIIIll[0];
                        "".length();
                        return (-(197 ^ 193)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIll[1];
                });
                if (lIIlIlIlllIII(nearest)) {
                    WorldPoint[] worldPointArr = new WorldPoint[lIllIIIIll[28]];
                    worldPointArr[lIllIIIIll[1]] = new WorldPoint(lIllIIIIll[8], lIllIIIIll[19], lIllIIIIll[1]);
                    worldPointArr[lIllIIIIll[0]] = new WorldPoint(lIllIIIIll[30], lIllIIIIll[31], lIllIIIIll[1]);
                    worldPointArr[lIllIIIIll[10]] = new WorldPoint(lIllIIIIll[30], lIllIIIIll[32], lIllIIIIll[1]);
                    worldPointArr[lIllIIIIll[20]] = new WorldPoint(lIllIIIIll[30], lIllIIIIll[33], lIllIIIIll[1]);
                    Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                    "".length();
                }
                if (lIIlIlIllIIIl(nearest)) {
                    nearest.interact(lIllIIIIlI[lIllIIIIll[27]]);
                    Time.sleepTicks(lIllIIIIll[20]);
                    "".length();
                }
            }
        }
        if (lIIlIlIllIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIlIlllIII(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[34]];
                NPC nearest2 = NPCs.getNearest(npc -> {
                    if (lIIlIlIllIIlI(npc.getName().contains(lIllIIIIlI[lIllIIIIll[42]]) ? 1 : 0)) {
                        String[] strArr2 = new String[lIllIIIIll[0]];
                        strArr2[lIllIIIIll[1]] = lIllIIIIlI[lIllIIIIll[43]];
                        if (lIIlIlIllIIlI(npc.hasAction(strArr2) ? 1 : 0) && lIIlIlIllIIII(npc.isDead() ? 1 : 0) && lIIlIlIlllIII(npc.getInteracting())) {
                            ?? r0 = lIllIIIIll[0];
                            "".length();
                            return ((240 ^ 146) & ((24 ^ 122) ^ (-1))) != (" ".length() & (" ".length() ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIllIIIIll[1];
                });
                NPC nearest3 = NPCs.getNearest(npc2 -> {
                    if (lIIlIlIllIIlI(npc2.getName().contains(lIllIIIIlI[lIllIIIIll[40]]) ? 1 : 0) && lIIlIlIllIIII(npc2.isDead() ? 1 : 0)) {
                        String[] strArr2 = new String[lIllIIIIll[0]];
                        strArr2[lIllIIIIll[1]] = lIllIIIIlI[lIllIIIIll[41]];
                        if (lIIlIlIllIIlI(npc2.hasAction(strArr2) ? 1 : 0) && lIIlIlIlllIlI(npc2.getInteracting(), Players.getLocal())) {
                            ?? r0 = lIllIIIIll[0];
                            "".length();
                            return (((((66 + 9) - 54) + 142) ^ (((118 + 102) - 107) + 28)) & (((((113 + 70) - 168) + 113) ^ (((157 + 67) - 157) + 107)) ^ (-" ".length()))) != 0 ? ((((88 + 8) - (-14)) + 106) ^ (((136 + 95) - 182) + 137)) & (((((40 + 139) - 175) + 158) ^ (((78 + 168) - 189) + 135)) ^ (-" ".length())) : r0;
                        }
                    }
                    return lIllIIIIll[1];
                });
                if (lIIlIlIllIIIl(nearest2) && lIIlIlIlllIII(nearest3)) {
                    AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[35]];
                    nearest2.interact(lIllIIIIlI[lIllIIIIll[36]]);
                    Time.sleepTicks(lIllIIIIll[10]);
                    "".length();
                }
                if (lIIlIlIllIIIl(nearest3)) {
                    AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[7]];
                    nearest3.interact(lIllIIIIlI[lIllIIIIll[13]]);
                    Time.sleepTicks(lIllIIIIll[20]);
                    "".length();
                }
            }
            if (lIIlIlIllIIIl(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[37]];
                Time.sleepTicks(lIllIIIIll[0]);
                "".length();
            }
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIllIIIIlI[lIllIIIIll[14]];
    }

    private static boolean lIIlIlIllIIII(int i) {
        return i == 0;
    }

    public static void aa() {
        int[] iArr = new int[lIllIIIIll[0]];
        iArr[lIllIIIIll[1]] = lIllIIIIll[2];
        if (lIIlIlIllIIII(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIIlIlIllIIIl(nearest) && lIIlIlIllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[1]];
                C0000a.a(nearest);
            }
            if (lIIlIlIllIIIl(nearest) && lIIlIlIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[0]];
                if (lIIlIlIllIIII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIllIIIIll[3]);
                    "".length();
                }
                if (lIIlIlIllIIlI(Bank.isOpen() ? 1 : 0)) {
                    if (lIIlIlIllIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIllIIIIll[0]);
                        "".length();
                    }
                    C0000a.a(lIllIIIIll[2], lIllIIIIll[4]);
                    C0000a.a(lIllIIIIll[5], lIllIIIIll[0]);
                    C0000a.a(lIllIIIIll[6], lIllIIIIll[7]);
                }
            }
        }
        int[] iArr2 = new int[lIllIIIIll[0]];
        iArr2[lIllIIIIll[1]] = lIllIIIIll[2];
        if (lIIlIlIllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            ab();
        }
    }

    private static boolean lIIlIlIllIIIl(Object obj) {
        return obj != null;
    }

    private static int lIIlIlIllIlII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static void lIIlIlIlIllll() {
        lIllIIIIll = new int[46];
        lIllIIIIll[0] = " ".length();
        lIllIIIIll[1] = ((((6 + 35) - 17) + 138) ^ (((26 + 133) - 104) + 86)) & (((((61 + 41) - (-4)) + 54) ^ (((10 + 66) - 14) + 81)) ^ (-" ".length()));
        lIllIIIIll[2] = (-((-577) & 22213)) & (-2049) & 24063;
        lIllIIIIll[3] = (-9330) & 14329;
        lIllIIIIll[4] = (((12 + 34) - (-85)) + 1) ^ (((135 + 0) - 89) + 110);
        lIllIIIIll[5] = (-((-453) & 2031)) & (-16513) & 30715;
        lIllIIIIll[6] = (-8353) & 16361;
        lIllIIIIll[7] = 163 ^ 169;
        lIllIIIIll[8] = (-((-10265) & 32697)) & (-8201) & 32767;
        lIllIIIIll[9] = (-((-8599) & 29143)) & (-1025) & 24565;
        lIllIIIIll[10] = "  ".length();
        lIllIIIIll[11] = (-((-11569) & 28607)) & (-9506) & 28671;
        lIllIIIIll[12] = (-((-3361) & 32113)) & (-1026) & 32767;
        lIllIIIIll[13] = 138 ^ 129;
        lIllIIIIll[14] = (177 ^ 164) ^ (137 ^ 145);
        lIllIIIIll[15] = (-26005) & 28125;
        lIllIIIIll[16] = (-4162) & 7131;
        lIllIIIIll[17] = (((112 + 117) - 195) + 110) ^ (((63 + 116) - 47) + 11);
        lIllIIIIll[18] = 118 ^ 85;
        lIllIIIIll[19] = (-((-10693) & 11749)) & (-24641) & 28669;
        lIllIIIIll[20] = "   ".length();
        lIllIIIIll[21] = (-((-10313) & 28365)) & (-353) & 20479;
        lIllIIIIll[22] = (-21770) & 24527;
        lIllIIIIll[23] = (-4649) & 4923;
        lIllIIIIll[24] = (((((17 + 192) - 82) + 103) + (((46 + 85) - 14) + 21)) - (((38 + 9) - 46) + 182)) + (36 ^ 103);
        lIllIIIIll[25] = (-5031) & 8111;
        lIllIIIIll[26] = (-((-6433) & 31077)) & (-1) & 28119;
        lIllIIIIll[27] = (((45 + 62) - 53) + 94) ^ (((71 + 102) - 106) + 79);
        lIllIIIIll[28] = 119 ^ 115;
        lIllIIIIll[29] = 25 ^ 28;
        lIllIIIIll[30] = (-29098) & 31231;
        lIllIIIIll[31] = (-9287) & 12263;
        lIllIIIIll[32] = (-((-17295) & 30687)) & (-16385) & 32759;
        lIllIIIIll[33] = (-((-16793) & 30175)) & (-16393) & 32767;
        lIllIIIIll[34] = 167 ^ 160;
        lIllIIIIll[35] = 138 ^ 130;
        lIllIIIIll[36] = (3 ^ 52) ^ (190 ^ 128);
        lIllIIIIll[37] = (((176 + 121) - 130) + 10) ^ (((113 + 80) - 167) + 163);
        lIllIIIIll[38] = (223 ^ 188) ^ (143 ^ 136);
        lIllIIIIll[39] = 104 ^ 11;
        lIllIIIIll[40] = (((150 + 6) - 107) + 125) ^ (((104 + 73) - 91) + 74);
        lIllIIIIll[41] = (85 ^ 16) ^ (102 ^ 44);
        lIllIIIIll[42] = 92 ^ 76;
        lIllIIIIll[43] = (((94 + 50) - 12) + 12) ^ (((111 + 38) - 100) + 80);
        lIllIIIIll[44] = (5 ^ 45) ^ (54 ^ 12);
        lIllIIIIll[45] = (((16 + 20) - (-22)) + 81) ^ (((75 + 25) - (-30)) + 22);
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            aa();
            "".length();
            if ((191 ^ 187) <= ((111 ^ 72) & ((171 ^ 140) ^ (-1)))) {
                return (102 ^ 83) & ((80 ^ 101) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllIIIIll[38];
    }

    private static boolean lIIlIlIlllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIlIlllIIl(Skills.getLevel(Skill.RANGED), lIllIIIIll[39])) {
            ?? r0 = lIllIIIIll[0];
            "".length();
            return 0 != 0 ? ((10 ^ 74) ^ (235 ^ 184)) & (((((133 + 27) - 111) + 115) ^ (((1 + 110) - (-58)) + 14)) ^ (-" ".length())) : r0;
        }
        return lIllIIIIll[1];
    }

    private static String lIIlIlIlIlIll(String lllllllllllllllllllIIlIlllIlIIlI, String lllllllllllllllllllIIlIlllIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIll[35]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIIIll[10], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIlllIlIIll) {
            lllllllllllllllllllIIlIlllIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlllIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlIllIlll(int i, int i2) {
        return i <= i2;
    }

    private static String lIIlIlIlIllIl(String lllllllllllllllllllIIlIlllIlllll, String lllllllllllllllllllIIlIlllIllllI) {
        try {
            SecretKeySpec lllllllllllllllllllIIlIllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIlllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIlIllllIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIlIllllIIIIl.init(lIllIIIIll[10], lllllllllllllllllllIIlIllllIIIlI);
            return new String(lllllllllllllllllllIIlIllllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIllllIIIII) {
            lllllllllllllllllllIIlIllllIIIII.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIlIlIllll();
        lIIlIlIlIlllI();
    }

    private static boolean lIIlIlIllIIll(int i) {
        return i > 0;
    }

    private static void lIIlIlIlIlllI() {
        lIllIIIIlI = new String[lIllIIIIll[45]];
        lIllIIIIlI[lIllIIIIll[1]] = lIIlIlIlIlIll("zY+SfsV6tPUqwvIqcALfLebuhDfIo95d", "SwYVp");
        lIllIIIIlI[lIllIIIIll[0]] = lIIlIlIlIllII("EBIsIhkxHSVmFzkdKS8bPw==", "XsBFu");
        lIllIIIIlI[lIllIIIIll[10]] = lIIlIlIlIlIll("DESyfBqAnmQ=", "QIBuZ");
        lIllIIIIlI[lIllIIIIll[20]] = lIIlIlIlIllIl("aHtDGdCJlHWKziebeDrkmg==", "sFPMX");
        lIllIIIIlI[lIllIIIIll[28]] = lIIlIlIlIllII("Pg0lH0w6AyIATD0NIgcNAQ==", "mbPsl");
        lIllIIIIlI[lIllIIIIll[29]] = lIIlIlIlIlIll("HWPvipMU/C0=", "LAOeS");
        lIllIIIIlI[lIllIIIIll[27]] = lIIlIlIlIllIl("tjsBbgGWXi1cag1/bDd1Xg==", "ZtNno");
        lIllIIIIlI[lIllIIIIll[34]] = lIIlIlIlIllII("AjwkAh4tOyRKGSsgLxk=", "DUCjj");
        lIllIIIIlI[lIllIIIIll[35]] = lIIlIlIlIlIll("7wI+7KDf7eIpXXPOsQUgZg==", "FCVGk");
        lIllIIIIlI[lIllIIIIll[36]] = lIIlIlIlIllII("IAYZFgIK", "armwa");
        lIllIIIIlI[lIllIIIIll[7]] = lIIlIlIlIlIll("vHa9lcI42LVYTHANHp5J+A==", "NEqlI");
        lIllIIIIlI[lIllIIIIll[13]] = lIIlIlIlIllII("Bz8uNjEt", "FKZWR");
        lIllIIIIlI[lIllIIIIll[37]] = lIIlIlIlIllIl("AbGyafmGvWq0RkqMi3OUNw==", "iAGdb");
        lIllIIIIlI[lIllIIIIll[14]] = lIIlIlIlIllII("NyQRMDYFPwY5eSIkFjsq", "qKcWY");
        lIllIIIIlI[lIllIIIIll[40]] = lIIlIlIlIllIl("yGxPwOQf8O8=", "IlFvk");
        lIllIIIIlI[lIllIIIIll[41]] = lIIlIlIlIllIl("ui6K84RMio0=", "vKZcZ");
        lIllIIIIlI[lIllIIIIll[42]] = lIIlIlIlIllII("OAojOg==", "keVVn");
        lIllIIIIlI[lIllIIIIll[43]] = lIIlIlIlIllII("GQE1FTsz", "XuAtX");
        lIllIIIIlI[lIllIIIIll[44]] = lIIlIlIlIllII("EhUoLgIiADoi", "AaIGp");
    }

    private static String lIIlIlIlIllII(String lllllllllllllllllllIIlIlllIIIIlI, String lllllllllllllllllllIIlIlllIIIIIl) {
        String lllllllllllllllllllIIlIlllIIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIIlIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIlIlllIIIIII = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIlIlllIIIIIl.toCharArray();
        int lllllllllllllllllllIIlIllIlllllI = lIllIIIIll[1];
        char[] charArray2 = lllllllllllllllllllIIlIlllIIIIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIIll[1];
        while (lIIlIlIlllIll(i, length)) {
            lllllllllllllllllllIIlIlllIIIIII.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllIIlIllIlllllI % charArray.length]));
            "".length();
            lllllllllllllllllllIIlIllIlllllI++;
            i++;
            "".length();
            if ((true ^ true) == ((true ^ true) & ((true ^ true) ^ true))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllIIlIlllIIIIII);
    }

    private static boolean lIIlIlIllIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlIllIIlI(int i) {
        return i != 0;
    }
}
