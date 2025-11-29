package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/k.class */
public class C0024k implements InterfaceC0003ac {
    private static /* synthetic */ int[] llIlIIllIl;
    private static /* synthetic */ String[] llIlIIllII;

    private static boolean lIllIIlIlIIIl(int i) {
        return i > 0;
    }

    private static boolean lIllIIlIllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIlIllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIlIllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIIlIIlIIl(String llllllllllllllllllIIIlllllllIllI, String llllllllllllllllllIIIlllllllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlllllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIllllllllIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIllllllllIII.init(llIlIIllIl[10], secretKeySpec);
            return new String(llllllllllllllllllIIIllllllllIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlllllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlllllllIlll) {
            llllllllllllllllllIIIlllllllIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIIllIl[1];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            ac();
            "".length();
            if ((((33 ^ 122) ^ (127 ^ 13)) & (((((138 + 124) - 69) + 44) ^ (((105 + 8) - 73) + 156)) ^ (-" ".length()))) < (((67 ^ 92) ^ (129 ^ 196)) & (((77 ^ 111) ^ (248 ^ 128)) ^ (-" ".length())))) {
                return ((79 ^ 112) ^ (209 ^ 193)) & (((212 ^ 164) ^ (74 ^ 21)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlIIllIl[38];
    }

    public static void ac() {
        int[] iArr = new int[llIlIIllIl[0]];
        iArr[llIlIIllIl[1]] = llIlIIllIl[2];
        if (lIllIIlIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIllIIlIIllll(nearest) && lIllIIlIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIlIIllII[llIlIIllIl[1]];
                C0000a.a(nearest);
            }
            if (lIllIIlIIllll(nearest) && lIllIIlIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIlIIllII[llIlIIllIl[0]];
                if (lIllIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIIllIl[3]);
                    "".length();
                }
                if (lIllIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                    if (lIllIIlIlIIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIlIIllIl[0]);
                        "".length();
                    }
                    C0000a.a(llIlIIllIl[2], llIlIIllIl[4]);
                    C0000a.a(llIlIIllIl[5], llIlIIllIl[0]);
                    C0000a.a(llIlIIllIl[6], llIlIIllIl[7]);
                }
            }
        }
        int[] iArr2 = new int[llIlIIllIl[0]];
        iArr2[llIlIIllIl[1]] = llIlIIllIl[2];
        if (lIllIIlIlIIII(Inventory.contains(iArr2) ? 1 : 0)) {
            ad();
        }
    }

    private static boolean lIllIIlIIlllI(int i) {
        return i == 0;
    }

    private static boolean lIllIIlIlIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllIIlIIllll(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIlIlIIII(int i) {
        return i != 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIIllII[llIlIIllIl[14]];
    }

    private static int lIllIIlIlIIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        lIllIIlIIllIl();
        lIllIIlIIllII();
    }

    private static boolean lIllIIlIlIllI(Object obj) {
        return obj == null;
    }

    private static void ad() {
        new WorldPoint(llIlIIllIl[8], llIlIIllIl[9], llIlIIllIl[10]);
        new WorldPoint(llIlIIllIl[8], llIlIIllIl[9], llIlIIllIl[0]);
        WorldArea worldArea = new WorldArea(llIlIIllIl[11], llIlIIllIl[12], llIlIIllIl[13], llIlIIllIl[14], llIlIIllIl[0]);
        new WorldArea(llIlIIllIl[11], llIlIIllIl[12], llIlIIllIl[13], llIlIIllIl[14], llIlIIllIl[0]);
        WorldArea worldArea2 = new WorldArea(llIlIIllIl[15], llIlIIllIl[16], llIlIIllIl[17], llIlIIllIl[18], llIlIIllIl[1]);
        WorldPoint worldPoint = new WorldPoint(llIlIIllIl[8], llIlIIllIl[19], llIlIIllIl[1]);
        if (lIllIIlIlIIll(lIllIIlIlIIlI(C0018e.w(), 45.0d))) {
            int[] iArr = new int[llIlIIllIl[0]];
            iArr[llIlIIllIl[1]] = llIlIIllIl[2];
            if (lIllIIlIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIIllIl[0]];
                iArr2[llIlIIllIl[1]] = llIlIIllIl[2];
                Inventory.getFirst(iArr2).interact(llIlIIllII[llIlIIllIl[10]]);
                Time.sleepTicks(llIlIIllIl[0]);
                "".length();
            }
        }
        if (lIllIIlIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlIIllII[llIlIIllIl[20]];
            WorldArea worldArea3 = new WorldArea(llIlIIllIl[21], llIlIIllIl[22], llIlIIllIl[23], llIlIIllIl[24], llIlIIllIl[1]);
            if (lIllIIlIIlllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(llIlIIllIl[25], llIlIIllIl[26], llIlIIllIl[1]);
                if (lIllIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIlIIllIl[27])) {
                    Movement.walkTo(worldPoint2);
                    "".length();
                    Time.sleepTicks(llIlIIllIl[0]);
                    "".length();
                }
                if (lIllIIlIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), llIlIIllIl[27])) {
                    String[] strArr = new String[llIlIIllIl[0]];
                    strArr[llIlIIllIl[1]] = llIlIIllII[llIlIIllIl[28]];
                    TileObjects.getNearest(strArr).interact(llIlIIllII[llIlIIllIl[29]]);
                    Time.sleepTicks(llIlIIllIl[20]);
                    "".length();
                }
            }
            if (lIllIIlIlIIII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIllIIlIIlllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llIlIIllIl[0]);
                "".length();
            }
            if (lIllIIlIlIIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIllIIlIlIIII(tileObject.getName().contains(llIlIIllII[llIlIIllIl[44]]) ? 1 : 0) && lIllIIlIlIIII(worldArea2.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = llIlIIllIl[0];
                        "".length();
                        return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIIllIl[1];
                });
                if (lIllIIlIlIllI(nearest)) {
                    WorldPoint[] worldPointArr = new WorldPoint[llIlIIllIl[28]];
                    worldPointArr[llIlIIllIl[1]] = new WorldPoint(llIlIIllIl[8], llIlIIllIl[19], llIlIIllIl[1]);
                    worldPointArr[llIlIIllIl[0]] = new WorldPoint(llIlIIllIl[30], llIlIIllIl[31], llIlIIllIl[1]);
                    worldPointArr[llIlIIllIl[10]] = new WorldPoint(llIlIIllIl[30], llIlIIllIl[32], llIlIIllIl[1]);
                    worldPointArr[llIlIIllIl[20]] = new WorldPoint(llIlIIllIl[30], llIlIIllIl[33], llIlIIllIl[1]);
                    Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                    "".length();
                }
                if (lIllIIlIIllll(nearest)) {
                    nearest.interact(llIlIIllII[llIlIIllIl[27]]);
                    Time.sleepTicks(llIlIIllIl[20]);
                    "".length();
                }
            }
        }
        if (lIllIIlIlIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIllIIlIlIllI(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = llIlIIllII[llIlIIllIl[34]];
                NPC nearest2 = NPCs.getNearest(npc -> {
                    if (lIllIIlIlIIII(npc.getName().contains(llIlIIllII[llIlIIllIl[42]]) ? 1 : 0)) {
                        String[] strArr2 = new String[llIlIIllIl[0]];
                        strArr2[llIlIIllIl[1]] = llIlIIllII[llIlIIllIl[43]];
                        if (lIllIIlIlIIII(npc.hasAction(strArr2) ? 1 : 0) && lIllIIlIIlllI(npc.isDead() ? 1 : 0) && lIllIIlIlIllI(npc.getInteracting())) {
                            ?? r0 = llIlIIllIl[0];
                            "".length();
                            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIlIIllIl[1];
                });
                NPC nearest3 = NPCs.getNearest(npc2 -> {
                    if (lIllIIlIlIIII(npc2.getName().contains(llIlIIllII[llIlIIllIl[40]]) ? 1 : 0) && lIllIIlIIlllI(npc2.isDead() ? 1 : 0)) {
                        String[] strArr2 = new String[llIlIIllIl[0]];
                        strArr2[llIlIIllIl[1]] = llIlIIllII[llIlIIllIl[41]];
                        if (lIllIIlIlIIII(npc2.hasAction(strArr2) ? 1 : 0) && lIllIIlIllIIl(npc2.getInteracting(), Players.getLocal())) {
                            ?? r0 = llIlIIllIl[0];
                            "".length();
                            return "   ".length() <= " ".length() ? ((((171 + 107) - 229) + 160) ^ (((70 + 56) - (-67)) + 4)) & (((164 ^ 141) ^ (101 ^ 88)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llIlIIllIl[1];
                });
                if (lIllIIlIIllll(nearest2) && lIllIIlIlIllI(nearest3)) {
                    AccBuilderSotf.c = llIlIIllII[llIlIIllIl[35]];
                    nearest2.interact(llIlIIllII[llIlIIllIl[36]]);
                    Time.sleepTicks(llIlIIllIl[10]);
                    "".length();
                }
                if (lIllIIlIIllll(nearest3)) {
                    AccBuilderSotf.c = llIlIIllII[llIlIIllIl[7]];
                    nearest3.interact(llIlIIllII[llIlIIllIl[13]]);
                    Time.sleepTicks(llIlIIllIl[20]);
                    "".length();
                }
            }
            if (lIllIIlIIllll(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = llIlIIllII[llIlIIllIl[37]];
                Time.sleepTicks(llIlIIllIl[0]);
                "".length();
            }
        }
    }

    private static String lIllIIlIIlIll(String llllllllllllllllllIIlIIIIIIIIIll, String llllllllllllllllllIIlIIIIIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllllllIIlIIIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), llIlIIllIl[35]), "DES");
            Cipher llllllllllllllllllIIlIIIIIIIIlIl = Cipher.getInstance("DES");
            llllllllllllllllllIIlIIIIIIIIlIl.init(llIlIIllIl[10], llllllllllllllllllIIlIIIIIIIIllI);
            return new String(llllllllllllllllllIIlIIIIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIIIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIIIIIIIIlII) {
            llllllllllllllllllIIlIIIIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIllIl() {
        llIlIIllIl = new int[46];
        llIlIIllIl[0] = " ".length();
        llIlIIllIl[1] = ((((59 + 114) - 133) + 163) ^ (((88 + 118) - 91) + 23)) & (((((173 + 70) - 54) + 6) ^ (((58 + 113) - 41) + 0)) ^ (-" ".length()));
        llIlIIllIl[2] = (-((-19685) & 23781)) & (-19461) & 23935;
        llIlIIllIl[3] = (-((-4687) & 32351)) & (-6) & 32669;
        llIlIIllIl[4] = 40 ^ 48;
        llIlIIllIl[5] = (-1033) & 13657;
        llIlIIllIl[6] = (-16517) & 24525;
        llIlIIllIl[7] = 32 ^ 42;
        llIlIIllIl[8] = (-9769) & 11903;
        llIlIIllIl[9] = (-20483) & 23479;
        llIlIIllIl[10] = "  ".length();
        llIlIIllIl[11] = (-8868) & 10995;
        llIlIIllIl[12] = (-25681) & 28670;
        llIlIIllIl[13] = (235 ^ 180) ^ (29 ^ 73);
        llIlIIllIl[14] = 59 ^ 54;
        llIlIIllIl[15] = (-((-9483) & 30619)) & (-8231) & 31487;
        llIlIIllIl[16] = (-1058) & 4027;
        llIlIIllIl[17] = (226 ^ 190) ^ (114 ^ 49);
        llIlIIllIl[18] = (((37 + 139) - 135) + 110) ^ (((43 + 30) - 30) + 137);
        llIlIIllIl[19] = (-9219) & 12191;
        llIlIIllIl[20] = "   ".length();
        llIlIIllIl[21] = (-25317) & 27391;
        llIlIIllIl[22] = (-((-2178) & 32163)) & (-1) & 32743;
        llIlIIllIl[23] = (-((-17671) & 28527)) & (-4097) & 15227;
        llIlIIllIl[24] = ((44 + 105) - 75) + 178;
        llIlIIllIl[25] = (-24787) & 27867;
        llIlIIllIl[26] = (-((-121) & 28797)) & (-73) & 32223;
        llIlIIllIl[27] = (230 ^ 165) ^ (89 ^ 28);
        llIlIIllIl[28] = 131 ^ 135;
        llIlIIllIl[29] = 152 ^ 157;
        llIlIIllIl[30] = (-((-74) & 14059)) & (-1) & 16119;
        llIlIIllIl[31] = (-29771) & 32747;
        llIlIIllIl[32] = (-20545) & 23527;
        llIlIIllIl[33] = (-((-19505) & 31803)) & (-1089) & 16379;
        llIlIIllIl[34] = (((93 + 27) - 103) + 175) ^ (((163 + 67) - 123) + 92);
        llIlIIllIl[35] = (((12 + 45) - (-35)) + 37) ^ (((135 + 100) - 181) + 83);
        llIlIIllIl[36] = 7 ^ 14;
        llIlIIllIl[37] = (((115 + 116) - 87) + 18) ^ (((32 + 68) - (-61)) + 13);
        llIlIIllIl[38] = "   ".length() ^ (93 ^ 58);
        llIlIIllIl[39] = (233 ^ 175) ^ (225 ^ 196);
        llIlIIllIl[40] = (((61 + 49) - 75) + 97) ^ (((31 + 117) - 44) + 34);
        llIlIIllIl[41] = (212 ^ 198) ^ (132 ^ 153);
        llIlIIllIl[42] = (76 ^ 113) ^ (6 ^ 43);
        llIlIIllIl[43] = 189 ^ 172;
        llIlIIllIl[44] = 60 ^ 46;
        llIlIIllIl[45] = 163 ^ 176;
    }

    private static String lIllIIlIIlIII(String llllllllllllllllllIIlIIIIIIllIII, String llllllllllllllllllIIlIIIIIIlIIlI) {
        String llllllllllllllllllIIlIIIIIIllIII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIIIIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIlIIIIIIlIIlI.toCharArray();
        int llllllllllllllllllIIlIIIIIIIllll = llIlIIllIl[1];
        char[] charArray2 = llllllllllllllllllIIlIIIIIIllIII2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIllIl[1];
        while (lIllIIlIllIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIIlIIIIIIIllll % charArray.length]));
            "".length();
            llllllllllllllllllIIlIIIIIIIllll++;
            i++;
            "".length();
            if ((-(142 ^ 138)) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIlIlIIll(int i) {
        return i < 0;
    }

    private static boolean lIllIIlIlIlIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIIlIllIII(Skills.getLevel(Skill.RANGED), llIlIIllIl[39])) {
            ?? r0 = llIlIIllIl[0];
            "".length();
            return ((((128 + 79) - 72) + 57) ^ (((112 + 86) - 38) + 37)) == 0 ? ((((152 + 24) - 97) + 157) ^ (((122 + 51) - 84) + 94)) & (((101 ^ 46) ^ (34 ^ 50)) ^ (-" ".length())) : r0;
        }
        return llIlIIllIl[1];
    }

    private static void lIllIIlIIllII() {
        llIlIIllII = new String[llIlIIllIl[45]];
        llIlIIllII[llIlIIllIl[1]] = lIllIIlIIlIII("BAszBQwrHiwCDGoeKkwJKwQu", "JjElk");
        llIlIIllII[llIlIIllIl[0]] = lIllIIlIIlIIl("zf/uIPTKGKDsN9vDcNpkaifxAay8xAEk", "HqBKb");
        llIlIIllII[llIlIIllIl[10]] = lIllIIlIIlIll("NsgJMzlV7y4=", "uhqvp");
        llIlIIllII[llIlIIllIl[20]] = lIllIIlIIlIII("GTsQUQQ4ehUeBTsp", "WZfqp");
        llIlIIllII[llIlIIllIl[28]] = lIllIIlIIlIIl("MChnjWypk4hUgE06mGOkCJLisJVqfH6P", "PeJlh");
        llIlIIllII[llIlIIllIl[29]] = lIllIIlIIlIll("kSIbFvksKOM=", "iEXXL");
        llIlIIllII[llIlIIllIl[27]] = lIllIIlIIlIIl("0mAUqUuch4WnhTthpyCghw==", "fGwWf");
        llIlIIllII[llIlIIllIl[34]] = lIllIIlIIlIII("My0IPR4cKgh1GRoxAyY=", "uDoUj");
        llIlIIllII[llIlIIllIl[35]] = lIllIIlIIlIIl("ZlU+cYwkXEOJ7h81eiSWUg==", "yIzIW");
        llIlIIllII[llIlIIllIl[36]] = lIllIIlIIlIll("uHKS4/Sd7zo=", "RfxNV");
        llIlIIllII[llIlIIllIl[7]] = lIllIIlIIlIII("LgYtAgoEGzcESRwdLA8F", "orYci");
        llIlIIllII[llIlIIllIl[13]] = lIllIIlIIlIIl("Ie3/tSikK6Q=", "HhlIm");
        llIlIIllII[llIlIIllIl[37]] = lIllIIlIIlIIl("tc+qVKRAw+4cWZyg42zzNA==", "GsQgx");
        llIlIIllII[llIlIIllIl[14]] = lIllIIlIIlIII("CyImATo5OTEIdR4iIQom", "MMTfU");
        llIlIIllII[llIlIIllIl[40]] = lIllIIlIIlIII("BgUkFA==", "UjQxX");
        llIlIIllII[llIlIIllIl[41]] = lIllIIlIIlIII("GCUVMxQy", "YQaRw");
        llIlIIllII[llIlIIllIl[42]] = lIllIIlIIlIIl("VDriKYbM5MA=", "sFqEt");
        llIlIIllII[llIlIIllIl[43]] = lIllIIlIIlIII("Fiw2MgI8", "WXBSa");
        llIlIIllII[llIlIIllIl[44]] = lIllIIlIIlIIl("jhP8WTtMYZcGghbeneOaxw==", "uwJeQ");
    }
}
