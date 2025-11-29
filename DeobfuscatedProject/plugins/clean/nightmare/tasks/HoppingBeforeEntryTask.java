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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lIIlIIIIIlIIlll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        Player player = Players.getLocal();
        int n2 = player.getWorldLocation().getRegionID();
        if (aB.lIIlIIIIIlIIlll(this.cV.bankLocation().bJ(), n2)) {
            return;
        }
        if (aB.lIIlIIIIIlIlIII(var1.getType(), ChatMessageType.PUBLICCHAT)) {
            return;
        }
        this.eK = llllIlIIIIIl[3];
    }

    private static boolean lIIlIIIIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIIlIlIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIIIIlIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        aB.lIIlIIIIIlIIIll();
        aB.lIIlIIIIIIlllll();
        eJ = LoggerFactory.getLogger(HoppingBeforeEntryTask.class);
    }

    private static boolean lIIlIIIIIlIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected HoppingBeforeEntryTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.eK = llllIlIIIIIl[0];
    }

    private static boolean lIIlIIIIIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIIlIIIIIIlllll() {
        llllIIlllllI = new String[llllIlIIIIIl[5]];
        aB.llllIIlllllI[aB.llllIlIIIIIl[0]] = "[HopTask]: Tick count is less than 15, resetting variable.";
        aB.llllIIlllllI[aB.llllIlIIIIIl[3]] = " ";
    }

    @Override
    public boolean bY() {
        aB var2;
        if (aB.lIIlIIIIIlIIlII(this.cW.ad() ? 1 : 0)) {
            return llllIlIIIIIl[0];
        }
        if (aB.lIIlIIIIIlIIlII(var2.eK ? 1 : 0) && aB.lIIlIIIIIlIIlIl(Static.getClient().getTickCount(), llllIlIIIIIl[1])) {
            Log.info((String)llllIIlllllI[llllIlIIIIIl[0]]);
            var2.eK = llllIlIIIIIl[0];
        }
        if (aB.lIIlIIIIIlIIlII(Bank.isOpen() ? 1 : 0)) {
            return llllIlIIIIIl[0];
        }
        if (aB.lIIlIIIIIlIIlII(GrandExchange.isOpen() ? 1 : 0)) {
            return llllIlIIIIIl[0];
        }
        World var3 = Worlds.getCurrentWorld();
        var2.cW.a(var3);
        if (aB.lIIlIIIIIlIIlII(var2.cV.hopAfterExit() ? 1 : 0)) {
            if (aB.lIIlIIIIIlIIlII(var2.cV.adaptiveHopAfterTeleport() ? 1 : 0) && aB.lIIlIIIIIlIIllI(var2.eK ? 1 : 0)) {
                return llllIlIIIIIl[0];
            }
            if ((!aB.lIIlIIIIIlIIlll(var2.cW.ah(), llllIlIIIIIl[2]) || aB.lIIlIIIIIlIIlll(var2.cW.ah(), Worlds.getCurrentWorld().getId())) && aB.lIIlIIIIIlIIlII(var2.cW.ap ? 1 : 0) && aB.lIIlIIIIIlIIllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && aB.lIIlIIIIIlIIlll(var2.cW.ah(), var3.getId())) {
                if (aB.lIIlIIIIIlIIllI(Worlds.isHopperOpen() ? 1 : 0)) {
                    Worlds.openHopper();
                    return llllIlIIIIIl[3];
                }
                int var4 = Static.getClient().getTotalLevel();
                World var5 = Worlds.getRandom(world2 -> {
                    int n3;
                    if (aB.lIIlIIIIIlIIlll(world2.getId(), var3.getId()) && aB.lIIlIIIIIlIIlII(world2.isMembers() ? 1 : 0) && aB.lIIlIIIIIlIlIIl(world2.getLocation(), var3.getLocation()) && aB.lIIlIIIIIlIIllI(world2.isAllPkWorld() ? 1 : 0) && aB.lIIlIIIIIlIIllI(world2.isPvpArena() ? 1 : 0) && aB.lIIlIIIIIlIIllI(world2.isLeague() ? 1 : 0) && aB.lIIlIIIIIlIIllI(world2.isTournament() ? 1 : 0) && aB.lIIlIIIIIlIlIlI(world2.getPlayerCount(), llllIlIIIIIl[4]) && aB.lIIlIIIIIlIIllI(world2.isQuestSpeedRun() ? 1 : 0) && (!aB.lIIlIIIIIlIIlII(world2.isSkillTotal() ? 1 : 0) || aB.lIIlIIIIIlIIlIl(Integer.parseInt(world2.getActivity().substring(llllIlIIIIIl[0], world2.getActivity().indexOf(llllIIlllllI[llllIlIIIIIl[3]]))), var4))) {
                        n3 = llllIlIIIIIl[3];

                        if ((0x47 ^ 0x43) <= 3) {
                            return false;
                        }
                    } else {
                        n3 = llllIlIIIIIl[0];
                    }
                    return n3 != 0;
                });
                var2.cW.j(var5.getId());
                var2.cW.ap = llllIlIIIIIl[0];
                Worlds.hopTo((World)var5);
                return llllIlIIIIIl[3];
            }
        }
        return llllIlIIIIIl[0];
    }
}

