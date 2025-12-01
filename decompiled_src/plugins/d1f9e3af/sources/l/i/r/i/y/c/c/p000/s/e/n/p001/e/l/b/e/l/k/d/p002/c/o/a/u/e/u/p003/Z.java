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
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.Z  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/Z.class */
public class Z implements W {
    public static /* synthetic */ WorldArea kG;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int[] kE;
    public static /* synthetic */ WorldArea kF;
    private static /* synthetic */ int[] llIIIIlll;
    public static /* synthetic */ WorldPoint kI;
    private static /* synthetic */ String[] llIIIIlIl;
    public static /* synthetic */ WorldArea kH;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ WorldPoint kJ;
    public static /* synthetic */ WorldPoint bx;

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            dn();
            "".length();
            if (0 != 0) {
                return ((45 ^ 26) ^ (188 ^ 135)) & (((242 ^ 169) ^ (24 ^ 79)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return llIIIIlll[0];
    }

    private static boolean lIlIIlIlIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlIIlIIIlll() {
        llIIIIlll = new int[72];
        llIIIIlll[0] = (24 ^ 11) & ((96 ^ 115) ^ (-1));
        llIIIIlll[1] = " ".length();
        llIIIIlll[2] = 116 ^ 96;
        llIIIIlll[3] = "  ".length();
        llIIIIlll[4] = "   ".length();
        llIIIIlll[5] = (-((-12697) & 32156)) & (-69) & 24527;
        llIIIIlll[6] = "  ".length() ^ (199 ^ 193);
        llIIIIlll[7] = (-21533) & 22527;
        llIIIIlll[8] = (-((-4871) & 32526)) & (-4097) & 32751;
        llIIIIlll[9] = (-((-1) & 24713)) & (-33) & 32751;
        llIIIIlll[10] = (((45 + 192) - 220) + 177) ^ (((152 + 123) - 266) + 190);
        llIIIIlll[11] = (-8709) & 9087;
        llIIIIlll[12] = (224 ^ 136) ^ (38 ^ 42);
        llIIIIlll[13] = (((42 + 13) - (-95)) + 41) ^ (((27 + 127) - 23) + 45);
        llIIIIlll[14] = (17 ^ 55) ^ (189 ^ 157);
        llIIIIlll[15] = (98 ^ 112) ^ (188 ^ 169);
        llIIIIlll[16] = (-4109) & 5439;
        llIIIIlll[17] = (-29185) & 30517;
        llIIIIlll[18] = (75 ^ 23) ^ (199 ^ 147);
        llIIIIlll[19] = (((172 + 53) - 57) + 7) ^ (((142 + 125) - 156) + 55);
        llIIIIlll[20] = 206 ^ 196;
        llIIIIlll[21] = 144 ^ 155;
        llIIIIlll[22] = (((132 + 75) - 89) + 26) ^ (((6 + 16) - (-128)) + 6);
        llIIIIlll[23] = (((46 + 90) - 12) + 18) ^ (((86 + 4) - 59) + 100);
        llIIIIlll[24] = 66 ^ 76;
        llIIIIlll[25] = (232 ^ 178) ^ (125 ^ 55);
        llIIIIlll[26] = -" ".length();
        llIIIIlll[27] = (-5314) & 38868191;
        llIIIIlll[28] = 95 ^ 78;
        llIIIIlll[29] = 162 ^ 176;
        llIIIIlll[30] = 209 ^ 194;
        llIIIIlll[31] = (126 ^ 64) ^ (146 ^ 185);
        llIIIIlll[32] = 19 ^ 5;
        llIIIIlll[33] = (209 ^ 168) ^ (87 ^ 48);
        llIIIIlll[34] = 129 ^ 150;
        llIIIIlll[35] = 90 ^ 66;
        llIIIIlll[36] = 71 ^ 94;
        llIIIIlll[37] = (157 ^ 195) ^ (245 ^ 131);
        llIIIIlll[38] = 139 ^ 145;
        llIIIIlll[39] = 143 ^ 148;
        llIIIIlll[40] = (-((-5401) & 32635)) & (-1) & 28395;
        llIIIIlll[41] = (((44 + 3) - 2) + 101) ^ (((92 + 4) - 68) + 114);
        llIIIIlll[42] = (-6169) & 7291;
        llIIIIlll[43] = (((29 + 90) - 26) + 38) ^ (((61 + 3) - (-16)) + 78);
        llIIIIlll[44] = (-23041) & 24113;
        llIIIIlll[45] = (-((-11393) & 32449)) & (-17) & 22271;
        llIIIIlll[46] = 124 ^ 99;
        llIIIIlll[47] = (-((-5985) & 32627)) & (-321) & 28666;
        llIIIIlll[48] = (((3 + 67) - 51) + 126) ^ (((170 + 107) - 153) + 53);
        llIIIIlll[49] = (-21513) & 32638;
        llIIIIlll[50] = (203 ^ 169) ^ (233 ^ 170);
        llIIIIlll[51] = (-((-5767) & 32423)) & (-4172) & 31727;
        llIIIIlll[52] = (-16562) & 24569;
        llIIIIlll[53] = (-30466) & 65465;
        llIIIIlll[54] = (-((-435) & 3514)) & (-4625) & 32703;
        llIIIIlll[55] = (-524) & 1023;
        llIIIIlll[56] = (-((-8647) & 25070)) & (-257) & 31679;
        llIIIIlll[57] = 163 ^ 129;
        llIIIIlll[58] = 70 ^ 101;
        llIIIIlll[59] = (-20545) & 23769;
        llIIIIlll[60] = (-((-26649) & 31289)) & (-8198) & 16127;
        llIIIIlll[61] = (-20753) & 23996;
        llIIIIlll[62] = (-((-28809) & 29577)) & (-8225) & 12272;
        llIIIIlll[63] = (-((-5417) & 22447)) & (-4361) & 24575;
        llIIIIlll[64] = (-12449) & 15615;
        llIIIIlll[65] = 113 ^ 65;
        llIIIIlll[66] = (-((-1583) & 30271)) & (-257) & 32157;
        llIIIIlll[67] = (-29457) & 32637;
        llIIIIlll[68] = (-((-19118) & 23535)) & (-25089) & 32759;
        llIIIIlll[69] = (-(219 ^ 186)) & (-21249) & 24575;
        llIIIIlll[70] = (-((-7298) & 32153)) & (-9) & 28159;
        llIIIIlll[71] = (((114 + 41) - 148) + 140) ^ (((126 + 24) - 13) + 46);
    }

    public static void aa() {
        if (lIlIIlIIlIll(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[19]];
            Movement.walkTo(bx);
            "".length();
            Time.sleepTicks(llIIIIlll[1]);
            "".length();
        }
        if (lIlIIlIIlIIl(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[20]];
            if (lIlIIlIlIIII(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIlIIlIIlIIl(npc.getName().contains(llIIIIlIl[llIIIIlll[58]]) ? 1 : 0) && lIlIIlIlIIII(npc.getInteracting()) && lIlIIlIIlIll(npc.isDead() ? 1 : 0)) {
                        ?? r0 = llIIIIlll[1];
                        "".length();
                        return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIIlll[0];
                });
                String[] strArr = new String[llIIIIlll[3]];
                strArr[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[21]];
                strArr[llIIIIlll[1]] = llIIIIlIl[llIIIIlll[22]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (lIlIIlIlIlIl(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = llIIIIlll[1];
                        "".length();
                        return ((((14 + 54) - (-41)) + 32) ^ (((117 + 53) - 48) + 14)) == 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                    }
                    return llIIIIlll[0];
                }).collect(Collectors.toList());
                if (lIlIIlIIlIll(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(llIIIIlll[0])).interact(llIIIIlIl[llIIIIlll[23]]);
                    Time.sleepTicks(llIIIIlll[3]);
                    "".length();
                }
                if (lIlIIlIIllII(nearest) && lIlIIlIIlIll(Players.getLocal().isMoving() ? 1 : 0) && lIlIIlIIlIIl(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(llIIIIlIl[llIIIIlll[24]]);
                    Time.sleepTicks(llIIIIlll[3]);
                    "".length();
                }
            }
            if (lIlIIlIIllII(Players.getLocal().getInteracting())) {
                Time.sleepTicks(llIIIIlll[6]);
                "".length();
            }
        }
    }

    /* renamed from: do  reason: not valid java name */
    public static void m28do() {
        if (lIlIIlIlIIIl(Static.getClient().getVar(llIIIIlll[21]), llIIIIlll[1])) {
            Static.getClient().invokeMenuAction(llIIIIlIl[llIIIIlll[13]], llIIIIlIl[llIIIIlll[25]], llIIIIlll[1], MenuAction.CC_OP.getId(), llIIIIlll[26], llIIIIlll[27]);
        }
        if (lIlIIlIIlIlI(Skills.getLevel(Skill.ATTACK), llIIIIlll[10])) {
            String[] strArr = new String[llIIIIlll[1]];
            strArr[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[28]];
            if (lIlIIlIIlIIl(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[llIIIIlll[1]];
                strArr2[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[29]];
                Inventory.getFirst(strArr2).interact(llIIIIlIl[llIIIIlll[30]]);
            }
        }
        if (lIlIIlIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIlll[10]) && lIlIIlIIlIlI(Skills.getLevel(Skill.ATTACK), llIIIIlll[2])) {
            String[] strArr3 = new String[llIIIIlll[1]];
            strArr3[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[2]];
            if (lIlIIlIIlIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[llIIIIlll[1]];
                strArr4[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[31]];
                Inventory.getFirst(strArr4).interact(llIIIIlIl[llIIIIlll[32]]);
            }
        }
        if (lIlIIlIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIlll[2]) && lIlIIlIIlIlI(Skills.getLevel(Skill.ATTACK), llIIIIlll[33])) {
            String[] strArr5 = new String[llIIIIlll[1]];
            strArr5[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[34]];
            if (lIlIIlIIlIIl(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[llIIIIlll[1]];
                strArr6[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[35]];
                Inventory.getFirst(strArr6).interact(llIIIIlIl[llIIIIlll[36]]);
            }
        }
        if (lIlIIlIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIlll[33]) && lIlIIlIIlIlI(Skills.getLevel(Skill.ATTACK), llIIIIlll[37])) {
            int[] iArr = new int[llIIIIlll[1]];
            iArr[llIIIIlll[0]] = llIIIIlll[16];
            if (lIlIIlIIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIIlll[1]];
                iArr2[llIIIIlll[0]] = llIIIIlll[16];
                Inventory.getFirst(iArr2).interact(llIIIIlIl[llIIIIlll[38]]);
            }
        }
        if (lIlIIlIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIlll[37])) {
            int[] iArr3 = new int[llIIIIlll[1]];
            iArr3[llIIIIlll[0]] = llIIIIlll[17];
            if (lIlIIlIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIIIlll[1]];
                iArr4[llIIIIlll[0]] = llIIIIlll[17];
                Inventory.getFirst(iArr4).interact(llIIIIlIl[llIIIIlll[39]]);
            }
        }
        if (lIlIIlIIlllI(Skills.getLevel(Skill.DEFENCE), llIIIIlll[33])) {
            int[] iArr5 = new int[llIIIIlll[1]];
            iArr5[llIIIIlll[0]] = llIIIIlll[40];
            if (lIlIIlIIlIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIIIlll[1]];
                iArr6[llIIIIlll[0]] = llIIIIlll[40];
                Inventory.getFirst(iArr6).interact(llIIIIlIl[llIIIIlll[41]]);
            }
            int[] iArr7 = new int[llIIIIlll[1]];
            iArr7[llIIIIlll[0]] = llIIIIlll[42];
            if (lIlIIlIIlIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIIIlll[1]];
                iArr8[llIIIIlll[0]] = llIIIIlll[42];
                Inventory.getFirst(iArr8).interact(llIIIIlIl[llIIIIlll[43]]);
            }
            int[] iArr9 = new int[llIIIIlll[1]];
            iArr9[llIIIIlll[0]] = llIIIIlll[44];
            if (lIlIIlIIlIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIIlll[1]];
                iArr10[llIIIIlll[0]] = llIIIIlll[44];
                Inventory.getFirst(iArr10).interact(llIIIIlIl[llIIIIlll[33]]);
            }
            int[] iArr11 = new int[llIIIIlll[1]];
            iArr11[llIIIIlll[0]] = llIIIIlll[45];
            if (lIlIIlIIlIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIIIlll[1]];
                iArr12[llIIIIlll[0]] = llIIIIlll[45];
                Inventory.getFirst(iArr12).interact(llIIIIlIl[llIIIIlll[46]]);
            }
        }
        int[] iArr13 = new int[llIIIIlll[1]];
        iArr13[llIIIIlll[0]] = llIIIIlll[47];
        if (lIlIIlIIlIIl(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[llIIIIlll[1]];
            iArr14[llIIIIlll[0]] = llIIIIlll[47];
            Inventory.getFirst(iArr14).interact(llIIIIlIl[llIIIIlll[48]]);
        }
        int[] iArr15 = new int[llIIIIlll[1]];
        iArr15[llIIIIlll[0]] = llIIIIlll[49];
        if (lIlIIlIIlIIl(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[llIIIIlll[1]];
            iArr16[llIIIIlll[0]] = llIIIIlll[49];
            Inventory.getFirst(iArr16).interact(llIIIIlIl[llIIIIlll[50]]);
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return llIIIIlIl[llIIIIlll[57]];
    }

    private static boolean lIlIIlIIlIll(int i) {
        return i == 0;
    }

    private static String lIlIIIlllIII(String lIlllIIllIIllI, String lIlllIIllIIlIl) {
        try {
            SecretKeySpec lIlllIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), llIIIIlll[18]), "DES");
            Cipher lIlllIIllIlIII = Cipher.getInstance("DES");
            lIlllIIllIlIII.init(llIIIIlll[3], lIlllIIllIlIIl);
            return new String(lIlllIIllIlIII.doFinal(Base64.getDecoder().decode(lIlllIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIllIIlll) {
            lIlllIIllIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIlI(int i, int i2) {
        return i < i2;
    }

    public static void dq() {
        if (lIlIIlIIlIlI(Skills.getLevel(Skill.DEFENCE), llIIIIlll[37])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    private static int lIlIIlIIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f7, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0131, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016b, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a5, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0225, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x025f, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0299, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d3, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x030d, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0347, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0381, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
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
        if (lIlIIlIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIlll[37])) {
            int[] iArr = new int[llIIIIlll[1]];
            iArr[llIIIIlll[0]] = llIIIIlll[17];
            if (lIlIIlIIlIll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIIlll[1]];
                iArr2[llIIIIlll[0]] = llIIIIlll[17];
            }
            int[] iArr3 = new int[llIIIIlll[1]];
            iArr3[llIIIIlll[0]] = llIIIIlll[42];
            if (lIlIIlIIlIll(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIIIlll[1]];
                iArr4[llIIIIlll[0]] = llIIIIlll[42];
            }
            int[] iArr5 = new int[llIIIIlll[1]];
            iArr5[llIIIIlll[0]] = llIIIIlll[44];
            if (lIlIIlIIlIll(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIIIlll[1]];
                iArr6[llIIIIlll[0]] = llIIIIlll[44];
            }
            int[] iArr7 = new int[llIIIIlll[1]];
            iArr7[llIIIIlll[0]] = llIIIIlll[40];
            if (lIlIIlIIlIll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIIIlll[1]];
                iArr8[llIIIIlll[0]] = llIIIIlll[40];
            }
            int[] iArr9 = new int[llIIIIlll[1]];
            iArr9[llIIIIlll[0]] = llIIIIlll[45];
            if (lIlIIlIIlIll(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIIlll[1]];
                iArr10[llIIIIlll[0]] = llIIIIlll[45];
            }
            int[] iArr11 = new int[llIIIIlll[1]];
            iArr11[llIIIIlll[0]] = llIIIIlll[47];
            if (lIlIIlIIlIll(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIIIlll[1]];
                iArr12[llIIIIlll[0]] = llIIIIlll[47];
            }
            int[] iArr13 = new int[llIIIIlll[1]];
            iArr13[llIIIIlll[0]] = llIIIIlll[49];
            if (lIlIIlIIlIll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIIIlll[1]];
                iArr14[llIIIIlll[0]] = llIIIIlll[49];
            }
            int[] iArr15 = new int[llIIIIlll[1]];
            iArr15[llIIIIlll[0]] = llIIIIlll[11];
            if (lIlIIlIIlIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = llIIIIlll[1];
                "".length();
                return (102 ^ 98) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIIlll[0];
        }
        int[] iArr16 = new int[llIIIIlll[1]];
        iArr16[llIIIIlll[0]] = llIIIIlll[16];
        if (lIlIIlIIlIll(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[llIIIIlll[1]];
            iArr17[llIIIIlll[0]] = llIIIIlll[16];
        }
        int[] iArr18 = new int[llIIIIlll[1]];
        iArr18[llIIIIlll[0]] = llIIIIlll[42];
        if (lIlIIlIIlIll(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[llIIIIlll[1]];
            iArr19[llIIIIlll[0]] = llIIIIlll[42];
        }
        int[] iArr20 = new int[llIIIIlll[1]];
        iArr20[llIIIIlll[0]] = llIIIIlll[44];
        if (lIlIIlIIlIll(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[llIIIIlll[1]];
            iArr21[llIIIIlll[0]] = llIIIIlll[44];
        }
        int[] iArr22 = new int[llIIIIlll[1]];
        iArr22[llIIIIlll[0]] = llIIIIlll[40];
        if (lIlIIlIIlIll(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[llIIIIlll[1]];
            iArr23[llIIIIlll[0]] = llIIIIlll[40];
        }
        int[] iArr24 = new int[llIIIIlll[1]];
        iArr24[llIIIIlll[0]] = llIIIIlll[45];
        if (lIlIIlIIlIll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[llIIIIlll[1]];
            iArr25[llIIIIlll[0]] = llIIIIlll[45];
        }
        int[] iArr26 = new int[llIIIIlll[1]];
        iArr26[llIIIIlll[0]] = llIIIIlll[47];
        if (lIlIIlIIlIll(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[llIIIIlll[1]];
            iArr27[llIIIIlll[0]] = llIIIIlll[47];
        }
        int[] iArr28 = new int[llIIIIlll[1]];
        iArr28[llIIIIlll[0]] = llIIIIlll[49];
        if (lIlIIlIIlIll(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[llIIIIlll[1]];
            iArr29[llIIIIlll[0]] = llIIIIlll[49];
        }
        int[] iArr30 = new int[llIIIIlll[1]];
        iArr30[llIIIIlll[0]] = llIIIIlll[11];
        if (lIlIIlIIlIIl(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = llIIIIlll[1];
            "".length();
            return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
        }
        return llIIIIlll[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x056d, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05b3, code lost:
        return l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.Z.llIIIIlll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0114, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016b, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c2, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0219, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0270, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02aa, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d4, code lost:
        return l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.Z.llIIIIlll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0329, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0380, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03d7, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x042e, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0485, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04dc, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0533, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
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
        if (lIlIIlIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIlll[37])) {
            int[] iArr = new int[llIIIIlll[1]];
            iArr[llIIIIlll[0]] = llIIIIlll[17];
            if (lIlIIlIIlIll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIIlll[1]];
                iArr2[llIIIIlll[0]] = llIIIIlll[17];
                if (lIlIIlIIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIIIlll[1]];
                    iArr3[llIIIIlll[0]] = llIIIIlll[17];
                }
            }
            int[] iArr4 = new int[llIIIIlll[1]];
            iArr4[llIIIIlll[0]] = llIIIIlll[42];
            if (lIlIIlIIlIll(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[llIIIIlll[1]];
                iArr5[llIIIIlll[0]] = llIIIIlll[42];
                if (lIlIIlIIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIIIIlll[1]];
                    iArr6[llIIIIlll[0]] = llIIIIlll[42];
                }
            }
            int[] iArr7 = new int[llIIIIlll[1]];
            iArr7[llIIIIlll[0]] = llIIIIlll[44];
            if (lIlIIlIIlIll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIIIlll[1]];
                iArr8[llIIIIlll[0]] = llIIIIlll[44];
                if (lIlIIlIIlIll(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llIIIIlll[1]];
                    iArr9[llIIIIlll[0]] = llIIIIlll[44];
                }
            }
            int[] iArr10 = new int[llIIIIlll[1]];
            iArr10[llIIIIlll[0]] = llIIIIlll[40];
            if (lIlIIlIIlIll(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIIIlll[1]];
                iArr11[llIIIIlll[0]] = llIIIIlll[40];
                if (lIlIIlIIlIll(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIIIIlll[1]];
                    iArr12[llIIIIlll[0]] = llIIIIlll[40];
                }
            }
            int[] iArr13 = new int[llIIIIlll[1]];
            iArr13[llIIIIlll[0]] = llIIIIlll[45];
            if (lIlIIlIIlIll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIIIlll[1]];
                iArr14[llIIIIlll[0]] = llIIIIlll[45];
                if (lIlIIlIIlIll(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIIIlll[1]];
                    iArr15[llIIIIlll[0]] = llIIIIlll[45];
                }
            }
            int[] iArr16 = new int[llIIIIlll[1]];
            iArr16[llIIIIlll[0]] = llIIIIlll[47];
            if (lIlIIlIIlIll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIIIIlll[1]];
                iArr17[llIIIIlll[0]] = llIIIIlll[47];
                if (lIlIIlIIlIll(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIIIIlll[1]];
                    iArr18[llIIIIlll[0]] = llIIIIlll[47];
                }
            }
            int[] iArr19 = new int[llIIIIlll[1]];
            iArr19[llIIIIlll[0]] = llIIIIlll[49];
            if (lIlIIlIIlIll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIIIIlll[1]];
                iArr20[llIIIIlll[0]] = llIIIIlll[49];
                if (lIlIIlIIlIll(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[llIIIIlll[1]];
                    iArr21[llIIIIlll[0]] = llIIIIlll[49];
                }
            }
            int[] iArr22 = new int[llIIIIlll[1]];
            iArr22[llIIIIlll[0]] = llIIIIlll[11];
            if (lIlIIlIIlIll(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIIIIlll[1]];
                iArr23[llIIIIlll[0]] = llIIIIlll[11];
            }
            ?? r0 = llIIIIlll[1];
            "".length();
            return (-(0 ^ 4)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        int[] iArr24 = new int[llIIIIlll[1]];
        iArr24[llIIIIlll[0]] = llIIIIlll[16];
        if (lIlIIlIIlIll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[llIIIIlll[1]];
            iArr25[llIIIIlll[0]] = llIIIIlll[16];
            if (lIlIIlIIlIll(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[llIIIIlll[1]];
                iArr26[llIIIIlll[0]] = llIIIIlll[16];
            }
        }
        int[] iArr27 = new int[llIIIIlll[1]];
        iArr27[llIIIIlll[0]] = llIIIIlll[42];
        if (lIlIIlIIlIll(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[llIIIIlll[1]];
            iArr28[llIIIIlll[0]] = llIIIIlll[42];
            if (lIlIIlIIlIll(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[llIIIIlll[1]];
                iArr29[llIIIIlll[0]] = llIIIIlll[42];
            }
        }
        int[] iArr30 = new int[llIIIIlll[1]];
        iArr30[llIIIIlll[0]] = llIIIIlll[44];
        if (lIlIIlIIlIll(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[llIIIIlll[1]];
            iArr31[llIIIIlll[0]] = llIIIIlll[44];
            if (lIlIIlIIlIll(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[llIIIIlll[1]];
                iArr32[llIIIIlll[0]] = llIIIIlll[44];
            }
        }
        int[] iArr33 = new int[llIIIIlll[1]];
        iArr33[llIIIIlll[0]] = llIIIIlll[40];
        if (lIlIIlIIlIll(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[llIIIIlll[1]];
            iArr34[llIIIIlll[0]] = llIIIIlll[40];
            if (lIlIIlIIlIll(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[llIIIIlll[1]];
                iArr35[llIIIIlll[0]] = llIIIIlll[40];
            }
        }
        int[] iArr36 = new int[llIIIIlll[1]];
        iArr36[llIIIIlll[0]] = llIIIIlll[45];
        if (lIlIIlIIlIll(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[llIIIIlll[1]];
            iArr37[llIIIIlll[0]] = llIIIIlll[45];
            if (lIlIIlIIlIll(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[llIIIIlll[1]];
                iArr38[llIIIIlll[0]] = llIIIIlll[45];
            }
        }
        int[] iArr39 = new int[llIIIIlll[1]];
        iArr39[llIIIIlll[0]] = llIIIIlll[47];
        if (lIlIIlIIlIll(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[llIIIIlll[1]];
            iArr40[llIIIIlll[0]] = llIIIIlll[47];
            if (lIlIIlIIlIll(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIIIIlll[1]];
                iArr41[llIIIIlll[0]] = llIIIIlll[47];
            }
        }
        int[] iArr42 = new int[llIIIIlll[1]];
        iArr42[llIIIIlll[0]] = llIIIIlll[49];
        if (lIlIIlIIlIll(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[llIIIIlll[1]];
            iArr43[llIIIIlll[0]] = llIIIIlll[49];
            if (lIlIIlIIlIll(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[llIIIIlll[1]];
                iArr44[llIIIIlll[0]] = llIIIIlll[49];
            }
        }
        int[] iArr45 = new int[llIIIIlll[1]];
        iArr45[llIIIIlll[0]] = llIIIIlll[11];
        if (lIlIIlIIlIll(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[llIIIIlll[1]];
            iArr46[llIIIIlll[0]] = llIIIIlll[11];
        }
        ?? r02 = llIIIIlll[1];
        "".length();
        return ((210 ^ 131) & ((71 ^ 22) ^ (-1))) > ((175 ^ 188) & ((58 ^ 41) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r02;
    }

    private static boolean lIlIIlIlIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIlIIllIl(int i) {
        return i > 0;
    }

    private static String lIlIIIlllIIl(String lIlllIIllllIll, String lIlllIIllllIlI) {
        String str = new String(Base64.getDecoder().decode(lIlllIIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIIllllIIl = new StringBuilder();
        char[] lIlllIIllllIII = lIlllIIllllIlI.toCharArray();
        int lIlllIIlllIlll = llIIIIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIIlll[0];
        while (lIlIIlIIlIlI(i, length)) {
            char lIlllIIlllllII = charArray[i];
            lIlllIIllllIIl.append((char) (lIlllIIlllllII ^ lIlllIIllllIII[lIlllIIlllIlll % lIlllIIllllIII.length]));
            "".length();
            lIlllIIlllIlll++;
            i++;
            "".length();
            if ((((160 ^ 150) ^ (61 ^ 37)) & (((((184 + 155) - 243) + 141) ^ (((36 + 120) - (-11)) + 28)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lIlllIIllllIIl);
    }

    public static void af() {
        int[] iArr = new int[llIIIIlll[1]];
        iArr[llIIIIlll[0]] = llIIIIlll[9];
        if (lIlIIlIIlIll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[9], llIIIIlll[37], llIIIIlll[51]));
            "".length();
        }
        int[] iArr2 = new int[llIIIIlll[1]];
        iArr2[llIIIIlll[0]] = llIIIIlll[52];
        if (lIlIIlIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[52], llIIIIlll[10], llIIIIlll[51]));
            "".length();
        }
        int[] iArr3 = new int[llIIIIlll[1]];
        iArr3[llIIIIlll[0]] = llIIIIlll[49];
        if (lIlIIlIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[49], llIIIIlll[1], llIIIIlll[53]));
            "".length();
        }
        int[] iArr4 = new int[llIIIIlll[1]];
        iArr4[llIIIIlll[0]] = llIIIIlll[47];
        if (lIlIIlIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[47], llIIIIlll[1], llIIIIlll[54]));
            "".length();
        }
        int[] iArr5 = new int[llIIIIlll[1]];
        iArr5[llIIIIlll[0]] = llIIIIlll[11];
        if (lIlIIlIIlIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[11], llIIIIlll[12], llIIIIlll[55]));
            "".length();
        }
        int[] iArr6 = new int[llIIIIlll[1]];
        iArr6[llIIIIlll[0]] = llIIIIlll[40];
        if (lIlIIlIIlIll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[40], llIIIIlll[1], llIIIIlll[56]));
            "".length();
        }
        int[] iArr7 = new int[llIIIIlll[1]];
        iArr7[llIIIIlll[0]] = llIIIIlll[44];
        if (lIlIIlIIlIll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[44], llIIIIlll[1], llIIIIlll[56]));
            "".length();
        }
        int[] iArr8 = new int[llIIIIlll[1]];
        iArr8[llIIIIlll[0]] = llIIIIlll[45];
        if (lIlIIlIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[45], llIIIIlll[1], llIIIIlll[56]));
            "".length();
        }
        int[] iArr9 = new int[llIIIIlll[1]];
        iArr9[llIIIIlll[0]] = llIIIIlll[42];
        if (lIlIIlIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[42], llIIIIlll[1], llIIIIlll[56]));
            "".length();
        }
        if (lIlIIlIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIlll[37])) {
            int[] iArr10 = new int[llIIIIlll[1]];
            iArr10[llIIIIlll[0]] = llIIIIlll[17];
            if (lIlIIlIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0003d(llIIIIlll[17], llIIIIlll[1], llIIIIlll[54]));
                "".length();
            }
        }
        int[] iArr11 = new int[llIIIIlll[1]];
        iArr11[llIIIIlll[0]] = llIIIIlll[16];
        if (lIlIIlIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0003d(llIIIIlll[16], llIIIIlll[1], llIIIIlll[56]));
            "".length();
        }
    }

    private static boolean lIlIIlIlIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIIlIIlllI(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIIIlllIlI(String lIlllIIlIllIIl, String lIlllIIlIllIII) {
        try {
            SecretKeySpec lIlllIIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIlll[3], lIlllIIlIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIlIllIlI) {
            lIlllIIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIIIllI() {
        llIIIIlIl = new String[llIIIIlll[71]];
        llIIIIlIl[llIIIIlll[0]] = lIlIIIlllIII("IlFLIHjcyM/FhTe6CZCPPQ==", "nqIFg");
        llIIIIlIl[llIIIIlll[1]] = lIlIIIlllIIl("NCwPLhQaIAVnBQc8CCkAUiwVIgoBaUE0EBsxAi8OHCJBJQYRLkEzCFIoBCsCF2UVNQYbKwgpAA==", "rEaGg");
        llIIIIlIl[llIIIIlll[3]] = lIlIIIlllIlI("x7ikuECbR8UHq5tDzZek93aaaaJSWcLC", "mMsaZ");
        llIIIIlIl[llIIIIlll[4]] = lIlIIIlllIII("efRKOqiXAq5RvJvDFEbdBRDJyc3Porze", "vSrer");
        llIIIIlIl[llIIIIlll[6]] = lIlIIIlllIlI("niEJBMdOGqZT6+JNEPlmZ7m/WtXVqRw9twoQH9WrHRS7ShgRlwTjn8OIlItYE/+d", "PgfkP");
        llIIIIlIl[llIIIIlll[10]] = lIlIIIlllIII("175z6yuz/4QHjjUTYM5elQ==", "DRmeS");
        llIIIIlIl[llIIIIlll[14]] = lIlIIIlllIII("wwzPFAA+hErQgWAybNfUUw==", "IwrFa");
        llIIIIlIl[llIIIIlll[15]] = lIlIIIlllIlI("dZxSkk2UM7/8oZrpA58D0tdXw7Yym1hU", "GEjKY");
        llIIIIlIl[llIIIIlll[18]] = lIlIIIlllIIl("KAMO", "mbzbt");
        llIIIIlIl[llIIIIlll[19]] = lIlIIIlllIII("l+ZcciacLpj72MNLpJ6+uKYbgIDn3DVR", "VcZon");
        llIIIIlIl[llIIIIlll[20]] = lIlIIIlllIIl("GiEkPSE/L2gyJyY7", "QHHQH");
        llIIIIlIl[llIIIIlll[21]] = lIlIIIlllIlI("eXqv2l+NSqY=", "PuInM");
        llIIIIlIl[llIIIIlll[22]] = lIlIIIlllIII("NYJ6QFlj7C8=", "LpJMF");
        llIIIIlIl[llIIIIlll[23]] = lIlIIIlllIII("Q0Is3K6SBCU=", "mYYAX");
        llIIIIlIl[llIIIIlll[24]] = lIlIIIlllIIl("AxY9Dgop", "BbIoi");
        llIIIIlIl[llIIIIlll[13]] = lIlIIIlllIII("oknkIEqFXfrWwLDiW0Zmig==", "xRPlv");
        llIIIIlIl[llIIIIlll[25]] = lIlIIIlllIIl("", "uxUoD");
        llIIIIlIl[llIIIIlll[28]] = lIlIIIlllIIl("AwIOJFE5EwgnGD4REw==", "JpaJq");
        llIIIIlIl[llIIIIlll[29]] = lIlIIIlllIII("XR6Dtm+YG2hcJjJ52rw7Cw==", "gDQem");
        llIIIIlIl[llIIIIlll[30]] = lIlIIIlllIIl("ICQTIAA=", "wMvLd");
        llIIIIlIl[llIIIIlll[2]] = lIlIIIlllIlI("wKa5mVd/DDl5ufSz1Kx2Wg==", "klgbV");
        llIIIIlIl[llIIIIlll[31]] = lIlIIIlllIII("Bs/hMwyY9dGGjv4CqIYvkg==", "XWmMo");
        llIIIIlIl[llIIIIlll[32]] = lIlIIIlllIIl("JToPPzM=", "rSjSW");
        llIIIIlIl[llIIIIlll[34]] = lIlIIIlllIII("4LMtAtcdejxG7DJfG6ygMixVvecOmWNt", "KeDXg");
        llIIIIlIl[llIIIIlll[35]] = lIlIIIlllIIl("HCIiDx84J3YUDjgmPxMMIw==", "QKVgm");
        llIIIIlIl[llIIIIlll[36]] = lIlIIIlllIII("JGG5dJgzu5A=", "JrIPZ");
        llIIIIlIl[llIIIIlll[38]] = lIlIIIlllIlI("my5+JivG+ho=", "mpvrQ");
        llIIIIlIl[llIIIIlll[39]] = lIlIIIlllIII("OyC5LeIastA=", "wQLwk");
        llIIIIlIl[llIIIIlll[41]] = lIlIIIlllIIl("OiIbFA==", "mGzfb");
        llIIIIlIl[llIIIIlll[43]] = lIlIIIlllIIl("HCkKOw==", "KLkIh");
        llIIIIlIl[llIIIIlll[33]] = lIlIIIlllIII("vg40mRoZ/As=", "LdgKk");
        llIIIIlIl[llIIIIlll[46]] = lIlIIIlllIII("rKTzQ8dAfU8=", "bAqDg");
        llIIIIlIl[llIIIIlll[48]] = lIlIIIlllIII("8P1O4adxKlE=", "cjNHL");
        llIIIIlIl[llIIIIlll[50]] = lIlIIIlllIlI("ej/LwO7vWfA=", "HRicE");
        llIIIIlIl[llIIIIlll[57]] = lIlIIIlllIIl("dlNjNjAi", "DcCrU");
        llIIIIlIl[llIIIIlll[58]] = lIlIIIlllIIl("MSk/", "rFHJD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return llIIIIlll[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0252, code lost:
        if (lIlIIlIIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dn() {
        if (lIlIIlIIlIIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[0]];
            C0001b.a(bv);
            if (lIlIIlIIlIlI(bv.size(), llIIIIlll[1])) {
                System.out.println(llIIIIlIl[llIIIIlll[1]]);
                bt = llIIIIlll[0];
            }
        }
        if (lIlIIlIIlIll(bt ? 1 : 0)) {
            if (lIlIIlIIlIll(bH() ? 1 : 0) && lIlIIlIIlIlI(Skills.getLevel(Skill.DEFENCE), llIIIIlll[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIIllII(nearest) && lIlIIlIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[3]];
                    C0000a.a(nearest);
                }
                if (lIlIIlIIllII(nearest) && lIlIIlIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[4]];
                    if (lIlIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIIlll[5]);
                        "".length();
                    }
                    if (lIlIIlIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIIlll[1]);
                            "".length();
                        }
                        if (lIlIIlIIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIIlll[3]);
                            "".length();
                        }
                        if (lIlIIlIIlIll(dp() ? 1 : 0)) {
                            af();
                            System.out.println(llIIIIlIl[llIIIIlll[6]]);
                            bt = llIIIIlll[1];
                            return;
                        }
                        C0000a.a(kE, llIIIIlll[1]);
                        C0000a.a(llIIIIlll[7], llIIIIlll[8]);
                        C0000a.b(C0005f.aV, llIIIIlll[1]);
                        C0000a.a(llIIIIlll[9], llIIIIlll[10]);
                        C0000a.a(llIIIIlll[11], llIIIIlll[12]);
                    }
                }
            }
            if (lIlIIlIIlIIl(bH() ? 1 : 0)) {
                m28do();
                if (lIlIIlIIlllI(Movement.getRunEnergy(), llIIIIlll[13]) && lIlIIlIIlIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[llIIIIlll[1]];
                strArr[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[10]];
                if (lIlIIlIIlIll(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIIIlll[1]];
                    strArr2[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[14]];
                    if (lIlIIlIIlIll(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[llIIIIlll[1]];
                        strArr3[llIIIIlll[0]] = llIIIIlIl[llIIIIlll[15]];
                        if (lIlIIlIIlIll(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[llIIIIlll[1]];
                            iArr[llIIIIlll[0]] = llIIIIlll[16];
                            if (lIlIIlIIlIll(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIIIIlll[1]];
                                iArr2[llIIIIlll[0]] = llIIIIlll[17];
                            }
                        }
                    }
                }
                dq();
                if (lIlIIlIIllll(lIlIIlIIlIII(C0004e.u(), 45.0d))) {
                    int[] iArr3 = new int[llIIIIlll[1]];
                    iArr3[llIIIIlll[0]] = llIIIIlll[11];
                    if (lIlIIlIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIIIIlll[1]];
                        iArr4[llIIIIlll[0]] = llIIIIlll[11];
                        Inventory.getFirst(iArr4).interact(llIIIIlIl[llIIIIlll[18]]);
                        Time.sleepTicks(llIIIIlll[1]);
                        "".length();
                    }
                }
                if (lIlIIlIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIlll[2]) && lIlIIlIIlllI(Skills.getLevel(Skill.STRENGTH), llIIIIlll[2])) {
                    aa();
                }
            }
        }
    }

    private static boolean lIlIIlIIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIlIIllII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIlIIlIIlllI(Skills.getLevel(Skill.DEFENCE), llIIIIlll[2])) {
            ?? r0 = llIIIIlll[1];
            "".length();
            return "  ".length() > "  ".length() ? ((64 ^ 71) ^ (73 ^ 16)) & (((((60 + 163) - 45) + 29) ^ (((126 + 50) - 101) + 70)) ^ (-" ".length())) : r0;
        }
        return llIIIIlll[0];
    }

    private static boolean lIlIIlIIllll(int i) {
        return i < 0;
    }

    static {
        lIlIIlIIIlll();
        lIlIIlIIIllI();
        bv = new ArrayList();
        int[] iArr = new int[llIIIIlll[18]];
        iArr[llIIIIlll[0]] = llIIIIlll[16];
        iArr[llIIIIlll[1]] = llIIIIlll[17];
        iArr[llIIIIlll[3]] = llIIIIlll[42];
        iArr[llIIIIlll[4]] = llIIIIlll[44];
        iArr[llIIIIlll[6]] = llIIIIlll[40];
        iArr[llIIIIlll[10]] = llIIIIlll[45];
        iArr[llIIIIlll[14]] = llIIIIlll[47];
        iArr[llIIIIlll[15]] = llIIIIlll[49];
        kE = iArr;
        kF = new WorldArea(llIIIIlll[59], llIIIIlll[60], llIIIIlll[21], llIIIIlll[21], llIIIIlll[0]);
        kG = new WorldArea(llIIIIlll[61], llIIIIlll[62], llIIIIlll[31], llIIIIlll[25], llIIIIlll[0]);
        kH = new WorldArea(llIIIIlll[63], llIIIIlll[64], llIIIIlll[65], llIIIIlll[33], llIIIIlll[0]);
        kI = new WorldPoint(llIIIIlll[66], llIIIIlll[67], llIIIIlll[0]);
        bx = new WorldPoint(llIIIIlll[68], llIIIIlll[60], llIIIIlll[0]);
        kJ = new WorldPoint(llIIIIlll[69], llIIIIlll[70], llIIIIlll[0]);
    }
}
