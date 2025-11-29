/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.ConstructionManager;
import gg.squire.construction.tasks.FHelper;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Handling prayer", priority=100)
public class HandlingPrayerTask
extends Task {
    private final  a aF;
    private static  int[] lIIlIlIll;
    private static  String[] lIIlIlIlI;

    @Inject
    private HandlingPrayerTask(a a2) {
        this.aF = a2;
    }

    private static boolean var1(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    static {
        u.var5();
        u.var6();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Prayer prayer;
        Prayer var7;
        u var8;
        if (!u.var9(this.aF.k()) || u.var4(this.aF.k().y())) {
            Prayers.disableAll();
            return lIIlIlIll[0];
        }
        List<f> var10 = var8.aF.i();
        if (!u.var9(var10) || u.var3(var10.isEmpty() ? 1 : 0)) {
            var7 = var8.aF.j();
            0;
            if (3 == 1) {
                return ((105 + 104 - 33 + 55 ^ 171 + 141 - 128 + 3) & (151 + 139 - 242 + 176 ^ 71 + 160 - 186 + 143 ^ -1)) != 0;
            }
        } else {
            f var11 = var10.get(lIIlIlIll[1]);
            var7 = var11.J().j();
        }
        if (u.var4(var7)) {
            Log.info((String)lIIlIlIlI[lIIlIlIll[1]]);
            Prayers.disableAll();
            return lIIlIlIll[0];
        }
        if (u.var3(var8.W() ? 1 : 0)) {
            prayer = Prayer.PIETY;
            0;
            if (((0xF0 ^ 0xC7) & ~(0xF2 ^ 0xC5)) < -1) {
                return ((0xDC ^ 0xBE) & ~(0x11 ^ 0x73)) != 0;
            }
        } else {
            prayer = Prayer.MYSTIC_MIGHT;
        }
        Prayer prayer2 = prayer;
        return Prayers.flick(List.of(prayer2, var2_2));
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = lIIlIlIll[1];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = lIIlIlIll[1];
        while (u.var2(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-1 >= -1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void var5() {
        lIIlIlIll = new int[5];
        u.lIIlIlIll[0] = 1;
        u.lIIlIlIll[1] = 2 & ~2;
        u.lIIlIlIll[2] = 0x29 ^ 0x6F;
        u.lIIlIlIll[3] = 0xFFFFFFEF & 0xF55;
        u.lIIlIlIll[4] = 0x82 ^ 0x95 ^ (0x5C ^ 0x43);
    }

    public boolean W() {
        int n2;
        if (u.var1(Skills.getLevel((SkiSkill.PRAYER), lIIlIlIll[2]) && u.var1(Skills.getLevel((SkiSkill.DEFENCE), lIIlIlIll[2]) && u.var1(Vars.getBit((int)lIIlIlIll[3]), lIIlIlIll[4])) {
            n2 = lIIlIlIll[0];
            0;
            if (3 != 3) {
                return ((0xA1 ^ 0x8E ^ (0x16 ^ 0x63)) & (143 + 9 - -37 + 60 ^ 73 + 129 - 102 + 63 ^ -1)) != 0;
            }
        } else {
            n2 = lIIlIlIll[1];
        }
        return n2 != 0;
    }

    private static void var6() {
        lIIlIlIlI = new String[lIIlIlIll[0]];
        u.lIIlIlIlI[u.lIIlIlIll[1]] = "No prayer to flick, disabling all";
    }
}

