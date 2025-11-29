package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/j.class */
public class C0009j implements F {
    private static /* synthetic */ String[] lllIlIII;
    private static /* synthetic */ int[] lllIlIIl;

    private static boolean llIIIIIIIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lllIlIIl[1];
    }

    private static boolean llIIIIIIllI(int i, int i2) {
        return i <= i2;
    }

    private static String lIllllllIlI(String lIIllllllllllIl, String lIIllllllllllII) {
        try {
            SecretKeySpec lIlIIIIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllllllllII.getBytes(StandardCharsets.UTF_8)), lllIlIIl[35]), "DES");
            Cipher lIIllllllllllll = Cipher.getInstance("DES");
            lIIllllllllllll.init(lllIlIIl[10], lIlIIIIIIIIIIII);
            return new String(lIIllllllllllll.doFinal(Base64.getDecoder().decode(lIIllllllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlllllllllllI) {
            lIIlllllllllllI.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIll(String lIlIIIIIIIlllll, String lIlIIIIIIIllllI) {
        String lIlIIIIIIIlllll2 = new String(Base64.getDecoder().decode(lIlIIIIIIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIIIIIIIllllI.toCharArray();
        int lIlIIIIIIIllIll = lllIlIIl[1];
        char[] charArray2 = lIlIIIIIIIlllll2.toCharArray();
        int length = charArray2.length;
        int i = lllIlIIl[1];
        while (llIIIIIlIlI(i, length)) {
            char lIlIIIIIIlIIIII = charArray2[i];
            sb.append((char) (lIlIIIIIIlIIIII ^ charArray[lIlIIIIIIIllIll % charArray.length]));
            "".length();
            lIlIIIIIIIllIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static void R() {
        int[] iArr = new int[lllIlIIl[0]];
        iArr[lllIlIIl[1]] = lllIlIIl[2];
        if (lIlllllllll(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (llIIIIIIIII(nearest) && lIlllllllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[1]];
                C0000a.a(nearest);
            }
            if (llIIIIIIIII(nearest) && llIIIIIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[0]];
                if (lIlllllllll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lllIlIIl[3]);
                    "".length();
                }
                if (llIIIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                    if (llIIIIIIIlI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lllIlIIl[0]);
                        "".length();
                    }
                    C0000a.a(lllIlIIl[2], lllIlIIl[4]);
                    C0000a.a(lllIlIIl[5], lllIlIIl[0]);
                    C0000a.a(lllIlIIl[6], lllIlIIl[7]);
                }
            }
        }
        int[] iArr2 = new int[lllIlIIl[0]];
        iArr2[lllIlIIl[1]] = lllIlIIl[2];
        if (llIIIIIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            S();
        }
    }

    private static boolean lIlllllllll(int i) {
        return i == 0;
    }

    private static void lIlllllllIl() {
        lllIlIII = new String[lllIlIIl[45]];
        lllIlIII[lllIlIIl[1]] = lIllllllIlI("R38dd8lGDi2YyoAnNdp07iTqBggHhnuD", "lfsLV");
        lllIlIII[lllIlIIl[0]] = lIllllllIll("ICwcPQoBIxV5BAkjGTAIDw==", "hMrYf");
        lllIlIII[lllIlIIl[10]] = lIllllllIll("MyI2", "vCBxo");
        lllIlIII[lllIlIIl[20]] = lIllllllIlI("20aMswTgnukykeHoYrvuHA==", "bpjIh");
        lllIlIII[lllIlIIl[28]] = lIlllllllII("U5HNCt33/ealcgN4QDUf5f+YtXR6vWRU", "HDGFO");
        lllIlIII[lllIlIIl[29]] = lIllllllIll("AzowDTM=", "FTDhA");
        lllIlIII[lllIlIIl[27]] = lIllllllIlI("ske6GvYTEBC8cj13v8Ks5g==", "JRWIA");
        lllIlIII[lllIlIIl[34]] = lIllllllIll("Mww+Cg0cCz5CChoQNRE=", "ueYby");
        lllIlIII[lllIlIIl[35]] = lIlllllllII("o/L20YSm8z4yaiAk9MWrQw==", "aCSze");
        lllIlIII[lllIlIIl[36]] = lIllllllIlI("mSFPW6QpFBg=", "dsACH");
        lllIlIII[lllIlIIl[7]] = lIllllllIlI("a9mkgy4F9pMnga7kUWtHvQ==", "sOevB");
        lllIlIII[lllIlIIl[13]] = lIllllllIlI("4JPmfdBce/E=", "douSF");
        lllIlIII[lllIlIIl[37]] = lIlllllllII("QoR1qppnNv0gOSdC+iaACw==", "FXdSl");
        lllIlIII[lllIlIIl[14]] = lIllllllIll("HwA8EDgtGysZdwoAOxsk", "YoNwW");
        lllIlIII[lllIlIIl[40]] = lIllllllIll("KggEGA==", "ygqtM");
        lllIlIII[lllIlIIl[41]] = lIllllllIll("KBYXFhsC", "ibcwx");
        lllIlIII[lllIlIIl[42]] = lIlllllllII("JtCHz+EWg2U=", "rMQEN");
        lllIlIII[lllIlIIl[43]] = lIlllllllII("q+4Pb9XQp20=", "LECTR");
        lllIlIII[lllIlIIl[44]] = lIllllllIlI("caBsb9Jv8YtbCtcmZ3cckQ==", "ZpvnK");
    }

    private static String lIlllllllII(String lIlIIIIIIIIlIlI, String lIlIIIIIIIIIlll) {
        try {
            SecretKeySpec lIlIIIIIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlIIl[10], lIlIIIIIIIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIIIIIIlIll) {
            lIlIIIIIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIIIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIIlIII(int i, int i2) {
        return i >= i2;
    }

    private static void lIllllllllI() {
        lllIlIIl = new int[46];
        lllIlIIl[0] = " ".length();
        lllIlIIl[1] = (251 ^ 190) & ((44 ^ 105) ^ (-1));
        lllIlIIl[2] = (-((-105) & 23145)) & (-1157) & 24575;
        lllIlIIl[3] = (-10290) & 15289;
        lllIlIIl[4] = (49 ^ 28) ^ (128 ^ 181);
        lllIlIIl[5] = (-20003) & 32627;
        lllIlIIl[6] = (-((-2089) & 26815)) & (-33) & 32767;
        lllIlIIl[7] = (125 ^ 17) ^ (73 ^ 47);
        lllIlIIl[8] = (-1025) & 3159;
        lllIlIIl[9] = (-4099) & 7095;
        lllIlIIl[10] = "  ".length();
        lllIlIIl[11] = (-((-2518) & 23551)) & (-135) & 23295;
        lllIlIIl[12] = (-20562) & 23551;
        lllIlIIl[13] = 50 ^ 57;
        lllIlIIl[14] = (124 ^ 56) ^ (122 ^ 51);
        lllIlIIl[15] = (-18305) & 20425;
        lllIlIIl[16] = (-((-641) & 29349)) & (-1090) & 32767;
        lllIlIIl[17] = 87 ^ 72;
        lllIlIIl[18] = 44 ^ 15;
        lllIlIIl[19] = (-((-11017) & 16171)) & (-65) & 8191;
        lllIlIIl[20] = "   ".length();
        lllIlIIl[21] = (-((-8269) & 26445)) & (-65) & 20315;
        lllIlIIl[22] = (-((-89) & 25946)) & (-17) & 28631;
        lllIlIIl[23] = (-15981) & 16255;
        lllIlIIl[24] = (((137 ^ 145) + (5 ^ 78)) - (180 ^ 141)) + ((65 + 81) - 77) + 141;
        lllIlIIl[25] = (-((-4035) & 12231)) & (-21139) & 32415;
        lllIlIIl[26] = (-((-3541) & 15861)) & (-16905) & 32699;
        lllIlIIl[27] = (226 ^ 162) ^ (94 ^ 24);
        lllIlIIl[28] = 90 ^ 94;
        lllIlIIl[29] = (((137 + 105) - 156) + 77) ^ (((136 + 132) - 149) + 47);
        lllIlIIl[30] = (-5026) & 7159;
        lllIlIIl[31] = (-((-4289) & 29899)) & (-4161) & 32747;
        lllIlIIl[32] = (-((-10593) & 15729)) & (-65) & 8183;
        lllIlIIl[33] = (-((-22677) & 31903)) & (-20485) & 32703;
        lllIlIIl[34] = (12 ^ 65) ^ (193 ^ 139);
        lllIlIIl[35] = (((113 + 48) - 107) + 101) ^ (((48 + 85) - 13) + 27);
        lllIlIIl[36] = 158 ^ 151;
        lllIlIIl[37] = (166 ^ 157) ^ (158 ^ 169);
        lllIlIIl[38] = (199 ^ 162) ^ " ".length();
        lllIlIIl[39] = 99 ^ 0;
        lllIlIIl[40] = 34 ^ 44;
        lllIlIIl[41] = (((59 + 77) - 52) + 44) ^ (((17 + 22) - (-90)) + 14);
        lllIlIIl[42] = 13 ^ 29;
        lllIlIIl[43] = (79 ^ 74) ^ (78 ^ 90);
        lllIlIIl[44] = 21 ^ 7;
        lllIlIIl[45] = (79 ^ 56) ^ (111 ^ 11);
    }

    private static void S() {
        new WorldPoint(lllIlIIl[8], lllIlIIl[9], lllIlIIl[10]);
        new WorldPoint(lllIlIIl[8], lllIlIIl[9], lllIlIIl[0]);
        WorldArea worldArea = new WorldArea(lllIlIIl[11], lllIlIIl[12], lllIlIIl[13], lllIlIIl[14], lllIlIIl[0]);
        new WorldArea(lllIlIIl[11], lllIlIIl[12], lllIlIIl[13], lllIlIIl[14], lllIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lllIlIIl[15], lllIlIIl[16], lllIlIIl[17], lllIlIIl[18], lllIlIIl[1]);
        WorldPoint worldPoint = new WorldPoint(lllIlIIl[8], lllIlIIl[19], lllIlIIl[1]);
        if (llIIIIIIlII(llIIIIIIIll(C0004e.v(), 45.0d))) {
            int[] iArr = new int[lllIlIIl[0]];
            iArr[lllIlIIl[1]] = lllIlIIl[2];
            if (llIIIIIIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIlIIl[0]];
                iArr2[lllIlIIl[1]] = lllIlIIl[2];
                Inventory.getFirst(iArr2).interact(lllIlIII[lllIlIIl[10]]);
                Time.sleepTicks(lllIlIIl[0]);
                "".length();
            }
        }
        if (lIlllllllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lllIlIII[lllIlIIl[20]];
            WorldArea worldArea3 = new WorldArea(lllIlIIl[21], lllIlIIl[22], lllIlIIl[23], lllIlIIl[24], lllIlIIl[1]);
            if (lIlllllllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(lllIlIIl[25], lllIlIIl[26], lllIlIIl[1]);
                if (llIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIlIIl[27])) {
                    Movement.walkTo(worldPoint2);
                    "".length();
                    Time.sleepTicks(lllIlIIl[0]);
                    "".length();
                }
                if (llIIIIIIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllIlIIl[27])) {
                    String[] strArr = new String[lllIlIIl[0]];
                    strArr[lllIlIIl[1]] = lllIlIII[lllIlIIl[28]];
                    TileObjects.getNearest(strArr).interact(lllIlIII[lllIlIIl[29]]);
                    Time.sleepTicks(lllIlIIl[20]);
                    "".length();
                }
            }
            if (llIIIIIIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllllllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lllIlIIl[0]);
                "".length();
            }
            if (llIIIIIIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (llIIIIIIIIl(tileObject.getName().contains(lllIlIII[lllIlIIl[44]]) ? 1 : 0) && llIIIIIIIIl(worldArea2.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = lllIlIIl[0];
                        "".length();
                        return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                    }
                    return lllIlIIl[1];
                });
                if (llIIIIIIlll(nearest)) {
                    WorldPoint[] worldPointArr = new WorldPoint[lllIlIIl[28]];
                    worldPointArr[lllIlIIl[1]] = new WorldPoint(lllIlIIl[8], lllIlIIl[19], lllIlIIl[1]);
                    worldPointArr[lllIlIIl[0]] = new WorldPoint(lllIlIIl[30], lllIlIIl[31], lllIlIIl[1]);
                    worldPointArr[lllIlIIl[10]] = new WorldPoint(lllIlIIl[30], lllIlIIl[32], lllIlIIl[1]);
                    worldPointArr[lllIlIIl[20]] = new WorldPoint(lllIlIIl[30], lllIlIIl[33], lllIlIIl[1]);
                    Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                    "".length();
                }
                if (llIIIIIIIII(nearest)) {
                    nearest.interact(lllIlIII[lllIlIIl[27]]);
                    Time.sleepTicks(lllIlIIl[20]);
                    "".length();
                }
            }
        }
        if (llIIIIIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIIIIIlll(Players.getLocal().getInteracting())) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[34]];
                NPC nearest2 = NPCs.getNearest(npc -> {
                    if (llIIIIIIIIl(npc.getName().contains(lllIlIII[lllIlIIl[42]]) ? 1 : 0)) {
                        String[] strArr2 = new String[lllIlIIl[0]];
                        strArr2[lllIlIIl[1]] = lllIlIII[lllIlIIl[43]];
                        if (llIIIIIIIIl(npc.hasAction(strArr2) ? 1 : 0) && lIlllllllll(npc.isDead() ? 1 : 0) && llIIIIIIlll(npc.getInteracting())) {
                            ?? r0 = lllIlIIl[0];
                            "".length();
                            return (-" ".length()) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return lllIlIIl[1];
                });
                NPC nearest3 = NPCs.getNearest(npc2 -> {
                    if (llIIIIIIIIl(npc2.getName().contains(lllIlIII[lllIlIIl[40]]) ? 1 : 0) && lIlllllllll(npc2.isDead() ? 1 : 0)) {
                        String[] strArr2 = new String[lllIlIIl[0]];
                        strArr2[lllIlIIl[1]] = lllIlIII[lllIlIIl[41]];
                        if (llIIIIIIIIl(npc2.hasAction(strArr2) ? 1 : 0) && llIIIIIlIIl(npc2.getInteracting(), Players.getLocal())) {
                            ?? r0 = lllIlIIl[0];
                            "".length();
                            return (((215 ^ 194) ^ (166 ^ 175)) & (((70 ^ 12) ^ (120 ^ 46)) ^ (-" ".length()))) == "   ".length() ? ((125 ^ 84) ^ (61 ^ 90)) & (((226 ^ 160) ^ (125 ^ 113)) ^ (-" ".length())) : r0;
                        }
                    }
                    return lllIlIIl[1];
                });
                if (llIIIIIIIII(nearest2) && llIIIIIIlll(nearest3)) {
                    AccBuilderBarrows.c = lllIlIII[lllIlIIl[35]];
                    nearest2.interact(lllIlIII[lllIlIIl[36]]);
                    Time.sleepTicks(lllIlIIl[10]);
                    "".length();
                }
                if (llIIIIIIIII(nearest3)) {
                    AccBuilderBarrows.c = lllIlIII[lllIlIIl[7]];
                    nearest3.interact(lllIlIII[lllIlIIl[13]]);
                    Time.sleepTicks(lllIlIIl[20]);
                    "".length();
                }
            }
            if (llIIIIIIIII(Players.getLocal().getInteracting())) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[37]];
                Time.sleepTicks(lllIlIIl[0]);
                "".length();
            }
        }
    }

    private static boolean llIIIIIIIlI(int i) {
        return i > 0;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            R();
            "".length();
            if (0 != 0) {
                return (82 ^ 65) & ((132 ^ 151) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIlIIl[38];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIIIIIlIII(Skills.getLevel(Skill.RANGED), lllIlIIl[39])) {
            ?? r0 = lllIlIIl[0];
            "".length();
            return !((true ^ true) ^ (true ^ true)) ? ((((93 + 73) - 42) + 127) ^ (((94 + 116) - 24) + 1)) & (((209 ^ 150) ^ (187 ^ 188)) ^ (-" ".length())) : r0;
        }
        return lllIlIIl[1];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lllIlIII[lllIlIIl[14]];
    }

    private static boolean llIIIIIIlIl(int i, int i2) {
        return i > i2;
    }

    static {
        lIllllllllI();
        lIlllllllIl();
    }

    private static boolean llIIIIIIlII(int i) {
        return i < 0;
    }

    private static boolean llIIIIIIlll(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIIIIII(Object obj) {
        return obj != null;
    }

    private static int llIIIIIIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }
}
