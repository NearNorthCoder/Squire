package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.aa  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/aa.class */
public class aa implements W {
    public static /* synthetic */ int[] kE;
    public static /* synthetic */ WorldArea kG;
    public static /* synthetic */ WorldArea kH;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ WorldPoint kI;
    public static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] llIIIlIII;
    private static /* synthetic */ int[] llIIIlIIl;
    public static /* synthetic */ WorldArea kF;
    public static /* synthetic */ WorldPoint kJ;

    private static boolean lIlIIlIllIlI(int i, int i2) {
        return i < i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return llIIIlIII[llIIIlIIl[57]];
    }

    public static void aa() {
        if (lIlIIlIllIll(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[20]];
            Movement.walkTo(bx);
            "".length();
            Time.sleepTicks(llIIIlIIl[1]);
            "".length();
        }
        if (lIlIIlIllIIl(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[21]];
            if (lIlIIllIIIII(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIlIIlIllIIl(npc.getName().contains(llIIIlIII[llIIIlIIl[58]]) ? 1 : 0) && lIlIIllIIIII(npc.getInteracting()) && lIlIIlIllIll(npc.isDead() ? 1 : 0)) {
                        ?? r0 = llIIIlIIl[1];
                        "".length();
                        return (-(16 ^ 20)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIlIIl[0];
                });
                String[] strArr = new String[llIIIlIIl[3]];
                strArr[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[22]];
                strArr[llIIIlIIl[1]] = llIIIlIII[llIIIlIIl[23]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (lIlIIllIIIlI(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = llIIIlIIl[1];
                        "".length();
                        return (57 ^ 61) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIlIIl[0];
                }).collect(Collectors.toList());
                if (lIlIIlIllIll(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(llIIIlIIl[0])).interact(llIIIlIII[llIIIlIIl[24]]);
                    Time.sleepTicks(llIIIlIIl[3]);
                    "".length();
                }
                if (lIlIIlIlllII(nearest) && lIlIIlIllIll(Players.getLocal().isMoving() ? 1 : 0) && lIlIIlIllIIl(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(llIIIlIII[llIIIlIIl[25]]);
                    Time.sleepTicks(llIIIlIIl[3]);
                    "".length();
                }
            }
            if (lIlIIlIlllII(Players.getLocal().getInteracting())) {
                Time.sleepTicks(llIIIlIIl[6]);
                "".length();
            }
        }
    }

    private static void lIlIIlIlIlll() {
        llIIIlIIl = new int[72];
        llIIIlIIl[0] = ((((50 + 106) - 89) + 159) ^ (((171 + 93) - 208) + 128)) & (((((142 + 90) - 75) + 40) ^ (((37 + 152) - 179) + 149)) ^ (-" ".length())) & ((((31 ^ 7) ^ (81 ^ 112)) & (((206 ^ 155) ^ (248 ^ 148)) ^ (-" ".length()))) ^ (-" ".length()));
        llIIIlIIl[1] = " ".length();
        llIIIlIIl[2] = (90 ^ 68) ^ (85 ^ 99);
        llIIIlIIl[3] = "  ".length();
        llIIIlIIl[4] = "   ".length();
        llIIIlIIl[5] = (-2148) & 7147;
        llIIIlIIl[6] = 95 ^ 91;
        llIIIlIIl[7] = (-18441) & 19435;
        llIIIlIIl[8] = (-((-6447) & 32063)) & (-6152) & 32767;
        llIIIlIIl[9] = (-((-3719) & 28311)) & (-33) & 32631;
        llIIIlIIl[10] = 186 ^ 191;
        llIIIlIIl[11] = (-((-345) & 3549)) & (-8193) & 11775;
        llIIIlIIl[12] = 246 ^ 146;
        llIIIlIIl[13] = (((11 + 96) - 11) + 58) ^ (((68 + 2) - 51) + 130);
        llIIIlIIl[14] = 32 ^ 38;
        llIIIlIIl[15] = 3 ^ 4;
        llIIIlIIl[16] = (-((-163) & 31471)) & (-129) & 32767;
        llIIIlIIl[17] = (-26697) & 28029;
        llIIIlIIl[18] = 35 ^ 43;
        llIIIlIIl[19] = (((172 + 40) - 191) + 189) ^ (((18 + 144) - (-16)) + 20);
        llIIIlIIl[20] = 181 ^ 188;
        llIIIlIIl[21] = 153 ^ 147;
        llIIIlIIl[22] = 171 ^ 160;
        llIIIlIIl[23] = (((93 + 122) - 67) + 53) ^ (((11 + 16) - 14) + 184);
        llIIIlIIl[24] = (83 ^ 58) ^ (57 ^ 93);
        llIIIlIIl[25] = (219 ^ 167) ^ (63 ^ 77);
        llIIIlIIl[26] = 74 ^ 90;
        llIIIlIIl[27] = -" ".length();
        llIIIlIIl[28] = (-((-31038) & 32767)) & (-24833) & 38889439;
        llIIIlIIl[29] = 11 ^ 26;
        llIIIlIIl[30] = (4 ^ 66) ^ (213 ^ 129);
        llIIIlIIl[31] = 39 ^ 52;
        llIIIlIIl[32] = 170 ^ 191;
        llIIIlIIl[33] = (((26 + 115) - 90) + 107) ^ (((8 + 55) - (-35)) + 38);
        llIIIlIIl[34] = 175 ^ 177;
        llIIIlIIl[35] = (((142 + 50) - 47) + 20) ^ (((50 + 160) - 89) + 57);
        llIIIlIIl[36] = 59 ^ 35;
        llIIIlIIl[37] = 173 ^ 180;
        llIIIlIIl[38] = 130 ^ 152;
        llIIIlIIl[39] = 127 ^ 100;
        llIIIlIIl[40] = (-((-4173) & 31615)) & (-4097) & 32699;
        llIIIlIIl[41] = (9 ^ 82) ^ (24 ^ 95);
        llIIIlIIl[42] = (-((-1129) & 32617)) & (-157) & 32767;
        llIIIlIIl[43] = (1 ^ 37) ^ (43 ^ 18);
        llIIIlIIl[44] = (-((-81) & 23511)) & (-65) & 24567;
        llIIIlIIl[45] = (-((-1323) & 32619)) & (-17) & 32511;
        llIIIlIIl[46] = (92 ^ 88) ^ (37 ^ 62);
        llIIIlIIl[47] = (-((-9859) & 26519)) & (-8195) & 26558;
        llIIIlIIl[48] = (((149 + 116) - 197) + 97) ^ (((60 + 99) - 59) + 33);
        llIIIlIIl[49] = (-4226) & 15351;
        llIIIlIIl[50] = (((128 + 34) - 74) + 77) ^ (((70 + 113) - 90) + 39);
        llIIIlIIl[51] = (-21564) & 22463;
        llIIIlIIl[52] = (-179) & 8186;
        llIIIlIIl[53] = (-12872) & 47871;
        llIIIlIIl[54] = (-((-9129) & 14271)) & (-2625) & 32766;
        llIIIlIIl[55] = (-3083) & 3582;
        llIIIlIIl[56] = (-1320) & 16319;
        llIIIlIIl[57] = 129 ^ 163;
        llIIIlIIl[58] = 166 ^ 133;
        llIIIlIIl[59] = (-((-8337) & 25587)) & (-8193) & 28667;
        llIIIlIIl[60] = (-21281) & 24570;
        llIIIlIIl[61] = (-20481) & 23724;
        llIIIlIIl[62] = (-((-19782) & 32109)) & (-16897) & 32503;
        llIIIlIIl[63] = (-24705) & 27889;
        llIIIlIIl[64] = (-((-16621) & 29677)) & (-33) & 16255;
        llIIIlIIl[65] = (136 ^ 179) ^ (13 ^ 6);
        llIIIlIIl[66] = (-113) & 3325;
        llIIIlIIl[67] = (-16771) & 19951;
        llIIIlIIl[68] = (-((-30) & 21023)) & (-8201) & 32447;
        llIIIlIIl[69] = (-8705) & 11935;
        llIIIlIIl[70] = (-267) & 3562;
        llIIIlIIl[71] = 16 ^ 52;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return llIIIlIIl[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0252, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dn() {
        if (lIlIIlIllIIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[0]];
            C0001b.a(bv);
            if (lIlIIlIllIlI(bv.size(), llIIIlIIl[1])) {
                System.out.println(llIIIlIII[llIIIlIIl[1]]);
                bt = llIIIlIIl[0];
            }
        }
        if (lIlIIlIllIll(bt ? 1 : 0)) {
            if (lIlIIlIllIll(bH() ? 1 : 0) && lIlIIlIllIlI(Skills.getLevel(Skill.DEFENCE), llIIIlIIl[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIlllII(nearest) && lIlIIlIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[3]];
                    C0000a.a(nearest);
                }
                if (lIlIIlIlllII(nearest) && lIlIIlIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = llIIIlIII[llIIIlIIl[4]];
                    if (lIlIIlIllIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIlIIl[5]);
                        "".length();
                    }
                    if (lIlIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIlllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIlIIl[1]);
                            "".length();
                        }
                        if (lIlIIlIlllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIlIIl[3]);
                            "".length();
                        }
                        if (lIlIIlIllIll(dp() ? 1 : 0)) {
                            af();
                            System.out.println(llIIIlIII[llIIIlIIl[6]]);
                            bt = llIIIlIIl[1];
                            return;
                        }
                        C0000a.a(kE, llIIIlIIl[1]);
                        C0000a.a(llIIIlIIl[7], llIIIlIIl[8]);
                        C0000a.b(C0005f.aV, llIIIlIIl[1]);
                        C0000a.a(llIIIlIIl[9], llIIIlIIl[10]);
                        C0000a.a(llIIIlIIl[11], llIIIlIIl[12]);
                    }
                }
            }
            if (lIlIIlIllIIl(bH() ? 1 : 0)) {
                m32do();
                if (lIlIIlIllllI(Movement.getRunEnergy(), llIIIlIIl[13]) && lIlIIlIllIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[llIIIlIIl[1]];
                strArr[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[10]];
                if (lIlIIlIllIll(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIIlIIl[1]];
                    strArr2[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[14]];
                    if (lIlIIlIllIll(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[llIIIlIIl[1]];
                        strArr3[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[15]];
                        if (lIlIIlIllIll(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[llIIIlIIl[1]];
                            iArr[llIIIlIIl[0]] = llIIIlIIl[16];
                            if (lIlIIlIllIll(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIIIlIIl[1]];
                                iArr2[llIIIlIIl[0]] = llIIIlIIl[17];
                            }
                        }
                    }
                }
                dq();
                if (lIlIIlIlllll(lIlIIlIllIII(C0004e.u(), 45.0d))) {
                    int[] iArr3 = new int[llIIIlIIl[1]];
                    iArr3[llIIIlIIl[0]] = llIIIlIIl[11];
                    if (lIlIIlIllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIIIlIIl[1]];
                        iArr4[llIIIlIIl[0]] = llIIIlIIl[11];
                        Inventory.getFirst(iArr4).interact(llIIIlIII[llIIIlIIl[18]]);
                        Time.sleepTicks(llIIIlIIl[1]);
                        "".length();
                    }
                }
                if (lIlIIlIllllI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[19]) && lIlIIlIllllI(Skills.getLevel(Skill.STRENGTH), llIIIlIIl[19])) {
                    C0009j.Q();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIlIIlIllllI(Skills.getLevel(Skill.DEFENCE), llIIIlIIl[2])) {
            ?? r0 = llIIIlIIl[1];
            "".length();
            return "  ".length() < "  ".length() ? ((56 ^ 104) ^ (210 ^ 141)) & (((((95 + 83) - 55) + 35) ^ (((41 + 11) - (-45)) + 48)) ^ (-" ".length())) : r0;
        }
        return llIIIlIIl[0];
    }

    private static boolean lIlIIllIIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIlIllIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIlIlllll(int i) {
        return i < 0;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            dn();
            "".length();
            if ((-(180 ^ 177)) >= 0) {
                return (146 ^ 198) & ((255 ^ 171) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return llIIIlIIl[0];
    }

    static {
        lIlIIlIlIlll();
        lIlIIlIlIllI();
        bv = new ArrayList();
        int[] iArr = new int[llIIIlIIl[18]];
        iArr[llIIIlIIl[0]] = llIIIlIIl[16];
        iArr[llIIIlIIl[1]] = llIIIlIIl[17];
        iArr[llIIIlIIl[3]] = llIIIlIIl[42];
        iArr[llIIIlIIl[4]] = llIIIlIIl[44];
        iArr[llIIIlIIl[6]] = llIIIlIIl[40];
        iArr[llIIIlIIl[10]] = llIIIlIIl[45];
        iArr[llIIIlIIl[14]] = llIIIlIIl[47];
        iArr[llIIIlIIl[15]] = llIIIlIIl[49];
        kE = iArr;
        kF = new WorldArea(llIIIlIIl[59], llIIIlIIl[60], llIIIlIIl[22], llIIIlIIl[22], llIIIlIIl[0]);
        kG = new WorldArea(llIIIlIIl[61], llIIIlIIl[62], llIIIlIIl[32], llIIIlIIl[26], llIIIlIIl[0]);
        kH = new WorldArea(llIIIlIIl[63], llIIIlIIl[64], llIIIlIIl[65], llIIIlIIl[34], llIIIlIIl[0]);
        kI = new WorldPoint(llIIIlIIl[66], llIIIlIIl[67], llIIIlIIl[0]);
        bx = new WorldPoint(llIIIlIIl[68], llIIIlIIl[60], llIIIlIIl[0]);
        kJ = new WorldPoint(llIIIlIIl[69], llIIIlIIl[70], llIIIlIIl[0]);
    }

    private static String lIlIIlIlIIlI(String lIlllIIIIlIlIl, String lIlllIIIIlIlII) {
        try {
            SecretKeySpec lIlllIIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIIlIlII.getBytes(StandardCharsets.UTF_8)), llIIIlIIl[18]), "DES");
            Cipher lIlllIIIIlIlll = Cipher.getInstance("DES");
            lIlllIIIIlIlll.init(llIIIlIIl[3], lIlllIIIIllIII);
            return new String(lIlllIIIIlIlll.doFinal(Base64.getDecoder().decode(lIlllIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIIIlIllI) {
            lIlllIIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlIlIIll(String lIlllIIIIIIlIl, String lIlllIIIIIIlII) {
        String lIlllIIIIIIlIl2 = new String(Base64.getDecoder().decode(lIlllIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlllIIIIIIlII.toCharArray();
        int lIlllIIIIIIIIl = llIIIlIIl[0];
        char[] charArray2 = lIlllIIIIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = llIIIlIIl[0];
        while (lIlIIlIllIlI(i, length)) {
            char lIlllIIIIIIllI = charArray2[i];
            sb.append((char) (lIlllIIIIIIllI ^ charArray[lIlllIIIIIIIIl % charArray.length]));
            "".length();
            lIlllIIIIIIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIlIllIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x057c, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05b5, code lost:
        return l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.aa.llIIIlIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c1, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0218, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x026f, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a9, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02e3, code lost:
        return l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.aa.llIIIlIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0338, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x038f, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03e6, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x043d, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0494, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04eb, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0542, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v230, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean dp() {
        if (lIlIIlIllllI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[2])) {
            int[] iArr = new int[llIIIlIIl[1]];
            iArr[llIIIlIIl[0]] = llIIIlIIl[17];
            if (lIlIIlIllIll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIlIIl[1]];
                iArr2[llIIIlIIl[0]] = llIIIlIIl[17];
                if (lIlIIlIllIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIIlIIl[1]];
                    iArr3[llIIIlIIl[0]] = llIIIlIIl[17];
                }
            }
            int[] iArr4 = new int[llIIIlIIl[1]];
            iArr4[llIIIlIIl[0]] = llIIIlIIl[42];
            if (lIlIIlIllIll(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[llIIIlIIl[1]];
                iArr5[llIIIlIIl[0]] = llIIIlIIl[42];
                if (lIlIIlIllIll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIIIlIIl[1]];
                    iArr6[llIIIlIIl[0]] = llIIIlIIl[42];
                }
            }
            int[] iArr7 = new int[llIIIlIIl[1]];
            iArr7[llIIIlIIl[0]] = llIIIlIIl[44];
            if (lIlIIlIllIll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIIlIIl[1]];
                iArr8[llIIIlIIl[0]] = llIIIlIIl[44];
                if (lIlIIlIllIll(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llIIIlIIl[1]];
                    iArr9[llIIIlIIl[0]] = llIIIlIIl[44];
                }
            }
            int[] iArr10 = new int[llIIIlIIl[1]];
            iArr10[llIIIlIIl[0]] = llIIIlIIl[40];
            if (lIlIIlIllIll(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIIlIIl[1]];
                iArr11[llIIIlIIl[0]] = llIIIlIIl[40];
                if (lIlIIlIllIll(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIIIlIIl[1]];
                    iArr12[llIIIlIIl[0]] = llIIIlIIl[40];
                }
            }
            int[] iArr13 = new int[llIIIlIIl[1]];
            iArr13[llIIIlIIl[0]] = llIIIlIIl[45];
            if (lIlIIlIllIll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIIlIIl[1]];
                iArr14[llIIIlIIl[0]] = llIIIlIIl[45];
                if (lIlIIlIllIll(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIIlIIl[1]];
                    iArr15[llIIIlIIl[0]] = llIIIlIIl[45];
                }
            }
            int[] iArr16 = new int[llIIIlIIl[1]];
            iArr16[llIIIlIIl[0]] = llIIIlIIl[47];
            if (lIlIIlIllIll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIIIlIIl[1]];
                iArr17[llIIIlIIl[0]] = llIIIlIIl[47];
                if (lIlIIlIllIll(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIIIlIIl[1]];
                    iArr18[llIIIlIIl[0]] = llIIIlIIl[47];
                }
            }
            int[] iArr19 = new int[llIIIlIIl[1]];
            iArr19[llIIIlIIl[0]] = llIIIlIIl[49];
            if (lIlIIlIllIll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIIIlIIl[1]];
                iArr20[llIIIlIIl[0]] = llIIIlIIl[49];
                if (lIlIIlIllIll(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[llIIIlIIl[1]];
                    iArr21[llIIIlIIl[0]] = llIIIlIIl[49];
                }
            }
            int[] iArr22 = new int[llIIIlIIl[1]];
            iArr22[llIIIlIIl[0]] = llIIIlIIl[11];
            if (lIlIIlIllIll(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIIIlIIl[1]];
                iArr23[llIIIlIIl[0]] = llIIIlIIl[11];
            }
            ?? r0 = llIIIlIIl[1];
            "".length();
            return (157 ^ 153) <= ((135 ^ 161) & ((4 ^ 34) ^ (-1))) ? (true ^ true) & ((false ^ true) ^ true) : r0;
        }
        int[] iArr24 = new int[llIIIlIIl[1]];
        iArr24[llIIIlIIl[0]] = llIIIlIIl[16];
        if (lIlIIlIllIll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[llIIIlIIl[1]];
            iArr25[llIIIlIIl[0]] = llIIIlIIl[16];
            if (lIlIIlIllIll(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[llIIIlIIl[1]];
                iArr26[llIIIlIIl[0]] = llIIIlIIl[16];
            }
        }
        int[] iArr27 = new int[llIIIlIIl[1]];
        iArr27[llIIIlIIl[0]] = llIIIlIIl[42];
        if (lIlIIlIllIll(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[llIIIlIIl[1]];
            iArr28[llIIIlIIl[0]] = llIIIlIIl[42];
            if (lIlIIlIllIll(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[llIIIlIIl[1]];
                iArr29[llIIIlIIl[0]] = llIIIlIIl[42];
            }
        }
        int[] iArr30 = new int[llIIIlIIl[1]];
        iArr30[llIIIlIIl[0]] = llIIIlIIl[44];
        if (lIlIIlIllIll(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[llIIIlIIl[1]];
            iArr31[llIIIlIIl[0]] = llIIIlIIl[44];
            if (lIlIIlIllIll(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[llIIIlIIl[1]];
                iArr32[llIIIlIIl[0]] = llIIIlIIl[44];
            }
        }
        int[] iArr33 = new int[llIIIlIIl[1]];
        iArr33[llIIIlIIl[0]] = llIIIlIIl[40];
        if (lIlIIlIllIll(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[llIIIlIIl[1]];
            iArr34[llIIIlIIl[0]] = llIIIlIIl[40];
            if (lIlIIlIllIll(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[llIIIlIIl[1]];
                iArr35[llIIIlIIl[0]] = llIIIlIIl[40];
            }
        }
        int[] iArr36 = new int[llIIIlIIl[1]];
        iArr36[llIIIlIIl[0]] = llIIIlIIl[45];
        if (lIlIIlIllIll(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[llIIIlIIl[1]];
            iArr37[llIIIlIIl[0]] = llIIIlIIl[45];
            if (lIlIIlIllIll(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[llIIIlIIl[1]];
                iArr38[llIIIlIIl[0]] = llIIIlIIl[45];
            }
        }
        int[] iArr39 = new int[llIIIlIIl[1]];
        iArr39[llIIIlIIl[0]] = llIIIlIIl[47];
        if (lIlIIlIllIll(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[llIIIlIIl[1]];
            iArr40[llIIIlIIl[0]] = llIIIlIIl[47];
            if (lIlIIlIllIll(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIIIlIIl[1]];
                iArr41[llIIIlIIl[0]] = llIIIlIIl[47];
            }
        }
        int[] iArr42 = new int[llIIIlIIl[1]];
        iArr42[llIIIlIIl[0]] = llIIIlIIl[49];
        if (lIlIIlIllIll(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[llIIIlIIl[1]];
            iArr43[llIIIlIIl[0]] = llIIIlIIl[49];
            if (lIlIIlIllIll(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[llIIIlIIl[1]];
                iArr44[llIIIlIIl[0]] = llIIIlIIl[49];
            }
        }
        int[] iArr45 = new int[llIIIlIIl[1]];
        iArr45[llIIIlIIl[0]] = llIIIlIIl[11];
        if (lIlIIlIllIll(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[llIIIlIIl[1]];
            iArr46[llIIIlIIl[0]] = llIIIlIIl[11];
        }
        ?? r02 = llIIIlIIl[1];
        "".length();
        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a4, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0228, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0262, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x029c, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d6, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0310, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x034a, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0384, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (lIlIIlIllIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean bH() {
        if (lIlIIlIllllI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[2])) {
            int[] iArr = new int[llIIIlIIl[1]];
            iArr[llIIIlIIl[0]] = llIIIlIIl[17];
            if (lIlIIlIllIll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIlIIl[1]];
                iArr2[llIIIlIIl[0]] = llIIIlIIl[17];
            }
            int[] iArr3 = new int[llIIIlIIl[1]];
            iArr3[llIIIlIIl[0]] = llIIIlIIl[42];
            if (lIlIIlIllIll(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIIlIIl[1]];
                iArr4[llIIIlIIl[0]] = llIIIlIIl[42];
            }
            int[] iArr5 = new int[llIIIlIIl[1]];
            iArr5[llIIIlIIl[0]] = llIIIlIIl[44];
            if (lIlIIlIllIll(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIIlIIl[1]];
                iArr6[llIIIlIIl[0]] = llIIIlIIl[44];
            }
            int[] iArr7 = new int[llIIIlIIl[1]];
            iArr7[llIIIlIIl[0]] = llIIIlIIl[40];
            if (lIlIIlIllIll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIIlIIl[1]];
                iArr8[llIIIlIIl[0]] = llIIIlIIl[40];
            }
            int[] iArr9 = new int[llIIIlIIl[1]];
            iArr9[llIIIlIIl[0]] = llIIIlIIl[45];
            if (lIlIIlIllIll(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIlIIl[1]];
                iArr10[llIIIlIIl[0]] = llIIIlIIl[45];
            }
            int[] iArr11 = new int[llIIIlIIl[1]];
            iArr11[llIIIlIIl[0]] = llIIIlIIl[47];
            if (lIlIIlIllIll(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIIlIIl[1]];
                iArr12[llIIIlIIl[0]] = llIIIlIIl[47];
            }
            int[] iArr13 = new int[llIIIlIIl[1]];
            iArr13[llIIIlIIl[0]] = llIIIlIIl[49];
            if (lIlIIlIllIll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIIlIIl[1]];
                iArr14[llIIIlIIl[0]] = llIIIlIIl[49];
            }
            int[] iArr15 = new int[llIIIlIIl[1]];
            iArr15[llIIIlIIl[0]] = llIIIlIIl[11];
            if (lIlIIlIllIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = llIIIlIIl[1];
                "".length();
                return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIIl[0];
        }
        int[] iArr16 = new int[llIIIlIIl[1]];
        iArr16[llIIIlIIl[0]] = llIIIlIIl[16];
        if (lIlIIlIllIll(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[llIIIlIIl[1]];
            iArr17[llIIIlIIl[0]] = llIIIlIIl[16];
        }
        int[] iArr18 = new int[llIIIlIIl[1]];
        iArr18[llIIIlIIl[0]] = llIIIlIIl[42];
        if (lIlIIlIllIll(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[llIIIlIIl[1]];
            iArr19[llIIIlIIl[0]] = llIIIlIIl[42];
        }
        int[] iArr20 = new int[llIIIlIIl[1]];
        iArr20[llIIIlIIl[0]] = llIIIlIIl[44];
        if (lIlIIlIllIll(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[llIIIlIIl[1]];
            iArr21[llIIIlIIl[0]] = llIIIlIIl[44];
        }
        int[] iArr22 = new int[llIIIlIIl[1]];
        iArr22[llIIIlIIl[0]] = llIIIlIIl[40];
        if (lIlIIlIllIll(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[llIIIlIIl[1]];
            iArr23[llIIIlIIl[0]] = llIIIlIIl[40];
        }
        int[] iArr24 = new int[llIIIlIIl[1]];
        iArr24[llIIIlIIl[0]] = llIIIlIIl[45];
        if (lIlIIlIllIll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[llIIIlIIl[1]];
            iArr25[llIIIlIIl[0]] = llIIIlIIl[45];
        }
        int[] iArr26 = new int[llIIIlIIl[1]];
        iArr26[llIIIlIIl[0]] = llIIIlIIl[47];
        if (lIlIIlIllIll(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[llIIIlIIl[1]];
            iArr27[llIIIlIIl[0]] = llIIIlIIl[47];
        }
        int[] iArr28 = new int[llIIIlIIl[1]];
        iArr28[llIIIlIIl[0]] = llIIIlIIl[49];
        if (lIlIIlIllIll(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[llIIIlIIl[1]];
            iArr29[llIIIlIIl[0]] = llIIIlIIl[49];
        }
        int[] iArr30 = new int[llIIIlIIl[1]];
        iArr30[llIIIlIIl[0]] = llIIIlIIl[11];
        if (lIlIIlIllIIl(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = llIIIlIIl[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
        }
        return llIIIlIIl[0];
    }

    private static void lIlIIlIlIllI() {
        llIIIlIII = new String[llIIIlIIl[71]];
        llIIIlIII[llIIIlIIl[0]] = lIlIIlIlIIlI("hlv60RRF2JKNCxRpQ/NhrQ==", "PVpFH");
        llIIIlIII[llIIIlIIl[1]] = lIlIIlIlIIll("IxMUDykNHx5GOBADEwg9RRMOAzcWVloVLQwOGQ4zCx1aBDsGEVoSNUUXHwo/AFoOFDsMFBMIPQ==", "ezzfZ");
        llIIIlIII[llIIIlIIl[3]] = lIlIIlIlIIll("IA4lPyYPGzo4Jk4bPHYjDwE4", "noSVA");
        llIIIlIII[llIIIlIIl[4]] = lIlIIlIlIIll("DSAYNC4sLxFwICQvHTksIg==", "EAvPB");
        llIIIlIII[llIIIlIIl[6]] = lIlIIlIlIIll("NRNwLzMHVj0nMhEfPilhEQMgPi0LEyNiYREBOToiCh8+KWEWGXAMFDs/Hgk=", "bvPNA");
        llIIIlIII[llIIIlIIl[10]] = lIlIIlIlIIll("CCMLDFMyMg0PGjUwFg==", "AQdbs");
        llIIIlIII[llIIIlIIl[14]] = lIlIIlIlIlII("2TL507cEnRcFT6LO1+F2LQ==", "WrABP");
        llIIIlIII[llIIIlIIl[15]] = lIlIIlIlIlII("7akQvdjze4lftYVmXpdFpbXdz9r9TFbL", "RuFGB");
        llIIIlIII[llIIIlIIl[18]] = lIlIIlIlIIll("LCcC", "iFvYx");
        llIIIlIII[llIIIlIIl[20]] = lIlIIlIlIlII("0FnK8qbSLc6OJ2OdK8pDIubfYNvuZyH0", "scnLF");
        llIIIlIII[llIIIlIIl[21]] = lIlIIlIlIlII("opTAkz793dNK2dyKgHaiCQ==", "muUjo");
        llIIIlIII[llIIIlIIl[22]] = lIlIIlIlIlII("IMakQsXj+xU=", "ZhWRo");
        llIIIlIII[llIIIlIIl[23]] = lIlIIlIlIIll("BB4W", "gqanu");
        llIIIlIII[llIIIlIIl[24]] = lIlIIlIlIlII("PCnod5jOCs4=", "KXDpD");
        llIIIlIII[llIIIlIIl[25]] = lIlIIlIlIIlI("OJSUx/h5GQU=", "npyAX");
        llIIIlIII[llIIIlIIl[13]] = lIlIIlIlIIll("GDsfKm4rKx8kIjAvHyA=", "YNkEN");
        llIIIlIII[llIIIlIIl[26]] = lIlIIlIlIIll("", "AqpAP");
        llIIIlIII[llIIIlIIl[29]] = lIlIIlIlIIlI("yhKrYWRFkyGyKmSZVFqRGw==", "gHppn");
        llIIIlIII[llIIIlIIl[30]] = lIlIIlIlIlII("FitMnsP5NUAdSZfmihxvTg==", "kXMvX");
        llIIIlIII[llIIIlIIl[31]] = lIlIIlIlIlII("I/5eqAGFWqI=", "cjUjp");
        llIIIlIII[llIIIlIIl[19]] = lIlIIlIlIIlI("I7Aj+vbfzv6VDYVB+Zh4mg==", "wFoOm");
        llIIIlIII[llIIIlIIl[32]] = lIlIIlIlIlII("5Kn+YlctT53cfXS99r9kDQ==", "waZqb");
        llIIIlIII[llIIIlIIl[33]] = lIlIIlIlIlII("nLxNojG2jFg=", "UCeXp");
        llIIIlIII[llIIIlIIl[35]] = lIlIIlIlIlII("31f4rW6aLmbk1Oqq7jIlry3RIqyPejFk", "GrnnJ");
        llIIIlIII[llIIIlIIl[36]] = lIlIIlIlIlII("ZxzBiK+6Nv7oRUCEZlGAVK7r1IKPf0Qn", "XgljH");
        llIIIlIII[llIIIlIIl[37]] = lIlIIlIlIIlI("r+JEpMgSFV4=", "brOrz");
        llIIIlIII[llIIIlIIl[38]] = lIlIIlIlIIlI("HWd5PrtD5QQ=", "EqcyI");
        llIIIlIII[llIIIlIIl[39]] = lIlIIlIlIIll("AR8XOwE=", "VvrWe");
        llIIIlIII[llIIIlIIl[41]] = lIlIIlIlIIlI("LjSOBQ88zXA=", "QTtBS");
        llIIIlIII[llIIIlIIl[43]] = lIlIIlIlIIlI("TeZxoYLkqVc=", "aGGmX");
        llIIIlIII[llIIIlIIl[34]] = lIlIIlIlIIlI("IVSMG0ASuhQ=", "IwLZI");
        llIIIlIII[llIIIlIIl[46]] = lIlIIlIlIIlI("KP7+s4/ieGw=", "ddgho");
        llIIIlIII[llIIIlIIl[48]] = lIlIIlIlIlII("bmSkeJbggUs=", "zXJGf");
        llIIIlIII[llIIIlIIl[50]] = lIlIIlIlIlII("09oZWe2NDHo=", "eHFsD");
        llIIIlIII[llIIIlIIl[57]] = lIlIIlIlIlII("Cdls+77gHXE=", "NfvoG");
        llIIIlIII[llIIIlIIl[58]] = lIlIIlIlIIll("Ch0j", "IrTLb");
    }

    public static void af() {
        int[] iArr = new int[llIIIlIIl[1]];
        iArr[llIIIlIIl[0]] = llIIIlIIl[9];
        if (lIlIIlIllIll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[9], llIIIlIIl[2], llIIIlIIl[51]));
            "".length();
        }
        int[] iArr2 = new int[llIIIlIIl[1]];
        iArr2[llIIIlIIl[0]] = llIIIlIIl[52];
        if (lIlIIlIllIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[52], llIIIlIIl[10], llIIIlIIl[51]));
            "".length();
        }
        int[] iArr3 = new int[llIIIlIIl[1]];
        iArr3[llIIIlIIl[0]] = llIIIlIIl[49];
        if (lIlIIlIllIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[49], llIIIlIIl[1], llIIIlIIl[53]));
            "".length();
        }
        int[] iArr4 = new int[llIIIlIIl[1]];
        iArr4[llIIIlIIl[0]] = llIIIlIIl[47];
        if (lIlIIlIllIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[47], llIIIlIIl[1], llIIIlIIl[54]));
            "".length();
        }
        int[] iArr5 = new int[llIIIlIIl[1]];
        iArr5[llIIIlIIl[0]] = llIIIlIIl[11];
        if (lIlIIlIllIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[11], llIIIlIIl[12], llIIIlIIl[55]));
            "".length();
        }
        int[] iArr6 = new int[llIIIlIIl[1]];
        iArr6[llIIIlIIl[0]] = llIIIlIIl[40];
        if (lIlIIlIllIll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[40], llIIIlIIl[1], llIIIlIIl[56]));
            "".length();
        }
        int[] iArr7 = new int[llIIIlIIl[1]];
        iArr7[llIIIlIIl[0]] = llIIIlIIl[44];
        if (lIlIIlIllIll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[44], llIIIlIIl[1], llIIIlIIl[56]));
            "".length();
        }
        int[] iArr8 = new int[llIIIlIIl[1]];
        iArr8[llIIIlIIl[0]] = llIIIlIIl[45];
        if (lIlIIlIllIll(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[45], llIIIlIIl[1], llIIIlIIl[56]));
            "".length();
        }
        int[] iArr9 = new int[llIIIlIIl[1]];
        iArr9[llIIIlIIl[0]] = llIIIlIIl[42];
        if (lIlIIlIllIll(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[42], llIIIlIIl[1], llIIIlIIl[56]));
            "".length();
        }
        if (lIlIIlIllllI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[2])) {
            int[] iArr10 = new int[llIIIlIIl[1]];
            iArr10[llIIIlIIl[0]] = llIIIlIIl[17];
            if (lIlIIlIllIll(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0003d(llIIIlIIl[17], llIIIlIIl[1], llIIIlIIl[54]));
                "".length();
            }
        }
        int[] iArr11 = new int[llIIIlIIl[1]];
        iArr11[llIIIlIIl[0]] = llIIIlIIl[16];
        if (lIlIIlIllIll(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0003d(llIIIlIIl[16], llIIIlIIl[1], llIIIlIIl[56]));
            "".length();
        }
    }

    private static boolean lIlIIlIllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIllIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* renamed from: do  reason: not valid java name */
    public static void m32do() {
        if (lIlIIllIIIIl(Static.getClient().getVar(llIIIlIIl[22]), llIIIlIIl[1])) {
            Static.getClient().invokeMenuAction(llIIIlIII[llIIIlIIl[13]], llIIIlIII[llIIIlIIl[26]], llIIIlIIl[1], MenuAction.CC_OP.getId(), llIIIlIIl[27], llIIIlIIl[28]);
        }
        if (lIlIIlIllIlI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[10])) {
            String[] strArr = new String[llIIIlIIl[1]];
            strArr[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[29]];
            if (lIlIIlIllIIl(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[llIIIlIIl[1]];
                strArr2[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[30]];
                Inventory.getFirst(strArr2).interact(llIIIlIII[llIIIlIIl[31]]);
            }
        }
        if (lIlIIlIllllI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[10]) && lIlIIlIllIlI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[19])) {
            String[] strArr3 = new String[llIIIlIIl[1]];
            strArr3[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[19]];
            if (lIlIIlIllIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[llIIIlIIl[1]];
                strArr4[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[32]];
                Inventory.getFirst(strArr4).interact(llIIIlIII[llIIIlIIl[33]]);
            }
        }
        if (lIlIIlIllllI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[19]) && lIlIIlIllIlI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[34])) {
            String[] strArr5 = new String[llIIIlIIl[1]];
            strArr5[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[35]];
            if (lIlIIlIllIIl(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[llIIIlIIl[1]];
                strArr6[llIIIlIIl[0]] = llIIIlIII[llIIIlIIl[36]];
                Inventory.getFirst(strArr6).interact(llIIIlIII[llIIIlIIl[37]]);
            }
        }
        if (lIlIIlIllllI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[34]) && lIlIIlIllIlI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[2])) {
            int[] iArr = new int[llIIIlIIl[1]];
            iArr[llIIIlIIl[0]] = llIIIlIIl[16];
            if (lIlIIlIllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIlIIl[1]];
                iArr2[llIIIlIIl[0]] = llIIIlIIl[16];
                Inventory.getFirst(iArr2).interact(llIIIlIII[llIIIlIIl[38]]);
            }
        }
        if (lIlIIlIllllI(Skills.getLevel(Skill.ATTACK), llIIIlIIl[2])) {
            int[] iArr3 = new int[llIIIlIIl[1]];
            iArr3[llIIIlIIl[0]] = llIIIlIIl[17];
            if (lIlIIlIllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIIlIIl[1]];
                iArr4[llIIIlIIl[0]] = llIIIlIIl[17];
                Inventory.getFirst(iArr4).interact(llIIIlIII[llIIIlIIl[39]]);
            }
        }
        if (lIlIIlIllllI(Skills.getLevel(Skill.DEFENCE), llIIIlIIl[34])) {
            int[] iArr5 = new int[llIIIlIIl[1]];
            iArr5[llIIIlIIl[0]] = llIIIlIIl[40];
            if (lIlIIlIllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIIlIIl[1]];
                iArr6[llIIIlIIl[0]] = llIIIlIIl[40];
                Inventory.getFirst(iArr6).interact(llIIIlIII[llIIIlIIl[41]]);
            }
            int[] iArr7 = new int[llIIIlIIl[1]];
            iArr7[llIIIlIIl[0]] = llIIIlIIl[42];
            if (lIlIIlIllIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIIlIIl[1]];
                iArr8[llIIIlIIl[0]] = llIIIlIIl[42];
                Inventory.getFirst(iArr8).interact(llIIIlIII[llIIIlIIl[43]]);
            }
            int[] iArr9 = new int[llIIIlIIl[1]];
            iArr9[llIIIlIIl[0]] = llIIIlIIl[44];
            if (lIlIIlIllIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIlIIl[1]];
                iArr10[llIIIlIIl[0]] = llIIIlIIl[44];
                Inventory.getFirst(iArr10).interact(llIIIlIII[llIIIlIIl[34]]);
            }
            int[] iArr11 = new int[llIIIlIIl[1]];
            iArr11[llIIIlIIl[0]] = llIIIlIIl[45];
            if (lIlIIlIllIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIIlIIl[1]];
                iArr12[llIIIlIIl[0]] = llIIIlIIl[45];
                Inventory.getFirst(iArr12).interact(llIIIlIII[llIIIlIIl[46]]);
            }
        }
        int[] iArr13 = new int[llIIIlIIl[1]];
        iArr13[llIIIlIIl[0]] = llIIIlIIl[47];
        if (lIlIIlIllIIl(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[llIIIlIIl[1]];
            iArr14[llIIIlIIl[0]] = llIIIlIIl[47];
            Inventory.getFirst(iArr14).interact(llIIIlIII[llIIIlIIl[48]]);
        }
        int[] iArr15 = new int[llIIIlIIl[1]];
        iArr15[llIIIlIIl[0]] = llIIIlIIl[49];
        if (lIlIIlIllIIl(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[llIIIlIIl[1]];
            iArr16[llIIIlIIl[0]] = llIIIlIIl[49];
            Inventory.getFirst(iArr16).interact(llIIIlIII[llIIIlIIl[50]]);
        }
    }

    private static boolean lIlIIlIlllII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIlIlllIl(int i) {
        return i > 0;
    }

    public static void dq() {
        if (lIlIIlIllIlI(Skills.getLevel(Skill.DEFENCE), llIIIlIIl[2])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    private static int lIlIIlIllIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIlIIlIlIlII(String lIlllIIIlIIIlI, String lIlllIIIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIIIlIIlII = Cipher.getInstance("Blowfish");
            lIlllIIIlIIlII.init(llIIIlIIl[3], secretKeySpec);
            return new String(lIlllIIIlIIlII.doFinal(Base64.getDecoder().decode(lIlllIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIIlIIIll) {
            lIlllIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIIIl(int i, int i2) {
        return i == i2;
    }
}
