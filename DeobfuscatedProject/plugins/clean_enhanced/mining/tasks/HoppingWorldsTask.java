/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.World
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.game.Worlds
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import net.runelite.api.ChatMessageType;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping Worlds", priority=100, blocking=true, register=true)
public class HoppingWorldsTask
extends Task {

    private final  SquireMinerConfig P;
    private  int R;
    private  int Q;

    private static void var3() {
        var2 = new String[var1[4]];
        A.var2[A.var1[0]] = "Some ore is ready to be collected from the sack.";
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var6(int n2, int n3) {
        return n2 != n3;
    }

    private static void var7() {
        var1 = new int[5];
        A.var1[0] = (0x18 ^ 0x23 ^ (0xBC ^ 0xAF)) & (0xC ^ 0x2B ^ (0x82 ^ 0x8D) ^ -1);
        A.var1[1] = 0x3B ^ 0x48 ^ (0xC3 ^ 0xB5);
        A.var1[2] = 1 ^ 5;
        A.var1[3] = 0x4E ^ 0x49;
        A.var1[4] = 1;
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    private static boolean var9(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var11;
        if (A.var9(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var12 = var11.getMessage();
        if (A.var8(var12.contains(var2[var1[0]]) ? 1 : 0)) {
            return;
        }
        this.Q += var1[4];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        A var13;
        if (A.var8(this.P.hop() ? 1 : 0)) {
            return var1[0];
        }
        if (A.var10(var13.Q, var13.R)) {
            return var1[0];
        }
        int var14 = Worlds.getCurrentId();
        World var15 = Worlds.getRandom(world -> {
            int n3;
            if (A.var5(world.isNormal() ? 1 : 0) && A.var5(world.isMembers() ? 1 : 0) && A.var6(var14, world.getId())) {
                n3 = var1[4];
                0;
                if (3 <= 0) {
                    return ((0x59 ^ 0x79 ^ (0xB0 ^ 0xA3)) & (0x57 ^ 0x6E ^ (0x6A ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n3 = var1[0];
            }
            return n3 != 0;
        });
        if (A.var4(var15)) {
            return var1[0];
        }
        Worlds.hopTo((World)var2_2);
        this.Q = var1[0];
        this.R = Rand.nextInt((int)var1[2], (int)var1[3]);
        return var1[4];
    }

    @Inject
    public HoppingWorldsTask(SquireMinerConfig squireMinerConfig) {
        this.Q = var1[0];
        this.R = var1[1];
        this.P = squireMinerConfig;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var1[0];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var1[0];
        while (A.var10(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var19);
    }

    static {
        A.var7();
        A.var3();
    }
}

