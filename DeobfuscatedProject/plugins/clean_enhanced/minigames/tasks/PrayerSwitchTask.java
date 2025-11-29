/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.GameEnum;
import gg.squire.minigames.tasks.CHelper;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.MinigamesManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Prayer Switch Task", priority=100)
public class PrayerSwitchTask
extends Task {
    static final  int af;
    private final  n ae;
    private final  SquireFightCavesConfig ad;
    
    private final  f ac;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static boolean a(Prayer prayer) {
        boolean bl;
        if ((Vars.getBit((int)prayer.getVarbit()) == 9)) {
            bl = 9;
            0;
            if (3 < -1) {
                return ((0x5A ^ 0x52) & ~(0x99 ^ 0x91)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((Static.getClient( == 0).isInInstancedRegion() ? 1 : 0)) {
            Prayers.disableAll();
            return 0;
        }
        if (n.al == null) {
            k var9;
            var9.sleep(1);
            System.out.println(var2[0]);
            n.al = TileObjects.getNearest(tileObject -> {
                int n2;
                if ((tileObject.getName( != 0).equalsIgnoreCase(var2[var1[17]]) ? 1 : 0)) {
                    String[] stringArray = new String[9];
                    stringArray[0] = var2[5];
                    if ((tileObject.hasActionstringArray)) {
                        n2 = 9;
                        0;
                        if (2 == 2) return n2 != 0;
                        return (2 & ~2) != 0;
                    }
                }
                n2 = 0;
                return n2 != 0;
            }).getWorldLocation();
            System.out.println("Start: " + String.valueOf(n.al));
            n.am = new WorldPoint(n.al.getX(), n.al.getY() - 2, n.al.getPlane());
            n.an = new WorldPoint(n.al.getX() + 3, n.al.getY() - 4, n.al.getPlane());
            n.ao = new WorldPoint(n.al.getX() + 5, n.al.getY() - 6, n.al.getPlane());
            n.aq = new WorldPoint(n.al.getX(), n.al.getY() - 7, n.al.getPlane());
            n.ap = new WorldPoint(n.al.getX() + 5, n.al.getY() - 8, n.al.getPlane());
            SquireFightCavesPlugin.j += 9;
        }
        ArrayList<Prayer> var10 = new ArrayList<Prayer>();
        var10.addAll(Prayers.getRangePrayers());
        0;
        NPC var11 = NPCs.getNearest((int[])c.p);
        NPC var12 = NPCs.getNearest((int[])c.q);
        NPC var13 = NPCs.getNearest((int[])c.r);
        NPC var14 = NPCs.getNearest((int[])c.s);
        NPC var15 = NPCs.getNearest((int[])c.t);
        NPC var16 = NPCs.getNearest((int[])c.u);
        NPC var17 = NPCs.getNearest((int[])c.v);
        if ((f.p() < var1[10])) {
            if (f.D <= var1[11]) {
                var10.add(Prayer.PROTECT_FROM_MELEE);
                0;
            }
            if ((f.p() > var1[11]) && (f.p() != var1[12]) && (f.p() != var1[13]) && (f.p() != var1[14])) {
                if (!(f.a(Static.getClient( == 0), b.BLOB, Players.getLocal()) ? 1 : 0) || !(f.a(Static.getClient( == 0), b.SMALL_BLOB, Players.getLocal()) ? 1 : 0) || !(f.a(Static.getClient( == 0), b.MELEER, Players.getLocal()) ? 1 : 0) || (f.r() < 9) && var15 != null && (n.c(var15.getWorldArea( != 0).toWorldPointList()) ? 1 : 0)) {
                    var10.add(Prayer.PROTECT_FROM_MELEE);
                    0;
                }
                if (!(f.a(Static.getClient( == 0), b.RANGER, Players.getLocal()) ? 1 : 0) || (f.u() < 9) && var14 != null && var16 == null) {
                    var10.add(Prayer.PROTECT_FROM_MISSILES);
                    0;
                }
                if (!(f.a(Static.getClient( == 0), b.MAGER, Players.getLocal()) ? 1 : 0) || (f.t() < 9) && var16 != null) {
                    var10.add(Prayer.PROTECT_FROM_MAGIC);
                    0;
                }
            }
            if ((f.p() == var1[12])) {
                var10.add(Prayer.PROTECT_FROM_MISSILES);
                0;
            }
            if ((f.p() == var1[13])) {
                var10.add(Prayer.PROTECT_FROM_MELEE);
                0;
            }
            if ((f.p() == var1[14])) {
                var10.add(Prayer.PROTECT_FROM_MAGIC);
                0;
            }
        }
        if var17 != null {
            System.out.println(var2[9]);
            if ((var17.getAnimation() == var1[15])) {
                var10.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                0;
                if ((0x16 ^ 0x12) < 0) {
                    return ((0xFE ^ 0xB4) & ~(7 ^ 0x4D)) != 0;
                }
            } else {
                var10.add(Prayer.PROTECT_FROM_MISSILES);
                0;
            }
        }
        k.a((List<Prayer>)var1_1);
        0;
        return 0;
    }

    @Inject
    public PrayerSwitchTask(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.ac = f2;
        this.ad = squireFightCavesConfig;
        this.ae = n2;
    }

    private static Map<Prayer, List<Prayer>> y() {
        HashMap<Prayer, List<Prayer>> hashMap = new HashMap<Prayer, List<Prayer>>();
        hashMap.put(Prayer.AUGURY, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.MYSTIC_MIGHT, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.RIGOUR, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.EAGLE_EYE, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.PIETY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.CHIVALRY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.ULTIMATE_STRENGTH, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));
        0;
        hashMap.put(Prayer.STEEL_SKIN, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY));
        0;
        hashMap.put(Prayer.INCREDIBLE_REFLEXES, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));
        0;
        hashMap.put(Prayer.PROTECT_FROM_MELEE, List.of(Prayer.PROTECT_FROM_MAGIC, Prayer.PROTECT_FROM_MISSILES));
        0;
        hashMap.put(Prayer.PROTECT_FROM_MAGIC, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MISSILES));
        0;
        hashMap.put(Prayer.PROTECT_FROM_MISSILES, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MAGIC));
        0;
        return hashMap;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = 0;
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = 0;
        while (var26 < var25) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(List<Prayer> list) {
        void var1_1;
        if ((Rand.nextInt((int)0 == (int)var1[16]), 9)) {
            return 0;
        }
        HashSet var28 = new HashSet();
        Map<Prayer, List<Prayer>> var29 = k.y();
        Prayer[] var30 = Prayer.values();
        int var31 = var30.length;
        int var32 = 0;
        while (var32 < var31) {
            List<Prayer> var33;
            Prayer var34 = var30[var32];
            if ((var33.contains(var34 == 0) ? 1 : 0) && (k.alllllllllllllllIlIlIIIIIlIIIlIll)) {
                Prayers.toggle((Prayer)var34, (boolean)9);
                var28.addAll(var29.getOrDefault(var34, Collections.emptyList()));
                0;
            }
            ++var32;
            0;
            if (1 <= (0xC ^ 8)) continue;
            return ((0x9E ^ 0xBE) & ~(0x19 ^ 0x39)) != 0;
        }
        boolean bl = k.a(list, 0, (Set<Prayer>)var1_1);
        k.a(list, 9, (Set<Prayer>)var1_1);
        0;
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(List<Prayer> list, boolean bl, Set<Prayer> set) {
        int n2 = 0;
        Iterator<Prayer> var35 = list.iterator();
        while (true) {
            void var36;
            void var37;
            int var38;
            if ((var35.hasNext( == 0) ? 1 : 0)) {
                return var38 != 0;
            }
            Prayer var39 = var35.next();
            if (!(var39 != lllllllllllllllIlIlIIIIIIlllllll2) || ((int == 0)var37) && !(var36.contains(var39 == 0) ? 1 : 0)) continue;
            if ((k.a(var39 == 0) ? 1 : 0) && ((int == 0)var37)) {
                if ((k.a(var39 == 0) ? 1 : 0)) {
                    var38 = 9;
                    0;
                    if ((3 & (3 ^ -1)) > 0) {
                        return ((0x54 ^ 0x53 ^ (0xBC ^ 0xAB)) & (0 + 122 - 31 + 44 ^ 110 + 41 - 54 + 54 ^ -1)) != 0;
                    }
                }
            } else {
                Prayers.toggle((Prayer)var39, (boolean)9);
            }
            0;
            if (((0xC8 ^ 0xC5 ^ (0x4F ^ 0x71)) & (123 + 155 - 198 + 99 ^ 78 + 42 - 79 + 87 ^ -1)) >= 2) break;
        }
        return ((3 + 136 - -26 + 25 ^ 118 + 46 - 49 + 37) & (0x14 ^ 0x4F ^ (0x19 ^ 0x64) ^ -1)) != 0;
    }

    static {
        k.var40();
        k.var41();
        af = var1[18];
    }

        catch (Exception var47) {
            var47.printStackTrace();
            return null;
        }
    }

}

