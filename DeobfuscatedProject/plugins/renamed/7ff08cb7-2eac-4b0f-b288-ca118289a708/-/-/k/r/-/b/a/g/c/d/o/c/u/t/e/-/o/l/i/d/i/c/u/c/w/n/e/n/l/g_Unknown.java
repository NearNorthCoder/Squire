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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e_Unknown;
import gg.squire.account.AccBuilderGWD;
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
    private static final /* synthetic */ int bt;
    private static final /* synthetic */ int bp;
    private static final /* synthetic */ int bs;
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int[] bu;
    private static /* synthetic */ int[] llIlIIllI;
    private static final /* synthetic */ int br;
    private static /* synthetic */ String[] llIlIIlIl;

    public static void a(String[] stringArray) {
        if (g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            0;
        }
        if (!g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || g.lIllIIlIIIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    public static boolean M() {
        int lIIllIIllIlIll = llIlIIllI[3];
        while (g.lIllIIIllllI(lIIllIIllIlIll, bu.length)) {
            List lIIllIIllIlIlI = Widgets.get((int)bu[lIIllIIllIlIll]);
            if (g.lIllIIIlllll(lIIllIIllIlIlI.isEmpty() ? 1 : 0) && g.lIllIIlIIIIl(((Widget)lIIllIIllIlIlI.get(llIlIIllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bu[lIIllIIllIlIll]);
                return llIlIIllI[2];
            }
            ++lIIllIIllIlIll;
            0;
            if (-1 < 3) continue;
            return ((0x56 ^ 0x14 ^ (0x41 ^ 0x2F)) & (0xD4 ^ 0x8D ^ (0xE ^ 0x7B) ^ -1)) != 0;
        }
        return llIlIIllI[3];
    }

    private static boolean lIllIIIlllll(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIllIll(String lIIllIIllIIIII, String lIIllIIlIlllll) {
        try {
            SecretKeySpec lIIllIIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIlIlllll.getBytes(StandardCharsets.UTF_8)), llIlIIllI[16]), "DES");
            Cipher lIIllIIllIIlII = Cipher.getInstance("DES");
            lIIllIIllIIlII.init(llIlIIllI[6], lIIllIIllIIlIl);
            return new String(lIIllIIllIIlII.doFinal(Base64.getDecoder().decode(lIIllIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIllIIIll) {
            lIIllIIllIIIll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.lIllIIIllllI(e.j(llIlIIllI[0]), llIlIIllI[1]) && g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0) && g.lIllIIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llIlIIllI[2]];
            stringArray2[g.llIlIIllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIllIIlIIIII(list.size())) {
                ((NPC)list.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[7]]);
                Time.sleepTicks((int)llIlIIllI[4]);
                0;
            }
        }
        if (g.lIllIIIlllll(Dialog.isOpen() ? 1 : 0)) {
            String lIIllIIllllIII;
            String[] stringArray3 = new String[llIlIIllI[2]];
            stringArray3[g.llIlIIllI[3]] = lIIllIIllllIII;
            List lIIllIIlllIllI = NPCs.getAll((String[])stringArray3);
            if (g.lIllIIlIIIII(lIIllIIlllIllI.size())) {
                if (g.lIllIIIlllll(Reachable.isInteractable((Locatable)((Locatable)lIIllIIlllIllI.get(llIlIIllI[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)lIIllIIlllIllI.get(llIlIIllI[3])).getWorldLocation());
                    0;
                    Time.sleepTicks((int)llIlIIllI[2]);
                    0;
                }
                if (g.lIllIIlIIIIl(Reachable.isInteractable((Locatable)((Locatable)lIIllIIlllIllI.get(llIlIIllI[3]))) ? 1 : 0)) {
                    ((NPC)lIIllIIlllIllI.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlIIllI[5]);
                    0;
                }
            }
        }
        if (!g.lIllIIIlllll(Dialog.isOpen() ? 1 : 0) || !g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0) || !g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || g.lIllIIlIIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderGWD.c = llIlIIlIl[llIlIIllI[4]];
            if (g.lIllIIlIIIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0)) {
                void lIIllIIlllIlll;
                Dialog.chooseOption((String[])lIIllIIlllIlll);
                0;
            }
            if (!g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || g.lIllIIlIIIIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.lIllIIIllllI(e.j(llIlIIllI[0]), llIlIIllI[1]) && g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0) && g.lIllIIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llIlIIllI[2]];
            stringArray2[g.llIlIIllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIllIIlIIIII(list.size())) {
                ((NPC)list.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[3]]);
                Time.sleepTicks((int)llIlIIllI[4]);
                0;
            }
        }
        if (g.lIllIIIlllll(Dialog.isOpen() ? 1 : 0)) {
            String lIIllIIllllllI;
            String[] stringArray3 = new String[llIlIIllI[2]];
            stringArray3[g.llIlIIllI[3]] = lIIllIIllllllI;
            List lIIllIIlllllII = NPCs.getAll((String[])stringArray3);
            if (g.lIllIIlIIIII(lIIllIIlllllII.size())) {
                ((NPC)lIIllIIlllllII.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlIIllI[5]);
                0;
            }
        }
        if (!g.lIllIIIlllll(Dialog.isOpen() ? 1 : 0) || !g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0) || !g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || g.lIllIIlIIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderGWD.c = llIlIIlIl[llIlIIllI[6]];
            if (g.lIllIIlIIIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0)) {
                void lIIllIIlllllIl;
                Dialog.chooseOption((String[])lIIllIIlllllIl);
                0;
            }
            if (!g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || g.lIllIIlIIIIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    static {
        g.lIllIIIlllIl();
        g.lIllIIIlllII();
        bq = llIlIIllI[11];
        bt = llIlIIllI[12];
        bs = llIlIIllI[13];
        bp = llIlIIllI[14];
        br = llIlIIllI[15];
        int[] nArray = new int[llIlIIllI[4]];
        nArray[g.llIlIIllI[3]] = llIlIIllI[14];
        nArray[g.llIlIIllI[2]] = llIlIIllI[11];
        nArray[g.llIlIIllI[6]] = llIlIIllI[15];
        nArray[g.llIlIIllI[7]] = llIlIIllI[13];
        nArray[g.llIlIIllI[8]] = llIlIIllI[12];
        bu = nArray;
    }

    private static boolean lIllIIlIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIIlllIl() {
        llIlIIllI = new int[17];
        g.llIlIIllI[0] = 0xFFFF9D3F & 0x63D9;
        g.llIlIIllI[1] = 0xFFFFDBFF & 0x27E8;
        g.llIlIIllI[2] = 1;
        g.llIlIIllI[3] = (0x60 ^ 0x66) & ~(0x91 ^ 0x97);
        g.llIlIIllI[4] = 0x2B ^ 0x2E;
        g.llIlIIllI[5] = 0xFFFFEBFF & 0x1FB8;
        g.llIlIIllI[6] = 2;
        g.llIlIIllI[7] = 3;
        g.llIlIIllI[8] = 52 + 27 - 34 + 136 ^ 7 + 135 - 126 + 161;
        g.llIlIIllI[9] = 0xB4 ^ 0x8D ^ (0x9D ^ 0xA2);
        g.llIlIIllI[10] = 0x1B ^ 0x1C;
        g.llIlIIllI[11] = 74 + 111 - 100 + 71 + (96 + 157 - 183 + 122) - (224 + 13 - 131 + 148) + (29 + 81 - 36 + 63);
        g.llIlIIllI[12] = 108 + 170 - 79 + 30;
        g.llIlIIllI[13] = 2 + (68 + 35 - 91 + 163) - (140 + 155 - 167 + 35) + (69 + 67 - 105 + 174);
        g.llIlIIllI[14] = 35 + 46 - -76 + 20 + (0x9C ^ 0xC1) - (0xFFFFD3AF & 0x2D5D) + (87 + 9 - -59 + 37);
        g.llIlIIllI[15] = (0x23 ^ 0xD) + (0xD6 ^ 0xC3) - -(0x2C ^ 0x4A) + (0x30 ^ 0);
        g.llIlIIllI[16] = 39 + 1 - 13 + 103 ^ 122 + 41 - 131 + 106;
    }

    private static void lIllIIIlllII() {
        llIlIIlIl = new String[llIlIIllI[16]];
        g.llIlIIlIl[g.llIlIIllI[3]] = g."Talk-to";
        g.llIlIIlIl[g.llIlIIllI[2]] = g."Talk-to";
        g.llIlIIlIl[g.llIlIIllI[6]] = g."Choosing dialog";
        g.llIlIIlIl[g.llIlIIllI[7]] = g."Talk-to";
        g.llIlIIlIl[g.llIlIIllI[8]] = g."Talk-to";
        g.llIlIIlIl[g.llIlIIllI[4]] = g."Choosing dialog";
        g.llIlIIlIl[g.llIlIIllI[9]] = g."Talk-to";
        g.llIlIIlIl[g.llIlIIllI[10]] = g."Choosing dialog";
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.lIllIIIlllll(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[llIlIIllI[2]];
            stringArray2[g.llIlIIllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIllIIlIIIII(list.size())) {
                ((NPC)list.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlIIllI[5]);
                0;
            }
        }
        while (!g.lIllIIIlllll(Dialog.isOpen() ? 1 : 0) || !g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0) || !g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || g.lIllIIlIIIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderGWD.c = llIlIIlIl[llIlIIllI[10]];
                if (g.lIllIIlIIIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0)) {
                    void lIIllIIlllIIIl;
                    Dialog.chooseOption((String[])lIIllIIlllIIIl);
                    0;
                }
                if (!g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || g.lIllIIlIIIIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llIlIIllI[2]);
                0;
                0;
            }
            catch (Exception lIIllIIlllIIII) {
                // empty catch block
            }
            
            }
            Time.sleepTicks((int)llIlIIllI[2]);
            0;
            0;
            if (-(78 + 124 - 121 + 65 ^ 47 + 79 - 94 + 118) < 0) continue;
            return;
        }
    }

    private static boolean lIllIIlIIIII(int n2) {
        return n2 > 0;
    }

    private static String lIllIIIllIlI(String lIIllIIlIlIIll, String lIIllIIlIlIIlI) {
        try {
            SecretKeySpec lIIllIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIIlIlIlll = Cipher.getInstance("Blowfish");
            lIIllIIlIlIlll.init(llIlIIllI[6], lIIllIIlIllIII);
            return new String(lIIllIIlIlIlll.doFinal(Base64.getDecoder().decode(lIIllIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIlIlIllI) {
            lIIllIIlIlIllI.printStackTrace();
            return null;
        }
    }
}

