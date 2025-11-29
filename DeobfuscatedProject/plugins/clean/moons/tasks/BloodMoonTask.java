/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Animation
 *  net.runelite.api.DynamicObject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.scene.Tiles
 */
package gg.squire.moons.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Animation;
import net.runelite.api.DynamicObject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.scene.Tiles;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="Blood moon")
public class BloodMoonTask
extends Task {
     List<WorldPoint> v;
     List<WorldPoint> s;
    private  long p;
     List<WorldPoint> y;
     List<WorldPoint> u;
    
     List<WorldPoint> w;
     WorldArea q;
     List<WorldPoint> r;
    
     List<WorldPoint> t;
     List<WorldPoint> x;
    private final  SquireMoonsOfPerilConfig o;

    @Inject
    public BloodMoonTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.q = new WorldArea(lIIIIIIlIIIII[0], lIIIIIIlIIIII[1], lIIIIIIlIIIII[2], lIIIIIIlIIIII[3], lIIIIIIlIIIII[4]);
        WorldPoint[] worldPointArray = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        worldPointArray[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArray[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArray[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        this.r = Arrays.asList(worldPointArray);
        WorldPoint[] worldPointArray2 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray2[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        worldPointArray2[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArray2[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArray2[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        this.s = Arrays.asList(worldPointArray2);
        WorldPoint[] worldPointArray3 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray3[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        worldPointArray3[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArray3[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[16], lIIIIIIlIIIII[4]);
        worldPointArray3[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[14], lIIIIIIlIIIII[4]);
        this.t = Arrays.asList(worldPointArray3);
        WorldPoint[] worldPointArray4 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray4[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        worldPointArray4[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArray4[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[10], lIIIIIIlIIIII[4]);
        worldPointArray4[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[7], lIIIIIIlIIIII[4]);
        this.u = Arrays.asList(worldPointArray4);
        WorldPoint[] worldPointArray5 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray5[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        worldPointArray5[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArray5[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[19], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArray5[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[20], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        this.v = Arrays.asList(worldPointArray5);
        WorldPoint[] worldPointArray6 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray6[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        worldPointArray6[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArray6[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[17], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArray6[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[18], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        this.w = Arrays.asList(worldPointArray6);
        WorldPoint[] worldPointArray7 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray7[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        worldPointArray7[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArray7[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[13], lIIIIIIlIIIII[24], lIIIIIIlIIIII[4]);
        worldPointArray7[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[15], lIIIIIIlIIIII[23], lIIIIIIlIIIII[4]);
        this.x = Arrays.asList(worldPointArray7);
        WorldPoint[] worldPointArray8 = new WorldPoint[lIIIIIIlIIIII[5]];
        worldPointArray8[b.lIIIIIIlIIIII[4]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        worldPointArray8[b.lIIIIIIlIIIII[8]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArray8[b.lIIIIIIlIIIII[11]] = new WorldPoint(lIIIIIIlIIIII[6], lIIIIIIlIIIII[22], lIIIIIIlIIIII[4]);
        worldPointArray8[b.lIIIIIIlIIIII[12]] = new WorldPoint(lIIIIIIlIIIII[9], lIIIIIIlIIIII[21], lIIIIIIlIIIII[4]);
        this.y = Arrays.asList(worldPointArray8);
        this.o = squireMoonsOfPerilConfig;
    }

    private static boolean lIIlIlllIIIlllI(int n) {
        return n <= 0;
    }

    private static void lIIlIlllIIIIlll() {
        lIIIIIIIlllIl = new String[lIIIIIIlIIIII[48]];
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[4]] = "Cooked bream";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[8]] = "Cooked bream";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[11]] = "Eat";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[12]] = "Cooked bream";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[5]] = "Out of food & low HP!!";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[26]] = "Quick-escape";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[27]] = "Move to safe spot";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[29]] = "Attacking";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[30]] = "Drink";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[32]] = "Attack";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[33]] = "Avoiding explosions";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[34]] = "Move to safe spot";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[37]] = "Avoiding cat attack";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[38]] = "halberd";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[39]] = "Attacking cat";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[40]] = "Attack";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[43]] = "Moonlight potion";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[44]] = "Moonlight potion";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[45]] = "Stairs";
        b.lIIIIIIIlllIl[b.lIIIIIIlIIIII[46]] = "Quick-escape";
    }

    private  boolean a(NPC nPC, Tile tile) {
        int n;
        if (b.lIIlIlllIIIllII(this.BloodMoonTask(tile.getWorldLocation()) ? 1 : 0) && b.lIIlIlllIIllIlI(tile.getWorldLocation().distanceTo(nPC.getWorldLocation()), lIIIIIIlIIIII[8])) {
            n = lIIIIIIlIIIII[8];

            if (-(0x1B ^ 0x1E) >= 0) {
                return false;
            }
        } else {
            n = lIIIIIIlIIIII[4];
        }
        return n != 0;
    }

    private static boolean lIIlIlllIIllIlI(int n, int n2) {
        return n <= n2;
    }

    private static int lIIlIlllIIIlIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIlllIIllIII(int n, int n2) {
        return n > n2;
    }

    private static  boolean a(Set set, WorldPoint worldPoint) {
        int n;
        if (b.lIIlIlllIIIllII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && b.lIIlIlllIIIlIll(set.contains(worldPoint) ? 1 : 0)) {
            n = lIIIIIIlIIIII[8];

            }
        } else {
            n = lIIIIIIlIIIII[4];
        }
        return n != 0;
    }

    private static boolean lIIlIlllIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlllIIlIIII(int n) {
        return n < 0;
    }

    private static boolean lIIlIlllIIlIlIl(int n) {
        return n >= 0;
    }

    private static boolean lIIlIlllIIlIlII(int n, int n2) {
        return n == n2;
    }

    public boolean run() {
        WorldPoint var1;
        List var2;
        TileObject lllllllllllllllIIIllllIlllIlllII2;
        b var3;
        if (b.lIIlIlllIIIlIll(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIlIIIII[4];
        }
        if (b.lIIlIlllIIIlIll(var3.BloodMoonTask().isFullyEquipped() ? 1 : 0)) {
            if (b.lIIlIlllIIIllII(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIlIIIII[8]];
                stringArray[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[4]];
                if (b.lIIlIlllIIIllII(Inventory.contains((String[])stringArray) ? 1 : 0) && b.lIIlIlllIIIllIl(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && b.lIIlIlllIIIlllI(var3.BloodMoonTask().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[lIIIIIIlIIIII[8]];
                    stringArray2[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[8]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIlllIl[lIIIIIIlIIIII[11]]);
                }
            }
            var3.BloodMoonTask().swap();
        }
        NPC var4 = NPCs.getNearest(nPC -> {
            int n;
            if (b.lIIlIlllIIlIlII(nPC.getId(), lIIIIIIlIIIII[35]) && b.lIIlIlllIIIllII(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIlIIIII[8];

                }
            } else {
                n = lIIIIIIlIIIII[4];
            }
            return n != 0;
        });
        NPC var5 = NPCs.getNearest(nPC -> {
            int n;
            if (b.lIIlIlllIIlIlII(nPC.getId(), lIIIIIIlIIIII[47]) && b.lIIlIlllIIIllII(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIlIIIII[8];

                if (((0xE6 ^ 0xBD) & ~(0x3A ^ 0x61)) != 0) {
                    return false;
                }
            } else {
                n = lIIIIIIlIIIII[4];
            }
            return n != 0;
        });
        int[] nArray = new int[lIIIIIIlIIIII[8]];
        nArray[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
        TileObject var6 = TileObjects.getNearest((int[])nArray);
        String[] stringArray = new String[lIIIIIIlIIIII[8]];
        stringArray[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[12]];
        if (b.lIIlIlllIIIlIll(Inventory.contains((String[])stringArray) ? 1 : 0) && b.lIIlIlllIIIllll(var4) && b.lIIlIlllIIIllll(var6) && b.lIIlIlllIIlIIII(b.lIIlIlllIIIlIIl(Combat.getHealthPercent(), 40.0))) {
            SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[5]];
            lllllllllllllllIIIllllIlllIlllII2 = TileObjects.getNearest(tileObject -> {
                int n;
                if (b.lIIlIlllIIIllII(tileObject.getName().contains(lIIIIIIIlllIl[lIIIIIIlIIIII[45]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIlIIIII[8]];
                    stringArray[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[46]];
                    if (b.lIIlIlllIIIllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = lIIIIIIlIIIII[8];

                        if (-1 < 0) return n != 0;
                        return false;
                    }
                }
                n = lIIIIIIlIIIII[4];
                return n != 0;
            });
            if (b.lIIlIlllIIIllIl(lllllllllllllllIIIllllIlllIlllII2)) {
                lllllllllllllllIIIllllIlllIlllII2.interact(lIIIIIIIlllIl[lIIIIIIlIIIII[26]]);
                return lIIIIIIlIIIII[4];
            }
        }
        if (b.lIIlIlllIIIllll(var4) && b.lIIlIlllIIIllIl(var5)) {
            int lllllllllllllllIIIllllIlllIlllII2 = var3.BloodMoonTask(var5.getWorldLocation()) ? 1 : 0;
            if (b.lIIlIlllIIIlIll(lllllllllllllllIIIllllIlllIlllII2)) {
                SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[27]];
                Movement.setDestination((WorldPoint)var5.getWorldLocation());
                return lIIIIIIlIIIII[4];
            }
            if (b.lIIlIlllIIIllII(lllllllllllllllIIIllllIlllIlllII2)) {
                int[] nArray2 = new int[lIIIIIIlIIIII[8]];
                nArray2[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[28];
                var2 = NPCs.getNearest((int[])nArray2);
                if (b.lIIlIlllIIIllIl(var2)) {
                    SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[29]];
                    if (b.lIIlIlllIIIllII(l.l() ? 1 : 0) && b.lIIlIlllIIIllII(Inventory.contains(item -> item.getName().contains(lIIIIIIIlllIl[lIIIIIIlIIIII[44]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIIIIIlllIl[lIIIIIIlIIIII[43]])).interact(lIIIIIIIlllIl[lIIIIIIlIIIII[30]]);
                        return lIIIIIIlIIIII[4];
                    }
                    int[] nArray3 = new int[lIIIIIIlIIIII[8]];
                    nArray3[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[31];
                    if (b.lIIlIlllIIIllII(Equipment.contains((int[])nArray3) ? 1 : 0) && b.lIIlIlllIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.THIRD)) {
                        Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
                        return lIIIIIIlIIIII[4];
                    }
                    var2.interact(lIIIIIIIlllIl[lIIIIIIlIIIII[32]]);
                    return lIIIIIIlIIIII[8];
                }
            }
        }
        if (b.lIIlIlllIIIllll(var4) && b.lIIlIlllIIIllIl(var6)) {
            lllllllllllllllIIIllllIlllIlllII2 = var3.c();
            var2 = Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIlIIIII[27]).toWorldPointList();
            var1 = var2.stream().filter(arg_0 -> b.a((Set)lllllllllllllllIIIllllIlllIlllII2, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (b.lIIlIlllIIIlIll(lllllllllllllllIIIllllIlllIlllII2.isEmpty() ? 1 : 0) && b.lIIlIlllIIIllIl(var1)) {
                SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[33]];
                Movement.setDestination((WorldPoint)var1);
                return lIIIIIIlIIIII[4];
            }
        }
        if (b.lIIlIlllIIIllIl(var4) && b.lIIlIlllIIIllIl(var5)) {
            int lllllllllllllllIIIllllIlllIlllII2 = var3.BloodMoonTask(var5.getWorldLocation()) ? 1 : 0;
            if (b.lIIlIlllIIIlIll(lllllllllllllllIIIllllIlllIlllII2)) {
                SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[34]];
                Movement.setDestination((WorldPoint)var5.getWorldLocation());
                return lIIIIIIlIIIII[4];
            }
            if (b.lIIlIlllIIIllII(lllllllllllllllIIIllllIlllIlllII2)) {
                Object var7;
                int[] nArray4 = new int[lIIIIIIlIIIII[8]];
                nArray4[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[35];
                var2 = NPCs.getNearest((int[])nArray4);
                int[] nArray5 = new int[lIIIIIIlIIIII[8]];
                nArray5[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
                var1 = TileObjects.getNearest((int[])nArray5);
                if (b.lIIlIlllIIIllIl(var1)) {
                    int var8 = b.a((TileObject)var1);
                    if (b.lIIlIlllIIlIlII(var8, lIIIIIIlIIIII[36])) {
                        ++var3.p;
                    }
                    if (b.lIIlIlllIIlIlIl(b.lIIlIlllIIIlIlI(var3.p, 3L))) {
                        int[] nArray6 = new int[lIIIIIIlIIIII[8]];
                        nArray6[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
                        var7 = TileObjects.getNearest((int[])nArray6);
                        if (b.lIIlIlllIIIllIl(var7)) {
                            SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[37]];
                            Movement.setDestination((WorldPoint)var7.getWorldLocation());
                            Time.sleepTicks((int)lIIIIIIlIIIII[8]);

                            var3.p = 0L;
                            return lIIIIIIlIIIII[8];
                        }
                    }
                }
                if (b.lIIlIlllIIIllIl(var2)) {
                    List var8;
                    String[] stringArray3 = new String[lIIIIIIlIIIII[8]];
                    stringArray3[b.lIIIIIIlIIIII[4]] = lIIIIIIIlllIl[lIIIIIIlIIIII[38]];
                    if (b.lIIlIlllIIIllII(Equipment.contains((String[])stringArray3) ? 1 : 0) && b.lIIlIlllIIllIII(Players.getLocal().getWorldLocation().distanceTo(var2.getWorldLocation()), lIIIIIIlIIIII[8]) && b.lIIlIlllIIIlIll((var7 = (var8 = Tiles.getAll().stream().filter(arg_0 -> b.BloodMoonTask((NPC)var2, arg_0)).collect(Collectors.toList())).stream().filter(arg_0 -> var3.a((NPC)var2, arg_0)).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)((Tile)var7.get(lIIIIIIlIIIII[4])).getWorldLocation());
                        return lIIIIIIlIIIII[4];
                    }
                    SquireMoonsOfPeril.g = lIIIIIIIlllIl[lIIIIIIlIIIII[39]];
                    var2.interact(lIIIIIIIlllIl[lIIIIIIlIIIII[40]]);
                    return lIIIIIIlIIIII[8];
                }
            }
        }
        return lIIIIIIlIIIII[8];
    }

    public static int a(TileObject tileObject) {
        Animation animation;
        GameObject gameObject = (GameObject)tileObject;
        if (b.lIIlIlllIIIllIl(gameObject) && b.lIIlIlllIIIllII(gameObject.getRenderable() instanceof DynamicObject) && b.lIIlIlllIIIllIl(animation = ((DynamicObject)gameObject.getRenderable()).getAnimation())) {
            return animation.getId();
        }
        return lIIIIIIlIIIII[41];
    }

    public EquipmentSetup BloodMoonTask() {
        return (EquipmentSetup)this.o.bloodMoonGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIlllIIIllIl(Object object) {
        return object != null;
    }

    private static int lIIlIlllIIIlIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIIlIlllIIIllII(int n) {
        return n != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean BloodMoonTask(WorldPoint worldPoint) {
        List[] listArray = new List[lIIIIIIlIIIII[30]];
        listArray[b.lIIIIIIlIIIII[4]] = this.r;
        listArray[b.lIIIIIIlIIIII[8]] = this.s;
        listArray[b.lIIIIIIlIIIII[11]] = this.t;
        listArray[b.lIIIIIIlIIIII[12]] = this.u;
        listArray[b.lIIIIIIlIIIII[5]] = this.v;
        listArray[b.lIIIIIIlIIIII[26]] = this.w;
        listArray[b.lIIIIIIlIIIII[27]] = this.x;
        listArray[b.lIIIIIIlIIIII[29]] = this.y;
        Iterator<List> var9 = Arrays.asList(listArray).iterator();
        while (b.lIIlIlllIIIllII(var9.hasNext() ? 1 : 0)) {
            void var10;
            List var11 = var9.next();
            if (b.lIIlIlllIIIllII(var11.contains(var10) ? 1 : 0) && b.lIIlIlllIIIllII(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return lIIIIIIlIIIII[8];
            }

            if (1 >= 0) continue;
            return ((0xAB ^ 0x8A ^ (0xDA ^ 0xB6)) & (178 + 134 - 230 + 134 ^ 32 + 96 - 122 + 143 ^ -1)) != 0;
        }
        return lIIIIIIlIIIII[4];
    }

    private static  boolean BloodMoonTask(NPC nPC, Tile tile) {
        boolean bl;
        if (b.lIIlIlllIIlllII(tile.getWorldLocation().distanceTo(nPC.getWorldLocation()), lIIIIIIlIIIII[42])) {
            bl = lIIIIIIlIIIII[8];

            if (((0xA6 ^ 0xB0) & ~(6 ^ 0x10)) != 0) {
                return false;
            }
        } else {
            bl = lIIIIIIlIIIII[4];
        }
        return bl;
    }

        return String.valueOf(var12);
    }

    private Set<WorldPoint> c() {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        int[] nArray = new int[lIIIIIIlIIIII[8]];
        nArray[b.lIIIIIIlIIIII[4]] = lIIIIIIlIIIII[25];
        List list = TileObjects.getAll((int[])nArray);
        list.forEach(tileObject -> {
            hashSet.add(tileObject.getWorldLocation());

        });
        return hashSet;
    }

    private static boolean lIIlIlllIIIlIll(int n) {
        return n == 0;
    }

    static {
        b.lIIlIlllIIIlIII();
        b.lIIlIlllIIIIlll();
    }

    private static boolean lIIlIlllIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlllIIlllII(int n, int n2) {
        return n < n2;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.q.contains(worldPoint);
    }
}

