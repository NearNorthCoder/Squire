/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.GameEnum2;

@TaskDesc(name="Going to house (mid trip)", priority=300, blocking=true)
public class GoingToHouseMidTripTask
extends Task {
    private final  SquireBarrowsConfig ac;
    private final  Client ae;
    private final  SquireBarrows ab;
    
    private final  c ad;

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2) {
        return n2 > 0;
    }

    private static void var11() {
        var2 = new int[8];
        s.var2[0] = (0x13 ^ 0x5E) & ~(0x37 ^ 0x7A);
        s.var2[1] = 130 + 124 - 167 + 75 ^ 3 + 120 - 26 + 67;
        s.var2[2] = 0xE9 ^ 0xA5 ^ (0x67 ^ 0x2E);
        s.var2[3] = 0x9A ^ 0x83;
        s.var2[4] = 1;
        s.var2[5] = 0x33 ^ 0x65 ^ (0x36 ^ 0x6A);
        s.var2[6] = 2;
        s.var2[7] = 0xDB ^ 0xC1 ^ (0x6E ^ 0x7C);
    }

    private static boolean var12(Object object, Object object2) {
        return object != object2;
    }

    static {
        s.var11();
        s.var13();
    }

    private boolean N() {
        boolean bl;
        s var14;
        if (s.var15(this.ac.neverRisk() ? 1 : 0)) {
            return var2[0];
        }
        if (!s.var15(var14.ab.m() ? 1 : 0) || s.var16(var14.ab.h() ? 1 : 0)) {
            return var2[0];
        }
        Actor var17 = Players.getLocal().getInteracting();
        if (s.var18(var17)) {
            boolean bl2;
            NPC var19 = NPCs.getNearest(nPC -> {
                boolean bl;
                if (s.var3(nPC.getInteracting(), Players.getLocal())) {
                    bl = var2[4];
                    0;
                    if (1 < 1) {
                        return ((0xEA ^ 0x8B) & ~(0x5A ^ 0x3B)) != 0;
                    }
                } else {
                    bl = var2[0];
                }
                return bl;
            });
            if (s.var18(var19)) {
                return var2[4];
            }
            if (!s.var15(d.a((Actor)var19) ? 1 : 0) || s.var20(var19.getHealthRatio(), var2[5])) {
                bl2 = var2[4];
                0;
                if (-2 > 0) {
                    return ((0x7D ^ 0x2D) & ~(0xCE ^ 0x9E)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }
        if (s.var15(var17 instanceof Player)) {
            return var2[0];
        }
        List<NPC> var19 = var14.ad.b(var14.ab.d());
        if (s.var15(var19.contains((NPC)var17) ? 1 : 0)) {
            return var2[4];
        }
        if (s.var15(var17.getName().equals(d.DHAROK.C()) ? 1 : 0)) {
            return var2[0];
        }
        if (!s.var15(d.a((Actor)((NPC)var17)) ? 1 : 0) || s.var20(var17.getHealthRatio(), var2[5])) {
            bl = var2[4];
            0;
            if (2 > 3) {
                return ((0xD ^ 0x13) & ~(0x34 ^ 0x2A)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    public boolean run() {
        s var21;
        if (s.var12(Game.getState(), GameState.LOGGED_IN)) {
            return var2[0];
        }
        if (s.var16(var21.ac.restoreMidTrip() ? 1 : 0)) {
            return var2[0];
        }
        if (s.var15(var21.ae.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (s.var22(var21.ab.e(), var2[1])) {
            return var2[0];
        }
        if (s.var15(var21.N() ? 1 : 0)) {
            return var2[0];
        }
        int var23 = Prayers.getPoints();
        int var24 = Skills.getLevel((SkiSkill.PRAYER) - var23;
        if (s.var22(var21.ab.e(), var2[2]) && s.var25(var24, var2[3]) && s.var16(var21.ab.h() ? 1 : 0)) {
            Log.info((String)var1[var2[0]]);
            TeleportLoader.enterHouse();
            0;
            return var2[4];
        }
        if (s.var10(var23)) {
            return var2[0];
        }
        Item var26 = Inventory.getFirst(item -> item.getName().startsWith(var1[var2[4]]));
        NPC var27 = NPCs.getNearest(nPC -> {
            int n2;
            if (s.var3(nPC.getInteracting(), Players.getLocal()) && s.var15(d.a((Actor)nPC) ? 1 : 0)) {
                n2 = var2[4];
                0;
                if (1 <= -1) {
                    return ((0x33 ^ 0x37) & ~(0x64 ^ 0x60)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        });
        if (s.var28(var26) && s.var28(var27)) {
            return var2[0];
        }
        TeleportLoader.enterHouse();
        0;
        return var2[4];
    }

    private static void var13() {
        var1 = new String[var2[6]];
        s.var1[s.var2[0]] = "Going to house (last brother)";
        s.var1[s.var2[4]] = "Prayer";
    }

    private static boolean var20(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public GoingToHouseMidTripTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig, c c2, Client client) {
        this.ab = squireBarrows;
        this.ac = squireBarrowsConfig;
        this.ad = c2;
        this.ae = client;
    }

    private static boolean var28(Object object) {
        return object != null;
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    private static boolean var25(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static boolean var22(int n2, int n3) {
        return n2 == n3;
    }
}

