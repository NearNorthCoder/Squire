/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
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
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
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
import net.unethicalite.client.Static;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="Blue moon")
public class BlueMoonTask
extends Task {
     WorldArea E;
     WorldArea G;
     WorldArea F;
    private final  SquireMoonsOfPerilConfig z;
     WorldArea C;
     WorldArea D;
     WorldArea I;
    private  int A;
     WorldArea H;
    
     WorldArea q;
     WorldArea B;

        return String.valueOf(var1);
    }

    private static void lIIlIllIllIIIlI() {
        lIIIIIIIlIllI = new String[lIIIIIIIllIIl[52]];
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[4]] = "Cooked bream";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[21]] = "Cooked bream";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[22]] = "Eat";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[23]] = "Cooked bream";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[24]] = "Out of food & low HP!!";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[25]] = "Quick-escape";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[26]] = "Move to safe spot";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[28]] = "Attacking";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[29]] = "Drink";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[30]] = "Attack";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[31]] = "Lighting brazier";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[32]] = "Light";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[35]] = "Lit, going to middle";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[38]] = "Avoiding ice";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[39]] = "Attacking frozen wep";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[40]] = "Attack";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[41]] = "Avoiding ice";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[42]] = "Brazier";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[43]] = "Light";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[44]] = "Moonlight potion";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[45]] = "Moonlight potion";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[47]] = "Stairs";
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[48]] = "Quick-escape";
    }

    private static boolean lIIlIllIlllIIII(Object object) {
        return object == null;
    }

    private static  boolean b(Set set, WorldPoint worldPoint) {
        int n;
        if (c.lIIlIllIllIllIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && c.lIIlIllIllIllII(set.contains(worldPoint) ? 1 : 0)) {
            n = lIIIIIIIllIIl[21];

            }
        } else {
            n = lIIIIIIIllIIl[4];
        }
        return n != 0;
    }

    private static boolean lIIlIllIlllIIll(int n, int n2) {
        return n > n2;
    }

    @Inject
    public BlueMoonTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.q = new WorldArea(lIIIIIIIllIIl[0], lIIIIIIIllIIl[1], lIIIIIIIllIIl[2], lIIIIIIIllIIl[3], lIIIIIIIllIIl[4]);
        this.B = new WorldArea(new WorldPoint(lIIIIIIIllIIl[5], lIIIIIIIllIIl[6], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[7], lIIIIIIIllIIl[8], lIIIIIIIllIIl[4]));
        this.C = new WorldArea(new WorldPoint(lIIIIIIIllIIl[9], lIIIIIIIllIIl[10], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[11], lIIIIIIIllIIl[12], lIIIIIIIllIIl[4]));
        this.D = new WorldArea(new WorldPoint(lIIIIIIIllIIl[9], lIIIIIIIllIIl[13], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[11], lIIIIIIIllIIl[14], lIIIIIIIllIIl[4]));
        this.E = new WorldArea(new WorldPoint(lIIIIIIIllIIl[5], lIIIIIIIllIIl[15], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[7], lIIIIIIIllIIl[16], lIIIIIIIllIIl[4]));
        this.F = new WorldArea(new WorldPoint(lIIIIIIIllIIl[17], lIIIIIIIllIIl[15], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[18], lIIIIIIIllIIl[16], lIIIIIIIllIIl[4]));
        this.G = new WorldArea(new WorldPoint(lIIIIIIIllIIl[19], lIIIIIIIllIIl[13], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[20], lIIIIIIIllIIl[14], lIIIIIIIllIIl[4]));
        this.H = new WorldArea(new WorldPoint(lIIIIIIIllIIl[19], lIIIIIIIllIIl[10], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[20], lIIIIIIIllIIl[12], lIIIIIIIllIIl[4]));
        this.I = new WorldArea(new WorldPoint(lIIIIIIIllIIl[17], lIIIIIIIllIIl[6], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[18], lIIIIIIIllIIl[8], lIIIIIIIllIIl[4]));
        this.z = squireMoonsOfPerilConfig;
    }

    private static int lIIlIllIllIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIllIlllIllI(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIllIlllIIlI(int n) {
        return n < 0;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.z.blueMoonGear().selected(EquipmentSetup.class);
    }

    static {
        c.lIIlIllIllIIlll();
        c.lIIlIllIllIIIlI();
    }

    public boolean run() {
        List lllllllllllllllIIIlllllIlIlIIlll2;
        Collection<Object> var2;
        Object var3;
        NPC var4;
        c var5;
        if (c.lIIlIllIllIllII(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIIllIIl[4];
        }
        if (c.lIIlIllIllIllII(var5.b().isFullyEquipped() ? 1 : 0)) {
            if (c.lIIlIllIllIllIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIllIIl[21]];
                stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[4]];
                if (c.lIIlIllIllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0) && c.lIIlIllIllIlllI(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && c.lIIlIllIllIllll(var5.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[lIIIIIIIllIIl[21]];
                    stringArray2[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIlIllI[lIIIIIIIllIIl[22]]);
                }
            }
            var5.b().swap();
        }
        NPC var6 = NPCs.getNearest(nPC -> {
            int n;
            if (c.lIIlIllIlllIllI(nPC.getId(), lIIIIIIIllIIl[51]) && c.lIIlIllIllIllIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIIllIIl[21];

                if (-(0x6D ^ 0x47 ^ (0x9A ^ 0xB4)) >= 0) {
                    return ((0x82 ^ 0x84 ^ (0x75 ^ 0x61)) & (136 + 56 - 94 + 65 ^ 78 + 28 - 14 + 85 ^ -1)) != 0;
                }
            } else {
                n = lIIIIIIIllIIl[4];
            }
            return n != 0;
        });
        NPC var7 = NPCs.getNearest(nPC -> {
            int n;
            if (c.lIIlIllIlllIllI(nPC.getId(), lIIIIIIIllIIl[49]) && c.lIIlIllIlllIllI(nPC.getAnimation(), lIIIIIIIllIIl[50])) {
                n = lIIIIIIIllIIl[21];

                if (2 <= 1) {
                    return ((0x5E ^ 0x76 ^ (0x11 ^ 9)) & (0x90 ^ 0xBF ^ (0x84 ^ 0x9B) ^ -1)) != 0;
                }
            } else {
                n = lIIIIIIIllIIl[4];
            }
            return n != 0;
        });
        String[] stringArray = new String[lIIIIIIIllIIl[21]];
        stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[23]];
        if (c.lIIlIllIllIllII(Inventory.contains((String[])stringArray) ? 1 : 0) && c.lIIlIllIlllIIII(var6) && c.lIIlIllIlllIIII(var7) && c.lIIlIllIlllIIlI(c.lIIlIllIllIlIlI(Combat.getHealthPercent(), 40.0))) {
            SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[24]];
            var4 = TileObjects.getNearest(tileObject -> {
                int n;
                if (c.lIIlIllIllIllIl(tileObject.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[47]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIllIIl[21]];
                    stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[48]];
                    if (c.lIIlIllIllIllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = lIIIIIIIllIIl[21];

                        if (null == null) return n != 0;
                        return false;
                    }
                }
                n = lIIIIIIIllIIl[4];
                return n != 0;
            });
            if (c.lIIlIllIllIlllI(var4)) {
                var4.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[25]]);
                return lIIIIIIIllIIl[4];
            }
        }
        if (c.lIIlIllIllIlllI(var4 = NPCs.getNearest(nPC -> {
            int n;
            if (c.lIIlIllIlllIllI(nPC.getId(), lIIIIIIIllIIl[46]) && c.lIIlIllIllIllIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIIllIIl[21];

                if (2 == 1) {
                    return ((0xCC ^ 0xC1 ^ (0x99 ^ 0x9F)) & (0xC5 ^ 0x80 ^ (0x8B ^ 0xC5) ^ -1)) != 0;
                }
            } else {
                n = lIIIIIIIllIIl[4];
            }
            return n != 0;
        }))) {
            var3 = var5.d(var4.getWorldLocation());
            if (c.lIIlIllIllIllII(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[26]];
                Movement.setDestination((WorldPoint)var4.getWorldLocation());
                return lIIIIIIIllIIl[4];
            }
            if (c.lIIlIllIllIllIl(var3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[lIIIIIIIllIIl[21]];
                nArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIllIIl[27];
                var2 = NPCs.getNearest((int[])nArray);
                if (c.lIIlIllIllIlllI(var2)) {
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[28]];
                    if (c.lIIlIllIllIllIl(l.l() ? 1 : 0) && c.lIIlIllIllIllIl(Inventory.contains(item -> item.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[45]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[44]])).interact(lIIIIIIIlIllI[lIIIIIIIllIIl[29]]);
                        return lIIIIIIIllIIl[4];
                    }
                    var2.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[30]]);
                    return lIIIIIIIllIIl[21];
                }
            }
        }
        if (c.lIIlIllIllIlllI(var6)) {
            if (c.lIIlIllIllIllII(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return lIIIIIIIllIIl[21];
            }
            var3 = TileObjects.getNearest(tileObject -> {
                int n;
                if (c.lIIlIllIllIllIl(tileObject.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[42]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIllIIl[21]];
                    stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[43]];
                    if (c.lIIlIllIllIllIl(tileObject.hasAction(stringArray) ? 1 : 0) && c.lIIlIllIllIllIl(this.a(tileObject.getWorldLocation()) ? 1 : 0)) {
                        n = lIIIIIIIllIIl[21];

                        if (((0xA6 ^ 0xBF) & ~(0x5E ^ 0x47)) < 2) return n != 0;
                        return false;
                    }
                }
                n = lIIIIIIIllIIl[4];
                return n != 0;
            });
            if (c.lIIlIllIllIlllI(var3)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[31]];
                var3.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[32]]);
                return lIIIIIIIllIIl[21];
            }
            if (c.lIIlIllIlllIIII(var3)) {
                var2 = new WorldPoint(lIIIIIIIllIIl[33], lIIIIIIIllIIl[34], lIIIIIIIllIIl[4]);
                if (c.lIIlIllIlllIIll(Players.getLocal().getWorldLocation().distanceTo(var2), lIIIIIIIllIIl[24])) {
                    WorldArea lllllllllllllllIIIlllllIlIlIIlll2 = new WorldArea(lIIIIIIIllIIl[5], lIIIIIIIllIIl[6], lIIIIIIIllIIl[24], lIIIIIIIllIIl[23], lIIIIIIIllIIl[4]);
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[35]];
                    Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIIlll2.getRandom());
                    return lIIIIIIIllIIl[21];
                }
            }
        }
        if (c.lIIlIllIllIlllI(var7)) {
            var3 = var5.BlueMoonTask(lIIIIIIIllIIl[36]);
            var2 = var5.BlueMoonTask(lIIIIIIIllIIl[37]);
            lllllllllllllllIIIlllllIlIlIIlll2 = Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIIllIIl[26]).toWorldPointList();
            WorldPoint var8 = lllllllllllllllIIIlllllIlIlIIlll2.stream().filter(arg_0 -> c.BlueMoonTask((Set)var3, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (c.lIIlIllIllIllII(var3.isEmpty() ? 1 : 0) && c.lIIlIllIllIlllI(var8)) {
                if (c.lIIlIllIlllIlII(var5.A, lIIIIIIIllIIl[22])) {
                    var5.A += lIIIIIIIllIIl[21];
                    Time.sleepTicks((int)lIIIIIIIllIIl[21]);

                    Time.sleep((long)300L);

                }
                if (c.lIIlIllIlllIlIl(var5.A, lIIIIIIIllIIl[22])) {
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[38]];
                    Movement.setDestination((WorldPoint)var8);
                    var5.A = lIIIIIIIllIIl[4];
                    return lIIIIIIIllIIl[4];
                }
            }
            if (!c.lIIlIllIllIllII(var3.isEmpty() ? 1 : 0) || c.lIIlIllIllIllIl(var2.isEmpty() ? 1 : 0)) {
                var5.A = lIIIIIIIllIIl[4];
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[39]];
                var7.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[40]]);
                return lIIIIIIIllIIl[21];
            }
        }
        if (c.lIIlIllIlllIIII(var7)) {
            var3 = var5.BlueMoonTask(lIIIIIIIllIIl[36]);
            var2 = Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIIllIIl[26]).toWorldPointList();
            lllllllllllllllIIIlllllIlIlIIlll2 = var2.stream().filter(arg_0 -> c.b((Set)var3, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (c.lIIlIllIllIllII(var3.isEmpty() ? 1 : 0) && c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIIlll2)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[41]];
                Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIIlll2);
                var5.A = lIIIIIIIllIIl[4];
                return lIIIIIIIllIIl[4];
            }
        }
        return lIIIIIIIllIIl[21];
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea d(WorldPoint worldPoint) {
        void var9;
        WorldArea[] worldAreaArray = new WorldArea[lIIIIIIIllIIl[29]];
        worldAreaArray[c.lIIIIIIIllIIl[4]] = this.B;
        worldAreaArray[c.lIIIIIIIllIIl[21]] = this.C;
        worldAreaArray[c.lIIIIIIIllIIl[22]] = this.D;
        worldAreaArray[c.lIIIIIIIllIIl[23]] = this.E;
        worldAreaArray[c.lIIIIIIIllIIl[24]] = this.F;
        worldAreaArray[c.lIIIIIIIllIIl[25]] = this.G;
        worldAreaArray[c.lIIIIIIIllIIl[26]] = this.H;
        worldAreaArray[c.lIIIIIIIllIIl[28]] = this.I;
        List<WorldArea> list = Arrays.asList(worldAreaArray);
        WorldArea worldArea = null;
        int var10 = lIIIIIIIllIIl[4];
        while (c.lIIlIllIlllIlII(var10, var9.size())) {
            void var11;
            if (c.lIIlIllIllIllIl(((WorldArea)var9.get(var10)).contains((WorldPoint)var11) ? 1 : 0)) {
                WorldArea var12 = (WorldArea)var9.get(var10);

                if (-(0x94 ^ 0x90) < 0) break;
                return null;
            }
            ++var10;

            if (-(0x82 ^ 0x86) <= 0) continue;
            return null;
        }
        return worldArea;
    }

    private static boolean lIIlIllIllIlllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIllIlllIlII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIllIllIllII(int n) {
        return n == 0;
    }

    private static  boolean BlueMoonTask(Set set, WorldPoint worldPoint) {
        int n;
        if (c.lIIlIllIllIllIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && c.lIIlIllIllIllII(set.contains(worldPoint) ? 1 : 0)) {
            n = lIIIIIIIllIIl[21];

            if (((0xD ^ 0x38) & ~(0xAF ^ 0x9A)) > (0xB8 ^ 0xBC)) {
                return false;
            }
        } else {
            n = lIIIIIIIllIIl[4];
        }
        return n != 0;
    }

    private static boolean lIIlIllIllIllIl(int n) {
        return n != 0;
    }

    private static boolean lIIlIllIllIllll(int n) {
        return n <= 0;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.q.contains(worldPoint);
    }

    private Set<WorldPoint> BlueMoonTask(int n) {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        Static.getClient().getGraphicsObjects().forEach(graphicsObject -> {
            if (c.lIIlIllIlllIllI(graphicsObject.getId(), n)) {
                hashSet.add(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)graphicsObject.getLocation()));

            }
        });
        return hashSet;
    }

    private static boolean lIIlIllIlllIlIl(int n, int n2) {
        return n >= n2;
    }
}

