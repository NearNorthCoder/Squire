package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.m  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/m.class */
public class C0012m implements W {
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ String[] lIlllIllI;
    private static /* synthetic */ int[] lIlllIlll;
    public static /* synthetic */ boolean bt;

    private static boolean lIIlllIllIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllIlIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
            ?? r0 = lIlllIlll[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIlll[0];
    }

    private static void lIIlllIlIlII() {
        lIlllIlll = new int[63];
        lIlllIlll[0] = (161 ^ 131) & ((162 ^ 128) ^ (-1));
        lIlllIlll[1] = " ".length();
        lIlllIlll[2] = "  ".length();
        lIlllIlll[3] = "   ".length();
        lIlllIlll[4] = (-((-9) & 26703)) & (-17) & 31710;
        lIlllIlll[5] = 166 ^ 163;
        lIlllIlll[6] = (((1 + 130) - 42) + 48) ^ (((116 + 112) - 219) + 132);
        lIlllIlll[7] = 13 ^ 63;
        lIlllIlll[8] = (-((-4115) & 20667)) & (-1) & 27051;
        lIlllIlll[9] = (-9731) & 12223;
        lIlllIlll[10] = (-((-783) & 5935)) & (-8725) & 16375;
        lIlllIlll[11] = (-((-309) & 32246)) & (-5) & 32751;
        lIlllIlll[12] = (-((-2417) & 32119)) & (-1) & 30543;
        lIlllIlll[13] = (-17557) & 18399;
        lIlllIlll[14] = (-9359) & 10207;
        lIlllIlll[15] = (-((-17) & 31766)) & (-9) & 32639;
        lIlllIlll[16] = (-((-1185) & 31971)) & (-21) & 31615;
        lIlllIlll[17] = (-21385) & 22479;
        lIlllIlll[18] = (-31023) & 32191;
        lIlllIlll[19] = (-23045) & 24173;
        lIlllIlll[20] = (-4225) & 15350;
        lIlllIlll[21] = (-10500) & 12203;
        lIlllIlll[22] = (-1029) & 13653;
        lIlllIlll[23] = (-((-6019) & 30647)) & (-131) & 32767;
        lIlllIlll[24] = (246 ^ 184) ^ (75 ^ 15);
        lIlllIlll[25] = (-((-5410) & 30135)) & (-1) & 32735;
        lIlllIlll[26] = (-31749) & 32127;
        lIlllIlll[27] = 38 ^ 56;
        lIlllIlll[28] = (-17553) & 18359;
        lIlllIlll[29] = (-((-182) & 19959)) & (-3) & 28659;
        lIlllIlll[30] = 192 ^ 198;
        lIlllIlll[31] = 94 ^ 74;
        lIlllIlll[32] = 97 ^ 102;
        lIlllIlll[33] = (227 ^ 145) ^ (187 ^ 193);
        lIlllIlll[34] = (-((-9909) & 32693)) & (-70) & 31735;
        lIlllIlll[35] = (27 ^ 105) ^ (13 ^ 118);
        lIlllIlll[36] = (65 ^ 61) ^ (214 ^ 130);
        lIlllIlll[37] = 125 ^ 118;
        lIlllIlll[38] = 33 ^ 45;
        lIlllIlll[39] = (((100 + 79) - (-16)) + 6) ^ (((57 + 59) - (-64)) + 16);
        lIlllIlll[40] = 54 ^ 56;
        lIlllIlll[41] = (((104 ^ 31) + (((79 + 57) - 76) + 76)) - (116 ^ 108)) + (189 ^ 180);
        lIlllIlll[42] = (((38 + 15) - 42) + 159) ^ (((127 + 79) - 100) + 59);
        lIlllIlll[43] = 167 ^ 183;
        lIlllIlll[44] = 139 ^ 154;
        lIlllIlll[45] = (66 ^ 23) ^ (113 ^ 54);
        lIlllIlll[46] = (-1030) & 16029;
        lIlllIlll[47] = (-((-17868) & 24027)) & (-1) & 8159;
        lIlllIlll[48] = (-((-14489) & 31901)) & (-3) & 28414;
        lIlllIlll[49] = (-17618) & 24283;
        lIlllIlll[50] = (-((-15374) & 32015)) & (-13321) & 65407;
        lIlllIlll[51] = (-((-1305) & 17854)) & (-1027) & 24575;
        lIlllIlll[52] = (-((-2766) & 15071)) & (-15) & 29439;
        lIlllIlll[53] = 23 ^ 52;
        lIlllIlll[54] = 79 ^ 43;
        lIlllIlll[55] = (-26783) & 27102;
        lIlllIlll[56] = (-4) & 11983;
        lIlllIlll[57] = (-1603) & 26602;
        lIlllIlll[58] = (-24745) & 32751;
        lIlllIlll[59] = (-25724) & 26623;
        lIlllIlll[60] = 140 ^ 159;
        lIlllIlll[61] = 58 ^ 47;
        lIlllIlll[62] = (136 ^ 144) ^ (98 ^ 108);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlllIlll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public static void ap() {
        if (lIIlllIlIlIl(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlllIllI[lIlllIlll[0]];
            C0001b.a(bv);
            if (lIIlllIlIllI(bv.size(), lIlllIlll[1])) {
                System.out.println(lIlllIllI[lIlllIlll[1]]);
                bt = lIlllIlll[0];
            }
        }
        if (lIIlllIlIlll(bt ? 1 : 0)) {
            if (lIIlllIlIlll(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlllIllIII(nearest) && lIIlllIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIllI[lIlllIlll[2]];
                    C0000a.a(nearest);
                }
                if (lIIlllIllIII(nearest) && lIIlllIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlllIllI[lIlllIlll[3]];
                    if (lIIlllIlIlll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIlll[4]);
                        "".length();
                        Time.sleepTicks(lIlllIlll[3]);
                        "".length();
                    }
                    if (lIIlllIlIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIIlllIllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllIlll[5]);
                            "".length();
                        }
                        if (lIIlllIllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllIlll[2]);
                            "".length();
                        }
                        if (lIIlllIlIlll(ac() ? 1 : 0)) {
                            af();
                            System.out.println(lIlllIllI[lIlllIlll[6]]);
                            bt = lIlllIlll[1];
                            return;
                        }
                        if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
                            C0000a.a(lIlllIlll[8], lIlllIlll[1]);
                            C0000a.a(lIlllIlll[9], lIlllIlll[1]);
                            C0000a.a(lIlllIlll[10], lIlllIlll[1]);
                            Bank.withdrawAll(lIlllIlll[11], Bank.WithdrawMode.ITEM);
                        }
                        if (lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
                            C0000a.a(lIlllIlll[12], lIlllIlll[1]);
                            C0000a.a(lIlllIlll[13], lIlllIlll[1]);
                            C0000a.a(lIlllIlll[14], lIlllIlll[1]);
                            Bank.withdrawAll(lIlllIlll[15], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIlllIlll[1]);
                            "".length();
                            Bank.withdrawAll(lIlllIlll[16], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIlllIlll[1]);
                            "".length();
                            C0000a.a(lIlllIlll[17], lIlllIlll[1]);
                        }
                        C0000a.a(lIlllIlll[18], lIlllIlll[1]);
                        C0000a.a(lIlllIlll[19], lIlllIlll[1]);
                        C0000a.a(lIlllIlll[20], lIlllIlll[1]);
                        C0000a.a(lIlllIlll[21], lIlllIlll[1]);
                        C0000a.a(lIlllIlll[22], lIlllIlll[1]);
                        C0000a.a(lIlllIlll[23], lIlllIlll[24]);
                        C0000a.a(lIlllIlll[25], lIlllIlll[24]);
                        C0000a.a(lIlllIlll[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (lIIlllIlIlIl(ab() ? 1 : 0)) {
                aq();
                if (lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[27])) {
                    C0011l.Z();
                }
                if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[27])) {
                    TileItem nearest2 = TileItems.getNearest(tileItem -> {
                        if (lIIlllIlllII(tileItem.getId(), lIlllIlll[16]) && lIIlllIllIlI(tileItem.getQuantity(), lIlllIlll[42])) {
                            ?? r0 = lIlllIlll[1];
                            "".length();
                            return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIlllIlll[0];
                    });
                    if (lIIlllIllIII(nearest2)) {
                        nearest2.interact(lIlllIllI[lIlllIlll[5]]);
                        Time.sleepTicks(lIlllIlll[6]);
                        "".length();
                    }
                    C0010k.X();
                }
            }
        }
    }

    private static String lIIlllIIIlIl(String llIIIlllIIlIlI, String llIIIlllIIlIIl) {
        String llIIIlllIIlIlI2 = new String(Base64.getDecoder().decode(llIIIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llIIIlllIIIlll = llIIIlllIIlIIl.toCharArray();
        int llIIIlllIIIllI = lIlllIlll[0];
        char[] charArray = llIIIlllIIlIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlllIlll[0];
        while (lIIlllIlIllI(i, length)) {
            char llIIIlllIIlIll = charArray[i];
            sb.append((char) (llIIIlllIIlIll ^ llIIIlllIIIlll[llIIIlllIIIllI % llIIIlllIIIlll.length]));
            "".length();
            llIIIlllIIIllI++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlllIlIlIl(int i) {
        return i != 0;
    }

    private static void lIIlllIlIIll() {
        lIlllIllI = new String[lIlllIlll[62]];
        lIlllIllI[lIlllIlll[0]] = lIIlllIIIlIl("MBcJCyMVQhkWKB8R", "rbpbM");
        lIlllIllI[lIlllIlll[1]] = lIIlllIIIlIl("NSwlPhwbIC93DQY8IjkIUyw/MgIAaWskGBoxKD8GHSJrNQ4QLmsjAFMoKjAGEGU/JQ4aKyI5CA==", "sEKWo");
        lIlllIllI[lIlllIlll[2]] = lIIlllIIIllI("7AOo6i1KGQL7Tor3S0n2X/Le40WyxU30", "SbgSY");
        lIlllIllI[lIlllIlll[3]] = lIIlllIIIllI("thO9i5zhFoT7s+1IVQ/5r/oCcKlGja3/", "pkbXV");
        lIlllIllI[lIlllIlll[6]] = lIIlllIIIllI("VqpEmvsAYujzvXBzbMDQu+mUoTTSNb07Ygcw80w/mpzlTk9nFxfLjdUfJUgVFe+W", "iWsgI");
        lIlllIllI[lIlllIlll[5]] = lIIlllIIIllI("ToT/B4+L40M=", "VqxKE");
        lIlllIllI[lIlllIlll[30]] = lIIlllIIIlll("Lo6TG54FQiI=", "MJvWq");
        lIlllIllI[lIlllIlll[32]] = lIIlllIIIlll("imqUFYEIAsI=", "qWNHe");
        lIlllIllI[lIlllIlll[33]] = lIIlllIIIllI("JbZTi0iqywU=", "HjONG");
        lIlllIllI[lIlllIlll[35]] = lIIlllIIIlIl("DwUmKCY=", "XlCDB");
        lIlllIllI[lIlllIlll[24]] = lIIlllIIIlIl("BgMJPCw=", "QjlPH");
        lIlllIllI[lIlllIlll[37]] = lIIlllIIIlIl("HwE7Bw==", "HdZuR");
        lIlllIllI[lIlllIlll[38]] = lIIlllIIIllI("hAj86+QXhzU=", "mBeLl");
        lIlllIllI[lIlllIlll[39]] = lIIlllIIIlIl("EhYvKg==", "EsNXM");
        lIlllIllI[lIlllIlll[40]] = lIIlllIIIlll("ti2CNWMSj2M=", "joIKz");
        lIlllIllI[lIlllIlll[42]] = lIIlllIIIlll("W0ENRTIg0Ok=", "wtfxi");
        lIlllIllI[lIlllIlll[43]] = lIIlllIIIllI("eFUuRYkQQsA=", "rcLTt");
        lIlllIllI[lIlllIlll[44]] = lIIlllIIIlll("dfgDv6dll40=", "UwSnw");
        lIlllIllI[lIlllIlll[45]] = lIIlllIIIllI("pD3bfwxK2Vg=", "pLMuX");
        lIlllIllI[lIlllIlll[60]] = lIIlllIIIlll("Oar845MABbjBoltjBvg0OA==", "STVxv");
        lIlllIllI[lIlllIlll[31]] = lIIlllIIIlIl("GSwMLUwEI0I9CQopFiJMQw==", "kEbJl");
        lIlllIllI[lIlllIlll[61]] = lIIlllIIIllI("f3fwvORauVA=", "NtXcC");
    }

    static {
        lIIlllIlIlII();
        lIIlllIlIIll();
        bv = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x052d, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05ee, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0628, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0662, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x069c, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x06d6, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0710, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x074a, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0784, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x07be, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e4, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0158, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0192, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0259, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0293, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02cd, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0307, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0341, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x037b, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0445, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x047f, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04b9, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04f3, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v164, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v213, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v240, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v289, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[7]) && lIIlllIlllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlllIlll[41]) && lIIlllIllIlI(Skills.getLevel(Skill.DEFENCE), lIlllIlll[36])) {
            int[] iArr = new int[lIlllIlll[1]];
            iArr[lIlllIlll[0]] = lIlllIlll[9];
            if (lIIlllIlIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIlll[1]];
                iArr2[lIlllIlll[0]] = lIlllIlll[9];
            }
            int[] iArr3 = new int[lIlllIlll[1]];
            iArr3[lIlllIlll[0]] = lIlllIlll[10];
            if (lIIlllIlIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIlllIlll[1]];
                iArr4[lIlllIlll[0]] = lIlllIlll[10];
            }
            int[] iArr5 = new int[lIlllIlll[1]];
            iArr5[lIlllIlll[0]] = lIlllIlll[18];
            if (lIIlllIlIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlllIlll[1]];
                iArr6[lIlllIlll[0]] = lIlllIlll[18];
            }
            int[] iArr7 = new int[lIlllIlll[1]];
            iArr7[lIlllIlll[0]] = lIlllIlll[20];
            if (lIIlllIlIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlllIlll[1]];
                iArr8[lIlllIlll[0]] = lIlllIlll[20];
            }
            int[] iArr9 = new int[lIlllIlll[1]];
            iArr9[lIlllIlll[0]] = lIlllIlll[11];
            if (lIIlllIlIlll(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIlllIlll[1]];
                iArr10[lIlllIlll[0]] = lIlllIlll[11];
            }
            int[] iArr11 = new int[lIlllIlll[1]];
            iArr11[lIlllIlll[0]] = lIlllIlll[8];
            if (lIIlllIlIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlllIlll[1]];
                iArr12[lIlllIlll[0]] = lIlllIlll[8];
            }
            int[] iArr13 = new int[lIlllIlll[1]];
            iArr13[lIlllIlll[0]] = lIlllIlll[26];
            if (lIIlllIlIlIl(Inventory.contains(iArr13) ? 1 : 0)) {
                ?? r0 = lIlllIlll[1];
                "".length();
                return "   ".length() < 0 ? ("  ".length() ^ (36 ^ 58)) & (((45 ^ 12) ^ (4 ^ 57)) ^ (-" ".length())) : r0;
            }
            return lIlllIlll[0];
        } else if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[7]) && lIIlllIlllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlllIlll[41]) && lIIlllIlIllI(Skills.getLevel(Skill.DEFENCE), lIlllIlll[36])) {
            int[] iArr14 = new int[lIlllIlll[1]];
            iArr14[lIlllIlll[0]] = lIlllIlll[9];
            if (lIIlllIlIlll(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlllIlll[1]];
                iArr15[lIlllIlll[0]] = lIlllIlll[9];
            }
            int[] iArr16 = new int[lIlllIlll[1]];
            iArr16[lIlllIlll[0]] = lIlllIlll[19];
            if (lIIlllIlIlll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIlllIlll[1]];
                iArr17[lIlllIlll[0]] = lIlllIlll[19];
            }
            int[] iArr18 = new int[lIlllIlll[1]];
            iArr18[lIlllIlll[0]] = lIlllIlll[18];
            if (lIIlllIlIlll(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlllIlll[1]];
                iArr19[lIlllIlll[0]] = lIlllIlll[18];
            }
            int[] iArr20 = new int[lIlllIlll[1]];
            iArr20[lIlllIlll[0]] = lIlllIlll[20];
            if (lIIlllIlIlll(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIlllIlll[1]];
                iArr21[lIlllIlll[0]] = lIlllIlll[20];
            }
            int[] iArr22 = new int[lIlllIlll[1]];
            iArr22[lIlllIlll[0]] = lIlllIlll[11];
            if (lIIlllIlIlll(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIlllIlll[1]];
                iArr23[lIlllIlll[0]] = lIlllIlll[11];
            }
            int[] iArr24 = new int[lIlllIlll[1]];
            iArr24[lIlllIlll[0]] = lIlllIlll[8];
            if (lIIlllIlIlll(Inventory.contains(iArr24) ? 1 : 0)) {
                int[] iArr25 = new int[lIlllIlll[1]];
                iArr25[lIlllIlll[0]] = lIlllIlll[8];
            }
            int[] iArr26 = new int[lIlllIlll[1]];
            iArr26[lIlllIlll[0]] = lIlllIlll[26];
            if (lIIlllIlIlIl(Inventory.contains(iArr26) ? 1 : 0)) {
                ?? r02 = lIlllIlll[1];
                "".length();
                return ((218 ^ 132) ^ (74 ^ 17)) <= 0 ? ((124 ^ 28) ^ "   ".length()) & (((((212 + 24) - 224) + 220) ^ (((62 + 90) - 60) + 47)) ^ (-" ".length())) : r02;
            }
            return lIlllIlll[0];
        } else if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[27]) && lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
            int[] iArr27 = new int[lIlllIlll[1]];
            iArr27[lIlllIlll[0]] = lIlllIlll[17];
            if (lIIlllIlIlll(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[lIlllIlll[1]];
                iArr28[lIlllIlll[0]] = lIlllIlll[17];
            }
            int[] iArr29 = new int[lIlllIlll[1]];
            iArr29[lIlllIlll[0]] = lIlllIlll[19];
            if (lIIlllIlIlll(Inventory.contains(iArr29) ? 1 : 0)) {
                int[] iArr30 = new int[lIlllIlll[1]];
                iArr30[lIlllIlll[0]] = lIlllIlll[19];
            }
            int[] iArr31 = new int[lIlllIlll[1]];
            iArr31[lIlllIlll[0]] = lIlllIlll[18];
            if (lIIlllIlIlll(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lIlllIlll[1]];
                iArr32[lIlllIlll[0]] = lIlllIlll[18];
            }
            int[] iArr33 = new int[lIlllIlll[1]];
            iArr33[lIlllIlll[0]] = lIlllIlll[20];
            if (lIIlllIlIlll(Inventory.contains(iArr33) ? 1 : 0)) {
                int[] iArr34 = new int[lIlllIlll[1]];
                iArr34[lIlllIlll[0]] = lIlllIlll[20];
            }
            int[] iArr35 = new int[lIlllIlll[1]];
            iArr35[lIlllIlll[0]] = lIlllIlll[16];
            if (lIIlllIlIlll(Inventory.contains(iArr35) ? 1 : 0)) {
                int[] iArr36 = new int[lIlllIlll[1]];
                iArr36[lIlllIlll[0]] = lIlllIlll[16];
            }
            int[] iArr37 = new int[lIlllIlll[1]];
            iArr37[lIlllIlll[0]] = lIlllIlll[26];
            if (lIIlllIlIlIl(Inventory.contains(iArr37) ? 1 : 0)) {
                ?? r03 = lIlllIlll[1];
                "".length();
                return (((147 ^ 135) ^ (159 ^ 130)) & (((176 ^ 128) ^ (112 ^ 73)) ^ (-" ".length()))) >= " ".length() ? ((((172 + 32) - 21) + 5) ^ (((103 + 82) - 26) + 9)) & (((146 ^ 165) ^ (126 ^ 93)) ^ (-" ".length())) : r03;
            }
            return lIlllIlll[0];
        } else {
            int[] iArr38 = new int[lIlllIlll[1]];
            iArr38[lIlllIlll[0]] = lIlllIlll[17];
            if (lIIlllIlIlll(Inventory.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[lIlllIlll[1]];
                iArr39[lIlllIlll[0]] = lIlllIlll[17];
            }
            int[] iArr40 = new int[lIlllIlll[1]];
            iArr40[lIlllIlll[0]] = lIlllIlll[19];
            if (lIIlllIlIlll(Inventory.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lIlllIlll[1]];
                iArr41[lIlllIlll[0]] = lIlllIlll[19];
            }
            int[] iArr42 = new int[lIlllIlll[1]];
            iArr42[lIlllIlll[0]] = lIlllIlll[18];
            if (lIIlllIlIlll(Inventory.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[lIlllIlll[1]];
                iArr43[lIlllIlll[0]] = lIlllIlll[18];
            }
            int[] iArr44 = new int[lIlllIlll[1]];
            iArr44[lIlllIlll[0]] = lIlllIlll[20];
            if (lIIlllIlIlll(Inventory.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[lIlllIlll[1]];
                iArr45[lIlllIlll[0]] = lIlllIlll[20];
            }
            int[] iArr46 = new int[lIlllIlll[1]];
            iArr46[lIlllIlll[0]] = lIlllIlll[15];
            if (lIIlllIlIlll(Inventory.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[lIlllIlll[1]];
                iArr47[lIlllIlll[0]] = lIlllIlll[15];
            }
            int[] iArr48 = new int[lIlllIlll[1]];
            iArr48[lIlllIlll[0]] = lIlllIlll[12];
            if (lIIlllIlIlll(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[lIlllIlll[1]];
                iArr49[lIlllIlll[0]] = lIlllIlll[12];
            }
            int[] iArr50 = new int[lIlllIlll[1]];
            iArr50[lIlllIlll[0]] = lIlllIlll[13];
            if (lIIlllIlIlll(Inventory.contains(iArr50) ? 1 : 0)) {
                int[] iArr51 = new int[lIlllIlll[1]];
                iArr51[lIlllIlll[0]] = lIlllIlll[13];
            }
            int[] iArr52 = new int[lIlllIlll[1]];
            iArr52[lIlllIlll[0]] = lIlllIlll[14];
            if (lIIlllIlIlll(Inventory.contains(iArr52) ? 1 : 0)) {
                int[] iArr53 = new int[lIlllIlll[1]];
                iArr53[lIlllIlll[0]] = lIlllIlll[14];
            }
            int[] iArr54 = new int[lIlllIlll[1]];
            iArr54[lIlllIlll[0]] = lIlllIlll[16];
            if (lIIlllIlIlll(Inventory.contains(iArr54) ? 1 : 0)) {
                int[] iArr55 = new int[lIlllIlll[1]];
                iArr55[lIlllIlll[0]] = lIlllIlll[16];
            }
            int[] iArr56 = new int[lIlllIlll[1]];
            iArr56[lIlllIlll[0]] = lIlllIlll[26];
            if (lIIlllIlIlIl(Inventory.contains(iArr56) ? 1 : 0)) {
                ?? r04 = lIlllIlll[1];
                "".length();
                return 0 != 0 ? ((163 ^ 128) ^ (193 ^ 164)) & (((((94 + 102) - (-49)) + 5) ^ (((130 + 96) - 137) + 99)) ^ (-" ".length())) : r04;
            }
            return lIlllIlll[0];
        }
    }

    private static boolean lIIlllIllIIl(int i) {
        return i > 0;
    }

    private static String lIIlllIIIllI(String llIIIllIllIlIl, String llIIIllIllIlII) {
        try {
            SecretKeySpec llIIIllIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIllIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlll[2], llIIIllIlllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIllIllIllI) {
            llIIIllIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlllIlIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlllIlllII(int i, int i2) {
        return i == i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            ap();
            "".length();
            if (0 != 0) {
                return (168 ^ 183) & ((134 ^ 153) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlllIlll[54];
    }

    private static String lIIlllIIIlll(String llIIIlllIllIlI, String llIIIlllIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlllIllIIl.getBytes(StandardCharsets.UTF_8)), lIlllIlll[33]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlllIllIll) {
            llIIIlllIllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0353, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[7]) && lIIlllIlllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlllIlll[41]) && lIIlllIllIlI(Skills.getLevel(Skill.DEFENCE), lIlllIlll[36])) {
            int[] iArr = new int[lIlllIlll[1]];
            iArr[lIlllIlll[0]] = lIlllIlll[9];
            if (lIIlllIlIlIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlllIlll[1]];
                iArr2[lIlllIlll[0]] = lIlllIlll[10];
                if (lIIlllIlIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIlllIlll[1]];
                    iArr3[lIlllIlll[0]] = lIlllIlll[18];
                    if (lIIlllIlIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIlllIlll[1]];
                        iArr4[lIlllIlll[0]] = lIlllIlll[20];
                        if (lIIlllIlIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIlllIlll[1]];
                            iArr5[lIlllIlll[0]] = lIlllIlll[11];
                            if (lIIlllIlIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIlllIlll[1]];
                                iArr6[lIlllIlll[0]] = lIlllIlll[8];
                                if (lIIlllIlIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIlllIlll[1]];
                                    iArr7[lIlllIlll[0]] = lIlllIlll[26];
                                    if (lIIlllIlIlIl(Bank.contains(iArr7) ? 1 : 0)) {
                                        ?? r0 = lIlllIlll[1];
                                        "".length();
                                        return (-"  ".length()) > 0 ? (!true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lIlllIlll[0];
        } else if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[27]) && lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
            int[] iArr8 = new int[lIlllIlll[1]];
            iArr8[lIlllIlll[0]] = lIlllIlll[17];
            if (lIIlllIlIlIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlllIlll[1]];
                iArr9[lIlllIlll[0]] = lIlllIlll[19];
                if (lIIlllIlIlIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlllIlll[1]];
                    iArr10[lIlllIlll[0]] = lIlllIlll[18];
                    if (lIIlllIlIlIl(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIlllIlll[1]];
                        iArr11[lIlllIlll[0]] = lIlllIlll[20];
                        if (lIIlllIlIlIl(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIlllIlll[1]];
                            iArr12[lIlllIlll[0]] = lIlllIlll[16];
                            if (lIIlllIlIlIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIlllIlll[1]];
                                iArr13[lIlllIlll[0]] = lIlllIlll[26];
                                if (lIIlllIlIlIl(Bank.contains(iArr13) ? 1 : 0)) {
                                    ?? r02 = lIlllIlll[1];
                                    "".length();
                                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                                }
                            }
                        }
                    }
                }
            }
            return lIlllIlll[0];
        } else {
            int[] iArr14 = new int[lIlllIlll[1]];
            iArr14[lIlllIlll[0]] = lIlllIlll[17];
            if (lIIlllIlIlIl(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlllIlll[1]];
                iArr15[lIlllIlll[0]] = lIlllIlll[19];
                if (lIIlllIlIlIl(Bank.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIlllIlll[1]];
                    iArr16[lIlllIlll[0]] = lIlllIlll[18];
                    if (lIIlllIlIlIl(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIlllIlll[1]];
                        iArr17[lIlllIlll[0]] = lIlllIlll[20];
                        if (lIIlllIlIlIl(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIlllIlll[1]];
                            iArr18[lIlllIlll[0]] = lIlllIlll[12];
                            if (lIIlllIlIlIl(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lIlllIlll[1]];
                                iArr19[lIlllIlll[0]] = lIlllIlll[23];
                                if (lIIlllIlIlIl(Bank.contains(iArr19) ? 1 : 0)) {
                                    int[] iArr20 = new int[lIlllIlll[1]];
                                    iArr20[lIlllIlll[0]] = lIlllIlll[13];
                                    if (lIIlllIlIlIl(Bank.contains(iArr20) ? 1 : 0)) {
                                        int[] iArr21 = new int[lIlllIlll[1]];
                                        iArr21[lIlllIlll[0]] = lIlllIlll[14];
                                        if (lIIlllIlIlIl(Bank.contains(iArr21) ? 1 : 0)) {
                                            int[] iArr22 = new int[lIlllIlll[1]];
                                            iArr22[lIlllIlll[0]] = lIlllIlll[15];
                                            if (lIIlllIlIlll(Bank.contains(iArr22) ? 1 : 0)) {
                                                int[] iArr23 = new int[lIlllIlll[1]];
                                                iArr23[lIlllIlll[0]] = lIlllIlll[15];
                                            }
                                            int[] iArr24 = new int[lIlllIlll[1]];
                                            iArr24[lIlllIlll[0]] = lIlllIlll[16];
                                            if (lIIlllIlIlIl(Bank.contains(iArr24) ? 1 : 0)) {
                                                int[] iArr25 = new int[lIlllIlll[1]];
                                                iArr25[lIlllIlll[0]] = lIlllIlll[26];
                                                if (lIIlllIlIlIl(Bank.contains(iArr25) ? 1 : 0)) {
                                                    ?? r03 = lIlllIlll[1];
                                                    "".length();
                                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lIlllIlll[0];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        if (lIIlllIlIlIl(net.unethicalite.api.items.Equipment.contains((v0) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return l(v0);
        }) ? 1 : 0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void aq() {
        int[] iArr = new int[lIlllIlll[1]];
        iArr[lIlllIlll[0]] = lIlllIlll[28];
        if (lIIlllIlIlll(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlllIlll[1]];
            iArr2[lIlllIlll[0]] = lIlllIlll[29];
            if (lIIlllIlIlll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlllIlll[1]];
                iArr3[lIlllIlll[0]] = lIlllIlll[16];
                if (lIIlllIlIlll(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIlllIlll[1]];
                    iArr4[lIlllIlll[0]] = lIlllIlll[11];
                    if (lIIlllIlIlll(Equipment.contains(iArr4) ? 1 : 0)) {
                    }
                }
            }
        }
        if (lIIlllIllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[27])) {
            int[] iArr5 = new int[lIlllIlll[1]];
            iArr5[lIlllIlll[0]] = lIlllIlll[28];
            if (lIIlllIlIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlllIlll[1]];
                iArr6[lIlllIlll[0]] = lIlllIlll[28];
                Inventory.getFirst(iArr6).interact(lIlllIllI[lIlllIlll[30]]);
            }
            int[] iArr7 = new int[lIlllIlll[1]];
            iArr7[lIlllIlll[0]] = lIlllIlll[12];
            if (lIIlllIlIlIl(Inventory.contains(iArr7) ? 1 : 0) && lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[5])) {
                C0004e.l(lIlllIlll[12]);
            }
            int[] iArr8 = new int[lIlllIlll[1]];
            iArr8[lIlllIlll[0]] = lIlllIlll[13];
            if (lIIlllIlIlIl(Inventory.contains(iArr8) ? 1 : 0) && lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[5]) && lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[31])) {
                C0004e.l(lIlllIlll[13]);
            }
            int[] iArr9 = new int[lIlllIlll[1]];
            iArr9[lIlllIlll[0]] = lIlllIlll[14];
            if (lIIlllIlIlIl(Inventory.contains(iArr9) ? 1 : 0) && lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[31])) {
                C0004e.l(lIlllIlll[14]);
            }
            int[] iArr10 = new int[lIlllIlll[1]];
            iArr10[lIlllIlll[0]] = lIlllIlll[15];
            if (lIIlllIlIlIl(Inventory.contains(iArr10) ? 1 : 0)) {
                C0004e.l(lIlllIlll[15]);
            }
        }
        if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[31])) {
            int[] iArr11 = new int[lIlllIlll[1]];
            iArr11[lIlllIlll[0]] = lIlllIlll[18];
            if (lIIlllIlIlIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlllIlll[1]];
                iArr12[lIlllIlll[0]] = lIlllIlll[18];
                Inventory.getFirst(iArr12).interact(lIlllIllI[lIlllIlll[32]]);
            }
        }
        if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[27])) {
            int[] iArr13 = new int[lIlllIlll[1]];
            iArr13[lIlllIlll[0]] = lIlllIlll[29];
            if (lIIlllIlIlIl(Inventory.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIlllIlll[1]];
                iArr14[lIlllIlll[0]] = lIlllIlll[29];
                Inventory.getFirst(iArr14).interact(lIlllIllI[lIlllIlll[33]]);
            }
            int[] iArr15 = new int[lIlllIlll[1]];
            iArr15[lIlllIlll[0]] = lIlllIlll[34];
            if (lIIlllIlIlIl(Inventory.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIlllIlll[1]];
                iArr16[lIlllIlll[0]] = lIlllIlll[34];
                Inventory.getFirst(iArr16).interact(lIlllIllI[lIlllIlll[35]]);
            }
            int[] iArr17 = new int[lIlllIlll[1]];
            iArr17[lIlllIlll[0]] = lIlllIlll[16];
            if (lIIlllIlIlIl(Inventory.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[lIlllIlll[1]];
                iArr18[lIlllIlll[0]] = lIlllIlll[16];
                Inventory.getFirst(iArr18).interact(lIlllIllI[lIlllIlll[24]]);
            }
        }
        if (lIIlllIlIllI(Skills.getLevel(Skill.DEFENCE), lIlllIlll[36])) {
            int[] iArr19 = new int[lIlllIlll[1]];
            iArr19[lIlllIlll[0]] = lIlllIlll[19];
            if (lIIlllIlIlIl(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIlllIlll[1]];
                iArr20[lIlllIlll[0]] = lIlllIlll[19];
                Inventory.getFirst(iArr20).interact(lIlllIllI[lIlllIlll[37]]);
            }
        }
        if (lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
            int[] iArr21 = new int[lIlllIlll[1]];
            iArr21[lIlllIlll[0]] = lIlllIlll[17];
            if (lIIlllIlIlIl(Inventory.contains(iArr21) ? 1 : 0)) {
                int[] iArr22 = new int[lIlllIlll[1]];
                iArr22[lIlllIlll[0]] = lIlllIlll[17];
                Inventory.getFirst(iArr22).interact(lIlllIllI[lIlllIlll[38]]);
            }
        }
        int[] iArr23 = new int[lIlllIlll[1]];
        iArr23[lIlllIlll[0]] = lIlllIlll[20];
        if (lIIlllIlIlIl(Inventory.contains(iArr23) ? 1 : 0)) {
            int[] iArr24 = new int[lIlllIlll[1]];
            iArr24[lIlllIlll[0]] = lIlllIlll[20];
            Inventory.getFirst(iArr24).interact(lIlllIllI[lIlllIlll[39]]);
        }
        int[] iArr25 = new int[lIlllIlll[1]];
        iArr25[lIlllIlll[0]] = lIlllIlll[21];
        if (lIIlllIlIlIl(Inventory.contains(iArr25) ? 1 : 0)) {
            int[] iArr26 = new int[lIlllIlll[1]];
            iArr26[lIlllIlll[0]] = lIlllIlll[21];
            Inventory.getFirst(iArr26).interact(lIlllIllI[lIlllIlll[40]]);
        }
        if (lIIlllIlllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIlllIlll[41])) {
            int[] iArr27 = new int[lIlllIlll[1]];
            iArr27[lIlllIlll[0]] = lIlllIlll[8];
            if (lIIlllIlIlIl(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[lIlllIlll[1]];
                iArr28[lIlllIlll[0]] = lIlllIlll[8];
                if (lIIlllIlIlll(Equipment.contains(iArr28) ? 1 : 0)) {
                    int[] iArr29 = new int[lIlllIlll[1]];
                    iArr29[lIlllIlll[0]] = lIlllIlll[8];
                    Inventory.getFirst(iArr29).interact(lIlllIllI[lIlllIlll[42]]);
                }
            }
            if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
                int[] iArr30 = new int[lIlllIlll[1]];
                iArr30[lIlllIlll[0]] = lIlllIlll[9];
                if (lIIlllIlIlIl(Inventory.contains(iArr30) ? 1 : 0)) {
                    int[] iArr31 = new int[lIlllIlll[1]];
                    iArr31[lIlllIlll[0]] = lIlllIlll[9];
                    if (lIIlllIlIlll(Equipment.contains(iArr31) ? 1 : 0)) {
                        int[] iArr32 = new int[lIlllIlll[1]];
                        iArr32[lIlllIlll[0]] = lIlllIlll[9];
                        Inventory.getFirst(iArr32).interact(lIlllIllI[lIlllIlll[43]]);
                    }
                }
            }
            if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[7]) && lIIlllIllIlI(Skills.getLevel(Skill.DEFENCE), lIlllIlll[36])) {
                int[] iArr33 = new int[lIlllIlll[1]];
                iArr33[lIlllIlll[0]] = lIlllIlll[10];
                if (lIIlllIlIlIl(Inventory.contains(iArr33) ? 1 : 0)) {
                    int[] iArr34 = new int[lIlllIlll[1]];
                    iArr34[lIlllIlll[0]] = lIlllIlll[10];
                    if (lIIlllIlIlll(Equipment.contains(iArr34) ? 1 : 0)) {
                        int[] iArr35 = new int[lIlllIlll[1]];
                        iArr35[lIlllIlll[0]] = lIlllIlll[10];
                        Inventory.getFirst(iArr35).interact(lIlllIllI[lIlllIlll[44]]);
                    }
                }
            }
            if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
                int[] iArr36 = new int[lIlllIlll[1]];
                iArr36[lIlllIlll[0]] = lIlllIlll[11];
                if (lIIlllIlIlIl(Inventory.contains(iArr36) ? 1 : 0)) {
                    int[] iArr37 = new int[lIlllIlll[1]];
                    iArr37[lIlllIlll[0]] = lIlllIlll[11];
                    Inventory.getFirst(iArr37).interact(lIlllIllI[lIlllIlll[45]]);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0121, code lost:
        if (lIIlllIlIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0012m.lIlllIlll[47]) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04b8, code lost:
        if (lIIlllIlIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0012m.lIlllIlll[24]) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0501  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        if (lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[27])) {
            int[] iArr2 = new int[lIlllIlll[1]];
            iArr2[lIlllIlll[0]] = lIlllIlll[12];
            if (lIIlllIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlll[12], lIlllIlll[1], lIlllIlll[46]));
                "".length();
            }
            int[] iArr3 = new int[lIlllIlll[1]];
            iArr3[lIlllIlll[0]] = lIlllIlll[13];
            if (lIIlllIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlll[13], lIlllIlll[1], lIlllIlll[46]));
                "".length();
            }
            int[] iArr4 = new int[lIlllIlll[1]];
            iArr4[lIlllIlll[0]] = lIlllIlll[14];
            if (lIIlllIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlll[14], lIlllIlll[1], lIlllIlll[46]));
                "".length();
            }
            int[] iArr5 = new int[lIlllIlll[1]];
            iArr5[lIlllIlll[0]] = lIlllIlll[15];
            if (lIIlllIlIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlllIlll[1]];
                iArr6[lIlllIlll[0]] = lIlllIlll[15];
            }
            bv.add(new C0003d(lIlllIlll[15], lIlllIlll[48], lIlllIlll[35]));
            "".length();
        }
        int[] iArr7 = new int[lIlllIlll[1]];
        iArr7[lIlllIlll[0]] = lIlllIlll[18];
        if (lIIlllIlIlll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlll[18], lIlllIlll[1], lIlllIlll[49]));
            "".length();
        }
        int[] iArr8 = new int[lIlllIlll[1]];
        iArr8[lIlllIlll[0]] = lIlllIlll[19];
        if (lIIlllIlIlll(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlll[19], lIlllIlll[1], lIlllIlll[49]));
            "".length();
        }
        int[] iArr9 = new int[lIlllIlll[1]];
        iArr9[lIlllIlll[0]] = lIlllIlll[17];
        if (lIIlllIlIlll(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlll[17], lIlllIlll[1], lIlllIlll[49]));
            "".length();
        }
        int[] iArr10 = new int[lIlllIlll[1]];
        iArr10[lIlllIlll[0]] = lIlllIlll[20];
        if (lIIlllIlIlll(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlll[20], lIlllIlll[1], lIlllIlll[50]));
            "".length();
        }
        if (lIIlllIlIllI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
            int[] iArr11 = new int[lIlllIlll[1]];
            iArr11[lIlllIlll[0]] = lIlllIlll[16];
            if (lIIlllIlIlll(Bank.contains(iArr11) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlll[16], lIlllIlll[51], lIlllIlll[42]));
                "".length();
            }
        }
        int[] iArr12 = new int[lIlllIlll[1]];
        iArr12[lIlllIlll[0]] = lIlllIlll[9];
        if (lIIlllIlIlll(Bank.contains(iArr12) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlll[9], lIlllIlll[1], lIlllIlll[52]));
            "".length();
        }
        int[] iArr13 = new int[lIlllIlll[1]];
        iArr13[lIlllIlll[0]] = lIlllIlll[10];
        if (lIIlllIlIlll(Bank.contains(iArr13) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlll[10], lIlllIlll[1], lIlllIlll[52]));
            "".length();
        }
        if (lIIlllIllIlI(Skills.getLevel(Skill.RANGED), lIlllIlll[7])) {
            int[] iArr14 = new int[lIlllIlll[1]];
            iArr14[lIlllIlll[0]] = lIlllIlll[11];
            if (lIIlllIlIlll(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0003d(lIlllIlll[11], lIlllIlll[48], lIlllIlll[53]));
                "".length();
            }
        }
        int[] iArr15 = new int[lIlllIlll[1]];
        iArr15[lIlllIlll[0]] = lIlllIlll[22];
        if (lIIlllIlIlll(Bank.contains(iArr15) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlll[22], lIlllIlll[1], C0008i.bq));
            "".length();
        }
        int[] iArr16 = new int[lIlllIlll[1]];
        iArr16[lIlllIlll[0]] = lIlllIlll[26];
        if (lIIlllIlIlll(Bank.contains(iArr16) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlll[26], lIlllIlll[54], lIlllIlll[55]));
            "".length();
        }
        if (lIIlllIlIlll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlllIllI[lIlllIlll[31]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIlllIlll[56], lIlllIlll[5], lIlllIlll[57]));
            "".length();
        }
        int[] iArr17 = new int[lIlllIlll[1]];
        iArr17[lIlllIlll[0]] = lIlllIlll[58];
        if (lIIlllIlIlIl(Bank.contains(iArr17) ? 1 : 0)) {
            int[] iArr18 = new int[lIlllIlll[1]];
            iArr18[lIlllIlll[0]] = lIlllIlll[58];
            if (lIIlllIlIlIl(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIlllIlll[1]];
                iArr19[lIlllIlll[0]] = lIlllIlll[58];
            }
            iArr = new int[lIlllIlll[1]];
            iArr[lIlllIlll[0]] = lIlllIlll[23];
            if (lIIlllIlIlIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr20 = new int[lIlllIlll[1]];
                iArr20[lIlllIlll[0]] = lIlllIlll[23];
                if (!lIIlllIlIlIl(Bank.contains(iArr20) ? 1 : 0)) {
                    return;
                }
                int[] iArr21 = new int[lIlllIlll[1]];
                iArr21[lIlllIlll[0]] = lIlllIlll[23];
                if (!lIIlllIlIllI(Bank.getFirst(iArr21).getQuantity(), lIlllIlll[24])) {
                    return;
                }
            }
            bv.add(new C0003d(lIlllIlll[23], lIlllIlll[24], lIlllIlll[59]));
            "".length();
        }
        bv.add(new C0003d(lIlllIlll[58], lIlllIlll[24], lIlllIlll[59]));
        "".length();
        iArr = new int[lIlllIlll[1]];
        iArr[lIlllIlll[0]] = lIlllIlll[23];
        if (lIIlllIlIlIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIlllIlll[23], lIlllIlll[24], lIlllIlll[59]));
        "".length();
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlllIllI[lIlllIlll[60]];
    }

    private static boolean lIIlllIllIlI(int i, int i2) {
        return i >= i2;
    }
}
