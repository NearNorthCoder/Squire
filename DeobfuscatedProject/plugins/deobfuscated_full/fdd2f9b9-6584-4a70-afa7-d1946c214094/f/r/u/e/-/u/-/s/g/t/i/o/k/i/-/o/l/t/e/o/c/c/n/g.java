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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
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

public class g {
    private static final /* synthetic */ int[] bn;
    private static final /* synthetic */ int bk;
    private static final /* synthetic */ int bi;
    private static final /* synthetic */ int bj;
    private static /* synthetic */ int[] lIIlllIlIl;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bm;
    private static /* synthetic */ String[] lIIlllIlII;

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
                0;
            }
        }
        if (g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String var17;
            String[] stringArray3 = new String[lIIlllIlIl[2]];
            stringArray3[g.lIIlllIlIl[3]] = var17;
            List var26 = NPCs.getAll((String[])stringArray3);
            if (g.lIIIIlIIllllI(var26.size())) {
                ((NPC)var26.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIlllIlIl[5]);
                0;
            }
        }
        if (!g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[6]];
            if (g.lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                void var1;
                Dialog.chooseOption((String[])var1);
                0;
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
                0;
            }
        }
        while (!g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[10]];
                if (g.lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                    void var22;
                    Dialog.chooseOption((String[])var22);
                    0;
                }
                if (!g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)lIIlllIlIl[2]);
                0;
                0;
            }
            catch (Exception lllllllllllllllllllllIIIlIlIllIl) {
                // empty catch block
            }
            if (((0x9F ^ 0xC5) & ~(0xD6 ^ 0x8C)) != 0) {
                return;
            }
            Time.sleepTicks((int)lIIlllIlIl[2]);
            0;
            0;
            if ((2 & (2 ^ -1)) != -1) continue;
            return;
        }
    }

    public static void a(String[] stringArray) {
        if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption((String[])stringArray);
            0;
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

    private static String lIIIIlIIllIIl(String var2, String var11) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIIlllIlIl[6], var7);
            return new String(var20.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static String lIIIIlIIlIlll(String var25, String var6) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var5 = var6.toCharArray();
        int var16 = lIIlllIlIl[3];
        char[] var19 = var25.toCharArray();
        int var8 = var19.length;
        int var13 = lIIlllIlIl[3];
        while (g.lIIIIlIIlllII(var13, var8)) {
            char var3 = var19[var13];
            var18.append((char)(var3 ^ var5[var16 % var5.length]));
            0;
            ++var16;
            ++var13;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var18);
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
                0;
            }
        }
        if (g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String var9;
            String[] stringArray3 = new String[lIIlllIlIl[2]];
            stringArray3[g.lIIlllIlIl[3]] = var9;
            List var4 = NPCs.getAll((String[])stringArray3);
            if (g.lIIIIlIIllllI(var4.size())) {
                if (g.lIIIIlIIlllIl(Reachable.isInteractable((Locatable)((Locatable)var4.get(lIIlllIlIl[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var4.get(lIIlllIlIl[3])).getWorldLocation());
                    0;
                    Time.sleepTicks((int)lIIlllIlIl[2]);
                    0;
                }
                if (g.lIIIIlIIlllll(Reachable.isInteractable((Locatable)((Locatable)var4.get(lIIlllIlIl[3]))) ? 1 : 0)) {
                    ((NPC)var4.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)lIIlllIlIl[5]);
                    0;
                }
            }
        }
        if (!g.lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) || !g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || g.lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[4]];
            if (g.lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && g.lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                void var21;
                Dialog.chooseOption((String[])var21);
                0;
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

    private static void lIIIIlIIllIll() {
        lIIlllIlIl = new int[17];
        g.lIIlllIlIl[0] = -(0xFFFFFFBF & 0x56C5) & (0xFFFFD7DF & 0x7FBD);
        g.lIIlllIlIl[1] = 0xFFFFA3ED & 0x5FFA;
        g.lIIlllIlIl[2] = 1;
        g.lIIlllIlIl[3] = (0x32 ^ 0x7F) & ~(0x4A ^ 7);
        g.lIIlllIlIl[4] = 93 + 74 - 96 + 104 ^ 63 + 117 - 56 + 46;
        g.lIIlllIlIl[5] = 0xFFFFEFBA & 0x1BFD;
        g.lIIlllIlIl[6] = 2;
        g.lIIlllIlIl[7] = 3;
        g.lIIlllIlIl[8] = 0xC7 ^ 0xA9 ^ (0xEC ^ 0x86);
        g.lIIlllIlIl[9] = 0x9B ^ 0x9D;
        g.lIIlllIlIl[10] = 0x56 ^ 0x41 ^ (0xAD ^ 0xBD);
        g.lIIlllIlIl[11] = 155 + 22 - 82 + 124;
        g.lIIlllIlIl[12] = (0x7E ^ 0xD) + (0x27 ^ 0x7F) - (38 + 163 - 150 + 115) + (170 + 21 - 173 + 174);
        g.lIIlllIlIl[13] = 153 + 164 - 159 + 73;
        g.lIIlllIlIl[14] = (0xDB ^ 0xB7) + (0xC3 ^ 0x83) - (106 + 124 - 123 + 33) + (140 + 53 - 122 + 90);
        g.lIIlllIlIl[15] = 154 + 20 - -13 + 30;
        g.lIIlllIlIl[16] = 0xA4 ^ 0xAC;
    }

    private static void lIIIIlIIllIlI() {
        lIIlllIlII = new String[lIIlllIlIl[16]];
        g.lIIlllIlII[g.lIIlllIlIl[3]] = g."Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[2]] = g."Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[6]] = g."Choosing dialog";
        g.lIIlllIlII[g.lIIlllIlIl[7]] = g."Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[8]] = g."Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[4]] = g."Choosing dialog";
        g.lIIlllIlII[g.lIIlllIlIl[9]] = g."Talk-to";
        g.lIIlllIlII[g.lIIlllIlIl[10]] = g."Choosing dialog";
    }

    private static boolean lIIIIlIIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIlIIlllll(int n2) {
        return n2 != 0;
    }

    private static String lIIIIlIIllIII(String var10, String var15) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIIlllIlIl[16]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIIlllIlIl[6], var12);
            return new String(var14.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public static boolean K() {
        int var24 = lIIlllIlIl[3];
        while (g.lIIIIlIIlllII(var24, bn.length)) {
            List var28 = Widgets.get((int)bn[var24]);
            if (g.lIIIIlIIlllIl(var28.isEmpty() ? 1 : 0) && g.lIIIIlIIlllll(((Widget)var28.get(lIIlllIlIl[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bn[var24]);
                return lIIlllIlIl[2];
            }
            ++var24;
            0;
            if (2 >= 0) continue;
            return ((39 + 6 - -13 + 97 ^ 42 + 130 - 164 + 149) & (0x22 ^ 0x58 ^ (0x1F ^ 0x63) ^ -1)) != 0;
        }
        return lIIlllIlIl[3];
    }
}

