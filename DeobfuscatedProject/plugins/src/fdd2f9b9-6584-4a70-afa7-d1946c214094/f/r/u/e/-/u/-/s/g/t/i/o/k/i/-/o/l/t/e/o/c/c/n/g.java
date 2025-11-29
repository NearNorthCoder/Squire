/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class g {
    private static final /* synthetic */ int[] bn;
    private static final /* synthetic */ int bk;
    private static final /* synthetic */ int bi;
    private static final /* synthetic */ int bj;
    private static /* synthetic */ int[] lIIlllIlIl;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bm;
    private static /* synthetic */ String[] lIIlllIlII;

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.lIIIIlIIlllII(e.j(lIIlllIlIl[0]), lIIlllIlIl[1]) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlllIlIl[2]];
            stringArray2[g.lIIlllIlIl[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIIIIlIIllllI(list.size())) {
                ((NPC)list.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[3]]);
                Time.sleepTicks((int)lIIlllIlIl[4]);
                "".length();
            }
        }
        if (g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String lllllllllllllllllllllIIIlIlllIll;
            String[] stringArray3 = new String[lIIlllIlIl[2]];
            stringArray3[g.lIIlllIlIl[3]] = lllllllllllllllllllllIIIlIlllIll;
            List lllllllllllllllllllllIIIlIlllIIl = NPCs.getAll((String[])stringArray3);
            if (g.lIIIIlIIllllI(lllllllllllllllllllllIIIlIlllIIl.size())) {
                ((NPC)lllllllllllllllllllllIIIlIlllIIl.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIlllIlIl[5]);
                "".length();
            }
        }
        if (!g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[6]];
            if (g.lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                void lllllllllllllllllllllIIIlIlllIlI;
                Dialog.chooseOption((String[])lllllllllllllllllllllIIIlIlllIlI);
                "".length();
            }
            if (!g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlllIlIl[2]];
            stringArray2[g.lIIlllIlIl[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIIIIlIIllllI(list.size())) {
                ((NPC)list.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIlllIlIl[5]);
                "".length();
            }
        }
        while (!g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[10]];
                if (g.lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                    void lllllllllllllllllllllIIIlIlIlllI;
                    Dialog.chooseOption((String[])lllllllllllllllllllllIIIlIlIlllI);
                    "".length();
                }
                if (!g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)lIIlllIlIl[2]);
                "".length();
                "".length();
            }
            catch (Exception lllllllllllllllllllllIIIlIlIllIl) {
                // empty catch block
            }
            if (((0x9F ^ 0xC5) & ~(0xD6 ^ 0x8C)) != 0) {
                return;
            }
            Time.sleepTicks((int)lIIlllIlIl[2]);
            "".length();
            "".length();
            if (("  ".length() & ("  ".length() ^ -" ".length())) != -" ".length()) continue;
            return;
        }
    }

    public static void a(String[] stringArray) {
        if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            "".length();
        }
        if (!g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIIIIlIIllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIlIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIlIIllIIl(String lllllllllllllllllllllIIIIllllIII, String lllllllllllllllllllllIIIIlllIlll) {
        try {
            SecretKeySpec lllllllllllllllllllllIIIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIIIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllIIIIlllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllIIIIlllllII.init(lIIlllIlIl[6], lllllllllllllllllllllIIIIlllllIl);
            return new String(lllllllllllllllllllllIIIIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIIIllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllIIIIllllIll) {
            lllllllllllllllllllllIIIIllllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIIlIIlIlll(String lllllllllllllllllllllIIIlIIIllll, String lllllllllllllllllllllIIIlIIIlllI) {
        lllllllllllllllllllllIIIlIIIllll = new String(Base64.getDecoder().decode(lllllllllllllllllllllIIIlIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllIIIlIIIllIl = new StringBuilder();
        char[] lllllllllllllllllllllIIIlIIIllII = lllllllllllllllllllllIIIlIIIlllI.toCharArray();
        int lllllllllllllllllllllIIIlIIIlIll = lIIlllIlIl[3];
        char[] lllllllllllllllllllllIIIlIIIIlIl = lllllllllllllllllllllIIIlIIIllll.toCharArray();
        int lllllllllllllllllllllIIIlIIIIlII = lllllllllllllllllllllIIIlIIIIlIl.length;
        int lllllllllllllllllllllIIIlIIIIIll = lIIlllIlIl[3];
        while (g.lIIIIlIIlllII(lllllllllllllllllllllIIIlIIIIIll, lllllllllllllllllllllIIIlIIIIlII)) {
            char lllllllllllllllllllllIIIlIIlIIII = lllllllllllllllllllllIIIlIIIIlIl[lllllllllllllllllllllIIIlIIIIIll];
            lllllllllllllllllllllIIIlIIIllIl.append((char)(lllllllllllllllllllllIIIlIIlIIII ^ lllllllllllllllllllllIIIlIIIllII[lllllllllllllllllllllIIIlIIIlIll % lllllllllllllllllllllIIIlIIIllII.length]));
            "".length();
            ++lllllllllllllllllllllIIIlIIIlIll;
            ++lllllllllllllllllllllIIIlIIIIIll;
            "".length();
            if ("   ".length() != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllllIIIlIIIllIl);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.lIIIIlIIlllII(e.j(lIIlllIlIl[0]), lIIlllIlIl[1]) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlllIlIl[2]];
            stringArray2[g.lIIlllIlIl[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIIIIlIIllllI(list.size())) {
                ((NPC)list.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[7]]);
                Time.sleepTicks((int)lIIlllIlIl[4]);
                "".length();
            }
        }
        if (g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String lllllllllllllllllllllIIIlIllIlIl;
            String[] stringArray3 = new String[lIIlllIlIl[2]];
            stringArray3[g.lIIlllIlIl[3]] = lllllllllllllllllllllIIIlIllIlIl;
            List lllllllllllllllllllllIIIlIllIIll = NPCs.getAll((String[])stringArray3);
            if (g.lIIIIlIIllllI(lllllllllllllllllllllIIIlIllIIll.size())) {
                if (g.lIIIIlIIlllIl(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllllllllIIIlIllIIll.get(lIIlllIlIl[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)lllllllllllllllllllllIIIlIllIIll.get(lIIlllIlIl[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks((int)lIIlllIlIl[2]);
                    "".length();
                }
                if (g.lIIIIlIIlllll(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllllllllIIIlIllIIll.get(lIIlllIlIl[3]))) ? 1 : 0)) {
                    ((NPC)lllllllllllllllllllllIIIlIllIIll.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIlllIlIl[5]);
                    "".length();
                }
            }
        }
        if (!g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[4]];
            if (g.lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                void lllllllllllllllllllllIIIlIllIlII;
                Dialog.chooseOption((String[])lllllllllllllllllllllIIIlIllIlII);
                "".length();
            }
            if (!g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    static {
        g.lIIIIlIIllIll();
        g.lIIIIlIIllIlI();
        bl = lIIlllIlIl[11];
        bm = lIIlllIlIl[12];
        bj = lIIlllIlIl[13];
        bi = lIIlllIlIl[14];
        bk = lIIlllIlIl[15];
        int[] nArray = new int[lIIlllIlIl[4]];
        nArray[g.lIIlllIlIl[3]] = lIIlllIlIl[14];
        nArray[g.lIIlllIlIl[2]] = lIIlllIlIl[13];
        nArray[g.lIIlllIlIl[6]] = lIIlllIlIl[15];
        nArray[g.lIIlllIlIl[7]] = lIIlllIlIl[11];
        nArray[g.lIIlllIlIl[8]] = lIIlllIlIl[12];
        bn = nArray;
    }

    private static void lIIIIlIIllIll() {
        lIIlllIlIl = new int[17];
        g.lIIlllIlIl[0] = -(0xFFFFFFBF & 0x56C5) & (0xFFFFD7DF & 0x7FBD);
        g.lIIlllIlIl[1] = 0xFFFFA3ED & 0x5FFA;
        g.lIIlllIlIl[2] = " ".length();
        g.lIIlllIlIl[3] = (0x32 ^ 0x7F) & ~(0x4A ^ 7);
        g.lIIlllIlIl[4] = 93 + 74 - 96 + 104 ^ 63 + 117 - 56 + 46;
        g.lIIlllIlIl[5] = 0xFFFFEFBA & 0x1BFD;
        g.lIIlllIlIl[6] = "  ".length();
        g.lIIlllIlIl[7] = "   ".length();
        g.lIIlllIlIl[8] = 0xC7 ^ 0xA9 ^ (0xEC ^ 0x86);
        g.lIIlllIlIl[9] = 0x9B ^ 0x9D;
        g.lIIlllIlIl[10] = 0x56 ^ 0x41 ^ (0xAD ^ 0xBD);
        g.lIIlllIlIl[11] = 155 + 22 - 82 + 124;
        g.lIIlllIlIl[12] = (0x7E ^ 0xD) + (0x27 ^ 0x7F) - (38 + 163 - 150 + 115) + (170 + 21 - 173 + 174);
        g.lIIlllIlIl[13] = 153 + 164 - 159 + 73;
        g.lIIlllIlIl[14] = (0xDB ^ 0xB7) + (0xC3 ^ 0x83) - (106 + 124 - 123 + 33) + (140 + 53 - 122 + 90);
        g.lIIlllIlIl[15] = 154 + 20 - -13 + 30;
        g.lIIlllIlIl[16] = 0xA4 ^ 0xAC;
    }

    private static void lIIIIlIIllIlI() {
        lIIlllIlII = new String[lIIlllIlIl[16]];
        g.lIIlllIlII[g.lIIlllIlIl[3]] = g.lIIIIlIIlIlll("AjIBHGciPA==", "VSmwJ");
        g.lIIlllIlII[g.lIIlllIlIl[2]] = g.lIIIIlIIllIII("g4qyBd/n7Is=", "rKGgM");
        g.lIIlllIlII[g.lIIlllIlIl[6]] = g.lIIIIlIIllIII("V/8Dh89VkhYbNCl7Vb/Zdg==", "VWxWQ");
        g.lIIlllIlII[g.lIIlllIlIl[7]] = g.lIIIIlIIllIIl("y0zcqAREIV8=", "hbyNK");
        g.lIIlllIlII[g.lIIlllIlIl[8]] = g.lIIIIlIIllIIl("Kcy/OjezWgA=", "GJClW");
        g.lIIlllIlII[g.lIIlllIlIl[4]] = g.lIIIIlIIlIlll("CzIfFjQhNBdZIyE7HBYg", "HZpyG");
        g.lIIlllIlII[g.lIIlllIlIl[9]] = g.lIIIIlIIlIlll("Lig7OGQOJg==", "zIWSI");
        g.lIIlllIlII[g.lIIlllIlIl[10]] = g.lIIIIlIIllIIl("4Kf50QJmWtKcxPLlwaf6PQ==", "WBfIj");
    }

    private static boolean lIIIIlIIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIlIIlllll(int n2) {
        return n2 != 0;
    }

    private static String lIIIIlIIllIII(String lllllllllllllllllllllIIIlIIlllll, String lllllllllllllllllllllIIIlIIllllI) {
        try {
            SecretKeySpec lllllllllllllllllllllIIIlIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIIlIIllllI.getBytes(StandardCharsets.UTF_8)), lIIlllIlIl[16]), "DES");
            Cipher lllllllllllllllllllllIIIlIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllllllllllIIIlIlIIIIl.init(lIIlllIlIl[6], lllllllllllllllllllllIIIlIlIIIlI);
            return new String(lllllllllllllllllllllIIIlIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllllIIIlIlIIIII) {
            lllllllllllllllllllllIIIlIlIIIII.printStackTrace();
            return null;
        }
    }

    public static boolean K() {
        int lllllllllllllllllllllIIIlIlIlIII = lIIlllIlIl[3];
        while (g.lIIIIlIIlllII(lllllllllllllllllllllIIIlIlIlIII, bn.length)) {
            List lllllllllllllllllllllIIIlIlIIlll = Widgets.get((int)bn[lllllllllllllllllllllIIIlIlIlIII]);
            if (g.lIIIIlIIlllIl(lllllllllllllllllllllIIIlIlIIlll.isEmpty() ? 1 : 0) && g.lIIIIlIIlllll(((Widget)lllllllllllllllllllllIIIlIlIIlll.get(lIIlllIlIl[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bn[lllllllllllllllllllllIIIlIlIlIII]);
                return lIIlllIlIl[2];
            }
            ++lllllllllllllllllllllIIIlIlIlIII;
            "".length();
            if ("  ".length() >= 0) continue;
            return ((39 + 6 - -13 + 97 ^ 42 + 130 - 164 + 149) & (0x22 ^ 0x58 ^ (0x1F ^ 0x63) ^ -" ".length())) != 0;
        }
        return lIIlllIlIl[3];
    }
}

