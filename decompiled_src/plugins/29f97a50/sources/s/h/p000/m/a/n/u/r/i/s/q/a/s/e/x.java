package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Looting", priority = 20, blocking = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.x  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/x.class */
public class x extends Task {
    public static final /* synthetic */ List<String> az;
    private static /* synthetic */ int[] lIIllIIIlllII;
    private final /* synthetic */ SquireShamansPlugin aD;
    private final /* synthetic */ SquireShamanConfig aB;
    private final /* synthetic */ c aA;
    private final /* synthetic */ C0000a aC;
    private static final /* synthetic */ Logger ay;
    private static /* synthetic */ String[] lIIllIIIllIll;

    private static void lIlIllllIlIllII() {
        lIIllIIIlllII = new int[141];
        lIIllIIIlllII[0] = (11 ^ 79) & ((233 ^ 173) ^ (-1));
        lIIllIIIlllII[1] = " ".length();
        lIIllIIIlllII[2] = "  ".length();
        lIIllIIIlllII[3] = "   ".length();
        lIIllIIIlllII[4] = 41 ^ 45;
        lIIllIIIlllII[5] = ((23 + 21) - (-34)) + 57;
        lIIllIIIlllII[6] = 53 ^ 48;
        lIIllIIIlllII[7] = (27 ^ 28) ^ " ".length();
        lIIllIIIlllII[8] = (128 ^ 145) ^ (27 ^ 13);
        lIIllIIIlllII[9] = (218 ^ 132) ^ (249 ^ 175);
        lIIllIIIlllII[10] = (((76 + 113) - 161) + 108) ^ (((38 + 42) - 64) + 113);
        lIIllIIIlllII[11] = (((49 + 13) - 46) + 120) ^ (((82 + 4) - 33) + 77);
        lIIllIIIlllII[12] = (133 ^ 156) ^ (14 ^ 28);
        lIIllIIIlllII[13] = (((35 + 52) - 49) + 89) ^ (220 ^ 175);
        lIIllIIIlllII[14] = 58 ^ 55;
        lIIllIIIlllII[15] = 136 ^ 134;
        lIIllIIIlllII[16] = 64 ^ 79;
        lIIllIIIlllII[17] = 141 ^ 157;
        lIIllIIIlllII[18] = 180 ^ 165;
        lIIllIIIlllII[19] = 111 ^ 125;
        lIIllIIIlllII[20] = 101 ^ 118;
        lIIllIIIlllII[21] = 44 ^ 56;
        lIIllIIIlllII[22] = 97 ^ 116;
        lIIllIIIlllII[23] = (230 ^ 139) ^ (197 ^ 190);
        lIIllIIIlllII[24] = (((175 + 117) - 273) + 165) ^ (((159 + 10) - 17) + 23);
        lIIllIIIlllII[25] = (((177 + 141) - 144) + 4) ^ (((54 + 13) - 37) + 140);
        lIIllIIIlllII[26] = 100 ^ 125;
        lIIllIIIlllII[27] = (213 ^ 147) ^ (210 ^ 142);
        lIIllIIIlllII[28] = (59 ^ 102) ^ (124 ^ 58);
        lIIllIIIlllII[29] = (((96 + 24) - 5) + 71) ^ (((80 + 109) - 47) + 24);
        lIIllIIIlllII[30] = (((123 + 39) - 43) + 103) ^ (((89 + 35) - 108) + 179);
        lIIllIIIlllII[31] = (((68 + 153) - 123) + 73) ^ (((94 + 161) - 215) + 141);
        lIIllIIIlllII[32] = 53 ^ 42;
        lIIllIIIlllII[33] = 16 ^ 48;
        lIIllIIIlllII[34] = 115 ^ 82;
        lIIllIIIlllII[35] = 135 ^ 165;
        lIIllIIIlllII[36] = 43 ^ 8;
        lIIllIIIlllII[37] = (54 ^ 83) ^ (46 ^ 111);
        lIIllIIIlllII[38] = 226 ^ 199;
        lIIllIIIlllII[39] = 231 ^ 193;
        lIIllIIIlllII[40] = (111 ^ 86) ^ (168 ^ 182);
        lIIllIIIlllII[41] = 97 ^ 73;
        lIIllIIIlllII[42] = 41 ^ 0;
        lIIllIIIlllII[43] = 128 ^ 170;
        lIIllIIIlllII[44] = (148 ^ 140) ^ (76 ^ 127);
        lIIllIIIlllII[45] = 174 ^ 130;
        lIIllIIIlllII[46] = (16 ^ 43) ^ (42 ^ 60);
        lIIllIIIlllII[47] = (58 ^ 1) ^ (51 ^ 38);
        lIIllIIIlllII[48] = (77 ^ 88) ^ (80 ^ 106);
        lIIllIIIlllII[49] = (((66 + 89) - 82) + 88) ^ (((85 + 8) - 28) + 80);
        lIIllIIIlllII[50] = (((75 + 74) - 140) + 164) ^ (((94 + 139) - 101) + 24);
        lIIllIIIlllII[51] = 147 ^ 161;
        lIIllIIIlllII[52] = 186 ^ 137;
        lIIllIIIlllII[53] = (96 ^ 32) ^ (110 ^ 26);
        lIIllIIIlllII[54] = (187 ^ 170) ^ (47 ^ 11);
        lIIllIIIlllII[55] = (8 ^ 117) ^ (42 ^ 97);
        lIIllIIIlllII[56] = 107 ^ 92;
        lIIllIIIlllII[57] = 169 ^ 145;
        lIIllIIIlllII[58] = (207 ^ 197) ^ (112 ^ 67);
        lIIllIIIlllII[59] = 128 ^ 186;
        lIIllIIIlllII[60] = 127 ^ 68;
        lIIllIIIlllII[61] = (109 ^ 68) ^ (150 ^ 131);
        lIIllIIIlllII[62] = 186 ^ 135;
        lIIllIIIlllII[63] = 93 ^ 99;
        lIIllIIIlllII[64] = (44 ^ 93) ^ (209 ^ 159);
        lIIllIIIlllII[65] = (136 ^ 161) ^ (236 ^ 133);
        lIIllIIIlllII[66] = (5 ^ 78) ^ (163 ^ 169);
        lIIllIIIlllII[67] = (((13 + 70) - (-86)) + 83) ^ (((14 + 117) - (-4)) + 55);
        lIIllIIIlllII[68] = (97 ^ 44) ^ (123 ^ 117);
        lIIllIIIlllII[69] = 104 ^ 44;
        lIIllIIIlllII[70] = 113 ^ 52;
        lIIllIIIlllII[71] = (((87 + 111) - 158) + 211) ^ (((177 + 78) - 165) + 99);
        lIIllIIIlllII[72] = 33 ^ 102;
        lIIllIIIlllII[73] = (167 ^ 185) ^ (95 ^ 9);
        lIIllIIIlllII[74] = 85 ^ 28;
        lIIllIIIlllII[75] = (((107 + 143) - 159) + 127) ^ (((96 + 106) - 142) + 84);
        lIIllIIIlllII[76] = 70 ^ 13;
        lIIllIIIlllII[77] = 75 ^ 7;
        lIIllIIIlllII[78] = 3 ^ 78;
        lIIllIIIlllII[79] = 37 ^ 107;
        lIIllIIIlllII[80] = 105 ^ 38;
        lIIllIIIlllII[81] = 8 ^ 88;
        lIIllIIIlllII[82] = (((31 + 76) - (-55)) + 37) ^ (((113 + 140) - 204) + 101);
        lIIllIIIlllII[83] = (2 ^ 126) ^ (95 ^ 113);
        lIIllIIIlllII[84] = 66 ^ 17;
        lIIllIIIlllII[85] = (14 ^ 56) ^ (239 ^ 141);
        lIIllIIIlllII[86] = 116 ^ 33;
        lIIllIIIlllII[87] = (186 ^ 166) ^ (242 ^ 184);
        lIIllIIIlllII[88] = 201 ^ 158;
        lIIllIIIlllII[89] = 109 ^ 53;
        lIIllIIIlllII[90] = (((81 + 8) - (-34)) + 84) ^ (((14 + 54) - (-70)) + 12);
        lIIllIIIlllII[91] = (162 ^ 145) ^ (254 ^ 151);
        lIIllIIIlllII[92] = 200 ^ 147;
        lIIllIIIlllII[93] = (17 ^ 20) ^ (251 ^ 162);
        lIIllIIIlllII[94] = (234 ^ 198) ^ (36 ^ 85);
        lIIllIIIlllII[95] = 93 ^ 3;
        lIIllIIIlllII[96] = 109 ^ 50;
        lIIllIIIlllII[97] = (212 ^ 134) ^ (184 ^ 138);
        lIIllIIIlllII[98] = (119 ^ 35) ^ (39 ^ 18);
        lIIllIIIlllII[99] = (((98 + 58) - (-49)) + 0) ^ (((39 + 125) - 158) + 169);
        lIIllIIIlllII[100] = 91 ^ 56;
        lIIllIIIlllII[101] = 218 ^ 190;
        lIIllIIIlllII[102] = 63 ^ 90;
        lIIllIIIlllII[103] = 164 ^ 194;
        lIIllIIIlllII[104] = (((36 + 64) - 15) + 117) ^ (((159 + 72) - 107) + 49);
        lIIllIIIlllII[105] = (232 ^ 170) ^ (14 ^ 36);
        lIIllIIIlllII[106] = (((190 + 30) - 3) + 13) ^ (((127 + 111) - 183) + 88);
        lIIllIIIlllII[107] = 8 ^ 98;
        lIIllIIIlllII[108] = (75 ^ 7) ^ (191 ^ 152);
        lIIllIIIlllII[109] = 94 ^ 50;
        lIIllIIIlllII[110] = (((130 + 12) - (-97)) + 11) ^ (((21 + 96) - (-30)) + 4);
        lIIllIIIlllII[111] = (25 ^ 88) ^ (30 ^ 49);
        lIIllIIIlllII[112] = (228 ^ 192) ^ (121 ^ 50);
        lIIllIIIlllII[113] = (85 ^ 37) ^ ((235 ^ 194) & ((147 ^ 186) ^ (-1)));
        lIIllIIIlllII[114] = (4 ^ 107) ^ (41 ^ 55);
        lIIllIIIlllII[115] = (((69 + 148) - 181) + 180) ^ (((108 + 5) - 79) + 136);
        lIIllIIIlllII[116] = (((40 + 135) - 89) + 132) ^ (((128 + 152) - 149) + 38);
        lIIllIIIlllII[117] = 84 ^ 32;
        lIIllIIIlllII[118] = 246 ^ 131;
        lIIllIIIlllII[119] = 65 ^ 55;
        lIIllIIIlllII[120] = (65 ^ 5) ^ (184 ^ 139);
        lIIllIIIlllII[121] = (((147 + 33) - 140) + 191) ^ (((101 + 157) - 126) + 27);
        lIIllIIIlllII[122] = 217 ^ 160;
        lIIllIIIlllII[123] = 206 ^ 180;
        lIIllIIIlllII[124] = (102 ^ 107) ^ (207 ^ 185);
        lIIllIIIlllII[125] = (((207 + 137) - 322) + 212) ^ (((111 + 21) - 114) + 132);
        lIIllIIIlllII[126] = (227 ^ 178) ^ (163 ^ 143);
        lIIllIIIlllII[127] = 226 ^ 156;
        lIIllIIIlllII[128] = ((67 + 48) - 72) + 84;
        lIIllIIIlllII[129] = ((110 + 54) - 51) + 15;
        lIIllIIIlllII[130] = ((86 + 121) - 194) + 116;
        lIIllIIIlllII[131] = ((83 + 36) - 86) + 97;
        lIIllIIIlllII[132] = (((250 ^ 183) + (243 ^ 165)) - (114 ^ 88)) + (155 ^ 145);
        lIIllIIIlllII[133] = (((((82 + 13) - 6) + 42) + (234 ^ 176)) - (99 ^ 63)) + "   ".length();
        lIIllIIIlllII[134] = (((3 ^ 56) + (164 ^ 190)) - (122 ^ 97)) + (24 ^ 83);
        lIIllIIIlllII[135] = ((69 + 97) - 93) + 61;
        lIIllIIIlllII[136] = (((80 ^ 61) + (154 ^ 132)) - (219 ^ 197)) + (155 ^ 128);
        lIIllIIIlllII[137] = ((92 + 4) - 25) + 66;
        lIIllIIIlllII[138] = ((18 + 68) - (-37)) + 15;
        lIIllIIIlllII[139] = ((43 + 137) - 94) + 53;
        lIIllIIIlllII[140] = ((70 + 132) - 175) + 113;
    }

    private static boolean lIlIllllIlIlllI(int i) {
        return i != 0;
    }

    private static boolean lIlIllllIlIllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
        if (lIlIllllIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
        if (lIlIllllIlIlllI(r0.isStackable() ? 1 : 0) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016a, code lost:
        if (lIlIllllIlIlllI(r5.aC.a(r0) ? 1 : 0) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0173, code lost:
        if (lIlIllllIlIllIl(net.unethicalite.api.items.Inventory.isFull() ? 1 : 0) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0176, code lost:
        r5.aC.g(s.h.p000.m.a.n.u.r.i.s.q.a.s.e.x.lIIllIIIlllII[1]);
        r0.interact(s.h.p000.m.a.n.u.r.i.s.q.a.s.e.x.lIIllIIIllIll[s.h.p000.m.a.n.u.r.i.s.q.a.s.e.x.lIIllIIIlllII[2]]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0196, code lost:
        return s.h.p000.m.a.n.u.r.i.s.q.a.s.e.x.lIIllIIIlllII[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0197, code lost:
        r5.aC.g(s.h.p000.m.a.n.u.r.i.s.q.a.s.e.x.lIIllIIIlllII[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a8, code lost:
        return s.h.p000.m.a.n.u.r.i.s.q.a.s.e.x.lIIllIIIlllII[0];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        Player local = Players.getLocal();
        if (lIlIllllIlIllIl(this.aB.room().x().contains(local) ? 1 : 0)) {
            this.aC.g(lIIllIIIlllII[0]);
            return lIIllIIIlllII[0];
        } else if (lIlIllllIlIlllI(this.aD.j() ? 1 : 0)) {
            return lIIllIIIlllII[0];
        } else {
            TileItem orElse = this.aC.k().orElse(null);
            if (lIlIllllIlIllll(orElse)) {
                this.aC.g(lIIllIIIlllII[0]);
                return lIIllIIIlllII[0];
            } else if (lIlIllllIlIllIl(this.aB.room().x().contains(orElse) ? 1 : 0)) {
                this.aC.g(lIIllIIIlllII[0]);
                return lIIllIIIlllII[0];
            } else {
                NPC attackableNPC = Combat.getAttackableNPC(npc -> {
                    if (lIlIllllIlIlllI(npc.getName().contains(lIIllIIIllIll[lIIllIIIlllII[4]]) ? 1 : 0) && lIlIllllIllIIlI(npc.getInteracting(), local)) {
                        ?? r0 = lIIllIIIlllII[1];
                        "".length();
                        return " ".length() == 0 ? ((64 ^ 126) ^ (22 ^ 110)) & (((180 ^ 129) ^ (49 ^ 66)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIIIlllII[0];
                });
                if (lIlIllllIllIIII(attackableNPC) && lIlIllllIlIlllI(attackableNPC.getWorldArea().contains(orElse) ? 1 : 0)) {
                    this.aC.g(lIIllIIIlllII[0]);
                    return lIIllIIIlllII[0];
                }
                if (lIlIllllIllIIIl(Prices.getItemPrice(orElse.getId()) * orElse.getQuantity(), this.aB.lootValue())) {
                    if (lIlIllllIlIlllI(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr = new int[lIIllIIIlllII[1]];
                        iArr[lIIllIIIlllII[0]] = orElse.getId();
                    }
                }
                this.aC.g(lIIllIIIlllII[1]);
                if (lIlIllllIlIlllI(Inventory.isFull() ? 1 : 0)) {
                    Inventory.getFirst(item -> {
                        String[] strArr = new String[lIIllIIIlllII[1]];
                        strArr[lIIllIIIlllII[0]] = lIIllIIIllIll[lIIllIIIlllII[3]];
                        return item.hasAction(strArr);
                    }).interact(lIIllIIIllIll[lIIllIIIlllII[0]]);
                    return lIIllIIIlllII[1];
                }
                orElse.interact(lIIllIIIllIll[lIIllIIIlllII[1]]);
                return lIIllIIIlllII[1];
            }
        }
    }

    private static boolean lIlIllllIllIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIllllIlIlIlI(String llllllllllllllIllllIIIlIllIIIlIl, String llllllllllllllIllllIIIlIllIIIlII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIlIllIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlIllIIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIIIlllII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIIlllII[2], llllllllllllllIllllIIIlIllIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIlIllIIIllI) {
            llllllllllllllIllllIIIlIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIllIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllllIlIllll(Object obj) {
        return obj == null;
    }

    private static void lIlIllllIlIlIll() {
        lIIllIIIllIll = new String[lIIllIIIlllII[140]];
        lIIllIIIllIll[lIIllIIIlllII[0]] = lIlIllllIlIlIII("izN0ET32k4M=", "rQPSJ");
        lIIllIIIllIll[lIIllIIIlllII[1]] = lIlIllllIlIlIII("EroAQUgzMIk=", "cIrFo");
        lIIllIIIllIll[lIIllIIIlllII[2]] = lIlIllllIlIlIIl("BCQFMg==", "PEnWC");
        lIIllIIIllIll[lIIllIIIlllII[3]] = lIlIllllIlIlIlI("2GMHDQZvqFE=", "AqrGE");
        lIIllIIIllIll[lIIllIIIlllII[4]] = lIlIllllIlIlIIl("AgoyIDUqDikv", "NcHAG");
        lIIllIIIllIll[lIIllIIIlllII[6]] = lIlIllllIlIlIlI("co/VIN2m6EjM0wHiuvqjWQ==", "bGiyW");
        lIIllIIIllIll[lIIllIIIlllII[7]] = lIlIllllIlIlIIl("MyYkNStRNTkmIAYn", "qTKTO");
        lIIllIIIllIll[lIIllIIIlllII[8]] = lIlIllllIlIlIII("V2BmjJCUtdNWun7xqf7ij0xlRO5HnjC8", "PVfSG");
        lIIllIIIllIll[lIIllIIIlllII[9]] = lIlIllllIlIlIIl("Fiw4HwNzLysfHz8oOR8KNSs=", "SMJkk");
        lIIllIIIllIll[lIIllIIIlllII[10]] = lIlIllllIlIlIII("fc2QtievV7HVmTpo2aVQGw==", "ecFNd");
        lIIllIIIllIll[lIIllIIIlllII[11]] = lIlIllllIlIlIIl("PywCM2gOMQ0/Jg82CC8=", "mYlVH");
        lIIllIIIllIll[lIIllIIIlllII[12]] = lIlIllllIlIlIIl("Chg/HHcvDCMRNjUANAs=", "XmQyW");
        lIIllIIIllIll[lIIllIIIlllII[13]] = lIlIllllIlIlIII("bXXr1QfoUOTwL7EiA0lSm4CNv79QTY4S", "SdbWf");
        lIIllIIIllIll[lIIllIIIlllII[14]] = lIlIllllIlIlIIl("OAA9KVoeADc=", "qrRGz");
        lIIllIIIllIll[lIIllIIIlllII[15]] = lIlIllllIlIlIlI("8cWu7lovIEA=", "xOKep");
        lIIllIIIllIll[lIIllIIIlllII[16]] = lIlIllllIlIlIIl("HQIJPjcqVwglJg==", "OwgWC");
        lIIllIIIllIll[lIIllIIIlllII[17]] = lIlIllllIlIlIIl("AB8aHQFnBgQFGTUA", "Gmspx");
        lIIllIIIllIll[lIIllIIIlllII[18]] = lIlIllllIlIlIlI("3fCMhN3s/oG8p/WyhxZ0gB0q9/v6JqGC", "JJHEw");
        lIIllIIIllIll[lIIllIIIlllII[19]] = lIlIllllIlIlIIl("MRkAKTxWBwgqMRcPECkg", "vkiDE");
        lIIllIIIllIll[lIIllIIIlllII[20]] = lIlIllllIlIlIII("wIsAenSQy1BTgMzcGaGYwA==", "iwiRS");
        lIIllIIIllIll[lIIllIIIlllII[21]] = lIlIllllIlIlIlI("GLCkp1Dvlsr+nEtbZzTSFQ==", "wwrly");
        lIIllIIIllIll[lIIllIIIlllII[22]] = lIlIllllIlIlIIl("Mj4sEQcTMSoODUEjKAQH", "aPMac");
        lIIllIIIllIll[lIIllIIIlllII[23]] = lIlIllllIlIlIIl("Bz8IAj88PFoCLjY0", "SPzqK");
        lIIllIIIllIll[lIIllIIIlllII[24]] = lIlIllllIlIlIIl("HjAAPiFzIhU3IA==", "SQpRD");
        lIIllIIIllIll[lIIllIIIlllII[25]] = lIlIllllIlIlIII("GR3wWsQ54xgf5GMZ9RnSpw==", "YIoeb");
        lIIllIIIllIll[lIIllIIIlllII[26]] = lIlIllllIlIlIII("1QYBLdr5ZW552rcipFSuLg==", "WvEby");
        lIIllIIIllIll[lIIllIIIlllII[27]] = lIlIllllIlIlIII("Ojw25q/01Ozdr3cciDZfQw==", "PsQTx");
        lIIllIIIllIll[lIIllIIIlllII[28]] = lIlIllllIlIlIlI("HmUQ8eXQhC9zOL/Njm2JUg==", "DqfHw");
        lIIllIIIllIll[lIIllIIIlllII[29]] = lIlIllllIlIlIII("+e/StkjWaupVvgtQC6oYrw==", "bapbZ");
        lIIllIIIllIll[lIIllIIIlllII[30]] = lIlIllllIlIlIlI("5MmecUGDawhro9nn7G3/kfSuvjUjfy6R", "QvDWD");
        lIIllIIIllIll[lIIllIIIlllII[31]] = lIlIllllIlIlIII("PcgYblqyFqa++1pj+0IdRd3OjZkqW08M", "CDFMl");
        lIIllIIIllIll[lIIllIIIlllII[32]] = lIlIllllIlIlIlI("aAxQU2Jgaq4NGfetwPwKFQ==", "SQVwz");
        lIIllIIIllIll[lIIllIIIlllII[33]] = lIlIllllIlIlIII("8ULAzw8YC9uWvSNetzqIAg==", "NkMUe");
        lIIllIIIllIll[lIIllIIIlllII[34]] = lIlIllllIlIlIII("liBPAG1G1jGGX4w23J7zUw==", "zqLyT");
        lIIllIIIllIll[lIIllIIIlllII[35]] = lIlIllllIlIlIII("/kCB7R4DL7TzShMewxZrqw==", "uYWLm");
        lIIllIIIllIll[lIIllIIIlllII[36]] = lIlIllllIlIlIII("B3JrzTbUTm/+HBEcuYEOPg==", "uwuDM");
        lIIllIIIllIll[lIIllIIIlllII[37]] = lIlIllllIlIlIIl("PgcEB1QaCQcRVB0OSxwRCw==", "rhkwt");
        lIIllIIIllIll[lIIllIIIlllII[38]] = lIlIllllIlIlIII("eJqC0fSKO8DRGrr8iClKETPd5gA8aFHD", "IGrGB");
        lIIllIIIllIll[lIIllIIIlllII[39]] = lIlIllllIlIlIlI("J3Xrb1bNWVs7WVANswL6q5V9pkN2mMwX", "swOmx");
        lIIllIIIllIll[lIIllIIIlllII[40]] = lIlIllllIlIlIIl("IC8dOTMXehExNQ==", "rZsPG");
        lIIllIIIllIll[lIIllIIIlllII[41]] = lIlIllllIlIlIlI("9apJgZ/SpqDBGdxTEvdXxQ==", "GASfr");
        lIIllIIIllIll[lIIllIIIlllII[42]] = lIlIllllIlIlIIl("ESEaCk1xPFQcGiwmEA==", "CTtom");
        lIIllIIIllIll[lIIllIIIlllII[43]] = lIlIllllIlIlIIl("IBEvE24QBTUCIhcFORM=", "rdAvN");
        lIIllIIIllIll[lIIllIIIlllII[44]] = lIlIllllIlIlIII("qrUf9fY0aouVYxmldW2lIg==", "yajvA");
        lIIllIIIllIll[lIIllIIIlllII[45]] = lIlIllllIlIlIIl("CxIAHE1rD04KGjYVCg==", "Ygnym");
        lIIllIIIllIll[lIIllIIIlllII[46]] = lIlIllllIlIlIlI("NvU4NUouWeDM3QZZqUgYbw==", "RjrRO");
        lIIllIIIllIll[lIIllIIIlllII[47]] = lIlIllllIlIlIIl("MS0pMWIQKWcnKgo9KzA=", "cXGTB");
        lIIllIIIllIll[lIIllIIIlllII[48]] = lIlIllllIlIlIlI("xlJIn1DWLVoNGYt+ZiJMzQ==", "crIVI");
        lIIllIIIllIll[lIIllIIIlllII[49]] = lIlIllllIlIlIlI("iwhvISqaSWzenysScWzwEQ==", "Bllmx");
        lIIllIIIllIll[lIIllIIIlllII[50]] = lIlIllllIlIlIIl("NRk8Cgo=", "vvUdy");
        lIIllIIIllIll[lIIllIIIlllII[51]] = lIlIllllIlIlIlI("ltImTq3O76JeZ1u/xU/Pmg==", "svWUp");
        lIIllIIIllIll[lIIllIIIlllII[52]] = lIlIllllIlIlIIl("OwEgMWcZHS0/JhER", "itNTG");
        lIIllIIIllIll[lIIllIIIlllII[53]] = lIlIllllIlIlIIl("JBg3F2cdAzAUIg==", "vmYrG");
        lIIllIIIllIll[lIIllIIIlllII[54]] = lIlIllllIlIlIIl("MAAgDXAJHDoNIwocKwQ0", "buNhP");
        lIIllIIIllIll[lIIllIIIlllII[55]] = lIlIllllIlIlIlI("ROHYk2Y6JNzfYwYMXnMRJA==", "nWLKr");
        lIIllIIIllIll[lIIllIIIlllII[56]] = lIlIllllIlIlIlI("IC7MTCTciBRaizqWeYmjnQ==", "TZvOW");
        lIIllIIIllIll[lIIllIIIlllII[57]] = lIlIllllIlIlIIl("AD4qCwg3di8LAid2Kw8INQ==", "SVCnd");
        lIIllIIIllIll[lIIllIIIlllII[58]] = lIlIllllIlIlIIl("LAITLzkGUAE4MwkC", "hprHV");
        lIIllIIIllIll[lIIllIIIlllII[59]] = lIlIllllIlIlIIl("HQgKJSFoAgAxOCcIDQ==", "HfiPU");
        lIIllIIIllIll[lIIllIIIlllII[60]] = lIlIllllIlIlIII("LlNDeH951G+dv3/ZkvS1IQ==", "aNKBV");
        lIIllIIIllIll[lIIllIIIlllII[61]] = lIlIllllIlIlIII("69aUaLbVKJgZWBkZyv+5Pg==", "ppmHG");
        lIIllIIIllIll[lIIllIIIlllII[62]] = lIlIllllIlIlIlI("tj8CSaeZ2HgWxnGO5w3Ziw==", "Tjkse");
        lIIllIIIllIll[lIIllIIIlllII[63]] = lIlIllllIlIlIIl("JwAYJEYDExEsRgQEES0=", "watIf");
        lIIllIIIllIll[lIIllIIIlllII[64]] = lIlIllllIlIlIIl("IgEVMigIUwQ8JA0SDDA=", "fstUG");
        lIIllIIIllIll[lIIllIIIlllII[65]] = lIlIllllIlIlIlI("jxhQW7mjkWU8Wt9qDbFcnQ==", "PbRNm");
        lIIllIIIllIll[lIIllIIIlllII[66]] = lIlIllllIlIlIlI("BVTSqacdyJ97HIaW87VOcpanrw+lZ3LI", "ZMLtK");
        lIIllIIIllIll[lIIllIIIlllII[67]] = lIlIllllIlIlIIl("LyoKOSgIKkMyKAgq", "zDcZG");
        lIIllIIIllIll[lIIllIIIlllII[68]] = lIlIllllIlIlIIl("OQ8gEzZMBTEHJQMPMBItAgQ=", "laCfB");
        lIIllIIIllIll[lIIllIIIlllII[69]] = lIlIllllIlIlIIl("DwEDIxxoAAQvFSwBCykKJg==", "HsjNe");
        lIIllIIIllIll[lIIllIIIlllII[70]] = lIlIllllIlIlIII("VNgWMHUdIjCaEPd0Vfs6Aw==", "jZBQq");
        lIIllIIIllIll[lIIllIIIlllII[71]] = lIlIllllIlIlIIl("AQMMNBgsAAM2Gw==", "BbbZw");
        lIIllIIIllIll[lIIllIIIlllII[72]] = lIlIllllIlIlIIl("IB4pPDIfDjU9JE0CNyo7CAo=", "mgZHW");
        lIIllIIIllIll[lIIllIIIlllII[73]] = lIlIllllIlIlIIl("PwotNDIFAjcrcw0KLSk=", "kkCNS");
        lIIllIIIllIll[lIIllIIIlllII[74]] = lIlIllllIlIlIlI("Sf704o++dSo4mWu1aOK+cg==", "kGVmM");
        lIIllIIIllIll[lIIllIIIlllII[75]] = lIlIllllIlIlIlI("RhdjRBfh5RtUo52UOYoZ/pMGGFYR1EOi", "anRSj");
        lIIllIIIllIll[lIIllIIIlllII[76]] = lIlIllllIlIlIIl("LRohMRtYGyw9Fw==", "xtBDo");
        lIIllIIIllIll[lIIllIIIlllII[77]] = lIlIllllIlIlIII("rUz3Ws8tez84uKYlSHiITw==", "wzmNq");
        lIIllIIIllIll[lIIllIIIlllII[78]] = lIlIllllIlIlIIl("BSMGIwcvcQ8lBCM0FSA=", "AQgDh");
        lIIllIIIllIll[lIIllIIIlllII[79]] = lIlIllllIlIlIII("O2MrT5wx5YigifVPHp+wCg==", "eEMrs");
        lIIllIIIllIll[lIIllIIIlllII[80]] = lIlIllllIlIlIlI("v5kzXUYB4al+nXgLqbZ8Lg==", "KBRfW");
        lIIllIIIllIll[lIIllIIIlllII[81]] = lIlIllllIlIlIIl("Nzk7NSEPNyI=", "cVZQG");
        lIIllIIIllIll[lIIllIIIlllII[82]] = lIlIllllIlIlIlI("rAQmE2TzCf36+aLQeumQaw==", "ruGSv");
        lIIllIIIllIll[lIIllIIIlllII[83]] = lIlIllllIlIlIII("FtVByI/EWzdt+nHH4jRyZg==", "RQQds");
        lIIllIIIllIll[lIIllIIIlllII[84]] = lIlIllllIlIlIII("VC/9mMP7MRs=", "EHIiB");
        lIIllIIIllIll[lIIllIIIlllII[85]] = lIlIllllIlIlIlI("qcOkPMgKrDw=", "oApAz");
        lIIllIIIllIll[lIIllIIIlllII[86]] = lIlIllllIlIlIII("8DMr7qqOKa6rmuWkHquYGw==", "JbOjo");
        lIIllIIIllIll[lIIllIIIlllII[87]] = lIlIllllIlIlIlI("wBPyyY4rsyP0pCUyWGXqElsxS9LiIa1v", "xpOZK");
        lIIllIIIllIll[lIIllIIIlllII[88]] = lIlIllllIlIlIII("2SiThxBnrFszA+NQmUqUeA==", "pLTuz");
        lIIllIIIllIll[lIIllIIIlllII[89]] = lIlIllllIlIlIIl("PQ0tHy0RAjxQJh8LNg==", "plEpJ");
        lIIllIIIllIll[lIIllIIIlllII[90]] = lIlIllllIlIlIII("e61AEP+m5xE=", "OqpPI");
        lIIllIIIllIll[lIIllIIIlllII[91]] = lIlIllllIlIlIIl("CxIXMSw8RxYqPQ==", "YgyXX");
        lIIllIIIllIll[lIIllIIIlllII[92]] = lIlIllllIlIlIIl("JRApBQEHBWUABgMUZQcRAxU=", "fqEtt");
        lIIllIIIllIll[lIIllIIIlllII[93]] = lIlIllllIlIlIlI("5+EG9ptklwDGBNvxEQl4xw==", "wFvFd");
        lIIllIIIllIll[lIIllIIIlllII[94]] = lIlIllllIlIlIII("VfN/b2KSZWWhSQkm7UhZEOnmkS5mQgHZ", "PjSPT");
        lIIllIIIllIll[lIIllIIIlllII[95]] = lIlIllllIlIlIIl("CTseORpkKRw1HQ==", "DZyPy");
        lIIllIIIllIll[lIIllIIIlllII[96]] = lIlIllllIlIlIlI("XsNYtDxGUYlrnbNDBaiiww==", "mGgyU");
        lIIllIIIllIll[lIIllIIIlllII[97]] = lIlIllllIlIlIII("k0KutL2LhatIoqT1Kz4fHA==", "SxUFS");
        lIIllIIIllIll[lIIllIIIlllII[98]] = lIlIllllIlIlIIl("LyU7IDBLJT83MkshPzcy", "kRZRV");
        lIIllIIIllIll[lIIllIIIlllII[99]] = lIlIllllIlIlIIl("BhkcORE9Gk45ADcS", "RvnJe");
        lIIllIIIllIll[lIIllIIIlllII[100]] = lIlIllllIlIlIIl("LRYaMD0PCEMwLAsA", "ndcCI");
        lIIllIIIllIll[lIIllIIIlllII[101]] = lIlIllllIlIlIIl("CBcUBRgiRRcNGSkW", "Leubw");
        lIIllIIIllIll[lIIllIIIlllII[102]] = lIlIllllIlIlIlI("O+XPY3kuRgU=", "Ehxcb");
        lIIllIIIllIll[lIIllIIIlllII[103]] = lIlIllllIlIlIlI("ilTfGIYe+Ro=", "Jklnx");
        lIIllIIIllIll[lIIllIIIlllII[104]] = lIlIllllIlIlIIl("MTYYHS4WJBgIJBU=", "sWliB");
        lIIllIIIllIll[lIIllIIIlllII[105]] = lIlIllllIlIlIIl("HCgqFwZxOyUa", "QIDcg");
        lIIllIIIllIll[lIIllIIIlllII[106]] = lIlIllllIlIlIlI("pw3w5pHoCZD5CbMrNMcGfQ==", "DKKqI");
        lIIllIIIllIll[lIIllIIIlllII[107]] = lIlIllllIlIlIlI("qVB97fyR3IPgrHqRucSW2w==", "ZxGcb");
        lIIllIIIllIll[lIIllIIIlllII[108]] = lIlIllllIlIlIII("tf7jnB7UBf7pMTUaJGKt7w==", "SRqct");
        lIIllIIIllIll[lIIllIIIlllII[109]] = lIlIllllIlIlIlI("M85K/9toMuTsbI4OO2+K+A==", "WNCtO");
        lIIllIIIllIll[lIIllIIIlllII[110]] = lIlIllllIlIlIlI("TCcYL9j+um1HLiaX/noZSw==", "yTAtF");
        lIIllIIIllIll[lIIllIIIlllII[111]] = lIlIllllIlIlIIl("Ii8vJxtXMzkwFg==", "wALRo");
        lIIllIIIllIll[lIIllIIIlllII[112]] = lIlIllllIlIlIII("7wM3zRVAqfVmzZVT6VGFkw==", "Twvek");
        lIIllIIIllIll[lIIllIIIlllII[113]] = lIlIllllIlIlIIl("FCo3OgxhID0uFS4qMA==", "ADTOx");
        lIIllIIIllIll[lIIllIIIlllII[114]] = lIlIllllIlIlIlI("+GsZxSSMgTSsTWTFf7pYtg==", "daqzH");
        lIIllIIIllIll[lIIllIIIlllII[115]] = lIlIllllIlIlIIl("CCQtF0UsKi4BRSstYgwAPQ==", "DKBge");
        lIIllIIIllIll[lIIllIIIlllII[116]] = lIlIllllIlIlIIl("LBoKHSBYHQQFLlgaA0kjHQw=", "xueiH");
        lIIllIIIllIll[lIIllIIIlllII[117]] = lIlIllllIlIlIII("FyioIQiryGP+ZlpnyzlAxw==", "khhVW");
        lIIllIIIllIll[lIIllIIIlllII[118]] = lIlIllllIlIlIII("ChFrnFhF41PCj0F4OV5DX+SYioRjHcae", "vSCCB");
        lIIllIIIllIll[lIIllIIIlllII[119]] = lIlIllllIlIlIII("s02MipBFKo5x6QiqVyCpBA==", "Dhfss");
        lIIllIIIllIll[lIIllIIIlllII[120]] = lIlIllllIlIlIIl("HyUfDBkocBMEHw==", "MPqem");
        lIIllIIIllIll[lIIllIIIlllII[121]] = lIlIllllIlIlIII("9xWiPcSsH3tc8jcUSqcGxg==", "PwSgA");
        lIIllIIIllIll[lIIllIIIlllII[122]] = lIlIllllIlIlIIl("MREAHSoQWAMZKg==", "bxlkO");
        lIIllIIIllIll[lIIllIIIlllII[123]] = lIlIllllIlIlIlI("1LUGpWw41WuMbnS4rsknEQ==", "CUqTR");
        lIIllIIIllIll[lIIllIIIlllII[124]] = lIlIllllIlIlIlI("Vy8OsORXwKQbiXwIst3t9A==", "xFAvh");
        lIIllIIIllIll[lIIllIIIlllII[125]] = lIlIllllIlIlIIl("NBQvDE4EADUdAgMAOQw=", "faAin");
        lIIllIIIllIll[lIIllIIIlllII[126]] = lIlIllllIlIlIII("9+hboCb6LKgq+yAWKuIeDQ==", "xVJgC");
        lIIllIIIllIll[lIIllIIIlllII[127]] = lIlIllllIlIlIII("P2qxmjXw3hnS3nb4vF4vkw==", "oitQV");
        lIIllIIIllIll[lIIllIIIlllII[128]] = lIlIllllIlIlIII("GtodWRSGPYyaPH9pMT8FGQ==", "jfuPk");
        lIIllIIIllIll[lIIllIIIlllII[129]] = lIlIllllIlIlIII("P+gJIdt30Ok8dCFGn2CZgA==", "aHLjk");
        lIIllIIIllIll[lIIllIIIlllII[130]] = lIlIllllIlIlIII("ZnVqvSP/ZZ9Y95G72Senbg==", "qBTvK");
        lIIllIIIllIll[lIIllIIIlllII[131]] = lIlIllllIlIlIlI("Z0CVNsfaxsGaCkeeVMtUpw==", "SCCdH");
        lIIllIIIllIll[lIIllIIIlllII[132]] = lIlIllllIlIlIII("zSlVblVqC7UmtBzBcyXWXw==", "CMMYj");
        lIIllIIIllIll[lIIllIIIlllII[133]] = lIlIllllIlIlIII("1V5B9SPqHJdDFi5+mItgDA==", "ZVcDp");
        lIIllIIIllIll[lIIllIIIlllII[134]] = lIlIllllIlIlIlI("RmUllj7e3tUJCmkMRM5KTw==", "BMLfi");
        lIIllIIIllIll[lIIllIIIlllII[135]] = lIlIllllIlIlIIl("FBMAMzRrBVIuNiAfATc2IlZaMzkpBAZz", "LvrZW");
        lIIllIIIllIll[lIIllIIIlllII[5]] = lIlIllllIlIlIII("7oC9fJOQBIJ8mJLtv4ILzw==", "wsmBk");
        lIIllIIIllIll[lIIllIIIlllII[136]] = lIlIllllIlIlIlI("d6F/7l/IgUGi1zfeJLEQdA==", "OVLeD");
        lIIllIIIllIll[lIIllIIIlllII[137]] = lIlIllllIlIlIII("pXU9tCIA8I15Vey/h+cyxw==", "KmaaB");
        lIIllIIIllIll[lIIllIIIlllII[138]] = lIlIllllIlIlIlI("ScKzXrNzhscOE02RQ2RQLAnzS6l8KEcD", "bUVjl");
        lIIllIIIllIll[lIIllIIIlllII[139]] = lIlIllllIlIlIlI("9iVVzJ74AbdUQ1vnvrJ91StDv+7u1HhF", "JnhQh");
    }

    private static String lIlIllllIlIlIIl(String llllllllllllllIllllIIIlIllIllIlI, String llllllllllllllIllllIIIlIllIllIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIIlIllIllIIl.toCharArray();
        int llllllllllllllIllllIIIlIllIlIllI = lIIllIIIlllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIlllII[0];
        while (lIlIllllIllIIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllllIIIlIllIlIllI % charArray.length]));
            "".length();
            llllllllllllllIllllIIIlIllIlIllI++;
            i++;
            "".length();
            if (((((158 + 128) - 117) + 28) ^ (((119 + 122) - 95) + 46)) == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIllllIllIIIl(int i, int i2) {
        return i <= i2;
    }

    static {
        lIlIllllIlIllII();
        lIlIllllIlIlIll();
        ay = LoggerFactory.getLogger(x.class);
        String[] strArr = new String[lIIllIIIlllII[5]];
        strArr[lIIllIIIlllII[0]] = lIIllIIIllIll[lIIllIIIlllII[6]];
        strArr[lIIllIIIlllII[1]] = lIIllIIIllIll[lIIllIIIlllII[7]];
        strArr[lIIllIIIlllII[2]] = lIIllIIIllIll[lIIllIIIlllII[8]];
        strArr[lIIllIIIlllII[3]] = lIIllIIIllIll[lIIllIIIlllII[9]];
        strArr[lIIllIIIlllII[4]] = lIIllIIIllIll[lIIllIIIlllII[10]];
        strArr[lIIllIIIlllII[6]] = lIIllIIIllIll[lIIllIIIlllII[11]];
        strArr[lIIllIIIlllII[7]] = lIIllIIIllIll[lIIllIIIlllII[12]];
        strArr[lIIllIIIlllII[8]] = lIIllIIIllIll[lIIllIIIlllII[13]];
        strArr[lIIllIIIlllII[9]] = lIIllIIIllIll[lIIllIIIlllII[14]];
        strArr[lIIllIIIlllII[10]] = lIIllIIIllIll[lIIllIIIlllII[15]];
        strArr[lIIllIIIlllII[11]] = lIIllIIIllIll[lIIllIIIlllII[16]];
        strArr[lIIllIIIlllII[12]] = lIIllIIIllIll[lIIllIIIlllII[17]];
        strArr[lIIllIIIlllII[13]] = lIIllIIIllIll[lIIllIIIlllII[18]];
        strArr[lIIllIIIlllII[14]] = lIIllIIIllIll[lIIllIIIlllII[19]];
        strArr[lIIllIIIlllII[15]] = lIIllIIIllIll[lIIllIIIlllII[20]];
        strArr[lIIllIIIlllII[16]] = lIIllIIIllIll[lIIllIIIlllII[21]];
        strArr[lIIllIIIlllII[17]] = lIIllIIIllIll[lIIllIIIlllII[22]];
        strArr[lIIllIIIlllII[18]] = lIIllIIIllIll[lIIllIIIlllII[23]];
        strArr[lIIllIIIlllII[19]] = lIIllIIIllIll[lIIllIIIlllII[24]];
        strArr[lIIllIIIlllII[20]] = lIIllIIIllIll[lIIllIIIlllII[25]];
        strArr[lIIllIIIlllII[21]] = lIIllIIIllIll[lIIllIIIlllII[26]];
        strArr[lIIllIIIlllII[22]] = lIIllIIIllIll[lIIllIIIlllII[27]];
        strArr[lIIllIIIlllII[23]] = lIIllIIIllIll[lIIllIIIlllII[28]];
        strArr[lIIllIIIlllII[24]] = lIIllIIIllIll[lIIllIIIlllII[29]];
        strArr[lIIllIIIlllII[25]] = lIIllIIIllIll[lIIllIIIlllII[30]];
        strArr[lIIllIIIlllII[26]] = lIIllIIIllIll[lIIllIIIlllII[31]];
        strArr[lIIllIIIlllII[27]] = lIIllIIIllIll[lIIllIIIlllII[32]];
        strArr[lIIllIIIlllII[28]] = lIIllIIIllIll[lIIllIIIlllII[33]];
        strArr[lIIllIIIlllII[29]] = lIIllIIIllIll[lIIllIIIlllII[34]];
        strArr[lIIllIIIlllII[30]] = lIIllIIIllIll[lIIllIIIlllII[35]];
        strArr[lIIllIIIlllII[31]] = lIIllIIIllIll[lIIllIIIlllII[36]];
        strArr[lIIllIIIlllII[32]] = lIIllIIIllIll[lIIllIIIlllII[37]];
        strArr[lIIllIIIlllII[33]] = lIIllIIIllIll[lIIllIIIlllII[38]];
        strArr[lIIllIIIlllII[34]] = lIIllIIIllIll[lIIllIIIlllII[39]];
        strArr[lIIllIIIlllII[35]] = lIIllIIIllIll[lIIllIIIlllII[40]];
        strArr[lIIllIIIlllII[36]] = lIIllIIIllIll[lIIllIIIlllII[41]];
        strArr[lIIllIIIlllII[37]] = lIIllIIIllIll[lIIllIIIlllII[42]];
        strArr[lIIllIIIlllII[38]] = lIIllIIIllIll[lIIllIIIlllII[43]];
        strArr[lIIllIIIlllII[39]] = lIIllIIIllIll[lIIllIIIlllII[44]];
        strArr[lIIllIIIlllII[40]] = lIIllIIIllIll[lIIllIIIlllII[45]];
        strArr[lIIllIIIlllII[41]] = lIIllIIIllIll[lIIllIIIlllII[46]];
        strArr[lIIllIIIlllII[42]] = lIIllIIIllIll[lIIllIIIlllII[47]];
        strArr[lIIllIIIlllII[43]] = lIIllIIIllIll[lIIllIIIlllII[48]];
        strArr[lIIllIIIlllII[44]] = lIIllIIIllIll[lIIllIIIlllII[49]];
        strArr[lIIllIIIlllII[45]] = lIIllIIIllIll[lIIllIIIlllII[50]];
        strArr[lIIllIIIlllII[46]] = lIIllIIIllIll[lIIllIIIlllII[51]];
        strArr[lIIllIIIlllII[47]] = lIIllIIIllIll[lIIllIIIlllII[52]];
        strArr[lIIllIIIlllII[48]] = lIIllIIIllIll[lIIllIIIlllII[53]];
        strArr[lIIllIIIlllII[49]] = lIIllIIIllIll[lIIllIIIlllII[54]];
        strArr[lIIllIIIlllII[50]] = lIIllIIIllIll[lIIllIIIlllII[55]];
        strArr[lIIllIIIlllII[51]] = lIIllIIIllIll[lIIllIIIlllII[56]];
        strArr[lIIllIIIlllII[52]] = lIIllIIIllIll[lIIllIIIlllII[57]];
        strArr[lIIllIIIlllII[53]] = lIIllIIIllIll[lIIllIIIlllII[58]];
        strArr[lIIllIIIlllII[54]] = lIIllIIIllIll[lIIllIIIlllII[59]];
        strArr[lIIllIIIlllII[55]] = lIIllIIIllIll[lIIllIIIlllII[60]];
        strArr[lIIllIIIlllII[56]] = lIIllIIIllIll[lIIllIIIlllII[61]];
        strArr[lIIllIIIlllII[57]] = lIIllIIIllIll[lIIllIIIlllII[62]];
        strArr[lIIllIIIlllII[58]] = lIIllIIIllIll[lIIllIIIlllII[63]];
        strArr[lIIllIIIlllII[59]] = lIIllIIIllIll[lIIllIIIlllII[64]];
        strArr[lIIllIIIlllII[60]] = lIIllIIIllIll[lIIllIIIlllII[65]];
        strArr[lIIllIIIlllII[61]] = lIIllIIIllIll[lIIllIIIlllII[66]];
        strArr[lIIllIIIlllII[62]] = lIIllIIIllIll[lIIllIIIlllII[67]];
        strArr[lIIllIIIlllII[63]] = lIIllIIIllIll[lIIllIIIlllII[68]];
        strArr[lIIllIIIlllII[64]] = lIIllIIIllIll[lIIllIIIlllII[69]];
        strArr[lIIllIIIlllII[65]] = lIIllIIIllIll[lIIllIIIlllII[70]];
        strArr[lIIllIIIlllII[66]] = lIIllIIIllIll[lIIllIIIlllII[71]];
        strArr[lIIllIIIlllII[67]] = lIIllIIIllIll[lIIllIIIlllII[72]];
        strArr[lIIllIIIlllII[68]] = lIIllIIIllIll[lIIllIIIlllII[73]];
        strArr[lIIllIIIlllII[69]] = lIIllIIIllIll[lIIllIIIlllII[74]];
        strArr[lIIllIIIlllII[70]] = lIIllIIIllIll[lIIllIIIlllII[75]];
        strArr[lIIllIIIlllII[71]] = lIIllIIIllIll[lIIllIIIlllII[76]];
        strArr[lIIllIIIlllII[72]] = lIIllIIIllIll[lIIllIIIlllII[77]];
        strArr[lIIllIIIlllII[73]] = lIIllIIIllIll[lIIllIIIlllII[78]];
        strArr[lIIllIIIlllII[74]] = lIIllIIIllIll[lIIllIIIlllII[79]];
        strArr[lIIllIIIlllII[75]] = lIIllIIIllIll[lIIllIIIlllII[80]];
        strArr[lIIllIIIlllII[76]] = lIIllIIIllIll[lIIllIIIlllII[81]];
        strArr[lIIllIIIlllII[77]] = lIIllIIIllIll[lIIllIIIlllII[82]];
        strArr[lIIllIIIlllII[78]] = lIIllIIIllIll[lIIllIIIlllII[83]];
        strArr[lIIllIIIlllII[79]] = lIIllIIIllIll[lIIllIIIlllII[84]];
        strArr[lIIllIIIlllII[80]] = lIIllIIIllIll[lIIllIIIlllII[85]];
        strArr[lIIllIIIlllII[81]] = lIIllIIIllIll[lIIllIIIlllII[86]];
        strArr[lIIllIIIlllII[82]] = lIIllIIIllIll[lIIllIIIlllII[87]];
        strArr[lIIllIIIlllII[83]] = lIIllIIIllIll[lIIllIIIlllII[88]];
        strArr[lIIllIIIlllII[84]] = lIIllIIIllIll[lIIllIIIlllII[89]];
        strArr[lIIllIIIlllII[85]] = lIIllIIIllIll[lIIllIIIlllII[90]];
        strArr[lIIllIIIlllII[86]] = lIIllIIIllIll[lIIllIIIlllII[91]];
        strArr[lIIllIIIlllII[87]] = lIIllIIIllIll[lIIllIIIlllII[92]];
        strArr[lIIllIIIlllII[88]] = lIIllIIIllIll[lIIllIIIlllII[93]];
        strArr[lIIllIIIlllII[89]] = lIIllIIIllIll[lIIllIIIlllII[94]];
        strArr[lIIllIIIlllII[90]] = lIIllIIIllIll[lIIllIIIlllII[95]];
        strArr[lIIllIIIlllII[91]] = lIIllIIIllIll[lIIllIIIlllII[96]];
        strArr[lIIllIIIlllII[92]] = lIIllIIIllIll[lIIllIIIlllII[97]];
        strArr[lIIllIIIlllII[93]] = lIIllIIIllIll[lIIllIIIlllII[98]];
        strArr[lIIllIIIlllII[94]] = lIIllIIIllIll[lIIllIIIlllII[99]];
        strArr[lIIllIIIlllII[95]] = lIIllIIIllIll[lIIllIIIlllII[100]];
        strArr[lIIllIIIlllII[96]] = lIIllIIIllIll[lIIllIIIlllII[101]];
        strArr[lIIllIIIlllII[97]] = lIIllIIIllIll[lIIllIIIlllII[102]];
        strArr[lIIllIIIlllII[98]] = lIIllIIIllIll[lIIllIIIlllII[103]];
        strArr[lIIllIIIlllII[99]] = lIIllIIIllIll[lIIllIIIlllII[104]];
        strArr[lIIllIIIlllII[100]] = lIIllIIIllIll[lIIllIIIlllII[105]];
        strArr[lIIllIIIlllII[101]] = lIIllIIIllIll[lIIllIIIlllII[106]];
        strArr[lIIllIIIlllII[102]] = lIIllIIIllIll[lIIllIIIlllII[107]];
        strArr[lIIllIIIlllII[103]] = lIIllIIIllIll[lIIllIIIlllII[108]];
        strArr[lIIllIIIlllII[104]] = lIIllIIIllIll[lIIllIIIlllII[109]];
        strArr[lIIllIIIlllII[105]] = lIIllIIIllIll[lIIllIIIlllII[110]];
        strArr[lIIllIIIlllII[106]] = lIIllIIIllIll[lIIllIIIlllII[111]];
        strArr[lIIllIIIlllII[107]] = lIIllIIIllIll[lIIllIIIlllII[112]];
        strArr[lIIllIIIlllII[108]] = lIIllIIIllIll[lIIllIIIlllII[113]];
        strArr[lIIllIIIlllII[109]] = lIIllIIIllIll[lIIllIIIlllII[114]];
        strArr[lIIllIIIlllII[110]] = lIIllIIIllIll[lIIllIIIlllII[115]];
        strArr[lIIllIIIlllII[111]] = lIIllIIIllIll[lIIllIIIlllII[116]];
        strArr[lIIllIIIlllII[112]] = lIIllIIIllIll[lIIllIIIlllII[117]];
        strArr[lIIllIIIlllII[113]] = lIIllIIIllIll[lIIllIIIlllII[118]];
        strArr[lIIllIIIlllII[114]] = lIIllIIIllIll[lIIllIIIlllII[119]];
        strArr[lIIllIIIlllII[115]] = lIIllIIIllIll[lIIllIIIlllII[120]];
        strArr[lIIllIIIlllII[116]] = lIIllIIIllIll[lIIllIIIlllII[121]];
        strArr[lIIllIIIlllII[117]] = lIIllIIIllIll[lIIllIIIlllII[122]];
        strArr[lIIllIIIlllII[118]] = lIIllIIIllIll[lIIllIIIlllII[123]];
        strArr[lIIllIIIlllII[119]] = lIIllIIIllIll[lIIllIIIlllII[124]];
        strArr[lIIllIIIlllII[120]] = lIIllIIIllIll[lIIllIIIlllII[125]];
        strArr[lIIllIIIlllII[121]] = lIIllIIIllIll[lIIllIIIlllII[126]];
        strArr[lIIllIIIlllII[122]] = lIIllIIIllIll[lIIllIIIlllII[127]];
        strArr[lIIllIIIlllII[123]] = lIIllIIIllIll[lIIllIIIlllII[128]];
        strArr[lIIllIIIlllII[124]] = lIIllIIIllIll[lIIllIIIlllII[129]];
        strArr[lIIllIIIlllII[125]] = lIIllIIIllIll[lIIllIIIlllII[130]];
        strArr[lIIllIIIlllII[126]] = lIIllIIIllIll[lIIllIIIlllII[131]];
        strArr[lIIllIIIlllII[127]] = lIIllIIIllIll[lIIllIIIlllII[132]];
        strArr[lIIllIIIlllII[128]] = lIIllIIIllIll[lIIllIIIlllII[133]];
        strArr[lIIllIIIlllII[129]] = lIIllIIIllIll[lIIllIIIlllII[134]];
        strArr[lIIllIIIlllII[130]] = lIIllIIIllIll[lIIllIIIlllII[135]];
        strArr[lIIllIIIlllII[131]] = lIIllIIIllIll[lIIllIIIlllII[5]];
        strArr[lIIllIIIlllII[132]] = lIIllIIIllIll[lIIllIIIlllII[136]];
        strArr[lIIllIIIlllII[133]] = lIIllIIIllIll[lIIllIIIlllII[137]];
        strArr[lIIllIIIlllII[134]] = lIIllIIIllIll[lIIllIIIlllII[138]];
        strArr[lIIllIIIlllII[135]] = lIIllIIIllIll[lIIllIIIlllII[139]];
        az = Arrays.asList(strArr);
    }

    private static String lIlIllllIlIlIII(String llllllllllllllIllllIIIlIlllIlIlI, String llllllllllllllIllllIIIlIlllIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIlIlllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlIlllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIlIlllIllII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIlIlllIllII.init(lIIllIIIlllII[2], llllllllllllllIllllIIIlIlllIllIl);
            return new String(llllllllllllllIllllIIIlIlllIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIlIlllIlIll) {
            llllllllllllllIllllIIIlIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIllIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    public x(SquireShamansPlugin squireShamansPlugin, c cVar, SquireShamanConfig squireShamanConfig, C0000a c0000a) {
        this.aD = squireShamansPlugin;
        this.aA = cVar;
        this.aB = squireShamanConfig;
        this.aC = c0000a;
    }
}
