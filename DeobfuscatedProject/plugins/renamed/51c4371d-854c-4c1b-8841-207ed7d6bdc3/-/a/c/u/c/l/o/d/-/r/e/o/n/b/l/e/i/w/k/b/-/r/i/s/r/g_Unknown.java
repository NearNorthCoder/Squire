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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e_Unknown;
import gg.squire.account.AccBuilderBarrows;
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

public class g_Unknown {
    private static final /* synthetic */ int br;
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int bs;
    private static final /* synthetic */ int bp;
    private static /* synthetic */ int[] llIIIllI;
    private static /* synthetic */ String[] llIIIlIl;
    private static final /* synthetic */ int[] bt;
    private static final /* synthetic */ int bo;

    private static boolean lIlIIlIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.lIlIIlIlIll(e.j(llIIIllI[0]), llIIIllI[1]) && g.lIlIIlIllII(Dialog.canContinue() ? 1 : 0) && g.lIlIIlIllII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIllI[2]];
            stringArray2[g.llIIIllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIlIllIl(list.size())) {
                ((NPC)list.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[3]]);
                Time.sleepTicks((int)llIIIllI[4]);
                0;
            }
        }
        if (g.lIlIIlIllII(Dialog.isOpen() ? 1 : 0)) {
            String lIlIlIlllllIIlI;
            String[] stringArray3 = new String[llIIIllI[2]];
            stringArray3[g.llIIIllI[3]] = lIlIlIlllllIIlI;
            List lIlIlIlllllIIII = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIlIllIl(lIlIlIlllllIIII.size())) {
                ((NPC)lIlIlIlllllIIII.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIllI[5]);
                0;
            }
        }
        if (!g.lIlIIlIllII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIlIllII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderBarrows.c = llIIIlIl[llIIIllI[6]];
            if (g.lIlIIlIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIlIllII(Dialog.canContinue() ? 1 : 0)) {
                void lIlIlIlllllIIIl;
                Dialog.chooseOption((String[])lIlIlIlllllIIIl);
                0;
            }
            if (!g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static boolean lIlIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIIllI(String lIlIlIlllIIIIIl, String lIlIlIlllIIIIII) {
        lIlIlIlllIIIIIl = new String(Base64.getDecoder().decode(lIlIlIlllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIlllIIIlII = new StringBuilder();
        char[] lIlIlIlllIIIIll = lIlIlIlllIIIIII.toCharArray();
        int lIlIlIlllIIIIlI = llIIIllI[3];
        char[] lIlIlIllIllllII = lIlIlIlllIIIIIl.toCharArray();
        int lIlIlIllIlllIll = lIlIlIllIllllII.length;
        int lIlIlIllIlllIlI = llIIIllI[3];
        while (g.lIlIIlIlIll(lIlIlIllIlllIlI, lIlIlIllIlllIll)) {
            char lIlIlIlllIIIlll = lIlIlIllIllllII[lIlIlIllIlllIlI];
            lIlIlIlllIIIlII.append((char)(lIlIlIlllIIIlll ^ lIlIlIlllIIIIll[lIlIlIlllIIIIlI % lIlIlIlllIIIIll.length]));
            0;
            ++lIlIlIlllIIIIlI;
            ++lIlIlIllIlllIlI;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return String.valueOf(lIlIlIlllIIIlII);
    }

    static {
        g.lIlIIlIlIlI();
        g.lIlIIlIlIIl();
        bo = llIIIllI[11];
        bq = llIIIllI[12];
        br = llIIIllI[13];
        bp = llIIIllI[14];
        bs = llIIIllI[15];
        int[] nArray = new int[llIIIllI[4]];
        nArray[g.llIIIllI[3]] = llIIIllI[11];
        nArray[g.llIIIllI[2]] = llIIIllI[14];
        nArray[g.llIIIllI[6]] = llIIIllI[12];
        nArray[g.llIIIllI[7]] = llIIIllI[13];
        nArray[g.llIIIllI[8]] = llIIIllI[15];
        bt = nArray;
    }

    public static boolean L() {
        int lIlIlIlllIlllll = llIIIllI[3];
        while (g.lIlIIlIlIll(lIlIlIlllIlllll, bt.length)) {
            List lIlIlIlllIllllI = Widgets.get((int)bt[lIlIlIlllIlllll]);
            if (g.lIlIIlIllII(lIlIlIlllIllllI.isEmpty() ? 1 : 0) && g.lIlIIlIlllI(((Widget)lIlIlIlllIllllI.get(llIIIllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bt[lIlIlIlllIlllll]);
                return llIIIllI[2];
            }
            ++lIlIlIlllIlllll;
            0;
            if ((0xA5 ^ 0xC1 ^ (0x3D ^ 0x5C)) != 0) continue;
            return ((0x73 ^ 0x1E ^ (0xF7 ^ 0xBC)) & (0x70 ^ 0x31 ^ (0xB ^ 0x6C) ^ -1)) != 0;
        }
        return llIIIllI[3];
    }

    private static String lIlIIlIIlll(String lIlIlIllIllIIIl, String lIlIlIllIllIIII) {
        try {
            SecretKeySpec lIlIlIllIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIllIllIIII.getBytes(StandardCharsets.UTF_8)), llIIIllI[16]), "DES");
            Cipher lIlIlIllIllIIll = Cipher.getInstance("DES");
            lIlIlIllIllIIll.init(llIIIllI[6], lIlIlIllIllIlII);
            return new String(lIlIlIllIllIIll.doFinal(Base64.getDecoder().decode(lIlIlIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIllIllIIlI) {
            lIlIlIllIllIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlIlIII(String lIlIlIlllIlIllI, String lIlIlIlllIlIlIl) {
        try {
            SecretKeySpec lIlIlIlllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIlllIllIII = Cipher.getInstance("Blowfish");
            lIlIlIlllIllIII.init(llIIIllI[6], lIlIlIlllIllIIl);
            return new String(lIlIlIlllIllIII.doFinal(Base64.getDecoder().decode(lIlIlIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIlllIlIlll) {
            lIlIlIlllIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllIl(int n2) {
        return n2 > 0;
    }

    private static void lIlIIlIlIIl() {
        llIIIlIl = new String[llIIIllI[16]];
        g.llIIIlIl[g.llIIIllI[3]] = g."Talk-to";
        g.llIIIlIl[g.llIIIllI[2]] = g."Talk-to";
        g.llIIIlIl[g.llIIIllI[6]] = g."Choosing dialog";
        g.llIIIlIl[g.llIIIllI[7]] = g."Talk-to";
        g.llIIIlIl[g.llIIIllI[8]] = g."Talk-to";
        g.llIIIlIl[g.llIIIllI[4]] = g."Choosing dialog";
        g.llIIIlIl[g.llIIIllI[9]] = g."Talk-to";
        g.llIIIlIl[g.llIIIllI[10]] = g."Choosing dialog";
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.lIlIIlIllII(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIllI[2]];
            stringArray2[g.llIIIllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIlIllIl(list.size())) {
                ((NPC)list.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIllI[5]);
                0;
            }
        }
        while (!g.lIlIIlIllII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIlIllII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderBarrows.c = llIIIlIl[llIIIllI[10]];
                if (g.lIlIIlIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIlIllII(Dialog.canContinue() ? 1 : 0)) {
                    void lIlIlIllllIIlIl;
                    Dialog.chooseOption((String[])lIlIlIllllIIlIl);
                    0;
                }
                if (!g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llIIIllI[2]);
                0;
                0;
            }
            catch (Exception lIlIlIllllIIlII) {
                // empty catch block
            }
            if (3 == 0) {
                return;
            }
            Time.sleepTicks((int)llIIIllI[2]);
            0;
            0;
            
            return;
        }
    }

    private static void lIlIIlIlIlI() {
        llIIIllI = new int[17];
        g.llIIIllI[0] = 0xFFFFDF3F & 0x21D9;
        g.llIIIllI[1] = 0xFFFF87EC & 0x7BFB;
        g.llIIIllI[2] = 1;
        g.llIIIllI[3] = (0x76 ^ 6 ^ (0xC1 ^ 0xB8)) & (114 + 14 - -6 + 3 ^ 9 + 42 - -40 + 37 ^ -1);
        g.llIIIllI[4] = 0x17 ^ 0x10 ^ 2;
        g.llIIIllI[5] = 0xFFFFFFFE & 0xBB9;
        g.llIIIllI[6] = 2;
        g.llIIIllI[7] = 3;
        g.llIIIllI[8] = 0xE9 ^ 0x9C ^ (0xEE ^ 0x9F);
        g.llIIIllI[9] = 5 + 40 - 1 + 122 ^ 16 + 38 - -1 + 105;
        g.llIIIllI[10] = 0x71 ^ 0x7E ^ (0x8F ^ 0x87);
        g.llIIIllI[11] = (0x46 ^ 0x1B) + (43 + 90 - 77 + 101) - (193 + 167 - 355 + 212) + (68 + 60 - 83 + 115);
        g.llIIIllI[12] = 21 + 61 - 49 + 184;
        g.llIIIllI[13] = 176 + 141 - 310 + 193 + (0x86 ^ 0xC6) - (218 + 65 - 280 + 220) + (98 + 95 - 77 + 62);
        g.llIIIllI[14] = 146 + 209 - 328 + 204;
        g.llIIIllI[15] = 55 + 33 - -48 + 7 + (17 + 42 - -18 + 102) - (117 + 136 - 193 + 82) + (0x22 ^ 0x13);
        g.llIIIllI[16] = 0x8B ^ 0x83;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.lIlIIlIlIll(e.j(llIIIllI[0]), llIIIllI[1]) && g.lIlIIlIllII(Dialog.canContinue() ? 1 : 0) && g.lIlIIlIllII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIllI[2]];
            stringArray2[g.llIIIllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIlIllIl(list.size())) {
                ((NPC)list.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[7]]);
                Time.sleepTicks((int)llIIIllI[4]);
                0;
            }
        }
        if (g.lIlIIlIllII(Dialog.isOpen() ? 1 : 0)) {
            String lIlIlIllllIllII;
            String[] stringArray3 = new String[llIIIllI[2]];
            stringArray3[g.llIIIllI[3]] = lIlIlIllllIllII;
            List lIlIlIllllIlIlI = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIlIllIl(lIlIlIllllIlIlI.size())) {
                if (g.lIlIIlIllII(Reachable.isInteractable((Locatable)((Locatable)lIlIlIllllIlIlI.get(llIIIllI[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)lIlIlIllllIlIlI.get(llIIIllI[3])).getWorldLocation());
                    0;
                    Time.sleepTicks((int)llIIIllI[2]);
                    0;
                }
                if (g.lIlIIlIlllI(Reachable.isInteractable((Locatable)((Locatable)lIlIlIllllIlIlI.get(llIIIllI[3]))) ? 1 : 0)) {
                    ((NPC)lIlIlIllllIlIlI.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIllI[5]);
                    0;
                }
            }
        }
        if (!g.lIlIIlIllII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIlIllII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderBarrows.c = llIIIlIl[llIIIllI[4]];
            if (g.lIlIIlIlllI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIlIllII(Dialog.canContinue() ? 1 : 0)) {
                void lIlIlIllllIlIll;
                Dialog.chooseOption((String[])lIlIlIllllIlIll);
                0;
            }
            if (!g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static boolean lIlIIlIllII(int n2) {
        return n2 == 0;
    }

    public static void a(String[] stringArray) {
        if (g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIlIllII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            0;
        }
        if (!g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}

