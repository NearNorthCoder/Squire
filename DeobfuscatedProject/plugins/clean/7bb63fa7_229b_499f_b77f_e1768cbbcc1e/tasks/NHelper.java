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
package gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks;

import gg.squire.7bb63fa7-229b-499f-b77f-e1768cbbcc1e.tasks.KHelper;
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

public class NHelper {
    private static final  int cc;
    private static final  int bZ;
    private static final  int[] ce;
    
    private static final  int cd;
    
    private static final  int cb;
    private static final  int ca;

        return String.valueOf(lllllIlIlllIlIl);
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

                    Time.sleepTicks((int)llll[2]);

                }
                if (n.lIIllIl(Reachable.isInteractable((Locatable)((Locatable)lllllIllIIllIll.get(llll[3]))) ? 1 : 0)) {
                    ((NPC)lllllIllIIllIll.get(llll[3])).interact(lllI[llll[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llll[5]);

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

                }
                if (!n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || n.lIIllIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llll[2]);

            }
            catch (Exception lllllIllIIlIlIl) {
                // empty catch block
            }
            if ((0x29 ^ 0x2D) == 3) {
                return;
            }
            Time.sleepTicks((int)llll[2]);

            if (-1 <= 2) continue;
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

            }
            if (!n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) || n.lIIllIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    public static void c(String[] stringArray) {
        if (n.lIIlIll(Dialog.canContinueNPC() ? 1 : 0) && n.lIIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);

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
        n.lllI[n.llll[3]] = "Talk-to";
        n.lllI[n.llll[2]] = "Talk-to";
        n.lllI[n.llll[6]] = "Choosing dialog";
        n.lllI[n.llll[7]] = "Talk-to";
        n.lllI[n.llll[8]] = "Talk-to";
        n.lllI[n.llll[4]] = "Choosing dialog";
        n.lllI[n.llll[9]] = "Talk-to";
        n.lllI[n.llll[10]] = "Choosing dialog";
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

            if (1 != 0) continue;
            return false;
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

