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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import net.runelite.api.ChatMessageType;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;

@TaskDesc(name="Hopping", blocking=true, priority=100, register=true)
public class p
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
        p.llIlIIIlllII[0] = -" ".length();
        p.llIlIIIlllII[1] = (8 ^ 0x20 ^ (0x80 ^ 0x9C)) & (0xA3 ^ 0xAA ^ (0x5B ^ 0x66) ^ -" ".length());
        p.llIlIIIlllII[2] = -(0xFFFFD275 & 0x7DAF) & (0xFFFFF3FF & Short.MAX_VALUE);
        p.llIlIIIlllII[3] = " ".length();
        p.llIlIIIlllII[4] = "  ".length();
    }

    private static boolean lIIIIIIlIlIllll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIlIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIIIIlIlIIlIl(String lllllllllllllllIlIIIllIIIlIIIIIl, String lllllllllllllllIlIIIllIIIlIIIIII) {
        lllllllllllllllIlIIIllIIIlIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllIIIlIIIlII = new StringBuilder();
        char[] lllllllllllllllIlIIIllIIIlIIIIll = lllllllllllllllIlIIIllIIIlIIIIII.toCharArray();
        int lllllllllllllllIlIIIllIIIlIIIIlI = llIlIIIlllII[1];
        char[] lllllllllllllllIlIIIllIIIIllllII = lllllllllllllllIlIIIllIIIlIIIIIl.toCharArray();
        int lllllllllllllllIlIIIllIIIIlllIll = lllllllllllllllIlIIIllIIIIllllII.length;
        int lllllllllllllllIlIIIllIIIIlllIlI = llIlIIIlllII[1];
        while (p.lIIIIIIlIlIllII(lllllllllllllllIlIIIllIIIIlllIlI, lllllllllllllllIlIIIllIIIIlllIll)) {
            char lllllllllllllllIlIIIllIIIlIIIlll = lllllllllllllllIlIIIllIIIIllllII[lllllllllllllllIlIIIllIIIIlllIlI];
            lllllllllllllllIlIIIllIIIlIIIlII.append((char)(lllllllllllllllIlIIIllIIIlIIIlll ^ lllllllllllllllIlIIIllIIIlIIIIll[lllllllllllllllIlIIIllIIIlIIIIlI % lllllllllllllllIlIIIllIIIlIIIIll.length]));
            "".length();
            ++lllllllllllllllIlIIIllIIIlIIIIlI;
            ++lllllllllllllllIlIIIllIIIIlllIlI;
            "".length();
            if (((0xEC ^ 0xB4 ^ (0xCD ^ 0xB8)) & (0x5D ^ 0x40 ^ (0x42 ^ 0x72) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIllIIIlIIIlII);
    }

    private static boolean lIIIIIIlIllIIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIIIIlIlIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    public boolean run() {
        p lllllllllllllllIlIIIllIIIllIlIll;
        if (!p.lIIIIIIlIlIlIII(this.bt.A() ? 1 : 0) || p.lIIIIIIlIlIlIIl(this.bs.isPaused() ? 1 : 0)) {
            return llIlIIIlllII[1];
        }
        if (p.lIIIIIIlIlIlIlI(Vars.getBit((int)llIlIIIlllII[2]), llIlIIIlllII[3])) {
            return llIlIIIlllII[1];
        }
        if (p.lIIIIIIlIlIlIll(lllllllllllllllIlIIIllIIIllIlIll.br.hopAfterKills()) && !p.lIIIIIIlIlIllII(lllllllllllllllIlIIIllIIIllIlIll.bs.m(), lllllllllllllllIlIIIllIIIllIlIll.br.hopAfterKills()) || p.lIIIIIIlIlIlIIl(lllllllllllllllIlIIIllIIIllIlIll.br.hopUntilEmpty() ? 1 : 0) && p.lIIIIIIlIlIllIl(Players.getAll().size(), llIlIIIlllII[3])) {
            if (p.lIIIIIIlIlIlIIl(lllllllllllllllIlIIIllIIIllIlIll.br.delayHopIfEmpty() ? 1 : 0) && p.lIIIIIIlIlIlllI(Players.getAll().size(), llIlIIIlllII[3])) {
                return llIlIIIlllII[1];
            }
            if (p.lIIIIIIlIlIlIII(Worlds.isHopperOpen() ? 1 : 0)) {
                Worlds.openHopper();
                return llIlIIIlllII[3];
            }
            World lllllllllllllllIlIIIllIIIllIlIlI = Worlds.getCurrentWorld();
            if (p.lIIIIIIlIlIllll(lllllllllllllllIlIIIllIIIllIlIlI)) {
                return llIlIIIlllII[3];
            }
            if (p.lIIIIIIlIlIlIlI(lllllllllllllllIlIIIllIIIllIlIll.bu, llIlIIIlllII[0]) && p.lIIIIIIlIlIlIlI(lllllllllllllllIlIIIllIIIllIlIll.bu, lllllllllllllllIlIIIllIIIllIlIlI.getId())) {
                lllllllllllllllIlIIIllIIIllIlIll.bu = llIlIIIlllII[0];
                lllllllllllllllIlIIIllIIIllIlIll.bs.b(llIlIIIlllII[1]);
                return llIlIIIlllII[1];
            }
            int lllllllllllllllIlIIIllIIIllIlIIl = Static.getClient().getTotalLevel();
            World lllllllllllllllIlIIIllIIIllIlIII = Worlds.getRandom(world2 -> {
                int n3;
                if (p.lIIIIIIlIlIlIlI(world2.getId(), lllllllllllllllIlIIIllIIIllIlIlI.getId()) && p.lIIIIIIlIlIlIIl(world2.isMembers() ? 1 : 0) && p.lIIIIIIlIllIIIl(world2.getLocation(), lllllllllllllllIlIIIllIIIllIlIlI.getLocation()) && p.lIIIIIIlIlIlIII(world2.isAllPkWorld() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isPvpArena() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isLeague() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isTournament() ? 1 : 0) && p.lIIIIIIlIlIlIII(world2.isQuestSpeedRun() ? 1 : 0) && (!p.lIIIIIIlIlIlIIl(world2.isSkillTotal() ? 1 : 0) || p.lIIIIIIlIlIllII(Integer.parseInt(world2.getActivity().substring(llIlIIIlllII[1], world2.getActivity().indexOf(llIlIIIllIll[llIlIIIlllII[3]]))), lllllllllllllllIlIIIllIIIllIlIIl))) {
                    n3 = llIlIIIlllII[3];
                    "".length();
                    if (null != null) {
                        return ((174 + 51 - 29 + 23 ^ 128 + 62 - 91 + 32) & (0x27 ^ 0xC ^ (0xB4 ^ 0xC7) ^ -" ".length())) != 0;
                    }
                } else {
                    n3 = llIlIIIlllII[1];
                }
                return n3 != 0;
            });
            Worlds.hopTo((World)lllllllllllllllIlIIIllIIIllIlIII);
            lllllllllllllllIlIIIllIIIllIlIll.bu = lllllllllllllllIlIIIllIIIllIlIlI.getId();
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

    private static String lIIIIIIlIlIIlII(String lllllllllllllllIlIIIllIIIlIlIlII, String lllllllllllllllIlIIIllIIIlIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIllIIIlIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIIIlIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIIIlIllIII.init(llIlIIIlllII[4], lllllllllllllllIlIIIllIIIlIllIIl);
            return new String(lllllllllllllllIlIIIllIIIlIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIllIIIlIlIlll) {
            lllllllllllllllIlIIIllIIIlIlIlll.printStackTrace();
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
        void lllllllllllllllIlIIIllIIIllIIlII;
        if (p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.SPAM) && p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.CONSOLE) && p.lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.ENGINE)) {
            return;
        }
        if (p.lIIIIIIlIlIlIIl(lllllllllllllllIlIIIllIIIllIIlII.getMessage().contains(llIlIIIllIll[llIlIIIlllII[1]]) ? 1 : 0)) {
            lllllllllllllllIlIIIllIIIllIIlIl.bu = llIlIIIlllII[0];
        }
    }

    private static boolean lIIIIIIlIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIIIlIlIIllI() {
        llIlIIIllIll = new String[llIlIIIlllII[4]];
        p.llIlIIIllIll[p.llIlIIIlllII[1]] = p.lIIIIIIlIlIIlII("vk71lBDpwvw62mbjEGQNeQ==", "GHKzt");
        p.llIlIIIllIll[p.llIlIIIlllII[3]] = p.lIIIIIIlIlIIlIl("TQ==", "mwDpn");
    }
}

