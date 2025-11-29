/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Pray Flicking", priority=0x7FFFFFFF)
public class PrayFlickingTask
extends Task {
    private  ArrayList<Prayer> dO;
    private final  SquireNightmareConfig dM;
    private static final  Logger dK;
    
    private final  SquireNightmarePlugin dN;
    
    private final  Client dL;

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static void var6() {
        var1 = new String[var2[1]];
        ad.var1[ad.var2[0]] = "husk";
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static boolean var8(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }

    private static boolean var10(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ad.var11();
        ad.var6();
        dK = LoggerFactory.getLogger(PrayFlickingTask.class);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ad var12;
        if (ad.var9(Prayers.anyActive() ? 1 : 0) && ad.var9(this.dL.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (ad.var13(Skills.getBoostedLevel((SkiSkill.PRAYER))) {
            return var2[0];
        }
        NPC var14 = SquireNightmarePlugin.d();
        if (ad.var9(var12.dL.isInInstancedRegion() ? 1 : 0)) {
            Prayers.disableAll();
            return var2[1];
        }
        if (ad.var7(var14)) {
            return var2[0];
        }
        List<Prayer> list = this.q(var1_1.getAnimation());
        Prayers.flick(list);
        0;
        return var2[1];
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var21(int n2) {
        return n2 > 0;
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static void var11() {
        var2 = new int[14];
        ad.var2[0] = (0xAB ^ 0xB4) & ~(0x58 ^ 0x47);
        ad.var2[1] = 1;
        ad.var2[2] = -(0xFFFFF2BF & 0x6D7B) & (0xFFFFEFFF & 0x7F7F);
        ad.var2[3] = 156 + 89 - 156 + 93 ^ 17 + 103 - 74 + 144;
        ad.var2[4] = 3;
        ad.var2[5] = 2;
        ad.var2[6] = -(0xFFFFBA95 & 0x6D7B) & (0xFFFFBD5D & 0x7FFE);
        ad.var2[7] = 0xD0 ^ 0x9D;
        ad.var2[8] = 0x3D ^ 0x39;
        ad.var2[9] = 0x8C ^ 0x96 ^ (0x35 ^ 0x29);
        ad.var2[10] = 0xFFFFBF93 & 0x61FE;
        ad.var2[11] = 0xFFFFAFDA & 0x7BB7;
        ad.var2[12] = -(0xFFFFB9BD & 0x5E6F) & (0xFFFFBBBF & 0x7DFF);
        ad.var2[13] = 0xFFFFA3BE & 0x7DD5;
    }

    @Inject
    public PrayFlickingTask(Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.dO = new ArrayList();
        this.dL = client;
        this.dM = squireNightmareConfig;
        this.dN = squireNightmarePlugin;
    }

    private static boolean var23(Object object) {
        return object != null;
    }

    private static boolean var24(int n2, int n3) {
        return n2 != n3;
    }

    private List<Prayer> q(int var25) {
        ArrayList<Prayer> arrayList;
        ad var26;
        Object var27;
        ArrayList<Prayer> var28 = new ArrayList<Prayer>();
        int[] var29 = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        NPC var30 = NPCs.getAll((int[])var29).stream().filter(nPC -> {
            boolean bl;
            if (ad.var9(nPC.isDead() ? 1 : 0)) {
                bl = var2[1];
                0;
                if (-3 > 0) {
                    return ((3 ^ (0x5F ^ 2)) & (63 + 156 - 134 + 72 ^ 50 + 159 - 107 + 93 ^ -1)) != 0;
                }
            } else {
                bl = var2[0];
            }
            return bl;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        if (ad.var7(var30)) {
            if (ad.var24(Static.getClient().getVarbitValue(var2[2]), var2[3])) {
                Prayer[] prayerArray = new Prayer[var2[4]];
                prayerArray[ad.var2[0]] = Prayer.INCREDIBLE_REFLEXES;
                prayerArray[ad.var2[1]] = Prayer.ULTIMATE_STRENGTH;
                prayerArray[ad.var2[5]] = Prayer.STEEL_SKIN;
                var27 = Arrays.asList(prayerArray);
                var28.addAll((Collection<Prayer>)var27);
                0;
                0;
                if (3 != 3) {
                    return null;
                }
            } else {
                var28.add(Prayer.PIETY);
                0;
                0;
                if null != null {
                    return null;
                }
            }
        } else if (ad.var21(Vars.getBit((int)var2[6])) && ad.var10(Skills.getLevel((SkiSkill.PRAYER), var2[7])) {
            var28.add(Prayer.AUGURY);
            0;
            0;
            if null != null {
                return null;
            }
        } else {
            var28.add(Prayer.MYSTIC_MIGHT);
            0;
        }
        var27 = SquireNightmarePlugin.d();
        NPC var31 = NPCs.getNearest(nPC -> {
            int n2;
            if (ad.var5(nPC.getName().equalsIgnoreCase(var1[var2[0]]) ? 1 : 0) && ad.var9(nPC.isDead() ? 1 : 0)) {
                n2 = var2[1];
                0;
                if (2 <= 0) {
                    return ((0xEF ^ 0xA8) & ~(0x23 ^ 0x64)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (ad.var23(var31) && ad.var3(var26.dN.Q(), var2[8]) && (!ad.var8(var26.dN.R(), var2[9]) || ad.var22(var26.dN.R(), var2[8])) && (!ad.var24(var25, var2[10]) || ad.var4(var26.dN.S(), Prayer.PROTECT_FROM_MELEE))) {
            var28.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            0;
            if (((0x1E ^ 0x63 ^ (0x23 ^ 0x67)) & (110 + 78 - 65 + 52 ^ 61 + 140 - 51 + 0 ^ -1)) != 0) {
                return null;
            }
        } else if (ad.var23(var31) && ad.var3(var26.dN.Q(), var2[8]) && (!ad.var8(var26.dN.R(), var2[9]) || ad.var22(var26.dN.R(), var2[4]))) {
            var28.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            0;
            if (-3 >= 0) {
                return null;
            }
        } else if (ad.var23(var31) && (!ad.var8(var26.dN.R(), var2[9]) || ad.var22(var26.dN.R(), var2[4]))) {
            var28.add(Prayer.PROTECT_FROM_MAGIC);
            0;
            0;
            if (-1 > 0) {
                return null;
            }
        } else if (ad.var3(var27.getId(), var2[11])) {
            var28.add(Prayer.REDEMPTION);
            0;
            0;
            if (((0x11 ^ 0x44) & ~(0xEA ^ 0xBF)) != 0) {
                return null;
            }
        } else if (ad.var9(var26.dN.al() ? 1 : 0)) {
            if (ad.var3(var25, var2[12])) {
                var28.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                var26.dN.a(Prayer.PROTECT_FROM_MAGIC);
            }
            if (ad.var3(var25, var2[13])) {
                var28.add(Prayer.PROTECT_FROM_MISSILES);
                0;
                var26.dN.a(Prayer.PROTECT_FROM_MISSILES);
            }
            if (ad.var3(var25, var2[10])) {
                var28.add(Prayer.PROTECT_FROM_MELEE);
                0;
                var26.dN.a(Prayer.PROTECT_FROM_MELEE);
                0;
                if null != null {
                    return null;
                }
            }
        } else {
            if (ad.var3(var25, var2[12])) {
                var28.add(Prayer.PROTECT_FROM_MELEE);
                0;
                var26.dN.a(Prayer.PROTECT_FROM_MELEE);
            }
            if (ad.var3(var25, var2[13])) {
                var28.add(Prayer.PROTECT_FROM_MAGIC);
                0;
            }
            if (ad.var3(var25, var2[10])) {
                var28.add(Prayer.PROTECT_FROM_MISSILES);
                0;
            }
        }
        if (ad.var32(var28.size(), var2[1])) {
            var26.dO = var28;
        }
        if (ad.var32(var28.size(), var2[1])) {
            arrayList = var28;
            0;
            if (((0x7D ^ 0x59) & ~(0x7A ^ 0x5E)) > 2) {
                return null;
            }
        } else {
            arrayList = var26.dO;
        }
        return arrayList;
    }

    private static boolean var32(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var13(int n2) {
        return n2 <= 0;
    }
}

