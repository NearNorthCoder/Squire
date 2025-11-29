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
package gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks;

import gg.squire.51c4371d-854c-4c1b-8841-207ed7d6bdc3.tasks.EHelper;
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

public class GHelper {
    private static final  int br;
    private static final  int bq;
    private static final  int bs;
    private static final  int bp;

    private static final  int[] bt;
    private static final  int bo;

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

            }
            if (!g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static boolean lIlIIlIlIll(int n2, int n3) {
        return n2 < n3;
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

            if ((0xA5 ^ 0xC1 ^ (0x3D ^ 0x5C)) != 0) continue;
            return ((0x73 ^ 0x1E ^ (0xF7 ^ 0xBC)) & (0x70 ^ 0x31 ^ (0xB ^ 0x6C) ^ -1)) != 0;
        }
        return llIIIllI[3];
    }

    private static boolean lIlIIlIllIl(int n2) {
        return n2 > 0;
    }

    private static void lIlIIlIlIIl() {
        llIIIlIl = new String[llIIIllI[16]];
        g.llIIIlIl[g.llIIIllI[3]] = "Talk-to";
        g.llIIIlIl[g.llIIIllI[2]] = "Talk-to";
        g.llIIIlIl[g.llIIIllI[6]] = "Choosing dialog";
        g.llIIIlIl[g.llIIIllI[7]] = "Talk-to";
        g.llIIIlIl[g.llIIIllI[8]] = "Talk-to";
        g.llIIIlIl[g.llIIIllI[4]] = "Choosing dialog";
        g.llIIIlIl[g.llIIIllI[9]] = "Talk-to";
        g.llIIIlIl[g.llIIIllI[10]] = "Choosing dialog";
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

                }
                if (!g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llIIIllI[2]);

            }
            catch (Exception lIlIlIllllIIlII) {
                // empty catch block
            }
            if (3 == 0) {
                return;
            }
            Time.sleepTicks((int)llIIIllI[2]);

            return;
        }
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

                    Time.sleepTicks((int)llIIIllI[2]);

                }
                if (g.lIlIIlIlllI(Reachable.isInteractable((Locatable)((Locatable)lIlIlIllllIlIlI.get(llIIIllI[3]))) ? 1 : 0)) {
                    ((NPC)lIlIlIllllIlIlI.get(llIIIllI[3])).interact(llIIIlIl[llIIIllI[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIllI[5]);

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

        }
        if (!g.lIlIIlIllII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIlIlllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}

