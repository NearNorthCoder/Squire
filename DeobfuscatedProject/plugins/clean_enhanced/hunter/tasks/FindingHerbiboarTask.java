/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.hunter.tasks;

import com.google.common.collect.Iterables;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum2;
import gg.squire.hunter.tasks.CheckingSuppliesTask;
import gg.squire.hunter.tasks.GameEnum5;
import gg.squire.hunter.tasks.GameEnum;
import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.OHelper;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.SquireHerbiboarPlugin;

@TaskDesc(name="Finding Herbiboar")
public class FindingHerbiboarTask
extends Task {
    
    private static final  Logger aj;
    private final  d an;
    private final  SquireHerbiboarPlugin ak;
    private final  SquireHerbiboarConfig al;
    @Inject
    private  i n;
    
    private final  b am;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    private static void var10() {
        var2 = new String[var1[16]];
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[0]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Open";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[1]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[5]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Climb through";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[6]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[8]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Attack";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[3]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Harvest";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[9]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Herbiboar";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[2]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[10]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Climb through";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[11]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Hole";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[12]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Inspect";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[13]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."sack";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[14]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."sack";
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var2[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[15]] = s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o."Open";
    }

    @Inject
    public FindingHerbiboarTask(SquireHerbiboarPlugin squireHerbiboarPlugin, SquireHerbiboarConfig squireHerbiboarConfig, b b2, d d2) {
        this.ak = squireHerbiboarPlugin;
        this.al = squireHerbiboarConfig;
        this.am = b2;
        this.an = d2;
    }

    private void a(TileObject tileObject, String string) {
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var12(tileObject)) {
            tileObject.interact(string);
        }
    }

    private static boolean var12(Object object) {
        return object != null;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var19(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var20(int n2) {
        return n2 != 0;
    }

    private static void var9() {
        var1 = new int[17];
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[0] = (0x19 ^ 0x7B) & ~(0xC9 ^ 0xAB);
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[1] = 1;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[2] = 0x51 ^ 0x35 ^ (0x3F ^ 0x5C);
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[3] = 0x53 ^ 0x62 ^ (0xBD ^ 0x89);
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[4] = 117 + 126 - 42 + 10 ^ 13 + 45 - -73 + 18;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[5] = 2;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[6] = 3;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[7] = 0xFFFFD79E & 0x3EE7;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[8] = 0x2D ^ 0x29;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[9] = 88 + 141 - 186 + 105 ^ 33 + 122 - 49 + 40;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[10] = 0xA0 ^ 0xA8;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[11] = 0x4F ^ 0x46;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[12] = 0x31 ^ 0x3B;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[13] = 0xAB ^ 0xA0;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[14] = 36 + 23 - 0 + 75 ^ 16 + 39 - 47 + 130;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[15] = 0x93 ^ 0x9E;
        s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[16] = 101 + 122 - 113 + 60 ^ 90 + 18 - -50 + 6;
    }

    private static boolean var21(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        n var23;
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(this.ak.f() ? 1 : 0)) {
            return var1[0];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(Bank.isOpen() ? 1 : 0)) {
            return var1[0];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(var23.al.useHerbSack() ? 1 : 0) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(Inventory.contains(item -> {
            int n2;
            if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(item.getName().toLowerCase().contains(var2[var1[14]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[0]] = var2[var1[15]];
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-(0x80 ^ 0x84) <= 0) return n2 != 0;
                    return (1 & ~1) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(var2[var1[13]])).interact(var2[var1[0]]);
            return var1[1];
        }
        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var11(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        c var24 = var23.am.i();
        List<f> var25 = var23.n.z();
        switch (o.ao[var24.ordinal()]) {
            case 1: {
                WorldPoint var26;
                TileObject var27 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(b.l.contains(tileObject.getId()) ? 1 : 0)) {
                        String[] stringArray = new String[var1[1]];
                        stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[0]] = var2[var1[12]];
                        if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = var1[1];
                            0;
                            if (-1 == -1) return n2 != 0;
                            return ((0xEC ^ 0xC6) & ~(0xE9 ^ 0xC3)) != 0;
                        }
                    }
                    n2 = var1[0];
                    return n2 != 0;
                });
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var12(var27)) {
                    var26 = var27.getWorldLocation();
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var22(var26.distanceTo((Locatable)Players.getLocal()), var1[2])) {
                        var23.a(var27, var2[var1[1]]);
                        0;
                        if (((106 + 15 - 63 + 81 ^ 182 + 110 - 179 + 80) & (87 + 75 - 141 + 191 ^ 67 + 136 - 138 + 93 ^ -1)) != 0) {
                            return ((178 + 145 - 195 + 120 ^ 10 + 115 - 70 + 123) & (0x5E ^ 0x6E ^ (0x51 ^ 0x2B) ^ -1)) != 0;
                        }
                    } else {
                        Movement.walkTo((WorldPoint)var26);
                        0;
                    }
                }
            }
            case 2: {
                TileObject var28;
                TileObject var27 = ((f)((Object)Iterables.getLast(var25))).l();
                WorldPoint var26 = var23.n.w().get(var27);
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var21((Object)var23.n.F(), (Object)g.J) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var29(var26.distanceTo((Locatable)Players.getLocal()), var1[3]) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var12(var28 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    String[] stringArray = new String[var1[1]];
                    stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[0]] = var2[var1[10]];
                    if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(tileObject.hasAction(stringArray) ? 1 : 0) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var20(tileObject.getName().equals(var2[var1[11]]) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if (-1 > -1) {
                            return ((0xFC ^ 0xAC) & ~(0xC3 ^ 0x93)) != 0;
                        }
                    } else {
                        n2 = var1[0];
                    }
                    return n2 != 0;
                })) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var19(Skills.getBoostedLevel((SkiSkill.AGILITY), var1[4]) && s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var22(var28.distanceTo((Locatable)var26), var26.distanceTo((Locatable)Players.getLocal()))) {
                    var28.interact(var2[var1[5]]);
                    return var1[1];
                }
                Movement.setDestination((WorldPoint)var27);
                0;
                if (1 > 0) break;
                return ((0x47 ^ 0x37 ^ (0x61 ^ 0xB)) & (0xA1 ^ 0xB1 ^ (0xA3 ^ 0xA9) ^ -1)) != 0;
            }
            case 3: {
                WorldPoint var27 = ((f)((Object)Iterables.getLast(var25))).l();
                TileObject var26 = TileObjects.getNearest((WorldPoint)var27, tileObject -> {
                    String[] stringArray = new String[var1[1]];
                    stringArray[s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var1[0]] = var2[var1[2]];
                    return tileObject.hasAction(stringArray);
                });
                System.out.println(var26.getWorldLocation());
                var26.interact(var2[var1[6]]);
                0;
                if null == null break;
                return ((0x49 ^ 0x72 ^ (0x24 ^ 0x14)) & (0x9A ^ 0x8A ^ (0x81 ^ 0x9A) ^ -1)) != 0;
            }
            case 4: {
                WorldPoint var27 = b.m.get(Vars.getBit((int)var1[7]) - var1[1]);
                TileObject var26 = var23.am.a(var27);
                if (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var22(var27.distanceTo((Locatable)Players.getLocal()), var1[2])) {
                    var23.a(var26, var2[var1[8]]);
                    0;
                    if (((54 + 199 - 22 + 3 ^ 168 + 54 - 172 + 146) & (0xB9 ^ 0xB5 ^ (0x4C ^ 0x6E) ^ -1)) >= -1) break;
                    return ((117 + 154 - 142 + 103 ^ 5 + 68 - 51 + 158) & (0x40 ^ 7 ^ (0xB3 ^ 0xA8) ^ -1)) != 0;
                }
                Movement.setDestination((WorldPoint)var27);
                0;
                if (((20 + 152 - 101 + 135 ^ 73 + 7 - 11 + 62) & (0xD5 ^ 0x82 ^ (0xBF ^ 0xA5) ^ -1)) < 1) break;
                return ((186 + 137 - 174 + 43 ^ 195 + 126 - 265 + 140) & (0x1F ^ 0x2F ^ (0x10 ^ 0x24) ^ -1)) != 0;
            }
            case 5: {
                NPC var27 = NPCs.getNearest(nPC -> nPC.getName().equals(var2[var1[9]]));
                if (!s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var12(var27)) break;
                var27.interact(var2[var1[3]]);
                0;
                if null == null break;
                return ((0x6F ^ 0x2A) & ~(0x59 ^ 0x1C)) != 0;
            }
        }
        return var1[1];
    }

    private static boolean var29(int n2, int n3) {
        return n2 > n3;
    }

    private static String var30(String var31, String var32) {
        var31 = new String(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var33 = new StringBuilder();
        char[] var34 = var32.toCharArray();
        int var35 = var1[0];
        char[] var36 = var31.toCharArray();
        int var37 = var36.length;
        int var38 = var1[0];
        while (s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n.var22(var38, var37)) {
            char var39 = var36[var38];
            var33.append((char)(var39 ^ var34[var35 % var34.length]));
            0;
            ++var35;
            ++var38;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var33);
    }
}

