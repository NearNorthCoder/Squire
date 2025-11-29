/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Killing annoying egg", priority=20, register=true, blocking=true)
public class KillingAnnoyingEggTask
extends AutotoaManager {

    private static final  int eM;
    private static final  Point eL;

    private static void var3() {
        var1 = new String[var2[8]];
        bg.var1[bg.var2[1]] = "Wield";
        bg.var1[bg.var2[3]] = "Attack";
        bg.var1[bg.var2[2]] = "keris";
        bg.var1[bg.var2[4]] = "egg";
        bg.var1[bg.var2[0]] = "Attack";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var2_2;
        bg var4;
        if (!bg.var5(bg.bV() ? 1 : 0) || bg.var6(this.bR() ? 1 : 0)) {
            var4.sleep(var2[0]);
            return var2[1];
        }
        WorldPoint var7 = var4.a(eL);
        NPC var8 = NPCs.getAll(nPC -> {
            int n2;
            if (bg.var6(nPC.getName().toLowerCase().contains(var1[var2[4]]) ? 1 : 0)) {
                String[] stringArray = new String[var2[3]];
                stringArray[bg.var2[1]] = var1[var2[0]];
                if (bg.var6(nPC.hasAction(stringArray) ? 1 : 0) && bg.var6(nPC.getWorldLocation().equals((Object)var7) ? 1 : 0) && bg.var9(nPC.getId(), var2[5]) && bg.var5(nPC.isDead() ? 1 : 0)) {
                    n2 = var2[3];
                    0;
                    if (1 > 0) return n2 != 0;
                    return ((0xD ^ 0x16) & ~(0x18 ^ 3)) != 0;
                }
            }
            n2 = var2[1];
            return n2 != 0;
        }).stream().findFirst().orElse(null);
        if (bg.var10(var8)) {
            return var2[1];
        }
        if (bg.var5(var8.getWorldArea().offset(var2[2]).contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return var2[1];
        }
        Set<WorldPoint> var11 = var4.bU();
        WorldArea var12 = var8.getWorldArea().offset(var2[3]);
        if (bg.var6(var11.stream().anyMatch(worldPoint -> var8.getWorldArea().offset(var2[3]).contains(worldPoint)) ? 1 : 0)) {
            WorldPoint var13 = var12.toWorldPointList().stream().filter(worldPoint -> worldPoint.toWorldArea().isInMeleeDistance(var8.getWorldLocation())).filter(worldPoint -> {
                boolean bl2;
                if (bg.var5(var11.contains(worldPoint) ? 1 : 0)) {
                    bl2 = var2[3];
                    0;
                    if ((0x4B ^ 0x53 ^ (0x6D ^ 0x71)) <= 2) {
                        return ((0x6F ^ 0x27 ^ (0xF7 ^ 0x9A)) & (28 + 65 - 38 + 99 ^ 27 + 126 - 20 + 58 ^ -1)) != 0;
                    }
                } else {
                    bl2 = var2[1];
                }
                return bl2;
            }).findFirst().orElse(null);
            if (bg.var10(var13)) {
                return var2[1];
            }
            Movement.setDestination((WorldPoint)var13);
            return var2[1];
        }
        var4.bp();
        Item var13 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(var1[var2[2]]));
        if (bg.var14(var13)) {
            var13.interact(var1[var2[1]]);
        }
        var2_2.interact(var1[var2[3]]);
        return var2[3];
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[1];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[1];
        while (bg.var21(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    @Inject
    public KillingAnnoyingEggTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void var32() {
        var2 = new int[10];
        bg.var2[0] = 0x67 ^ 0xC ^ (0x65 ^ 0xA);
        bg.var2[1] = (0x94 ^ 0xBE) & ~(0x12 ^ 0x38);
        bg.var2[2] = 2;
        bg.var2[3] = 1;
        bg.var2[4] = 3;
        bg.var2[5] = -(0xFFFFE137 & 0x5EEF) & (0xFFFFFFF6 & 0x6DFF);
        bg.var2[6] = 0x6D ^ 0x72;
        bg.var2[7] = 0x6B ^ 0x34 ^ (0x25 ^ 0x5E);
        bg.var2[8] = 0x84 ^ 0x81;
        bg.var2[9] = 0x17 ^ 0x1F;
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var9(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    static {
        bg.var32();
        bg.var3();
        eM = var2[5];
        eL = new Point(var2[6], var2[7]);
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }
}

