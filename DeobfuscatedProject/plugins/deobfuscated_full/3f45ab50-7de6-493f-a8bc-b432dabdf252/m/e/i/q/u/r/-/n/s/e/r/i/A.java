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

/* TASK: Hopping Worlds -> HoppingworldsTask */
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
        A.lllllIIIlIII[A.lllllIIIlIIl[0]] = A."Some ore is ready to be collected from the sack.";
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
        A.lllllIIIlIIl[0] = (0x18 ^ 0x23 ^ (0xBC ^ 0xAF)) & (0xC ^ 0x2B ^ (0x82 ^ 0x8D) ^ -1);
        A.lllllIIIlIIl[1] = 0x3B ^ 0x48 ^ (0xC3 ^ 0xB5);
        A.lllllIIIlIIl[2] = 1 ^ 5;
        A.lllllIIIlIIl[3] = 0x4E ^ 0x49;
        A.lllllIIIlIIl[4] = 1;
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
        void var13;
        if (A.lIIlIIlIIllIIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var2 = var13.getMessage();
        if (A.lIIlIIlIIlIlllI(var2.contains(lllllIIIlIII[lllllIIIlIIl[0]]) ? 1 : 0)) {
            return;
        }
        this.Q += lllllIIIlIIl[4];
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        A var11;
        if (A.lIIlIIlIIlIlllI(this.P.hop() ? 1 : 0)) {
            return lllllIIIlIIl[0];
        }
        if (A.lIIlIIlIIlIllll(var11.Q, var11.R)) {
            return lllllIIIlIIl[0];
        }
        int var4 = Worlds.getCurrentId();
        World var12 = Worlds.getRandom(world -> {
            int n3;
            if (A.lIIlIIlIIllIIlI(world.isNormal() ? 1 : 0) && A.lIIlIIlIIllIIlI(world.isMembers() ? 1 : 0) && A.lIIlIIlIIllIIll(var4, world.getId())) {
                n3 = lllllIIIlIIl[4];
                0;
                if (3 <= 0) {
                    return ((0x59 ^ 0x79 ^ (0xB0 ^ 0xA3)) & (0x57 ^ 0x6E ^ (0x6A ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n3 = lllllIIIlIIl[0];
            }
            return n3 != 0;
        });
        if (A.lIIlIIlIIllIIII(var12)) {
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

    private static String lIIlIIlIIlIlIll(String var14, String var6) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var5 = var6.toCharArray();
        int var3 = lllllIIIlIIl[0];
        char[] var7 = var14.toCharArray();
        int var9 = var7.length;
        int var8 = lllllIIIlIIl[0];
        while (A.lIIlIIlIIlIllll(var8, var9)) {
            char var10 = var7[var8];
            var1.append((char)(var10 ^ var5[var3 % var5.length]));
            0;
            ++var3;
            ++var8;
            0;
            
            return null;
        }
        return String.valueOf(var1);
    }

    static {
        A.lIIlIIlIIlIllIl();
        A.lIIlIIlIIlIllII();
    }
}

