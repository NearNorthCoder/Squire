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
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.a;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

/* TASK: Completing Pirates Treasure -> CompletingpiratestreasureTask */
@TaskDesc(name="Completing Pirates Treasure", register=true)
public class v
extends Task {
    private /* synthetic */ boolean aN;
    private /* synthetic */ boolean aQ;
    private /* synthetic */ boolean aP;
    private static /* synthetic */ String[] lIIIlllIIIIIl;
    private /* synthetic */ boolean aO;
    private static /* synthetic */ int[] lIIIlllIIIIlI;
    private /* synthetic */ boolean aR;
    private final /* synthetic */ SquireQuesterConfig aM;

    private void bj() {
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (v.lIlIIIlllIIlIll(nPC.getId(), lIIIlllIIIIlI[87]) && v.lIlIIIlllIIllII(nPC.getInteracting(), Players.getLocal())) {
                n2 = lIIIlllIIIIlI[2];
                0;
                if ((0x7C ^ 0x2B ^ (0xC9 ^ 0x9A)) == ((0x42 ^ 0x1E ^ (0xF8 ^ 0x9C)) & (0x9B ^ 0x93 ^ (0x8C ^ 0xBC) ^ -1))) {
                    return ((3 + 49 - -115 + 41 ^ 28 + 79 - -40 + 5) & (0xF9 ^ 0xBD ^ (0x4E ^ 0x42) ^ -1)) != 0;
                }
            } else {
                n2 = lIIIlllIIIIlI[0];
            }
            return n2 != 0;
        });
        if (v.lIlIIIlllIIIlII(list.isEmpty() ? 1 : 0)) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[3], lIIIlllIIIIlI[4], lIIIlllIIIIlI[0]));
            0;
            return;
        }
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[5], lIIIlllIIIIlI[6], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[5], lIIIlllIIIIlI[6], lIIIlllIIIIlI[0]));
            0;
            0;
            if (3 < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[0]]);
        }
    }

    private static String lIlIIIlllIIIIII(String var13, String var24) {
        try {
            SecretKeySpec var34 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lIIIlllIIIIlI[23]), "DES");
            Cipher var37 = Cipher.getInstance("DES");
            var37.init(lIIIlllIIIIlI[18], var34);
            return new String(var37.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlllIIIIlI() {
        lIIIlllIIIIIl = new String[lIIIlllIIIIlI[88]];
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[0]] = v."Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[2]] = v."Read";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[18]] = v."Taking";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[19]] = v."Take";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[1]] = v."We are wearing our apron";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[20]] = v."Search";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[21]] = v."Wear";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[22]] = v."Collecting payment";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[23]] = v."You stash the rum in the crate.";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[24]] = v."Setting stashed rum to true";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[17]] = v."You pack all your bananas into the crate.";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[40]] = v."Setting stashed to true";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[42]] = v."Filling with rum";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[44]] = v."Filling with banana";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[45]] = v."Fill";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[47]] = v."Have you completed your task yet?";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[48]] = v."Pick";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[49]] = v."Pick";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[51]] = v."Trade";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[60]] = v."Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[63]] = v."Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[66]] = v."Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[69]] = v."Dig";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[70]] = v."Take";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[78]] = v."Talk-to";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[79]] = v."Walking to NPC";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[80]] = v."crate is already full.";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[81]] = v."crate is full";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[82]] = v."hands you 30";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[83]] = v."Pick";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[84]] = v."Banana Tree";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[85]] = v."Pick";
        v.lIIIlllIIIIIl[v.lIIIlllIIIIlI[86]] = v."Banana Tree";
    }

    private void bq() {
        v var27;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var27.aO ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIlIlI(Inventory.getCount((boolean)lIIIlllIIIIlI[0], (int[])nArray2), lIIIlllIIIIlI[17])) {
            return;
        }
        System.out.println(var27.aN);
        if (v.lIlIIIlllIIIlll(var27.aN ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        var27.a(lIIIlllIIIIlI[36], new WorldPoint(lIIIlllIIIIlI[37], lIIIlllIIIIlI[38], lIIIlllIIIIlI[0]), dialogOptionArray);
        if (v.lIlIIIlllIIIlll(Widgets.get((int)lIIIlllIIIIlI[46], (int)lIIIlllIIIIlI[21]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[47]]) ? 1 : 0)) {
            var27.aN = lIIIlllIIIIlI[2];
        }
    }

    private void bo() {
        v var38;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlII(var38.aP ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlII(var38.aQ ? 1 : 0)) {
            return;
        }
        System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[22]]);
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[18]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.NPC_CONTINUE;
        this.a(lIIIlllIIIIlI[36], new WorldPoint(lIIIlllIIIIlI[37], lIIIlllIIIIlI[38], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private static boolean lIlIIIlllIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private void bz() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIlllIIIIlI[14], new WorldPoint(lIIIlllIIIIlI[15], lIIIlllIIIIlI[16], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private void P() {
        if (v.lIlIIIlllIIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private void bk() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        Inventory.getFirst((int[])nArray2).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[2]]);
    }

    private void bx() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        TileItem var8 = TileItems.getNearest((int[])nArray2);
        if (v.lIlIIIlllIIlIII(var8)) {
            var8.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[70]]);
            0;
            if (2 <= -1) {
                return;
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[71], lIIIlllIIIIlI[72], lIIIlllIIIIlI[2]));
            0;
        }
    }

    private void bs() {
        v var5;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var5.aP ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var5.aO ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[50];
        NPC var35 = NPCs.getNearest((int[])nArray2);
        if (v.lIlIIIlllIIIlll(Shop.isOpen() ? 1 : 0)) {
            Shop.buyOne((int)lIIIlllIIIIlI[13]);
        }
        if (v.lIlIIIlllIIlIII(var35)) {
            var35.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[51]]);
            0;
            
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[52], lIIIlllIIIIlI[53], lIIIlllIIIIlI[0]));
            0;
        }
    }

    private static String lIlIIIllIllllll(String var32, String var18) {
        var32 = new String(Base64.getDecoder().decode(var32.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var3 = var18.toCharArray();
        int var14 = lIIIlllIIIIlI[0];
        char[] var25 = var32.toCharArray();
        int var36 = var25.length;
        int var19 = lIIIlllIIIIlI[0];
        while (v.lIlIIIlllIIlIlI(var19, var36)) {
            char var6 = var25[var19];
            var15.append((char)(var6 ^ var3[var14 % var3.length]));
            0;
            ++var14;
            ++var19;
            0;
            if ((0xD2 ^ 0x87 ^ (0xFA ^ 0xAA)) > 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static String lIlIIIlllIIIIIl(String var17, String var7) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var26 = Cipher.getInstance("Blowfish");
            var26.init(lIIIlllIIIIlI[18], var22);
            return new String(var26.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        v var16;
        if (v.lIlIIIlllIIIlII(this.aM.quest().equals((Object)h.PIRATES_TREASURE) ? 1 : 0)) {
            return lIIIlllIIIIlI[0];
        }
        int var21 = var16.Q();
        if (v.lIlIIIlllIIIlIl(var21, lIIIlllIIIIlI[1])) {
            return lIIIlllIIIIlI[0];
        }
        System.out.println("[PIRATES TREASURE] - Current Progress: " + var21);
        switch (var21) {
            case 0: {
                var16.bx();
                var16.bz();
                0;
                if (-1 <= 0) break;
                return false;
            }
            case 1: {
                var16.by();
                var16.bs();
                var16.br();
                var16.bq();
                var16.bp();
                var16.bo();
                var16.bn();
                var16.bm();
                0;
                if (1 != 0) break;
                return false;
            }
            case 2: {
                var16.bl();
                var16.bk();
                0;
                if (-1 <= ((0x81 ^ 0x8C) & ~(0xAB ^ 0xA6))) break;
                return false;
            }
            case 3: {
                var16.bj();
                0;
                if (1 != ((0x6C ^ 0x71 ^ (0x9E ^ 0xA2)) & (0xE0 ^ 0xA4 ^ (0x16 ^ 0x73) ^ -1))) break;
                return ((121 + 68 - 150 + 145 ^ 51 + 88 - 48 + 48) & (0x58 ^ 0x16 ^ (0x2B ^ 0x56) ^ -1)) != 0;
            }
            default: {
                return lIIIlllIIIIlI[0];
            }
        }
        return lIIIlllIIIIlI[2];
    }

    private void br() {
        TileObject var30;
        v var28;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var28.aP ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var28.aO ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(var28.aN ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIlllIIIIlI[2]];
            nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
            if (v.lIlIIIlllIIlIlI(Inventory.getCount((boolean)lIIIlllIIIIlI[0], (int[])nArray3), lIIIlllIIIIlI[17]) && v.lIlIIIlllIIlIII(var30 = TileObjects.getNearest(tileObject -> {
                int n2;
                String[] stringArray = new String[lIIIlllIIIIlI[2]];
                stringArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIIl[lIIIlllIIIIlI[85]];
                if (v.lIlIIIlllIIIlll(tileObject.hasAction(stringArray) ? 1 : 0) && v.lIlIIIlllIIIlll(tileObject.getName().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[86]]) ? 1 : 0)) {
                    n2 = lIIIlllIIIIlI[2];
                    0;
                    if (((0xA2 ^ 0xA5) & ~(0x5A ^ 0x5D)) > 0) {
                        return false;
                    }
                } else {
                    n2 = lIIIlllIIIIlI[0];
                }
                return n2 != 0;
            })) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var30) ? 1 : 0)) {
                var30.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[48]]);
            }
        }
        int[] nArray4 = new int[lIIIlllIIIIlI[2]];
        nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray4) ? 1 : 0) && v.lIlIIIlllIIlIII(var30 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIIlllIIIIlI[2]];
            stringArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIIl[lIIIlllIIIIlI[83]];
            if (v.lIlIIIlllIIIlll(tileObject.hasAction(stringArray) ? 1 : 0) && v.lIlIIIlllIIIlll(tileObject.getName().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[84]]) ? 1 : 0)) {
                n2 = lIIIlllIIIIlI[2];
                0;
                if (((4 ^ 0x66) & ~(0xC7 ^ 0xA5)) <= -1) {
                    return false;
                }
            } else {
                n2 = lIIIlllIIIIlI[0];
            }
            return n2 != 0;
        })) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var30) ? 1 : 0)) {
            var30.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[49]]);
        }
    }

    private int Q() {
        return Vars.getVarp((int)a.QUEST_PIRATES_TREASURE.c());
    }

    private void bt() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[58], lIIIlllIIIIlI[59], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[58], lIIIlllIIIIlI[59], lIIIlllIIIIlI[0]));
            0;
            0;
            if (((0x77 ^ 0x28) & ~(9 ^ 0x56)) != ((0xED ^ 0xBF) & ~(0x24 ^ 0x76))) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[60]]);
        }
    }

    private void Y() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[54];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_TWO;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIlllIIIIlI[55], new WorldPoint(lIIIlllIIIIlI[56], lIIIlllIIIIlI[57], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, WorldPoint worldPoint, DialogOption ... dialogOptionArray) {
        void var4;
        if (v.lIlIIIlllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = var4;
        NPC var2 = NPCs.getNearest((int[])nArray);
        if (v.lIlIIIlllIIlIII(var2) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            var2.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[78]]);
            0;
            if (((0x5D ^ 0x6F) & ~(0x1D ^ 0x2F)) != 0) {
                return;
            }
        } else {
            void var1;
            System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[79]]);
            Walker.walkTo((WorldPoint)var1);
            0;
        }
    }

    private void by() {
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (!v.lIlIIIlllIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[73]) || v.lIlIIIlllIIlIll(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[74])) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[1]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.PLAYER_CONTINUE;
        this.a(lIIIlllIIIIlI[75], new WorldPoint(lIIIlllIIIIlI[76], lIIIlllIIIIlI[77], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private static boolean lIlIIIlllIIIlll(int n2) {
        return n2 != 0;
    }

    static {
        v.lIlIIIlllIIIIll();
        v.lIlIIIlllIIIIlI();
    }

    private void bl() {
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[8];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[9];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return;
        }
        int[] nArray3 = new int[lIIIlllIIIIlI[2]];
        nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[10];
        TileObject var12 = TileObjects.getNearest((int[])nArray3);
        if (v.lIlIIIlllIIlIII(var12) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
            int[] nArray4 = new int[lIIIlllIIIIlI[2]];
            nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[9];
            Inventory.getFirst((int[])nArray4).useOn(var12);
            0;
            
            }
        } else {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[11], lIIIlllIIIIlI[12], lIIIlllIIIIlI[2]));
            0;
        }
    }

    private static boolean lIlIIIlllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIlllIIlIII(Object object) {
        return object != null;
    }

    private static void lIlIIIlllIIIIll() {
        lIIIlllIIIIlI = new int[89];
        v.lIIIlllIIIIlI[0] = (0xE0 ^ 0xA6) & ~(1 ^ 0x47);
        v.lIIIlllIIIIlI[1] = 0x3D ^ 0x39;
        v.lIIIlllIIIIlI[2] = 1;
        v.lIIIlllIIIIlI[3] = 0xFFFF8BB2 & Short.MAX_VALUE;
        v.lIIIlllIIIIlI[4] = 0xFFFF8D3B & 0x7FEE;
        v.lIIIlllIIIIlI[5] = 0xFFFFDBF7 & 0x2FBF;
        v.lIIIlllIIIIlI[6] = -(0xFFFFDC5F & 0x73E9) & (0xFFFFDF7F & 0x7DFF);
        v.lIIIlllIIIIlI[7] = -(0xFFFFF43B & 0x1FC5) & (0xFFFFF7F8 & 0x1FBF);
        v.lIIIlllIIIIlI[8] = 0xFFFFD7BF & 0x29F1;
        v.lIIIlllIIIIlI[9] = 0xFFFFADB2 & 0x53FD;
        v.lIIIlllIIIIlI[10] = -(0xFFFFF5E1 & 0x7F7F) & (0xFFFFFFFF & 0x7D7F);
        v.lIIIlllIIIIlI[11] = 0xFFFFBCBF & 0x4FD3;
        v.lIIIlllIIIIlI[12] = 0xFFFFCD43 & 0x3FFF;
        v.lIIIlllIIIIlI[13] = -(0xFFFFEF37 & 0x7ED9) & (0xFFFFFFFF & 0x6FBF);
        v.lIIIlllIIIIlI[14] = -(0xFFFFD55D & 0x7BE7) & (0xFFFFDFFF & 0x7F7F);
        v.lIIIlllIIIIlI[15] = -(0xFFFFDCD9 & 0x6727) & (0xFFFFDFFF & 0x6FED);
        v.lIIIlllIIIIlI[16] = 0xFFFF9EB5 & 0x6DFF;
        v.lIIIlllIIIIlI[17] = 42 + 94 - 23 + 17 ^ 18 + 1 - -4 + 113;
        v.lIIIlllIIIIlI[18] = 2;
        v.lIIIlllIIIIlI[19] = 3;
        v.lIIIlllIIIIlI[20] = 0x5A ^ 0x6F ^ (0x25 ^ 0x15);
        v.lIIIlllIIIIlI[21] = 0xA8 ^ 0xB9 ^ (0xD1 ^ 0xC6);
        v.lIIIlllIIIIlI[22] = 0x51 ^ 0x56;
        v.lIIIlllIIIIlI[23] = (0x82 ^ 0xB3) & ~(0x85 ^ 0xB4) ^ (0x16 ^ 0x1E);
        v.lIIIlllIIIIlI[24] = 4 ^ 0x31 ^ (0x5F ^ 0x63);
        v.lIIIlllIIIIlI[25] = 0xFFFFAFBF & 0x7F72;
        v.lIIIlllIIIIlI[26] = 0xFFFF8F42 & 0x7EFD;
        v.lIIIlllIIIIlI[27] = 0xFFFFEBBF & 0x1FC9;
        v.lIIIlllIIIIlI[28] = -(0xFFFFBAAB & 0x7577) & (0xFFFFBD7E & 0x7EEF);
        v.lIIIlllIIIIlI[29] = -(0xFFFFBEFB & 0x6D17) & (0xFFFFBFFF & 0x6FFF);
        v.lIIIlllIIIIlI[30] = -(0xFFFFFA97 & 0x65EB) & (0xFFFFFFF7 & 0x7F9F);
        v.lIIIlllIIIIlI[31] = 0xFFFFCFD8 & 0x3BEF;
        v.lIIIlllIIIIlI[32] = 0xFFFFDDFF & 0x2E9C;
        v.lIIIlllIIIIlI[33] = -(0xFFFFFF3B & 0x57E5) & (0xFFFFFFFF & 0x5F37);
        v.lIIIlllIIIIlI[34] = -(0xFFFFE65B & 0x79AE) & (0xFFFFFFFF & 0x6BCB);
        v.lIIIlllIIIIlI[35] = -(0xFFFFA7A9 & 0x7A77) & (0xFFFFAEBF & 0x7FE7);
        v.lIIIlllIIIIlI[36] = 0xFFFFAFFF & 0x5E3F;
        v.lIIIlllIIIIlI[37] = -(0xFFFFF6EF & 0x5D96) & (0xFFFFDFFF & Short.MAX_VALUE);
        v.lIIIlllIIIIlI[38] = 0xFFFFED7D & 0x1ED3;
        v.lIIIlllIIIIlI[39] = 157 + 24 - 42 + 52 + (0x42 ^ 8) - (154 + 41 - 19 + 54) + (181 + 108 - 267 + 172);
        v.lIIIlllIIIIlI[40] = 0x8D ^ 0x86;
        v.lIIIlllIIIIlI[41] = -(0xFFFFF7BB & 0x6C65) & (0xFFFFFFFD & 0x6C3A);
        v.lIIIlllIIIIlI[42] = 0x37 ^ 0x3B;
        v.lIIIlllIIIIlI[43] = 0xFFFF97BF & 0x6FEB;
        v.lIIIlllIIIIlI[44] = 0x60 ^ 0x13 ^ (0x1C ^ 0x62);
        v.lIIIlllIIIIlI[45] = 0x38 ^ 0x36;
        v.lIIIlllIIIIlI[46] = 204 + 4 - 143 + 166;
        v.lIIIlllIIIIlI[47] = 5 ^ 0xA;
        v.lIIIlllIIIIlI[48] = 0x67 ^ 0x77;
        v.lIIIlllIIIIlI[49] = 0x14 ^ 0x50 ^ (0x22 ^ 0x77);
        v.lIIIlllIIIIlI[50] = -(0xFFFFC999 & 0x3EEF) & (0xFFFFBFFF & 0x7DDF);
        v.lIIIlllIIIIlI[51] = 0x9F ^ 0x8D;
        v.lIIIlllIIIIlI[52] = -(0xFFFFCC5F & 0x77A5) & (0xFFFFDF7F & 0x6FF4);
        v.lIIIlllIIIIlI[53] = 0xFFFFAF6F & 0x5CD8;
        v.lIIIlllIIIIlI[54] = 0xFFFFDBDF & 0x7E3F;
        v.lIIIlllIIIIlI[55] = 0xFFFFBF76 & 0x61AD;
        v.lIIIlllIIIIlI[56] = 0xFFFFCFEE & 0x3BFF;
        v.lIIIlllIIIIlI[57] = -(0xFFFFF7DB & 0x1826) & (0xFFFFDFAF & 0x3CFF);
        v.lIIIlllIIIIlI[58] = 0xFFFFEFDF & 0x1C26;
        v.lIIIlllIIIIlI[59] = 0xFFFFECBB & 0x1FFF;
        v.lIIIlllIIIIlI[60] = 0x29 ^ 0x3A;
        v.lIIIlllIIIIlI[61] = 0xFFFFEF3D & 0x1CE7;
        v.lIIIlllIIIIlI[62] = 0xFFFFFEFA & 0xDC5;
        v.lIIIlllIIIIlI[63] = 93 + 10 - 76 + 126 ^ 85 + 140 - 88 + 4;
        v.lIIIlllIIIIlI[64] = -(0xFFFFB765 & 0x6ADB) & (0xFFFFBEEB & 0x6FD7);
        v.lIIIlllIIIIlI[65] = 0xFFFF9FDD & 0x6CAE;
        v.lIIIlllIIIIlI[66] = 0xE0 ^ 0xAD ^ (0x54 ^ 0xC);
        v.lIIIlllIIIIlI[67] = -(0xFFFFFE63 & 0x3FD) & (0xFFFFBFFE & 0x4EFF);
        v.lIIIlllIIIIlI[68] = 0xFFFFDEA9 & 0x2DDF;
        v.lIIIlllIIIIlI[69] = 0xB4 ^ 0xA2;
        v.lIIIlllIIIIlI[70] = 0xA ^ 0x79 ^ (0x27 ^ 0x43);
        v.lIIIlllIIIIlI[71] = -(0xFFFFDB3D & 0x77EF) & (0xFFFFDFBF & 0x7FFC);
        v.lIIIlllIIIIlI[72] = 0xFFFF8FDB & 0x7D77;
        v.lIIIlllIIIIlI[73] = 0xFFFFBEBF & 0x6F71;
        v.lIIIlllIIIIlI[74] = 0xFFFFEDFD & 0x3F33;
        v.lIIIlllIIIIlI[75] = -(0xFFFFE3C5 & 0x3DFB) & (0xFFFFFFFD & 0x2FFF);
        v.lIIIlllIIIIlI[76] = 0xFFFFBBF3 & 0x4FDF;
        v.lIIIlllIIIIlI[77] = -(0xFFFFB367 & 0x7FFB) & (0xFFFFBFF7 & Short.MAX_VALUE);
        v.lIIIlllIIIIlI[78] = 0x40 ^ 0x58;
        v.lIIIlllIIIIlI[79] = 0x1E ^ 7;
        v.lIIIlllIIIIlI[80] = 0xB8 ^ 0xA2;
        v.lIIIlllIIIIlI[81] = 0x77 ^ 0x69 ^ (0x4F ^ 0x4A);
        v.lIIIlllIIIIlI[82] = 0x78 ^ 0x64;
        v.lIIIlllIIIIlI[83] = 8 ^ 0x15;
        v.lIIIlllIIIIlI[84] = 12 + 25 - 4 + 121 ^ 77 + 27 - 13 + 41;
        v.lIIIlllIIIIlI[85] = 0xE1 ^ 0x90 ^ (0x13 ^ 0x7D);
        v.lIIIlllIIIIlI[86] = 0x5F ^ 0x7F;
        v.lIIIlllIIIIlI[87] = -(0xFFFFF07F & 0x1FA9) & (0xFFFF9FEB & 0x7E7F);
        v.lIIIlllIIIIlI[88] = 0x44 ^ 0x7B ^ (0xAF ^ 0xB1);
    }

    private static boolean lIlIIIlllIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIlllIIllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIlllIIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    public v(SquireQuesterConfig squireQuesterConfig) {
        this.aN = lIIIlllIIIIlI[0];
        this.aO = lIIIlllIIIIlI[0];
        this.aP = lIIIlllIIIIlI[0];
        this.aQ = lIIIlllIIIIlI[0];
        this.aR = lIIIlllIIIIlI[0];
        this.aM = squireQuesterConfig;
    }

    private static boolean lIlIIIlllIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private void bv() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[64], lIIIlllIIIIlI[65], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[64], lIIIlllIIIIlI[65], lIIIlllIIIIlI[0]));
            0;
            0;
            if (((0x9F ^ 0xA8) & ~(0x75 ^ 0x42)) < ((0xAD ^ 0xA3) & ~(0x75 ^ 0x7B))) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[66]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var33;
        String string = chatMessage.getMessage();
        if (v.lIlIIIlllIIIlll(string.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[80]]) ? 1 : 0)) {
            this.aO = lIIIlllIIIIlI[2];
        }
        if (v.lIlIIIlllIIIlll(var33.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[81]]) ? 1 : 0)) {
            var9.aO = lIIIlllIIIIlI[2];
        }
        if (v.lIlIIIlllIIIlll(var33.contains(lIIIlllIIIIIl[lIIIlllIIIIlI[82]]) ? 1 : 0)) {
            var9.aR = lIIIlllIIIIlI[2];
        }
    }

    private void bn() {
        if (v.lIlIIIlllIIIlII(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.continueSpace();
            if (v.lIlIIIlllIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIIIlllIIIIlI[2]);
                0;
                return;
            }
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIlIIl(Players.getLocal().getWorldLocation().getRegionID(), lIIIlllIIIIlI[25])) {
            v var29;
            DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[24]];
            dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.CHAT_OPTION_TWO;
            dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.PLAYER_CONTINUE;
            var29.a(lIIIlllIIIIlI[26], new WorldPoint(lIIIlllIIIIlI[27], lIIIlllIIIIlI[28], lIIIlllIIIIlI[0]), dialogOptionArray);
            return;
        }
        int[] nArray2 = new int[lIIIlllIIIIlI[2]];
        nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIIlllIIIIlI[2]];
            nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            if (v.lIlIIIlllIIIlII(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                int[] nArray4 = new int[lIIIlllIIIIlI[2]];
                nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[30];
                TileItem var20 = TileItems.getNearest((int[])nArray4);
                if (v.lIlIIIlllIIlIII(var20) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var20) ? 1 : 0)) {
                    System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[18]]);
                    var20.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[19]]);
                    0;
                    if (-3 >= 0) {
                        return;
                    }
                } else {
                    Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[31], lIIIlllIIIIlI[32], lIIIlllIIIIlI[0]));
                    0;
                }
                return;
            }
        }
        int[] nArray5 = new int[lIIIlllIIIIlI[2]];
        nArray5[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (v.lIlIIIlllIIIlll(Equipment.contains((int[])nArray5) ? 1 : 0)) {
            int[] nArray6 = new int[lIIIlllIIIIlI[2]];
            nArray6[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            System.out.println(Equipment.contains((int[])nArray6));
            System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[1]]);
            int[] nArray7 = new int[lIIIlllIIIIlI[2]];
            nArray7[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[33];
            TileObject var20 = TileObjects.getNearest((int[])nArray7);
            if (v.lIlIIIlllIIlIII(var20) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var20) ? 1 : 0)) {
                var20.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[20]]);
                0;
                if (((0x91 ^ 0x95) & ~(0x33 ^ 0x37)) <= -1) {
                    return;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[34], lIIIlllIIIIlI[35], lIIIlllIIIIlI[0]));
                0;
            }
        }
        int[] nArray8 = new int[lIIIlllIIIIlI[2]];
        nArray8[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
        if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray8) ? 1 : 0)) {
            int[] nArray9 = new int[lIIIlllIIIIlI[2]];
            nArray9[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[29];
            Inventory.getFirst((int[])nArray9).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[21]]);
            return;
        }
    }

    private static boolean lIlIIIlllIIIllI(int n2) {
        return n2 > 0;
    }

    private void bm() {
        if (v.lIlIIIlllIIIlII(this.aR ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
        if (v.lIlIIIlllIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        DialogOption[] dialogOptionArray = new DialogOption[lIIIlllIIIIlI[17]];
        dialogOptionArray[v.lIIIlllIIIIlI[0]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[2]] = DialogOption.CHAT_OPTION_ONE;
        dialogOptionArray[v.lIIIlllIIIIlI[18]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[19]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[1]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[20]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[21]] = DialogOption.PLAYER_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[22]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[23]] = DialogOption.NPC_CONTINUE;
        dialogOptionArray[v.lIIIlllIIIIlI[24]] = DialogOption.CHAT_OPTION_ONE;
        this.a(lIIIlllIIIIlI[14], new WorldPoint(lIIIlllIIIIlI[15], lIIIlllIIIIlI[16], lIIIlllIIIIlI[0]), dialogOptionArray);
    }

    private void bp() {
        v var10;
        if (v.lIlIIIlllIIIlll(this.aR ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIIlII(var10.aN ? 1 : 0)) {
            return;
        }
        if (v.lIlIIIlllIIlIII(Widgets.get((int)lIIIlllIIIIlI[39], (int)lIIIlllIIIIlI[2]))) {
            if (v.lIlIIIlllIIIlll(Widgets.get((int)lIIIlllIIIIlI[39], (int)lIIIlllIIIIlI[2]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[23]]) ? 1 : 0)) {
                var10.aP = lIIIlllIIIIlI[2];
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[24]]);
            }
            if (v.lIlIIIlllIIIlll(Widgets.get((int)lIIIlllIIIIlI[39], (int)lIIIlllIIIIlI[2]).getText().equals(lIIIlllIIIIIl[lIIIlllIIIIlI[17]]) ? 1 : 0)) {
                var10.aQ = lIIIlllIIIIlI[2];
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[40]]);
            }
        }
        if (v.lIlIIIlllIIIlll(var10.aQ ? 1 : 0) && v.lIlIIIlllIIIlll(var10.aP ? 1 : 0)) {
            return;
        }
        int[] nArray = new int[lIIIlllIIIIlI[2]];
        nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[41];
        TileObject var23 = TileObjects.getNearest((int[])nArray);
        if (v.lIlIIIlllIIlIII(var23) && v.lIlIIIlllIIIlll(Reachable.isInteractable((Locatable)var23) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIlllIIIIlI[2]];
            nArray2[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
            if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIlllIIIIlI[2]];
                nArray3[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[13];
                Inventory.getFirst((int[])nArray3).useOn(var23);
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[42]]);
                return;
            }
            int[] nArray4 = new int[lIIIlllIIIIlI[2]];
            nArray4[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[43];
            if (v.lIlIIIlllIIIlll(Inventory.contains((int[])nArray4) ? 1 : 0) && v.lIlIIIlllIIIlll(var10.aP ? 1 : 0)) {
                System.out.println(lIIIlllIIIIIl[lIIIlllIIIIlI[44]]);
                var23.interact(lIIIlllIIIIIl[lIIIlllIIIIlI[45]]);
            }
        }
    }

    private void bu() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[61], lIIIlllIIIIlI[62], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[61], lIIIlllIIIIlI[62], lIIIlllIIIIlI[0]));
            0;
            0;
            if ((0xC1 ^ 0xB2 ^ (0x55 ^ 0x22)) > (0x99 ^ 0x81 ^ (0xAE ^ 0xB2))) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[63]]);
        }
    }

    private void bw() {
        if (v.lIlIIIlllIIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIIIIlI[67], lIIIlllIIIIlI[68], lIIIlllIIIIlI[0])))) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIlllIIIIlI[67], lIIIlllIIIIlI[68], lIIIlllIIIIlI[0]));
            0;
            0;
            if (2 < 0) {
                return;
            }
        } else {
            int[] nArray = new int[lIIIlllIIIIlI[2]];
            nArray[v.lIIIlllIIIIlI[0]] = lIIIlllIIIIlI[7];
            Inventory.getFirst((int[])nArray).interact(lIIIlllIIIIIl[lIIIlllIIIIlI[69]]);
        }
    }
}

