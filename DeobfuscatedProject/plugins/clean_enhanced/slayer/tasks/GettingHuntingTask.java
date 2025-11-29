/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.slayer.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import gg.squire.slayer.tasks.GameEnum2;

@TaskDesc(name="Getting Hunting Task", priority=10, register=true, blocking=true)
public class GettingHuntingTask
extends Task {
    private final  SquireSkipperPlugin E;
    private final  SquireSkipperConfig D;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (j.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (2 != -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public GettingHuntingTask(SquireSkipperConfig squireSkipperConfig, SquireSkipperPlugin squireSkipperPlugin) {
        this.D = squireSkipperConfig;
        this.E = squireSkipperPlugin;
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var27(int n2) {
        return n2 == 0;
    }

    private static void var28() {
        var1 = new int[9];
        j.var1[0] = (12 + 139 - -30 + 0 ^ 81 + 92 - 117 + 98) & (114 + 60 - 142 + 97 ^ 125 + 114 - 170 + 105 ^ -1);
        j.var1[1] = 1;
        j.var1[2] = 0x51 ^ 0x55;
        j.var1[3] = 2;
        j.var1[4] = 3;
        j.var1[5] = 91 + 46 - 45 + 56 ^ 101 + 82 - 91 + 53;
        j.var1[6] = 0x61 ^ 0x67;
        j.var1[7] = 24 + 83 - 66 + 101 ^ 70 + 120 - 90 + 37;
        j.var1[8] = (0x1D ^ 0xF) & ~(0x67 ^ 0x75) ^ (0x27 ^ 0x2F);
    }

    /*
     * WARNING - void declaration
     */
    public boolean GettingHuntingTask(String string) {
        String string2 = this.D.huntTaskName();
        if (j.var14(string2.contains(var2[var1[4]]) ? 1 : 0)) {
            void var29;
            String[] stringArray;
            String[] stringArray2 = stringArray = string2.split(var2[var1[2]]);
            int n2 = stringArray2.length;
            int var30 = var1[0];
            while (j.var12(var30, (int)var29)) {
                void var31;
                void var32;
                void var33 = var32[var30];
                if (j.var14(var31.toLowerCase().contains(var33.trim().toLowerCase()) ? 1 : 0)) {
                    return var1[1];
                }
                ++var30;
                0;
                if (-2 <= 0) continue;
                return ((0xF0 ^ 0x83 ^ (0x60 ^ 0x73)) & (159 + 134 - 154 + 27 ^ 13 + 131 - 10 + 64 ^ -1)) != 0;
            }
        }
        return string.toLowerCase().contains(string2.trim().toLowerCase());
    }

    private static boolean var34(Object object) {
        return object == null;
    }

    static {
        j.var28();
        j.var35();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        j var36;
        void var37;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (j.var38(chatMessageType, ChatMessageType.GAMEMESSAGE) && j.var38(chatMessageType, ChatMessageType.SPAM)) {
            return;
        }
        String var39 = Text.removeTags((String)var37.getMessage());
        Log.info((String)("Actual message: " + var39));
        if (j.var14(var39.contains(var2[var1[5]]) ? 1 : 0)) {
            var36.E.a(var1[1]);
            var36.E.b(var1[1]);
        }
        if (j.var14(var36.GettingHuntingTask(var39) ? 1 : 0)) {
            Log.info((String)var2[var1[6]]);
            var36.E.forceStop();
        }
    }

    private static void var35() {
        var2 = new String[var1[8]];
        j.var2[j.var1[0]] = "Stopping, found the hunted task!";
        j.var2[j.var1[1]] = "Cant find hunting master";
        j.var2[j.var1[3]] = "Assignment";
        j.var2[j.var1[4]] = ",";
        j.var2[j.var1[2]] = ",";
        j.var2[j.var1[5]] = "Contact a Slayer Master to decide";
        j.var2[j.var1[6]] = "Stopping, found the hunted task!";
        j.var2[j.var1[7]] = "Assignment";
    }

    private static boolean var38(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        j var40;
        if (j.var27(this.D.huntTask() ? 1 : 0)) {
            return var1[0];
        }
        if (j.var41((Object)var40.E.b()) && j.var14(var40.GettingHuntingTask(var40.E.b().m()) ? 1 : 0)) {
            Log.info((String)var2[var1[0]]);
            var40.E.forceStop();
            return var1[1];
        }
        if (j.var14(var40.E.d() ? 1 : 0)) {
            return var1[0];
        }
        if (j.var27(var40.E.c() ? 1 : 0)) {
            return var1[0];
        }
        a var42 = var40.D.taskMaster();
        if (j.var12(var42.k().distanceTo((Locatable)Players.getLocal()), var1[2])) {
            NPC var43 = NPCs.getNearest(nPC -> {
                String[] stringArray = new String[var1[1]];
                stringArray[j.var1[0]] = var2[var1[7]];
                return nPC.hasAction(stringArray);
            });
            if (j.var34(var43)) {
                Log.info((String)var2[var1[1]]);
                return var1[0];
            }
            var43.interact(var2[var1[3]]);
            var40.sleep(var1[3]);
            return var1[1];
        }
        if (j.var14(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var42.k());
            0;
        }
        return var1[1];
    }

    private static boolean var41(Object object) {
        return object != null;
    }
}

