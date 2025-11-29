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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.D_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h_Unknown;

public abstract class S_Unknown
extends D_Unknown {
    private static /* synthetic */ int[] lllIlllIllII;
    protected static final /* synthetic */ List<Integer> dt;
    public static final /* synthetic */ WorldArea ds;

    private static boolean lIIIllIllllIlIl(int n2) {
        return n2 == 0;
    }

    protected boolean cl() {
        return Bank.getAll().stream().anyMatch(item -> dt.contains(item.getId()));
    }

    @Inject
    protected S(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static void lIIIllIllllIIll() {
        lllIlllIllII = new int[36];
        S.lllIlllIllII[0] = (2 + 114 - 26 + 83 ^ 83 + 77 - 108 + 90) & (0x5E ^ 0x6C ^ (0x7D ^ 0x6C) ^ -1);
        S.lllIlllIllII[1] = 1;
        S.lllIlllIllII[2] = 0xFFFFDEFF & 0x2D4F;
        S.lllIlllIllII[3] = 0xFFFFCFFB & 0x3D95;
        S.lllIlllIllII[4] = 0x6A ^ 0x54 ^ (0x3C ^ 0x1F);
        S.lllIlllIllII[5] = 0x49 ^ 0x69 ^ 1;
        S.lllIlllIllII[6] = 0x60 ^ 0x70;
        S.lllIlllIllII[7] = 0xFFFFB6BC & 0x5DF7;
        S.lllIlllIllII[8] = 0xFFFFEDE3 & 0x13DF;
        S.lllIlllIllII[9] = 2;
        S.lllIlllIllII[10] = 0xFFFFC3B6 & 0x3E7D;
        S.lllIlllIllII[11] = 3;
        S.lllIlllIllII[12] = -(0xFFFFF74F & 0x7DFD) & (0xFFFFFF7F & 0x77FD);
        S.lllIlllIllII[13] = 0x9E ^ 0x9A;
        S.lllIlllIllII[14] = 0xFFFF9FFF & 0x6BEB;
        S.lllIlllIllII[15] = 0x81 ^ 0x84;
        S.lllIlllIllII[16] = -(0xFFFF9DF7 & 0x7E0B) & (0xFFFFDF7E & 0x3FFF);
        S.lllIlllIllII[17] = 0x12 ^ 0x14;
        S.lllIlllIllII[18] = 0xFFFFC7E9 & 0x3DFF;
        S.lllIlllIllII[19] = 0x14 ^ 0x13;
        S.lllIlllIllII[20] = 144 + 47 - 139 + 167;
        S.lllIlllIllII[21] = 0x31 ^ 0x35 ^ (0x5A ^ 0x56);
        S.lllIlllIllII[22] = 189 + 210 - 291 + 107;
        S.lllIlllIllII[23] = 0x99 ^ 0x90;
        S.lllIlllIllII[24] = -(0xFFFFA777 & 0x7EAF) & (0xFFFFF7F7 & 0x2FEF);
        S.lllIlllIllII[25] = 0xC2 ^ 0xB7 ^ 124 + 121 - 119 + 1;
        S.lllIlllIllII[26] = -(0xFFFFFFA3 & 0x305D) & (0xFFFFFFBF & 0x31FF);
        S.lllIlllIllII[27] = 9 + 105 - 90 + 130 ^ 58 + 13 - -29 + 45;
        S.lllIlllIllII[28] = -(0xFFFFBB42 & 0x6EBF) & (0xFFFFABFF & 0x7FBD);
        S.lllIlllIllII[29] = 2 ^ 0xE;
        S.lllIlllIllII[30] = 0xC8 ^ 0xC5;
        S.lllIlllIllII[31] = -(0xFFFFFF5F & 0x3AAB) & (0xFFFFBBFF & 0x7FCF);
        S.lllIlllIllII[32] = 0x71 ^ 0x63 ^ (0x78 ^ 0x64);
        S.lllIlllIllII[33] = 0xFFFFD67B & 0x2FD7;
        S.lllIlllIllII[34] = 0xAC ^ 0xA3;
        S.lllIlllIllII[35] = -(0xFFFFDE65 & 0x31BB) & (0xFFFF967F & 0x7FF5);
    }

    public abstract boolean ci();

    protected void co() {
        this.cW.l(lllIlllIllII[0]);
        this.cW.e(lllIlllIllII[0]);
        this.cW.f(lllIlllIllII[0]);
    }

    private static boolean lIIIllIllllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllIllllIlII(Object object) {
        return object == null;
    }

    protected boolean cm() {
        return Inventory.getAll().stream().noneMatch(item -> {
            int n2;
            if (S.lIIIllIllllIllI(item.isNoted() ? 1 : 0)) {
                n2 = item.getId() - lllIlllIllII[1];
                0;
                if (-1 > 0) {
                    return ((29 + 160 - 86 + 117 ^ 89 + 50 - 106 + 118) & (0x7F ^ 0x21 ^ (0x3C ^ 0x29) ^ -1)) != 0;
                }
            } else {
                Item var1;
                n2 = var1.getId();
            }
            return dt.contains(n2);
        });
    }

    protected boolean cn() {
        Player player = Players.getLocal();
        if (S.lIIIllIllllIlII(player)) {
            return lllIlllIllII[0];
        }
        return ds.contains(player.getWorldLocation());
    }

    @Override
    public boolean bY() {
        S var2;
        if (S.lIIIllIllllIlIl(this.cV.enableRestocking() ? 1 : 0)) {
            return lllIlllIllII[0];
        }
        if (S.lIIIllIllllIlIl(var2.cW.ae() ? 1 : 0)) {
            return lllIlllIllII[0];
        }
        Player var3 = Players.getLocal();
        if (S.lIIIllIllllIlII(var3)) {
            return lllIlllIllII[0];
        }
        return this.ci();
    }

    static {
        S.lIIIllIllllIIll();
        ds = new WorldArea(lllIlllIllII[2], lllIlllIllII[3], lllIlllIllII[4], lllIlllIllII[5], lllIlllIllII[0]);
        Integer[] integerArray = new Integer[lllIlllIllII[6]];
        integerArray[S.lllIlllIllII[0]] = lllIlllIllII[7];
        integerArray[S.lllIlllIllII[1]] = lllIlllIllII[8];
        integerArray[S.lllIlllIllII[9]] = lllIlllIllII[10];
        integerArray[S.lllIlllIllII[11]] = lllIlllIllII[12];
        integerArray[S.lllIlllIllII[13]] = lllIlllIllII[14];
        integerArray[S.lllIlllIllII[15]] = lllIlllIllII[16];
        integerArray[S.lllIlllIllII[17]] = lllIlllIllII[18];
        integerArray[S.lllIlllIllII[19]] = lllIlllIllII[20];
        integerArray[S.lllIlllIllII[21]] = lllIlllIllII[22];
        integerArray[S.lllIlllIllII[23]] = lllIlllIllII[24];
        integerArray[S.lllIlllIllII[25]] = lllIlllIllII[26];
        integerArray[S.lllIlllIllII[27]] = lllIlllIllII[28];
        integerArray[S.lllIlllIllII[29]] = lllIlllIllII[9];
        integerArray[S.lllIlllIllII[30]] = lllIlllIllII[31];
        integerArray[S.lllIlllIllII[32]] = lllIlllIllII[33];
        integerArray[S.lllIlllIllII[34]] = lllIlllIllII[35];
        dt = new ArrayList<Integer>(List.of(integerArray));
    }
}

