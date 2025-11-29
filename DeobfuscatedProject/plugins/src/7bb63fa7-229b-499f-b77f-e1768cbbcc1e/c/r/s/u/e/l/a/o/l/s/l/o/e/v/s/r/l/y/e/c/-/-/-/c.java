/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-;

import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.d;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.f;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k;
import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.n;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.plugins.logout.Clues;

public class c {
    private static /* synthetic */ int[] llIll;
    public static /* synthetic */ WorldArea F;
    public static /* synthetic */ boolean E;
    private static /* synthetic */ String[] llIII;

    private static String llllIIl(String llllIllIlIlIlIl, String llllIllIlIlIIlI) {
        try {
            SecretKeySpec llllIllIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIllIlIlIlll = Cipher.getInstance("Blowfish");
            llllIllIlIlIlll.init(llIll[2], llllIllIlIllIII);
            return new String(llllIllIlIlIlll.doFinal(Base64.getDecoder().decode(llllIllIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIlIlIllI) {
            llllIllIlIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIlIl(int n2) {
        return n2 != 0;
    }

    public static void p() {
        WorldArea llllIllIllIIIIl;
        WorldArea llllIllIllIIIlI;
        WorldArea llllIllIllIIIll;
        if (c.lIIIIlIl(E ? 1 : 0)) {
            d.r();
        }
        if (c.lIIIIllI(E ? 1 : 0)) {
            if (c.lIIIIlIl(Inventory.contains(item -> {
                int n2;
                if (c.lIIIIlIl(item.getName().contains(llIII[llIll[29]]) ? 1 : 0) && c.lIIIIllI(item.getName().contains(llIII[llIll[30]]) ? 1 : 0)) {
                    n2 = llIll[1];
                    "".length();
                    if ((176 + 32 - 83 + 60 ^ 142 + 145 - 130 + 32) == 0) {
                        return ((0x6B ^ 0x37 ^ (0xF4 ^ 0x9A)) & (0x28 ^ 0x4B ^ (0x4A ^ 0x1B) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIll[0];
                }
                return n2 != 0;
            }) ? 1 : 0)) {
                System.out.println(llIII[llIll[0]]);
                E = llIll[1];
                Time.sleepTicks((int)k.c(llIll[2], llIll[3]));
                "".length();
                return;
            }
            f.E();
        }
        if (c.lIIIIlIl(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] nArray = new int[llIll[1]];
            nArray[c.llIll[0]] = llIll[4];
            if (c.lIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (c.lIIIIlIl(tileObject.getName().contains(llIII[llIll[27]]) ? 1 : 0)) {
                        String[] stringArray = new String[llIll[1]];
                        stringArray[c.llIll[0]] = llIII[llIll[28]];
                        if (c.lIIIIlIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llIll[1];
                            "".length();
                            if (-"  ".length() <= 0) return n2 != 0;
                            return ((0xA ^ 0x1E ^ (0x21 ^ 0x78)) & (206 + 90 - 129 + 85 ^ 87 + 171 - 180 + 99 ^ -" ".length())) != 0;
                        }
                    }
                    n2 = llIll[0];
                    return n2 != 0;
                }).interact(llIII[llIll[1]]);
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (c.lIIIIllI(F.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        bl = llIll[1];
                        "".length();
                        if (((0x6C ^ 0x65) & ~(0x7D ^ 0x74)) != 0) {
                            return ((0x27 ^ 0x11) & ~(0x2F ^ 0x19)) != 0;
                        }
                    } else {
                        bl = llIll[0];
                    }
                    return bl;
                }, (int)k.c(llIll[5], llIll[6]));
                "".length();
            }
        }
        if (c.lIIIIlIl((llllIllIllIIIll = new WorldArea(llIll[7], llIll[8], llIll[9], llIll[10], llIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && c.lIIIIlIl(Dialog.isOpen() ? 1 : 0) && c.lIIIIllI(Bank.isOpen() ? 1 : 0)) {
            String[] stringArray = new String[llIll[1]];
            stringArray[c.llIll[0]] = llIII[llIll[2]];
            if (c.lIIIIlll(Players.getLocal().getWorldLocation().distanceTo(TileObjects.getNearest((String[])stringArray).getWorldLocation()), llIll[2])) {
                while (c.lIIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                    Clues.c = llIII[llIll[3]];
                    String[] stringArray2 = new String[llIll[2]];
                    stringArray2[c.llIll[0]] = llIII[llIll[11]];
                    stringArray2[c.llIll[1]] = llIII[llIll[12]];
                    n.c(stringArray2);
                    "".length();
                    if ("  ".length() > 0) continue;
                    return;
                }
            }
        }
        if (c.lIIIIlIl((llllIllIllIIIlI = new WorldArea(llIll[13], llIll[14], llIll[15], llIll[15], llIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && c.lIIIlIIl(Quests.getState((Quest)Quest.THE_GRAND_TREE), QuestState.FINISHED)) {
            int[] nArray = new int[llIll[1]];
            nArray[c.llIll[0]] = llIll[16];
            if (c.lIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIll[1]];
                nArray2[c.llIll[0]] = llIll[16];
                Inventory.getFirst((int[])nArray2).interact(llIII[llIll[17]]);
                Time.sleepTicks((int)k.c(llIll[12], llIll[17]));
                "".length();
            }
        }
        if (c.lIIIIlIl((llllIllIllIIIIl = new WorldArea(llIll[18], llIll[14], llIll[19], llIll[20], llIll[0])).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            Clues.c = llIII[llIll[21]];
            if (c.lIIIIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                String[] stringArray = new String[llIll[1]];
                stringArray[c.llIll[0]] = llIII[llIll[22]];
                TileObjects.getNearest((String[])stringArray).interact(llIII[llIll[23]]);
                Time.sleepTicks((int)k.c(llIll[12], llIll[17]));
                "".length();
            }
        }
        String[] stringArray = new String[llIll[1]];
        stringArray[c.llIll[0]] = llIII[llIll[19]];
        if (c.lIIIIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (c.lIIIlIlI(Clues.j, llIll[1])) {
                Clues.i += llIll[1];
                Clues.j += llIll[1];
            }
            if (c.lIIIIlIl(Clues.f ? 1 : 0)) {
                String[] stringArray3 = new String[llIll[1]];
                stringArray3[c.llIll[0]] = llIII[llIll[24]];
                Inventory.getFirst((String[])stringArray3).interact(llIII[llIll[25]]);
                Time.sleepTicks((int)llIll[1]);
                "".length();
                Clues.g = llIll[1];
            }
            E = llIll[0];
        }
        String[] stringArray4 = new String[llIll[1]];
        stringArray4[c.llIll[0]] = llIII[llIll[15]];
        if (c.lIIIIlIl(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
            String[] stringArray5 = new String[llIll[1]];
            stringArray5[c.llIll[0]] = llIII[llIll[26]];
            Inventory.getFirst((String[])stringArray5).interact(llIII[llIll[20]]);
            Time.sleepTicks((int)llIll[3]);
            "".length();
        }
    }

    private static boolean lIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIllI(int n2) {
        return n2 == 0;
    }

    static {
        c.lIIIIlII();
        c.lllllll();
        F = new WorldArea(llIll[31], llIll[32], llIll[12], llIll[11], llIll[0]);
    }

    private static String llllIlI(String llllIllIIllIIII, String llllIllIIlIllIl) {
        try {
            SecretKeySpec llllIllIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIllIIlIllIl.getBytes(StandardCharsets.UTF_8)), llIll[22]), "DES");
            Cipher llllIllIIllIIlI = Cipher.getInstance("DES");
            llllIllIIllIIlI.init(llIll[2], llllIllIIllIIll);
            return new String(llllIllIIllIIlI.doFinal(Base64.getDecoder().decode(llllIllIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIllIIllIIIl) {
            llllIllIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String llllIII(String llllIllIlIIIIII, String llllIllIlIIIlII) {
        llllIllIlIIIIII = new String(Base64.getDecoder().decode(llllIllIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIllIlIIIIll = new StringBuilder();
        char[] llllIllIlIIIIlI = llllIllIlIIIlII.toCharArray();
        int llllIllIlIIIIIl = llIll[0];
        char[] llllIllIIlllIll = llllIllIlIIIIII.toCharArray();
        int llllIllIIlllIlI = llllIllIIlllIll.length;
        int llllIllIIlllIIl = llIll[0];
        while (c.lIIIlIlI(llllIllIIlllIIl, llllIllIIlllIlI)) {
            char llllIllIlIIIllI = llllIllIIlllIll[llllIllIIlllIIl];
            llllIllIlIIIIll.append((char)(llllIllIlIIIllI ^ llllIllIlIIIIlI[llllIllIlIIIIIl % llllIllIlIIIIlI.length]));
            "".length();
            ++llllIllIlIIIIIl;
            ++llllIllIIlllIIl;
            "".length();
            if (-" ".length() < ((110 + 80 - 63 + 30 ^ 93 + 108 - 69 + 44) & (139 + 55 - 64 + 29 ^ 17 + 40 - -64 + 57 ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(llllIllIlIIIIll);
    }

    private static void lllllll() {
        llIII = new String[llIll[33]];
        c.llIII[c.llIll[0]] = c.llllIII("KgECdCtNDRohLw==", "mnvTJ");
        c.llIII[c.llIll[1]] = c.llllIII("Mi4OBWMOKA4F", "bGmnN");
        c.llIII[c.llIll[2]] = c.llllIIl("l5i3/waXXPg=", "TRvrf");
        c.llIII[c.llIll[3]] = c.llllIII("AC0pCA4hIiBMACk+NQUHOmwjBQMkIyAZBw==", "HLGlb");
        c.llIII[c.llIll[11]] = c.llllIlI("OP6yKGRLtfEkpybNOoSVgmjDYNo5cQuqml1JKymVzGQ=", "mSlmO");
        c.llIII[c.llIll[12]] = c.llllIIl("l4E/3/IwVXT2h6gam7oCxbnLivTRNSRisoEC1jinRrk=", "FhZol");
        c.llIII[c.llIll[17]] = c.llllIII("ETUJJBk=", "SGlEr");
        c.llIII[c.llIll[21]] = c.llllIIl("8q0tSgF/AwFO1d/7jthIKwcnNP+VGItf", "kULTR");
        c.llIII[c.llIll[22]] = c.llllIII("MjwnNyMVOyEp", "eTNEO");
        c.llIII[c.llIll[23]] = c.llllIlI("FGarJtNEezw=", "RcVBS");
        c.llIII[c.llIll[19]] = c.llllIII("BgMREDcwRgUQNj8DElFtMQcVCGw=", "TffqE");
        c.llIII[c.llIll[24]] = c.llllIlI("/MYI8KhkHEu32CgUPr0BUKKHZYyXNXWT", "fDRgU");
        c.llIII[c.llIll[25]] = c.llllIII("Nxw8GQ==", "xlYwE");
        c.llIII[c.llIll[15]] = c.llllIlI("Kla9jfJZL/Op71eP8myGeg==", "PKGEb");
        c.llIII[c.llIll[26]] = c.llllIlI("3lRVLC+b+TXmgN1AZAEsTA==", "cohHL");
        c.llIII[c.llIll[20]] = c.llllIlI("5nFciYQiod9bmWoFRS3NbA==", "dDbdZ");
        c.llIII[c.llIll[27]] = c.llllIII("DCkdFw==", "HFreu");
        c.llIII[c.llIll[28]] = c.llllIIl("/vDKc2g+FW9cmovr5+jxvw==", "YFwST");
        c.llIII[c.llIll[29]] = c.llllIIl("3OBFIc8lUCc=", "nbVsN");
        c.llIII[c.llIll[30]] = c.llllIII("DgsKDAQR", "cjyxa");
    }

    private static boolean lIIIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIIIlII() {
        llIll = new int[34];
        c.llIll[0] = (6 + 46 - -58 + 40 ^ 105 + 127 - 91 + 28) & (0x34 ^ 0x4D ^ (0x38 ^ 0x7E) ^ -" ".length());
        c.llIll[1] = " ".length();
        c.llIll[2] = "  ".length();
        c.llIll[3] = "   ".length();
        c.llIll[4] = 0xFFFFFFBC & 0x2FE3;
        c.llIll[5] = -(0xFFFFEFDD & 0x5B66) & (0xFFFFFFFF & Short.MAX_VALUE);
        c.llIll[6] = -(0xFFFFF7DF & 0x4A7B) & (0xFFFFFFFF & 0x7AFE);
        c.llIll[7] = 0xFFFF8DFB & 0x7E34;
        c.llIll[8] = -(0xFFFF986F & 0x77DF) & (0xFFFFBF6E & 0x5EFF);
        c.llIll[9] = 0x71 ^ 0x55;
        c.llIll[10] = 0x74 ^ 0x6E;
        c.llIll[11] = 0xBF ^ 0xC5 ^ (0x55 ^ 0x2B);
        c.llIll[12] = 0 + 44 - 33 + 153 ^ 41 + 154 - 51 + 17;
        c.llIll[13] = 0xFFFFFBAD & 0xDFE;
        c.llIll[14] = 0xFFFFADFA & 0x5FB7;
        c.llIll[15] = 42 + 144 - 112 + 99 ^ 138 + 131 - 126 + 17;
        c.llIll[16] = -(122 + 125 - 99 + 5) & (0xFFFFBFDF & 0x5FFF);
        c.llIll[17] = 0x8A ^ 0x8C;
        c.llIll[18] = 0xFFFFABDB & 0x5DEF;
        c.llIll[19] = 0x85 ^ 0x8F;
        c.llIll[20] = 0x42 ^ 0x4D;
        c.llIll[21] = 0x7E ^ 0x79;
        c.llIll[22] = 0x11 ^ 0x19;
        c.llIll[23] = 0xBC ^ 0xB5;
        c.llIll[24] = 130 + 72 - 182 + 114 ^ 115 + 28 - 87 + 85;
        c.llIll[25] = 0x4A ^ 0x46;
        c.llIll[26] = 0x56 ^ 0x58;
        c.llIll[27] = 0x7F ^ 0x2E ^ (0x54 ^ 0x15);
        c.llIll[28] = 9 ^ 0x3A ^ (0x9D ^ 0xBF);
        c.llIll[29] = 0 ^ 0x2F ^ (0xB ^ 0x36);
        c.llIll[30] = 155 + 129 - 245 + 150 ^ 11 + 158 - 27 + 32;
        c.llIll[31] = -(0xFFFFBC3F & 0x67F1) & (0xFFFFEFF5 & 0x3FFE);
        c.llIll[32] = -(0xFFFFFDDF & 0x3335) & (0xFFFFBFFF & 0x7D7E);
        c.llIll[33] = 6 ^ 0x12;
    }

    private static boolean lIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }
}

