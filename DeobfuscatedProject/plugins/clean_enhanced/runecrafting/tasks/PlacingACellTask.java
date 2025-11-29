/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Placing a cell", priority=3, blocking=true)
public class PlacingACellTask
extends RunecraftingTaskBase {
    private static final  Comparator<TileObject> be;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0x1D ^ 0x4A ^ (0x45 ^ 0x17)) > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public PlacingACellTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        cArray[2] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var4_4;
        TileObject var13;
        int var14;
        int n2;
        v var15;
        void var16;
        Item item = this.aV.e();
        if (!(this.aV.g( != 0) ? 1 : 0) || item == null) {
            return 1;
        }
        if ((var16.getName( != 0).contains(var2[1]) ? 1 : 0) && (var15.aW.craftGuardian( != 0) ? 1 : 0)) {
            return 1;
        }
        Player var17 = Players.getLocal();
        if (!(SquireGOTRPlugin.g.contains((Locatable == 0)var17) ? 1 : 0) || (SquireGOTRPlugin.h.contains(LocatablelllllllllllllllIlIIlIllllllIIlIl) ? 1 : 0)) {
            return 1;
        }
        if ((var16.getName( != 0).contains(var2[2]) ? 1 : 0)) {
            n2 = 3;
            0;
            if (-3 > 0) {
                return ((3 ^ 0x1E) & ~(0x4E ^ 0x53)) != 0;
            }
        } else {
            n2 = var14 = 4;
        }
        if ((var13 = TileObject == nullTileObjects.getAll(tileObject -> tileObject.getName().contains(var2[5])).stream().min(be.thenComparing(TileObject::getId).thenComparing(tileObject -> tileObject.distanceTo((Locatable)var17))).orElse(null))) {
            return 1;
        }
        if ((var13.distanceTo((Locatable)var17) > var14)) {
            return 1;
        }
        if ((var17.isMoving( != 0) ? 1 : 0)) {
            return 2;
        }
        var4_4.interact(var2[0]);
        return 2;
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    static {
        v.var24();
        v.var25();
        be = (tileObject, tileObject2) -> {
            void var4_4;
            int n2;
            int n3;
            void var26;
            void var27;
            NPC nPC2 = NPCs.getNearest((WorldPoint)tileObject.getWorldLocation(), nPC -> {
                boolean bl;
                if (!(nPC.getName( != null)) || (var2[9].equals(nPC.getName( != 0)) ? 1 : 0)) {
                    bl = 2;
                    0;
                    if (((0x74 ^ 0x7A) & ~(0x69 ^ 0x67)) > 0) {
                        return ((0x98 ^ 0xBC) & ~(0x1C ^ 0x38)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            });
            NPC nPC3 = NPCs.getNearest((WorldPoint)tileObject2.getWorldLocation(), nPC -> {
                int n2;
                if (!(nPC.getName( != null)) || (var2[8].equals(nPC.getName( != 0)) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (3 == 2) {
                        return ((0xE1 ^ 0xAF) & ~(0x7D ^ 0x33)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            });
            if (nPC2 == null && nPC3 == null) {
                return 1;
            }
            if var27 == null {
                return 2;
            }
            if var26 == null {
                return 6;
            }
            if ((var27.getHealthRatio() == 6)) {
                n3 = 7;
                0;
                if (-2 >= 0) {
                    return (0xB3 ^ 0xAC) & ~(0x91 ^ 0x8E);
                }
            } else {
                int var28;
                n3 = var28 = var27.getHealthRatio();
            }
            if ((var26.getHealthRatio() == 6)) {
                n2 = 7;
                0;
                if (((0x6A ^ 0x4C ^ 3) & (0x4D ^ 0x71 ^ (0x64 ^ 0x7D) ^ -1)) != 0) {
                    return (3 ^ (0x4B ^ 0x6A)) & (6 + 48 - -97 + 13 ^ 103 + 26 - 88 + 93 ^ -1);
                }
            } else {
                n2 = var26.getHealthRatio();
            }
            int n4 = n2;
            return Integer.compare((int)var4_4, n4);
        };
    }

}

