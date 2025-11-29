/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Logging out")
public class LoggingOutTask
extends Task {
    private final  SquireMinerConfig q;
    private final  SquireMiner p;
    
    private final  int[] r;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean n() {
        int n2;
        block4: {
            block3: {
                block2: {
                    if (!j.lIIlIIllIllIlII(Inventory.contains((int[])this.r) ? 1 : 0)) break block2;
                    int[] nArray = new int[lllllIlIllII[3]];
                    nArray[j.lllllIlIllII[1]] = lllllIlIllII[15];
                    if (!j.lIIlIIllIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[lllllIlIllII[3]];
                    nArray2[j.lllllIlIllII[1]] = lllllIlIllII[16];
                    if (!j.lIIlIIllIllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[lllllIlIllII[3]];
                nArray[j.lllllIlIllII[1]] = lllllIlIllII[17];
                if (!j.lIIlIIllIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[lllllIlIllII[3]];
                nArray3[j.lllllIlIllII[1]] = lllllIlIllII[18];
                if (!j.lIIlIIllIllIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lllllIlIllII[3]];
                nArray4[j.lllllIlIllII[1]] = lllllIlIllII[19];
                if (!j.lIIlIIllIllIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = lllllIlIllII[3];

            if (((96 + 88 - 152 + 103 ^ 68 + 120 - 60 + 11) & (0xAE ^ 0x83 ^ (0xB4 ^ 0x95) ^ -1)) == 0) return n2 != 0;
            return ((0x86 ^ 0xBB ^ (0x97 ^ 0xA1)) & (0xA ^ 6 ^ (0x13 ^ 0x14) ^ -1)) != 0;
        }
        n2 = lllllIlIllII[1];
        return n2 != 0;
    }

    private static boolean lIIlIIllIllIIll(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public LoggingOutTask(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        int[] nArray = new int[lllllIlIllII[0]];
        nArray[j.lllllIlIllII[1]] = lllllIlIllII[2];
        nArray[j.lllllIlIllII[3]] = lllllIlIllII[4];
        nArray[j.lllllIlIllII[5]] = lllllIlIllII[6];
        nArray[j.lllllIlIllII[7]] = lllllIlIllII[8];
        this.r = nArray;
        this.p = squireMiner;
        this.q = squireMinerConfig;
    }

    private static boolean lIIlIIllIllIlII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        j var1;
        block11: {
            block10: {
                if (j.lIIlIIllIllIIll(Game.getState(), GameState.LOGGED_IN)) {
                    return lllllIlIllII[1];
                }
                if (j.lIIlIIllIllIIll((Object)var1.q.activity(), (Object)a.GRANITE) && j.lIIlIIllIllIIll((Object)var1.q.activity(), (Object)a.SANDSTONE)) {
                    return lllllIlIllII[1];
                }
                if (!j.lIIlIIllIllIlII(var1.q.waterskins())) break block10;
                int[] nArray = new int[lllllIlIllII[3]];
                nArray[j.lllllIlIllII[1]] = lllllIlIllII[9];
                if (!j.lIIlIIllIllIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
            }
            return lllllIlIllII[1];
        }
        if (j.lIIlIIllIllIlIl(var1.n() ? 1 : 0)) {
            System.out.println(lllllIlIlIll[lllllIlIllII[1]]);
            return lllllIlIllII[1];
        }
        if (j.lIIlIIllIllIlII(var1.q.humidify() ? 1 : 0) && j.lIIlIIllIllIlIl(Magic.canCast((Spell)SpellBook.Lunar.HUMIDIFY) ? 1 : 0)) {
            System.out.println(lllllIlIlIll[lllllIlIllII[3]]);
            Game.logout();
            return lllllIlIllII[3];
        }
        if (j.lIIlIIllIllIlIl(var1.q.humidify() ? 1 : 0)) {
            int[] nArray = new int[lllllIlIllII[3]];
            nArray[j.lllllIlIllII[1]] = lllllIlIllII[10];
            if (j.lIIlIIllIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIlIllII[0]];
                nArray2[j.lllllIlIllII[1]] = lllllIlIllII[11];
                nArray2[j.lllllIlIllII[3]] = lllllIlIllII[12];
                nArray2[j.lllllIlIllII[5]] = lllllIlIllII[13];
                nArray2[j.lllllIlIllII[7]] = lllllIlIllII[14];
                if (j.lIIlIIllIllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println(lllllIlIlIll[lllllIlIllII[5]]);
                    Game.logout();
                    return lllllIlIllII[3];
                }
            }
        }
        return lllllIlIllII[1];
    }

    private static boolean lIIlIIllIllIlIl(int n2) {
        return n2 == 0;
    }

    static {
        j.lIIlIIllIllIIlI();
        j.lIIlIIllIllIIIl();
    }

    private static void lIIlIIllIllIIIl() {
        lllllIlIlIll = new String[lllllIlIllII[7]];
        j.lllllIlIlIll[j.lllllIlIllII[1]] = "We are missing items to properly 3tick";
        j.lllllIlIlIll[j.lllllIlIllII[3]] = "We are using humidify, but we cannot cast it.";
        j.lllllIlIlIll[j.lllllIlIllII[5]] = "We are missing waterskins, and can't buy new ones. Logging out.";
    }
}

