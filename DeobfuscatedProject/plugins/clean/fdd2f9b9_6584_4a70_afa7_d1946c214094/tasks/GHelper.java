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
package gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks;

import gg.squire.fdd2f9b9-6584-4a70-afa7-d1946c214094.tasks.EHelper;
import gg.squire.account.AccBuilderRogues;
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
    private static final  int[] bn;
    private static final  int bk;
    private static final  int bi;
    private static final  int bj;
    
    private static final  int bl;
    private static final  int bm;

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.lIIIIlIIlllII(e.j(lIIlllIlIl[0]), lIIlllIlIl[1]) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlllIlIl[2]];
            stringArray2[g.lIIlllIlIl[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIIIIlIIllllI(list.size())) {
                ((NPC)list.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[3]]);
                Time.sleepTicks((int)lIIlllIlIl[4]);

            }
        }
        if (g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String var1;
            String[] stringArray3 = new String[lIIlllIlIl[2]];
            stringArray3[g.lIIlllIlIl[3]] = var1;
            List var2 = NPCs.getAll((String[])stringArray3);
            if (g.lIIIIlIIllllI(var2.size())) {
                ((NPC)var2.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIlllIlIl[5]);

            }
        }
        if (!g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[6]];
            if (g.lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                void var3;
                Dialog.chooseOption((String[])var3);

            }
            if (!g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlllIlIl[2]];
            stringArray2[g.lIIlllIlIl[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIIIIlIIllllI(list.size())) {
                ((NPC)list.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIlllIlIl[5]);

            }
        }
        while (!g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[10]];
                if (g.lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                    void var4;
                    Dialog.chooseOption((String[])var4);

                }
                if (!g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)lIIlllIlIl[2]);

            }
            catch (Exception var5) {
                // empty catch block
            }
            if (((0x9F ^ 0xC5) & ~(0xD6 ^ 0x8C)) != 0) {
                return;
            }
            Time.sleepTicks((int)lIIlllIlIl[2]);

            if ((2 & (2 ^ -1)) != -1) continue;
            return;
        }
    }

    public static void a(String[] stringArray) {
        if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);

        }
        if (!g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIIIIlIIllllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIlIIlllII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.lIIIIlIIlllII(e.j(lIIlllIlIl[0]), lIIlllIlIl[1]) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlllIlIl[2]];
            stringArray2[g.lIIlllIlIl[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.lIIIIlIIllllI(list.size())) {
                ((NPC)list.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[7]]);
                Time.sleepTicks((int)lIIlllIlIl[4]);

            }
        }
        if (g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String var7;
            String[] stringArray3 = new String[lIIlllIlIl[2]];
            stringArray3[g.lIIlllIlIl[3]] = var7;
            List var8 = NPCs.getAll((String[])stringArray3);
            if (g.lIIIIlIIllllI(var8.size())) {
                if (g.lIIIIlIIlllIl(Reachable.isInteractable((Locatable)((Locatable)var8.get(lIIlllIlIl[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var8.get(lIIlllIlIl[3])).getWorldLocation());

                    Time.sleepTicks((int)lIIlllIlIl[2]);

                }
                if (g.lIIIIlIIlllll(Reachable.isInteractable((Locatable)((Locatable)var8.get(lIIlllIlIl[3]))) ? 1 : 0)) {
                    ((NPC)var8.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIlllIlIl[5]);

                }
            }
        }
        if (!g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[4]];
            if (g.lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                void var9;
                Dialog.chooseOption((String[])var9);

            }
            if (!g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    static {
        g.lIIIIlIIllIll();
        g.lIIIIlIIllIlI();
        bl = lIIlllIlIl[11];
        bm = lIIlllIlIl[12];
        bj = lIIlllIlIl[13];
        bi = lIIlllIlIl[14];
        bk = lIIlllIlIl[15];
        int[] nArray = new int[lIIlllIlIl[4]];
        nArray[g.lIIlllIlIl[3]] = lIIlllIlIl[14];
        nArray[g.lIIlllIlIl[2]] = lIIlllIlIl[13];
        nArray[g.lIIlllIlIl[6]] = lIIlllIlIl[15];
        nArray[g.lIIlllIlIl[7]] = lIIlllIlIl[11];
        nArray[g.lIIlllIlIl[8]] = lIIlllIlIl[12];
        bn = nArray;
    }

    private static void lIIIIlIIllIlI() {
        lIIlllIlII = new String[lIIlllIlIl[16]];
        g.lIIlllIlII[g.lIIlllIlIl[3]] = "Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[2]] = "Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[6]] = "Choosing dialog";
        g.lIIlllIlII[g.lIIlllIlIl[7]] = "Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[8]] = "Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[4]] = "Choosing dialog";
        g.lIIlllIlII[g.lIIlllIlIl[9]] = "Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[10]] = "Choosing dialog";
    }

    private static boolean lIIIIlIIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIlIIlllll(int n2) {
        return n2 != 0;
    }

    public static boolean K() {
        int var10 = lIIlllIlIl[3];
        while (g.lIIIIlIIlllII(var10, bn.length)) {
            List var11 = Widgets.get((int)bn[var10]);
            if (g.lIIIIlIIlllIl(var11.isEmpty() ? 1 : 0) && g.lIIIIlIIlllll(((Widget)var11.get(lIIlllIlIl[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bn[var10]);
                return lIIlllIlIl[2];
            }
            ++var10;

            if (2 >= 0) continue;
            return ((39 + 6 - -13 + 97 ^ 42 + 130 - 164 + 149) & (0x22 ^ 0x58 ^ (0x1F ^ 0x63) ^ -1)) != 0;
        }
        return lIIlllIlIl[3];
    }
}

