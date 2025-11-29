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
package gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks;

import gg.squire.account.AccBuilderRat;
import gg.squire.9e609a1b-c462-421a-8c76-4c9774ea7671.tasks.EHelper;
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
    private static final  int bq;
    private static final  int bn;
    
    private static final  int[] bs;
    private static final  int bo;
    private static final  int br;
    
    private static final  int bp;

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIlllllIlII[2]];
            stringArray2[g.lIIIlllllIlII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIllIIlIlIIl(list.size())) {
                ((NPC)list.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIIlllllIlII[5]);

            }
        }
        while (!g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[10]];
                if (g.lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                    void var1;
                    Dialog.chooseOption((String[])var1);

                }
                if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)lIIIlllllIlII[2]);

            }
            catch (Exception var2) {
                // empty catch block
            }
            if ((0x23 ^ 0x52 ^ (0x30 ^ 0x45)) < (0x6E ^ 0x43 ^ (0x72 ^ 0x5B))) {
                return;
            }
            Time.sleepTicks((int)lIIIlllllIlII[2]);

            if (1 >= ((0x7F ^ 0x6C ^ (0x8D ^ 0xC5)) & (117 + 136 - 250 + 206 ^ 130 + 125 - 200 + 83 ^ -1))) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.lIlIIllIIlIIlll(e.j(lIIIlllllIlII[0]), lIIIlllllIlII[1]) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIlllllIlII[2]];
            stringArray2[g.lIIIlllllIlII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIllIIlIlIIl(list.size())) {
                ((NPC)list.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[3]]);
                Time.sleepTicks((int)lIIIlllllIlII[4]);

            }
        }
        if (g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String var3;
            String[] stringArray3 = new String[lIIIlllllIlII[2]];
            stringArray3[g.lIIIlllllIlII[3]] = var3;
            List var4 = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIllIIlIlIIl(var4.size())) {
                ((NPC)var4.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIIlllllIlII[5]);

            }
        }
        if (!g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[6]];
            if (g.lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                void var5;
                Dialog.chooseOption((String[])var5);

            }
            if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static boolean lIlIIllIIlIlIIl(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.lIlIIllIIlIIlll(e.j(lIIIlllllIlII[0]), lIIIlllllIlII[1]) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIlllllIlII[2]];
            stringArray2[g.lIIIlllllIlII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIlIIllIIlIlIIl(list.size())) {
                ((NPC)list.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[7]]);
                Time.sleepTicks((int)lIIIlllllIlII[4]);

            }
        }
        if (g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String var6;
            String[] stringArray3 = new String[lIIIlllllIlII[2]];
            stringArray3[g.lIIIlllllIlII[3]] = var6;
            List var7 = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIllIIlIlIIl(var7.size())) {
                if (g.lIlIIllIIlIlIII(Reachable.isInteractable((Locatable)((Locatable)var7.get(lIIIlllllIlII[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var7.get(lIIIlllllIlII[3])).getWorldLocation());

                    Time.sleepTicks((int)lIIIlllllIlII[2]);

                }
                if (g.lIlIIllIIlIlIlI(Reachable.isInteractable((Locatable)((Locatable)var7.get(lIIIlllllIlII[3]))) ? 1 : 0)) {
                    ((NPC)var7.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIIlllllIlII[5]);

                }
            }
        }
        if (!g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[4]];
            if (g.lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                void var8;
                Dialog.chooseOption((String[])var8);

            }
            if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

        return String.valueOf(var9);
    }

    private static boolean lIlIIllIIlIlIlI(int n2) {
        return n2 != 0;
    }

    static {
        g.lIlIIllIIlIIllI();
        g.lIlIIllIIlIIlIl();
        bp = lIIIlllllIlII[11];
        bq = lIIIlllllIlII[12];
        br = lIIIlllllIlII[13];
        bo = lIIIlllllIlII[14];
        bn = lIIIlllllIlII[15];
        int[] nArray = new int[lIIIlllllIlII[4]];
        nArray[g.lIIIlllllIlII[3]] = lIIIlllllIlII[15];
        nArray[g.lIIIlllllIlII[2]] = lIIIlllllIlII[14];
        nArray[g.lIIIlllllIlII[6]] = lIIIlllllIlII[11];
        nArray[g.lIIIlllllIlII[7]] = lIIIlllllIlII[12];
        nArray[g.lIIIlllllIlII[8]] = lIIIlllllIlII[13];
        bs = nArray;
    }

    private static boolean lIlIIllIIlIlIII(int n2) {
        return n2 == 0;
    }

    private static void lIlIIllIIlIIlIl() {
        lIIIlllllIIlI = new String[lIIIlllllIlII[16]];
        g.lIIIlllllIIlI[g.lIIIlllllIlII[3]] = "Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[2]] = "Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[6]] = "Choosing dialog";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[7]] = "Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[8]] = "Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[4]] = "Choosing dialog";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[9]] = "Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[10]] = "Choosing dialog";
    }

    public static boolean L() {
        int var10 = lIIIlllllIlII[3];
        while (g.lIlIIllIIlIIlll(var10, bs.length)) {
            List var11 = Widgets.get((int)bs[var10]);
            if (g.lIlIIllIIlIlIII(var11.isEmpty() ? 1 : 0) && g.lIlIIllIIlIlIlI(((Widget)var11.get(lIIIlllllIlII[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bs[var10]);
                return lIIIlllllIlII[2];
            }
            ++var10;

            if (-1 < 0) continue;
            return false;
        }
        return lIIIlllllIlII[3];
    }

    private static boolean lIlIIllIIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static void a(String[] stringArray) {
        if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);

        }
        if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}

