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
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.a;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

/* TASK: Completing Restless Ghost -> CompletingrestlessghostTask */
@TaskDesc(name="Completing Restless Ghost")
public class z
extends Task {
    private static /* synthetic */ int[] lIIIllIIlIIII;
    private static /* synthetic */ String[] lIIIllIIIllll;
    private final /* synthetic */ TaskManager bw;
    private final /* synthetic */ SquireQuesterConfig bu;
    private final /* synthetic */ Client bt;
    private final /* synthetic */ SquireQuester bv;

    private static boolean lIlIIIIlllIllIl(Object object) {
        return object != null;
    }

    private void cq() {
        if (z.lIlIIIIlllIlIll(Dialog.canContinue() ? 1 : 0) && z.lIlIIIIlllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIlIIII[2]];
            stringArray[z.lIIIllIIlIIII[0]] = lIIIllIIIllll[lIIIllIIlIIII[0]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (z.lIlIIIIlllIllIl(nPC) && z.lIlIIIIlllIlllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIIIllll[lIIIllIIlIIII[2]]);
                this.sleepWhile(lIIIllIIlIIII[3], () -> {
                    boolean bl;
                    if (z.lIlIIIIlllIlIll(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIIlIIII[2];
                        0;
                        if (1 == 0) {
                            return ((0x77 ^ 0x19 ^ (0x1D ^ 0x23)) & (0x97 ^ 0xC0 ^ (4 ^ 3) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIllIIlIIII[0];
                    }
                    return bl;
                });
                0;
                
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIIII[4], lIIIllIIlIIII[5], lIIIllIIlIIII[0]));
                0;
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIIII[6]];
        dialogOptionArray[z.lIIIllIIlIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[2]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[10]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[z.lIIIllIIlIIII[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[11]] = DialogOption.QUEST;
        dialogOptionArray[z.lIIIllIIlIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[13]] = DialogOption.QUEST;
        dialogOptionArray[z.lIIIllIIlIIII[3]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[16]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[18]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[z.lIIIllIIlIIII[19]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[26]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[27]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[29]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[31]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[32]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[33]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[34]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[35]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[36]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[37]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[z.lIIIllIIlIIII[38]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[39]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[40]] = DialogOption.QUEST;
        dialogOptionArray[z.lIIIllIIlIIII[41]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[42]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[43]] = DialogOption.NPC_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    private static boolean lIlIIIIlllIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIlllIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIIIIlllIIllI(String var1, String var15) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIIIllIIlIIII[12]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIIllIIlIIII[7], var20);
            return new String(var6.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIlllIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIlllIlIll(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        z var21;
        if (z.lIlIIIIlllIlIll(this.bu.quest().equals((Object)h.RUNE_MYSTERIES) ? 1 : 0)) {
            return lIIIllIIlIIII[0];
        }
        int var16 = var21.Q();
        if (z.lIlIIIIlllIllII(var16, lIIIllIIlIIII[1])) {
            return lIIIllIIlIIII[0];
        }
        System.out.println("Current Progress: " + var16);
        switch (var16) {
            case 0: {
                var21.M();
                0;
                if (((0x87 ^ 0xB6) & ~(0x49 ^ 0x78)) <= 0) break;
                return false;
            }
            case 1: {
                var21.cs();
                0;
                if (null == null) break;
                return false;
            }
            case 2: {
                var21.cs();
                0;
                if (3 != 0) break;
                return false;
            }
            case 3: {
                var21.cr();
                0;
                if (-1 >= -1) break;
                return false;
            }
            case 5: {
                var21.cq();
                0;
                if (-2 < 0) break;
                return ((0x54 ^ 0x75 ^ (0x2C ^ 0x1F)) & (0x30 ^ 0x3C ^ (0xB ^ 0x15) ^ -1)) != 0;
            }
            default: {
                return lIIIllIIlIIII[0];
            }
        }
        return lIIIllIIlIIII[2];
    }

    private static String lIlIIIIlllIIlll(String var3, String var9) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIIllIIlIIII[7], var7);
            return new String(var8.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_RUNE_MYSTERIES.c());
    }

    private static void lIlIIIIlllIlIlI() {
        lIIIllIIlIIII = new int[48];
        z.lIIIllIIlIIII[0] = (0x89 ^ 0x98) & ~(0x2B ^ 0x3A);
        z.lIIIllIIlIIII[1] = 0xBD ^ 0xBB;
        z.lIIIllIIlIIII[2] = 1;
        z.lIIIllIIlIIII[3] = 68 + 142 - 202 + 150 ^ 115 + 119 - 103 + 17;
        z.lIIIllIIlIIII[4] = -(0xFFFFEA5D & 0x35F3) & (0xFFFFAE74 & 0x7DFB);
        z.lIIIllIIlIIII[5] = -(0xFFFFEEC3 & 0x19BE) & (0xFFFFAFF3 & 0x7DEF);
        z.lIIIllIIlIIII[6] = 0x8F ^ 0xA6;
        z.lIIIllIIlIIII[7] = 2;
        z.lIIIllIIlIIII[8] = 3;
        z.lIIIllIIlIIII[9] = 134 + 168 - 252 + 125 ^ 57 + 18 - -89 + 7;
        z.lIIIllIIlIIII[10] = 0x7B ^ 0x7E;
        z.lIIIllIIlIIII[11] = 22 + 161 - 49 + 29 ^ 123 + 35 - 59 + 65;
        z.lIIIllIIlIIII[12] = 0x56 ^ 0x5E;
        z.lIIIllIIlIIII[13] = 0x24 ^ 0x2D;
        z.lIIIllIIlIIII[14] = 0x27 ^ 0x4C ^ (0x4B ^ 0x2B);
        z.lIIIllIIlIIII[15] = 0x81 ^ 0x8D;
        z.lIIIllIIlIIII[16] = 0x5F ^ 0x52;
        z.lIIIllIIlIIII[17] = 0x17 ^ 0x19;
        z.lIIIllIIlIIII[18] = 6 + 80 - -32 + 19 ^ 113 + 13 - 72 + 80;
        z.lIIIllIIlIIII[19] = 0xEE ^ 0xC0 ^ (0x48 ^ 0x76);
        z.lIIIllIIlIIII[20] = 0x38 ^ 0x29;
        z.lIIIllIIlIIII[21] = 11 + 54 - -24 + 43 ^ 104 + 77 - 167 + 136;
        z.lIIIllIIlIIII[22] = 0x1D ^ 0xE;
        z.lIIIllIIlIIII[23] = 0x3C ^ 0x28;
        z.lIIIllIIlIIII[24] = 0x7B ^ 0x6E;
        z.lIIIllIIlIIII[25] = 0x17 ^ 1;
        z.lIIIllIIlIIII[26] = 0x3C ^ 0x46 ^ (0xFE ^ 0x93);
        z.lIIIllIIlIIII[27] = 0xD8 ^ 0x93 ^ (0xEA ^ 0xB9);
        z.lIIIllIIlIIII[28] = 0x33 ^ 0x2A;
        z.lIIIllIIlIIII[29] = 0x8E ^ 0x94;
        z.lIIIllIIlIIII[30] = 0x3E ^ 0x25;
        z.lIIIllIIlIIII[31] = 0x59 ^ 0x45;
        z.lIIIllIIlIIII[32] = 7 + 124 - 106 + 136 ^ 141 + 49 - 155 + 153;
        z.lIIIllIIlIIII[33] = 52 + 133 - 181 + 187 ^ 18 + 49 - 37 + 131;
        z.lIIIllIIlIIII[34] = 0x24 ^ 0x3B;
        z.lIIIllIIlIIII[35] = 0x1E ^ 0x3E;
        z.lIIIllIIlIIII[36] = 0x9B ^ 0xBA;
        z.lIIIllIIlIIII[37] = 2 ^ (0x6D ^ 0x4D);
        z.lIIIllIIlIIII[38] = 0xB3 ^ 0x90;
        z.lIIIllIIlIIII[39] = 0x61 ^ 0x5C ^ (0x67 ^ 0x7E);
        z.lIIIllIIlIIII[40] = 0x6D ^ 0x48;
        z.lIIIllIIlIIII[41] = 9 ^ 1 ^ (0x20 ^ 0xE);
        z.lIIIllIIlIIII[42] = 0x75 ^ 0x52;
        z.lIIIllIIlIIII[43] = 0xB4 ^ 0x9C;
        z.lIIIllIIlIIII[44] = 0xFFFFECF7 & 0x1FBC;
        z.lIIIllIIlIIII[45] = -(0x5C ^ 0x4B) & (0xFFFFCFFF & 0x3D5F);
        z.lIIIllIIlIIII[46] = 0xFFFFBCEB & 0x4F9D;
        z.lIIIllIIlIIII[47] = -(0xFFFFB863 & 0x67DD) & (0xFFFFFFD7 & 0x2CFF);
    }

    private void M() {
        if (z.lIlIIIIlllIlIll(Dialog.canContinue() ? 1 : 0) && z.lIlIIIIlllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIlIIII[2]];
            stringArray[z.lIIIllIIlIIII[0]] = lIIIllIIIllll[lIIIllIIlIIII[1]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (z.lIlIIIIlllIllIl(nPC) && z.lIlIIIIlllIlllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIIIllll[lIIIllIIlIIII[11]]);
                this.sleepWhile(lIIIllIIlIIII[3], () -> {
                    boolean bl;
                    if (z.lIlIIIIlllIlIll(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIIlIIII[2];
                        0;
                        if (((92 + 18 - 102 + 124 ^ 87 + 60 - 131 + 140) & (200 + 55 - 216 + 184 ^ 43 + 4 - 1 + 153 ^ -1)) != ((0x50 ^ 0x6D ^ (0x55 ^ 0x6C)) & (76 + 143 - 122 + 47 ^ 46 + 117 - 97 + 82 ^ -1))) {
                            return ((66 + 95 - 127 + 146 ^ 64 + 101 - 135 + 98) & (0x25 ^ 0x43 ^ (0xF1 ^ 0xA3) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIllIIlIIII[0];
                    }
                    return bl;
                });
                0;
                if (-1 < -1) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIIII[46], lIIIllIIlIIII[47], lIIIllIIlIIII[2]));
                0;
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIIII[16]];
        dialogOptionArray[z.lIIIllIIlIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[z.lIIIllIIlIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[1]] = DialogOption.QUEST;
        dialogOptionArray[z.lIIIllIIlIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[13]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[z.lIIIllIIlIIII[3]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[14]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[15]] = DialogOption.PLAIN_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    private static void lIlIIIIlllIlIIl() {
        lIIIllIIIllll = new String[lIIIllIIlIIII[12]];
        z.lIIIllIIIllll[z.lIIIllIIlIIII[0]] = z."Archmage Sedridor";
        z.lIIIllIIIllll[z.lIIIllIIlIIII[2]] = z."Talk-to";
        z.lIIIllIIIllll[z.lIIIllIIlIIII[7]] = z."Aubury";
        z.lIIIllIIIllll[z.lIIIllIIlIIII[8]] = z."Talk-to";
        z.lIIIllIIIllll[z.lIIIllIIlIIII[9]] = z."Archmage Sedridor";
        z.lIIIllIIIllll[z.lIIIllIIlIIII[10]] = z."Talk-to";
        z.lIIIllIIIllll[z.lIIIllIIlIIII[1]] = z."Duke Horacio";
        z.lIIIllIIIllll[z.lIIIllIIlIIII[11]] = z."Talk-to";
    }

    private void cr() {
        if (z.lIlIIIIlllIlIll(Dialog.canContinue() ? 1 : 0) && z.lIlIIIIlllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIlIIII[2]];
            stringArray[z.lIIIllIIlIIII[0]] = lIIIllIIIllll[lIIIllIIlIIII[7]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (z.lIlIIIIlllIllIl(nPC) && z.lIlIIIIlllIlllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIIIllll[lIIIllIIlIIII[8]]);
                this.sleepWhile(lIIIllIIlIIII[3], () -> {
                    boolean bl;
                    if (z.lIlIIIIlllIlIll(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIIlIIII[2];
                        0;
                        if (((98 + 101 - 187 + 132 ^ 169 + 11 - 8 + 20) & (0xFC ^ 0x8D ^ (9 ^ 0x28) ^ -1)) == 3) {
                            return ((3 ^ (0x12 ^ 0x3E)) & (0xCC ^ 0xAB ^ (0x5A ^ 0x12) ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIIllIIlIIII[0];
                    }
                    return bl;
                });
                0;
                if ((0x97 ^ 0x93) < (0x61 ^ 0x65)) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIIII[44], lIIIllIIlIIII[45], lIIIllIIlIIII[0]));
                0;
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIIII[19]];
        dialogOptionArray[z.lIIIllIIlIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[z.lIIIllIIlIIII[7]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[8]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[9]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[10]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[1]] = DialogOption.QUEST;
        dialogOptionArray[z.lIIIllIIlIIII[11]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[12]] = DialogOption.QUEST;
        dialogOptionArray[z.lIIIllIIlIIII[13]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[3]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[16]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[18]] = DialogOption.QUEST;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    @Inject
    public z(Client client, SquireQuesterConfig squireQuesterConfig, SquireQuester squireQuester, TaskManager taskManager) {
        this.bt = client;
        this.bu = squireQuesterConfig;
        this.bv = squireQuester;
        this.bw = taskManager;
    }

    private static String lIlIIIIlllIlIII(String var12, String var5) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var11 = var5.toCharArray();
        int var13 = lIIIllIIlIIII[0];
        char[] var2 = var12.toCharArray();
        int var14 = var2.length;
        int var17 = lIIIllIIlIIII[0];
        while (z.lIlIIIIlllIllll(var17, var14)) {
            char var10 = var2[var17];
            var4.append((char)(var10 ^ var11[var13 % var11.length]));
            0;
            ++var13;
            ++var17;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private void cs() {
        if (z.lIlIIIIlllIlIll(Dialog.canContinue() ? 1 : 0) && z.lIlIIIIlllIlIll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIIIllIIlIIII[2]];
            stringArray[z.lIIIllIIlIIII[0]] = lIIIllIIIllll[lIIIllIIlIIII[9]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (z.lIlIIIIlllIllIl(nPC) && z.lIlIIIIlllIlllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                nPC.interact(lIIIllIIIllll[lIIIllIIlIIII[10]]);
                this.sleepWhile(lIIIllIIlIIII[3], () -> {
                    boolean bl;
                    if (z.lIlIIIIlllIlIll(Dialog.isOpen() ? 1 : 0)) {
                        bl = lIIIllIIlIIII[2];
                        0;
                        
                        }
                    } else {
                        bl = lIIIllIIlIIII[0];
                    }
                    return bl;
                });
                0;
                if (((1 ^ (0xB3 ^ 0xB4)) & (11 + 179 - 37 + 36 ^ 126 + 22 - 116 + 155 ^ -1)) != 0) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIIlIIII[4], lIIIllIIlIIII[5], lIIIllIIlIIII[0]));
                0;
            }
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIllIIlIIII[6]];
        dialogOptionArray[z.lIIIllIIlIIII[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[2]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[7]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[8]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[9]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[10]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[z.lIIIllIIlIIII[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[11]] = DialogOption.QUEST;
        dialogOptionArray[z.lIIIllIIlIIII[12]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[13]] = DialogOption.QUEST;
        dialogOptionArray[z.lIIIllIIlIIII[3]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[14]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[15]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[16]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[17]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[18]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[z.lIIIllIIlIIII[19]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[21]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[24]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[25]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[26]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[27]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[28]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[29]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[30]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[31]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[32]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[33]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[34]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[35]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[36]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[37]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[z.lIIIllIIlIIII[38]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[39]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[40]] = DialogOption.QUEST;
        dialogOptionArray[z.lIIIllIIlIIII[41]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[42]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[z.lIIIllIIlIIII[43]] = DialogOption.NPC_CONTINUE;
        Dialog.invokeDialog((DialogOption[])dialogOptionArray);
    }

    static {
        z.lIlIIIIlllIlIlI();
        z.lIlIIIIlllIlIIl();
    }
}

