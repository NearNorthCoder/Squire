package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/h.class */
public class C0011h {
    private final /* synthetic */ SquireNightmareConfig by;
    private static final /* synthetic */ HashMap<String, Integer> bx;
    private final /* synthetic */ SquireNightmarePlugin bz;
    private static /* synthetic */ String[] lllIllIllIlI;
    private static final /* synthetic */ Logger bw;
    private static /* synthetic */ int[] lllIllIlllII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean aT() {
        if (lIIIllIlIlllIll(aQ() ? 1 : 0) && lIIIllIlIlllIll(aR() ? 1 : 0) && lIIIllIlIlllIll(aS() ? 1 : 0)) {
            ?? r0 = lllIllIlllII[2];
            "".length();
            return (-" ".length()) >= ((221 ^ 199) ^ (40 ^ 54)) ? ((111 ^ 66) ^ (163 ^ 132)) & (((((89 + 16) - 16) + 77) ^ (((1 + 70) - (-36)) + 65)) ^ (-" ".length())) : r0;
        }
        return lllIllIlllII[0];
    }

    public TileItem aH() {
        return TileItems.getNearest(tileItem -> {
            return tileItem.hasInventoryAction(lllIllIllIlI[lllIllIlllII[42]]);
        });
    }

    static {
        lIIIllIlIlllIlI();
        lIIIllIlIllIIlI();
        bw = LoggerFactory.getLogger(C0011h.class);
        bx = new C0012i();
    }

    private boolean aF() {
        return SpellBook.Necromancy.RESURRECT_GREATER_GHOST.canCast();
    }

    private static void lIIIllIlIlllIlI() {
        lllIllIlllII = new int[53];
        lllIllIlllII[0] = ((((34 + 138) - 159) + 159) ^ (((84 + 64) - 126) + 128)) & (((167 ^ 189) ^ (224 ^ 192)) ^ (-" ".length()));
        lllIllIlllII[1] = "  ".length();
        lllIllIlllII[2] = " ".length();
        lllIllIlllII[3] = "   ".length();
        lllIllIlllII[4] = 126 ^ 122;
        lllIllIlllII[5] = (145 ^ 174) ^ (110 ^ 84);
        lllIllIlllII[6] = (52 ^ 22) ^ (54 ^ 18);
        lllIllIlllII[7] = 32 ^ 39;
        lllIllIlllII[8] = (78 ^ 117) ^ (167 ^ 148);
        lllIllIlllII[9] = (29 ^ 66) ^ (215 ^ 129);
        lllIllIlllII[10] = (32 ^ 101) ^ (242 ^ 189);
        lllIllIlllII[11] = 186 ^ 177;
        lllIllIlllII[12] = (38 ^ 94) ^ (240 ^ 132);
        lllIllIlllII[13] = (51 ^ 85) ^ (103 ^ 12);
        lllIllIlllII[14] = 159 ^ 145;
        lllIllIlllII[15] = 161 ^ 174;
        lllIllIlllII[16] = 75 ^ 91;
        lllIllIlllII[17] = 54 ^ 39;
        lllIllIlllII[18] = 96 ^ 114;
        lllIllIlllII[19] = (175 ^ 150) ^ (0 ^ 42);
        lllIllIlllII[20] = 18 ^ 6;
        lllIllIlllII[21] = (((47 + 39) - (-66)) + 63) ^ (((129 + 143) - 122) + 44);
        lllIllIlllII[22] = 78 ^ 102;
        lllIllIlllII[23] = (((91 + 40) - 100) + 106) ^ (((106 + 79) - 53) + 27);
        lllIllIlllII[24] = 96 ^ 119;
        lllIllIlllII[25] = 75 ^ 83;
        lllIllIlllII[26] = (((110 + 160) - 148) + 54) ^ (((42 + 98) - (-27)) + 2);
        lllIllIlllII[27] = (((202 + 137) - 269) + 148) ^ (((46 + 24) - 58) + 180);
        lllIllIlllII[28] = (42 ^ 67) ^ (124 ^ 14);
        lllIllIlllII[29] = (((40 + 75) - 33) + 107) ^ (((78 + 101) - 163) + 145);
        lllIllIlllII[30] = (178 ^ 172) ^ "   ".length();
        lllIllIlllII[31] = -" ".length();
        lllIllIlllII[32] = (((138 + 49) - 145) + 137) ^ (((84 + 99) - 179) + 169);
        lllIllIlllII[33] = 37 ^ 58;
        lllIllIlllII[34] = 138 ^ 170;
        lllIllIlllII[35] = 49 ^ 16;
        lllIllIlllII[36] = (28 ^ 18) ^ (31 ^ 51);
        lllIllIlllII[37] = 178 ^ 145;
        lllIllIlllII[38] = 137 ^ 173;
        lllIllIlllII[39] = (((141 + 101) - 131) + 31) ^ (((28 + 129) - 86) + 100);
        lllIllIlllII[40] = (((118 + 55) - 99) + 90) ^ (((16 + 83) - 6) + 37);
        lllIllIlllII[41] = (22 ^ 31) ^ (129 ^ 175);
        lllIllIlllII[42] = (239 ^ 148) ^ (0 ^ 82);
        lllIllIlllII[43] = 90 ^ 112;
        lllIllIlllII[44] = (203 ^ 155) ^ (210 ^ 169);
        lllIllIlllII[45] = (((131 + 48) - 71) + 39) ^ (((86 + 63) - 75) + 117);
        lllIllIlllII[46] = (5 ^ 38) ^ (169 ^ 167);
        lllIllIlllII[47] = (224 ^ 141) ^ (198 ^ 133);
        lllIllIlllII[48] = (-1633) & 5883;
        lllIllIlllII[49] = (-11273) & 12267;
        lllIllIlllII[50] = 21 ^ 58;
        lllIllIlllII[51] = 143 ^ 191;
        lllIllIlllII[52] = 26 ^ 43;
    }

    private static boolean lIIIllIlIllllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v130, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v135, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v165, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public boolean aG() {
        if (lIIIllIlIlllIll(this.by.assistantMode() ? 1 : 0)) {
            return lllIllIlllII[0];
        }
        boolean aT = aT();
        TileItem tileItem = null;
        if (lIIIllIlIllllII(aR() ? 1 : 0)) {
            tileItem = aI();
            "".length();
            if (0 != 0) {
                return "  ".length() & ("  ".length() ^ (-" ".length()));
            }
        } else if (lIIIllIlIllllII(aQ() ? 1 : 0)) {
            tileItem = aH();
            "".length();
            if (" ".length() < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if ((!lIIIllIlIllllII(aF() ? 1 : 0) || lIIIllIlIllllIl(Skills.getBoostedLevel(Skill.PRAYER), this.by.restorePrayerAt())) && lIIIllIlIllllII(Inventory.contains(item -> {
            if (!lIIIllIlIllllII(item.getName().contains(lllIllIllIlI[lllIllIlllII[50]]) ? 1 : 0) || lIIIllIlIlllIll(item.getName().contains(lllIllIllIlI[lllIllIlllII[51]]) ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIllIlllII[0];
        }) ? 1 : 0)) {
            tileItem = aJ();
        }
        if (lIIIllIlIlllllI(tileItem)) {
            tileItem = (TileItem) TileItems.getAll(tileItem2 -> {
                if (lIIIllIlIllllll(tileItem2.getName()) && lIIIllIlIlllIll(bx.containsKey(tileItem2.getName()) ? 1 : 0)) {
                    ?? r0 = lllIllIlllII[2];
                    "".length();
                    return "  ".length() <= 0 ? ((13 ^ 60) ^ (5 ^ 126)) & (((((54 + 19) - (-7)) + 59) ^ (((47 + 105) - 92) + 133)) ^ (-" ".length())) : r0;
                }
                return lllIllIlllII[0];
            }).stream().max(Comparator.comparingInt(tileItem3 -> {
                return bx.get(tileItem3.getName()).intValue() * tileItem3.getQuantity();
            })).orElse(null);
        }
        TileItem aK = aK();
        if (lIIIllIlIllllll(aK)) {
            tileItem = aK;
        }
        if (lIIIllIlIlllllI(tileItem)) {
            tileItem = (TileItem) TileItems.getAll(tileItem4 -> {
                if (lIIIllIllIIIIIl(tileItem4.getId(), lllIllIlllII[49])) {
                    ?? r0 = lllIllIlllII[2];
                    "".length();
                    return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIllIlllII[0];
            }).stream().min(Comparator.comparingInt(tileItem5 -> {
                return tileItem5.distanceTo(Players.getLocal());
            })).orElse(null);
            if (lIIIllIlIlllllI(tileItem)) {
                return lllIllIlllII[0];
            }
        }
        if (lIIIllIllIIIIII(tileItem, aK) && lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0)) {
            Item first = Inventory.getFirst(item2 -> {
                String[] strArr = new String[lllIllIlllII[1]];
                strArr[lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[46]];
                strArr[lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[47]];
                if (lIIIllIlIlllIll(item2.hasAction(strArr) ? 1 : 0) && lIIIllIllIIIlII(item2.getId(), lllIllIlllII[48])) {
                    ?? r0 = lllIllIlllII[2];
                    "".length();
                    return "   ".length() == ((((110 + 154) - 128) + 20) ^ (((14 + 32) - (-89)) + 17)) ? ((((61 + 96) - 125) + 126) ^ (((110 + 135) - 112) + 58)) & (((242 ^ 170) ^ (200 ^ 177)) ^ (-" ".length())) : r0;
                }
                return lllIllIlllII[0];
            });
            Item orElse = aO().orElse(null);
            if (lIIIllIlIlllllI(orElse)) {
                bw.debug(lllIllIllIlI[lllIllIlllII[0]]);
                if (lIIIllIlIllllll(first)) {
                    String[] strArr = new String[lllIllIlllII[1]];
                    strArr[lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[2]];
                    strArr[lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[1]];
                    first.interact(strArr);
                    return lllIllIlllII[2];
                }
                return lllIllIlllII[0];
            } else if (lIIIllIlIlllIll(a(orElse, tileItem) ? 1 : 0)) {
                bw.info(lllIllIllIlI[lllIllIlllII[3]], orElse.getName(), tileItem.getName());
                String[] strArr2 = new String[lllIllIlllII[1]];
                strArr2[lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[4]];
                strArr2[lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[5]];
                orElse.interact(strArr2);
                return lllIllIlllII[2];
            }
        }
        if (!lIIIllIlIllllII(tileItem.isStackable() ? 1 : 0) || lIIIllIlIlllIll(tileItem.isNoted() ? 1 : 0)) {
            int[] iArr = new int[lllIllIlllII[2]];
            iArr[lllIllIlllII[0]] = tileItem.getId();
            if (lIIIllIlIlllIll(Inventory.contains(iArr) ? 1 : 0)) {
                String str = lllIllIllIlI[lllIllIlllII[6]];
                Object[] objArr = new Object[lllIllIlllII[2]];
                objArr[lllIllIlllII[0]] = tileItem.getName();
                Log.info(str, objArr);
                tileItem.interact(lllIllIllIlI[lllIllIlllII[7]]);
                return lllIllIlllII[2];
            }
        }
        if (!lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0)) {
            if (lIIIllIlIlllIll(tileItem.hasInventoryAction(lllIllIllIlI[lllIllIlllII[17]]) ? 1 : 0) && lIIIllIllIIIIlI(Inventory.getFreeSlots(), lllIllIlllII[2])) {
                bw.info(lllIllIllIlI[lllIllIlllII[18]], tileItem.getName());
                return lllIllIlllII[0];
            }
            String str2 = lllIllIllIlI[lllIllIlllII[19]];
            Object[] objArr2 = new Object[lllIllIlllII[2]];
            objArr2[lllIllIlllII[0]] = tileItem.getName();
            Log.info(str2, objArr2);
            tileItem.interact(lllIllIllIlI[lllIllIlllII[20]]);
            return lllIllIlllII[2];
        }
        Item first2 = Inventory.getFirst(item3 -> {
            String[] strArr3 = new String[lllIllIlllII[2]];
            strArr3[lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[43]];
            if (lIIIllIlIllllII(item3.hasAction(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[lllIllIlllII[2]];
                strArr4[lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[44]];
                if (!lIIIllIlIlllIll(item3.hasAction(strArr4) ? 1 : 0) || !lIIIllIlIlllIll(item3.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[45]]) ? 1 : 0)) {
                    return lllIllIlllII[0];
                }
            }
            ?? r0 = lllIllIlllII[2];
            "".length();
            return " ".length() > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
        Item orElse2 = aO().orElse(null);
        if (!lIIIllIlIlllllI(orElse2)) {
            if (lIIIllIllIIIIIl(orElse2.getId(), tileItem.getId())) {
                bw.info(lllIllIllIlI[lllIllIlllII[12]], orElse2.getName(), tileItem.getName());
                return lllIllIlllII[0];
            } else if (!lIIIllIlIlllIll(a(orElse2, tileItem) ? 1 : 0)) {
                bw.info(lllIllIllIlI[lllIllIlllII[16]], tileItem.getName());
                return lllIllIlllII[0];
            } else {
                bw.info(lllIllIllIlI[lllIllIlllII[13]], orElse2.getName(), tileItem.getName());
                String[] strArr3 = new String[lllIllIlllII[1]];
                strArr3[lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[14]];
                strArr3[lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[15]];
                orElse2.interact(strArr3);
                return lllIllIlllII[2];
            }
        }
        int lllllllllllllllIIllIIllIIIlIllIl = aT ? 1 : 0;
        if (lIIIllIlIlllIll(lllllllllllllllIIllIIllIIIlIllIl)) {
            String str3 = lllIllIllIlI[lllIllIlllII[8]];
            Object[] objArr3 = new Object[lllIllIlllII[2]];
            objArr3[lllIllIlllII[0]] = tileItem.getName();
            Log.info(str3, objArr3);
            return lllIllIlllII[0];
        } else if (lIIIllIlIllllll(first2)) {
            bw.info(lllIllIllIlI[lllIllIlllII[9]], first2.getName(), tileItem.getName());
            String[] strArr4 = new String[lllIllIlllII[1]];
            strArr4[lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[10]];
            strArr4[lllIllIlllII[2]] = lllIllIllIlI[lllIllIlllII[11]];
            first2.interact(strArr4);
            return lllIllIlllII[2];
        } else {
            return lllIllIlllII[0];
        }
    }

    private TileItem aK() {
        return TileItems.getNearest(tileItem -> {
            if (lIIIllIlIlllllI(tileItem.getName())) {
                return lllIllIlllII[0];
            }
            String lllllllllllllllIIllIIlIllllIIllI = tileItem.getName().toLowerCase();
            if (lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[32]]) ? 1 : 0) && lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[33]]) ? 1 : 0) && lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[34]]) ? 1 : 0) && lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[35]]) ? 1 : 0) && lIIIllIlIllllII(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[36]]) ? 1 : 0) && !lIIIllIlIlllIll(lllllllllllllllIIllIIlIllllIIllI.contains(lllIllIllIlI[lllIllIlllII[37]]) ? 1 : 0)) {
                return lllIllIlllII[0];
            }
            ?? r0 = lllIllIlllII[2];
            "".length();
            return "   ".length() > ((39 ^ 71) ^ (120 ^ 28)) ? ((149 ^ 145) ^ (172 ^ 154)) & (((180 ^ 196) ^ (253 ^ 191)) ^ (-" ".length())) : r0;
        });
    }

    private static void lIIIllIlIllIIlI() {
        lllIllIllIlI = new String[lllIllIlllII[52]];
        lllIllIllIlI[lllIllIlllII[0]] = lIIIllIlIlIlIIl("mMx2j8rtRDb5VtmCLq/AMI3OdqWVNTCyHZZBCevw+5gN00j1coD7VN0h/MBKTuT4ldpuqQ1H/bM=", "QNXix");
        lllIllIllIlI[lllIllIlllII[2]] = lIIIllIlIlIlIIl("SkEqc2l0edg=", "gLJHF");
        lllIllIllIlI[lllIllIlllII[1]] = lIIIllIlIlIlIlI("EgcKJQ==", "VueUh");
        lllIllIllIlI[lllIllIlllII[3]] = lIIIllIlIlIlIll("hKc+YVUBuhLrW6gH6e6ySKQRFMVQduuM2xSlDYoJOP9iobZ/+zIXSqUinG2rCEI9gqEVs8CBMmaHsM8/2GN4XLVo5ldqzNls", "LUNSP");
        lllIllIllIlI[lllIllIlllII[4]] = lIIIllIlIlIlIll("Du5+PTBg6sA=", "krsBa");
        lllIllIllIlI[lllIllIlllII[5]] = lIIIllIlIlIlIIl("5UsFBF1/fDY=", "TSlZe");
        lllIllIllIlI[lllIllIlllII[6]] = lIIIllIlIlIlIll("nmteWhfX6hRFzwBG2GRF1pE060QvmM1i0iEuqSw0wG06d+qibTcO2iDUPiSw9sG5MygJxt7vqWBJlL4313u0jQ==", "uafyh");
        lllIllIllIlI[lllIllIlllII[7]] = lIIIllIlIlIlIll("RYWsyO63E+8=", "xhiLu");
        lllIllIllIlI[lllIllIlllII[8]] = lIIIllIlIlIlIll("T1EZEcjKZpsQfonEtcGkSfP0P0ElUzJwrOU7MWvFgWyeuHvGfqaIyTYvj/lEyAjuLFn0jWQzCV5Qq+Jn9THo3koKFaRRF95srq4CpY7cJRBhZXPzAcRndqIBvnNtUNonl8IdjttwLYU=", "fzWTv");
        lllIllIllIlI[lllIllIlllII[9]] = lIIIllIlIlIlIll("kIaGhSey9eE2KO/yjhF+Mvh7xIsc+F96mQRhmgEND/GzSobLYZnU8BHWkGyWooRV3xBk8NksllRm5TF1LL2tm4eRv32ke8Dr8LTbziOwdtNQJdcCMAqILItuNpWb8MBSMQVDRl1t56ZDkFH0GMvD1bYMkdhkvK5+Pyun7tZHeCU=", "cUEcj");
        lllIllIllIlI[lllIllIlllII[10]] = lIIIllIlIlIlIlI("KQQw", "leDdA");
        lllIllIllIlI[lllIllIlllII[11]] = lIIIllIlIlIlIll("+K6ULpAR4oo=", "wqGpn");
        lllIllIllIlI[lllIllIlllII[12]] = lIIIllIlIlIlIll("/exoNt+EEN6xQhWgeQDoTEpaapi92RvP1IJOI7KgllytAQ5SIhjNNFAibuELsR03YWs45IegiRblKIRnTegCN+jX6Tn/opoFX0Kg24NJRiU=", "IQxjR");
        lllIllIllIlI[lllIllIlllII[13]] = lIIIllIlIlIlIll("XQkE1OtqLNMTf4Uh1EcUbBsf9d9glAFjzc3zzPK1tfGGs+opl0afgrL0wr1z1+bj6KOK7xYfBqSeG4uyDb8HSw==", "TqWzJ");
        lllIllIllIlI[lllIllIlllII[14]] = lIIIllIlIlIlIlI("FhMi", "SrVEJ");
        lllIllIllIlI[lllIllIlllII[15]] = lIIIllIlIlIlIlI("LjQJHg==", "jFfnK");
        lllIllIllIlI[lllIllIlllII[16]] = lIIIllIlIlIlIll("ByFLtUQ6How4o0dyYzkV0PSZVX/hI/MU2HK0CSduvp3M9o90eK+Sm+pZKULqCw8e1rn8QMOzU6nXAQxIINyQZVLzWw2n+NOb", "VbclL");
        lllIllIllIlI[lllIllIlllII[17]] = lIIIllIlIlIlIIl("98xDnS3vzbc=", "OqWlW");
        lllIllIllIlI[lllIllIlllII[18]] = lIIIllIlIlIlIIl("WZxQIa3GI3yb/QeHF32PzrH2JnTysxoU9hoV985niUCrwFDQdulW7cFQnAkFxdRht/0GyzXgmgJ5r+A8MXZE4vFzRiiWKH9KE44vAoBx+An4JnaGzOXuFphyWNPgZ7af8igqzkRALYI=", "tyQtq");
        lllIllIllIlI[lllIllIlllII[19]] = lIIIllIlIlIlIll("rbNULpiKhZ8LHa84yu8hWw==", "oCUVR");
        lllIllIllIlI[lllIllIlllII[20]] = lIIIllIlIlIlIlI("MjQNCA==", "fUfmn");
        lllIllIllIlI[lllIllIlllII[21]] = lIIIllIlIlIlIlI("MiQfHgEkCR4QEgwaLUtVJwcEGRwHD1AFGkkEHx4BRUgEFBkMGB8DAQAGF1EaHBxR", "ihpqu");
        lllIllIllIlI[lllIllIlllII[23]] = lIIIllIlIlIlIll("IN8a+LO053hZiSN26NTC3Q==", "qkGgq");
        lllIllIllIlI[lllIllIlllII[24]] = lIIIllIlIlIlIIl("y0QDlPEman8NvsBf7XkHRA==", "CPPjG");
        lllIllIllIlI[lllIllIlllII[25]] = lIIIllIlIlIlIIl("yIUIi2BYAiU=", "zjhzC");
        lllIllIllIlI[lllIllIlllII[26]] = lIIIllIlIlIlIll("rQvkCwunYi0=", "CDjvl");
        lllIllIllIlI[lllIllIlllII[27]] = lIIIllIlIlIlIlI("CDgt", "MYYHt");
        lllIllIllIlI[lllIllIlllII[28]] = lIIIllIlIlIlIIl("DcbAPHGDOaawoAbr3c/OYQ==", "KIGhi");
        lllIllIllIlI[lllIllIlllII[29]] = lIIIllIlIlIlIlI("ICEaBQ==", "HTinF");
        lllIllIllIlI[lllIllIlllII[30]] = lIIIllIlIlIlIll("CBWoSu7bIzA=", "tdTWP");
        lllIllIllIlI[lllIllIlllII[32]] = lIIIllIlIlIlIlI("PiYN", "QToTr");
        lllIllIllIlI[lllIllIlllII[33]] = lIIIllIlIlIlIIl("QYRy+ggbztE=", "OxkFC");
        lllIllIllIlI[lllIllIlllII[34]] = lIIIllIlIlIlIIl("9Vf72ss6oVM=", "ugJnY");
        lllIllIllIlI[lllIllIlllII[35]] = lIIIllIlIlIlIIl("I6SgWhTPp+o=", "xhUxH");
        lllIllIllIlI[lllIllIlllII[36]] = lIIIllIlIlIlIlI("Gz4gICwBOSU6Nw==", "rPQUE");
        lllIllIllIlI[lllIllIlllII[37]] = lIIIllIlIlIlIll("97xijxykQJw=", "doNMU");
        lllIllIllIlI[lllIllIlllII[38]] = lIIIllIlIlIlIlI("ADg5DzI=", "DJPaY");
        lllIllIllIlI[lllIllIlllII[39]] = lIIIllIlIlIlIll("2YV13NOArYQ=", "BQoMi");
        lllIllIllIlI[lllIllIlllII[40]] = lIIIllIlIlIlIll("jV5cIWprEQA=", "YeSTB");
        lllIllIllIlI[lllIllIlllII[41]] = lIIIllIlIlIlIlI("CT4cFAU=", "MLuzn");
        lllIllIllIlI[lllIllIlllII[22]] = lIIIllIlIlIlIIl("5AOx3gSO9KY=", "KwWRp");
        lllIllIllIlI[lllIllIlllII[42]] = lIIIllIlIlIlIll("CBKLbEu3EtU=", "RCYuK");
        lllIllIllIlI[lllIllIlllII[43]] = lIIIllIlIlIlIlI("MzIj", "vSWDX");
        lllIllIllIlI[lllIllIlllII[44]] = lIIIllIlIlIlIll("Gn11cAcJgoc=", "SdlTr");
        lllIllIllIlI[lllIllIlllII[45]] = lIIIllIlIlIlIIl("BE2Tmii905o=", "PdTCJ");
        lllIllIllIlI[lllIllIlllII[46]] = lIIIllIlIlIlIIl("U6vUp+/1Igk=", "biTnt");
        lllIllIllIlI[lllIllIlllII[47]] = lIIIllIlIlIlIll("bYWGsb03rlI=", "rZyAp");
        lllIllIllIlI[lllIllIlllII[50]] = lIIIllIlIlIlIll("2haxyV+bgHk=", "bzZaa");
        lllIllIllIlI[lllIllIlllII[51]] = lIIIllIlIlIlIIl("GoOcu06eGPg=", "UXTwj");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean aS() {
        if (!lIIIllIlIllllII(Inventory.getAll(item -> {
            String lowerCase = item.getName().toLowerCase();
            if (!lIIIllIlIllllII(lowerCase.contains(lllIllIllIlI[lllIllIlllII[23]]) ? 1 : 0) || lIIIllIlIlllIll(lowerCase.contains(lllIllIllIlI[lllIllIlllII[24]]) ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return (((36 ^ 49) ^ (90 ^ 126)) & (((((167 + 41) - 202) + 237) ^ (((116 + 44) - 38) + 72)) ^ (-" ".length()))) != 0 ? ((((25 + 160) - 101) + 121) ^ (((77 + 75) - 149) + 155)) & (((((23 + 74) - (-59)) + 43) ^ (((133 + 7) - 4) + 12)) ^ (-" ".length())) : r0;
            }
            return lllIllIlllII[0];
        }).stream().map(item2 -> {
            return Character.valueOf(item2.getName().charAt(item2.getName().indexOf(lllIllIlllII[22]) + lllIllIlllII[2]));
        }).mapToInt((v0) -> {
            return Character.getNumericValue(v0);
        }).sum()) || lIIIllIlIlllIll(this.by.continueWithNoPots() ? 1 : 0)) {
            ?? r0 = lllIllIlllII[2];
            "".length();
            return (-" ".length()) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIlllII[0];
    }

    public Optional<Item> aO() {
        return Inventory.getAll(item -> {
            if (lIIIllIlIllllll(item.getName()) && lIIIllIlIlllIll(bx.containsKey(item.getName()) ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return "  ".length() == 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
            }
            return lllIllIlllII[0];
        }).stream().filter(item2 -> {
            if (lIIIllIlIllllII(item2.getName().equals(lllIllIllIlI[lllIllIlllII[30]]) ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return 0 != 0 ? ((6 ^ 45) ^ (8 ^ 116)) & (((((115 + 204) - 159) + 57) ^ (((123 + 129) - 110) + 0)) ^ (-" ".length())) : r0;
            }
            return lllIllIlllII[0];
        }).min(Comparator.comparingInt(item3 -> {
            return bx.get(item3.getName()).intValue() * item3.getQuantity();
        }));
    }

    public int a(TileItem tileItem) {
        return bx.getOrDefault(tileItem.getName(), Integer.valueOf(lllIllIlllII[0])).intValue();
    }

    public TileItem aI() {
        return TileItems.getNearest(tileItem -> {
            if (lIIIllIlIlllIll(tileItem.hasInventoryAction(lllIllIllIlI[lllIllIlllII[41]]) ? 1 : 0) && lIIIllIlIlllIll(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[22]]) ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return "  ".length() > "   ".length() ? ((((47 + 4) - (-16)) + 68) ^ (((124 + 84) - 119) + 40)) & ((" ".length() ^ (109 ^ 106)) ^ (-" ".length())) : r0;
            }
            return lllIllIlllII[0];
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean aR() {
        if (lIIIllIllIIIIll(Inventory.getAll(item -> {
            String lowerCase = item.getName().toLowerCase();
            if (!lIIIllIlIllllII(lowerCase.contains(lllIllIllIlI[lllIllIlllII[25]]) ? 1 : 0) || lIIIllIlIlllIll(lowerCase.contains(lllIllIllIlI[lllIllIlllII[26]]) ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return 0 != 0 ? ((((84 + 22) - 67) + 122) ^ (((16 + 22) - 5) + 139)) & (((129 ^ 167) ^ (171 ^ 128)) ^ (-" ".length())) : r0;
            }
            return lllIllIlllII[0];
        }).stream().map(item2 -> {
            return Character.valueOf(item2.getName().charAt(item2.getName().indexOf(lllIllIlllII[22]) + lllIllIlllII[2]));
        }).mapToInt((v0) -> {
            return Character.getNumericValue(v0);
        }).sum(), this.by.teleportCleanse())) {
            ?? r0 = lllIllIlllII[2];
            "".length();
            return ((112 ^ 71) ^ (134 ^ 181)) < "   ".length() ? ((((130 + 50) - 47) + 4) ^ (((60 + 53) - 65) + 86)) & (((29 ^ 82) ^ (109 ^ 45)) ^ (-" ".length())) : r0;
        }
        return lllIllIlllII[0];
    }

    private static boolean lIIIllIlIlllllI(Object obj) {
        return obj == null;
    }

    @Inject
    public C0011h(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.by = squireNightmareConfig;
        this.bz = squireNightmarePlugin;
    }

    private static boolean lIIIllIlIllllII(int i) {
        return i == 0;
    }

    public int b(TileItem tileItem) {
        return a(tileItem) * tileItem.getQuantity();
    }

    private static boolean lIIIllIllIIIIll(int i, int i2) {
        return i >= i2;
    }

    public Optional<TileItem> aN() {
        return TileItems.getAll(tileItem -> {
            if (lIIIllIlIllllll(tileItem.getName()) && lIIIllIlIlllIll(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return (((215 ^ 190) ^ (101 ^ 17)) & (((206 ^ 161) ^ (247 ^ 133)) ^ (-" ".length()))) < 0 ? ((61 ^ 53) ^ (124 ^ 60)) & (((162 ^ 129) ^ (52 ^ 95)) ^ (-" ".length())) : r0;
            }
            return lllIllIlllII[0];
        }).stream().filter(tileItem2 -> {
            if (lIIIllIlIlllIll(tileItem2.isStackable() ? 1 : 0)) {
                int[] iArr = new int[lllIllIlllII[2]];
                iArr[lllIllIlllII[0]] = tileItem2.getId();
                if (lIIIllIlIlllIll(Inventory.contains(iArr) ? 1 : 0)) {
                    ?? r0 = lllIllIlllII[2];
                    "".length();
                    return (-((((92 + 58) - 148) + 125) ^ (233 ^ 146))) > 0 ? ((((127 + 84) - 87) + 51) ^ (((58 + 109) - 11) + 31)) & (((((2 + 38) - (-36)) + 88) ^ (((150 + 3) - (-10)) + 13)) ^ (-" ".length())) : r0;
                }
            }
            return lllIllIlllII[0];
        }).max(Comparator.comparingInt(obj -> {
            return ((TileItem) obj).getQuantity() * bx.getOrDefault(((TileItem) obj).getName(), Integer.valueOf(lllIllIlllII[31])).intValue();
        }).thenComparingDouble(obj2 -> {
            return -((TileItem) obj2).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        }));
    }

    private static String lIIIllIlIlIlIll(String lllllllllllllllIIllIIlIllIlIlIll, String lllllllllllllllIIllIIlIllIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), lllIllIlllII[8]), "DES");
            Cipher lllllllllllllllIIllIIlIllIlIllIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIllIlIllIl.init(lllIllIlllII[1], lllllllllllllllIIllIIlIllIlIlllI);
            return new String(lllllllllllllllIIllIIlIllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIllIlIllII) {
            lllllllllllllllIIllIIlIllIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlIllllll(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllIllIIIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIllIllIIIlII(int i, int i2) {
        return i != i2;
    }

    private static String lIIIllIlIlIlIlI(String lllllllllllllllIIllIIlIlllIIllIl, String lllllllllllllllIIllIIlIlllIIllII) {
        String lllllllllllllllIIllIIlIlllIIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlllIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIlllIIlIll = new StringBuilder();
        char[] lllllllllllllllIIllIIlIlllIIlIlI = lllllllllllllllIIllIIlIlllIIllII.toCharArray();
        int lllllllllllllllIIllIIlIlllIIlIIl = lllIllIlllII[0];
        char[] charArray = lllllllllllllllIIllIIlIlllIIllIl2.toCharArray();
        int lllllllllllllllIIllIIlIlllIIIIlI = charArray.length;
        int i = lllIllIlllII[0];
        while (lIIIllIlIllllIl(i, lllllllllllllllIIllIIlIlllIIIIlI)) {
            lllllllllllllllIIllIIlIlllIIlIll.append((char) (charArray[i] ^ lllllllllllllllIIllIIlIlllIIlIlI[lllllllllllllllIIllIIlIlllIIlIIl % lllllllllllllllIIllIIlIlllIIlIlI.length]));
            "".length();
            lllllllllllllllIIllIIlIlllIIlIIl++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIlIlllIIlIll);
    }

    public TileItem aJ() {
        return TileItems.getNearest(tileItem -> {
            if (!lIIIllIlIlllIll(tileItem.hasInventoryAction(lllIllIllIlI[lllIllIlllII[38]]) ? 1 : 0) || (lIIIllIlIllllII(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[39]]) ? 1 : 0) && !lIIIllIlIlllIll(tileItem.getName().toLowerCase().contains(lllIllIllIlI[lllIllIlllII[40]]) ? 1 : 0))) {
                return lllIllIlllII[0];
            }
            ?? r0 = lllIllIlllII[2];
            "".length();
            return "  ".length() == " ".length() ? ((((4 + 9) - (-123)) + 34) ^ (((128 + 95) - 221) + 128)) & (((((59 + 45) - (-13)) + 15) ^ (((35 + 71) - 91) + 157)) ^ (-" ".length())) : r0;
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean a(Item item, TileItem tileItem) {
        if (lIIIllIlIllllIl(bx.get(item.getName()).intValue() * item.getQuantity(), bx.get(tileItem.getName()).intValue() * tileItem.getQuantity())) {
            ?? r0 = lllIllIlllII[2];
            "".length();
            return 0 != 0 ? ((((27 + 96) - 22) + 32) ^ (((118 + 69) - 52) + 22)) & (((115 ^ 15) ^ (17 ^ 117)) ^ (-" ".length())) & ((((((141 + 116) - 245) + 212) ^ (((117 + 91) - 96) + 83)) & (((236 ^ 167) ^ (227 ^ 139)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
        }
        return lllIllIlllII[0];
    }

    private static boolean lIIIllIllIIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean aP() {
        if (lIIIllIlIllllII(aG() ? 1 : 0)) {
            bw.info(lllIllIllIlI[lllIllIlllII[21]]);
            return this.bz.m();
        }
        return lllIllIlllII[2];
    }

    private static String lIIIllIlIlIlIIl(String lllllllllllllllIIllIIlIllIlllIII, String lllllllllllllllIIllIIlIllIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIllIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIllIlllIlI.init(lllIllIlllII[1], secretKeySpec);
            return new String(lllllllllllllllIIllIIlIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIllIlllIIl) {
            lllllllllllllllIIllIIlIllIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllIIIIlI(int i, int i2) {
        return i <= i2;
    }

    private TileItem aL() {
        return lIIIllIlIlllIll(Inventory.isFull() ? 1 : 0) ? aN().orElse(null) : aM().orElse(null);
    }

    public Optional<TileItem> aM() {
        return TileItems.getAll(tileItem -> {
            if (lIIIllIlIllllll(tileItem.getName()) && lIIIllIlIlllIll(bx.containsKey(tileItem.getName()) ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIllIlllII[0];
        }).stream().max(Comparator.comparingInt(obj -> {
            return ((TileItem) obj).getQuantity() * bx.getOrDefault(((TileItem) obj).getName(), Integer.valueOf(lllIllIlllII[31])).intValue();
        }).thenComparingDouble(obj2 -> {
            return -((TileItem) obj2).getWorldLocation().distanceToHypotenuse(Players.getLocal().getWorldLocation());
        }));
    }

    private static boolean lIIIllIlIlllIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean aQ() {
        if (lIIIllIllIIIIll(Inventory.getCount((boolean) lllIllIlllII[2], item -> {
            String[] strArr = new String[lllIllIlllII[2]];
            strArr[lllIllIlllII[0]] = lllIllIllIlI[lllIllIlllII[27]];
            return item.hasAction(strArr);
        }), this.by.minimumFood())) {
            ?? r0 = lllIllIlllII[2];
            "".length();
            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIlllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    public boolean c(TileItem tileItem) {
        int i;
        int i2;
        if (lIIIllIlIllllll(NPCs.getNearest(npc -> {
            if (lIIIllIlIlllIll(npc.getName().equalsIgnoreCase(lllIllIllIlI[lllIllIlllII[29]]) ? 1 : 0) && lIIIllIlIllllII(npc.isDead() ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return (-" ".length()) == "  ".length() ? ((((95 + 125) - 93) + 2) ^ (((129 + 140) - 186) + 67)) & (((((22 + 10) - (-36)) + 65) ^ (((119 + 24) - 102) + 105)) ^ (-" ".length())) : r0;
            }
            return lllIllIlllII[0];
        }))) {
            i = lllIllIlllII[2];
            "".length();
            if (((((119 + 96) - 129) + 103) ^ (((37 + 64) - 21) + 105)) != ((89 ^ 122) ^ (184 ^ 159))) {
                return ((100 ^ 39) ^ (48 ^ 105)) & (((((120 + 106) - 212) + 128) ^ (((120 + 125) - 239) + 142)) ^ (-" ".length()));
            }
        } else {
            i = lllIllIlllII[0];
        }
        int lllllllllllllllIIllIIllIIIIlIlIl = i;
        if (lIIIllIlIllllll(NPCs.getNearest(npc2 -> {
            if (lIIIllIlIlllIll(npc2.getName().equalsIgnoreCase(lllIllIllIlI[lllIllIlllII[28]]) ? 1 : 0) && lIIIllIlIllllII(npc2.isDead() ? 1 : 0)) {
                ?? r0 = lllIllIlllII[2];
                "".length();
                return (-(197 ^ 192)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIllIlllII[0];
        }))) {
            i2 = lllIllIlllII[2];
            "".length();
            if ((-" ".length()) > ((94 ^ 3) & ((98 ^ 63) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = lllIllIlllII[0];
        }
        int i3 = i2;
        SquireNightmarePlugin.d();
        boolean isEmpty = C0008e.ax().isEmpty();
        if (lIIIllIlIllllII(lllllllllllllllIIllIIllIIIIlIlIl) && lIIIllIlIllllII(i3) && lIIIllIlIlllllI(this.bz.aj()) && lIIIllIlIllllII(this.bz.ap()) && lIIIllIlIlllIll(isEmpty ? 1 : 0)) {
            ?? r0 = lllIllIlllII[2];
            "".length();
            return (((134 ^ 184) ^ (118 ^ 97)) & (((90 ^ 21) ^ (77 ^ 43)) ^ (-" ".length()))) != 0 ? ((65 ^ 5) ^ (166 ^ 131)) & (((((106 + 65) - 51) + 119) ^ (((117 + 118) - 110) + 17)) ^ (-" ".length())) : r0;
        }
        return lllIllIlllII[0];
    }
}
