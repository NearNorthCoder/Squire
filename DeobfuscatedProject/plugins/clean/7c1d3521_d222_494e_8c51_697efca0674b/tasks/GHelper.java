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
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

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
import gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks.EHelper;

public class GHelper {
    private static final  int bo;
    private static final  int bp;
    private static final  int[] bs;
    private static final  int bq;
    private static final  int br;
    
    private static final  int bn;

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

        }
        if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
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

            }
        }
        if (g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String var1;
            String[] stringArray3 = new String[llIlllIllI[2]];
            stringArray3[g.llIlllIllI[3]] = var1;
            List var2 = NPCs.getAll((String[])stringArray3);
            if (g.lIlllIlIIlIII(var2.size())) {
                ((NPC)var2.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlllIllI[5]);

            }
        }
        if (!g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlIl[llIlllIllI[6]];
            if (g.lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                void var3;
                Dialog.chooseOption((String[])var3);

            }
            if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static void lIlllIlIIIlII() {
        llIlllIlIl = new String[llIlllIllI[16]];
        g.llIlllIlIl[g.llIlllIllI[3]] = "Talk-to";
        g.llIlllIlIl[g.llIlllIllI[2]] = "Talk-to";
        g.llIlllIlIl[g.llIlllIllI[6]] = "Choosing dialog";
        g.llIlllIlIl[g.llIlllIllI[7]] = "Talk-to";
        g.llIlllIlIl[g.llIlllIllI[8]] = "Talk-to";
        g.llIlllIlIl[g.llIlllIllI[4]] = "Choosing dialog";
        g.llIlllIlIl[g.llIlllIllI[9]] = "Talk-to";
        g.llIlllIlIl[g.llIlllIllI[10]] = "Choosing dialog";
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

            }
        }
        while (!g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderSotf.c = llIlllIlIl[llIlllIllI[10]];
                if (g.lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                    void var4;
                    Dialog.chooseOption((String[])var4);

                }
                if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llIlllIllI[2]);

            }
            catch (Exception var5) {
                // empty catch block
            }
            if (((0x57 ^ 0xE) & ~(0x49 ^ 0x10)) != 0) {
                return;
            }
            Time.sleepTicks((int)llIlllIllI[2]);

            return;
        }
    }

        return String.valueOf(var6);
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

            }
        }
        if (g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String var7;
            String[] stringArray3 = new String[llIlllIllI[2]];
            stringArray3[g.llIlllIllI[3]] = var7;
            List var8 = NPCs.getAll((String[])stringArray3);
            if (g.lIlllIlIIlIII(var8.size())) {
                if (g.lIlllIlIIIlll(Reachable.isInteractable((Locatable)((Locatable)var8.get(llIlllIllI[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var8.get(llIlllIllI[3])).getWorldLocation());

                    Time.sleepTicks((int)llIlllIllI[2]);

                }
                if (g.lIlllIlIIlIIl(Reachable.isInteractable((Locatable)((Locatable)var8.get(llIlllIllI[3]))) ? 1 : 0)) {
                    ((NPC)var8.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlllIllI[5]);

                }
            }
        }
        if (!g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlIl[llIlllIllI[4]];
            if (g.lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                void var9;
                Dialog.chooseOption((String[])var9);

            }
            if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    public static boolean M() {
        int var10 = llIlllIllI[3];
        while (g.lIlllIlIIIllI(var10, bs.length)) {
            List var11 = Widgets.get((int)bs[var10]);
            if (g.lIlllIlIIIlll(var11.isEmpty() ? 1 : 0) && g.lIlllIlIIlIIl(((Widget)var11.get(llIlllIllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bs[var10]);
                return llIlllIllI[2];
            }
            ++var10;

            return ((0x16 ^ 5 ^ (0xB2 ^ 0xB8)) & (0x1B ^ 0x58 ^ (0xE4 ^ 0xBE) ^ -1)) != 0;
        }
        return llIlllIllI[3];
    }
}

