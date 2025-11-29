package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

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
import net.runelite.api.ChatMessageType;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.client.Static;
@TaskDesc(name = "Hopping", blocking = true, priority = 100, register = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/p.class */
public class C0015p extends Task {
    private final /* synthetic */ GauntletConfig br;
    private static /* synthetic */ int[] llIlIIIlllII;
    private /* synthetic */ boolean bv;
    private /* synthetic */ int bu = llIlIIIlllII[0];
    private static /* synthetic */ String[] llIlIIIllIll;
    private final /* synthetic */ SquireGauntlet bs;
    private final /* synthetic */ C0002c bt;

    private static boolean lIIIIIIlIlIlllI(int i, int i2) {
        return i <= i2;
    }

    private static void lIIIIIIlIlIIlll() {
        llIlIIIlllII = new int[5];
        llIlIIIlllII[0] = -" ".length();
        llIlIIIlllII[1] = ((8 ^ 32) ^ (128 ^ 156)) & (((163 ^ 170) ^ (91 ^ 102)) ^ (-" ".length()));
        llIlIIIlllII[2] = (-((-11659) & 32175)) & (-3073) & 32767;
        llIlIIIlllII[3] = " ".length();
        llIlIIIlllII[4] = "  ".length();
    }

    private static boolean lIIIIIIlIlIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIIlIlIllII(int i, int i2) {
        return i < i2;
    }

    private static String lIIIIIIlIlIIlIl(String lllllllllllllllIlIIIllIIIlIIIllI, String lllllllllllllllIlIIIllIIIlIIIlIl) {
        String lllllllllllllllIlIIIllIIIlIIIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllIIIlIIIlII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIllIIIlIIIlIl.toCharArray();
        int lllllllllllllllIlIIIllIIIlIIIIlI = llIlIIIlllII[1];
        char[] charArray2 = lllllllllllllllIlIIIllIIIlIIIllI2.toCharArray();
        int length = charArray2.length;
        int i = llIlIIIlllII[1];
        while (lIIIIIIlIlIllII(i, length)) {
            char lllllllllllllllIlIIIllIIIlIIIlll = charArray2[i];
            lllllllllllllllIlIIIllIIIlIIIlII.append((char) (lllllllllllllllIlIIIllIIIlIIIlll ^ charArray[lllllllllllllllIlIIIllIIIlIIIIlI % charArray.length]));
            "".length();
            lllllllllllllllIlIIIllIIIlIIIIlI++;
            i++;
            "".length();
            if ((((236 ^ 180) ^ (205 ^ 184)) & (((93 ^ 64) ^ (66 ^ 114)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIIllIIIlIIIlII);
    }

    private static boolean lIIIIIIlIllIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIIIIlIlIlIlI(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    public boolean run() {
        if (!lIIIIIIlIlIlIII(this.bt.A() ? 1 : 0) || lIIIIIIlIlIlIIl(this.bs.isPaused() ? 1 : 0)) {
            return llIlIIIlllII[1];
        }
        if (lIIIIIIlIlIlIlI(Vars.getBit(llIlIIIlllII[2]), llIlIIIlllII[3])) {
            return llIlIIIlllII[1];
        }
        if ((!lIIIIIIlIlIlIll(this.br.hopAfterKills()) || lIIIIIIlIlIllII(this.bs.m(), this.br.hopAfterKills())) && !(lIIIIIIlIlIlIIl(this.br.hopUntilEmpty() ? 1 : 0) && lIIIIIIlIlIllIl(Players.getAll().size(), llIlIIIlllII[3]))) {
            return llIlIIIlllII[1];
        }
        if (lIIIIIIlIlIlIIl(this.br.delayHopIfEmpty() ? 1 : 0) && lIIIIIIlIlIlllI(Players.getAll().size(), llIlIIIlllII[3])) {
            return llIlIIIlllII[1];
        }
        if (lIIIIIIlIlIlIII(Worlds.isHopperOpen() ? 1 : 0)) {
            Worlds.openHopper();
            return llIlIIIlllII[3];
        }
        World currentWorld = Worlds.getCurrentWorld();
        if (lIIIIIIlIlIllll(currentWorld)) {
            return llIlIIIlllII[3];
        }
        if (lIIIIIIlIlIlIlI(this.bu, llIlIIIlllII[0]) && lIIIIIIlIlIlIlI(this.bu, currentWorld.getId())) {
            this.bu = llIlIIIlllII[0];
            this.bs.b(llIlIIIlllII[1]);
            return llIlIIIlllII[1];
        }
        int totalLevel = Static.getClient().getTotalLevel();
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (lIIIIIIlIlIlIlI(world.getId(), currentWorld.getId()) && lIIIIIIlIlIlIIl(world.isMembers() ? 1 : 0) && lIIIIIIlIllIIIl(world.getLocation(), currentWorld.getLocation()) && lIIIIIIlIlIlIII(world.isAllPkWorld() ? 1 : 0) && lIIIIIIlIlIlIII(world.isPvpArena() ? 1 : 0) && lIIIIIIlIlIlIII(world.isLeague() ? 1 : 0) && lIIIIIIlIlIlIII(world.isTournament() ? 1 : 0) && lIIIIIIlIlIlIII(world.isQuestSpeedRun() ? 1 : 0) && (!lIIIIIIlIlIlIIl(world.isSkillTotal() ? 1 : 0) || lIIIIIIlIlIllII(Integer.parseInt(world.getActivity().substring(llIlIIIlllII[1], world.getActivity().indexOf(llIlIIIllIll[llIlIIIlllII[3]]))), totalLevel))) {
                ?? r0 = llIlIIIlllII[3];
                "".length();
                return 0 != 0 ? ((((174 + 51) - 29) + 23) ^ (((128 + 62) - 91) + 32)) & (((39 ^ 12) ^ (180 ^ 199)) ^ (-" ".length())) : r0;
            }
            return llIlIIIlllII[1];
        }));
        this.bu = currentWorld.getId();
        return llIlIIIlllII[3];
    }

    private static boolean lIIIIIIlIlIlIII(int i) {
        return i == 0;
    }

    static {
        lIIIIIIlIlIIlll();
        lIIIIIIlIlIIllI();
    }

    private static boolean lIIIIIIlIlIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIIIIIIlIlIllIl(int i, int i2) {
        return i > i2;
    }

    private static String lIIIIIIlIlIIlII(String lllllllllllllllIlIIIllIIIlIlIllI, String lllllllllllllllIlIIIllIIIlIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIIIlIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIIIlIllIII.init(llIlIIIlllII[4], secretKeySpec);
            return new String(lllllllllllllllIlIIIllIIIlIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIllIIIlIlIlll) {
            lllllllllllllllIlIIIllIIIlIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIlIlIlIll(int i) {
        return i > 0;
    }

    @Inject
    public C0015p(GauntletConfig gauntletConfig, SquireGauntlet squireGauntlet, C0002c c0002c) {
        this.br = gauntletConfig;
        this.bs = squireGauntlet;
        this.bt = c0002c;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (!(lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.SPAM) && lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.CONSOLE) && lIIIIIIlIllIIII(chatMessage.getType(), ChatMessageType.ENGINE)) && lIIIIIIlIlIlIIl(chatMessage.getMessage().contains(llIlIIIllIll[llIlIIIlllII[1]]) ? 1 : 0)) {
            this.bu = llIlIIIlllII[0];
        }
    }

    private static boolean lIIIIIIlIllIIIl(int i, int i2) {
        return i == i2;
    }

    private static void lIIIIIIlIlIIllI() {
        llIlIIIllIll = new String[llIlIIIlllII[4]];
        llIlIIIllIll[llIlIIIlllII[1]] = lIIIIIIlIlIIlII("vk71lBDpwvw62mbjEGQNeQ==", "GHKzt");
        llIlIIIllIll[llIlIIIlllII[3]] = lIIIIIIlIlIIlIl("TQ==", "mwDpn");
    }
}
