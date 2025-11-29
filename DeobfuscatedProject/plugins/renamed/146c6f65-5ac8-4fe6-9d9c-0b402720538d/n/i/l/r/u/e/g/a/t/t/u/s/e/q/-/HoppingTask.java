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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import net.runelite.api.ChatMessageType;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

/* TASK: Hopping -> HoppingTask */
@TaskDesc(name="Hopping", blocking=true, priority=100, register=true)
public class HoppingTask
extends Task {
    private final /* synthetic */ GauntletConfig br;
    private static /* synthetic */ int[] llIlIIIlllII;
    private /* synthetic */ boolean bv;
    private /* synthetic */ int bu;
    private static /* synthetic */ String[] llIlIIIllIll;
    private final /* synthetic */ SquireGauntlet bs;
    private final /* synthetic */ c bt;

    private static boolean lIIIIIIlIlIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIIIIIIlIlIIlll() {
        llIlIIIlllII = new int[5];
        p.llIlIIIlllII[0] = -1;
        p.llIlIIIlllII[1] = (8 ^ 0x20 ^ (0x80 ^ 0x9C)) & (0xA3 ^ 0xAA ^ (0x5B ^ 0x66) ^ -1);
        p.llIlIIIlllII[2] = -(0xFFFFD275 & 0x7DAF) & (0xFFFFF3FF & Short.MAX_VALUE);
        p.llIlIIIlllII[3] = 1;
        p.llIlIIIlllII[4] = 2;
    }

    private static boolean lIIIIIIlIlIllll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIlIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIIlIlIIlIl(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var6 = var3.toCharArray();
        int var16 = llIlIIIlllII[1];
        char[] var10 = var2.toCharArray();
        int var15 = var10.length;
        int var17 = llIlIIIlllII[1];
        while (p.lIIIIIIlIlIllII(var17, var15)) {
            char var4 = var10[var17];
            var14.append((char)(var4 ^ var6[var16 % var6.length]));
            0;
            ++var16;
            ++var17;
            0;
            if (((0xEC ^ 0xB4 ^ (0xCD ^ 0xB8)) & (0x5D ^ 0x40 ^ (0x42 ^ 0x72) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIIIIIIlIllIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIIIIlIlIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    public boolean run() {
        p var5;
        if (!p.lIIIIIIlIlIlIII(this.bt.A() ? 1 : 0) || p.lIIIIIIlIlIlIIl(this.bs.isPaused() ? 1 : 0)) {
            return llIlIIIlllII[1];
        }
        if (p.lIIIIIIlIlIlIlI(Vars.getBit((int)llIlIIIlllII[2]), llIlIIIlllII[3])) {
            return llIlIIIlllII[1];
        }
        if (p.lIIIIIIlIlIlIll(var5.br.hopAfterKills()) && !p.lIIIIIIlIlIllII(var5.bs.m(), var5.br.hopAfterKills()) || p.lIIIIIIlIlIlIIl(var5.br.hopUntilEmpty() ? 1 : 0) && p.lIIIIIIlIlIllIl(Players.getAll().size(), llIlIIIlllII[3])) {
            if (p.lIIIIIIlIlIlIIl(var5.br.delayHopIfEmpty() ? 1 : 0) && p.lIIIIIIlIlIlllI(Players.getAll().size(), llIlIIIlllII[3])) {
                return llIlIIIlllII[1];
            }
            if (p.lIIIIIIlIlIlIII(Worlds.isHopperOpen() ? 1 : 0)) {
                Worlds.openHopper();
                return llIlIIIlllII[3];
            }
            World var7 = Worlds.getCurrentWorld();
            if (p.lIIIIIIlIlIllll(var7)) {
                return llIlIIIlllII[3];
            }
            if (p.lIIIIIIlIlIlIlI(var5.bu, llIlIIIlllII[0]) && p.lIIIIIIlIlIlIlI(var5.bu, var7.getId())) {
                var5.bu = llIlIIIlllII[0];
                var5.bs.b(llIlIIIlllII[1]);
                return llIlIIIlllII[1];
            }
            int var8 = Static.getClient().getTotalLevel();
            World var11 = Worlds.getRandom(world2 -> {
                int n3;
                if (p.lIIIIIIlIlIlIlI(world2.getId(), var7.getId()) && p.lIIIIIIlIlIlIIl(world2.isMembers() ? 1 : 0) && p.lIIIIIIlIllIIIl(world2.getLocation(), var7.getLocation()) && p.lIIIIIIlIlIlIII(world2.isAllPkWorld() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isPvpArena() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isLeague() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isTournament() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isQuestSpeedRun() ? 1 : 0) && (!p.lIIIIIIlIlIlIIl(world2.isSkillTotal() ? 1 : 0) || p.lIIIIIIlIlIllII(Integer.parseInt(world2.getActivity().substring(llIlIIIlllII[1], world2.getActivity().indexOf(llIlIIIllIll[llIlIIIlllII[3]]))), var8))) {
                    n3 = llIlIIIlllII[3];
                    0;
                    
                    }
                } else {
                    n3 = llIlIIIlllII[1];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)var11);
            var5.bu = var7.getId();
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

    private static String lIIIIIIlIlIIlII(String var13, String var18) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(llIlIIIlllII[4], var12);
            return new String(var1.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIlIlIll(int n2) {
        return n2 > 0;
    }

    @Inject
    public p(GauntletConfig gauntletConfig, SquireGauntlet squireGauntlet, c c2) {
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
        void var9;
        if (p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.SPAM) && p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.CONSOLE) && p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.ENGINE)) {
            return;
        }
        if (p.lIIIIIIlIlIlIIl(var9.getMessage().contains(llIlIIIllIll[llIlIIIlllII[1]]) ? 1 : 0)) {
            lllllllllllllllIlIIIllIIIllIIlIl.bu = llIlIIIlllII[0];
        }
    }

    private static boolean lIIIIIIlIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIIIlIlIIllI() {
        llIlIIIllIll = new String[llIlIIIlllII[4]];
        p.llIlIIIllIll[p.llIlIIIlllII[1]] = p."10 seconds";
        p.llIlIIIllIll[p.llIlIIIlllII[3]] = p." ";
    }
}

