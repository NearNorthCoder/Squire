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
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.ChatMessageType;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping Worlds", priority=100, blocking=true, register=true)
public class A
extends Task {
    private static /* synthetic */ int[] lllllIIIlIIl;
    private static /* synthetic */ String[] lllllIIIlIII;
    private final /* synthetic */ SquireMinerConfig P;
    private /* synthetic */ int R;
    private /* synthetic */ int Q;

    private static void lIIlIIlIIlIllII() {
        lllllIIIlIII = new String[lllllIIIlIIl[4]];
        A.lllllIIIlIII[A.lllllIIIlIIl[0]] = A.lIIlIIlIIlIlIll("ODUMAmQEKARHLRh6EwIlDyNBEytLOARHJwQ2DQInHz8FRyIZNQxHMAM/QRQlCDFP", "kZagD");
    }

    private static boolean lIIlIIlIIllIIII(Object object) {
        return object == null;
    }

    private static boolean lIIlIIlIIllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIlIIllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIlIIlIIlIllIl() {
        lllllIIIlIIl = new int[5];
        A.lllllIIIlIIl[0] = (0x18 ^ 0x23 ^ (0xBC ^ 0xAF)) & (0xC ^ 0x2B ^ (0x82 ^ 0x8D) ^ -" ".length());
        A.lllllIIIlIIl[1] = 0x3B ^ 0x48 ^ (0xC3 ^ 0xB5);
        A.lllllIIIlIIl[2] = 1 ^ 5;
        A.lllllIIIlIIl[3] = 0x4E ^ 0x49;
        A.lllllIIIlIIl[4] = " ".length();
    }

    private static boolean lIIlIIlIIlIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlIIllIIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIlIIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIIlIIllIlIIllIlIl;
        if (A.lIIlIIlIIllIIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String lllllllllllllllIIlIIllIlIIllIlII = lllllllllllllllIIlIIllIlIIllIlIl.getMessage();
        if (A.lIIlIIlIIlIlllI(lllllllllllllllIIlIIllIlIIllIlII.contains(lllllIIIlIII[lllllIIIlIIl[0]]) ? 1 : 0)) {
            return;
        }
        this.Q += lllllIIIlIIl[4];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        A lllllllllllllllIIlIIllIlIIllllII;
        if (A.lIIlIIlIIlIlllI(this.P.hop() ? 1 : 0)) {
            return lllllIIIlIIl[0];
        }
        if (A.lIIlIIlIIlIllll(lllllllllllllllIIlIIllIlIIllllII.Q, lllllllllllllllIIlIIllIlIIllllII.R)) {
            return lllllIIIlIIl[0];
        }
        int lllllllllllllllIIlIIllIlIIlllIll = Worlds.getCurrentId();
        World lllllllllllllllIIlIIllIlIIlllIlI = Worlds.getRandom(world -> {
            int n3;
            if (A.lIIlIIlIIllIIlI(world.isNormal() ? 1 : 0) && A.lIIlIIlIIllIIlI(world.isMembers() ? 1 : 0) && A.lIIlIIlIIllIIll(lllllllllllllllIIlIIllIlIIlllIll, world.getId())) {
                n3 = lllllIIIlIIl[4];
                "".length();
                if ("   ".length() <= 0) {
                    return ((0x59 ^ 0x79 ^ (0xB0 ^ 0xA3)) & (0x57 ^ 0x6E ^ (0x6A ^ 0x60) ^ -" ".length())) != 0;
                }
            } else {
                n3 = lllllIIIlIIl[0];
            }
            return n3 != 0;
        });
        if (A.lIIlIIlIIllIIII(lllllllllllllllIIlIIllIlIIlllIlI)) {
            return lllllIIIlIIl[0];
        }
        Worlds.hopTo((World)var2_2);
        this.Q = lllllIIIlIIl[0];
        this.R = Rand.nextInt((int)lllllIIIlIIl[2], (int)lllllIIIlIIl[3]);
        return lllllIIIlIIl[4];
    }

    @Inject
    public A(SquireMinerConfig squireMinerConfig) {
        this.Q = lllllIIIlIIl[0];
        this.R = lllllIIIlIIl[1];
        this.P = squireMinerConfig;
    }

    private static String lIIlIIlIIlIlIll(String lllllllllllllllIIlIIllIlIIlIIIII, String lllllllllllllllIIlIIllIlIIlIIlII) {
        lllllllllllllllIIlIIllIlIIlIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIlIIlIIIll = new StringBuilder();
        char[] lllllllllllllllIIlIIllIlIIlIIIlI = lllllllllllllllIIlIIllIlIIlIIlII.toCharArray();
        int lllllllllllllllIIlIIllIlIIlIIIIl = lllllIIIlIIl[0];
        char[] lllllllllllllllIIlIIllIlIIIllIll = lllllllllllllllIIlIIllIlIIlIIIII.toCharArray();
        int lllllllllllllllIIlIIllIlIIIllIlI = lllllllllllllllIIlIIllIlIIIllIll.length;
        int lllllllllllllllIIlIIllIlIIIllIIl = lllllIIIlIIl[0];
        while (A.lIIlIIlIIlIllll(lllllllllllllllIIlIIllIlIIIllIIl, lllllllllllllllIIlIIllIlIIIllIlI)) {
            char lllllllllllllllIIlIIllIlIIlIIllI = lllllllllllllllIIlIIllIlIIIllIll[lllllllllllllllIIlIIllIlIIIllIIl];
            lllllllllllllllIIlIIllIlIIlIIIll.append((char)(lllllllllllllllIIlIIllIlIIlIIllI ^ lllllllllllllllIIlIIllIlIIlIIIlI[lllllllllllllllIIlIIllIlIIlIIIIl % lllllllllllllllIIlIIllIlIIlIIIlI.length]));
            "".length();
            ++lllllllllllllllIIlIIllIlIIlIIIIl;
            ++lllllllllllllllIIlIIllIlIIIllIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllIlIIlIIIll);
    }

    static {
        A.lIIlIIlIIlIllIl();
        A.lIIlIIlIIlIllII();
    }
}

