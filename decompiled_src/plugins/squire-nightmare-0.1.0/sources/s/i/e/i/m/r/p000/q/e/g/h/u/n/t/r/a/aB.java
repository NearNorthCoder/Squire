package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

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
@TaskDesc(name = "Hopping before entry!", priority = Integer.MAX_VALUE, blocking = true, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.aB  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/aB.class */
public class aB extends D {
    private static final /* synthetic */ Logger eJ;
    private static /* synthetic */ String[] llllIIlllllI;
    private static /* synthetic */ int[] llllIlIIIIIl;
    private /* synthetic */ boolean eK;

    private static boolean lIIlIIIIIlIIlll(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIIIIIlIIlll(this.cV.bankLocation().bJ(), Players.getLocal().getWorldLocation().getRegionID()) || lIIlIIIIIlIlIII(chatMessage.getType(), ChatMessageType.PUBLICCHAT)) {
            return;
        }
        this.eK = llllIlIIIIIl[3];
    }

    private static boolean lIIlIIIIIlIIlII(int i) {
        return i != 0;
    }

    private static String lIIlIIIIIIllIll(String lllllllllllllllIIlIllIlllIllllIl, String lllllllllllllllIIlIllIlllIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlllIllllII.getBytes(StandardCharsets.UTF_8)), llllIlIIIIIl[6]), "DES");
            Cipher lllllllllllllllIIlIllIlllIllllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlllIllllll.init(llllIlIIIIIl[5], secretKeySpec);
            return new String(lllllllllllllllIIlIllIlllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlllIlllllI) {
            lllllllllllllllIIlIllIlllIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIlIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIIIIlIlIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIlIIIIIlIIIll() {
        llllIlIIIIIl = new int[7];
        llllIlIIIIIl[0] = ((234 ^ 161) ^ (79 ^ 30)) & (((((17 + 67) - 54) + 157) ^ (((147 + 116) - 108) + 6)) ^ (-" ".length()));
        llllIlIIIIIl[1] = (((131 + 60) - 186) + 143) ^ (((142 + 107) - 107) + 13);
        llllIlIIIIIl[2] = -" ".length();
        llllIlIIIIIl[3] = " ".length();
        llllIlIIIIIl[4] = (-((-13351) & 31927)) & (-8196) & 28671;
        llllIlIIIIIl[5] = "  ".length();
        llllIlIIIIIl[6] = 75 ^ 67;
    }

    private static boolean lIIlIIIIIlIlIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIIlIIIIIIlllII(String lllllllllllllllIIlIllIllllIIlIII, String lllllllllllllllIIlIllIllllIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIllllIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIllllIIllII.init(llllIlIIIIIl[5], secretKeySpec);
            return new String(lllllllllllllllIIlIllIllllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIllllIIlIll) {
            lllllllllllllllIIlIllIllllIIlIll.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIIIIIlIIIll();
        lIIlIIIIIIlllll();
        eJ = LoggerFactory.getLogger(aB.class);
    }

    private static boolean lIIlIIIIIlIIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected aB(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
        this.eK = llllIlIIIIIl[0];
    }

    private static boolean lIIlIIIIIlIlIlI(int i, int i2) {
        return i <= i2;
    }

    private static void lIIlIIIIIIlllll() {
        llllIIlllllI = new String[llllIlIIIIIl[5]];
        llllIIlllllI[llllIlIIIIIl[0]] = lIIlIIIIIIllIll("ExJ0F/AuAJAklicyZYjpkBctx9BABKA+Eb6CxeBYD8JPLcOfPjZ6USijKWFoTwiwRNS96VvOd2CN45v+I1UTuQ==", "aVnSt");
        llllIIlllllI[llllIlIIIIIl[3]] = lIIlIIIIIIlllII("omuvGvwjSqE=", "NYMDX");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (lIIlIIIIIlIIlII(this.cW.ad() ? 1 : 0)) {
            return llllIlIIIIIl[0];
        }
        if (lIIlIIIIIlIIlII(this.eK ? 1 : 0) && lIIlIIIIIlIIlIl(Static.getClient().getTickCount(), llllIlIIIIIl[1])) {
            Log.info(llllIIlllllI[llllIlIIIIIl[0]]);
            this.eK = llllIlIIIIIl[0];
        }
        if (!lIIlIIIIIlIIlII(Bank.isOpen() ? 1 : 0) && !lIIlIIIIIlIIlII(GrandExchange.isOpen() ? 1 : 0)) {
            World currentWorld = Worlds.getCurrentWorld();
            this.cW.a(currentWorld);
            if (lIIlIIIIIlIIlII(this.cV.hopAfterExit() ? 1 : 0)) {
                if (lIIlIIIIIlIIlII(this.cV.adaptiveHopAfterTeleport() ? 1 : 0) && lIIlIIIIIlIIllI(this.eK ? 1 : 0)) {
                    return llllIlIIIIIl[0];
                }
                if ((!lIIlIIIIIlIIlll(this.cW.ah(), llllIlIIIIIl[2]) || lIIlIIIIIlIIlll(this.cW.ah(), Worlds.getCurrentWorld().getId())) && lIIlIIIIIlIIlII(this.cW.ap ? 1 : 0) && lIIlIIIIIlIIllI(Static.getClient().isInInstancedRegion() ? 1 : 0) && lIIlIIIIIlIIlll(this.cW.ah(), currentWorld.getId())) {
                    if (lIIlIIIIIlIIllI(Worlds.isHopperOpen() ? 1 : 0)) {
                        Worlds.openHopper();
                        return llllIlIIIIIl[3];
                    }
                    int totalLevel = Static.getClient().getTotalLevel();
                    World random = Worlds.getRandom(world -> {
                        if (lIIlIIIIIlIIlll(world.getId(), currentWorld.getId()) && lIIlIIIIIlIIlII(world.isMembers() ? 1 : 0) && lIIlIIIIIlIlIIl(world.getLocation(), currentWorld.getLocation()) && lIIlIIIIIlIIllI(world.isAllPkWorld() ? 1 : 0) && lIIlIIIIIlIIllI(world.isPvpArena() ? 1 : 0) && lIIlIIIIIlIIllI(world.isLeague() ? 1 : 0) && lIIlIIIIIlIIllI(world.isTournament() ? 1 : 0) && lIIlIIIIIlIlIlI(world.getPlayerCount(), llllIlIIIIIl[4]) && lIIlIIIIIlIIllI(world.isQuestSpeedRun() ? 1 : 0) && (!lIIlIIIIIlIIlII(world.isSkillTotal() ? 1 : 0) || lIIlIIIIIlIIlIl(Integer.parseInt(world.getActivity().substring(llllIlIIIIIl[0], world.getActivity().indexOf(llllIIlllllI[llllIlIIIIIl[3]]))), totalLevel))) {
                            ?? r0 = llllIlIIIIIl[3];
                            "".length();
                            return (71 ^ 67) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIlIIIIIl[0];
                    });
                    this.cW.j(random.getId());
                    this.cW.ap = llllIlIIIIIl[0];
                    Worlds.hopTo(random);
                    return llllIlIIIIIl[3];
                }
            }
            return llllIlIIIIIl[0];
        }
        return llllIlIIIIIl[0];
    }
}
