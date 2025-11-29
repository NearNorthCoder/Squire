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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
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

public class g {
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int bn;
    private static /* synthetic */ String[] lIIIlllllIIlI;
    private static final /* synthetic */ int[] bs;
    private static final /* synthetic */ int bo;
    private static final /* synthetic */ int br;
    private static /* synthetic */ int[] lIIIlllllIlII;
    private static final /* synthetic */ int bp;

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
                0;
            }
        }
        while (!g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[10]];
                if (g.lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                    void var8;
                    Dialog.chooseOption((String[])var8);
                    0;
                }
                if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)lIIIlllllIlII[2]);
                0;
                0;
            }
            catch (Exception lllllllllllllllIIIIIIIlIIIlllIlI) {
                // empty catch block
            }
            if ((0x23 ^ 0x52 ^ (0x30 ^ 0x45)) < (0x6E ^ 0x43 ^ (0x72 ^ 0x5B))) {
                return;
            }
            Time.sleepTicks((int)lIIIlllllIlII[2]);
            0;
            0;
            if (1 >= ((0x7F ^ 0x6C ^ (0x8D ^ 0xC5)) & (117 + 136 - 250 + 206 ^ 130 + 125 - 200 + 83 ^ -1))) continue;
            return;
        }
    }

    private static String lIlIIllIIlIIIII(String var21, String var11) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIIIlllllIlII[16]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIIlllllIlII[6], var12);
            return new String(var10.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
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
                0;
            }
        }
        if (g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String var17;
            String[] stringArray3 = new String[lIIIlllllIlII[2]];
            stringArray3[g.lIIIlllllIlII[3]] = var17;
            List var9 = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIllIIlIlIIl(var9.size())) {
                ((NPC)var9.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIIlllllIlII[5]);
                0;
            }
        }
        if (!g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[6]];
            if (g.lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                void var2;
                Dialog.chooseOption((String[])var2);
                0;
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
                0;
            }
        }
        if (g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0)) {
            String var15;
            String[] stringArray3 = new String[lIIIlllllIlII[2]];
            stringArray3[g.lIIIlllllIlII[3]] = var15;
            List var14 = NPCs.getAll((String[])stringArray3);
            if (g.lIlIIllIIlIlIIl(var14.size())) {
                if (g.lIlIIllIIlIlIII(Reachable.isInteractable((Locatable)((Locatable)var14.get(lIIIlllllIlII[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var14.get(lIIIlllllIlII[3])).getWorldLocation());
                    0;
                    Time.sleepTicks((int)lIIIlllllIlII[2]);
                    0;
                }
                if (g.lIlIIllIIlIlIlI(Reachable.isInteractable((Locatable)((Locatable)var14.get(lIIIlllllIlII[3]))) ? 1 : 0)) {
                    ((NPC)var14.get(lIIIlllllIlII[3])).interact(lIIIlllllIIlI[lIIIlllllIlII[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIIlllllIlII[5]);
                    0;
                }
            }
        }
        if (!g.lIlIIllIIlIlIII(Dialog.isOpen() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0) || !g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllllIIlI[lIIIlllllIlII[4]];
            if (g.lIlIIllIIlIlIlI(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
                void var16;
                Dialog.chooseOption((String[])var16);
                0;
            }
            if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static String lIlIIllIIlIIIIl(String var24, String var7) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var27 = var7.toCharArray();
        int var6 = lIIIlllllIlII[3];
        char[] var23 = var24.toCharArray();
        int var20 = var23.length;
        int var4 = lIIIlllllIlII[3];
        while (g.lIlIIllIIlIIlll(var4, var20)) {
            char var13 = var23[var4];
            var25.append((char)(var13 ^ var27[var6 % var27.length]));
            0;
            ++var6;
            ++var4;
            0;
            if (-1 != 1) continue;
            return null;
        }
        return String.valueOf(var25);
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
        g.lIIIlllllIIlI[g.lIIIlllllIlII[3]] = g."Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[2]] = g."Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[6]] = g."Choosing dialog";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[7]] = g."Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[8]] = g."Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[4]] = g."Choosing dialog";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[9]] = g."Talk-to";
        g.lIIIlllllIIlI[g.lIIIlllllIlII[10]] = g."Choosing dialog";
    }

    public static boolean L() {
        int var26 = lIIIlllllIlII[3];
        while (g.lIlIIllIIlIIlll(var26, bs.length)) {
            List var19 = Widgets.get((int)bs[var26]);
            if (g.lIlIIllIIlIlIII(var19.isEmpty() ? 1 : 0) && g.lIlIIllIIlIlIlI(((Widget)var19.get(lIIIlllllIlII[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bs[var26]);
                return lIIIlllllIlII[2];
            }
            ++var26;
            0;
            if (-1 < 0) continue;
            return false;
        }
        return lIIIlllllIlII[3];
    }

    private static void lIlIIllIIlIIllI() {
        lIIIlllllIlII = new int[17];
        g.lIIIlllllIlII[0] = -(137 + 148 - 265 + 177) & (0xFFFF95DF & 0x6BFD);
        g.lIIIlllllIlII[1] = -(0xFFFFED3B & 0x3ED5) & (0xFFFFFFFC & 0x2FFB);
        g.lIIIlllllIlII[2] = 1;
        g.lIIIlllllIlII[3] = 2 & ~2;
        g.lIIIlllllIlII[4] = 3 ^ (0x17 ^ 0x11);
        g.lIIIlllllIlII[5] = -(0xFFFFB9B5 & 0x764F) & (0xFFFFBFBF & 0x7BFC);
        g.lIIIlllllIlII[6] = 2;
        g.lIIIlllllIlII[7] = 3;
        g.lIIIlllllIlII[8] = 0x28 ^ 0x2C;
        g.lIIIlllllIlII[9] = 0x3F ^ 0x39;
        g.lIIIlllllIlII[10] = 0x4E ^ 0x5C ^ (0x57 ^ 0x42);
        g.lIIIlllllIlII[11] = (0xDA ^ 0xB8) + (0x6E ^ 0x5B) - (0x89 ^ 0xAA) + (0xF3 ^ 0x96);
        g.lIIIlllllIlII[12] = (0x58 ^ 0x6A) + (115 + 81 - 81 + 76) - (0x39 ^ 0x5A) + (0xE2 ^ 0xAF);
        g.lIIIlllllIlII[13] = 96 + 145 - 133 + 121;
        g.lIIIlllllIlII[14] = 125 + 136 - 104 + 74;
        g.lIIIlllllIlII[15] = 135 + 16 - 49 + 91;
        g.lIIIlllllIlII[16] = 37 + 150 - 29 + 13 ^ 36 + 143 - 158 + 142;
    }

    private static String lIlIIllIIIlllll(String var1, String var28) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var28.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIIlllllIlII[6], var5);
            return new String(var3.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIlIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static void a(String[] stringArray) {
        if (g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) && g.lIlIIllIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            0;
        }
        if (!g.lIlIIllIIlIlIII(Dialog.canContinueNPC() ? 1 : 0) || g.lIlIIllIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}

