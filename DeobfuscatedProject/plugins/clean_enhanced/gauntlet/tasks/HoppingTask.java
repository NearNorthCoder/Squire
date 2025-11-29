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
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.gauntlet.GauntletConfig;
import gg.squire.plugins.gauntlet.SquireGauntlet;
import gg.squire.gauntlet.tasks.GauntletManager;
import net.runelite.api.ChatMessageType;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

@TaskDesc(name="Hopping", blocking=true, priority=100, register=true)
public class HoppingTask
extends Task {
    private final  GauntletConfig br;
    
    private  boolean bv;
    private  int bu;
    
    private final  SquireGauntlet bs;
    private final  c bt;

    private static boolean var3(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var4() {
        var1 = new int[5];
        p.var1[0] = -1;
        p.var1[1] = (8 ^ 0x20 ^ (0x80 ^ 0x9C)) & (0xA3 ^ 0xAA ^ (0x5B ^ 0x66) ^ -1);
        p.var1[2] = -(0xFFFFD275 & 0x7DAF) & (0xFFFFF3FF & Short.MAX_VALUE);
        p.var1[3] = 1;
        p.var1[4] = 2;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[1];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[1];
        while (p.var6(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (((0xEC ^ 0xB4 ^ (0xCD ^ 0xB8)) & (0x5D ^ 0x40 ^ (0x42 ^ 0x72) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean var17(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var18(int n2, int n3) {
        return n2 != n3;
    }

    public boolean run() {
        p var19;
        if (!p.var20(this.bt.A() ? 1 : 0) || p.var21(this.bs.isPaused() ? 1 : 0)) {
            return var1[1];
        }
        if (p.var18(Vars.getBit((int)var1[2]), var1[3])) {
            return var1[1];
        }
        if (p.var22(var19.br.hopAfterKills()) && !p.var6(var19.bs.m(), var19.br.hopAfterKills()) || p.var21(var19.br.hopUntilEmpty() ? 1 : 0) && p.var23(Players.getAll().size(), var1[3])) {
            if (p.var21(var19.br.delayHopIfEmpty() ? 1 : 0) && p.var3(Players.getAll().size(), var1[3])) {
                return var1[1];
            }
            if (p.var20(Worlds.isHopperOpen() ? 1 : 0)) {
                Worlds.openHopper();
                return var1[3];
            }
            World var24 = Worlds.getCurrentWorld();
            if (p.var5(var24)) {
                return var1[3];
            }
            if (p.var18(var19.bu, var1[0]) && p.var18(var19.bu, var24.getId())) {
                var19.bu = var1[0];
                var19.bs.b(var1[1]);
                return var1[1];
            }
            int var25 = Static.getClient().getTotalLevel();
            World var26 = Worlds.getRandom(world2 -> {
                int n3;
                if (p.var18(world2.getId(), var24.getId()) && p.var21(world2.isMembers() ? 1 : 0) && p.var27(world2.getLocation(), var24.getLocation()) && p.var20(world2.isAllPkWorld() ? 1 : 0) && p.var20(world2.isPvpArena() ? 1 : 0) && p.var20(world2.isLeague() ? 1 : 0) && p.var20(world2.isTournament() ? 1 : 0) && p.var20(world2.isQuestSpeedRun() ? 1 : 0) && (!p.var21(world2.isSkillTotal() ? 1 : 0) || p.var6(Integer.parseInt(world2.getActivity().substring(var1[1], world2.getActivity().indexOf(var2[var1[3]]))), var25))) {
                    n3 = var1[3];
                    0;
                    if null != null {
                        return ((174 + 51 - 29 + 23 ^ 128 + 62 - 91 + 32) & (0x27 ^ 0xC ^ (0xB4 ^ 0xC7) ^ -1)) != 0;
                    }
                } else {
                    n3 = var1[1];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)var26);
            var19.bu = var24.getId();
            return var1[3];
        }
        return var1[1];
    }

    private static boolean var20(int n2) {
        return n2 == 0;
    }

    static {
        p.var4();
        p.var28();
    }

    private static boolean var21(int n2) {
        return n2 != 0;
    }

    private static boolean var23(int n2, int n3) {
        return n2 > n3;
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static boolean var22(int n2) {
        return n2 > 0;
    }

    @Inject
    public HoppingTask(GauntletConfig gauntletConfig, SquireGauntlet squireGauntlet, c c2) {
        this.bu = var1[0];
        this.br = gauntletConfig;
        this.bs = squireGauntlet;
        this.bt = c2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var35;
        if (p.var17(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && p.var17(chatMessage.getType(), ChatMessageType.SPAM) && p.var17(chatMessage.getType(), ChatMessageType.CONSOLE) && p.var17(chatMessage.getType(), ChatMessageType.ENGINE)) {
            return;
        }
        if (p.var21(var35.getMessage().contains(var2[var1[1]]) ? 1 : 0)) {
            var36.bu = var1[0];
        }
    }

    private static boolean var27(int n2, int n3) {
        return n2 == n3;
    }

    private static void var28() {
        var2 = new String[var1[4]];
        p.var2[p.var1[1]] = "10 seconds";
        p.var2[p.var1[3]] = " ";
    }
}

