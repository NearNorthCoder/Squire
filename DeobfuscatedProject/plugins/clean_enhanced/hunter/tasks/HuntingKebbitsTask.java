/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.hunter.tasks.GameEnum6;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

@TaskDesc(name="Hunting kebbits", register=true)
public class HuntingKebbitsTask
extends HunterTaskBase {
    
    private static final  RectangularArea B;
    private static final  WorldPoint C;
    private  boolean D;
    
    private  int F;
    private  int E;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public HuntingKebbitsTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.FALCONRY);
        this.E = var1[0];
        this.F = var1[1];
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    private boolean C() {
        if (o.var10(Dialog.getText()) && o.var11(Dialog.getText().contains(var2[var1[9]]) ? 1 : 0)) {
            this.D = var1[2];
            return var1[3];
        }
        if (o.var11(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return var1[3];
        }
        if (o.var11(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption(string -> string.contains(var2[var1[13]]));
            0;
            return var1[3];
        }
        String[] stringArray = new String[var1[3]];
        stringArray[o.var1[2]] = var2[var1[10]];
        NPC var12 = NPCs.getNearest((String[])stringArray);
        if (o.var10(var12)) {
            var12.interact(var2[var1[11]]);
            return var1[3];
        }
        if (o.var9(C.distanceTo((Locatable)Players.getLocal()), var1[7])) {
            Movement.walkTo((WorldPoint)C);
            0;
            return var1[3];
        }
        return var1[3];
    }

    @Override
    protected boolean x() {
        NPC var13;
        List var14;
        o var15;
        if (o.var16((Object)this.z().method(), (Object)e.FALCONRY)) {
            return var1[2];
        }
        if (o.var11(var15.D)) {
            return var15.C();
        }
        if (o.var11(var15.B() ? 1 : 0)) {
            return var1[3];
        }
        if (o.var11(var15.z().buryBones() ? 1 : 0)) {
            String[] stringArray = new String[var1[3]];
            stringArray[o.var1[2]] = var2[var1[2]];
            var14 = Inventory.getFirst((String[])stringArray);
            if (o.var10(var14)) {
                var14.interact(var2[var1[3]]);
            }
        }
        var14 = Inventory.getAll(item -> item.getName().contains(var2[var1[15]]));
        if (o.var17(var15.z().buryBones() ? 1 : 0)) {
            String[] stringArray = new String[var1[3]];
            stringArray[o.var1[2]] = var2[var1[1]];
            var14.addAll(Inventory.getAll((String[])stringArray));
            0;
        }
        if (o.var9(var14.size(), var15.F)) {
            var15.F = Rand.nextInt((int)var1[3], (int)var1[4]);
            var14.forEach(item -> item.interact(var2[var1[14]]));
        }
        if (o.var10(var13 = Static.getClient().getHintArrowNpc())) {
            String[] stringArray = new String[var1[3]];
            stringArray[o.var1[2]] = var2[var1[5]];
            if (o.var11(var13.hasAction(stringArray) ? 1 : 0)) {
                var13.interact(var2[var1[6]]);
                return var1[3];
            }
        }
        if (o.var9(B.getCenter().distanceTo((Locatable)Players.getLocal()), var1[7])) {
            Movement.setDestination((WorldPoint)B.getCenter());
            return var1[3];
        }
        NPC var18 = h.s();
        if (o.var10(var18)) {
            var18.interact(var2[var1[4]]);
            return var1[3];
        }
        return var1[3];
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private boolean B() {
        if (o.var17(Movement.isRunEnabled() ? 1 : 0) && o.var9(Movement.getRunEnergy(), this.E)) {
            this.E = Rand.nextInt((int)var1[4], (int)var1[8]);
            Movement.toggleRun();
            return var1[3];
        }
        return var1[2];
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var1[2];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var1[2];
        while (o.var28(var27, var26)) {
            char var29 = var25[var27];
            var22.append((char)(var29 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if ((0x3D ^ 0x39) > 3) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    private static boolean var28(int n2, int n3) {
        return n2 < n3;
    }

    private static void var30() {
        var1 = new int[23];
        o.var1[0] = 0x69 ^ 0x7D;
        o.var1[1] = 2;
        o.var1[2] = (0xAF ^ 0xA4) & ~(0xD ^ 6);
        o.var1[3] = 1;
        o.var1[4] = 0x80 ^ 0x85;
        o.var1[5] = 3;
        o.var1[6] = 6 + 181 - 111 + 119 ^ 75 + 170 - 71 + 25;
        o.var1[7] = 0xDF ^ 0x9F ^ (0xDF ^ 0x95);
        o.var1[8] = 0x3C ^ 0x25;
        o.var1[9] = 0x3C ^ 0x3A;
        o.var1[10] = 0x42 ^ 0x45;
        o.var1[11] = 0x6E ^ 0x66;
        o.var1[12] = 13 + 38 - -150 + 4 ^ 124 + 33 - 61 + 100;
        o.var1[13] = 0x94 ^ 0x9F;
        o.var1[14] = 0x29 ^ 0x11 ^ (0x85 ^ 0xB1);
        o.var1[15] = 0x89 ^ 0x84;
        o.var1[16] = 0xFFFF897E & 0x7FBF;
        o.var1[17] = -(0xFFFFC175 & Short.MAX_VALUE) & (0xFFFFCFFF & 0x7F7E);
        o.var1[18] = 0xFFFFBBE6 & 0x4D5F;
        o.var1[19] = -(0xFFFFFDD7 & 0x73BF) & (0xFFFFFFF7 & 0x7F9F);
        o.var1[20] = -(0xFFFFA37F & 0x5EBB) & (0xFFFFAB7F & 0x5FFF);
        o.var1[21] = -(0xFFFFF1BB & 0x2E6E) & (0xFFFFEE7B & 0x3FBF);
        o.var1[22] = 62 + 41 - 62 + 96 ^ 55 + 132 - 167 + 115;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var31;
        if (o.var16(chatMessage.getType(), ChatMessageType.PUBLICCHAT) && o.var11(chatMessage.getMessage().contains(var2[var1[12]]) ? 1 : 0)) {
            this.D = var1[3];
        }
        if (o.var16(var31.getType(), ChatMessageType.PUBLICCHAT) && o.var11(var31.getMessage().contains(var2[var1[7]]) ? 1 : 0)) {
            var32.D = var1[3];
        }
    }

    private static void var33() {
        var2 = new String[var1[22]];
        o.var2[o.var1[2]] = "Bones";
        o.var2[o.var1[3]] = "Bury";
        o.var2[o.var1[1]] = "Bones";
        o.var2[o.var1[5]] = "Retrieve";
        o.var2[o.var1[6]] = "Retrieve";
        o.var2[o.var1[4]] = "Catch";
        o.var2[o.var1[9]] = "Right, try to be a bit more careful";
        o.var2[o.var1[10]] = "Matthias";
        o.var2[o.var1[11]] = "Talk-to";
        o.var2[o.var1[12]] = "Your falcon has left";
        o.var2[o.var1[7]] = "You try to catch the creature but it is too quick for you";
        o.var2[o.var1[13]] = "Yes, please";
        o.var2[o.var1[14]] = "Drop";
        o.var2[o.var1[15]] = "fur";
    }

    private static boolean var16(Object object, Object object2) {
        return object != object2;
    }

    static {
        o.var30();
        o.var33();
        B = new RectangularArea(new WorldPoint(var1[16], var1[17], var1[2]), new WorldPoint(var1[18], var1[19], var1[2]));
        C = new WorldPoint(var1[20], var1[21], var1[2]);
    }

        catch (Exception var39) {
            var39.printStackTrace();
            return null;
        }
    }
}

