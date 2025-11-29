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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lIIIIIIlIlIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIIlIlIllll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIlIlIllII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIIIIlIllIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIIIIlIlIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    public boolean run() {
        p var2;
        if (!p.lIIIIIIlIlIlIII(this.bt.A() ? 1 : 0) || p.lIIIIIIlIlIlIIl(this.bs.isPaused() ? 1 : 0)) {
            return llIlIIIlllII[1];
        }
        if (p.lIIIIIIlIlIlIlI(Vars.getBit((int)llIlIIIlllII[2]), llIlIIIlllII[3])) {
            return llIlIIIlllII[1];
        }
        if (p.lIIIIIIlIlIlIll(var2.br.hopAfterKills()) && !p.lIIIIIIlIlIllII(var2.bs.m(), var2.br.hopAfterKills()) || p.lIIIIIIlIlIlIIl(var2.br.hopUntilEmpty() ? 1 : 0) && p.lIIIIIIlIlIllIl(Players.getAll().size(), llIlIIIlllII[3])) {
            if (p.lIIIIIIlIlIlIIl(var2.br.delayHopIfEmpty() ? 1 : 0) && p.lIIIIIIlIlIlllI(Players.getAll().size(), llIlIIIlllII[3])) {
                return llIlIIIlllII[1];
            }
            if (p.lIIIIIIlIlIlIII(Worlds.isHopperOpen() ? 1 : 0)) {
                Worlds.openHopper();
                return llIlIIIlllII[3];
            }
            World var3 = Worlds.getCurrentWorld();
            if (p.lIIIIIIlIlIllll(var3)) {
                return llIlIIIlllII[3];
            }
            if (p.lIIIIIIlIlIlIlI(var2.bu, llIlIIIlllII[0]) && p.lIIIIIIlIlIlIlI(var2.bu, var3.getId())) {
                var2.bu = llIlIIIlllII[0];
                var2.bs.b(llIlIIIlllII[1]);
                return llIlIIIlllII[1];
            }
            int var4 = Static.getClient().getTotalLevel();
            World var5 = Worlds.getRandom(world2 -> {
                int n3;
                if (p.lIIIIIIlIlIlIlI(world2.getId(), var3.getId()) && p.lIIIIIIlIlIlIIl(world2.isMembers() ? 1 : 0) && p.lIIIIIIlIllIIIl(world2.getLocation(), var3.getLocation()) && p.lIIIIIIlIlIlIII(world2.isAllPkWorld() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isPvpArena() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isLeague() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isTournament() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isQuestSpeedRun() ? 1 : 0) && (!p.lIIIIIIlIlIlIIl(world2.isSkillTotal() ? 1 : 0) || p.lIIIIIIlIlIllII(Integer.parseInt(world2.getActivity().substring(llIlIIIlllII[1], world2.getActivity().indexOf(llIlIIIllIll[llIlIIIlllII[3]]))), var4))) {
                    n3 = llIlIIIlllII[3];

                    }
                } else {
                    n3 = llIlIIIlllII[1];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)var5);
            var2.bu = var3.getId();
            return llIlIIIlllII[3];
        }
        return llIlIIIlllII[1];
    }

    private static boolean lIIIIIIlIlIlIII(int n2) {
        return n2 == 0;
    }

    static {
        p.lIIIIIIlIlIIlll();
        p.lIIIIIIlIlIIllI();
    }

    private static boolean lIIIIIIlIlIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIlIlIllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIIIlIlIlIll(int n2) {
        return n2 > 0;
    }

    @Inject
    public HoppingTask(GauntletConfig gauntletConfig, SquireGauntlet squireGauntlet, c c2) {
        this.bu = llIlIIIlllII[0];
        this.br = gauntletConfig;
        this.bs = squireGauntlet;
        this.bt = c2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var6;
        if (p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.SPAM) && p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.CONSOLE) && p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.ENGINE)) {
            return;
        }
        if (p.lIIIIIIlIlIlIIl(var6.getMessage().contains(llIlIIIllIll[llIlIIIlllII[1]]) ? 1 : 0)) {
            var7.bu = llIlIIIlllII[0];
        }
    }

    private static boolean lIIIIIIlIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIIIlIlIIllI() {
        llIlIIIllIll = new String[llIlIIIlllII[4]];
        p.llIlIIIllIll[p.llIlIIIlllII[1]] = "10 seconds";
        p.llIlIIIllIll[p.llIlIIIlllII[3]] = " ";
    }
}

