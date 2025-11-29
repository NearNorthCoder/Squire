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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

public class g {
    private static final /* synthetic */ int bo;
    private static final /* synthetic */ int bp;
    private static final /* synthetic */ int[] bs;
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int br;
    private static /* synthetic */ String[] llIlllIlIl;
    private static final /* synthetic */ int bn;
    private static /* synthetic */ int[] llIlllIllI;

    private static boolean lIlllIlIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllIlIIIlll(int n2) {
        return n2 == 0;
    }

    public static void a(String[] stringArray) {
        if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            0;
        }
        if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static String lIlllIlIIIIlI(String llllllllllllllllllIIIIIlIIIIlIlI, String llllllllllllllllllIIIIIlIIIIlIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIIIlIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIlIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIIIlIIIIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIIIlIIIIlllI.init(llIlllIllI[6], llllllllllllllllllIIIIIlIIIIllll);
            return new String(llllllllllllllllllIIIIIlIIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIlIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIIIlIIIIllIl) {
            llllllllllllllllllIIIIIlIIIIllIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.lIlllIlIIIllI(e.j(llIlllIllI[0]), llIlllIllI[1]) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llIlllIllI[2]];
            stringArray2[g.llIlllIllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlllIlIIlIII(list.size())) {
                ((NPC)list.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[3]]);
                Time.sleepTicks((int)llIlllIllI[4]);
                0;
            }
        }
        if (g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String llllllllllllllllllIIIIIlIIllIlIl;
            String[] stringArray3 = new String[llIlllIllI[2]];
            stringArray3[g.llIlllIllI[3]] = llllllllllllllllllIIIIIlIIllIlIl;
            List llllllllllllllllllIIIIIlIIllIIll = NPCs.getAll((String[])stringArray3);
            if (g.lIlllIlIIlIII(llllllllllllllllllIIIIIlIIllIIll.size())) {
                ((NPC)llllllllllllllllllIIIIIlIIllIIll.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlllIllI[5]);
                0;
            }
        }
        if (!g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlIl[llIlllIllI[6]];
            if (g.lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                void llllllllllllllllllIIIIIlIIllIlII;
                Dialog.chooseOption((String[])llllllllllllllllllIIIIIlIIllIlII);
                0;
            }
            if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static void lIlllIlIIIlII() {
        llIlllIlIl = new String[llIlllIllI[16]];
        g.llIlllIlIl[g.llIlllIllI[3]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[2]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[6]] = g."Choosing dialog";
        g.llIlllIlIl[g.llIlllIllI[7]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[8]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[4]] = g."Choosing dialog";
        g.llIlllIlIl[g.llIlllIllI[9]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[10]] = g."Choosing dialog";
    }

    static {
        g.lIlllIlIIIlIl();
        g.lIlllIlIIIlII();
        bn = llIlllIllI[11];
        bq = llIlllIllI[12];
        bo = llIlllIllI[13];
        br = llIlllIllI[14];
        bp = llIlllIllI[15];
        int[] nArray = new int[llIlllIllI[4]];
        nArray[g.llIlllIllI[3]] = llIlllIllI[11];
        nArray[g.llIlllIllI[2]] = llIlllIllI[13];
        nArray[g.llIlllIllI[6]] = llIlllIllI[15];
        nArray[g.llIlllIllI[7]] = llIlllIllI[12];
        nArray[g.llIlllIllI[8]] = llIlllIllI[14];
        bs = nArray;
    }

    private static boolean lIlllIlIIlIII(int n2) {
        return n2 > 0;
    }

    private static void lIlllIlIIIlIl() {
        llIlllIllI = new int[17];
        g.llIlllIllI[0] = 0xFFFFE9B9 & 0x175F;
        g.llIlllIllI[1] = 0xFFFFDBF9 & 0x27EE;
        g.llIlllIllI[2] = 1;
        g.llIlllIllI[3] = (125 + 140 - 249 + 150 ^ 7 + 49 - -67 + 60) & (181 + 103 - 75 + 2 ^ 164 + 9 - 44 + 65 ^ -1);
        g.llIlllIllI[4] = 0xB0 ^ 0xB5;
        g.llIlllIllI[5] = -(0xFFFFFFE7 & 0x2459) & (0xFFFFFFFC & 0x2FFB);
        g.llIlllIllI[6] = 2;
        g.llIlllIllI[7] = 3;
        g.llIlllIllI[8] = 0x77 ^ 0x73;
        g.llIlllIllI[9] = 0x99 ^ 0x9F;
        g.llIlllIllI[10] = 0x66 ^ 0x61;
        g.llIlllIllI[11] = (0xD3 ^ 0x9B) + (0x50 ^ 0x7A) - -3 + (0x7F ^ 0x33);
        g.llIlllIllI[12] = 92 + 165 - 233 + 179 + (0xE6 ^ 0x83) - (7 + 77 - 8 + 71) + (0x60 ^ 0x5E);
        g.llIlllIllI[13] = 77 + 196 - 272 + 207 + (0x78 ^ 0x34) - (0x1B ^ 0x6D) + (0xE4 ^ 0xA5);
        g.llIlllIllI[14] = 57 + 152 - 181 + 201;
        g.llIlllIllI[15] = 15 + 174 - 174 + 202;
        g.llIlllIllI[16] = 0x98 ^ 0x90;
    }

    private static String lIlllIlIIIIIl(String llllllllllllllllllIIIIIlIIIlIlll, String llllllllllllllllllIIIIIlIIIlIllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIIIlIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), llIlllIllI[16]), "DES");
            Cipher llllllllllllllllllIIIIIlIIIllIll = Cipher.getInstance("DES");
            llllllllllllllllllIIIIIlIIIllIll.init(llIlllIllI[6], llllllllllllllllllIIIIIlIIIlllII);
            return new String(llllllllllllllllllIIIIIlIIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIIIlIIIllIlI) {
            llllllllllllllllllIIIIIlIIIllIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[llIlllIllI[2]];
            stringArray2[g.llIlllIllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlllIlIIlIII(list.size())) {
                ((NPC)list.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlllIllI[5]);
                0;
            }
        }
        while (!g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderSotf.c = llIlllIlIl[llIlllIllI[10]];
                if (g.lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                    void llllllllllllllllllIIIIIlIIlIlIII;
                    Dialog.chooseOption((String[])llllllllllllllllllIIIIIlIIlIlIII);
                    0;
                }
                if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llIlllIllI[2]);
                0;
                0;
            }
            catch (Exception llllllllllllllllllIIIIIlIIlIIlll) {
                // empty catch block
            }
            if (((0x57 ^ 0xE) & ~(0x49 ^ 0x10)) != 0) {
                return;
            }
            Time.sleepTicks((int)llIlllIllI[2]);
            0;
            0;
            if (null == null) continue;
            return;
        }
    }

    private static String lIlllIlIIIIll(String llllllllllllllllllIIIIIIllllIlll, String llllllllllllllllllIIIIIIlllllIll) {
        llllllllllllllllllIIIIIIllllIlll = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIIIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIIIlllllIlI = new StringBuilder();
        char[] llllllllllllllllllIIIIIIlllllIIl = llllllllllllllllllIIIIIIlllllIll.toCharArray();
        int llllllllllllllllllIIIIIIlllllIII = llIlllIllI[3];
        char[] llllllllllllllllllIIIIIIllllIIlI = llllllllllllllllllIIIIIIllllIlll.toCharArray();
        int llllllllllllllllllIIIIIIllllIIIl = llllllllllllllllllIIIIIIllllIIlI.length;
        int llllllllllllllllllIIIIIIllllIIII = llIlllIllI[3];
        while (g.lIlllIlIIIllI(llllllllllllllllllIIIIIIllllIIII, llllllllllllllllllIIIIIIllllIIIl)) {
            char llllllllllllllllllIIIIIIllllllIl = llllllllllllllllllIIIIIIllllIIlI[llllllllllllllllllIIIIIIllllIIII];
            llllllllllllllllllIIIIIIlllllIlI.append((char)(llllllllllllllllllIIIIIIllllllIl ^ llllllllllllllllllIIIIIIlllllIIl[llllllllllllllllllIIIIIIlllllIII % llllllllllllllllllIIIIIIlllllIIl.length]));
            0;
            ++llllllllllllllllllIIIIIIlllllIII;
            ++llllllllllllllllllIIIIIIllllIIII;
            0;
            if ((0x6A ^ 0x62 ^ (0x20 ^ 0x2D)) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIIIIlllllIlI);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.lIlllIlIIIllI(e.j(llIlllIllI[0]), llIlllIllI[1]) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llIlllIllI[2]];
            stringArray2[g.llIlllIllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlllIlIIlIII(list.size())) {
                ((NPC)list.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[7]]);
                Time.sleepTicks((int)llIlllIllI[4]);
                0;
            }
        }
        if (g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String llllllllllllllllllIIIIIlIIlIllll;
            String[] stringArray3 = new String[llIlllIllI[2]];
            stringArray3[g.llIlllIllI[3]] = llllllllllllllllllIIIIIlIIlIllll;
            List llllllllllllllllllIIIIIlIIlIllIl = NPCs.getAll((String[])stringArray3);
            if (g.lIlllIlIIlIII(llllllllllllllllllIIIIIlIIlIllIl.size())) {
                if (g.lIlllIlIIIlll(Reachable.isInteractable((Locatable)((Locatable)llllllllllllllllllIIIIIlIIlIllIl.get(llIlllIllI[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)llllllllllllllllllIIIIIlIIlIllIl.get(llIlllIllI[3])).getWorldLocation());
                    0;
                    Time.sleepTicks((int)llIlllIllI[2]);
                    0;
                }
                if (g.lIlllIlIIlIIl(Reachable.isInteractable((Locatable)((Locatable)llllllllllllllllllIIIIIlIIlIllIl.get(llIlllIllI[3]))) ? 1 : 0)) {
                    ((NPC)llllllllllllllllllIIIIIlIIlIllIl.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlllIllI[5]);
                    0;
                }
            }
        }
        if (!g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlIl[llIlllIllI[4]];
            if (g.lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                void llllllllllllllllllIIIIIlIIlIlllI;
                Dialog.chooseOption((String[])llllllllllllllllllIIIIIlIIlIlllI);
                0;
            }
            if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    public static boolean M() {
        int llllllllllllllllllIIIIIlIIlIIIlI = llIlllIllI[3];
        while (g.lIlllIlIIIllI(llllllllllllllllllIIIIIlIIlIIIlI, bs.length)) {
            List llllllllllllllllllIIIIIlIIlIIIIl = Widgets.get((int)bs[llllllllllllllllllIIIIIlIIlIIIlI]);
            if (g.lIlllIlIIIlll(llllllllllllllllllIIIIIlIIlIIIIl.isEmpty() ? 1 : 0) && g.lIlllIlIIlIIl(((Widget)llllllllllllllllllIIIIIlIIlIIIIl.get(llIlllIllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bs[llllllllllllllllllIIIIIlIIlIIIlI]);
                return llIlllIllI[2];
            }
            ++llllllllllllllllllIIIIIlIIlIIIlI;
            0;
            if (null == null) continue;
            return ((0x16 ^ 5 ^ (0xB2 ^ 0xB8)) & (0x1B ^ 0x58 ^ (0xE4 ^ 0xBE) ^ -1)) != 0;
        }
        return llIlllIllI[3];
    }
}

