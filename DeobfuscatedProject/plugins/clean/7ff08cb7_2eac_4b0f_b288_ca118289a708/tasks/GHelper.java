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
package gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks;

import gg.squire.7ff08cb7-2eac-4b0f-b288-ca118289a708.tasks.EHelper;
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

public class GHelper {
    private static final  int bt;
    private static final  int bp;
    private static final  int bs;
    private static final  int bq;
    private static final  int[] bu;
    
    private static final  int br;

    public static void a(String[] stringArray) {
        if (g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) && g.lIllIIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);

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

            if (-1 < 3) continue;
            return ((0x56 ^ 0x14 ^ (0x41 ^ 0x2F)) & (0xD4 ^ 0x8D ^ (0xE ^ 0x7B) ^ -1)) != 0;
        }
        return llIlIIllI[3];
    }

    private static boolean lIllIIIlllll(int n2) {
        return n2 == 0;
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

                    Time.sleepTicks((int)llIlIIllI[2]);

                }
                if (g.lIllIIlIIIIl(Reachable.isInteractable((Locatable)((Locatable)lIIllIIlllIllI.get(llIlIIllI[3]))) ? 1 : 0)) {
                    ((NPC)lIIllIIlllIllI.get(llIlIIllI[3])).interact(llIlIIlIl[llIlIIllI[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlIIllI[5]);

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

    private static void lIllIIIlllII() {
        llIlIIlIl = new String[llIlIIllI[16]];
        g.llIlIIlIl[g.llIlIIllI[3]] = "Talk-to";
        g.llIlIIlIl[g.llIlIIllI[2]] = "Talk-to";
        g.llIlIIlIl[g.llIlIIllI[6]] = "Choosing dialog";
        g.llIlIIlIl[g.llIlIIllI[7]] = "Talk-to";
        g.llIlIIlIl[g.llIlIIllI[8]] = "Talk-to";
        g.llIlIIlIl[g.llIlIIllI[4]] = "Choosing dialog";
        g.llIlIIlIl[g.llIlIIllI[9]] = "Talk-to";
        g.llIlIIlIl[g.llIlIIllI[10]] = "Choosing dialog";
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

                }
                if (!g.lIllIIIlllll(Dialog.canContinueNPC() ? 1 : 0) || g.lIllIIlIIIIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llIlIIllI[2]);

            }
            catch (Exception lIIllIIlllIIII) {
                // empty catch block
            }
            
            }
            Time.sleepTicks((int)llIlIIllI[2]);

            if (-(78 + 124 - 121 + 65 ^ 47 + 79 - 94 + 118) < 0) continue;
            return;
        }
    }

    private static boolean lIllIIlIIIII(int n2) {
        return n2 > 0;
    }

}

