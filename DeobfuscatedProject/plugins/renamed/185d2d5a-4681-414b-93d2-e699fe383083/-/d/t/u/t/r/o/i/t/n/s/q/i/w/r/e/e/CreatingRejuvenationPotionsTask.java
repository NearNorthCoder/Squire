/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Quest
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b_Unknown;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Quest;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Creating Rejuvenation Potions -> CreatingrejuvenationpotionsTask */
@TaskDesc(name="Creating Rejuvenation Potions", priority=0x7FFFFFFF, blocking=true)
public class CreatingRejuvenationPotionsTask
extends Task {
    private final /* synthetic */ b M;
    private static /* synthetic */ String[] lIlIlllllllll;
    private static /* synthetic */ int[] lIllIIIIIIIlI;
    private final /* synthetic */ SquireWintertodtConfig L;

    private static boolean llIIIIllllIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIlllIlllll(int n2) {
        return n2 == 0;
    }

    private static void llIIIIlllIlllII() {
        lIllIIIIIIIlI = new int[20];
        h.lIllIIIIIIIlI[0] = 1;
        h.lIllIIIIIIIlI[1] = (0xE9 ^ 0x88 ^ (0x99 ^ 0xB2)) & (0x1A ^ 0x12 ^ (0xE9 ^ 0xAB) ^ -1);
        h.lIllIIIIIIIlI[2] = 0x2F ^ 0x2A;
        h.lIllIIIIIIIlI[3] = 2;
        h.lIllIIIIIIIlI[4] = -(0xFFFFAB6F & 0x7EB1) & (0xFFFFFEFF & 0x7BF7);
        h.lIllIIIIIIIlI[5] = -(0xFFFFA37C & 0x7DA7) & (0xFFFFF1FB & Short.MAX_VALUE);
        h.lIllIIIIIIIlI[6] = 0xFFFFFBEC & 0x769B;
        h.lIllIIIIIIIlI[7] = -1;
        h.lIllIIIIIIIlI[8] = 3;
        h.lIllIIIIIIIlI[9] = 0x48 ^ 0x75 ^ (0x28 ^ 0x11);
        h.lIllIIIIIIIlI[10] = -(0xFFFFCFBF & 0x7A51) & (0xFFFFFFFD & 0x7FF3);
        h.lIllIIIIIIIlI[11] = 0xA0 ^ 0xA6;
        h.lIllIIIIIIIlI[12] = 0xA1 ^ 0xB8 ^ (0xAC ^ 0xB2);
        h.lIllIIIIIIIlI[13] = 0x5B ^ 0x53;
        h.lIllIIIIIIIlI[14] = 0xA4 ^ 0x9D ^ (0xA4 ^ 0x94);
        h.lIllIIIIIIIlI[15] = 0xD7 ^ 0xBF ^ (0x34 ^ 0x56);
        h.lIllIIIIIIIlI[16] = 0xAD ^ 0xA6;
        h.lIllIIIIIIIlI[17] = 0x47 ^ 0x4B;
        h.lIllIIIIIIIlI[18] = 88 + 17 - 33 + 78 ^ 99 + 32 - 50 + 74;
        h.lIllIIIIIIIlI[19] = 0x46 ^ 0x48;
    }

    private static boolean llIIIIlllIllllI(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIlllIIllIl(String var25, String var24) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIllIIIIIIIlI[3], var1);
            return new String(var12.doFinal(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean C() {
        void var3_3;
        void var3;
        void var16;
        int n2 = Inventory.getCount(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[15]]));
        String[] stringArray = new String[lIllIIIIIIIlI[0]];
        stringArray[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[9]];
        int n3 = Inventory.getCount((String[])stringArray);
        if (h.llIIIIllllIIIll(n2) && h.llIIIIlllIlllll(n3)) {
            Inventory.dropAll(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[14]]));
            0;
            return lIllIIIIIIIlI[0];
        }
        if (!h.llIIIIllllIIIII((int)var16) || h.llIIIIlllIlllll((int)var3)) {
            return lIllIIIIIIIlI[1];
        }
        if (h.llIIIIllllIIIII(Quests.isFinished((Quest)Quest.DRUIDIC_RITUAL) ? 1 : 0)) {
            Inventory.use(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[13]]), item -> item.getName().equals(lIlIlllllllll[lIllIIIIIIIlI[12]]));
            0;
            return lIllIIIIIIIlI[0];
        }
        String[] stringArray2 = new String[lIllIIIIIIIlI[0]];
        stringArray2[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[2]];
        NPC var9 = NPCs.getNearest((String[])stringArray2);
        if (h.llIIIIllllIIlII(var9)) {
            int[] nArray = new int[lIllIIIIIIIlI[0]];
            nArray[h.lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[10];
            var9 = NPCs.getNearest((int[])nArray);
        }
        if (h.llIIIIllllIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIllIIIIIIIlI[0];
        }
        Inventory.use(item -> lIlIlllllllll[lIllIIIIIIIlI[11]].equalsIgnoreCase(item.getName()), (Interactable)var3_3);
        0;
        return lIllIIIIIIIlI[0];
    }

    private static String llIIIIlllIlIIIl(String var8, String var20) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIIlI[13]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIllIIIIIIIlI[3], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllllIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIIllllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllllIIIll(int n2) {
        return n2 > 0;
    }

    static {
        h.llIIIIlllIlllII();
        h.llIIIIlllIllIIl();
    }

    @Inject
    public h(SquireWintertodtConfig squireWintertodtConfig, b b2) {
        this.L = squireWintertodtConfig;
        this.M = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var14;
        void var21;
        h var4;
        int n2 = Inventory.getCount(item -> {
            int n2;
            if (h.llIIIIllllIIIII(item.getName().startsWith(lIlIlllllllll[lIllIIIIIIIlI[17]]) ? 1 : 0) && h.llIIIIlllIlllll(item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[18]]) ? 1 : 0)) {
                n2 = lIllIIIIIIIlI[0];
                0;
                if (-(64 + 155 - 160 + 114 ^ 128 + 164 - 266 + 143) >= 0) {
                    return ((3 ^ 0x1B ^ (0x86 ^ 0x99)) & (0xBF ^ 0x89 ^ (0x7A ^ 0x4B) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIIIIIIIlI[1];
            }
            return n2 != 0;
        });
        int n3 = Inventory.getCount(item -> item.getName().contains(lIlIlllllllll[lIllIIIIIIIlI[16]]));
        String[] stringArray = new String[lIllIIIIIIIlI[0]];
        stringArray[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[1]];
        int n4 = Inventory.getCount((String[])stringArray);
        if (!h.llIIIIlllIlllIl(n2) || h.llIIIIlllIllllI(n4, this.L.foodAmount())) {
            return var4.C();
        }
        if (h.llIIIIlllIlllll(var4.M.i() ? 1 : 0)) {
            return lIllIIIIIIIlI[1];
        }
        if (h.llIIIIllllIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIllIIIIIIIlI[0];
        }
        if (h.llIIIIllllIIIIl(Inventory.getFreeSlots(), lIllIIIIIIIlI[2])) {
            int[] nArray = new int[lIllIIIIIIIlI[3]];
            nArray[h.lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[4];
            nArray[h.lIllIIIIIIIlI[0]] = lIllIIIIIIIlI[5];
            Inventory.dropAll((int[])nArray);
            0;
        }
        if (h.llIIIIlllIlllll((int)var21)) {
            int[] nArray = new int[lIllIIIIIIIlI[0]];
            nArray[h.lIllIIIIIIIlI[1]] = lIllIIIIIIIlI[6];
            TileObjects.getNearest((int[])nArray).interact(lIlIlllllllll[lIllIIIIIIIlI[0]]);
            return lIllIIIIIIIlI[0];
        }
        if (h.llIIIIllllIIIIl((int)var14, var4.L.foodAmount())) {
            if (h.llIIIIllllIIIlI(Players.getLocal().getAnimation(), lIllIIIIIIIlI[7])) {
                return lIllIIIIIIIlI[0];
            }
            String[] stringArray2 = new String[lIllIIIIIIIlI[0]];
            stringArray2[h.lIllIIIIIIIlI[1]] = lIlIlllllllll[lIllIIIIIIIlI[3]];
            TileObjects.getNearest((String[])stringArray2).interact(lIlIlllllllll[lIllIIIIIIIlI[8]]);
            return lIllIIIIIIIlI[0];
        }
        return lIllIIIIIIIlI[1];
    }

    private static void llIIIIlllIllIIl() {
        lIlIlllllllll = new String[lIllIIIIIIIlI[19]];
        h.lIlIlllllllll[h.lIllIIIIIIIlI[1]] = h."Bruma herb";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[0]] = h."Take-5 concoctions";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[3]] = h."Sprouting Roots";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[8]] = h."Pick";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[9]] = h."Bruma herb";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[2]] = h."Brew'ma";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[11]] = h."Bruma herb";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[12]] = h."Bruma herb";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[13]] = h."unf";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[14]] = h."unf";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[15]] = h."unf";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[16]] = h."unf";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[17]] = h."Rejuvenation";
        h.lIlIlllllllll[h.lIllIIIIIIIlI[18]] = h."unf";
    }

    private static boolean llIIIIllllIIlII(Object object) {
        return object == null;
    }

    private static boolean llIIIIlllIlllIl(int n2) {
        return n2 <= 0;
    }

    private static String llIIIIlllIIllII(String var18, String var22) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var11 = var22.toCharArray();
        int var19 = lIllIIIIIIIlI[1];
        char[] var23 = var18.toCharArray();
        int var7 = var23.length;
        int var13 = lIllIIIIIIIlI[1];
        while (h.llIIIIllllIIIIl(var13, var7)) {
            char var10 = var23[var13];
            var2.append((char)(var10 ^ var11[var19 % var11.length]));
            0;
            ++var19;
            ++var13;
            0;
            if (((0x6B ^ 0x71) & ~(0x7E ^ 0x64)) >= 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }
}

