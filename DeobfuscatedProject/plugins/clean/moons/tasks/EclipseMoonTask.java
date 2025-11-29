/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.moons.tasks.LHelper;

@TaskDesc(name="Eclipse moon")
public class EclipseMoonTask
extends Task {
    
     WorldArea Q;
     WorldArea E;
     WorldArea G;
     WorldArea H;
    private static  Set<WorldPoint> P;
     WorldArea F;
     WorldArea C;
    private final  SquireMoonsOfPerilConfig O;
     WorldArea B;
    
     WorldArea D;
     WorldArea I;

    private static boolean lIIlIlllIllIlll(int n, int n2) {
        return n < n2;
    }

    static {
        g.lIIlIlllIlIllll();
        g.lIIlIlllIlIlllI();
        P = new HashSet<WorldPoint>();
    }

    @Inject
    public EclipseMoonTask(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.Q = new WorldArea(lIIIIIIlIIlII[0], lIIIIIIlIIlII[1], lIIIIIIlIIlII[2], lIIIIIIlIIlII[3], lIIIIIIlIIlII[4]);
        this.B = new WorldArea(new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[6], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[7], lIIIIIIlIIlII[8], lIIIIIIlIIlII[4]));
        this.C = new WorldArea(new WorldPoint(lIIIIIIlIIlII[9], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[11], lIIIIIIlIIlII[12], lIIIIIIlIIlII[4]));
        this.D = new WorldArea(new WorldPoint(lIIIIIIlIIlII[13], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[14], lIIIIIIlIIlII[12], lIIIIIIlIIlII[4]));
        this.E = new WorldArea(new WorldPoint(lIIIIIIlIIlII[15], lIIIIIIlIIlII[6], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[16], lIIIIIIlIIlII[8], lIIIIIIlIIlII[4]));
        this.F = new WorldArea(new WorldPoint(lIIIIIIlIIlII[15], lIIIIIIlIIlII[17], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[16], lIIIIIIlIIlII[18], lIIIIIIlIIlII[4]));
        this.G = new WorldArea(new WorldPoint(lIIIIIIlIIlII[13], lIIIIIIlIIlII[19], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[14], lIIIIIIlIIlII[20], lIIIIIIlIIlII[4]));
        this.H = new WorldArea(new WorldPoint(lIIIIIIlIIlII[9], lIIIIIIlIIlII[19], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[11], lIIIIIIlIIlII[20], lIIIIIIlIIlII[4]));
        this.I = new WorldArea(new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[17], lIIIIIIlIIlII[4]), new WorldPoint(lIIIIIIlIIlII[7], lIIIIIIlIIlII[18], lIIIIIIlIIlII[4]));
        this.O = squireMoonsOfPerilConfig;
    }

    private static boolean lIIlIlllIllIllI(int n, int n2) {
        return n != n2;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea d(WorldPoint worldPoint) {
        void var2;
        WorldArea[] worldAreaArray = new WorldArea[lIIIIIIlIIlII[35]];
        worldAreaArray[g.lIIIIIIlIIlII[4]] = this.B;
        worldAreaArray[g.lIIIIIIlIIlII[21]] = this.C;
        worldAreaArray[g.lIIIIIIlIIlII[22]] = this.D;
        worldAreaArray[g.lIIIIIIlIIlII[23]] = this.E;
        worldAreaArray[g.lIIIIIIlIIlII[25]] = this.F;
        worldAreaArray[g.lIIIIIIlIIlII[26]] = this.G;
        worldAreaArray[g.lIIIIIIlIIlII[28]] = this.H;
        worldAreaArray[g.lIIIIIIlIIlII[29]] = this.I;
        List<WorldArea> list = Arrays.asList(worldAreaArray);
        WorldArea worldArea = null;
        int var3 = lIIIIIIlIIlII[4];
        while (g.lIIlIlllIllIlll(var3, var2.size())) {
            void var4;
            if (g.lIIlIlllIllIIIl(((WorldArea)var2.get(var3)).contains((WorldPoint)var4) ? 1 : 0)) {
                WorldArea var5 = (WorldArea)var2.get(var3);

                if (null == null) break;
                return null;
            }
            ++var3;

            if (-1 < 2) continue;
            return null;
        }
        return worldArea;
    }

    private static boolean lIIlIlllIllIIII(int n) {
        return n == 0;
    }

    private static boolean lIIlIlllIllIIIl(int n) {
        return n != 0;
    }

    public boolean run() {
        WorldPoint var6;
        WorldPoint lllllllllllllllIIIllllIIlIIllIII2;
        NPC lllllllllllllllIIIllllIIlIIllIIl2;
        WorldPoint lllllllllllllllIIIllllIIlIIllIlI2;
        NPC var7;
        NPC var8;
        g var9;
        if (g.lIIlIlllIllIIII(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIlIIlII[4];
        }
        if (g.lIIlIlllIllIIII(var9.b().isFullyEquipped() ? 1 : 0)) {
            if (g.lIIlIlllIllIIIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIlIIlII[21]];
                stringArray[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIIll[lIIIIIIlIIlII[4]];
                if (g.lIIlIlllIllIIIl(Inventory.contains((String[])stringArray) ? 1 : 0) && g.lIIlIlllIllIIlI(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && g.lIIlIlllIllIIll(var9.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[lIIIIIIlIIlII[21]];
                    stringArray2[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIIll[lIIIIIIlIIlII[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIlIIIll[lIIIIIIlIIlII[22]]);
                }
            }
            var9.b().swap();
        }
        if (g.lIIlIlllIllIIlI(var8 = NPCs.getNearest(nPC -> {
            int n;
            if (g.lIIlIlllIllIlIl(nPC.getId(), lIIIIIIlIIlII[39]) && g.lIIlIlllIllIIIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIlIIlII[21];

                if ((0x1F ^ 0x1B) < 0) {
                    return false;
                }
            } else {
                n = lIIIIIIlIIlII[4];
            }
            return n != 0;
        })) && g.lIIlIlllIllIIlI(var7 = var9.d(var8.getWorldLocation()))) {
            if (g.lIIlIlllIllIIII(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[23]];
                Movement.setDestination((WorldPoint)var8.getWorldLocation());
                return lIIIIIIlIIlII[4];
            }
            if (g.lIIlIlllIllIIIl(var7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[lIIIIIIlIIlII[21]];
                nArray[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIlII[24];
                lllllllllllllllIIIllllIIlIIllIlI2 = NPCs.getNearest((int[])nArray);
                if (g.lIIlIlllIllIIlI(lllllllllllllllIIIllllIIlIIllIlI2)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[25]];
                    if (g.lIIlIlllIllIIIl(l.l() ? 1 : 0) && g.lIIlIlllIllIIIl(Inventory.contains(item -> item.getName().contains(lIIIIIIlIIIll[lIIIIIIlIIlII[38]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIIIIlIIIll[lIIIIIIlIIlII[37]])).interact(lIIIIIIlIIIll[lIIIIIIlIIlII[26]]);
                        return lIIIIIIlIIlII[4];
                    }
                    int[] nArray2 = new int[lIIIIIIlIIlII[21]];
                    nArray2[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIlII[27];
                    if (g.lIIlIlllIllIIIl(Equipment.contains((int[])nArray2) ? 1 : 0) && g.lIIlIlllIllIlII(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                        Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
                        return lIIIIIIlIIlII[4];
                    }
                    lllllllllllllllIIIllllIIlIIllIlI2.interact(lIIIIIIlIIIll[lIIIIIIlIIlII[28]]);
                    return lIIIIIIlIIlII[21];
                }
            }
        }
        if (g.lIIlIlllIllIIlI(var7 = NPCs.getNearest(nPC -> {
            int n;
            if (g.lIIlIlllIllIlIl(nPC.getId(), lIIIIIIlIIlII[36]) && g.lIIlIlllIllIIIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIlIIlII[21];

                if (((105 + 46 - 94 + 97 ^ 95 + 147 - 126 + 78) & (0xC ^ 0x5F ^ (0xAF ^ 0xA4) ^ -1)) != 0) {
                    return ((0x5A ^ 0x5F ^ (0x96 ^ 0xC5)) & (47 + 211 - 249 + 203 ^ 82 + 56 - 89 + 81 ^ -1)) != 0;
                }
            } else {
                n = lIIIIIIlIIlII[4];
            }
            return n != 0;
        }))) {
            if (g.lIIlIlllIllIIIl(var7.isMoving() ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[29]];
                if (g.lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals((Object)var7.getWorldLocation()) ? 1 : 0)) {
                    int lllllllllllllllIIIllllIIlIIllIlI2 = lIIIIIIlIIlII[4];
                    int lllllllllllllllIIIllllIIlIIllIIl2 = lIIIIIIlIIlII[4];
                    if (g.lIIlIlllIllIlIl(var7.getWorldLocation().getY(), lIIIIIIlIIlII[19]) && g.lIIlIlllIllIllI(var7.getWorldLocation().getX(), lIIIIIIlIIlII[15])) {
                        lllllllllllllllIIIllllIIlIIllIlI2 = lIIIIIIlIIlII[30];
                    }
                    if (g.lIIlIlllIllIlIl(var7.getWorldLocation().getX(), lIIIIIIlIIlII[5])) {
                        lllllllllllllllIIIllllIIlIIllIIl2 = lIIIIIIlIIlII[21];
                    }
                    if (g.lIIlIlllIllIlIl(var7.getWorldLocation().getY(), lIIIIIIlIIlII[10]) && g.lIIlIlllIllIllI(var7.getWorldLocation().getX(), lIIIIIIlIIlII[15])) {
                        lllllllllllllllIIIllllIIlIIllIlI2 = lIIIIIIlIIlII[21];
                    }
                    if (g.lIIlIlllIllIlIl(var7.getWorldLocation().getX(), lIIIIIIlIIlII[15])) {
                        lllllllllllllllIIIllllIIlIIllIIl2 = lIIIIIIlIIlII[30];
                    }
                    WorldPoint lllllllllllllllIIIllllIIlIIllIII2 = new WorldPoint(var7.getWorldLocation().getX() + lllllllllllllllIIIllllIIlIIllIlI2, var7.getWorldLocation().getY() + lllllllllllllllIIIllllIIlIIllIIl2, lIIIIIIlIIlII[4]);
                    Movement.setDestination((WorldPoint)lllllllllllllllIIIllllIIlIIllIII2);
                    return lIIIIIIlIIlII[21];
                }
            }
            if (g.lIIlIlllIllIIII(var7.isMoving() ? 1 : 0)) {
                lllllllllllllllIIIllllIIlIIllIlI2 = new WorldPoint(lIIIIIIlIIlII[15], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]);
                if (g.lIIlIlllIllIIIl(var7.getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIlI2) ? 1 : 0)) {
                    lllllllllllllllIIIllllIIlIIllIIl2 = new WorldPoint(lIIIIIIlIIlII[16], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]);
                    if (g.lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIIl2) ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)lllllllllllllllIIIllllIIlIIllIIl2);
                        return lIIIIIIlIIlII[21];
                    }
                }
                lllllllllllllllIIIllllIIlIIllIIl2 = new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[10], lIIIIIIlIIlII[4]);
                if (g.lIIlIlllIllIIIl(var7.getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIIl2) ? 1 : 0)) {
                    lllllllllllllllIIIllllIIlIIllIII2 = new WorldPoint(lIIIIIIlIIlII[7], lIIIIIIlIIlII[31], lIIIIIIlIIlII[4]);
                    if (g.lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIII2) ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)lllllllllllllllIIIllllIIlIIllIII2);
                        return lIIIIIIlIIlII[21];
                    }
                }
                lllllllllllllllIIIllllIIlIIllIII2 = new WorldPoint(lIIIIIIlIIlII[5], lIIIIIIlIIlII[19], lIIIIIIlIIlII[4]);
                if (g.lIIlIlllIllIIIl(var7.getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIII2) ? 1 : 0)) {
                    var6 = new WorldPoint(lIIIIIIlIIlII[32], lIIIIIIlIIlII[20], lIIIIIIlIIlII[4]);
                    if (g.lIIlIlllIllIIII(Players.getLocal().getWorldLocation().equals((Object)var6) ? 1 : 0)) {
                        Movement.setDestination((WorldPoint)var6);
                        return lIIIIIIlIIlII[21];
                    }
                }
            }
        }
        lllllllllllllllIIIllllIIlIIllIlI2 = new WorldPoint(lIIIIIIlIIlII[33], lIIIIIIlIIlII[34], lIIIIIIlIIlII[4]);
        if (g.lIIlIlllIllIIIl(Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllIIIllllIIlIIllIlI2) ? 1 : 0)) {
            SquireMoonsOfPeril.g = lIIIIIIlIIIll[lIIIIIIlIIlII[35]];
            int[] nArray = new int[lIIIIIIlIIlII[21]];
            nArray[g.lIIIIIIlIIlII[4]] = lIIIIIIlIIlII[24];
            lllllllllllllllIIIllllIIlIIllIIl2 = NPCs.getNearest((int[])nArray);
            if (g.lIIlIlllIllIIlI(lllllllllllllllIIIllllIIlIIllIIl2)) {
                P.add(lllllllllllllllIIIllllIIlIIllIIl2.getWorldLocation());

            }
            if (g.lIIlIlllIllIIII(SquireMoonsOfPeril.j.isEmpty() ? 1 : 0) && g.lIIlIlllIllIIIl((lllllllllllllllIIIllllIIlIIllIII2 = SquireMoonsOfPeril.j.iterator()).hasNext() ? 1 : 0)) {
                var6 = lllllllllllllllIIIllllIIlIIllIII2.next();
                Movement.setDestination((WorldPoint)var6);
                lllllllllllllllIIIllllIIlIIllIII2.remove();
                Time.sleepTicks((int)lIIIIIIlIIlII[21]);

                return lIIIIIIlIIlII[21];
            }
        }
        return lIIIIIIlIIlII[21];
    }

    private static boolean lIIlIlllIllIlII(Object object, Object object2) {
        return object != object2;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.Q.contains(worldPoint);
    }

    private static boolean lIIlIlllIllIIll(int n) {
        return n <= 0;
    }

    private static void lIIlIlllIlIlllI() {
        lIIIIIIlIIIll = new String[lIIIIIIlIIlII[40]];
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[4]] = "Cooked bream";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[21]] = "Cooked bream";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[22]] = "Eat";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[23]] = "Move to safe spot";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[25]] = "Attacking";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[26]] = "Drink";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[28]] = "Attack";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[29]] = "Walking with moon";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[35]] = "Turning spec";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[37]] = "Moonlight potion";
        g.lIIIIIIlIIIll[g.lIIIIIIlIIlII[38]] = "Moonlight potion";
    }

    private static boolean lIIlIlllIllIlIl(int n, int n2) {
        return n == n2;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.O.eclipseGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIlIlllIllIIlI(Object object) {
        return object != null;
    }

}

