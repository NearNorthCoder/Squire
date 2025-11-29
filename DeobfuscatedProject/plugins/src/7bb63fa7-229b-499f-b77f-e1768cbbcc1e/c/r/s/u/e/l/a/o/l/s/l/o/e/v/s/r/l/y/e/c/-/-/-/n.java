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
package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-;

import c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.k;
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
import net.unethicalite.plugins.logout.Clues;

public class n {
    private static final /* synthetic */ int cc;
    private static final /* synthetic */ int bZ;
    private static final /* synthetic */ int[] ce;
    private static /* synthetic */ int[] llll;
    private static final /* synthetic */ int cd;
    private static /* synthetic */ String[] lllI;
    private static final /* synthetic */ int cb;
    private static final /* synthetic */ int ca;

    private static String lIIIlll(String lllllIlIlllIIlI, String lllllIlIlllIIIl) {
        lllllIlIlllIIlI = new String(Base64.getDecoder().decode(lllllIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllIlIlllIlIl = new StringBuilder();
        char[] lllllIlIlllIlII = lllllIlIlllIIIl.toCharArray();
        int lllllIlIlllIIll = llll[3];
        char[] lllllIlIllIllIl = lllllIlIlllIIlI.toCharArray();
        int lllllIlIllIllII = lllllIlIllIllIl.length;
        int lllllIlIllIlIll = llll[3];
        while (n.lIIlIlI(lllllIlIllIlIll, lllllIlIllIllII)) {
            char lllllIlIllllIII = lllllIlIllIllIl[lllllIlIllIlIll];
            lllllIlIlllIlIl.append((char)(lllllIlIllllIII ^ lllllIlIlllIlII[lllllIlIlllIIll % lllllIlIlllIlII.length]));
            "".length();
            ++lllllIlIlllIIll;
            ++lllllIlIllIlIll;
            "".length();
            if (((164 + 58 - 137 + 125 ^ 175 + 170 - 167 + 15) & (8 ^ 7 ^ (0x9A ^ 0x86) ^ -" ".length())) <= ((89 + 83 - 138 + 122 ^ 0 + 173 - 104 + 128) & (0x5F ^ 0x67 ^ (0x79 ^ 0x18) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllIlIlllIlIl);
    }

    private static void lIIlIIl() {
        llll = new int[17];
        n.llll[0] = 0xFFFFD55F & 0x2BB9;
        n.llll[1] = 0xFFFFF7ED & 0xBFA;
        n.llll[2] = " ".length();
        n.llll[3] = (0x79 ^ 0x3F ^ (9 ^ 0x1D)) & (192 + 50 - 191 + 178 ^ 50 + 6 - -50 + 77 ^ -" ".length());
        n.llll[4] = 0xB1 ^ 0x89 ^ (0xFD ^ 0xC0);
        n.llll[5] = -(0xFFFFFDF3 & 0x764F) & (0xFFFFFFFE & 0x7FFB);
        n.llll[6] = "  ".length();
        n.llll[7] = "   ".length();
        n.llll[8] = 0x6C ^ 0x68;
        n.llll[9] = 0x74 ^ 0x72;
        n.llll[10] = 0xA6 ^ 0xC5 ^ (0x34 ^ 0x50);
        n.llll[11] = (0x35 ^ 0x72) + (78 + 87 - 61 + 57) - (0xC0 ^ 0xB0) + (0 ^ 0x49);
        n.llll[12] = 200 + 140 - 156 + 35;
        n.llll[13] = (0x7C ^ 0x69) + (94 + 7 - -50 + 38) - (0xB1 ^ 0x87) + (0xE1 ^ 0xAA);
        n.llll[14] = (0x73 ^ 0x18) + (82 + 54 - 89 + 95) - (65 + 122 - 141 + 124) + (7 + 137 - 89 + 83);
        n.llll[15] = 85 + 52 - 57 + 71 + (0xE0 ^ 0xBE) - (0x5F ^ 0x18) + (0x3B ^ 0xC);
        n.llll[16] = 45 + 173 - 210 + 180 ^ 54 + 104 - 81 + 103;
    }

    private static String lIIIllI(String lllllIllIIIIlIl, String lllllIllIIIIllI) {
        try {
            SecretKeySpec lllllIllIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllIllIIIIllI.getBytes(StandardCharsets.UTF_8)), llll[16]), "DES");
            Cipher lllllIllIIIlIIl = Cipher.getInstance("DES");
            lllllIllIIIlIIl.init(llll[6], lllllIllIIIlIlI);
            return new String(lllllIllIIIlIIl.doFinal(Base64.getDecoder().decode(lllllIllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIllIIIlIII) {
            lllllIllIIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        n.lIIlIIl();
        n.lIIlIII();
        bZ = llll[11];
        cc = llll[12];
        ca = llll[13];
        cb = llll[14];
        cd = llll[15];
        int[] nArray = new int[llll[4]];
        nArray[n.llll[3]] = llll[11];
        nArray[n.llll[2]] = llll[13];
        nArray[n.llll[6]] = llll[14];
        nArray[n.llll[7]] = llll[12];
        nArray[n.llll[8]] = llll[15];
        ce = nArray;
    }

    private static String lIIIlIl(String lllllIlIllIIIII, String lllllIlIllIIIIl) {
        try {
            SecretKeySpec lllllIlIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllIlIllIIlII = Cipher.getInstance("Blowfish");
            lllllIlIllIIlII.init(llll[6], lllllIlIllIIlIl);
            return new String(lllllIlIllIIlII.doFinal(Base64.getDecoder().decode(lllllIlIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllIlIllIIIll) {
            lllllIlIllIIIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (n.lIIlIlI(k.h(llll[0]), llll[1]) && n.lIIlIll(Dialog.canContinue() ? 1 : 0) && n.lIIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llll[2]];
            stringArray2[n.llll[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (n.lIIllII(list.size())) {
                ((NPC)list.get(llll[3])).interact(lllI[llll[7]]);
                Time.sleepTicks((int)llll[4]);
                "".length();
            }
        }
        if (n.lIIlIll(Dialog.isOpen() ? 1 : 0)) {
            String lllllIllIIlllIl;
            String[] stringArray3 = new String[llll[2]];
            stringArray3[n.llll[3]] = lllllIllIIlllIl;
            List lllllIllIIllIll = NPCs.getAll((String[])stringArray3);
            if (n.lIIllII(lllllIllIIllIll.size())) {
                if (n.lIIlIll(Reachable.isInteractable((Locatable)((Locatable)lllllIllIIllIll.get(llll[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)lllllIllIIllIll.get(llll[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks((int)llll[2]);
                    "".length();
                }
                if (n.lIIllIl(Reachable.isInteractable((Locatable)((Locatable)lllllIllIIllIll.get(llll[3]))) ? 1 : 0)) {
                    ((NPC)lllllIllIIllIll.get(llll[3])).interact(lllI[llll[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llll[5]);
                    "".length();
                }
            }
        }
        if (!n.lIIlIll(Dialog.isOpen() ? 1 : 0) || !n.lIIlIll(Dialog.canContinue() ? 1 : 0) || !n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || n.lIIllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            Clues.c = lllI[llll[4]];
            if (n.lIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && n.lIIlIll(Dialog.canContinue() ? 1 : 0)) {
                void lllllIllIIlllII;
                Dialog.chooseOption((String[])lllllIllIIlllII);
                "".length();
            }
            if (!n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || n.lIIllIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (n.lIIlIll(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[llll[2]];
            stringArray2[n.llll[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (n.lIIllII(list.size())) {
                ((NPC)list.get(llll[3])).interact(lllI[llll[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llll[5]);
                "".length();
            }
        }
        while (!n.lIIlIll(Dialog.isOpen() ? 1 : 0) || !n.lIIlIll(Dialog.canContinue() ? 1 : 0) || !n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || n.lIIllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                Clues.c = lllI[llll[10]];
                if (n.lIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && n.lIIlIll(Dialog.canContinue() ? 1 : 0)) {
                    void lllllIllIIlIllI;
                    Dialog.chooseOption((String[])lllllIllIIlIllI);
                    "".length();
                }
                if (!n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || n.lIIllIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llll[2]);
                "".length();
                "".length();
            }
            catch (Exception lllllIllIIlIlIl) {
                // empty catch block
            }
            if ((0x29 ^ 0x2D) == "   ".length()) {
                return;
            }
            Time.sleepTicks((int)llll[2]);
            "".length();
            "".length();
            if (-" ".length() <= "  ".length()) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (n.lIIlIlI(k.h(llll[0]), llll[1]) && n.lIIlIll(Dialog.canContinue() ? 1 : 0) && n.lIIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llll[2]];
            stringArray2[n.llll[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (n.lIIllII(list.size())) {
                ((NPC)list.get(llll[3])).interact(lllI[llll[3]]);
                Time.sleepTicks((int)llll[4]);
                "".length();
            }
        }
        if (n.lIIlIll(Dialog.isOpen() ? 1 : 0)) {
            String lllllIllIlIIIll;
            String[] stringArray3 = new String[llll[2]];
            stringArray3[n.llll[3]] = lllllIllIlIIIll;
            List lllllIllIlIIIIl = NPCs.getAll((String[])stringArray3);
            if (n.lIIllII(lllllIllIlIIIIl.size())) {
                ((NPC)lllllIllIlIIIIl.get(llll[3])).interact(lllI[llll[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llll[5]);
                "".length();
            }
        }
        if (!n.lIIlIll(Dialog.isOpen() ? 1 : 0) || !n.lIIlIll(Dialog.canContinue() ? 1 : 0) || !n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || n.lIIllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            Clues.c = lllI[llll[6]];
            if (n.lIIllIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && n.lIIlIll(Dialog.canContinue() ? 1 : 0)) {
                void lllllIllIlIIIlI;
                Dialog.chooseOption((String[])lllllIllIlIIIlI);
                "".length();
            }
            if (!n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || n.lIIllIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    public static void c(String[] stringArray) {
        if (n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && n.lIIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            "".length();
        }
        if (!n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || n.lIIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIll(int n2) {
        return n2 == 0;
    }

    private static void lIIlIII() {
        lllI = new String[llll[16]];
        n.lllI[n.llll[3]] = n.lIIIlIl("wFZLO2n6XPk=", "xRWOf");
        n.lllI[n.llll[2]] = n.lIIIllI("+3f8JFnvXkQ=", "QSIhq");
        n.lllI[n.llll[6]] = n.lIIIllI("ytbufXciaPjiNL8JMrt8Yg==", "pMqhI");
        n.lllI[n.llll[7]] = n.lIIIlll("EzkHIUYzNw==", "GXkJk");
        n.lllI[n.llll[8]] = n.lIIIlIl("DQWNHlnTr10=", "BzRbG");
        n.lllI[n.llll[4]] = n.lIIIlll("CR01HzkjGz1QLiMUNh8t", "JuZpJ");
        n.lllI[n.llll[9]] = n.lIIIllI("E/yOLVw/Nlg=", "bfbvX");
        n.lllI[n.llll[10]] = n.lIIIlIl("h8j9yTduR5ykoYLpBOP0eQ==", "iaEuJ");
    }

    public static boolean aV() {
        int lllllIllIIlIIII = llll[3];
        while (n.lIIlIlI(lllllIllIIlIIII, ce.length)) {
            List lllllIllIIIllll = Widgets.get((int)ce[lllllIllIIlIIII]);
            if (n.lIIlIll(lllllIllIIIllll.isEmpty() ? 1 : 0) && n.lIIllIl(((Widget)lllllIllIIIllll.get(llll[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + ce[lllllIllIIlIIII]);
                return llll[2];
            }
            ++lllllIllIIlIIII;
            "".length();
            if (" ".length() != 0) continue;
            return ((0x1C ^ 0x2E) & ~(0x40 ^ 0x72)) != 0;
        }
        return llll[3];
    }

    private static boolean lIIllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIlI(int n2, int n3) {
        return n2 < n3;
    }
}

