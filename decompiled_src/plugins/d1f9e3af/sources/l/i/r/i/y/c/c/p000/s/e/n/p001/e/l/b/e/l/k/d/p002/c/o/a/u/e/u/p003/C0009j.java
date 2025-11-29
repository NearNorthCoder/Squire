package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.j  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/j.class */
public class C0009j implements W {
    private static /* synthetic */ int[] lIlIIIlll;
    private static /* synthetic */ String[] lIlIIIllI;

    private static void lIIIlIIIlllI() {
        lIlIIIlll = new int[46];
        lIlIIIlll[0] = " ".length();
        lIlIIIlll[1] = (91 ^ 94) & ((101 ^ 96) ^ (-1));
        lIlIIIlll[2] = (-((-10501) & 32005)) & (-10245) & 32127;
        lIlIIIlll[3] = (-((-6021) & 8183)) & (-24577) & 31738;
        lIlIIIlll[4] = (120 ^ 99) ^ "   ".length();
        lIlIIIlll[5] = (-19493) & 32117;
        lIlIIIlll[6] = (-183) & 8191;
        lIlIIIlll[7] = 161 ^ 171;
        lIlIIIlll[8] = (-((-15435) & 15691)) & (-17033) & 19423;
        lIlIIIlll[9] = (-(245 ^ 180)) & (-9219) & 12279;
        lIlIIIlll[10] = "  ".length();
        lIlIIIlll[11] = (-20897) & 23024;
        lIlIIIlll[12] = (-12353) & 15342;
        lIlIIIlll[13] = 66 ^ 73;
        lIlIIIlll[14] = 181 ^ 184;
        lIlIIIlll[15] = (-12967) & 15087;
        lIlIIIlll[16] = (-((-139) & 21739)) & (-1) & 24570;
        lIlIIIlll[17] = (104 ^ 123) ^ (150 ^ 154);
        lIlIIIlll[18] = 156 ^ 191;
        lIlIIIlll[19] = (-((-25309) & 30463)) & (-16385) & 24511;
        lIlIIIlll[20] = "   ".length();
        lIlIIIlll[21] = (-26049) & 28123;
        lIlIIIlll[22] = (-9514) & 12271;
        lIlIIIlll[23] = (-10821) & 11095;
        lIlIIIlll[24] = (((((53 + 63) - 80) + 115) + (((120 + 89) - 154) + 99)) - (((62 + 116) - 55) + 5)) + (76 ^ 7);
        lIlIIIlll[25] = (-20723) & 23803;
        lIlIIIlll[26] = (-553) & 4027;
        lIlIIIlll[27] = (((22 + 159) - 168) + 172) ^ (((155 + 88) - 117) + 65);
        lIlIIIlll[28] = 1 ^ 5;
        lIlIIIlll[29] = 61 ^ 56;
        lIlIIIlll[30] = (-((-1609) & 18154)) & (-1025) & 19703;
        lIlIIIlll[31] = (-4109) & 7085;
        lIlIIIlll[32] = (-25601) & 28583;
        lIlIIIlll[33] = (-((-17057) & 21217)) & (-11) & 7163;
        lIlIIIlll[34] = (((68 + 133) - 166) + 127) ^ (((143 + 105) - 117) + 34);
        lIlIIIlll[35] = 124 ^ 116;
        lIlIIIlll[36] = (227 ^ 130) ^ (227 ^ 139);
        lIlIIIlll[37] = (((25 + 121) - 76) + 78) ^ (((9 + 11) - (-101)) + 31);
        lIlIIIlll[38] = (((170 + 147) - 264) + 177) ^ (((22 + 4) - 18) + 122);
        lIlIIIlll[39] = (87 ^ 30) ^ (88 ^ 114);
        lIlIIIlll[40] = 129 ^ 143;
        lIlIIIlll[41] = (176 ^ 152) ^ (36 ^ 3);
        lIlIIIlll[42] = 186 ^ 170;
        lIlIIIlll[43] = (221 ^ 157) ^ (235 ^ 186);
        lIlIIIlll[44] = 98 ^ 112;
        lIlIIIlll[45] = 80 ^ 67;
    }

    private static boolean lIIIlIIllIll(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIIIllIl() {
        lIlIIIllI = new String[lIlIIIlll[45]];
        lIlIIIllI[lIlIIIlll[1]] = lIIIlIIIlIlI("GBs5KxY3DiYsFnYOIGITNxQk", "VzOBq");
        lIlIIIllI[lIlIIIlll[0]] = lIIIlIIIlIll("CQDmfQG6LIbk/JMCXscrctT0xCbjTzMT", "EDWoF");
        lIlIIIllI[lIlIIIlll[10]] = lIIIlIIIlIll("LdHMgJ/jYsk=", "LEJfe");
        lIlIIIllI[lIlIIIlll[20]] = lIIIlIIIllII("RjS3YQpZx47vfRv1I9L6pw==", "faBOZ");
        lIlIIIllI[lIlIIIlll[28]] = lIIIlIIIlIlI("BiMRFGUCLRYLZQUjFgwkOQ==", "ULdxE");
        lIlIIIllI[lIlIIIlll[29]] = lIIIlIIIllII("kMjplman4mM=", "OxpKQ");
        lIlIIIllI[lIlIIIlll[27]] = lIIIlIIIllII("vpDv/tyVy3hpPC6Bui2O7A==", "jhzMe");
        lIlIIIllI[lIlIIIlll[34]] = lIIIlIIIlIll("vvqyQeNlLafannqJ3IPRdw==", "HWzjU");
        lIlIIIllI[lIlIIIlll[35]] = lIIIlIIIlIlI("IxU9OwwJCCc9TxEOPDY=", "baIZo");
        lIlIIIllI[lIlIIIlll[36]] = lIIIlIIIlIll("XOmLc70GPOs=", "cOnMQ");
        lIlIIIllI[lIlIIIlll[7]] = lIIIlIIIlIll("4GvZ/SQYiRrRYMLUN51ESA==", "MtsxJ");
        lIlIIIllI[lIlIIIlll[13]] = lIIIlIIIlIll("ogylUa8Cy1I=", "osqOZ");
        lIlIIIllI[lIlIIIlll[37]] = lIIIlIIIllII("A44rg+eYVoMgdfej/ftmxQ==", "EYJyN");
        lIlIIIllI[lIlIIIlll[14]] = lIIIlIIIlIlI("FiQ6IgAkPy0rTwMkPSkc", "PKHEo");
        lIlIIIllI[lIlIIIlll[40]] = lIIIlIIIlIll("VSsEw94bKpw=", "tYqmt");
        lIlIIIllI[lIlIIIlll[41]] = lIIIlIIIlIlI("MSMmBhkb", "pWRgz");
        lIlIIIllI[lIlIIIlll[42]] = lIIIlIIIllII("afOJP5FHs08=", "zUzhp");
        lIlIIIllI[lIlIIIlll[43]] = lIIIlIIIlIlI("FRUNMQQ/", "TayPg");
        lIlIIIllI[lIlIIIlll[44]] = lIIIlIIIlIlI("OxADCwYLBREH", "hdbbt");
    }

    private static String lIIIlIIIlIll(String llllIlIIIlIlIl, String llllIlIIIlIlII) {
        try {
            SecretKeySpec llllIlIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIlll[10], llllIlIIIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlIIIlIllI) {
            llllIlIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIlIIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIIlIIllIIl(Skills.getLevel(Skill.RANGED), lIlIIIlll[39])) {
            ?? r0 = lIlIIIlll[0];
            "".length();
            return (-"  ".length()) >= 0 ? ((224 ^ 188) ^ (23 ^ 42)) & (((28 ^ 72) ^ (80 ^ 101)) ^ (-" ".length())) : r0;
        }
        return lIlIIIlll[1];
    }

    public static void Q() {
        int[] iArr = new int[lIlIIIlll[0]];
        iArr[lIlIIIlll[1]] = lIlIIIlll[2];
        if (lIIIlIIIllll(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIIIlIIlIIII(nearest) && lIIIlIIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[1]];
                C0000a.a(nearest);
            }
            if (lIIIlIIlIIII(nearest) && lIIIlIIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[0]];
                if (lIIIlIIIllll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIlIIIlll[3]);
                    "".length();
                }
                if (lIIIlIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                    if (lIIIlIIlIIlI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIlIIIlll[0]);
                        "".length();
                    }
                    C0000a.a(lIlIIIlll[2], lIlIIIlll[4]);
                    C0000a.a(lIlIIIlll[5], lIlIIIlll[0]);
                    C0000a.a(lIlIIIlll[6], lIlIIIlll[7]);
                }
            }
        }
        int[] iArr2 = new int[lIlIIIlll[0]];
        iArr2[lIlIIIlll[1]] = lIlIIIlll[2];
        if (lIIIlIIlIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            R();
        }
    }

    private static boolean lIIIlIIIllll(int i) {
        return i == 0;
    }

    private static String lIIIlIIIllII(String llllIlIIlllIlI, String llllIlIIllIlll) {
        try {
            SecretKeySpec llllIlIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIIllIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIlll[35]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIlll[10], llllIlIIllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIlIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlIIlllIll) {
            llllIlIIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIllIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIlIIllIII(Object obj) {
        return obj == null;
    }

    private static void R() {
        new WorldPoint(lIlIIIlll[8], lIlIIIlll[9], lIlIIIlll[10]);
        new WorldPoint(lIlIIIlll[8], lIlIIIlll[9], lIlIIIlll[0]);
        WorldArea worldArea = new WorldArea(lIlIIIlll[11], lIlIIIlll[12], lIlIIIlll[13], lIlIIIlll[14], lIlIIIlll[0]);
        new WorldArea(lIlIIIlll[11], lIlIIIlll[12], lIlIIIlll[13], lIlIIIlll[14], lIlIIIlll[0]);
        WorldArea worldArea2 = new WorldArea(lIlIIIlll[15], lIlIIIlll[16], lIlIIIlll[17], lIlIIIlll[18], lIlIIIlll[1]);
        WorldPoint worldPoint = new WorldPoint(lIlIIIlll[8], lIlIIIlll[19], lIlIIIlll[1]);
        if (lIIIlIIlIlIl(lIIIlIIlIIll(C0004e.u(), 45.0d))) {
            int[] iArr = new int[lIlIIIlll[0]];
            iArr[lIlIIIlll[1]] = lIlIIIlll[2];
            if (lIIIlIIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIIlll[0]];
                iArr2[lIlIIIlll[1]] = lIlIIIlll[2];
                Inventory.getFirst(iArr2).interact(lIlIIIllI[lIlIIIlll[10]]);
                Time.sleepTicks(lIlIIIlll[0]);
                "".length();
            }
        }
        if (lIIIlIIIllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[20]];
            WorldArea worldArea3 = new WorldArea(lIlIIIlll[21], lIlIIIlll[22], lIlIIIlll[23], lIlIIIlll[24], lIlIIIlll[1]);
            if (lIIIlIIIllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(lIlIIIlll[25], lIlIIIlll[26], lIlIIIlll[1]);
                if (lIIIlIIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlIIIlll[27])) {
                    Movement.walkTo(worldPoint2);
                    "".length();
                    Time.sleepTicks(lIlIIIlll[0]);
                    "".length();
                }
                if (lIIIlIIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlIIIlll[27])) {
                    String[] strArr = new String[lIlIIIlll[0]];
                    strArr[lIlIIIlll[1]] = lIlIIIllI[lIlIIIlll[28]];
                    TileObjects.getNearest(strArr).interact(lIlIIIllI[lIlIIIlll[29]]);
                    Time.sleepTicks(lIlIIIlll[20]);
                    "".length();
                }
            }
            if (lIIIlIIlIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIIIllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIlIIIlll[0]);
                "".length();
            }
            if (lIIIlIIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIIIlIIlIIIl(tileObject.getName().contains(lIlIIIllI[lIlIIIlll[44]]) ? 1 : 0) && lIIIlIIlIIIl(worldArea2.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = lIlIIIlll[0];
                        "".length();
                        return ((24 ^ 6) ^ (97 ^ 123)) <= " ".length() ? ((100 ^ 15) ^ (237 ^ 189)) & (((54 ^ 1) ^ (34 ^ 46)) ^ (-" ".length())) : r0;
                    }
                    return lIlIIIlll[1];
                });
                if (lIIIlIIllIII(nearest)) {
                    WorldPoint[] worldPointArr = new WorldPoint[lIlIIIlll[28]];
                    worldPointArr[lIlIIIlll[1]] = new WorldPoint(lIlIIIlll[8], lIlIIIlll[19], lIlIIIlll[1]);
                    worldPointArr[lIlIIIlll[0]] = new WorldPoint(lIlIIIlll[30], lIlIIIlll[31], lIlIIIlll[1]);
                    worldPointArr[lIlIIIlll[10]] = new WorldPoint(lIlIIIlll[30], lIlIIIlll[32], lIlIIIlll[1]);
                    worldPointArr[lIlIIIlll[20]] = new WorldPoint(lIlIIIlll[30], lIlIIIlll[33], lIlIIIlll[1]);
                    Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                    "".length();
                }
                if (lIIIlIIlIIII(nearest)) {
                    nearest.interact(lIlIIIllI[lIlIIIlll[27]]);
                    Time.sleepTicks(lIlIIIlll[20]);
                    "".length();
                }
            }
        }
        if (lIIIlIIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIlIIllIII(Players.getLocal().getInteracting())) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[34]];
                NPC nearest2 = NPCs.getNearest(npc -> {
                    if (lIIIlIIlIIIl(npc.getName().contains(lIlIIIllI[lIlIIIlll[42]]) ? 1 : 0)) {
                        String[] strArr2 = new String[lIlIIIlll[0]];
                        strArr2[lIlIIIlll[1]] = lIlIIIllI[lIlIIIlll[43]];
                        if (lIIIlIIlIIIl(npc.hasAction(strArr2) ? 1 : 0) && lIIIlIIIllll(npc.isDead() ? 1 : 0) && lIIIlIIllIII(npc.getInteracting())) {
                            ?? r0 = lIlIIIlll[0];
                            "".length();
                            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lIlIIIlll[1];
                });
                NPC nearest3 = NPCs.getNearest(npc2 -> {
                    if (lIIIlIIlIIIl(npc2.getName().contains(lIlIIIllI[lIlIIIlll[40]]) ? 1 : 0) && lIIIlIIIllll(npc2.isDead() ? 1 : 0)) {
                        String[] strArr2 = new String[lIlIIIlll[0]];
                        strArr2[lIlIIIlll[1]] = lIlIIIllI[lIlIIIlll[41]];
                        if (lIIIlIIlIIIl(npc2.hasAction(strArr2) ? 1 : 0) && lIIIlIIllIlI(npc2.getInteracting(), Players.getLocal())) {
                            ?? r0 = lIlIIIlll[0];
                            "".length();
                            return 0 != 0 ? ((197 ^ 147) ^ (108 ^ 104)) & (((243 ^ 151) ^ (55 ^ 1)) ^ (-" ".length())) : r0;
                        }
                    }
                    return lIlIIIlll[1];
                });
                if (lIIIlIIlIIII(nearest2) && lIIIlIIllIII(nearest3)) {
                    AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[35]];
                    nearest2.interact(lIlIIIllI[lIlIIIlll[36]]);
                    Time.sleepTicks(lIlIIIlll[10]);
                    "".length();
                }
                if (lIIIlIIlIIII(nearest3)) {
                    AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[7]];
                    nearest3.interact(lIlIIIllI[lIlIIIlll[13]]);
                    Time.sleepTicks(lIlIIIlll[20]);
                    "".length();
                }
            }
            if (lIIIlIIlIIII(Players.getLocal().getInteracting())) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[37]];
                Time.sleepTicks(lIlIIIlll[0]);
                "".length();
            }
        }
    }

    private static String lIIIlIIIlIlI(String llllIlIIlIlIlI, String llllIlIIlIIlII) {
        String llllIlIIlIlIlI2 = new String(Base64.getDecoder().decode(llllIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllIlIIlIIlII.toCharArray();
        int llllIlIIlIIllI = lIlIIIlll[1];
        char[] charArray2 = llllIlIIlIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIIlll[1];
        while (lIIIlIIllIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllIlIIlIIllI % charArray.length]));
            "".length();
            llllIlIIlIIllI++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static int lIIIlIIlIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIIlIIlIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIIIlll[1];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIIIllI[lIlIIIlll[14]];
    }

    private static boolean lIIIlIIlIIIl(int i) {
        return i != 0;
    }

    static {
        lIIIlIIIlllI();
        lIIIlIIIllIl();
    }

    private static boolean lIIIlIIlIllI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIIlIlll(int i, int i2) {
        return i <= i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            Q();
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return (185 ^ 150) & ((232 ^ 199) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIIIlll[38];
    }

    private static boolean lIIIlIIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlIIlIlIl(int i) {
        return i < 0;
    }
}
