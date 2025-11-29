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
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import gg.squire.account.AccBuilderShamans;
import gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks.EHelper;
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
    private static final  int bk;
    private static final  int bl;
    private static final  int bh;
    
    private static final  int[] bm;
    private static final  int bj;
    
    private static final  int bi;

    public static boolean K() {
        int var1 = lIlIlllllI[3];
        while (g.lIIlIlIIllIII(var1, bm.length)) {
            List var2 = Widgets.get((int)bm[var1]);
            if (g.lIIlIlIIllIIl(var2.isEmpty() ? 1 : 0) && g.lIIlIlIIllIll(((Widget)var2.get(lIlIlllllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bm[var1]);
                return lIlIlllllI[2];
            }
            ++var1;

            if (((0xA6 ^ 0xAD) & ~(0x9F ^ 0x94)) == 0) continue;
            return false;
        }
        return lIlIlllllI[3];
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.lIIlIlIIllIII(e.j(lIlIlllllI[0]), lIlIlllllI[1]) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIlllllI[2]];
            stringArray2[g.lIlIlllllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIIlIlIIllIlI(list.size())) {
                ((NPC)list.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[3]]);
                Time.sleepTicks((int)lIlIlllllI[4]);

            }
        }
        if (g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String var3;
            String[] stringArray3 = new String[lIlIlllllI[2]];
            stringArray3[g.lIlIlllllI[3]] = var3;
            List var4 = NPCs.getAll((String[])stringArray3);
            if (g.lIIlIlIIllIlI(var4.size())) {
                ((NPC)var4.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIlIlllllI[5]);

            }
        }
        if (!g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllIl[lIlIlllllI[6]];
            if (g.lIIlIlIIllIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
                void var5;
                Dialog.chooseOption((String[])var5);

            }
            if (!g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static boolean lIIlIlIIllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIlllllI[2]];
            stringArray2[g.lIlIlllllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIIlIlIIllIlI(list.size())) {
                ((NPC)list.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIlIlllllI[5]);

            }
        }
        while (!g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderShamans.c = lIlIllllIl[lIlIlllllI[10]];
                if (g.lIIlIlIIllIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
                    void var6;
                    Dialog.chooseOption((String[])var6);

                }
                if (!g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)lIlIlllllI[2]);

            }
            catch (Exception var7) {
                // empty catch block
            }
            
            }
            Time.sleepTicks((int)lIlIlllllI[2]);

            if (3 > 0) continue;
            return;
        }
    }

    static {
        g.lIIlIlIIlIlll();
        g.lIIlIlIIlIllI();
        bl = lIlIlllllI[11];
        bi = lIlIlllllI[12];
        bj = lIlIlllllI[13];
        bk = lIlIlllllI[14];
        bh = lIlIlllllI[15];
        int[] nArray = new int[lIlIlllllI[4]];
        nArray[g.lIlIlllllI[3]] = lIlIlllllI[15];
        nArray[g.lIlIlllllI[2]] = lIlIlllllI[12];
        nArray[g.lIlIlllllI[6]] = lIlIlllllI[13];
        nArray[g.lIlIlllllI[7]] = lIlIlllllI[14];
        nArray[g.lIlIlllllI[8]] = lIlIlllllI[11];
        bm = nArray;
    }

    private static boolean lIIlIlIIllIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var8);
    }

    private static boolean lIIlIlIIllIll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.lIIlIlIIllIII(e.j(lIlIlllllI[0]), lIlIlllllI[1]) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIlllllI[2]];
            stringArray2[g.lIlIlllllI[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIIlIlIIllIlI(list.size())) {
                ((NPC)list.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[7]]);
                Time.sleepTicks((int)lIlIlllllI[4]);

            }
        }
        if (g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String var9;
            String[] stringArray3 = new String[lIlIlllllI[2]];
            stringArray3[g.lIlIlllllI[3]] = var9;
            List var10 = NPCs.getAll((String[])stringArray3);
            if (g.lIIlIlIIllIlI(var10.size())) {
                if (g.lIIlIlIIllIIl(Reachable.isInteractable((Locatable)((Locatable)var10.get(lIlIlllllI[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var10.get(lIlIlllllI[3])).getWorldLocation());

                    Time.sleepTicks((int)lIlIlllllI[2]);

                }
                if (g.lIIlIlIIllIll(Reachable.isInteractable((Locatable)((Locatable)var10.get(lIlIlllllI[3]))) ? 1 : 0)) {
                    ((NPC)var10.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lIlIlllllI[5]);

                }
            }
        }
        if (!g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllIl[lIlIlllllI[4]];
            if (g.lIIlIlIIllIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
                void var11;
                Dialog.chooseOption((String[])var11);

            }
            if (!g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    public static void a(String[] stringArray) {
        if (g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);

        }
        if (!g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static void lIIlIlIIlIllI() {
        lIlIllllIl = new String[lIlIlllllI[16]];
        g.lIlIllllIl[g.lIlIlllllI[3]] = "Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[2]] = "Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[6]] = "Choosing dialog";
        g.lIlIllllIl[g.lIlIlllllI[7]] = "Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[8]] = "Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[4]] = "Choosing dialog";
        g.lIlIllllIl[g.lIlIlllllI[9]] = "Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[10]] = "Choosing dialog";
    }

    private static boolean lIIlIlIIllIlI(int n2) {
        return n2 > 0;
    }
}

