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
package gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks;

import gg.squire.3047f210-3107-4c67-939d-3c9e588029ae.tasks.EHelper;
import gg.squire.account.AccBuilderTempleTrek;
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
    private static final  int bi;
    private static final  int bl;
    private static final  int bh;
    
    private static final  int bj;
    private static final  int bk;
    
    private static final  int[] bm;

    private static boolean llIIlllIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIllIII(int n2) {
        return n2 != 0;
    }

    public static boolean K() {
        int var1 = llllIlIIII[3];
        while (g.llIIlllIlIlIl(var1, bm.length)) {
            List var2 = Widgets.get((int)bm[var1]);
            if (g.llIIlllIlIllI(var2.isEmpty() ? 1 : 0) && g.llIIlllIllIII(((Widget)var2.get(llllIlIIII[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bm[var1]);
                return llllIlIIII[2];
            }
            ++var1;

            if (3 > 0) continue;
            return ((0x71 ^ 0x2C ^ (0xFF ^ 0xA8)) & (0x5F ^ 0x1F ^ (0xCE ^ 0x84) ^ -1)) != 0;
        }
        return llllIlIIII[3];
    }

    private static boolean llIIlllIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public static void a(String[] stringArray) {
        if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);

        }
        if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void b(String string, String[] stringArray) {
        if (g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String[] stringArray2 = new String[llllIlIIII[2]];
            stringArray2[g.llllIlIIII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.llIIlllIlIlll(list.size())) {
                ((NPC)list.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[9]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llllIlIIII[5]);

            }
        }
        while (!g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[10]];
                if (g.llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                    void var3;
                    Dialog.chooseOption((String[])var3);

                }
                if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llllIlIIII[2]);

            }
            catch (Exception var4) {
                // empty catch block
            }
            if (-1 >= ((0xC5 ^ 0xC1 ^ (0x21 ^ 0x77)) & (0xEA ^ 0x8E ^ (0xA7 ^ 0x91) ^ -1))) {
                return;
            }
            Time.sleepTicks((int)llllIlIIII[2]);

            if (-2 < 0) continue;
            return;
        }
    }

    private static boolean llIIlllIlIlll(int n2) {
        return n2 > 0;
    }

    private static void llIIlllIlIIll() {
        llllIIllll = new String[llllIlIIII[16]];
        g.llllIIllll[g.llllIlIIII[3]] = "Talk-to";
        g.llllIIllll[g.llllIlIIII[2]] = "Talk-to";
        g.llllIIllll[g.llllIlIIII[6]] = "Choosing dialog";
        g.llllIIllll[g.llllIlIIII[7]] = "Talk-to";
        g.llllIIllll[g.llllIlIIII[8]] = "Talk-to";
        g.llllIIllll[g.llllIlIIII[4]] = "Choosing dialog";
        g.llllIIllll[g.llllIlIIII[9]] = "Talk-to";
        g.llllIIllll[g.llllIlIIII[10]] = "Choosing dialog";
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray) {
        if (g.llIIlllIlIlIl(e.j(llllIlIIII[0]), llllIlIIII[1]) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) && g.llIIlllIlIllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llllIlIIII[2]];
            stringArray2[g.llllIlIIII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.llIIlllIlIlll(list.size())) {
                ((NPC)list.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[3]]);
                Time.sleepTicks((int)llllIlIIII[4]);

            }
        }
        if (g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String var5;
            String[] stringArray3 = new String[llllIlIIII[2]];
            stringArray3[g.llllIlIIII[3]] = var5;
            List var6 = NPCs.getAll((String[])stringArray3);
            if (g.llIIlllIlIlll(var6.size())) {
                ((NPC)var6.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llllIlIIII[5]);

            }
        }
        if (!g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[6]];
            if (g.llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                void var7;
                Dialog.chooseOption((String[])var7);

            }
            if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void a(String string, String[] stringArray, boolean bl) {
        if (g.llIIlllIlIlIl(e.j(llllIlIIII[0]), llllIlIIII[1]) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) && g.llIIlllIlIllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray2 = new String[llllIlIIII[2]];
            stringArray2[g.llllIlIIII[3]] = string;
            List list = NPCs.getAll((String[])stringArray2);
            if (g.llIIlllIlIlll(list.size())) {
                ((NPC)list.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[7]]);
                Time.sleepTicks((int)llllIlIIII[4]);

            }
        }
        if (g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String var8;
            String[] stringArray3 = new String[llllIlIIII[2]];
            stringArray3[g.llllIlIIII[3]] = var8;
            List var9 = NPCs.getAll((String[])stringArray3);
            if (g.llIIlllIlIlll(var9.size())) {
                if (g.llIIlllIlIllI(Reachable.isInteractable((Locatable)((Locatable)var9.get(llllIlIIII[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var9.get(llllIlIIII[3])).getWorldLocation());

                    Time.sleepTicks((int)llllIlIIII[2]);

                }
                if (g.llIIlllIllIII(Reachable.isInteractable((Locatable)((Locatable)var9.get(llllIlIIII[3]))) ? 1 : 0)) {
                    ((NPC)var9.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llllIlIIII[5]);

                }
            }
        }
        if (!g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[4]];
            if (g.llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                void var10;
                Dialog.chooseOption((String[])var10);

            }
            if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    static {
        g.llIIlllIlIlII();
        g.llIIlllIlIIll();
        bk = llllIlIIII[11];
        bh = llllIlIIII[12];
        bi = llllIlIIII[13];
        bl = llllIlIIII[14];
        bj = llllIlIIII[15];
        int[] nArray = new int[llllIlIIII[4]];
        nArray[g.llllIlIIII[3]] = llllIlIIII[12];
        nArray[g.llllIlIIII[2]] = llllIlIIII[13];
        nArray[g.llllIlIIII[6]] = llllIlIIII[15];
        nArray[g.llllIlIIII[7]] = llllIlIIII[11];
        nArray[g.llllIlIIII[8]] = llllIlIIII[14];
        bm = nArray;
    }

        return String.valueOf(var11);
    }
}

