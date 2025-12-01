package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.plugins.logout.Clues;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.c  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/c.class */
public class c {
    private static /* synthetic */ int[] llIll;
    public static /* synthetic */ WorldArea F;
    public static /* synthetic */ boolean E;
    private static /* synthetic */ String[] llIII;

    private static String llllIIl(String llllIllIlIlIlIl, String llllIllIlIlIlII) {
        try {
            SecretKeySpec llllIllIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIll[2], llllIllIlIllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIllIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIllIlIlIIIl) {
            llllIllIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public static void p() {
        if (lIIIIlIl(E ? 1 : 0)) {
            d.r();
        }
        if (lIIIIllI(E ? 1 : 0)) {
            if (lIIIIlIl(Inventory.contains(item -> {
                if (lIIIIlIl(item.getName().contains(llIII[llIll[29]]) ? 1 : 0) && lIIIIllI(item.getName().contains(llIII[llIll[30]]) ? 1 : 0)) {
                    ?? r0 = llIll[1];
                    "".length();
                    return ((((176 + 32) - 83) + 60) ^ (((142 + 145) - 130) + 32)) == 0 ? ((107 ^ 55) ^ (244 ^ 154)) & (((40 ^ 75) ^ (74 ^ 27)) ^ (-" ".length())) : r0;
                }
                return llIll[0];
            }) ? 1 : 0)) {
                System.out.println(llIII[llIll[0]]);
                E = llIll[1];
                Time.sleepTicks(k.c(llIll[2], llIll[3]));
                "".length();
                return;
            }
            f.E();
        }
        if (lIIIIlIl(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] iArr = new int[llIll[1]];
            iArr[llIll[0]] = llIll[4];
            if (lIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                TileObjects.getNearest(tileObject -> {
                    if (lIIIIlIl(tileObject.getName().contains(llIII[llIll[27]]) ? 1 : 0)) {
                        String[] strArr = new String[llIll[1]];
                        strArr[llIll[0]] = llIII[llIll[28]];
                        if (lIIIIlIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIll[1];
                            "".length();
                            return (-"  ".length()) > 0 ? ((10 ^ 30) ^ (33 ^ 120)) & (((((206 + 90) - 129) + 85) ^ (((87 + 171) - 180) + 99)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llIll[0];
                }).interact(llIII[llIll[1]]);
                Time.sleepUntil(() -> {
                    if (lIIIIllI(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = llIll[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIll[0];
                }, k.c(llIll[5], llIll[6]));
                "".length();
            }
        }
        if (lIIIIlIl(new WorldArea(llIll[7], llIll[8], llIll[9], llIll[10], llIll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIlIl(Dialog.isOpen() ? 1 : 0) && lIIIIllI(Bank.isOpen() ? 1 : 0)) {
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            String[] strArr = new String[llIll[1]];
            strArr[llIll[0]] = llIII[llIll[2]];
            if (lIIIIlll(worldLocation.distanceTo(TileObjects.getNearest(strArr).getWorldLocation()), llIll[2])) {
                while (lIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Clues.f0c = llIII[llIll[3]];
                    String[] strArr2 = new String[llIll[2]];
                    strArr2[llIll[0]] = llIII[llIll[11]];
                    strArr2[llIll[1]] = llIII[llIll[12]];
                    n.c(strArr2);
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
            }
        }
        if (lIIIIlIl(new WorldArea(llIll[13], llIll[14], llIll[15], llIll[15], llIll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIIl(Quests.getState(Quest.THE_GRAND_TREE), QuestState.FINISHED)) {
            int[] iArr2 = new int[llIll[1]];
            iArr2[llIll[0]] = llIll[16];
            if (lIIIIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIll[1]];
                iArr3[llIll[0]] = llIll[16];
                Inventory.getFirst(iArr3).interact(llIII[llIll[17]]);
                Time.sleepTicks(k.c(llIll[12], llIll[17]));
                "".length();
            }
        }
        if (lIIIIlIl(new WorldArea(llIll[18], llIll[14], llIll[19], llIll[20], llIll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Clues.f0c = llIII[llIll[21]];
            if (lIIIIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                String[] strArr3 = new String[llIll[1]];
                strArr3[llIll[0]] = llIII[llIll[22]];
                TileObjects.getNearest(strArr3).interact(llIII[llIll[23]]);
                Time.sleepTicks(k.c(llIll[12], llIll[17]));
                "".length();
            }
        }
        String[] strArr4 = new String[llIll[1]];
        strArr4[llIll[0]] = llIII[llIll[19]];
        if (lIIIIlIl(Inventory.contains(strArr4) ? 1 : 0)) {
            if (lIIIlIlI(Clues.j, llIll[1])) {
                Clues.i += llIll[1];
                Clues.j += llIll[1];
            }
            if (lIIIIlIl(Clues.f ? 1 : 0)) {
                String[] strArr5 = new String[llIll[1]];
                strArr5[llIll[0]] = llIII[llIll[24]];
                Inventory.getFirst(strArr5).interact(llIII[llIll[25]]);
                Time.sleepTicks(llIll[1]);
                "".length();
                Clues.g = llIll[1];
            }
            E = llIll[0];
        }
        String[] strArr6 = new String[llIll[1]];
        strArr6[llIll[0]] = llIII[llIll[15]];
        if (lIIIIlIl(Inventory.contains(strArr6) ? 1 : 0)) {
            String[] strArr7 = new String[llIll[1]];
            strArr7[llIll[0]] = llIII[llIll[26]];
            Inventory.getFirst(strArr7).interact(llIII[llIll[20]]);
            Time.sleepTicks(llIll[3]);
            "".length();
        }
    }

    private static boolean lIIIIlll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIIllI(int i) {
        return i == 0;
    }

    static {
        lIIIIlII();
        lllllll();
        F = new WorldArea(llIll[31], llIll[32], llIll[12], llIll[11], llIll[0]);
    }

    private static String llllIlI(String llllIllIIllIIII, String llllIllIIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllIIlIllll.getBytes(StandardCharsets.UTF_8)), llIll[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIllIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIllIIllIIIl) {
            llllIllIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String llllIII(String llllIllIlIIIlIl, String llllIllIIllllll) {
        String llllIllIlIIIlIl2 = new String(Base64.getDecoder().decode(llllIllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllIllIlIIIIlI = llllIllIIllllll.toCharArray();
        int llllIllIlIIIIIl = llIll[0];
        char[] charArray = llllIllIlIIIlIl2.toCharArray();
        int length = charArray.length;
        int llllIllIIlllIIl = llIll[0];
        while (lIIIlIlI(llllIllIIlllIIl, length)) {
            char llllIllIIlllIII = charArray[llllIllIIlllIIl];
            sb.append((char) (llllIllIIlllIII ^ llllIllIlIIIIlI[llllIllIlIIIIIl % llllIllIlIIIIlI.length]));
            "".length();
            llllIllIlIIIIIl++;
            llllIllIIlllIIl++;
            "".length();
            if ((-" ".length()) >= (((((110 + 80) - 63) + 30) ^ (((93 + 108) - 69) + 44)) & (((((139 + 55) - 64) + 29) ^ (((17 + 40) - (-64)) + 57)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lllllll() {
        llIII = new String[llIll[33]];
        llIII[llIll[0]] = llllIII("KgECdCtNDRohLw==", "mnvTJ");
        llIII[llIll[1]] = llllIII("Mi4OBWMOKA4F", "bGmnN");
        llIII[llIll[2]] = llllIIl("l5i3/waXXPg=", "TRvrf");
        llIII[llIll[3]] = llllIII("AC0pCA4hIiBMACk+NQUHOmwjBQMkIyAZBw==", "HLGlb");
        llIII[llIll[11]] = llllIlI("OP6yKGRLtfEkpybNOoSVgmjDYNo5cQuqml1JKymVzGQ=", "mSlmO");
        llIII[llIll[12]] = llllIIl("l4E/3/IwVXT2h6gam7oCxbnLivTRNSRisoEC1jinRrk=", "FhZol");
        llIII[llIll[17]] = llllIII("ETUJJBk=", "SGlEr");
        llIII[llIll[21]] = llllIIl("8q0tSgF/AwFO1d/7jthIKwcnNP+VGItf", "kULTR");
        llIII[llIll[22]] = llllIII("MjwnNyMVOyEp", "eTNEO");
        llIII[llIll[23]] = llllIlI("FGarJtNEezw=", "RcVBS");
        llIII[llIll[19]] = llllIII("BgMREDcwRgUQNj8DElFtMQcVCGw=", "TffqE");
        llIII[llIll[24]] = llllIlI("/MYI8KhkHEu32CgUPr0BUKKHZYyXNXWT", "fDRgU");
        llIII[llIll[25]] = llllIII("Nxw8GQ==", "xlYwE");
        llIII[llIll[15]] = llllIlI("Kla9jfJZL/Op71eP8myGeg==", "PKGEb");
        llIII[llIll[26]] = llllIlI("3lRVLC+b+TXmgN1AZAEsTA==", "cohHL");
        llIII[llIll[20]] = llllIlI("5nFciYQiod9bmWoFRS3NbA==", "dDbdZ");
        llIII[llIll[27]] = llllIII("DCkdFw==", "HFreu");
        llIII[llIll[28]] = llllIIl("/vDKc2g+FW9cmovr5+jxvw==", "YFwST");
        llIII[llIll[29]] = llllIIl("3OBFIc8lUCc=", "nbVsN");
        llIII[llIll[30]] = llllIII("DgsKDAQR", "cjyxa");
    }

    private static boolean lIIIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIIIlII() {
        llIll = new int[34];
        llIll[0] = ((((6 + 46) - (-58)) + 40) ^ (((105 + 127) - 91) + 28)) & (((52 ^ 77) ^ (56 ^ 126)) ^ (-" ".length()));
        llIll[1] = " ".length();
        llIll[2] = "  ".length();
        llIll[3] = "   ".length();
        llIll[4] = (-68) & 12259;
        llIll[5] = (-((-4131) & 23398)) & (-1) & 32767;
        llIll[6] = (-((-2081) & 19067)) & (-1) & 31486;
        llIll[7] = (-29189) & 32308;
        llIll[8] = (-((-26513) & 30687)) & (-16530) & 24319;
        llIll[9] = 113 ^ 85;
        llIll[10] = 116 ^ 110;
        llIll[11] = (191 ^ 197) ^ (85 ^ 43);
        llIll[12] = (((0 + 44) - 33) + 153) ^ (((41 + 154) - 51) + 17);
        llIll[13] = (-1107) & 3582;
        llIll[14] = (-20998) & 24503;
        llIll[15] = (((42 + 144) - 112) + 99) ^ (((138 + 131) - 126) + 17);
        llIll[16] = (-(((122 + 125) - 99) + 5)) & (-16417) & 24575;
        llIll[17] = 138 ^ 140;
        llIll[18] = (-21541) & 24047;
        llIll[19] = 133 ^ 143;
        llIll[20] = 66 ^ 77;
        llIll[21] = 126 ^ 121;
        llIll[22] = 17 ^ 25;
        llIll[23] = 188 ^ 181;
        llIll[24] = (((130 + 72) - 182) + 114) ^ (((115 + 28) - 87) + 85);
        llIll[25] = 74 ^ 70;
        llIll[26] = 86 ^ 88;
        llIll[27] = (127 ^ 46) ^ (84 ^ 21);
        llIll[28] = (9 ^ 58) ^ (157 ^ 191);
        llIll[29] = (0 ^ 47) ^ (11 ^ 54);
        llIll[30] = (((155 + 129) - 245) + 150) ^ (((11 + 158) - 27) + 32);
        llIll[31] = (-((-17345) & 26609)) & (-4107) & 16382;
        llIll[32] = (-((-545) & 13109)) & (-16385) & 32126;
        llIll[33] = 6 ^ 18;
    }

    private static boolean lIIIlIlI(int i, int i2) {
        return i < i2;
    }
}
