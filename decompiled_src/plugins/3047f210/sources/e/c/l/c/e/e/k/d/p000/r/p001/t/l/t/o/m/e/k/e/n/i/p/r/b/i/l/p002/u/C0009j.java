package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/j.class */
public class C0009j implements S {
    private static /* synthetic */ String[] llllIIIlIl;
    private static /* synthetic */ int[] llllIIIllI;

    private static boolean llIIllIIIIllI(int i) {
        return i != 0;
    }

    private static boolean llIIllIIIIlll(int i) {
        return i > 0;
    }

    static {
        llIIllIIIIIll();
        llIIllIIIIIlI();
    }

    private static boolean llIIllIIIllIl(int i, int i2) {
        return i >= i2;
    }

    private static String llIIllIIIIIIl(String lllllllllllllllllIlIlllIIIlIlIlI, String lllllllllllllllllIlIlllIIIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIlllIIIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlllIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), llllIIIllI[35]), "DES");
            Cipher lllllllllllllllllIlIlllIIIlIllII = Cipher.getInstance("DES");
            lllllllllllllllllIlIlllIIIlIllII.init(llllIIIllI[10], lllllllllllllllllIlIlllIIIlIllIl);
            return new String(lllllllllllllllllIlIlllIIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlllIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlllIIIlIlIll) {
            lllllllllllllllllIlIlllIIIlIlIll.printStackTrace();
            return null;
        }
    }

    private static int llIIllIIIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static void Q() {
        int[] iArr = new int[llllIIIllI[0]];
        iArr[llllIIIllI[1]] = llllIIIllI[2];
        if (llIIllIIIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (llIIllIIIIlIl(nearest) && llIIllIIIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[1]];
                C0000a.a(nearest);
            }
            if (llIIllIIIIlIl(nearest) && llIIllIIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[0]];
                if (llIIllIIIIlII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llllIIIllI[3]);
                    "".length();
                }
                if (llIIllIIIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (llIIllIIIIlll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llllIIIllI[0]);
                        "".length();
                    }
                    C0000a.a(llllIIIllI[2], llllIIIllI[4]);
                    C0000a.a(llllIIIllI[5], llllIIIllI[0]);
                    C0000a.a(llllIIIllI[6], llllIIIllI[7]);
                }
            }
        }
        int[] iArr2 = new int[llllIIIllI[0]];
        iArr2[llllIIIllI[1]] = llllIIIllI[2];
        if (llIIllIIIIllI(Inventory.contains(iArr2) ? 1 : 0)) {
            R();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIllIIIllIl(Skills.getLevel(Skill.RANGED), llllIIIllI[39])) {
            ?? r0 = llllIIIllI[0];
            "".length();
            return "   ".length() <= (-" ".length()) ? ((((18 + 91) - 88) + 196) ^ (((86 + 20) - (-41)) + 48)) & (((((54 + 0) - 25) + 106) ^ (((29 + 23) - (-32)) + 73)) ^ (-" ".length())) : r0;
        }
        return llllIIIllI[1];
    }

    private static boolean llIIllIIIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIllIIIIlIl(Object obj) {
        return obj != null;
    }

    private static String llIIllIIIIIII(String lllllllllllllllllIlIlllIIIIllIll, String lllllllllllllllllIlIlllIIIIlllII) {
        try {
            SecretKeySpec lllllllllllllllllIlIlllIIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlllIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIlllIIIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIlllIIIIlllll.init(llllIIIllI[10], lllllllllllllllllIlIlllIIIlIIIII);
            return new String(lllllllllllllllllIlIlllIIIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlllIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlllIIIIllllI) {
            lllllllllllllllllIlIlllIIIIllllI.printStackTrace();
            return null;
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            Q();
            "".length();
            if (((((9 + 6) - (-32)) + 117) ^ (((110 + 126) - 184) + 108)) == "  ".length()) {
                return ((((179 + 153) - 277) + 136) ^ (((85 + 91) - 48) + 30)) & (((143 ^ 186) ^ (141 ^ 153)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return llllIIIllI[38];
    }

    private static void R() {
        new WorldPoint(llllIIIllI[8], llllIIIllI[9], llllIIIllI[10]);
        new WorldPoint(llllIIIllI[8], llllIIIllI[9], llllIIIllI[0]);
        WorldArea worldArea = new WorldArea(llllIIIllI[11], llllIIIllI[12], llllIIIllI[13], llllIIIllI[14], llllIIIllI[0]);
        new WorldArea(llllIIIllI[11], llllIIIllI[12], llllIIIllI[13], llllIIIllI[14], llllIIIllI[0]);
        WorldArea worldArea2 = new WorldArea(llllIIIllI[15], llllIIIllI[16], llllIIIllI[17], llllIIIllI[18], llllIIIllI[1]);
        WorldPoint worldPoint = new WorldPoint(llllIIIllI[8], llllIIIllI[19], llllIIIllI[1]);
        if (llIIllIIIlIIl(llIIllIIIlIII(C0004e.u(), 45.0d))) {
            int[] iArr = new int[llllIIIllI[0]];
            iArr[llllIIIllI[1]] = llllIIIllI[2];
            if (llIIllIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllIIIllI[0]];
                iArr2[llllIIIllI[1]] = llllIIIllI[2];
                Inventory.getFirst(iArr2).interact(llllIIIlIl[llllIIIllI[10]]);
                Time.sleepTicks(llllIIIllI[0]);
                "".length();
            }
        }
        if (llIIllIIIIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[20]];
            WorldArea worldArea3 = new WorldArea(llllIIIllI[21], llllIIIllI[22], llllIIIllI[23], llllIIIllI[24], llllIIIllI[1]);
            if (llIIllIIIIlII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(llllIIIllI[25], llllIIIllI[26], llllIIIllI[1]);
                if (llIIllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llllIIIllI[27])) {
                    Movement.walkTo(worldPoint2);
                    "".length();
                    Time.sleepTicks(llllIIIllI[0]);
                    "".length();
                }
                if (llIIllIIIlIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llllIIIllI[27])) {
                    String[] strArr = new String[llllIIIllI[0]];
                    strArr[llllIIIllI[1]] = llllIIIlIl[llllIIIllI[28]];
                    TileObjects.getNearest(strArr).interact(llllIIIlIl[llllIIIllI[29]]);
                    Time.sleepTicks(llllIIIllI[20]);
                    "".length();
                }
            }
            if (llIIllIIIIllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIIllIIIIlII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llllIIIllI[0]);
                "".length();
            }
            if (llIIllIIIIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (llIIllIIIIllI(tileObject.getName().contains(llllIIIlIl[llllIIIllI[44]]) ? 1 : 0) && llIIllIIIIllI(worldArea2.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = llllIIIllI[0];
                        "".length();
                        return ((79 ^ 97) ^ (165 ^ 143)) != ((((133 + 134) - 179) + 107) ^ (((100 + 61) - 9) + 47)) ? ((123 ^ 81) ^ (55 ^ 19)) & (((((166 + 63) - 187) + 146) ^ (((142 + 177) - 281) + 140)) ^ (-" ".length())) : r0;
                    }
                    return llllIIIllI[1];
                });
                if (llIIllIIIllII(nearest)) {
                    WorldPoint[] worldPointArr = new WorldPoint[llllIIIllI[28]];
                    worldPointArr[llllIIIllI[1]] = new WorldPoint(llllIIIllI[8], llllIIIllI[19], llllIIIllI[1]);
                    worldPointArr[llllIIIllI[0]] = new WorldPoint(llllIIIllI[30], llllIIIllI[31], llllIIIllI[1]);
                    worldPointArr[llllIIIllI[10]] = new WorldPoint(llllIIIllI[30], llllIIIllI[32], llllIIIllI[1]);
                    worldPointArr[llllIIIllI[20]] = new WorldPoint(llllIIIllI[30], llllIIIllI[33], llllIIIllI[1]);
                    Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                    "".length();
                }
                if (llIIllIIIIlIl(nearest)) {
                    nearest.interact(llllIIIlIl[llllIIIllI[27]]);
                    Time.sleepTicks(llllIIIllI[20]);
                    "".length();
                }
            }
        }
        if (llIIllIIIIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIllIIIllII(Players.getLocal().getInteracting())) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[34]];
                NPC nearest2 = NPCs.getNearest(npc -> {
                    if (llIIllIIIIllI(npc.getName().contains(llllIIIlIl[llllIIIllI[42]]) ? 1 : 0)) {
                        String[] strArr2 = new String[llllIIIllI[0]];
                        strArr2[llllIIIllI[1]] = llllIIIlIl[llllIIIllI[43]];
                        if (llIIllIIIIllI(npc.hasAction(strArr2) ? 1 : 0) && llIIllIIIIlII(npc.isDead() ? 1 : 0) && llIIllIIIllII(npc.getInteracting())) {
                            ?? r0 = llllIIIllI[0];
                            "".length();
                            return (132 ^ 128) > (108 ^ 104) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llllIIIllI[1];
                });
                NPC nearest3 = NPCs.getNearest(npc2 -> {
                    if (llIIllIIIIllI(npc2.getName().contains(llllIIIlIl[llllIIIllI[40]]) ? 1 : 0) && llIIllIIIIlII(npc2.isDead() ? 1 : 0)) {
                        String[] strArr2 = new String[llllIIIllI[0]];
                        strArr2[llllIIIllI[1]] = llllIIIlIl[llllIIIllI[41]];
                        if (llIIllIIIIllI(npc2.hasAction(strArr2) ? 1 : 0) && llIIllIIIlllI(npc2.getInteracting(), Players.getLocal())) {
                            ?? r0 = llllIIIllI[0];
                            "".length();
                            return (((161 ^ 134) ^ (116 ^ 16)) & (((((200 + 135) - 88) + 8) ^ (((181 + 25) - 139) + 121)) ^ (-" ".length()))) >= "  ".length() ? ((18 ^ 105) ^ (112 ^ 95)) & (((((58 + 67) - (-28)) + 67) ^ (((67 + 22) - 51) + 98)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llllIIIllI[1];
                });
                if (llIIllIIIIlIl(nearest2) && llIIllIIIllII(nearest3)) {
                    AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[35]];
                    nearest2.interact(llllIIIlIl[llllIIIllI[36]]);
                    Time.sleepTicks(llllIIIllI[10]);
                    "".length();
                }
                if (llIIllIIIIlIl(nearest3)) {
                    AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[7]];
                    nearest3.interact(llllIIIlIl[llllIIIllI[13]]);
                    Time.sleepTicks(llllIIIllI[20]);
                    "".length();
                }
            }
            if (llIIllIIIIlIl(Players.getLocal().getInteracting())) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[37]];
                Time.sleepTicks(llllIIIllI[0]);
                "".length();
            }
        }
    }

    private static void llIIllIIIIIlI() {
        llllIIIlIl = new String[llllIIIllI[45]];
        llllIIIlIl[llllIIIllI[1]] = llIIlIlllllll("LAkMCB8DHBMPH0IcFUEaAwYR", "bhzax");
        llllIIIlIl[llllIIIllI[0]] = llIIllIIIIIII("FknInrSRxdvZJkUSQ3hbVAs5tKUYOwSk", "gnQDG");
        llllIIIlIl[llllIIIllI[10]] = llIIlIlllllll("FyUk", "RDPay");
        llllIIIlIl[llllIIIllI[20]] = llIIllIIIIIII("RuDEzuGW5e6djzwTNSOiwQ==", "jGUOA");
        llllIIIlIl[llllIIIllI[28]] = llIIlIlllllll("HwwCGWYbAgUGZhwMBQEnIA==", "LcwuF");
        llllIIIlIl[llllIIIllI[29]] = llIIlIlllllll("Bxk/FgI=", "BwKsp");
        llllIIIlIl[llllIIIllI[27]] = llIIllIIIIIIl("L6JRXQSOUdXAICN5U9RF8Q==", "FEnjl");
        llllIIIlIl[llllIIIllI[34]] = llIIllIIIIIIl("e9g//yfvSW+XGxVD+8ifMQ==", "GlYYt");
        llllIIIlIl[llllIIIllI[35]] = llIIllIIIIIIl("gYe7M2SvdwNYwuQS1AKvzQ==", "NIRAd");
        llllIIIlIl[llllIIIllI[36]] = llIIllIIIIIIl("1bFh6F6n+7Y=", "BXxMu");
        llllIIIlIl[llllIIIllI[7]] = llIIllIIIIIIl("+e/+HriXdjQvELgaO38w2g==", "ApwGj");
        llllIIIlIl[llllIIIllI[13]] = llIIlIlllllll("Nh85DgIc", "wkMoa");
        llllIIIlIl[llllIIIllI[37]] = llIIllIIIIIII("rJbFRl3tFqal50k5fVPBSQ==", "BQaFI");
        llllIIIlIl[llllIIIllI[14]] = llIIlIlllllll("IAILCDsSGRwBdDUCDAMn", "fmyoT");
        llllIIIlIl[llllIIIllI[40]] = llIIllIIIIIIl("m9zOvseFjkg=", "bziWl");
        llllIIIlIl[llllIIIllI[41]] = llIIllIIIIIII("IaQMG4z6fd0=", "Lngey");
        llllIIIlIl[llllIIIllI[42]] = llIIlIlllllll("ESwsKg==", "BCYFu");
        llllIIIlIl[llllIIIllI[43]] = llIIlIlllllll("JBUNNjQO", "eayWW");
        llllIIIlIl[llllIIIllI[44]] = llIIllIIIIIIl("nIyh+q1hPoXy9r9AE7idhQ==", "fFYIp");
    }

    private static String llIIlIlllllll(String lllllllllllllllllIlIlllIIIIIllIl, String lllllllllllllllllIlIlllIIIIIllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlllIIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIlllIIIIIlIll = new StringBuilder();
        char[] lllllllllllllllllIlIlllIIIIIlIlI = lllllllllllllllllIlIlllIIIIIllII.toCharArray();
        int lllllllllllllllllIlIlllIIIIIlIIl = llllIIIllI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIIIllI[1];
        while (llIIllIIIllll(i, length)) {
            lllllllllllllllllIlIlllIIIIIlIll.append((char) (charArray[i] ^ lllllllllllllllllIlIlllIIIIIlIlI[lllllllllllllllllIlIlllIIIIIlIIl % lllllllllllllllllIlIlllIIIIIlIlI.length]));
            "".length();
            lllllllllllllllllIlIlllIIIIIlIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIlllIIIIIlIll);
    }

    private static boolean llIIllIIIIlII(int i) {
        return i == 0;
    }

    private static void llIIllIIIIIll() {
        llllIIIllI = new int[46];
        llllIIIllI[0] = " ".length();
        llllIIIllI[1] = (102 ^ 5) & ((124 ^ 31) ^ (-1));
        llllIIIllI[2] = (-((-24723) & 32403)) & (-129) & 8187;
        llllIIIllI[3] = (-((-809) & 12140)) & (-49) & 16379;
        llllIIIllI[4] = 73 ^ 81;
        llllIIIllI[5] = (-((-13969) & 16063)) & (-16385) & 31103;
        llllIIIllI[6] = (-((-4739) & 12951)) & (-163) & 16383;
        llllIIIllI[7] = 186 ^ 176;
        llllIIIllI[8] = (-29057) & 31191;
        llllIIIllI[9] = (-65) & 3061;
        llllIIIllI[10] = "  ".length();
        llllIIIllI[11] = (-8870) & 10997;
        llllIIIllI[12] = (-29698) & 32687;
        llllIIIllI[13] = 80 ^ 91;
        llllIIIllI[14] = (56 ^ 117) ^ (53 ^ 117);
        llllIIIllI[15] = (-((-3097) & 28607)) & (-17) & 27647;
        llllIIIllI[16] = (-13410) & 16379;
        llllIIIllI[17] = (1 ^ 15) ^ (72 ^ 89);
        llllIIIllI[18] = 25 ^ 58;
        llllIIIllI[19] = (-(104 ^ 41)) & (-8195) & 11231;
        llllIIIllI[20] = "   ".length();
        llllIIIllI[21] = (-((-10397) & 15517)) & (-485) & 7679;
        llllIIIllI[22] = (-16673) & 19430;
        llllIIIllI[23] = (-18949) & 19223;
        llllIIIllI[24] = ((35 + 28) - (-76)) + 113;
        llllIIIllI[25] = (-20535) & 23615;
        llllIIIllI[26] = (-((-11155) & 31675)) & (-8261) & 32255;
        llllIIIllI[27] = (1 ^ 8) ^ (181 ^ 186);
        llllIIIllI[28] = 131 ^ 135;
        llllIIIllI[29] = (217 ^ 162) ^ (40 ^ 86);
        llllIIIllI[30] = (-25249) & 27382;
        llllIIIllI[31] = (-((-3969) & 32725)) & (-11) & 31743;
        llllIIIllI[32] = (-25) & 3007;
        llllIIIllI[33] = (-1097) & 4089;
        llllIIIllI[34] = (59 ^ 12) ^ (66 ^ 114);
        llllIIIllI[35] = (33 ^ 61) ^ (49 ^ 37);
        llllIIIllI[36] = 207 ^ 198;
        llllIIIllI[37] = (241 ^ 145) ^ (31 ^ 115);
        llllIIIllI[38] = 43 ^ 79;
        llllIIIllI[39] = 194 ^ 161;
        llllIIIllI[40] = 2 ^ 12;
        llllIIIllI[41] = 131 ^ 140;
        llllIIIllI[42] = "   ".length() ^ (154 ^ 137);
        llllIIIllI[43] = 9 ^ 24;
        llllIIIllI[44] = 212 ^ 198;
        llllIIIllI[45] = 50 ^ 33;
    }

    private static boolean llIIllIIIllll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIllIIIlIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIllIIIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIllIIIllII(Object obj) {
        return obj == null;
    }

    private static boolean llIIllIIIlIIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIIIllI[1];
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllIIIlIl[llllIIIllI[14]];
    }
}
