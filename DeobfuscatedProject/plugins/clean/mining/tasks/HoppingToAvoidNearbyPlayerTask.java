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
package gg.squire.mining.tasks;

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
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.AnimationID;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;

@TaskDesc(name="Hopping to avoid nearby player", priority=10, blocking=true)
public class HoppingToAvoidNearbyPlayerTask
extends Task {
    private final  SquireMinerConfig ap;

    static {
        M.lIIlIIlllIIIIIl();
        M.lIIlIIlllIIIIII();
    }

    @Inject
    public HoppingToAvoidNearbyPlayerTask(SquireMinerConfig squireMinerConfig) {
        this.ap = squireMinerConfig;
    }

    private static boolean lIIlIIlllIIIlIl(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(int n2) {
        void var1;
        Field[] fieldArray;
        Field[] fieldArray2 = fieldArray = AnimationID.class.getDeclaredFields();
        int n3 = fieldArray2.length;
        int var2 = lllllIllIIII[0];
        while (M.lIIlIIlllIIIIlI(var2, (int)var1)) {
            void var3;
            void var4 = var3[var2];
            if (M.lIIlIIlllIIIIll(var4.getName().startsWith(lllllIlIllll[lllllIllIIII[0]]) ? 1 : 0)) {
                try {
                    void var5;
                    int var6 = var4.getInt(null);
                    if (M.lIIlIIlllIIIlII(var6, (int)var5)) {
                        return lllllIllIIII[1];
                    }

                }
                catch (IllegalAccessException var6) {
                    // empty catch block
                }
                if (-1 >= (7 + 56 - -31 + 47 ^ 136 + 112 - 229 + 118)) {
                    return (1 & (1 ^ -1)) != 0;
                }
            }
            ++var2;

            return false;
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
        M var7;
        if (M.lIIlIIlllIIIlIl((Object)this.ap.activity(), (Object)a.VOLCANIC_ASH)) {
            return lllllIllIIII[0];
        }
        Player var8 = Players.getNearest(player -> {
            int n2;
            if (M.lIIlIIlllIIIlIl(player, Players.getLocal()) && M.lIIlIIlllIIIIll(this.b(player.getAnimation()) ? 1 : 0)) {
                n2 = lllllIllIIII[1];

                if ((0x26 ^ 0x2C ^ (0x28 ^ 0x26)) == ((0x7B ^ 0x39 ^ (0x77 ^ 5)) & (35 + 58 - 78 + 116 ^ 120 + 34 - 91 + 116 ^ -1))) {
                    return false;
                }
            } else {
                n2 = lllllIllIIII[0];
            }
            return n2 != 0;
        });
        if (M.lIIlIIlllIIIllI(var8)) {
            return lllllIllIIII[0];
        }
        Worlds.hopTo((World)Worlds.getRandom(world -> {
            int n2;
            if (M.lIIlIIlllIIIIll(world.isNormal() ? 1 : 0) && M.lIIlIIlllIIIIll(world.isMembers() ? 1 : 0) && M.lIIlIIlllIIIlll(world.getId(), Worlds.getCurrentId())) {
                n2 = lllllIllIIII[1];

                if (2 == 0) {
                    return false;
                }
            } else {
                n2 = lllllIllIIII[0];
            }
            return n2 != 0;
        }));
        this.sleep(lllllIllIIII[2]);
        return lllllIllIIII[1];
    }

    private static boolean lIIlIIlllIIIllI(Object object) {
        return object == null;
    }

    private static void lIIlIIlllIIIIII() {
        lllllIlIllll = new String[lllllIllIIII[1]];
        M.lllllIlIllll[M.lllllIllIIII[0]] = "MINING_";
    }
}

