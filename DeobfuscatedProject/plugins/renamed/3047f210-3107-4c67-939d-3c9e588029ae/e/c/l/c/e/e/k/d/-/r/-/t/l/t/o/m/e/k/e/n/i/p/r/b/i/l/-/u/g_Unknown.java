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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
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

public class g_Unknown {
    private static final /* synthetic */ int bi;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bh;
    private static /* synthetic */ String[] llllIIllll;
    private static final /* synthetic */ int bj;
    private static final /* synthetic */ int bk;
    private static /* synthetic */ int[] llllIlIIII;
    private static final /* synthetic */ int[] bm;

    private static boolean llIIlllIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIllIII(int n2) {
        return n2 != 0;
    }

    public static boolean K() {
        int var1 = llllIlIIII[3];
        while (g.llIIlllIlIlIl(var1, bm.length)) {
            List var8 = Widgets.get((int)bm[var1]);
            if (g.llIIlllIlIllI(var8.isEmpty() ? 1 : 0) && g.llIIlllIllIII(((Widget)var8.get(llllIlIIII[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bm[var1]);
                return llllIlIIII[2];
            }
            ++var1;
            0;
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
            0;
        }
        if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static void llIIlllIlIlII() {
        llllIlIIII = new int[17];
        g.llllIlIIII[0] = -(0xFFFFD6C5 & 0x3FBF) & (0xFFFFD7FF & 0x3F9D);
        g.llllIlIIII[1] = -(0xFFFFF55F & 0x3EA5) & (0xFFFFFFEF & 0x37FC);
        g.llllIlIIII[2] = 1;
        g.llllIlIIII[3] = (0xCF ^ 0xB4 ^ (0x18 ^ 0x32)) & (0x87 ^ 0x82 ^ (0x69 ^ 0x3D) ^ -1);
        g.llllIlIIII[4] = 0x56 ^ 0x3D ^ (0x7C ^ 0x12);
        g.llllIlIIII[5] = 0xFFFFCBB8 & 0x3FFF;
        g.llllIlIIII[6] = 2;
        g.llllIlIIII[7] = 3;
        g.llllIlIIII[8] = 0xBE ^ 0xBA;
        g.llllIlIIII[9] = 0x99 ^ 0x9F;
        g.llllIlIIII[10] = 48 + 84 - 17 + 36 ^ 6 + 1 - -100 + 37;
        g.llllIlIIII[11] = 207 + 70 - 186 + 128;
        g.llllIlIIII[12] = 26 + 13 - -72 + 82;
        g.llllIlIIII[13] = 127 + 134 - 128 + 98;
        g.llllIlIIII[14] = 42 + 225 - 181 + 143;
        g.llllIlIIII[15] = (0x6F ^ 0x34) + (0x76 ^ 0x1C) - (0x3F ^ 0x73) + (0xF8 ^ 0x98);
        g.llllIlIIII[16] = 2 + 116 - 97 + 145 ^ 16 + 107 - -47 + 4;
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
                0;
            }
        }
        while (!g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            try {
                AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[10]];
                if (g.llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                    void var6;
                    Dialog.chooseOption((String[])var6);
                    0;
                }
                if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks((int)llllIlIIII[2]);
                0;
                0;
            }
            catch (Exception lllllllllllllllllIlIllIIIlIIIIII) {
                // empty catch block
            }
            if (-1 >= ((0xC5 ^ 0xC1 ^ (0x21 ^ 0x77)) & (0xEA ^ 0x8E ^ (0xA7 ^ 0x91) ^ -1))) {
                return;
            }
            Time.sleepTicks((int)llllIlIIII[2]);
            0;
            0;
            if (-2 < 0) continue;
            return;
        }
    }

    private static boolean llIIlllIlIlll(int n2) {
        return n2 > 0;
    }

    private static void llIIlllIlIIll() {
        llllIIllll = new String[llllIlIIII[16]];
        g.llllIIllll[g.llllIlIIII[3]] = g."Talk-to";
        g.llllIIllll[g.llllIlIIII[2]] = g."Talk-to";
        g.llllIIllll[g.llllIlIIII[6]] = g."Choosing dialog";
        g.llllIIllll[g.llllIlIIII[7]] = g."Talk-to";
        g.llllIIllll[g.llllIlIIII[8]] = g."Talk-to";
        g.llllIIllll[g.llllIlIIII[4]] = g."Choosing dialog";
        g.llllIIllll[g.llllIlIIII[9]] = g."Talk-to";
        g.llllIIllll[g.llllIlIIII[10]] = g."Choosing dialog";
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
                0;
            }
        }
        if (g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String var7;
            String[] stringArray3 = new String[llllIlIIII[2]];
            stringArray3[g.llllIlIIII[3]] = var7;
            List var5 = NPCs.getAll((String[])stringArray3);
            if (g.llIIlllIlIlll(var5.size())) {
                ((NPC)var5.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[2]]);
                Time.sleepUntil(() -> Dialog.isOpen(), (int)llllIlIIII[5]);
                0;
            }
        }
        if (!g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[6]];
            if (g.llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                void var20;
                Dialog.chooseOption((String[])var20);
                0;
            }
            if (!g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
            }
        }
    }

    private static String llIIlllIlIIlI(String var19, String var12) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llllIlIIII[16]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llllIlIIII[6], var9);
            return new String(var10.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
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
                0;
            }
        }
        if (g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0)) {
            String var15;
            String[] stringArray3 = new String[llllIlIIII[2]];
            stringArray3[g.llllIlIIII[3]] = var15;
            List var2 = NPCs.getAll((String[])stringArray3);
            if (g.llIIlllIlIlll(var2.size())) {
                if (g.llIIlllIlIllI(Reachable.isInteractable((Locatable)((Locatable)var2.get(llllIlIIII[3]))) ? 1 : 0)) {
                    Movement.walkTo((WorldPoint)((NPC)var2.get(llllIlIIII[3])).getWorldLocation());
                    0;
                    Time.sleepTicks((int)llllIlIIII[2]);
                    0;
                }
                if (g.llIIlllIllIII(Reachable.isInteractable((Locatable)((Locatable)var2.get(llllIlIIII[3]))) ? 1 : 0)) {
                    ((NPC)var2.get(llllIlIIII[3])).interact(llllIIllll[llllIlIIII[8]]);
                    Time.sleepUntil(() -> Dialog.isOpen(), (int)llllIlIIII[5]);
                    0;
                }
            }
        }
        if (!g.llIIlllIlIllI(Dialog.isOpen() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0) || !g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) || g.llIIlllIllIII(Dialog.isViewingOptions() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIllll[llllIlIIII[4]];
            if (g.llIIlllIllIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (g.llIIlllIlIllI(Dialog.canContinueNPC() ? 1 : 0) && g.llIIlllIlIllI(Dialog.canContinue() ? 1 : 0)) {
                void var3;
                Dialog.chooseOption((String[])var3);
                0;
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

    private static String llIIlllIlIIIl(String var13, String var22) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var4 = var22.toCharArray();
        int var16 = llllIlIIII[3];
        char[] var21 = var13.toCharArray();
        int var14 = var21.length;
        int var23 = llllIlIIII[3];
        while (g.llIIlllIlIlIl(var23, var14)) {
            char var17 = var21[var23];
            var18.append((char)(var17 ^ var4[var16 % var4.length]));
            0;
            ++var16;
            ++var23;
            0;
            if (((0x1A ^ 0x79) & ~(0x7B ^ 0x18)) >= 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }
}

