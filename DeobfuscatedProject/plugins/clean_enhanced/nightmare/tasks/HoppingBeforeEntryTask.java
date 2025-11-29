/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Hopping before entry!", priority=0x7FFFFFFF, blocking=true, register=true)
public class HoppingBeforeEntryTask
extends NightmareTaskBase {
    private static final  Logger eJ;

    private  boolean eK;

    private static boolean var3(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var4;
        Player player = Players.getLocal();
        int n2 = player.getWorldLocation().getRegionID();
        if (aB.var3(this.cV.bankLocation().bJ(), n2)) {
            return;
        }
        if (aB.var5(var4.getType(), ChatMessageType.PUBLICCHAT)) {
            return;
        }
        this.eK = var2[3];
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }

    private static void var14() {
        var2 = new int[7];
        aB.var2[0] = (0xEA ^ 0xA1 ^ (0x4F ^ 0x1E)) & (17 + 67 - 54 + 157 ^ 147 + 116 - 108 + 6 ^ -1);
        aB.var2[1] = 131 + 60 - 186 + 143 ^ 142 + 107 - 107 + 13;
        aB.var2[2] = -1;
        aB.var2[3] = 1;
        aB.var2[4] = -(0xFFFFCBD9 & 0x7CB7) & (0xFFFFDFFC & 0x6FFF);
        aB.var2[5] = 2;
        aB.var2[6] = 0x4B ^ 0x43;
    }

    private static boolean var15(int n2, int n3) {
        return n2 == n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    static {
        aB.var14();
        aB.var22();
        eJ = LoggerFactory.getLogger(HoppingBeforeEntryTask.class);
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    @Inject
    protected HoppingBeforeEntryTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.eK = var2[0];
    }

    private static boolean var24(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var22() {
        var1 = new String[var2[5]];
        aB.var1[aB.var2[0]] = "[HopTask]: Tick count is less than 15, resetting variable.";
        aB.var1[aB.var2[3]] = " ";
    }

    @Override
    public boolean bY() {
        aB var25;
        if (aB.var6(this.cW.ad() ? 1 : 0)) {
            return var2[0];
        }
        if (aB.var6(var25.eK) && aB.var13(Static.getClient().getTickCount(), var2[1])) {
            Log.info((String)var1[var2[0]]);
            var25.eK = var2[0];
        }
        if (aB.var6(Bank.isOpen() ? 1 : 0)) {
            return var2[0];
        }
        if (aB.var6(GrandExchange.isOpen() ? 1 : 0)) {
            return var2[0];
        }
        World var26 = Worlds.getCurrentWorld();
        var25.cW.a(var26);
        if (aB.var6(var25.cV.hopAfterExit() ? 1 : 0)) {
            if (aB.var6(var25.cV.adaptiveHopAfterTeleport() ? 1 : 0) && aB.var23(var25.eK)) {
                return var2[0];
            }
            if ((!aB.var3(var25.cW.ah(), var2[2]) || aB.var3(var25.cW.ah(), Worlds.getCurrentWorld().getId())) && aB.var6(var25.cW.ap) && aB.var23(Static.getClient().isInInstancedRegion() ? 1 : 0) && aB.var3(var25.cW.ah(), var26.getId())) {
                if (aB.var23(Worlds.isHopperOpen() ? 1 : 0)) {
                    Worlds.openHopper();
                    return var2[3];
                }
                int var27 = Static.getClient().getTotalLevel();
                World var28 = Worlds.getRandom(world2 -> {
                    int n3;
                    if (aB.var3(world2.getId(), var26.getId()) && aB.var6(world2.isMembers() ? 1 : 0) && aB.var15(world2.getLocation(), var26.getLocation()) && aB.var23(world2.isAllPkWorld() ? 1 : 0) && aB.var23(world2.isPvpArena() ? 1 : 0) && aB.var23(world2.isLeague() ? 1 : 0) && aB.var23(world2.isTournament() ? 1 : 0) && aB.var24(world2.getPlayerCount(), var2[4]) && aB.var23(world2.isQuestSpeedRun() ? 1 : 0) && (!aB.var6(world2.isSkillTotal() ? 1 : 0) || aB.var13(Integer.parseInt(world2.getActivity().substring(var2[0], world2.getActivity().indexOf(var1[var2[3]]))), var27))) {
                        n3 = var2[3];
                        0;
                        if ((0x47 ^ 0x43) <= 3) {
                            return ((0xE0 ^ 0x80) & ~(0x42 ^ 0x22)) != 0;
                        }
                    } else {
                        n3 = var2[0];
                    }
                    return n3 != 0;
                });
                var25.cW.j(var28.getId());
                var25.cW.ap = var2[0];
                Worlds.hopTo((World)var28);
                return var2[3];
            }
        }
        return var2[0];
    }
}

