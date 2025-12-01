package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/k.class */
public class C0010k implements ab {
    private static /* synthetic */ String[] llIIlIlll;
    private static /* synthetic */ int[] llIIllIlI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIlIllIlIlIl(Skills.getLevel(Skill.RANGED), llIIllIlI[39])) {
            ?? r0 = llIIllIlI[0];
            "".length();
            return "  ".length() != "  ".length() ? ((154 ^ 186) ^ (55 ^ 62)) & (((4 ^ 96) ^ (222 ^ 147)) ^ (-" ".length())) : r0;
        }
        return llIIllIlI[1];
    }

    private static void ad() {
        new WorldPoint(llIIllIlI[8], llIIllIlI[9], llIIllIlI[10]);
        new WorldPoint(llIIllIlI[8], llIIllIlI[9], llIIllIlI[0]);
        WorldArea worldArea = new WorldArea(llIIllIlI[11], llIIllIlI[12], llIIllIlI[13], llIIllIlI[14], llIIllIlI[0]);
        new WorldArea(llIIllIlI[11], llIIllIlI[12], llIIllIlI[13], llIIllIlI[14], llIIllIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIIllIlI[15], llIIllIlI[16], llIIllIlI[17], llIIllIlI[18], llIIllIlI[1]);
        WorldPoint worldPoint = new WorldPoint(llIIllIlI[8], llIIllIlI[19], llIIllIlI[1]);
        if (lIlIllIlIIIl(lIlIllIlIIII(C0004e.w(), 45.0d))) {
            int[] iArr = new int[llIIllIlI[0]];
            iArr[llIIllIlI[1]] = llIIllIlI[2];
            if (lIlIllIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIllIlI[0]];
                iArr2[llIIllIlI[1]] = llIIllIlI[2];
                Inventory.getFirst(iArr2).interact(llIIlIlll[llIIllIlI[10]]);
                Time.sleepTicks(llIIllIlI[0]);
                "".length();
            }
        }
        if (lIlIllIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = llIIlIlll[llIIllIlI[20]];
            WorldArea worldArea3 = new WorldArea(llIIllIlI[21], llIIllIlI[22], llIIllIlI[23], llIIllIlI[24], llIIllIlI[1]);
            if (lIlIllIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(llIIllIlI[25], llIIllIlI[26], llIIllIlI[1]);
                if (lIlIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIIllIlI[27])) {
                    Movement.walkTo(worldPoint2);
                    "".length();
                    Time.sleepTicks(llIIllIlI[0]);
                    "".length();
                }
                if (lIlIllIlIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIIllIlI[27])) {
                    String[] strArr = new String[llIIllIlI[0]];
                    strArr[llIIllIlI[1]] = llIIlIlll[llIIllIlI[28]];
                    TileObjects.getNearest(strArr).interact(llIIlIlll[llIIllIlI[29]]);
                    Time.sleepTicks(llIIllIlI[20]);
                    "".length();
                }
            }
            if (lIlIllIIlllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIllIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIIllIlI[0]);
                "".length();
            }
            if (lIlIllIIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIlIllIIlllI(tileObject.getName().contains(llIIlIlll[llIIllIlI[44]]) ? 1 : 0) && lIlIllIIlllI(worldArea2.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = llIIllIlI[0];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                    }
                    return llIIllIlI[1];
                });
                if (lIlIllIlIlII(nearest)) {
                    WorldPoint[] worldPointArr = new WorldPoint[llIIllIlI[28]];
                    worldPointArr[llIIllIlI[1]] = new WorldPoint(llIIllIlI[8], llIIllIlI[19], llIIllIlI[1]);
                    worldPointArr[llIIllIlI[0]] = new WorldPoint(llIIllIlI[30], llIIllIlI[31], llIIllIlI[1]);
                    worldPointArr[llIIllIlI[10]] = new WorldPoint(llIIllIlI[30], llIIllIlI[32], llIIllIlI[1]);
                    worldPointArr[llIIllIlI[20]] = new WorldPoint(llIIllIlI[30], llIIllIlI[33], llIIllIlI[1]);
                    Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                    "".length();
                }
                if (lIlIllIIllIl(nearest)) {
                    nearest.interact(llIIlIlll[llIIllIlI[27]]);
                    Time.sleepTicks(llIIllIlI[20]);
                    "".length();
                }
            }
        }
        if (lIlIllIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIllIlIlII(Players.getLocal().getInteracting())) {
                AccBuilderGWD.c = llIIlIlll[llIIllIlI[34]];
                NPC nearest2 = NPCs.getNearest(npc -> {
                    if (lIlIllIIlllI(npc.getName().contains(llIIlIlll[llIIllIlI[42]]) ? 1 : 0)) {
                        String[] strArr2 = new String[llIIllIlI[0]];
                        strArr2[llIIllIlI[1]] = llIIlIlll[llIIllIlI[43]];
                        if (lIlIllIIlllI(npc.hasAction(strArr2) ? 1 : 0) && lIlIllIIllII(npc.isDead() ? 1 : 0) && lIlIllIlIlII(npc.getInteracting())) {
                            ?? r0 = llIIllIlI[0];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIIllIlI[1];
                });
                NPC nearest3 = NPCs.getNearest(npc2 -> {
                    if (lIlIllIIlllI(npc2.getName().contains(llIIlIlll[llIIllIlI[40]]) ? 1 : 0) && lIlIllIIllII(npc2.isDead() ? 1 : 0)) {
                        String[] strArr2 = new String[llIIllIlI[0]];
                        strArr2[llIIllIlI[1]] = llIIlIlll[llIIllIlI[41]];
                        if (lIlIllIIlllI(npc2.hasAction(strArr2) ? 1 : 0) && lIlIllIlIllI(npc2.getInteracting(), Players.getLocal())) {
                            ?? r0 = llIIllIlI[0];
                            "".length();
                            return (((((113 + 43) - 139) + 127) ^ (((77 + 151) - 158) + 96)) & (((246 ^ 190) ^ (27 ^ 101)) ^ (-" ".length()))) == ((103 ^ 62) ^ (244 ^ 169)) ? ((18 ^ 26) ^ (75 ^ 1)) & (((87 ^ 97) ^ (118 ^ 2)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llIIllIlI[1];
                });
                if (lIlIllIIllIl(nearest2) && lIlIllIlIlII(nearest3)) {
                    AccBuilderGWD.c = llIIlIlll[llIIllIlI[35]];
                    nearest2.interact(llIIlIlll[llIIllIlI[36]]);
                    Time.sleepTicks(llIIllIlI[10]);
                    "".length();
                }
                if (lIlIllIIllIl(nearest3)) {
                    AccBuilderGWD.c = llIIlIlll[llIIllIlI[7]];
                    nearest3.interact(llIIlIlll[llIIllIlI[13]]);
                    Time.sleepTicks(llIIllIlI[20]);
                    "".length();
                }
            }
            if (lIlIllIIllIl(Players.getLocal().getInteracting())) {
                AccBuilderGWD.c = llIIlIlll[llIIllIlI[37]];
                Time.sleepTicks(llIIllIlI[0]);
                "".length();
            }
        }
    }

    private static boolean lIlIllIIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIllIlIlIl(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIlIllllIl(String lIlIIIIllIIIII, String lIlIIIIlIllIlI) {
        String str = new String(Base64.getDecoder().decode(lIlIIIIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIIIIlIllIlI.toCharArray();
        int lIlIIIIlIlllII = llIIllIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIllIlI[1];
        while (lIlIllIlIlll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIlIIIIlIlllII % charArray.length]));
            "".length();
            lIlIIIIlIlllII++;
            i++;
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIIllIlI[1];
    }

    private static boolean lIlIllIIllII(int i) {
        return i == 0;
    }

    private static int lIlIllIlIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        lIlIllIIlIll();
        lIlIllIIIIll();
    }

    private static void lIlIllIIlIll() {
        llIIllIlI = new int[46];
        llIIllIlI[0] = " ".length();
        llIIllIlI[1] = (111 ^ 90) & ((13 ^ 56) ^ (-1));
        llIIllIlI[2] = (-((-2649) & 7773)) & (-16513) & 22015;
        llIIllIlI[3] = (-((-16653) & 27967)) & (-2) & 16315;
        llIIllIlI[4] = 114 ^ 106;
        llIIllIlI[5] = (-1699) & 14323;
        llIIllIlI[6] = (-((-10955) & 27343)) & (-8193) & 32589;
        llIIllIlI[7] = 174 ^ 164;
        llIIllIlI[8] = (-(((138 + 55) - 62) + 38)) & (-20481) & 22783;
        llIIllIlI[9] = (-1027) & 4023;
        llIIllIlI[10] = "  ".length();
        llIIllIlI[11] = (-685) & 2812;
        llIIllIlI[12] = (-((-18217) & 30585)) & (-1) & 15358;
        llIIllIlI[13] = (227 ^ 196) ^ (43 ^ 7);
        llIIllIlI[14] = 86 ^ 91;
        llIIllIlI[15] = (-1285) & 3405;
        llIIllIlI[16] = (-((-9233) & 13394)) & (-17409) & 24539;
        llIIllIlI[17] = (175 ^ 178) ^ "  ".length();
        llIIllIlI[18] = 187 ^ 152;
        llIIllIlI[19] = (-16417) & 19389;
        llIIllIlI[20] = "   ".length();
        llIIllIlI[21] = (-30597) & 32671;
        llIIllIlI[22] = (-12314) & 15071;
        llIIllIlI[23] = (-((-1091) & 23783)) & (-9) & 22975;
        llIIllIlI[24] = (((98 ^ 121) + (25 ^ 71)) - (232 ^ 128)) + ((60 + 168) - 52) + 59;
        llIIllIlI[25] = (-21189) & 24269;
        llIIllIlI[26] = (-12357) & 15831;
        llIIllIlI[27] = 147 ^ 149;
        llIIllIlI[28] = 35 ^ 39;
        llIIllIlI[29] = 27 ^ 30;
        llIIllIlI[30] = (-((-10454) & 10751)) & (-17921) & 20351;
        llIIllIlI[31] = (-((-641) & 30423)) & (-9) & 32767;
        llIIllIlI[32] = (-((-583) & 30303)) & (-65) & 32767;
        llIIllIlI[33] = (-8205) & 11197;
        llIIllIlI[34] = (((175 + 6) - 123) + 118) ^ (((58 + 128) - 61) + 58);
        llIIllIlI[35] = (((75 + 133) - 154) + 129) ^ (((104 + 43) - 33) + 77);
        llIIllIlI[36] = 13 ^ 4;
        llIIllIlI[37] = 180 ^ 184;
        llIIllIlI[38] = 98 ^ 6;
        llIIllIlI[39] = 57 ^ 90;
        llIIllIlI[40] = 180 ^ 186;
        llIIllIlI[41] = 148 ^ 155;
        llIIllIlI[42] = 46 ^ 62;
        llIIllIlI[43] = (233 ^ 191) ^ (61 ^ 122);
        llIIllIlI[44] = 143 ^ 157;
        llIIllIlI[45] = (39 ^ 8) ^ (39 ^ 27);
    }

    private static void lIlIllIIIIll() {
        llIIlIlll = new String[llIIllIlI[45]];
        llIIlIlll[llIIllIlI[1]] = lIlIlIllllIl("Gi86GSM1OiUeI3Q6I1AmNSAn", "TNLpD");
        llIIlIlll[llIIllIlI[0]] = lIlIlIlllllI("Jf5V7nAaGv3yItosQ/xQeUycCKyojO0s", "scgol");
        llIIlIlll[llIIllIlI[10]] = lIlIllIIIIIl("aeNc98+TX0w=", "SOVGZ");
        llIIlIlll[llIIllIlI[20]] = lIlIllIIIIIl("5qvGPa+z1x1ljR3PUnZl6g==", "kZvDW");
        llIIlIlll[llIIllIlI[28]] = lIlIlIlllllI("NRhFIWmNESsqNd3a4H5s27pzsDItP869", "woaxd");
        llIIlIlll[llIIllIlI[29]] = lIlIlIllllIl("Dg82Chk=", "KaBok");
        llIIlIlll[llIIllIlI[27]] = lIlIlIllllIl("FiYeKQd4Pwc=", "UJwDe");
        llIIlIlll[llIIllIlI[34]] = lIlIllIIIIIl("wOXW/A4YRCuJ1CG1kazTmw==", "InHYD");
        llIIlIlll[llIIllIlI[35]] = lIlIlIllllIl("AzkGLyUpJBwpZjEiByI=", "BMrNF");
        llIIlIlll[llIIllIlI[36]] = lIlIlIllllIl("Ix45DTEJ", "bjMlR");
        llIIlIlll[llIIllIlI[7]] = lIlIllIIIIIl("tQoobGajt46L6MEkzj3RVw==", "phDQR");
        llIIlIlll[llIIllIlI[13]] = lIlIllIIIIIl("weboaDHVBP0=", "DEpbX");
        llIIlIlll[llIIllIlI[37]] = lIlIlIlllllI("bqX67Xh+RThFf3cvaTcI7w==", "RfMAc");
        llIIlIlll[llIIllIlI[14]] = lIlIlIllllIl("NQUjIz0HHjQqciAFJCgh", "sjQDR");
        llIIlIlll[llIIllIlI[40]] = lIlIlIllllIl("Pzo7BQ==", "lUNiO");
        llIIlIlll[llIIllIlI[41]] = lIlIlIlllllI("Abuqh5StIqU=", "zYpqp");
        llIIlIlll[llIIllIlI[42]] = lIlIlIlllllI("1wT6x5ERv8I=", "vdfQf");
        llIIlIlll[llIIllIlI[43]] = lIlIlIlllllI("mGMsJs6g8iA=", "HezhK");
        llIIlIlll[llIIllIlI[44]] = lIlIllIIIIIl("v9IMDosX0qI4btJiIPcsyQ==", "XfYmo");
    }

    private static String lIlIlIlllllI(String lIlIIIIlllIIII, String lIlIIIIllIllll) {
        try {
            SecretKeySpec lIlIIIIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIIllIllll.getBytes(StandardCharsets.UTF_8)), llIIllIlI[35]), "DES");
            Cipher lIlIIIIlllIIlI = Cipher.getInstance("DES");
            lIlIIIIlllIIlI.init(llIIllIlI[10], lIlIIIIlllIIll);
            return new String(lIlIIIIlllIIlI.doFinal(Base64.getDecoder().decode(lIlIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIIlllIIIl) {
            lIlIIIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIIIIl(String lIlIIIIlIIlIll, String lIlIIIIlIIlIII) {
        try {
            SecretKeySpec lIlIIIIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIlI[10], lIlIIIIlIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIIlIIllII) {
            lIlIIIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIllIlIlII(Object obj) {
        return obj == null;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIIlIlll[llIIllIlI[14]];
    }

    private static boolean lIlIllIlIIIl(int i) {
        return i < 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            ac();
            "".length();
            if ("   ".length() < 0) {
                return ((((126 + 120) - 200) + 82) ^ (((110 + 41) - 105) + 136)) & (((83 ^ 114) ^ (160 ^ 183)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIllIlI[38];
    }

    private static boolean lIlIllIIllll(int i) {
        return i > 0;
    }

    private static boolean lIlIllIIlllI(int i) {
        return i != 0;
    }

    private static boolean lIlIllIlIlll(int i, int i2) {
        return i < i2;
    }

    public static void ac() {
        int[] iArr = new int[llIIllIlI[0]];
        iArr[llIIllIlI[1]] = llIIllIlI[2];
        if (lIlIllIIllII(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIlIllIIllIl(nearest) && lIlIllIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIlIlll[llIIllIlI[1]];
                C0000a.a(nearest);
            }
            if (lIlIllIIllIl(nearest) && lIlIllIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIlIlll[llIIllIlI[0]];
                if (lIlIllIIllII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIIllIlI[3]);
                    "".length();
                }
                if (lIlIllIIlllI(Bank.isOpen() ? 1 : 0)) {
                    if (lIlIllIIllll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIIllIlI[0]);
                        "".length();
                    }
                    C0000a.a(llIIllIlI[2], llIIllIlI[4]);
                    C0000a.a(llIIllIlI[5], llIIllIlI[0]);
                    C0000a.a(llIIllIlI[6], llIIllIlI[7]);
                }
            }
        }
        int[] iArr2 = new int[llIIllIlI[0]];
        iArr2[llIIllIlI[1]] = llIIllIlI[2];
        if (lIlIllIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
            ad();
        }
    }

    private static boolean lIlIllIlIIlI(int i, int i2) {
        return i > i2;
    }
}
