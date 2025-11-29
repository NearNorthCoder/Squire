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
package gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.d1f9e3af-c0a5-49dd-86b2-8e857984fef3.tasks.EHelper;
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
    private static final  int bj;
    private static final  int bl;
    private static final  int bi;
    private static final  int bm;
    private static final  int bk;
    private static final  int[] bn;

    private static void lIlIIllIIllI() {
        llIIIlIlI = new String[llIIIlIll[16]];
        g.llIIIlIlI[g.llIIIlIll[3]] = "Talk-to";
        g.llIIIlIlI[g.llIIIlIll[2]] = "Talk-to";
        g.llIIIlIlI[g.llIIIlIll[6]] = "Choosing dialog";
        g.llIIIlIlI[g.llIIIlIll[7]] = "Talk-to";
        g.llIIIlIlI[g.llIIIlIll[8]] = "Talk-to";
        g.llIIIlIlI[g.llIIIlIll[4]] = "Choosing dialog";
        g.llIIIlIlI[g.llIIIlIll[9]] = "Talk-to";
        g.llIIIlIlI[g.llIIIlIll[10]] = "Choosing dialog";
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

        }
        if (!g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
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

                    Time.sleepTicks((int)llIIIlIll[2]);

                }
                if (g.lIlIIllIlIll(Reachable.isInteractable((Locatable)((Locatable)lIllIlllIlIIII.get(llIIIlIll[3]))) ? 1 : 0)) {
                    ((NPC)lIllIlllIlIIII.get(llIIIlIll[3])).interact(llIIIlIlI[llIIIlIll[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIIIlIll[5]);

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

            }
            if (!g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static boolean lIlIIllIlIlI(int n2) {
        return n2 > 0;
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

                }
                if (!g.lIlIIllIlIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIlIll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llIIIlIll[2]);

            }
            catch (Exception lIllIlllIIlIlI) {
                // empty catch block
            }
            
            Time.sleepTicks((int)llIIIlIll[2]);

            return;
        }
    }
}

