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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
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
    private static final /* synthetic */ int bj;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bi;
    private static final /* synthetic */ int bm;
    private static final /* synthetic */ int bk;
    private static final /* synthetic */ int[] bn;
    private static /* synthetic */ String[] llIIIlIlI;
    private static /* synthetic */ int[] llIIIlIll;

    private static void lIlIIllIIllI() {
        llIIIlIlI = new String[llIIIlIll[16]];
        g.llIIIlIlI[g.llIIIlIll[3]] = g."Talk-to";
        g.llIIIlIlI[g.llIIIlIll[2]] = g."Talk-to";
        g.llIIIlIlI[g.llIIIlIll[6]] = g."Choosing dialog";
        g.llIIIlIlI[g.llIIIlIll[7]] = g."Talk-to";
        g.llIIIlIlI[g.llIIIlIll[8]] = g."Talk-to";
        g.llIIIlIlI[g.llIIIlIll[4]] = g."Choosing dialog";
        g.llIIIlIlI[g.llIIIlIll[9]] = g."Talk-to";
        g.llIIIlIlI[g.llIIIlIll[10]] = g."Choosing dialog";
    }

    private static String lIlIIllIIIll(String lIllIllIIlIlll, String lIllIllIIlIlII) {
        try {
            SecretKeySpec lIllIllIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIIlIlII.getBytes(StandardCharsets.UTF_8)), llIIIlIll[16]), "DES");
            Cipher lIllIllIIllIIl = Cipher.getInstance("DES");
            lIllIllIIllIIl.init(llIIIlIll[6], lIllIllIIllIlI);
            return new String(lIllIllIIllIIl.doFinal(Base64.getDecoder().decode(lIllIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllIIllIII) {
            lIllIllIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIllIlIll(int n2) {
        return n2 != 0;
    }

    static {
        g.lIlIIllIIlll();
        g.lIlIIllIIllI();
        bk = llIIIlIll[11];
        bj = llIIIlIll[12];
        bl = llIIIlIll[13];
        bm = llIIIlIll[14];
        bi = llIIIlIll[15];
        int[] nArray = new int[llIIIlIll[4]];
        nArray[g.llIIIlIll[3]] = llIIIlIll[15];
        nArray[g.llIIIlIll[2]] = llIIIlIll[12];
        nArray[g.llIIIlIll[6]] = llIIIlIll[11];
        nArray[g.llIIIlIll[7]] = llIIIlIll[13];
        nArray[g.llIIIlIll[8]] = llIIIlIll[14];
        bn = nArray;
    }

    public static void a(String[] stringArray) {
        if (g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            0;
        }
        if (!g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static void lIlIIllIIlll() {
        llIIIlIll = new int[17];
        g.llIIIlIll[0] = 0xFFFFF139 & 0xFDF;
        g.llIIIlIll[1] = 0xFFFFDFFC & 0x23EB;
        g.llIIIlIll[2] = 1;
        g.llIIIlIll[3] = (0x37 ^ 0xA) & ~(0x95 ^ 0xA8);
        g.llIIIlIll[4] = 0x4D ^ 0x48;
        g.llIIIlIll[5] = 0xFFFF8FFC & 0x7BBB;
        g.llIIIlIll[6] = 2;
        g.llIIIlIll[7] = 3;
        g.llIIIlIll[8] = 0x7B ^ 0x7F;
        g.llIIIlIll[9] = 0x4C ^ 0x4A;
        g.llIIIlIll[10] = 0xC7 ^ 0xC0;
        g.llIIIlIll[11] = 22 + 203 - 221 + 213;
        g.llIIIlIll[12] = (0x1D ^ 0x7B) + (137 + 43 - 107 + 93) - (33 + 6 - -98 + 64) + (139 + 140 - 175 + 60);
        g.llIIIlIll[13] = 68 + 117 - 80 + 114;
        g.llIIIlIll[14] = 26 + 9 - -96 + 98;
        g.llIIIlIll[15] = 4 + 43 - -75 + 71;
        g.llIIIlIll[16] = 0x9B ^ 0x8A ^ (0x8F ^ 0x96);
    }

    private static String lIlIIllIIlII(String lIllIllIllllII, String lIllIllIlllIll) {
        try {
            SecretKeySpec lIllIllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIllIlllllI = Cipher.getInstance("Blowfish");
            lIllIllIlllllI.init(llIIIlIll[6], lIllIllIllllll);
            return new String(lIllIllIlllllI.doFinal(Base64.getDecoder().decode(lIllIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllIllllIl) {
            lIllIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIlIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.lIlIIllIlIII(e.j(llIIIlIll[0]), llIIIlIll[1]) && g.lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) && g.lIlIIllIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIlIll[2]];
            stringArray2[g.llIIIlIll[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIllIlIlI(list.size())) {
                ((NPC)list.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[7]]);
                Time.sleepTicks((int)llIIIlIll[4]);
                0;
            }
        }
        if (g.lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            String lIllIlllIlIIlI;
            String[] stringArray3 = new String[llIIIlIll[2]];
            stringArray3[g.llIIIlIll[3]] = lIllIlllIlIIlI;
            List lIllIlllIlIIII = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIllIlIlI(lIllIlllIlIIII.size())) {
                if (g.lIlIIllIlIIl(Reachable.isInteractable((Locatable)((Locatable)lIllIlllIlIIII.get(llIIIlIll[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)lIllIlllIlIIII.get(llIIIlIll[3])).getWorldLocation());
                    0;
                    Time.sleepTicks((int)llIIIlIll[2]);
                    0;
                }
                if (g.lIlIIllIlIll(Reachable.isInteractable((Locatable)((Locatable)lIllIlllIlIIII.get(llIIIlIll[3]))) ? 1 : 0)) {
                    ((NPC)lIllIlllIlIIII.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIlIll[5]);
                    0;
                }
            }
        }
        if (!g.lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIlIlI[llIIIlIll[4]];
            if (g.lIlIIllIlIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
                void lIllIlllIlIIIl;
                Dialog.chooseOption((String[])lIllIlllIlIIIl);
                0;
            }
            if (!g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static boolean lIlIIllIlIlI(int n2) {
        return n2 > 0;
    }

    private static String lIlIIllIIlIl(String lIllIllIlIIlll, String lIllIllIlIlIll) {
        lIllIllIlIIlll = new String(Base64.getDecoder().decode(lIllIllIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIllIlIlIlI = new StringBuilder();
        char[] lIllIllIlIlIIl = lIllIllIlIlIll.toCharArray();
        int lIllIllIlIlIII = llIIIlIll[3];
        char[] lIllIllIlIIIlI = lIllIllIlIIlll.toCharArray();
        int lIllIllIlIIIIl = lIllIllIlIIIlI.length;
        int lIllIllIlIIIII = llIIIlIll[3];
        while (g.lIlIIllIlIII(lIllIllIlIIIII, lIllIllIlIIIIl)) {
            char lIllIllIlIllIl = lIllIllIlIIIlI[lIllIllIlIIIII];
            lIllIllIlIlIlI.append((char)(lIllIllIlIllIl ^ lIllIllIlIlIIl[lIllIllIlIlIII % lIllIllIlIlIIl.length]));
            0;
            ++lIllIllIlIlIII;
            ++lIllIllIlIIIII;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(lIllIllIlIlIlI);
    }

    public static boolean K() {
        int lIllIlllIIIlIl = llIIIlIll[3];
        while (g.lIlIIllIlIII(lIllIlllIIIlIl, bn.length)) {
            List lIllIlllIIIlII = Widgets.get((int)bn[lIllIlllIIIlIl]);
            if (g.lIlIIllIlIIl(lIllIlllIIIlII.isEmpty() ? 1 : 0) && g.lIlIIllIlIll(((Widget)lIllIlllIIIlII.get(llIIIlIll[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bn[lIllIlllIIIlIl]);
                return llIIIlIll[2];
            }
            ++lIllIlllIIIlIl;
            0;
            if ((0x18 ^ 0x6B ^ (0x4B ^ 0x3C)) != 0) continue;
            return ((1 ^ 0x26 ^ 2) & (0xD0 ^ 0x9E ^ (1 ^ 0x6A) ^ -1)) != 0;
        }
        return llIIIlIll[3];
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.lIlIIllIlIII(e.j(llIIIlIll[0]), llIIIlIll[1]) && g.lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) && g.lIlIIllIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIlIll[2]];
            stringArray2[g.llIIIlIll[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIllIlIlI(list.size())) {
                ((NPC)list.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[3]]);
                Time.sleepTicks((int)llIIIlIll[4]);
                0;
            }
        }
        if (g.lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            String lIllIlllIllIII;
            String[] stringArray3 = new String[llIIIlIll[2]];
            stringArray3[g.llIIIlIll[3]] = lIllIlllIllIII;
            List lIllIlllIlIllI = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIllIlIlI(lIllIlllIlIllI.size())) {
                ((NPC)lIllIlllIlIllI.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIlIll[5]);
                0;
            }
        }
        if (!g.lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIlIlI[llIIIlIll[6]];
            if (g.lIlIIllIlIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
                void lIllIlllIlIlll;
                Dialog.chooseOption((String[])lIllIlllIlIlll);
                0;
            }
            if (!g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[llIIIlIll[2]];
            stringArray2[g.llIIIlIll[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIllIlIlI(list.size())) {
                ((NPC)list.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIlIll[5]);
                0;
            }
        }
        while (!g.lIlIIllIlIIl(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderEasyClues.c = llIIIlIlI[llIIIlIll[10]];
                if (g.lIlIIllIlIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIlIIl(Dialog.canContinue() ? 1 : 0)) {
                    void lIllIlllIIlIll;
                    Dialog.chooseOption((String[])lIllIlllIIlIll);
                    0;
                }
                if (!g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llIIIlIll[2]);
                0;
                0;
            }
            catch (Exception lIllIlllIIlIlI) {
                // empty catch block
            }
            if (-3 >= 0) {
                return;
            }
            Time.sleepTicks((int)llIIIlIll[2]);
            0;
            0;
            if (null == null) continue;
            return;
        }
    }
}

