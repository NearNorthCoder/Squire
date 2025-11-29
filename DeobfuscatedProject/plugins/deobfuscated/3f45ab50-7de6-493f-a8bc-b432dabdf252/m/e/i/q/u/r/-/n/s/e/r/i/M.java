/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.AnimationID
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.AnimationID;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping to avoid nearby player", priority=10, blocking=true)
public class M
extends Task {
    private final /* synthetic */ SquireMinerConfig ap;
    private static /* synthetic */ String[] lllllIlIllll;
    private static /* synthetic */ int[] lllllIllIIII;

    static {
        M.lIIlIIlllIIIIIl();
        M.lIIlIIlllIIIIII();
    }

    @Inject
    public M(SquireMinerConfig squireMinerConfig) {
        this.ap = squireMinerConfig;
    }

    private static boolean lIIlIIlllIIIlIl(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(int n2) {
        void lllllllllllllllIIlIIlIIlllllIlII;
        Field[] fieldArray;
        Field[] fieldArray2 = fieldArray = AnimationID.class.getDeclaredFields();
        int n3 = fieldArray2.length;
        int lllllllllllllllIIlIIlIIlllllIIll = lllllIllIIII[0];
        while (M.lIIlIIlllIIIIlI(lllllllllllllllIIlIIlIIlllllIIll, (int)lllllllllllllllIIlIIlIIlllllIlII)) {
            void lllllllllllllllIIlIIlIIlllllIlIl;
            void lllllllllllllllIIlIIlIIlllllIIlI = lllllllllllllllIIlIIlIIlllllIlIl[lllllllllllllllIIlIIlIIlllllIIll];
            if (M.lIIlIIlllIIIIll(lllllllllllllllIIlIIlIIlllllIIlI.getName().startsWith(lllllIlIllll[lllllIllIIII[0]]) ? 1 : 0)) {
                try {
                    void lllllllllllllllIIlIIlIIlllllIlll;
                    int lllllllllllllllIIlIIlIIlllllIIIl = lllllllllllllllIIlIIlIIlllllIIlI.getInt(null);
                    if (M.lIIlIIlllIIIlII(lllllllllllllllIIlIIlIIlllllIIIl, (int)lllllllllllllllIIlIIlIIlllllIlll)) {
                        return lllllIllIIII[1];
                    }
                    0;
                }
                catch (IllegalAccessException lllllllllllllllIIlIIlIIlllllIIIl) {
                    // empty catch block
                }
                if (-1 >= (7 + 56 - -31 + 47 ^ 136 + 112 - 229 + 118)) {
                    return (1 & (1 ^ -1)) != 0;
                }
            }
            ++lllllllllllllllIIlIIlIIlllllIIll;
            0;
            if (null == null) continue;
            return ((0x16 ^ 0x4D) & ~(0x30 ^ 0x6B)) != 0;
        }
        return lllllIllIIII[0];
    }

    private static boolean lIIlIIlllIIIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIIlllIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIlllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIlllIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    public boolean run() {
        M lllllllllllllllIIlIIlIIllllIlllI;
        if (M.lIIlIIlllIIIlIl((Object)this.ap.activity(), (Object)a.VOLCANIC_ASH)) {
            return lllllIllIIII[0];
        }
        Player lllllllllllllllIIlIIlIIllllIllIl = Players.getNearest(player -> {
            int n2;
            if (M.lIIlIIlllIIIlIl(player, Players.getLocal()) && M.lIIlIIlllIIIIll(this.b(player.getAnimation()) ? 1 : 0)) {
                n2 = lllllIllIIII[1];
                0;
                if ((0x26 ^ 0x2C ^ (0x28 ^ 0x26)) == ((0x7B ^ 0x39 ^ (0x77 ^ 5)) & (35 + 58 - 78 + 116 ^ 120 + 34 - 91 + 116 ^ -1))) {
                    return ((18 + 99 - 107 + 129 ^ 6 + 17 - -3 + 172) & (60 + 118 - 124 + 167 ^ 127 + 142 - 130 + 5 ^ -1)) != 0;
                }
            } else {
                n2 = lllllIllIIII[0];
            }
            return n2 != 0;
        });
        if (M.lIIlIIlllIIIllI(lllllllllllllllIIlIIlIIllllIllIl)) {
            return lllllIllIIII[0];
        }
        Worlds.hopTo((World)Worlds.getRandom(world -> {
            int n2;
            if (M.lIIlIIlllIIIIll(world.isNormal() ? 1 : 0) && M.lIIlIIlllIIIIll(world.isMembers() ? 1 : 0) && M.lIIlIIlllIIIlll(world.getId(), Worlds.getCurrentId())) {
                n2 = lllllIllIIII[1];
                0;
                if (2 == 0) {
                    return ((0x8F ^ 0x97) & ~(0x9A ^ 0x82)) != 0;
                }
            } else {
                n2 = lllllIllIIII[0];
            }
            return n2 != 0;
        }));
        this.sleep(lllllIllIIII[2]);
        return lllllIllIIII[1];
    }

    private static void lIIlIIlllIIIIIl() {
        lllllIllIIII = new int[4];
        M.lllllIllIIII[0] = (18 + 66 - 61 + 112 ^ 95 + 144 - 74 + 2) & (82 + 109 - 146 + 140 ^ 55 + 131 - 38 + 5 ^ -1);
        M.lllllIllIIII[1] = 1;
        M.lllllIllIIII[2] = 9 ^ 0x49 ^ (0x4D ^ 9);
        M.lllllIllIIII[3] = 2;
    }

    private static String lIIlIIllIllllll(String lllllllllllllllIIlIIlIIlllIlllll, String lllllllllllllllIIlIIlIIlllIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIlllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIIllllIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIIllllIIIIl.init(lllllIllIIII[3], lllllllllllllllIIlIIlIIllllIIIlI);
            return new String(lllllllllllllllIIlIIlIIllllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIllllIIIII) {
            lllllllllllllllIIlIIlIIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlllIIIllI(Object object) {
        return object == null;
    }

    private static void lIIlIIlllIIIIII() {
        lllllIlIllll = new String[lllllIllIIII[1]];
        M.lllllIlIllll[M.lllllIllIIII[0]] = M."MINING_";
    }
}

