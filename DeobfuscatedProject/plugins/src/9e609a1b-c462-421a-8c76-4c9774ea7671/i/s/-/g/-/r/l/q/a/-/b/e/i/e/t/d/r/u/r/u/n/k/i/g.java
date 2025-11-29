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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
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
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int bn;
    private static /* synthetic */ String[] lIIIlllllIIlI;
    private static final /* synthetic */ int[] bs;
    private static final /* synthetic */ int bo;
    private static final /* synthetic */ int br;
    private static /* synthetic */ int[] lIIIlllllIlII;
    private static final /* synthetic */ int bp;

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIlllllIlII[2]];
            stringArray2[g.lIIIlllllIlII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIllIIlIlIIl(list.size())) {
                ((NPC)list.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIIlllllIlII[5]);
                "".length();
            }
        }
        while (!g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[10]];
                if (g.lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                    void lllllllllllllllIIIIIIIlIIIlllIll;
                    Dialog.chooseOption((String[])lllllllllllllllIIIIIIIlIIIlllIll);
                    "".length();
                }
                if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)lIIIlllllIlII[2]);
                "".length();
                "".length();
            }
            catch (Exception lllllllllllllllIIIIIIIlIIIlllIlI) {
                // empty catch block
            }
            if ((0x23 ^ 0x52 ^ (0x30 ^ 0x45)) < (0x6E ^ 0x43 ^ (0x72 ^ 0x5B))) {
                return;
            }
            Time.sleepTicks((int)lIIIlllllIlII[2]);
            "".length();
            "".length();
            if (" ".length() >= ((0x7F ^ 0x6C ^ (0x8D ^ 0xC5)) & (117 + 136 - 250 + 206 ^ 130 + 125 - 200 + 83 ^ -" ".length()))) continue;
            return;
        }
    }

    private static String lIlIIllIIlIIIII(String lllllllllllllllIIIIIIIlIIIIIIlIl, String lllllllllllllllIIIIIIIlIIIIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIIlIIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIlIIIIIIllI.getBytes(StandardCharsets.UTF_8)), lIIIlllllIlII[16]), "DES");
            Cipher lllllllllllllllIIIIIIIlIIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIIlIIIIIlIIl.init(lIIIlllllIlII[6], lllllllllllllllIIIIIIIlIIIIIlIlI);
            return new String(lllllllllllllllIIIIIIIlIIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIlIIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIIlIIIIIlIII) {
            lllllllllllllllIIIIIIIlIIIIIlIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.lIlIIllIIlIIlll(e.j(lIIIlllllIlII[0]), lIIIlllllIlII[1]) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIlllllIlII[2]];
            stringArray2[g.lIIIlllllIlII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIllIIlIlIIl(list.size())) {
                ((NPC)list.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[3]]);
                Time.sleepTicks((int)lIIIlllllIlII[4]);
                "".length();
            }
        }
        if (g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String lllllllllllllllIIIIIIIlIIlIIlIII;
            String[] stringArray3 = new String[lIIIlllllIlII[2]];
            stringArray3[g.lIIIlllllIlII[3]] = lllllllllllllllIIIIIIIlIIlIIlIII;
            List lllllllllllllllIIIIIIIlIIlIIIllI = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIllIIlIlIIl(lllllllllllllllIIIIIIIlIIlIIIllI.size())) {
                ((NPC)lllllllllllllllIIIIIIIlIIlIIIllI.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIIlllllIlII[5]);
                "".length();
            }
        }
        if (!g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[6]];
            if (g.lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                void lllllllllllllllIIIIIIIlIIlIIIlll;
                Dialog.chooseOption((String[])lllllllllllllllIIIIIIIlIIlIIIlll);
                "".length();
            }
            if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static boolean lIlIIllIIlIlIIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.lIlIIllIIlIIlll(e.j(lIIIlllllIlII[0]), lIIIlllllIlII[1]) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIlllllIlII[2]];
            stringArray2[g.lIIIlllllIlII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIllIIlIlIIl(list.size())) {
                ((NPC)list.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[7]]);
                Time.sleepTicks((int)lIIIlllllIlII[4]);
                "".length();
            }
        }
        if (g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String lllllllllllllllIIIIIIIlIIlIIIIlI;
            String[] stringArray3 = new String[lIIIlllllIlII[2]];
            stringArray3[g.lIIIlllllIlII[3]] = lllllllllllllllIIIIIIIlIIlIIIIlI;
            List lllllllllllllllIIIIIIIlIIlIIIIII = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIllIIlIlIIl(lllllllllllllllIIIIIIIlIIlIIIIII.size())) {
                if (g.lIlIIllIIlIlIII(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllIIIIIIIlIIlIIIIII.get(lIIIlllllIlII[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)lllllllllllllllIIIIIIIlIIlIIIIII.get(lIIIlllllIlII[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks((int)lIIIlllllIlII[2]);
                    "".length();
                }
                if (g.lIlIIllIIlIlIlI(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllIIIIIIIlIIlIIIIII.get(lIIIlllllIlII[3]))) ? 1 : 0)) {
                    ((NPC)lllllllllllllllIIIIIIIlIIlIIIIII.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIIlllllIlII[5]);
                    "".length();
                }
            }
        }
        if (!g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[4]];
            if (g.lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                void lllllllllllllllIIIIIIIlIIlIIIIIl;
                Dialog.chooseOption((String[])lllllllllllllllIIIIIIIlIIlIIIIIl);
                "".length();
            }
            if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static String lIlIIllIIlIIIIl(String lllllllllllllllIIIIIIIlIIIIlllII, String lllllllllllllllIIIIIIIlIIIIllIll) {
        lllllllllllllllIIIIIIIlIIIIlllII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIIlIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIIlIIIIllIlI = new StringBuilder();
        char[] lllllllllllllllIIIIIIIlIIIIllIIl = lllllllllllllllIIIIIIIlIIIIllIll.toCharArray();
        int lllllllllllllllIIIIIIIlIIIIllIII = lIIIlllllIlII[3];
        char[] lllllllllllllllIIIIIIIlIIIIlIIlI = lllllllllllllllIIIIIIIlIIIIlllII.toCharArray();
        int lllllllllllllllIIIIIIIlIIIIlIIIl = lllllllllllllllIIIIIIIlIIIIlIIlI.length;
        int lllllllllllllllIIIIIIIlIIIIlIIII = lIIIlllllIlII[3];
        while (g.lIlIIllIIlIIlll(lllllllllllllllIIIIIIIlIIIIlIIII, lllllllllllllllIIIIIIIlIIIIlIIIl)) {
            char lllllllllllllllIIIIIIIlIIIIlllIl = lllllllllllllllIIIIIIIlIIIIlIIlI[lllllllllllllllIIIIIIIlIIIIlIIII];
            lllllllllllllllIIIIIIIlIIIIllIlI.append((char)(lllllllllllllllIIIIIIIlIIIIlllIl ^ lllllllllllllllIIIIIIIlIIIIllIIl[lllllllllllllllIIIIIIIlIIIIllIII % lllllllllllllllIIIIIIIlIIIIllIIl.length]));
            "".length();
            ++lllllllllllllllIIIIIIIlIIIIllIII;
            ++lllllllllllllllIIIIIIIlIIIIlIIII;
            "".length();
            if (-" ".length() != " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIIIlIIIIllIlI);
    }

    private static boolean lIlIIllIIlIlIlI(int n2) {
        return n2 != 0;
    }

    static {
        g.lIlIIllIIlIIllI();
        g.lIlIIllIIlIIlIl();
        bp = lIIIlllllIlII[11];
        bq = lIIIlllllIlII[12];
        br = lIIIlllllIlII[13];
        bo = lIIIlllllIlII[14];
        bn = lIIIlllllIlII[15];
        int[] nArray = new int[lIIIlllllIlII[4]];
        nArray[g.lIIIlllllIlII[3]] = lIIIlllllIlII[15];
        nArray[g.lIIIlllllIlII[2]] = lIIIlllllIlII[14];
        nArray[g.lIIIlllllIlII[6]] = lIIIlllllIlII[11];
        nArray[g.lIIIlllllIlII[7]] = lIIIlllllIlII[12];
        nArray[g.lIIIlllllIlII[8]] = lIIIlllllIlII[13];
        bs = nArray;
    }

    private static boolean lIlIIllIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static void lIlIIllIIlIIlIl() {
        lIIIlllllIIlI = new String[lIIIlllllIlII[16]];
        g.lIIIlllllIIlI[g.lIIIlllllIlII[3]] = g.lIlIIllIIIlllll("vqEeg/EaHLE=", "tkslx");
        g.lIIIlllllIIlI[g.lIIIlllllIlII[2]] = g.lIlIIllIIlIIIII("gcZZg0XjEDU=", "RnXiJ");
        g.lIIIlllllIIlI[g.lIIIlllllIlII[6]] = g.lIlIIllIIlIIIII("kwqgfwXQdymhQlBSPp6U9g==", "RRPxa");
        g.lIIIlllllIIlI[g.lIIIlllllIlII[7]] = g.lIlIIllIIlIIIII("K8lysuvMmAc=", "KOAPf");
        g.lIIIlllllIIlI[g.lIIIlllllIlII[8]] = g.lIlIIllIIIlllll("Lu0e80JQLq4=", "eGdDe");
        g.lIIIlllllIIlI[g.lIIIlllllIlII[4]] = g.lIlIIllIIlIIIIl("Ly4uGAIFKCZXFQUnLRgW", "lFAwq");
        g.lIIIlllllIIlI[g.lIIIlllllIlII[9]] = g.lIlIIllIIIlllll("FQy5M7MTL04=", "KlYxD");
        g.lIIIlllllIIlI[g.lIIIlllllIlII[10]] = g.lIlIIllIIIlllll("4xU7uRPqcI4SYCepmESrRQ==", "jsIBL");
    }

    public static boolean L() {
        int lllllllllllllllIIIIIIIlIIIllIlIl = lIIIlllllIlII[3];
        while (g.lIlIIllIIlIIlll(lllllllllllllllIIIIIIIlIIIllIlIl, bs.length)) {
            List lllllllllllllllIIIIIIIlIIIllIlII = Widgets.get((int)bs[lllllllllllllllIIIIIIIlIIIllIlIl]);
            if (g.lIlIIllIIlIlIII(lllllllllllllllIIIIIIIlIIIllIlII.isEmpty() ? 1 : 0) && g.lIlIIllIIlIlIlI(((Widget)lllllllllllllllIIIIIIIlIIIllIlII.get(lIIIlllllIlII[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bs[lllllllllllllllIIIIIIIlIIIllIlIl]);
                return lIIIlllllIlII[2];
            }
            ++lllllllllllllllIIIIIIIlIIIllIlIl;
            "".length();
            if (-" ".length() < 0) continue;
            return ((0xC9 ^ 0xC6) & ~(0x6D ^ 0x62)) != 0;
        }
        return lIIIlllllIlII[3];
    }

    private static void lIlIIllIIlIIllI() {
        lIIIlllllIlII = new int[17];
        g.lIIIlllllIlII[0] = -(137 + 148 - 265 + 177) & (0xFFFF95DF & 0x6BFD);
        g.lIIIlllllIlII[1] = -(0xFFFFED3B & 0x3ED5) & (0xFFFFFFFC & 0x2FFB);
        g.lIIIlllllIlII[2] = " ".length();
        g.lIIIlllllIlII[3] = "  ".length() & ~"  ".length();
        g.lIIIlllllIlII[4] = "   ".length() ^ (0x17 ^ 0x11);
        g.lIIIlllllIlII[5] = -(0xFFFFB9B5 & 0x764F) & (0xFFFFBFBF & 0x7BFC);
        g.lIIIlllllIlII[6] = "  ".length();
        g.lIIIlllllIlII[7] = "   ".length();
        g.lIIIlllllIlII[8] = 0x28 ^ 0x2C;
        g.lIIIlllllIlII[9] = 0x3F ^ 0x39;
        g.lIIIlllllIlII[10] = 0x4E ^ 0x5C ^ (0x57 ^ 0x42);
        g.lIIIlllllIlII[11] = (0xDA ^ 0xB8) + (0x6E ^ 0x5B) - (0x89 ^ 0xAA) + (0xF3 ^ 0x96);
        g.lIIIlllllIlII[12] = (0x58 ^ 0x6A) + (115 + 81 - 81 + 76) - (0x39 ^ 0x5A) + (0xE2 ^ 0xAF);
        g.lIIIlllllIlII[13] = 96 + 145 - 133 + 121;
        g.lIIIlllllIlII[14] = 125 + 136 - 104 + 74;
        g.lIIIlllllIlII[15] = 135 + 16 - 49 + 91;
        g.lIIIlllllIlII[16] = 37 + 150 - 29 + 13 ^ 36 + 143 - 158 + 142;
    }

    private static String lIlIIllIIIlllll(String lllllllllllllllIIIIIIIlIIIlIllII, String lllllllllllllllIIIIIIIlIIIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIIlIIIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIIlIIIlIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIIlIIIlIlllI.init(lIIIlllllIlII[6], lllllllllllllllIIIIIIIlIIIlIllll);
            return new String(lllllllllllllllIIIIIIIlIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIIlIIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIIIlIIIlIllIl) {
            lllllllllllllllIIIIIIIlIIIlIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static void a(String[] stringArray) {
        if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            "".length();
        }
        if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}

