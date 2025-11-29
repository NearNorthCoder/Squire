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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import gg.squire.account.AccBuilderTempleTrek;
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
    private static final /* synthetic */ int bi;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bh;
    private static /* synthetic */ String[] llllIIllll;
    private static final /* synthetic */ int bj;
    private static final /* synthetic */ int bk;
    private static /* synthetic */ int[] llllIlIIII;
    private static final /* synthetic */ int[] bm;

    private static boolean llIIlllIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIllIII(int n2) {
        return n2 != 0;
    }

    public static boolean K() {
        int lllllllllllllllllIlIllIIIIlllIll = llllIlIIII[3];
        while (g.llIIlllIlIlIl(lllllllllllllllllIlIllIIIIlllIll, bm.length)) {
            List lllllllllllllllllIlIllIIIIlllIlI = Widgets.get((int)bm[lllllllllllllllllIlIllIIIIlllIll]);
            if (g.llIIlllIlIllI(lllllllllllllllllIlIllIIIIlllIlI.isEmpty() ? 1 : 0) && g.llIIlllIllIII(((Widget)lllllllllllllllllIlIllIIIIlllIlI.get(llllIlIIII[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bm[lllllllllllllllllIlIllIIIIlllIll]);
                return llllIlIIII[2];
            }
            ++lllllllllllllllllIlIllIIIIlllIll;
            "".length();
            if ("   ".length() > 0) continue;
            return ((0x71 ^ 0x2C ^ (0xFF ^ 0xA8)) & (0x5F ^ 0x1F ^ (0xCE ^ 0x84) ^ -" ".length())) != 0;
        }
        return llllIlIIII[3];
    }

    private static boolean llIIlllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void a(String[] stringArray) {
        if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            "".length();
        }
        if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static void llIIlllIlIlII() {
        llllIlIIII = new int[17];
        g.llllIlIIII[0] = -(0xFFFFD6C5 & 0x3FBF) & (0xFFFFD7FF & 0x3F9D);
        g.llllIlIIII[1] = -(0xFFFFF55F & 0x3EA5) & (0xFFFFFFEF & 0x37FC);
        g.llllIlIIII[2] = " ".length();
        g.llllIlIIII[3] = (0xCF ^ 0xB4 ^ (0x18 ^ 0x32)) & (0x87 ^ 0x82 ^ (0x69 ^ 0x3D) ^ -" ".length());
        g.llllIlIIII[4] = 0x56 ^ 0x3D ^ (0x7C ^ 0x12);
        g.llllIlIIII[5] = 0xFFFFCBB8 & 0x3FFF;
        g.llllIlIIII[6] = "  ".length();
        g.llllIlIIII[7] = "   ".length();
        g.llllIlIIII[8] = 0xBE ^ 0xBA;
        g.llllIlIIII[9] = 0x99 ^ 0x9F;
        g.llllIlIIII[10] = 48 + 84 - 17 + 36 ^ 6 + 1 - -100 + 37;
        g.llllIlIIII[11] = 207 + 70 - 186 + 128;
        g.llllIlIIII[12] = 26 + 13 - -72 + 82;
        g.llllIlIIII[13] = 127 + 134 - 128 + 98;
        g.llllIlIIII[14] = 42 + 225 - 181 + 143;
        g.llllIlIIII[15] = (0x6F ^ 0x34) + (0x76 ^ 0x1C) - (0x3F ^ 0x73) + (0xF8 ^ 0x98);
        g.llllIlIIII[16] = 2 + 116 - 97 + 145 ^ 16 + 107 - -47 + 4;
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[llllIlIIII[2]];
            stringArray2[g.llllIlIIII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.llIIlllIlIlll(list.size())) {
                ((NPC)list.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llllIlIIII[5]);
                "".length();
            }
        }
        while (!g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[10]];
                if (g.llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                    void lllllllllllllllllIlIllIIIlIIIIIl;
                    Dialog.chooseOption((String[])lllllllllllllllllIlIllIIIlIIIIIl);
                    "".length();
                }
                if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llllIlIIII[2]);
                "".length();
                "".length();
            }
            catch (Exception lllllllllllllllllIlIllIIIlIIIIII) {
                // empty catch block
            }
            if (-" ".length() >= ((0xC5 ^ 0xC1 ^ (0x21 ^ 0x77)) & (0xEA ^ 0x8E ^ (0xA7 ^ 0x91) ^ -" ".length()))) {
                return;
            }
            Time.sleepTicks((int)llllIlIIII[2]);
            "".length();
            "".length();
            if (-"  ".length() < 0) continue;
            return;
        }
    }

    private static boolean llIIlllIlIlll(int n2) {
        return n2 > 0;
    }

    private static void llIIlllIlIIll() {
        llllIIllll = new String[llllIlIIII[16]];
        g.llllIIllll[g.llllIlIIII[3]] = g.llIIlllIlIIIl("NTk/BFcVNw==", "aXSoz");
        g.llllIIllll[g.llllIlIIII[2]] = g.llIIlllIlIIlI("9F7jb0pTgcU=", "MunIU");
        g.llllIIllll[g.llllIlIIII[6]] = g.llIIlllIlIIIl("Lyw6HCUFKjJTMgUlORwx", "lDUsV");
        g.llllIIllll[g.llllIlIIII[7]] = g.llIIlllIlIIlI("I0Tzdtk2/Sw=", "PWPlm");
        g.llllIIllll[g.llllIlIIII[8]] = g.llIIlllIlIIIl("IxQaDGwDGg==", "wuvgA");
        g.llllIIllll[g.llllIlIIII[4]] = g.llIIlllIlIIlI("o2BHfZ0p94GTikRBkieB0Q==", "Wcpub");
        g.llllIIllll[g.llllIlIIII[9]] = g.llIIlllIlIIIl("ASsoAHohJQ==", "UJDkW");
        g.llllIIllll[g.llllIlIIII[10]] = g.llIIlllIlIIIl("NRIKGREfFAJWBh8bCRkF", "vzevb");
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.llIIlllIlIlIl(e.j(llllIlIIII[0]), llllIlIIII[1]) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) && g.llIIlllIlIllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llllIlIIII[2]];
            stringArray2[g.llllIlIIII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.llIIlllIlIlll(list.size())) {
                ((NPC)list.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[3]]);
                Time.sleepTicks((int)llllIlIIII[4]);
                "".length();
            }
        }
        if (g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String lllllllllllllllllIlIllIIIlIIlllI;
            String[] stringArray3 = new String[llllIlIIII[2]];
            stringArray3[g.llllIlIIII[3]] = lllllllllllllllllIlIllIIIlIIlllI;
            List lllllllllllllllllIlIllIIIlIIllII = NPCs.getAll((String[])stringArray3);
            if (g.llIIlllIlIlll(lllllllllllllllllIlIllIIIlIIllII.size())) {
                ((NPC)lllllllllllllllllIlIllIIIlIIllII.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llllIlIIII[5]);
                "".length();
            }
        }
        if (!g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[6]];
            if (g.llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                void lllllllllllllllllIlIllIIIlIIllIl;
                Dialog.chooseOption((String[])lllllllllllllllllIlIllIIIlIIllIl);
                "".length();
            }
            if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static String llIIlllIlIIlI(String lllllllllllllllllIlIllIIIIllIIII, String lllllllllllllllllIlIllIIIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllllIlIllIIIIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIIIIlIllll.getBytes(StandardCharsets.UTF_8)), llllIlIIII[16]), "DES");
            Cipher lllllllllllllllllIlIllIIIIllIlII = Cipher.getInstance("DES");
            lllllllllllllllllIlIllIIIIllIlII.init(llllIlIIII[6], lllllllllllllllllIlIllIIIIllIlIl);
            return new String(lllllllllllllllllIlIllIIIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIllIIIIllIIll) {
            lllllllllllllllllIlIllIIIIllIIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.llIIlllIlIlIl(e.j(llllIlIIII[0]), llllIlIIII[1]) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) && g.llIIlllIlIllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llllIlIIII[2]];
            stringArray2[g.llllIlIIII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.llIIlllIlIlll(list.size())) {
                ((NPC)list.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[7]]);
                Time.sleepTicks((int)llllIlIIII[4]);
                "".length();
            }
        }
        if (g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String lllllllllllllllllIlIllIIIlIIlIII;
            String[] stringArray3 = new String[llllIlIIII[2]];
            stringArray3[g.llllIlIIII[3]] = lllllllllllllllllIlIllIIIlIIlIII;
            List lllllllllllllllllIlIllIIIlIIIllI = NPCs.getAll((String[])stringArray3);
            if (g.llIIlllIlIlll(lllllllllllllllllIlIllIIIlIIIllI.size())) {
                if (g.llIIlllIlIllI(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllllIlIllIIIlIIIllI.get(llllIlIIII[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)lllllllllllllllllIlIllIIIlIIIllI.get(llllIlIIII[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks((int)llllIlIIII[2]);
                    "".length();
                }
                if (g.llIIlllIllIII(Reachable.isInteractable((Locatable)((Locatable)lllllllllllllllllIlIllIIIlIIIllI.get(llllIlIIII[3]))) ? 1 : 0)) {
                    ((NPC)lllllllllllllllllIlIllIIIlIIIllI.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llllIlIIII[5]);
                    "".length();
                }
            }
        }
        if (!g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[4]];
            if (g.llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                void lllllllllllllllllIlIllIIIlIIIlll;
                Dialog.chooseOption((String[])lllllllllllllllllIlIllIIIlIIIlll);
                "".length();
            }
            if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    static {
        g.llIIlllIlIlII();
        g.llIIlllIlIIll();
        bk = llllIlIIII[11];
        bh = llllIlIIII[12];
        bi = llllIlIIII[13];
        bl = llllIlIIII[14];
        bj = llllIlIIII[15];
        int[] nArray = new int[llllIlIIII[4]];
        nArray[g.llllIlIIII[3]] = llllIlIIII[12];
        nArray[g.llllIlIIII[2]] = llllIlIIII[13];
        nArray[g.llllIlIIII[6]] = llllIlIIII[15];
        nArray[g.llllIlIIII[7]] = llllIlIIII[11];
        nArray[g.llllIlIIII[8]] = llllIlIIII[14];
        bm = nArray;
    }

    private static String llIIlllIlIIIl(String lllllllllllllllllIlIllIIIIIlllIl, String lllllllllllllllllIlIllIIIIlIIIIl) {
        lllllllllllllllllIlIllIIIIIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIllIIIIlIIIII = new StringBuilder();
        char[] lllllllllllllllllIlIllIIIIIlllll = lllllllllllllllllIlIllIIIIlIIIIl.toCharArray();
        int lllllllllllllllllIlIllIIIIIllllI = llllIlIIII[3];
        char[] lllllllllllllllllIlIllIIIIIllIII = lllllllllllllllllIlIllIIIIIlllIl.toCharArray();
        int lllllllllllllllllIlIllIIIIIlIlll = lllllllllllllllllIlIllIIIIIllIII.length;
        int lllllllllllllllllIlIllIIIIIlIllI = llllIlIIII[3];
        while (g.llIIlllIlIlIl(lllllllllllllllllIlIllIIIIIlIllI, lllllllllllllllllIlIllIIIIIlIlll)) {
            char lllllllllllllllllIlIllIIIIlIIIll = lllllllllllllllllIlIllIIIIIllIII[lllllllllllllllllIlIllIIIIIlIllI];
            lllllllllllllllllIlIllIIIIlIIIII.append((char)(lllllllllllllllllIlIllIIIIlIIIll ^ lllllllllllllllllIlIllIIIIIlllll[lllllllllllllllllIlIllIIIIIllllI % lllllllllllllllllIlIllIIIIIlllll.length]));
            "".length();
            ++lllllllllllllllllIlIllIIIIIllllI;
            ++lllllllllllllllllIlIllIIIIIlIllI;
            "".length();
            if (((0x1A ^ 0x79) & ~(0x7B ^ 0x18)) >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIllIIIIlIIIII);
    }
}

