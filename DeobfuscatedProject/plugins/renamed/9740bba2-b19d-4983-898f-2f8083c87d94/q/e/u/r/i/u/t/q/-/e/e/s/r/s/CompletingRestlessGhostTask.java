/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.plugins.fw.TaskManager
 *  net.runelite.api.Client
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.plugins.fw.TaskManager;
import gg.squire.quest.SquireQuester;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.AEnum;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.HEnum;

/* TASK: Completing Restless Ghost -> CompletingrestlessghostTask */
@TaskDesc(name="Completing Restless Ghost")
public class CompletingRestlessGhostTask
extends Task {
    private final /* synthetic */ Client bo;
    private final /* synthetic */ SquireQuester bq;
    private static /* synthetic */ int[] lIIIllIllIIIl;
    private final /* synthetic */ TaskManager br;
    private final /* synthetic */ SquireQuesterConfig bp;
    private static /* synthetic */ String[] lIIIllIllIIII;

    private static String lIlIIIlIllllIIl(String var8, String var18) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIIIllIllIIIl[13]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIIllIllIIIl[3], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllIIIIIlI(Object object) {
        return object == null;
    }

    @Inject
    public x(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.bo = client;
        this.bp = squireQuesterConfig;
        this.bq = squireQuester;
        this.br = taskManager;
    }

    private void ch() {
        if (x.lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && x.lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIllIIIl[2]];
            stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[21]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (x.lIlIIIllIIIIIII(nPC) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIllIIII[lIIIllIllIIIl[19]]);
                this.sleepWhile(lIIIllIllIIIl[15], () -> {
                    boolean bl;
                    if (x.lIlIIIlIllllllI(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIllIIIl[2];
                        0;
                        if (-1 > 0) {
                            return false;
                        }
                    } else {
                        bl = lIIIllIllIIIl[0];
                    }
                    return bl;
                });
                0;
                if (-1 < -1) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[23], lIIIllIllIIIl[24], lIIIllIllIIIl[0]));
                0;
            }
            return;
        }
        System.out.println(lIIIllIllIIII[lIIIllIllIIIl[25]]);
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIllIIIl[19]];
        dialogOptionArray[x.lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.lIIIllIllIIIl[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[16]] = DialogOption.PLAIN_CONTINUE_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[21]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    private static void lIlIIIlIlllllII() {
        lIIIllIllIIII = new String[lIIIllIllIIIl[31]];
        x.lIIIllIllIIII[x.lIIIllIllIIIl[0]] = x."Coffin";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[2]] = x."Open";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[3]] = x."Open";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[4]] = x."Search";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[5]] = x."Ghost's skull";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[1]] = x."Altar";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[11]] = x."Search";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[12]] = x."Coffin";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[13]] = x."Restless ghost";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[14]] = x."Open";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[15]] = x."Open";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[16]] = x."Search";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[17]] = x."Search";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[18]] = x."Talk-to";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[20]] = x."Wear";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[21]] = x."Father Urhney";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[19]] = x."Talk-to";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[25]] = x."Invoking";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[26]] = x."Father Aereck";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[27]] = x."Talk-to";
        x.lIIIllIllIIII[x.lIIIllIllIIIl[30]] = x."Invoking";
    }

    private void cg() {
        int[] nArray = new int[lIIIllIllIIIl[2]];
        nArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
        if (x.lIlIIIllIIIIIIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIllIllIIIl[2]];
        nArray2[x.lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
        if (x.lIlIIIllIIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIllIllIIIl[2]];
            nArray3[x.lIIIllIllIIIl[0]] = lIIIllIllIIIl[22];
            Inventory.getFirst((int[])nArray3).interact(lIIIllIllIIII[lIIIllIllIIIl[20]]);
        }
    }

    private static void lIlIIIlIlllllIl() {
        lIIIllIllIIIl = new int[32];
        x.lIIIllIllIIIl[0] = (0x44 ^ 0x7E) & ~(0x81 ^ 0xBB);
        x.lIIIllIllIIIl[1] = 26 + 42 - -37 + 89 ^ 116 + 197 - 145 + 31;
        x.lIIIllIllIIIl[2] = 1;
        x.lIIIllIllIIIl[3] = 2;
        x.lIIIllIllIIIl[4] = 3;
        x.lIIIllIllIIIl[5] = 0x3C ^ 0x72 ^ (0xC9 ^ 0x83);
        x.lIIIllIllIIIl[6] = 0xFFFF8DF9 & 0x7EB7;
        x.lIIIllIllIIIl[7] = -(0xFFFFFB37 & 0x77CD) & (0xFFFFFF7F & 0x7FFD);
        x.lIIIllIllIIIl[8] = -(0xFFFFAFAB & 0x72DD) & (0xFFFFFEFD & 0x2FBA);
        x.lIIIllIllIIIl[9] = -(0xFFFFD6C3 & 0x79BE) & (0xFFFFFFDF & 0x75FF);
        x.lIIIllIllIIIl[10] = 0xFFFFBF2F & 0x4CFF;
        x.lIIIllIllIIIl[11] = 0x63 ^ 0x4C ^ (0x6B ^ 0x42);
        x.lIIIllIllIIIl[12] = 0x7C ^ 0x75 ^ (0xA2 ^ 0xAC);
        x.lIIIllIllIIIl[13] = 0x26 ^ 0x68 ^ (0x2B ^ 0x6D);
        x.lIIIllIllIIIl[14] = 0x1D ^ 0x14;
        x.lIIIllIllIIIl[15] = 0xFE ^ 0x8E ^ (0xD0 ^ 0xAA);
        x.lIIIllIllIIIl[16] = 55 + 69 - 41 + 84 ^ 2 + 141 - 63 + 92;
        x.lIIIllIllIIIl[17] = 0xBA ^ 0xB6;
        x.lIIIllIllIIIl[18] = 0x7A ^ 0x77;
        x.lIIIllIllIIIl[19] = 0x52 ^ 0x47 ^ (0xC0 ^ 0xC5);
        x.lIIIllIllIIIl[20] = 89 + 107 - 115 + 69 ^ 112 + 146 - 192 + 86;
        x.lIIIllIllIIIl[21] = 0x79 ^ 0x76;
        x.lIIIllIllIIIl[22] = -(0xFFFFDDF9 & 0x67C7) & (0xFFFFC7EC & 0x7FFB);
        x.lIIIllIllIIIl[23] = -(0xFFFF96AB & 0x7B55) & (0xFFFFDFCF & 0x3E7B);
        x.lIIIllIllIIIl[24] = -(0xFFFFBBD9 & 0x66B7) & (0xFFFFBEFF & 0x6FF7);
        x.lIIIllIllIIIl[25] = 0x71 ^ 0x60;
        x.lIIIllIllIIIl[26] = 0x5C ^ 0x4E;
        x.lIIIllIllIIIl[27] = 0x4A ^ 0x59;
        x.lIIIllIllIIIl[28] = -(0xFFFFFBD7 & 0x357B) & (0xFFFFFFFE & 0x3DFF);
        x.lIIIllIllIIIl[29] = -(0xFFFFF4EF & 0x3B51) & (0xFFFFFFCE & 0x3CF7);
        x.lIIIllIllIIIl[30] = 0x42 ^ 0x56;
        x.lIIIllIllIIIl[31] = 0x93 ^ 0x86;
    }

    private static boolean lIlIIIlIlllllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIllIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private void M() {
        if (x.lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && x.lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIllIIIl[2]];
            stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[26]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (x.lIlIIIllIIIIIII(nPC) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIllIIII[lIIIllIllIIIl[27]]);
                this.sleepWhile(lIIIllIllIIIl[15], () -> {
                    boolean bl;
                    if (x.lIlIIIlIllllllI(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIllIIIl[2];
                        0;
                        if ((0x37 ^ 0x22 ^ (0x18 ^ 9)) == 0) {
                            return ((0x87 ^ 0x93 ^ (0xE ^ 0x27)) & (0x49 ^ 0x28 ^ (0xFE ^ 0xA2) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIllIllIIIl[0];
                    }
                    return bl;
                });
                0;
                if (-1 > 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[28], lIIIllIllIIIl[29], lIIIllIllIIIl[0]));
                0;
            }
            return;
        }
        System.out.println(lIIIllIllIIII[lIIIllIllIIIl[30]]);
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIllIIIl[21]];
        dialogOptionArray[x.lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_THREE;
        dialogOptionArray[x.lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[5]] = DialogOption.PLAIN_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[1]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.lIIIllIllIIIl[11]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[17]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[20]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    private static String lIlIIIlIllllIll(String var19, String var15) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIIllIllIIIl[3], var9);
            return new String(var3.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    static {
        x.lIlIIIlIlllllIl();
        x.lIlIIIlIlllllII();
    }

    private static boolean lIlIIIllIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIllIIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlIllllllI(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIlIllllIlI(String var22, String var4) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var1 = var4.toCharArray();
        int var7 = lIIIllIllIIIl[0];
        char[] var16 = var22.toCharArray();
        int var11 = var16.length;
        int var20 = lIIIllIllIIIl[0];
        while (x.lIlIIIllIIIIIll(var20, var11)) {
            char var10 = var16[var20];
            var25.append((char)(var10 ^ var1[var7 % var1.length]));
            0;
            ++var7;
            ++var20;
            0;
            if (-(0xB3 ^ 0xB9 ^ (0x57 ^ 0x59)) <= 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    /*
     * WARNING - void declaration
     */
    private void cd() {
        String[] stringArray = new String[lIIIllIllIIIl[2]];
        stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[0]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (x.lIlIIIllIIIIIII(tileObject) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
            void var24;
            if (x.lIlIIIlIllllllI(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                Walker.walkTo((WorldPoint)tileObject.getWorldLocation());
                0;
                return;
            }
            String[] stringArray2 = new String[lIIIllIllIIIl[2]];
            stringArray2[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[2]];
            if (x.lIlIIIllIIIIIIl(var24.hasAction(stringArray2) ? 1 : 0)) {
                var24.interact(lIIIllIllIIII[lIIIllIllIIIl[3]]);
            }
            String[] stringArray3 = new String[lIIIllIllIIIl[2]];
            stringArray3[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[4]];
            if (x.lIlIIIllIIIIIIl(var24.hasAction(stringArray3) ? 1 : 0)) {
                String[] stringArray4 = new String[lIIIllIllIIIl[2]];
                stringArray4[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[5]];
                Inventory.getFirst((String[])stringArray4).useOn((TileObject)var24);
                0;
                if (-3 >= 0) {
                    return;
                }
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[6], lIIIllIllIIIl[7], lIIIllIllIIIl[0]));
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void cf() {
        String[] stringArray = new String[lIIIllIllIIIl[2]];
        stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[12]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[lIIIllIllIIIl[2]];
        stringArray2[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[13]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        if (x.lIlIIIlIllllllI(Dialog.canContinue() ? 1 : 0) && x.lIlIIIlIllllllI(Dialog.isViewingOptions() ? 1 : 0)) {
            void var5;
            if (x.lIlIIIllIIIIIII(tileObject) && x.lIlIIIllIIIIIlI(nPC) && x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                void var21;
                String[] stringArray3 = new String[lIIIllIllIIIl[2]];
                stringArray3[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[14]];
                if (x.lIlIIIllIIIIIIl(tileObject.hasAction(stringArray3) ? 1 : 0)) {
                    tileObject.interact(lIIIllIllIIII[lIIIllIllIIIl[15]]);
                    return;
                }
                String[] stringArray4 = new String[lIIIllIllIIIl[2]];
                stringArray4[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[16]];
                if (x.lIlIIIllIIIIIIl(var21.hasAction(stringArray4) ? 1 : 0)) {
                    var21.interact(lIIIllIllIIII[lIIIllIllIIIl[17]]);
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[6], lIIIllIllIIIl[7], lIIIllIllIIIl[0]));
                0;
            }
            if (x.lIlIIIllIIIIIII(var5)) {
                if (x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
                    var5.interact(lIIIllIllIIII[lIIIllIllIIIl[18]]);
                    0;
                    
                    }
                } else {
                    Walker.walkTo((WorldPoint)var5.getWorldLocation());
                    0;
                }
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIllIIIl[19]];
        dialogOptionArray[x.lIIIllIllIIIl[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[4]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[5]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[x.lIIIllIllIIIl[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[16]] = DialogOption.PLAIN_CONTINUE_TWO;
        dialogOptionArray[x.lIIIllIllIIIl[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[18]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[x.lIIIllIllIIIl[21]] = DialogOption.PLAYER_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    public boolean run() {
        x var14;
        if (x.lIlIIIlIllllllI(this.bp.quest().equals((Object)h.RESTLESS_GHOST) ? 1 : 0)) {
            return lIIIllIllIIIl[0];
        }
        int var12 = var14.Q();
        if (x.lIlIIIlIlllllll(var12, lIIIllIllIIIl[1])) {
            return lIIIllIllIIIl[0];
        }
        System.out.println("[RESTLESS GHOST] - Current Progress: " + var12);
        switch (var12) {
            case 0: {
                var14.M();
                0;
                if (2 > 1) break;
                return false;
            }
            case 1: {
                var14.ch();
                0;
                if (null == null) break;
                return ((0xD2 ^ 0x9A) & ~(0xD6 ^ 0x9E) & ~((0x7C ^ 0x68) & ~(0x88 ^ 0x9C))) != 0;
            }
            case 2: {
                var14.cg();
                var14.cf();
                0;
                if (2 != 0) break;
                return false;
            }
            case 3: {
                var14.ce();
                0;
                if (2 >= 0) break;
                return false;
            }
            case 4: {
                var14.cd();
                0;
                if (3 >= 1) break;
                return ((0x56 ^ 0x6D ^ (0x75 ^ 0x66)) & (0xA1 ^ 0xBB ^ (0x79 ^ 0x4B) ^ -1)) != 0;
            }
            default: {
                return lIIIllIllIIIl[0];
            }
        }
        return lIIIllIllIIIl[2];
    }

    /*
     * WARNING - void declaration
     */
    private void ce() {
        void var17;
        String[] stringArray = new String[lIIIllIllIIIl[2]];
        stringArray[x.lIIIllIllIIIl[0]] = lIIIllIllIIII[lIIIllIllIIIl[1]];
        List list = TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIllIIIl[8], lIIIllIllIIIl[9], lIIIllIllIIIl[0]), (String[])stringArray);
        if (x.lIlIIIllIIIIIIl(list.isEmpty() ? 1 : 0)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIIIl[10], lIIIllIllIIIl[9], lIIIllIllIIIl[0]));
            0;
            0;
            if (1 <= 0) {
                return;
            }
        } else if (x.lIlIIIllIIIIIIl(Reachable.isInteractable((Locatable)((Locatable)var17.get(lIIIllIllIIIl[0]))) ? 1 : 0)) {
            ((TileObject)var17.get(lIIIllIllIIIl[0])).interact(lIIIllIllIIII[lIIIllIllIIIl[11]]);
            0;
            if ((0xB0 ^ 0xB4) == -1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)((TileObject)var17.get(lIIIllIllIIIl[0])).getWorldLocation());
            0;
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_THE_RESTLESS_GHOST.c());
    }
}

