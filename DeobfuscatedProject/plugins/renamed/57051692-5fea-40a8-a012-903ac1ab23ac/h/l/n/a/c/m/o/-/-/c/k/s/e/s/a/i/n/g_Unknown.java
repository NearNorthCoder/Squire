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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e_Unknown;
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

public class g_Unknown {
    private static final /* synthetic */ int bk;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bh;
    private static /* synthetic */ String[] lIlIllllIl;
    private static final /* synthetic */ int[] bm;
    private static final /* synthetic */ int bj;
    private static /* synthetic */ int[] lIlIlllllI;
    private static final /* synthetic */ int bi;

    public static boolean K() {
        int var17 = lIlIlllllI[3];
        while (g.lIIlIlIIllIII(var17, bm.length)) {
            List var26 = Widgets.get((int)bm[var17]);
            if (g.lIIlIlIIllIIl(var26.isEmpty() ? 1 : 0) && g.lIIlIlIIllIll(((Widget)var26.get(lIlIlllllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bm[var17]);
                return lIlIlllllI[2];
            }
            ++var17;
            0;
            if (((0xA6 ^ 0xAD) & ~(0x9F ^ 0x94)) == 0) continue;
            return false;
        }
        return lIlIlllllI[3];
    }

    private static void lIIlIlIIlIlll() {
        lIlIlllllI = new int[17];
        g.lIlIlllllI[0] = 0xFFFFE1BF & 0x1F59;
        g.lIlIlllllI[1] = 0xFFFFF3EB & 0xFFC;
        g.lIlIlllllI[2] = 1;
        g.lIlIlllllI[3] = (0xEE ^ 0xB5) & ~(0xF1 ^ 0xAA);
        g.lIlIlllllI[4] = 20 + 172 - 7 + 7 ^ 28 + 114 - -48 + 7;
        g.lIlIlllllI[5] = 0xFFFFEBFE & 0x1FB9;
        g.lIlIlllllI[6] = 2;
        g.lIlIlllllI[7] = 3;
        g.lIlIlllllI[8] = 0x13 ^ 0x72 ^ (0x42 ^ 0x27);
        g.lIlIlllllI[9] = 160 + 57 - 172 + 136 ^ 143 + 147 - 224 + 113;
        g.lIlIlllllI[10] = 0x67 ^ 0x60;
        g.lIlIlllllI[11] = 211 + 197 - 201 + 22;
        g.lIlIlllllI[12] = 51 + 224 - 106 + 62;
        g.lIlIlllllI[13] = 149 + 162 - 95 + 1;
        g.lIlIlllllI[14] = 123 + 59 - 141 + 90 + (85 + 131 - 118 + 41) - (94 + 61 - 65 + 68) + (0x40 ^ 0x2B);
        g.lIlIlllllI[15] = 0 + 23 - -20 + 94 + (0x9B ^ 0xC5) - (93 + 126 - 115 + 62) + (15 + 28 - -54 + 31);
        g.lIlIlllllI[16] = 143 + 144 - 157 + 40 ^ 46 + 62 - 4 + 58;
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
                0;
            }
        }
        if (g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String var24;
            String[] stringArray3 = new String[lIlIlllllI[2]];
            stringArray3[g.lIlIlllllI[3]] = var24;
            List var4 = NPCs.getAll((String[])stringArray3);
            if (g.lIIlIlIIllIlI(var4.size())) {
                ((NPC)var4.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIlIlllllI[5]);
                0;
            }
        }
        if (!g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllIl[lIlIlllllI[6]];
            if (g.lIIlIlIIllIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
                void var14;
                Dialog.chooseOption((String[])var14);
                0;
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
                0;
            }
        }
        while (!g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderShamans.c = lIlIllllIl[lIlIlllllI[10]];
                if (g.lIIlIlIIllIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
                    void var21;
                    Dialog.chooseOption((String[])var21);
                    0;
                }
                if (!g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)lIlIlllllI[2]);
                0;
                0;
            }
            catch (Exception lllllllllllllllllllIIlllIllllIIl) {
                // empty catch block
            }
            
            }
            Time.sleepTicks((int)lIlIlllllI[2]);
            0;
            0;
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

    private static String lIIlIlIIlIlII(String var13, String var18) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIlIlllllI[16]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlIlllllI[6], var11);
            return new String(var7.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIlIIll(String var8, String var2) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var5 = var2.toCharArray();
        int var6 = lIlIlllllI[3];
        char[] var25 = var8.toCharArray();
        int var28 = var25.length;
        int var22 = lIlIlllllI[3];
        while (g.lIIlIlIIllIII(var22, var28)) {
            char var15 = var25[var22];
            var19.append((char)(var15 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var22;
            0;
            if (-(0x9E ^ 0x9B) < 0) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    private static String lIIlIlIIlIlIl(String var1, String var23) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIlIlllllI[6], var12);
            return new String(var20.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
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
                0;
            }
        }
        if (g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String var16;
            String[] stringArray3 = new String[lIlIlllllI[2]];
            stringArray3[g.lIlIlllllI[3]] = var16;
            List var9 = NPCs.getAll((String[])stringArray3);
            if (g.lIIlIlIIllIlI(var9.size())) {
                if (g.lIIlIlIIllIIl(Reachable.isInteractable((Locatable)((Locatable)var9.get(lIlIlllllI[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var9.get(lIlIlllllI[3])).getWorldLocation());
                    0;
                    Time.sleepTicks((int)lIlIlllllI[2]);
                    0;
                }
                if (g.lIIlIlIIllIll(Reachable.isInteractable((Locatable)((Locatable)var9.get(lIlIlllllI[3]))) ? 1 : 0)) {
                    ((NPC)var9.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lIlIlllllI[5]);
                    0;
                }
            }
        }
        if (!g.lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) || !g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderShamans.c = lIlIllllIl[lIlIlllllI[4]];
            if (g.lIIlIlIIllIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
                void var10;
                Dialog.chooseOption((String[])var10);
                0;
            }
            if (!g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    public static void a(String[] stringArray) {
        if (g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            0;
        }
        if (!g.lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static void lIIlIlIIlIllI() {
        lIlIllllIl = new String[lIlIlllllI[16]];
        g.lIlIllllIl[g.lIlIlllllI[3]] = g."Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[2]] = g."Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[6]] = g."Choosing dialog";
        g.lIlIllllIl[g.lIlIlllllI[7]] = g."Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[8]] = g."Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[4]] = g."Choosing dialog";
        g.lIlIllllIl[g.lIlIlllllI[9]] = g."Talk-to";
        g.lIlIllllIl[g.lIlIlllllI[10]] = g."Choosing dialog";
    }

    private static boolean lIIlIlIIllIlI(int n2) {
        return n2 > 0;
    }
}

