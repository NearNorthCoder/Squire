/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.movement.Reachable;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.GameEnum2;

@TaskDesc(name="Attacking monster for potential", priority=200)
public class AttackingMonsterForPotentialTask
extends Task {
    private final  a ai;
    private final  c aj;
    
    private final  SquireBarrows ah;

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        v var4;
        if (v.var5(this.ah.g() ? 1 : 0)) {
            return var2[0];
        }
        if (v.var6(var4.ah.h() ? 1 : 0)) {
            return var2[0];
        }
        Actor var7 = Players.getLocal().getInteracting();
        if (v.var8(var7) && v.var5(d.a(var7) ? 1 : 0)) {
            return var2[0];
        }
        if (v.var5(var4.ah.AttackingMonsterForPotentialTask() ? 1 : 0)) {
            return var2[0];
        }
        int var9 = var4.aj.d();
        Player var10 = Players.getLocal();
        List var11 = NPCs.getAll(nPC -> {
            int n3;
            if (v.var3(nPC.getInteracting(), var10) && v.var5(this.aj.c(var9).contains(nPC.getName()) ? 1 : 0)) {
                n3 = var2[2];
                0;
                if (1 != 1) {
                    return ((0x4E ^ 0x2E) & ~(0xF ^ 0x6F)) != 0;
                }
            } else {
                n3 = var2[0];
            }
            return n3 != 0;
        });
        NPC var12 = NPCs.getNearest(nPC -> {
            int n2;
            if (v.var3(nPC.getInteracting(), var10) && v.var5(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (-1 > 0) {
                    return ((0x87 ^ 0xB5) & ~(0x2C ^ 0x1E)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (v.var8(var12) && v.var5(var11.contains(var12) ? 1 : 0)) {
            if (v.var6(Gear.isEquipped((int[])var4.ai.B()) ? 1 : 0)) {
                Gear.swapTo((int[])var4.ai.B());
                0;
            }
            if (v.var13(var10.getInteracting(), var12)) {
                var12.interact(var1[var2[0]]);
                var4.sleep(var2[1]);
                return var2[2];
            }
            return var2[0];
        }
        NPC var14 = NPCs.getNearest(nPC -> {
            int n2;
            if (v.var5(var11.contains(nPC) ? 1 : 0) && v.var5(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (((0xC5 ^ 0xBB ^ (0xDE ^ 0xA7)) & (89 + 81 - 139 + 125 ^ 35 + 147 - 34 + 7 ^ -1)) != ((0x79 ^ 0x40 ^ (0x7B ^ 2)) & (21 + 33 - -55 + 20 ^ 156 + 150 - 251 + 138 ^ -1))) {
                    return ((91 + 36 - 15 + 15 ^ (0x6F ^ 0x53)) & (0x48 ^ 0x53 ^ (0x7C ^ 0x24) ^ -1)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (!v.var8(var14) || v.var8(var12) && v.var6(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
            TileObject var15 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (v.var5(tileObject.getName().equals(var1[var2[5]]) ? 1 : 0)) {
                    String[] stringArray = new String[var2[1]];
                    stringArray[v.var2[0]] = var1[var2[6]];
                    stringArray[v.var2[2]] = var1[var2[7]];
                    if (v.var5(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var2[2];
                        0;
                        if (-1 < ((89 + 147 - 85 + 2 ^ 29 + 102 - 7 + 71) & (157 + 221 - 256 + 113 ^ 136 + 21 - 33 + 53 ^ -1))) return n2 != 0;
                        return ((0x55 ^ 0x69 ^ (0x1D ^ 0x6B)) & (0xD ^ 0x23 ^ (0xE7 ^ 0x83) ^ -1)) != 0;
                    }
                }
                n2 = var2[0];
                return n2 != 0;
            });
            if (v.var8(var15) && v.var6(Reachable.isInteractable((Locatable)var15) ? 1 : 0)) {
                return var2[0];
            }
            TileObject var16 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (v.var5(tileObject.getName().equals(var1[var2[3]]) ? 1 : 0)) {
                    String[] stringArray = new String[var2[2]];
                    stringArray[v.var2[0]] = var1[var2[4]];
                    if (v.var5(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var2[2];
                        0;
                        if (-1 != ((9 ^ 0x70 ^ (0xB1 ^ 0xAB)) & (0x75 ^ 0x67 ^ (0x75 ^ 4) ^ -1))) return n2 != 0;
                        return ((14 + 124 - 136 + 208 ^ 14 + 66 - -27 + 37) & (2 ^ (0x33 ^ 0x73) ^ -1)) != 0;
                    }
                }
                n2 = var2[0];
                return n2 != 0;
            });
            if (v.var17(var16)) {
                return var2[0];
            }
            var16.interact(var1[var2[2]]);
            var4.sleep(var2[3]);
            return var2[2];
        }
        var6_6.interact(var1[var2[1]]);
        return var2[0];
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var13(Object object, Object object2) {
        return object != object2;
    }

    private static void var24() {
        var2 = new int[9];
        v.var2[0] = (0xC5 ^ 0xC0 ^ (0x14 ^ 0x26)) & (0x1C ^ 0x6E ^ (0xC4 ^ 0x81) ^ -1);
        v.var2[1] = 2;
        v.var2[2] = 1;
        v.var2[3] = 3;
        v.var2[4] = 140 + 20 - 59 + 65 ^ 77 + 107 - 60 + 38;
        v.var2[5] = 0x25 ^ 0x20;
        v.var2[6] = 0x76 ^ 0x70;
        v.var2[7] = 152 + 51 - 69 + 34 ^ 13 + 150 - 66 + 78;
        v.var2[8] = 0x52 ^ 0x5A;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    static {
        v.var24();
        v.var25();
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    private static boolean var32(int n2, int n3) {
        return n2 < n3;
    }

    private static void var25() {
        var1 = new String[var2[8]];
        v.var1[v.var2[0]] = "Attack";
        v.var1[v.var2[2]] = "Open";
        v.var1[v.var2[1]] = "Attack";
        v.var1[v.var2[3]] = "Door";
        v.var1[v.var2[4]] = "Open";
        v.var1[v.var2[5]] = "Chest";
        v.var1[v.var2[6]] = "Open";
        v.var1[v.var2[7]] = "Search";
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static String var33(String var34, String var35) {
        var34 = new String(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var36 = new StringBuilder();
        char[] var37 = var35.toCharArray();
        int var38 = var2[0];
        char[] var39 = var34.toCharArray();
        int var40 = var39.length;
        int var41 = var2[0];
        while (v.var32(var41, var40)) {
            char var42 = var39[var41];
            var36.append((char)(var42 ^ var37[var38 % var37.length]));
            0;
            ++var38;
            ++var41;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(var36);
    }

    @Inject
    public AttackingMonsterForPotentialTask(SquireBarrows squireBarrows, a a2, c c2) {
        this.ah = squireBarrows;
        this.ai = a2;
        this.aj = c2;
    }
}

