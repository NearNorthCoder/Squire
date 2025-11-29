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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

public class g {
    private static final /* synthetic */ int bo;
    private static final /* synthetic */ int bp;
    private static final /* synthetic */ int[] bs;
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int br;
    private static /* synthetic */ String[] llIlllIlIl;
    private static final /* synthetic */ int bn;
    private static /* synthetic */ int[] llIlllIllI;

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
            0;
        }
        if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static String lIlllIlIIIIlI(String var7, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llIlllIllI[6], var1);
            return new String(var18.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
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
                0;
            }
        }
        if (g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String var20;
            String[] stringArray3 = new String[llIlllIllI[2]];
            stringArray3[g.llIlllIllI[3]] = var20;
            List var2 = NPCs.getAll((String[])stringArray3);
            if (g.lIlllIlIIlIII(var2.size())) {
                ((NPC)var2.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlllIllI[5]);
                0;
            }
        }
        if (!g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlIl[llIlllIllI[6]];
            if (g.lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                void var11;
                Dialog.chooseOption((String[])var11);
                0;
            }
            if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static void lIlllIlIIIlII() {
        llIlllIlIl = new String[llIlllIllI[16]];
        g.llIlllIlIl[g.llIlllIllI[3]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[2]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[6]] = g."Choosing dialog";
        g.llIlllIlIl[g.llIlllIllI[7]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[8]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[4]] = g."Choosing dialog";
        g.llIlllIlIl[g.llIlllIllI[9]] = g."Talk-to";
        g.llIlllIlIl[g.llIlllIllI[10]] = g."Choosing dialog";
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

    private static void lIlllIlIIIlIl() {
        llIlllIllI = new int[17];
        g.llIlllIllI[0] = 0xFFFFE9B9 & 0x175F;
        g.llIlllIllI[1] = 0xFFFFDBF9 & 0x27EE;
        g.llIlllIllI[2] = 1;
        g.llIlllIllI[3] = (125 + 140 - 249 + 150 ^ 7 + 49 - -67 + 60) & (181 + 103 - 75 + 2 ^ 164 + 9 - 44 + 65 ^ -1);
        g.llIlllIllI[4] = 0xB0 ^ 0xB5;
        g.llIlllIllI[5] = -(0xFFFFFFE7 & 0x2459) & (0xFFFFFFFC & 0x2FFB);
        g.llIlllIllI[6] = 2;
        g.llIlllIllI[7] = 3;
        g.llIlllIllI[8] = 0x77 ^ 0x73;
        g.llIlllIllI[9] = 0x99 ^ 0x9F;
        g.llIlllIllI[10] = 0x66 ^ 0x61;
        g.llIlllIllI[11] = (0xD3 ^ 0x9B) + (0x50 ^ 0x7A) - -3 + (0x7F ^ 0x33);
        g.llIlllIllI[12] = 92 + 165 - 233 + 179 + (0xE6 ^ 0x83) - (7 + 77 - 8 + 71) + (0x60 ^ 0x5E);
        g.llIlllIllI[13] = 77 + 196 - 272 + 207 + (0x78 ^ 0x34) - (0x1B ^ 0x6D) + (0xE4 ^ 0xA5);
        g.llIlllIllI[14] = 57 + 152 - 181 + 201;
        g.llIlllIllI[15] = 15 + 174 - 174 + 202;
        g.llIlllIllI[16] = 0x98 ^ 0x90;
    }

    private static String lIlllIlIIIIIl(String var17, String var24) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), llIlllIllI[16]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(llIlllIllI[6], var4);
            return new String(var22.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
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
                0;
            }
        }
        while (!g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderSotf.c = llIlllIlIl[llIlllIllI[10]];
                if (g.lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                    void var3;
                    Dialog.chooseOption((String[])var3);
                    0;
                }
                if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llIlllIllI[2]);
                0;
                0;
            }
            catch (Exception llllllllllllllllllIIIIIlIIlIIlll) {
                // empty catch block
            }
            if (((0x57 ^ 0xE) & ~(0x49 ^ 0x10)) != 0) {
                return;
            }
            Time.sleepTicks((int)llIlllIllI[2]);
            0;
            0;
            
            return;
        }
    }

    private static String lIlllIlIIIIll(String var5, String var12) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var27 = llIlllIllI[3];
        char[] var9 = var5.toCharArray();
        int var28 = var9.length;
        int var10 = llIlllIllI[3];
        while (g.lIlllIlIIIllI(var10, var28)) {
            char var21 = var9[var10];
            var16.append((char)(var21 ^ var14[var27 % var14.length]));
            0;
            ++var27;
            ++var10;
            0;
            if ((0x6A ^ 0x62 ^ (0x20 ^ 0x2D)) != 0) continue;
            return null;
        }
        return String.valueOf(var16);
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
                0;
            }
        }
        if (g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String var13;
            String[] stringArray3 = new String[llIlllIllI[2]];
            stringArray3[g.llIlllIllI[3]] = var13;
            List var19 = NPCs.getAll((String[])stringArray3);
            if (g.lIlllIlIIlIII(var19.size())) {
                if (g.lIlllIlIIIlll(Reachable.isInteractable((Locatable)((Locatable)var19.get(llIlllIllI[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var19.get(llIlllIllI[3])).getWorldLocation());
                    0;
                    Time.sleepTicks((int)llIlllIllI[2]);
                    0;
                }
                if (g.lIlllIlIIlIIl(Reachable.isInteractable((Locatable)((Locatable)var19.get(llIlllIllI[3]))) ? 1 : 0)) {
                    ((NPC)var19.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llIlllIllI[5]);
                    0;
                }
            }
        }
        if (!g.lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) || !g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlIl[llIlllIllI[4]];
            if (g.lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && g.lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                void var23;
                Dialog.chooseOption((String[])var23);
                0;
            }
            if (!g.lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || g.lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    public static boolean M() {
        int var25 = llIlllIllI[3];
        while (g.lIlllIlIIIllI(var25, bs.length)) {
            List var26 = Widgets.get((int)bs[var25]);
            if (g.lIlllIlIIIlll(var26.isEmpty() ? 1 : 0) && g.lIlllIlIIlIIl(((Widget)var26.get(llIlllIllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bs[var25]);
                return llIlllIllI[2];
            }
            ++var25;
            0;
            
            return ((0x16 ^ 5 ^ (0xB2 ^ 0xB8)) & (0x1B ^ 0x58 ^ (0xE4 ^ 0xBE) ^ -1)) != 0;
        }
        return llIlllIllI[3];
    }
}

