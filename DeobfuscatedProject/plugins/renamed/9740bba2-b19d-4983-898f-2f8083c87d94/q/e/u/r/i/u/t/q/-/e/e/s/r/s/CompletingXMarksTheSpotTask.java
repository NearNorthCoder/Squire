/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.BEnum;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.HEnum;

/* TASK: Completing X Marks The Spot -> CompletingxmarksthespotTask */
@TaskDesc(name="Completing X Marks The Spot")
public class CompletingXMarksTheSpotTask
extends Task {
    private static /* synthetic */ int[] lIIIllIIIIlII;
    private static /* synthetic */ String[] lIIIllIIIIIll;
    private final /* synthetic */ SquireQuesterConfig bB;

    private static boolean lIlIIIIlIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIIllIIIIII(int n2) {
        return n2 > 0;
    }

    private void Y() {
        int[] nArray = new int[lIIIllIIIIlII[2]];
        nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[3];
        if (D.lIlIIIIlIllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIlII[1]];
        dialogOptionArray[D.lIIIllIIIIlII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[2]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[6]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[8]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[D.lIIIllIIIIlII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[11]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIIIIll[lIIIllIIIIlII[0]], new WorldPoint(lIIIllIIIIlII[4], lIIIllIIIIlII[5], lIIIllIIIIlII[0]), dialogOptionArray);
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var20;
        if (D.lIlIIIIlIllllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        String[] stringArray = new String[lIIIllIIIIlII[2]];
        stringArray[D.lIIIllIIIIlII[0]] = var20;
        NPC var24 = NPCs.getNearest((String[])stringArray);
        if (D.lIlIIIIllIIIIIl(var24) && D.lIlIIIIlIllllll(Reachable.isInteractable((Locatable)var24) ? 1 : 0)) {
            var24.interact(lIIIllIIIIIll[lIIIllIIIIlII[26]]);
            0;
            
            }
        } else {
            void var6;
            System.out.println(lIIIllIIIIIll[lIIIllIIIIlII[25]]);
            Walker.walkTo((WorldPoint)var6);
            0;
        }
    }

    private static boolean lIlIIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        D var26;
        if (D.lIlIIIIlIllllIl(this.bB.quest().equals((Object)h.X_MARKS_THE_SPOT) ? 1 : 0)) {
            return lIIIllIIIIlII[0];
        }
        int var21 = var26.Q();
        if (D.lIlIIIIlIlllllI(var21, lIIIllIIIIlII[1])) {
            return lIIIllIIIIlII[0];
        }
        System.out.println("[X_MARKS_THE_SPOT] - Current Progress: " + var21);
        switch (var21) {
            case 0: {
                var26.bx();
                var26.cp();
                0;
                if (1 < 3) break;
                return ((15 + 69 - -9 + 122 ^ 37 + 124 - 151 + 128) & (144 + 79 - 160 + 95 ^ 112 + 91 - 83 + 75 ^ -1) & ((0x53 ^ 0x43 ^ (0x6A ^ 0x7F)) & (0x63 ^ 6 ^ (0x59 ^ 0x39) ^ -1) ^ -1)) != 0;
            }
            case 1: {
                var26.cp();
                0;
                if (-(1 ^ 5) < 0) break;
                return false;
            }
            case 2: {
                var26.bw();
                0;
                if (((0xDA ^ 0xC7) & ~(0x6B ^ 0x76)) == 0) break;
                return false;
            }
            case 3: {
                var26.bv();
                0;
                if (((0x5C ^ 0x7F) & ~(0x41 ^ 0x62)) == 0) break;
                return false;
            }
            case 4: {
                var26.bu();
                0;
                if ((0xC7 ^ 0xC2) != 0) break;
                return false;
            }
            case 5: {
                var26.bt();
                0;
                if (1 != ((0x5A ^ 0x6F ^ (0x37 ^ 0x45)) & (0xBE ^ 0xB1 ^ (0x51 ^ 0x19) ^ -1))) break;
                return ((0x42 ^ 0x1B ^ (0x75 ^ 0x63)) & (15 + 9 - -187 + 2 ^ 91 + 88 - 127 + 102 ^ -1)) != 0;
            }
            case 6: {
                var26.P();
                var26.Y();
                0;
                if (2 >= ((0x7D ^ 0x51 ^ (0x7F ^ 0x75)) & (107 + 32 - 54 + 48 ^ 65 + 147 - 50 + 1 ^ -1))) break;
                return ((0x63 ^ 0xA ^ (0xEE ^ 0xC0)) & (0x24 ^ 0x15 ^ (0xB4 ^ 0xC2) ^ -1)) != 0;
            }
            case 7: {
                var26.P();
                0;
                if (2 > 0) break;
                return false;
            }
            default: {
                return lIIIllIIIIlII[0];
            }
        }
        return lIIIllIIIIlII[2];
    }

    private void bx() {
        int[] nArray = new int[lIIIllIIIIlII[2]];
        nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
        if (D.lIlIIIIlIllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIIIIlII[2]];
        nArray2[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
        TileItem var13 = TileItems.getNearest((int[])nArray2);
        if (D.lIlIIIIllIIIIIl(var13)) {
            var13.interact(lIIIllIIIIIll[lIIIllIIIIlII[9]]);
            0;
            if (((0xCA ^ 0x92) & ~(0xFE ^ 0xA6)) != 0) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[21], lIIIllIIIIlII[22], lIIIllIIIIlII[2]));
            0;
        }
    }

    @Inject
    public D(SquireQuesterConfig squireQuesterConfig) {
        this.bB = squireQuesterConfig;
    }

    private static boolean lIlIIIIlIllllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIlIllllIl(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIIlIlllIIl(String var5, String var2) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var1 = var2.toCharArray();
        int var22 = lIIIllIIIIlII[0];
        char[] var18 = var5.toCharArray();
        int var15 = var18.length;
        int var14 = lIIIllIIIIlII[0];
        while (D.lIlIIIIllIIIIlI(var14, var15)) {
            char var12 = var18[var14];
            var28.append((char)(var12 ^ var1[var22 % var1.length]));
            0;
            ++var22;
            ++var14;
            0;
            
            return null;
        }
        return String.valueOf(var28);
    }

    private static String lIlIIIIlIlllIII(String var10, String var9) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), lIIIllIIIIlII[1]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIIIllIIIIlII[6], var19);
            return new String(var11.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private void bt() {
        if (D.lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[12], lIIIllIIIIlII[13], lIIIllIIIIlII[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[12], lIIIllIIIIlII[13], lIIIllIIIIlII[0]));
            0;
            0;
            if ((0x40 ^ 0x44) < 1) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIIIIlII[2]];
            nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst((int[])nArray).interact(lIIIllIIIIIll[lIIIllIIIIlII[2]]);
        }
    }

    private void bu() {
        if (D.lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[15], lIIIllIIIIlII[16], lIIIllIIIIlII[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[15], lIIIllIIIIlII[16], lIIIllIIIIlII[0]));
            0;
            0;
            if (-3 > 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIIIIlII[2]];
            nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst((int[])nArray).interact(lIIIllIIIIIll[lIIIllIIIIlII[6]]);
        }
    }

    private static boolean lIlIIIIllIIIIIl(Object object) {
        return object != null;
    }

    private static void lIlIIIIlIlllIll() {
        lIIIllIIIIIll = new String[lIIIllIIIIlII[27]];
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[0]] = D."Veos";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[2]] = D."Dig";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[6]] = D."Dig";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[7]] = D."Dig";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[8]] = D."Dig";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[9]] = D."Take";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[10]] = D."Veos";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[11]] = D."Talk-to";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[1]] = D."Walking to NPC";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[26]] = D."Talk-to";
        D.lIIIllIIIIIll[D.lIIIllIIIIlII[25]] = D."Walking to NPC";
    }

    private void bv() {
        if (D.lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[17], lIIIllIIIIlII[18], lIIIllIIIIlII[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[17], lIIIllIIIIlII[18], lIIIllIIIIlII[0]));
            0;
            0;
            if ((0x6E ^ 0x6A) < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIIIIlII[2]];
            nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst((int[])nArray).interact(lIIIllIIIIIll[lIIIllIIIIlII[7]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var3;
        if (D.lIlIIIIlIllllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return;
        }
        int[] nArray = new int[lIIIllIIIIlII[2]];
        nArray[D.lIIIllIIIIlII[0]] = var3;
        NPC var23 = NPCs.getNearest((int[])nArray);
        if (D.lIlIIIIllIIIIIl(var23) && D.lIlIIIIlIllllll(Reachable.isInteractable((Locatable)var23) ? 1 : 0)) {
            var23.interact(lIIIllIIIIIll[lIIIllIIIIlII[11]]);
            0;
            if (-1 >= ((0x14 ^ 0x65 ^ (0xED ^ 0xB6)) & (38 + 82 - -43 + 11 ^ 81 + 99 - 53 + 5 ^ -1))) {
                return;
            }
        } else {
            void var8;
            System.out.println(lIIIllIIIIIll[lIIIllIIIIlII[1]]);
            Walker.walkTo((WorldPoint)var8);
            0;
        }
    }

    private void cp() {
        int[] nArray = new int[lIIIllIIIIlII[2]];
        nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
        if (D.lIlIIIIlIllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIIIlII[25]];
        dialogOptionArray[D.lIIIllIIIIlII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[D.lIIIllIIIIlII[6]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[10]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[D.lIIIllIIIIlII[26]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIllIIIIIll[lIIIllIIIIlII[10]], new WorldPoint(lIIIllIIIIlII[23], lIIIllIIIIlII[24], lIIIllIIIIlII[0]), dialogOptionArray);
    }

    private static String lIlIIIIlIlllIlI(String var16, String var4) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIIllIIIIlII[6], var25);
            return new String(var7.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private void bw() {
        if (D.lIlIIIIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIllIIIIlII[19], lIIIllIIIIlII[20], lIIIllIIIIlII[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIIIlII[19], lIIIllIIIIlII[20], lIIIllIIIIlII[0]));
            0;
            0;
            if (2 < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIllIIIIlII[2]];
            nArray[D.lIIIllIIIIlII[0]] = lIIIllIIIIlII[14];
            Inventory.getFirst((int[])nArray).interact(lIIIllIIIIIll[lIIIllIIIIlII[8]]);
        }
    }

    private static void lIlIIIIlIllllII() {
        lIIIllIIIIlII = new int[28];
        D.lIIIllIIIIlII[0] = (57 + 140 - 113 + 162 ^ 46 + 122 - 78 + 92) & (0x82 ^ 0xBE ^ (0x41 ^ 0x3D) ^ -1);
        D.lIIIllIIIIlII[1] = 0xBB ^ 0xB3;
        D.lIIIllIIIIlII[2] = 1;
        D.lIIIllIIIIlII[3] = -(0xFFFFBFEF & 0x45F1) & (0xFFFFFFFF & 0x5FFF);
        D.lIIIllIIIIlII[4] = -(0xFFFFEE3B & 0x51D5) & (0xFFFFCFFF & 0x7BFE);
        D.lIIIllIIIIlII[5] = -(0xFFFFFFED & 0x5153) & (0xFFFFDFFF & 0x7DEE);
        D.lIIIllIIIIlII[6] = 2;
        D.lIIIllIIIIlII[7] = 3;
        D.lIIIllIIIIlII[8] = 0xCF ^ 0xAE ^ (0xEE ^ 0x8B);
        D.lIIIllIIIIlII[9] = 0x8A ^ 0x8F;
        D.lIIIllIIIIlII[10] = 0x50 ^ 0x56;
        D.lIIIllIIIIlII[11] = 0x11 ^ 0x16;
        D.lIIIllIIIIlII[12] = -(0xFFFFDFFB & 0x63FD) & (0xFFFFDFFF & 0x6FFE);
        D.lIIIllIIIIlII[13] = 0xFFFF9DFF & 0x6EBB;
        D.lIIIllIIIIlII[14] = 0xFFFF9FFC & 0x63BB;
        D.lIIIllIIIIlII[15] = 0xFFFFBDAF & 0x4E75;
        D.lIIIllIIIIlII[16] = 0xFFFFDDF4 & 0x2ECB;
        D.lIIIllIIIIlII[17] = 0xFFFFBF87 & 0x4CFB;
        D.lIIIllIIIIlII[18] = -(0xFFFFD7B5 & 0x387B) & (0xFFFFFFFD & 0x1CBE);
        D.lIIIllIIIIlII[19] = -(0xFFFFFF72 & 0x53EF) & (0xFFFFDFFF & Short.MAX_VALUE);
        D.lIIIllIIIIlII[20] = -(0xFFFFFA6F & 0x7797) & (0xFFFFFFCF & 0x7EBF);
        D.lIIIllIIIIlII[21] = 0xFFFFDCB5 & 0x2FDA;
        D.lIIIllIIIIlII[22] = -(0xFFFFA6ED & 0x79BF) & (0xFFFFADFF & Short.MAX_VALUE);
        D.lIIIllIIIIlII[23] = 0xFFFF8F9F & 0x7CFD;
        D.lIIIllIIIIlII[24] = -(0xFFFFEBF9 & 0x7557) & (0xFFFFEFFF & 0x7DF9);
        D.lIIIllIIIIlII[25] = 12 + 11 - -139 + 25 ^ 129 + 128 - 175 + 95;
        D.lIIIllIIIIlII[26] = 91 + 37 - 61 + 60 ^ (0xD8 ^ 0xAE);
        D.lIIIllIIIIlII[27] = 0x21 ^ 0x2A;
    }

    private int Q() {
        return Static.getClient().getVarbitValue(b.QUEST_X_MARKS_THE_SPOT.c());
    }

    static {
        D.lIlIIIIlIllllII();
        D.lIlIIIIlIlllIll();
    }

    private void P() {
        if (D.lIlIIIIlIllllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }
}

