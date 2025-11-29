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
import gg.squire.mining.tasks.GameEnum5;
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
                    if (!j.var3(Inventory.contains((int[])this.r) ? 1 : 0)) break block2;
                    int[] nArray = new int[var2[3]];
                    nArray[j.var2[1]] = var2[15];
                    if (!j.var3(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[var2[3]];
                    nArray2[j.var2[1]] = var2[16];
                    if (!j.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[var2[3]];
                nArray[j.var2[1]] = var2[17];
                if (!j.var3(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[var2[3]];
                nArray3[j.var2[1]] = var2[18];
                if (!j.var4(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[var2[3]];
                nArray4[j.var2[1]] = var2[19];
                if (!j.var3(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = var2[3];
            0;
            if (((96 + 88 - 152 + 103 ^ 68 + 120 - 60 + 11) & (0xAE ^ 0x83 ^ (0xB4 ^ 0x95) ^ -1)) == 0) return n2 != 0;
            return ((0x86 ^ 0xBB ^ (0x97 ^ 0xA1)) & (0xA ^ 6 ^ (0x13 ^ 0x14) ^ -1)) != 0;
        }
        n2 = var2[1];
        return n2 != 0;
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public LoggingOutTask(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        int[] nArray = new int[var2[0]];
        nArray[j.var2[1]] = var2[2];
        nArray[j.var2[3]] = var2[4];
        nArray[j.var2[5]] = var2[6];
        nArray[j.var2[7]] = var2[8];
        this.r = nArray;
        this.p = squireMiner;
        this.q = squireMinerConfig;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        j var6;
        block11: {
            block10: {
                if (j.var5(Game.getState(), GameState.LOGGED_IN)) {
                    return var2[1];
                }
                if (j.var5((Object)var6.q.activity(), (Object)a.GRANITE) && j.var5((Object)var6.q.activity(), (Object)a.SANDSTONE)) {
                    return var2[1];
                }
                if (!j.var3(var6.q.waterskins())) break block10;
                int[] nArray = new int[var2[3]];
                nArray[j.var2[1]] = var2[9];
                if (!j.var3(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
            }
            return var2[1];
        }
        if (j.var4(var6.n() ? 1 : 0)) {
            System.out.println(var1[var2[1]]);
            return var2[1];
        }
        if (j.var3(var6.q.humidify() ? 1 : 0) && j.var4(Magic.canCast((SpeSpellBook.Lunar.HUMIDIFY) ? 1 : 0)) {
            System.out.println(var1[var2[3]]);
            Game.logout();
            return var2[3];
        }
        if (j.var4(var6.q.humidify() ? 1 : 0)) {
            int[] nArray = new int[var2[3]];
            nArray[j.var2[1]] = var2[10];
            if (j.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var2[0]];
                nArray2[j.var2[1]] = var2[11];
                nArray2[j.var2[3]] = var2[12];
                nArray2[j.var2[5]] = var2[13];
                nArray2[j.var2[7]] = var2[14];
                if (j.var4(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println(var1[var2[5]]);
                    Game.logout();
                    return var2[3];
                }
            }
        }
        return var2[1];
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static void var19() {
        var2 = new int[21];
        j.var2[0] = 0xE ^ 0x75 ^ 5 + 102 - -20 + 0;
        j.var2[1] = (0x65 ^ 0x33 ^ (0x2F ^ 0x6D)) & (104 + 188 - 252 + 172 ^ 17 + 89 - 31 + 117 ^ -1);
        j.var2[2] = (0x8F ^ 0x81) + (186 + 72 - 81 + 32) - (0xF1 ^ 0xC6) + (0x26 ^ 0x77);
        j.var2[3] = 1;
        j.var2[4] = 57 + 22 - 39 + 90 + (43 + 53 - -54 + 2) - (85 + 146 - 65 + 23) + (107 + 129 - 89 + 11);
        j.var2[5] = 2;
        j.var2[6] = (0x82 ^ 0xB1) + (0xB7 ^ 0x8B) - -(0x84 ^ 0x90) + (0xC1 ^ 0xBB);
        j.var2[7] = 3;
        j.var2[8] = 243 + 110 - 231 + 133;
        j.var2[9] = -(0xFFFF8227 & 0x7FDF) & (0xFFFFEB5F & Short.MAX_VALUE);
        j.var2[10] = -(0xFFFFBFAB & 0x785D) & (0xFFFFFBFB & 0x3FEF);
        j.var2[11] = -(0xFFFFD1DD & 0x7EF3) & (0xFFFFDFF7 & 0x77FD);
        j.var2[12] = 0xFFFFC7BB & 0x3F67;
        j.var2[13] = 0xFFFFFFED & 0x733;
        j.var2[14] = 0xFFFF97DF & 0x6F3F;
        j.var2[15] = 0xFFFF97B7 & 0x6FDB;
        j.var2[16] = 94 + 46 - 104 + 197;
        j.var2[17] = 0xFFFFEFB6 & 0x13FB;
        j.var2[18] = -(0xFFFFEB5B & 0x17A7) & (0xFFFFBBBF & 0x5FFF);
        j.var2[19] = -(0xFFFFF643 & 0x4BFE) & (0xFFFFFBFF & 0x5EFD);
        j.var2[20] = 0xA2 ^ 0xAA;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    static {
        j.var19();
        j.var20();
    }

    private static void var20() {
        var1 = new String[var2[7]];
        j.var1[j.var2[1]] = "We are missing items to properly 3tick";
        j.var1[j.var2[3]] = "We are using humidify, but we cannot cast it.";
        j.var1[j.var2[5]] = "We are missing waterskins, and can't buy new ones. Logging out.";
    }
}

