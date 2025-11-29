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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Hopping before entry!", priority=0x7FFFFFFF, blocking=true, register=true)
public class aB
extends D {
    private static final /* synthetic */ Logger eJ;
    private static /* synthetic */ String[] llllIIlllllI;
    private static /* synthetic */ int[] llllIlIIIIIl;
    private /* synthetic */ boolean eK;

    private static boolean lIIlIIIIIlIIlll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIIlIllIllllIllIlI;
        Player player = Players.getLocal();
        int n2 = player.getWorldLocation().getRegionID();
        if (aB.lIIlIIIIIlIIlll(this.cV.bankLocation().bJ(), n2)) {
            return;
        }
        if (aB.lIIlIIIIIlIlIII(lllllllllllllllIIlIllIllllIllIlI.getType(), ChatMessageType.PUBLICCHAT)) {
            return;
        }
        this.eK = llllIlIIIIIl[3];
    }

    private static boolean lIIlIIIIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static String lIIlIIIIIIllIll(String lllllllllllllllIIlIllIlllIllllIl, String lllllllllllllllIIlIllIlllIllllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlllIllllII.getBytes(StandardCharsets.UTF_8)), llllIlIIIIIl[6]), "DES");
            Cipher lllllllllllllllIIlIllIlllIllllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlllIllllll.init(llllIlIIIIIl[5], lllllllllllllllIIlIllIllllIIIIII);
            return new String(lllllllllllllllIIlIllIlllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlllIlllllI) {
            lllllllllllllllIIlIllIlllIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIIlIlIII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIIlIIIIIlIIIll() {
        llllIlIIIIIl = new int[7];
        aB.llllIlIIIIIl[0] = (0xEA ^ 0xA1 ^ (0x4F ^ 0x1E)) & (17 + 67 - 54 + 157 ^ 147 + 116 - 108 + 6 ^ -1);
        aB.llllIlIIIIIl[1] = 131 + 60 - 186 + 143 ^ 142 + 107 - 107 + 13;
        aB.llllIlIIIIIl[2] = -1;
        aB.llllIlIIIIIl[3] = 1;
        aB.llllIlIIIIIl[4] = -(0xFFFFCBD9 & 0x7CB7) & (0xFFFFDFFC & 0x6FFF);
        aB.llllIlIIIIIl[5] = 2;
        aB.llllIlIIIIIl[6] = 0x4B ^ 0x43;
    }

    private static boolean lIIlIIIIIlIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIIlIIIIIIlllII(String lllllllllllllllIIlIllIllllIIlIlI, String lllllllllllllllIIlIllIllllIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIllllIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIllllIIllII.init(llllIlIIIIIl[5], lllllllllllllllIIlIllIllllIIllIl);
            return new String(lllllllllllllllIIlIllIllllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIllllIIlIll) {
            lllllllllllllllIIlIllIllllIIlIll.printStackTrace();
            return null;
        }
    }

    static {
        aB.lIIlIIIIIlIIIll();
        aB.lIIlIIIIIIlllll();
        eJ = LoggerFactory.getLogger(aB.class);
    }

    private static boolean lIIlIIIIIlIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected aB(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
        this.eK = llllIlIIIIIl[0];
    }

    private static boolean lIIlIIIIIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIIlIIIIIIlllll() {
        llllIIlllllI = new String[llllIlIIIIIl[5]];
        aB.llllIIlllllI[aB.llllIlIIIIIl[0]] = aB."[HopTask]: Tick count is less than 15, resetting variable.";
        aB.llllIIlllllI[aB.llllIlIIIIIl[3]] = aB." ";
    }

    @Override
    public boolean bY() {
        aB lllllllllllllllIIlIllIlllllIIIll;
        if (aB.lIIlIIIIIlIIlII(this.cW.ad() ? 1 : 0)) {
            return llllIlIIIIIl[0];
        }
        if (aB.lIIlIIIIIlIIlII(lllllllllllllllIIlIllIlllllIIIll.eK ? 1 : 0) && aB.lIIlIIIIIlIIlIl(Static.getClient().getTickCount(), llllIlIIIIIl[1])) {
            Log.info((String)llllIIlllllI[llllIlIIIIIl[0]]);
            lllllllllllllllIIlIllIlllllIIIll.eK = llllIlIIIIIl[0];
        }
        if (aB.lIIlIIIIIlIIlII(Bank.isOpen() ? 1 : 0)) {
            return llllIlIIIIIl[0];
        }
        if (aB.lIIlIIIIIlIIlII(GrandExchange.isOpen() ? 1 : 0)) {
            return llllIlIIIIIl[0];
        }
        World lllllllllllllllIIlIllIlllllIIIlI = Worlds.getCurrentWorld();
        lllllllllllllllIIlIllIlllllIIIll.cW.a(lllllllllllllllIIlIllIlllllIIIlI);
        if (aB.lIIlIIIIIlIIlII(lllllllllllllllIIlIllIlllllIIIll.cV.hopAfterExit() ? 1 : 0)) {
            if (aB.lIIlIIIIIlIIlII(lllllllllllllllIIlIllIlllllIIIll.cV.adaptiveHopAfterTeleport() ? 1 : 0) && aB.lIIlIIIIIlIIllI(lllllllllllllllIIlIllIlllllIIIll.eK ? 1 : 0)) {
                return llllIlIIIIIl[0];
            }
            if ((!aB.lIIlIIIIIlIIlll(lllllllllllllllIIlIllIlllllIIIll.cW.ah(), llllIlIIIIIl[2]) || aB.lIIlIIIIIlIIlll(lllllllllllllllIIlIllIlllllIIIll.cW.ah(), Worlds.getCurrentWorld().getId())) && aB.lIIlIIIIIlIIlII(lllllllllllllllIIlIllIlllllIIIll.cW.ap ? 1 : 0) && aB.lIIlIIIIIlIIllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && aB.lIIlIIIIIlIIlll(lllllllllllllllIIlIllIlllllIIIll.cW.ah(), lllllllllllllllIIlIllIlllllIIIlI.getId())) {
                if (aB.lIIlIIIIIlIIllI(Worlds.isHopperOpen() ? 1 : 0)) {
                    Worlds.openHopper();
                    return llllIlIIIIIl[3];
                }
                int lllllllllllllllIIlIllIlllllIIIIl = Static.getClient().getTotalLevel();
                World lllllllllllllllIIlIllIlllllIIIII = Worlds.getRandom(world2 -> {
                    int n3;
                    if (aB.lIIlIIIIIlIIlll(world2.getId(), lllllllllllllllIIlIllIlllllIIIlI.getId()) && aB.lIIlIIIIIlIIlII(world2.isMembers() ? 1 : 0) && aB.lIIlIIIIIlIlIIl(world2.getLocation(), lllllllllllllllIIlIllIlllllIIIlI.getLocation()) && aB.lIIlIIIIIlIIllI(world2.isAllPkWorld() ? 1 : 0) && aB.lIIlIIIIIlIIllI(world2.isPvpArena() ? 1 : 0) && aB.lIIlIIIIIlIIllI(world2.isLeague() ? 1 : 0) && aB.lIIlIIIIIlIIllI(world2.isTournament() ? 1 : 0) && aB.lIIlIIIIIlIlIlI(world2.getPlayerCount(), llllIlIIIIIl[4]) && aB.lIIlIIIIIlIIllI(world2.isQuestSpeedRun() ? 1 : 0) && (!aB.lIIlIIIIIlIIlII(world2.isSkillTotal() ? 1 : 0) || aB.lIIlIIIIIlIIlIl(Integer.parseInt(world2.getActivity().substring(llllIlIIIIIl[0], world2.getActivity().indexOf(llllIIlllllI[llllIlIIIIIl[3]]))), lllllllllllllllIIlIllIlllllIIIIl))) {
                        n3 = llllIlIIIIIl[3];
                        0;
                        if ((0x47 ^ 0x43) <= 3) {
                            return ((0xE0 ^ 0x80) & ~(0x42 ^ 0x22)) != 0;
                        }
                    } else {
                        n3 = llllIlIIIIIl[0];
                    }
                    return n3 != 0;
                });
                lllllllllllllllIIlIllIlllllIIIll.cW.j(lllllllllllllllIIlIllIlllllIIIII.getId());
                lllllllllllllllIIlIllIlllllIIIll.cW.ap = llllIlIIIIIl[0];
                Worlds.hopTo((World)lllllllllllllllIIlIllIlllllIIIII);
                return llllIlIIIIIl[3];
            }
        }
        return llllIlIIIIIl[0];
    }
}

