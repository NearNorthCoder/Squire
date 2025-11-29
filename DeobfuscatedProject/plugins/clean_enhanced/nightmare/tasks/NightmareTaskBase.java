/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.nightmare.tasks;

import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

public abstract class NightmareTaskBase
extends NightmareTaskBase {
    
    protected static final  List<Integer> dt;
    public static final  WorldArea ds;

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    protected boolean cl() {
        return Bank.getAll().stream().anyMatch(item -> dt.contains(item.getId()));
    }

    @Inject
    protected NightmareTaskBase(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void var3() {
        var1 = new int[36];
        S.var1[0] = (2 + 114 - 26 + 83 ^ 83 + 77 - 108 + 90) & (0x5E ^ 0x6C ^ (0x7D ^ 0x6C) ^ -1);
        S.var1[1] = 1;
        S.var1[2] = 0xFFFFDEFF & 0x2D4F;
        S.var1[3] = 0xFFFFCFFB & 0x3D95;
        S.var1[4] = 0x6A ^ 0x54 ^ (0x3C ^ 0x1F);
        S.var1[5] = 0x49 ^ 0x69 ^ 1;
        S.var1[6] = 0x60 ^ 0x70;
        S.var1[7] = 0xFFFFB6BC & 0x5DF7;
        S.var1[8] = 0xFFFFEDE3 & 0x13DF;
        S.var1[9] = 2;
        S.var1[10] = 0xFFFFC3B6 & 0x3E7D;
        S.var1[11] = 3;
        S.var1[12] = -(0xFFFFF74F & 0x7DFD) & (0xFFFFFF7F & 0x77FD);
        S.var1[13] = 0x9E ^ 0x9A;
        S.var1[14] = 0xFFFF9FFF & 0x6BEB;
        S.var1[15] = 0x81 ^ 0x84;
        S.var1[16] = -(0xFFFF9DF7 & 0x7E0B) & (0xFFFFDF7E & 0x3FFF);
        S.var1[17] = 0x12 ^ 0x14;
        S.var1[18] = 0xFFFFC7E9 & 0x3DFF;
        S.var1[19] = 0x14 ^ 0x13;
        S.var1[20] = 144 + 47 - 139 + 167;
        S.var1[21] = 0x31 ^ 0x35 ^ (0x5A ^ 0x56);
        S.var1[22] = 189 + 210 - 291 + 107;
        S.var1[23] = 0x99 ^ 0x90;
        S.var1[24] = -(0xFFFFA777 & 0x7EAF) & (0xFFFFF7F7 & 0x2FEF);
        S.var1[25] = 0xC2 ^ 0xB7 ^ 124 + 121 - 119 + 1;
        S.var1[26] = -(0xFFFFFFA3 & 0x305D) & (0xFFFFFFBF & 0x31FF);
        S.var1[27] = 9 + 105 - 90 + 130 ^ 58 + 13 - -29 + 45;
        S.var1[28] = -(0xFFFFBB42 & 0x6EBF) & (0xFFFFABFF & 0x7FBD);
        S.var1[29] = 2 ^ 0xE;
        S.var1[30] = 0xC8 ^ 0xC5;
        S.var1[31] = -(0xFFFFFF5F & 0x3AAB) & (0xFFFFBBFF & 0x7FCF);
        S.var1[32] = 0x71 ^ 0x63 ^ (0x78 ^ 0x64);
        S.var1[33] = 0xFFFFD67B & 0x2FD7;
        S.var1[34] = 0xAC ^ 0xA3;
        S.var1[35] = -(0xFFFFDE65 & 0x31BB) & (0xFFFF967F & 0x7FF5);
    }

    public abstract boolean ci();

    protected void co() {
        this.cW.l(var1[0]);
        this.cW.e(var1[0]);
        this.cW.f(var1[0]);
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    protected boolean cm() {
        return Inventory.getAll().stream().noneMatch(item -> {
            int n2;
            if (S.var4(item.isNoted() ? 1 : 0)) {
                n2 = item.getId() - var1[1];
                0;
                if (-1 > 0) {
                    return ((29 + 160 - 86 + 117 ^ 89 + 50 - 106 + 118) & (0x7F ^ 0x21 ^ (0x3C ^ 0x29) ^ -1)) != 0;
                }
            } else {
                Item var6;
                n2 = var6.getId();
            }
            return dt.contains(n2);
        });
    }

    protected boolean cn() {
        Player player = Players.getLocal();
        if (S.var5(player)) {
            return var1[0];
        }
        return ds.contains(player.getWorldLocation());
    }

    @Override
    public boolean bY() {
        S var7;
        if (S.var2(this.cV.enableRestocking() ? 1 : 0)) {
            return var1[0];
        }
        if (S.var2(var7.cW.ae() ? 1 : 0)) {
            return var1[0];
        }
        Player var8 = Players.getLocal();
        if (S.var5(var8)) {
            return var1[0];
        }
        return this.ci();
    }

    static {
        S.var3();
        ds = new WorldArea(var1[2], var1[3], var1[4], var1[5], var1[0]);
        Integer[] integerArray = new Integer[var1[6]];
        integerArray[S.var1[0]] = var1[7];
        integerArray[S.var1[1]] = var1[8];
        integerArray[S.var1[9]] = var1[10];
        integerArray[S.var1[11]] = var1[12];
        integerArray[S.var1[13]] = var1[14];
        integerArray[S.var1[15]] = var1[16];
        integerArray[S.var1[17]] = var1[18];
        integerArray[S.var1[19]] = var1[20];
        integerArray[S.var1[21]] = var1[22];
        integerArray[S.var1[23]] = var1[24];
        integerArray[S.var1[25]] = var1[26];
        integerArray[S.var1[27]] = var1[28];
        integerArray[S.var1[29]] = var1[9];
        integerArray[S.var1[30]] = var1[31];
        integerArray[S.var1[32]] = var1[33];
        integerArray[S.var1[34]] = var1[35];
        dt = new ArrayList<Integer>(List.of(integerArray));
    }
}

