/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum30;
import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.GameEnum19;
import gg.squire.cox.tasks.CoxTaskBase;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.p;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Crabs", priority=10000, blocking=true, register=true)
public class CrabsTask
extends CoxTaskBase {
    private  n al;
    private  int am;
    private  n ak;
    private  int dB;
    
     List<p> en;

    static {
        bi.llIlllIIllIlIl();
        bi.llIlllIIllIlII();
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bi var1;
        if (bi.llIlllIIllIlll(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bi.llIlllIIlllIIl(Movement.getDestination()) && bi.llIlllIIllIlll(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIlIIlIlII[2];
            }
            Movement.setDestination((WorldPoint)var1.al.bs);
            return lIlIlIIlIlII[1];
        }
        TileObject var2 = var1.cR();
        if (bi.llIlllIIllIllI(var2)) {
            return lIlIlIIlIlII[2];
        }
        if (!bi.llIlllIIlllIlI(var1.bS.isMoving() ? 1 : 0) || bi.llIlllIIllIlll(var1.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIIlIlII[2];
        }
        var1_1.interact(lIlIlIIIlllI[lIlIlIIlIlII[2]]);
        return lIlIlIIlIlII[1];
    }

    private void en() {
        bi var3;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[51]]) ? 1 : 0) && bi.llIlllIIlllIlI(this.D((NPC)nPC) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];

                if (1 < 0) {
                    return ((113 + 83 - 7 + 58 ^ 93 + 64 - 80 + 89) & (0x44 ^ 0x49 ^ (0x2F ^ 0x73) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIIlIlII[2];
            }
            return n2 != 0;
        });
        this.ep();
        if (bi.llIlllIIlllIIl(nPC2.getInteracting())) {
            return;
        }
        if (bi.llIlllIIlllIll(var3.cq.getTickCount() - var3.dB, lIlIlIIlIlII[4])) {
            return;
        }
        nPC2.interact(lIlIlIIIlllI[lIlIlIIlIlII[5]]);
        this.dB = this.cq.getTickCount();
    }

    @Inject
    protected CrabsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIIlIlII[0];
        this.en = new ArrayList<p>();
        this.dB = lIlIlIIlIlII[0];
    }

    private static boolean llIlllIIlllIlI(int n2) {
        return n2 == 0;
    }

    private static void llIlllIIllIlII() {
        lIlIlIIIlllI = new String[lIlIlIIlIlII[60]];
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[2]] = "Enter";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[1]] = "Take";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[5]] = "Attack";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[6]] = "trying to compare crab that doesnt exist";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[7]] = "Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[4]] = "Smash";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[8]] = "Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[9]] = "Equip";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[10]] = "Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[11]] = "Equip";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[12]] = "Wear";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[13]] = "Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[14]] = "Equip";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[15]] = "Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[16]] = "Equip";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[17]] = "Wear";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[19]] = "Adding stunned crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[20]] = "Updating stunned crabs";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[21]] = "Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[23]] = "Found a crab to update";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[24]] = "Cyan";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[25]] = "Black";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[26]] = "Magenta";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[27]] = "Yellow";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[28]] = "Magenta";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[29]] = "Yellow";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[30]] = "Black";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[31]] = "Cyan";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[32]] = "Attack";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[33]] = "no crab?";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[34]] = "Magenta";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[35]] = "Cyan";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[36]] = "Black";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[37]] = "Yellow";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[38]] = "green";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[39]] = "red";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[40]] = "blue";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[41]] = "Magenta";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[42]] = "Cyan";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[43]] = "Black";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[44]] = "Yellow";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[45]] = "Cant find start";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[46]] = "Glowing carving";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[47]] = "Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[48]] = "Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[18]] = "crystal";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[49]] = "Dragon warhammer";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[50]] = "Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[51]] = "Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[52]] = "Hammer";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[53]] = "Take";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[54]] = "Dragon warhammer";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[55]] = "Dragon warhammer";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[56]] = "Passage";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[57]] = "Enter";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[58]] = "Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[59]] = "Jewelled Crab";
    }

    private boolean ev() {
        bi var4;
        int var5 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var5, var4.en.size())) {
            p var6 = var4.en.get(var5);
            if (bi.llIlllIIlllIIl(var6)) {
                if (bi.llIlllIIllIllI(var6.aP())) {

                    if (((0x63 ^ 0x64) & ~(0x9E ^ 0x99)) < 0) {
                        return false;
                    }
                } else {
                    int var7 = var4.cq.getTickCount() - var6.aQ();
                    if (bi.llIlllIIllllIl(var7, lIlIlIIlIlII[18])) {
                        var4.en.clear();
                        return lIlIlIIlIlII[1];
                    }
                }
            }
            ++var5;

            if (2 > 1) continue;
            return false;
        }
        return lIlIlIIlIlII[2];
    }

    private static boolean llIlllIIllIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean em() {
        void var3_3;
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = lIlIlIIlIlII[3];
        if (bi.llIlllIIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIlIIlIlII[2];
        }
        Item var8 = Inventory.getFirst(item -> item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[55]]));
        Item var9 = Equipment.getFirst(item -> item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[54]]));
        if (!bi.llIlllIIllIllI(var8) || bi.llIlllIIlllIIl(var9)) {
            return lIlIlIIlIlII[2];
        }
        if (bi.llIlllIIllIlll(Inventory.isFull() ? 1 : 0)) {
            bi var10;
            var10.co.x();

            return lIlIlIIlIlII[1];
        }
        TileObject var11 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bi.llIlllIIllIlll(tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[52]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIlII[1]];
                stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[53]];
                if (bi.llIlllIIllIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlIlII[1];

                    if (((0x4B ^ 0x5C ^ (0xF0 ^ 0x85)) & (0xF5 ^ 0x9A ^ (0xBC ^ 0xB1) ^ -1)) == 0) return n2 != 0;
                    return ((26 + 17 - -51 + 91 ^ 110 + 149 - 155 + 73) & (0xA8 ^ 0xB2 ^ (0x28 ^ 0x3A) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIIlIlII[2];
            return n2 != 0;
        });
        if (bi.llIlllIIllIllI(var11)) {
            return lIlIlIIlIlII[2];
        }
        var3_3.interact(lIlIlIIIlllI[lIlIlIIlIlII[1]]);
        return lIlIlIIlIlII[1];
    }

    private WorldPoint a(WorldPoint worldPoint, NPC nPC, List<WorldPoint> list) {
        List list2 = worldPoint.createWorldArea(lIlIlIIlIlII[1]).toWorldPointList();
        WorldPoint worldPoint3 = list2.stream().filter(worldPoint2 -> {
            int n2;
            if (bi.llIlllIIllIlll(Reachable.isWalkable((WorldPoint)worldPoint2) ? 1 : 0) && bi.llIlllIIlllIlI(worldPoint2.equals((Object)worldPoint) ? 1 : 0) && bi.llIlllIIlllIlI(list.contains(worldPoint2) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];

                if (((0x40 ^ 0x18) & ~(0x55 ^ 0xD)) < -1) {
                    return false;
                }
            } else {
                n2 = lIlIlIIlIlII[2];
            }
            return n2 != 0;
        }).min(Comparator.comparingDouble(object -> worldPoint.distanceTo2DHypotenuse((WorldPoint)object)).thenComparingDouble(object -> -nPC.distanceTo((WorldPoint)object))).orElse(null);
        return worldPoint3;
    }

    private static  boolean a(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[47]]) ? 1 : 0) && bi.llIlllIIllIlll(nPC.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = lIlIlIIlIlII[1];

            }
        } else {
            n2 = lIlIlIIlIlII[2];
        }
        return n2 != 0;
    }

    private int et() {
        EquipmentSetup equipmentSetup = s.bb();
        return equipmentSetup.get(EquipmentInventorySlot.WEAPON);
    }

    private int er() {
        EquipmentSetup equipmentSetup = s.bc();
        return equipmentSetup.get(EquipmentInventorySlot.CAPE);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIlllIIlllIII(Object object, Object object2) {
        return object == object2;
    }

    private int eq() {
        EquipmentSetup equipmentSetup = s.bc();
        return equipmentSetup.get(EquipmentInventorySlot.WEAPON);
    }

    @Override
    public List<Prayer> ci() {
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[58]]));
        if (bi.llIlllIIllIllI(nPC2)) {
            return null;
        }
        return List.of(Prayer.PROTECT_FROM_MELEE);
    }

    /*
     * WARNING - void declaration
     */
    private boolean D(NPC nPC) {
        bi var12;
        if (bi.llIlllIIllIllI(nPC)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[6]]);
            return lIlIlIIlIlII[2];
        }
        int var13 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var13, var12.en.size())) {
            p var14 = var12.en.get(var13);
            if (bi.llIlllIIlllIIl(var14)) {
                void var15;
                if (bi.llIlllIIllIllI(var14.aP())) {

                    if (1 <= 0) {
                        return ((0x56 ^ 0x21 ^ (0x27 ^ 0x11)) & (163 + 149 - 285 + 226 ^ 1 + 185 - 121 + 123 ^ -1)) != 0;
                    }
                } else if (!bi.llIlllIIlllIlI(var14.aP().equals(var15) ? 1 : 0) || bi.llIlllIIllIlll(var15.getWorldLocation().equals((Object)var14.aP().getWorldLocation()) ? 1 : 0)) {
                    return lIlIlIIlIlII[1];
                }
            }
            ++var13;

            return ((0xA ^ 0x6C ^ (0x9D ^ 0xAF)) & (94 + 47 - 87 + 190 ^ 38 + 132 - 126 + 116 ^ -1)) != 0;
        }
        return lIlIlIIlIlII[2];
    }

    private static boolean llIlllIIllllll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> c(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void var16;
        List var17;
        int var18;
        void var19;
        List<Object> list = new ArrayList<WorldPoint>();
        if (bi.llIlllIIllllll(worldPoint.getWorldX(), worldPoint2.getWorldX())) {
            int n2 = Math.abs(worldPoint2.getWorldY() - worldPoint.getWorldY());
            if (bi.llIlllIIllllIl(worldPoint2.getWorldY(), worldPoint.getWorldY())) {
                list = new WorldArea(worldPoint, lIlIlIIlIlII[1], n2).toWorldPointList();

                if (1 == 3) {
                    return null;
                }
            } else {
                var17 = new WorldArea((WorldPoint)var19, lIlIlIIlIlII[1], var18).toWorldPointList();
            }
        }
        if (bi.llIlllIIllllll(var16.getWorldY(), var19.getWorldY())) {
            var18 = Math.abs(var19.getWorldX() - var16.getWorldX());
            if (bi.llIlllIIllllIl(var19.getWorldX(), var16.getWorldX())) {
                var17 = new WorldArea((WorldPoint)var16, var18, lIlIlIIlIlII[1]).toWorldPointList();

                }
            } else {
                list = new WorldArea((WorldPoint)var19, var18, lIlIlIIlIlII[1]).toWorldPointList();
            }
        }
        list.remove(worldPoint2);

        return list;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (bi.llIlllIIlllIII((Object)this.ak.bw, (Object)N.CRABS)) {
            bl2 = lIlIlIIlIlII[1];

            if ((0x32 ^ 0x36) != (0x8E ^ 0x8A)) {
                return false;
            }
        } else {
            bl2 = lIlIlIIlIlII[2];
        }
        return bl2;
    }

    private int eo() {
        EquipmentSetup equipmentSetup = s.ba();
        return equipmentSetup.get(EquipmentInventorySlot.WEAPON);
    }

    /*
     * WARNING - void declaration
     */
    private void ew() {
        bi var20;
        void var21;
        void var22;
        void var23;
        WorldPoint worldPoint = H.CRABS_BASE_1.c(this.ak);
        WorldPoint worldPoint3 = H.CRABS_BASE_2.c(this.ak);
        WorldPoint worldPoint4 = H.CRABS_MOVABLE_1.c(this.ak);
        WorldPoint worldPoint5 = H.CRABS_MOVABLE_2.c(this.ak);
        WorldPoint worldPoint6 = H.CRABS_MOVABLE_3.c(this.ak);
        WorldPoint worldPoint7 = H.CRABS_MOVABLE_4.c(this.ak);
        if (bi.llIlllIIlllIII((Object)this.ak.bx, (Object)S.TEMPLATE_WEST)) {
            void var24;
            void var25;
            WorldPoint[] worldPointArray = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray[bi.lIlIlIIlIlII[2]] = worldPoint;
            worldPointArray[bi.lIlIlIIlIlII[1]] = worldPoint3;
            worldPointArray[bi.lIlIlIIlIlII[5]] = worldPoint4;
            if (bi.llIlllIIlllIlI(this.a(lIlIlIIIlllI[lIlIlIIlIlII[24]], worldPointArray) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray2 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray2[bi.lIlIlIIlIlII[2]] = var23;
            worldPointArray2[bi.lIlIlIIlIlII[1]] = var22;
            worldPointArray2[bi.lIlIlIIlIlII[5]] = var21;
            if (bi.llIlllIIlllIlI(var20.a(lIlIlIIIlllI[lIlIlIIlIlII[25]], worldPointArray2) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray3 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray3[bi.lIlIlIIlIlII[2]] = var23;
            worldPointArray3[bi.lIlIlIIlIlII[1]] = var22;
            worldPointArray3[bi.lIlIlIIlIlII[5]] = var25;
            if (bi.llIlllIIlllIlI(var20.a(lIlIlIIIlllI[lIlIlIIlIlII[26]], worldPointArray3) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray4 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray4[bi.lIlIlIIlIlII[2]] = var23;
            worldPointArray4[bi.lIlIlIIlIlII[1]] = var22;
            worldPointArray4[bi.lIlIlIIlIlII[5]] = var24;
            if (bi.llIlllIIlllIlI(var20.a(lIlIlIIIlllI[lIlIlIIlIlII[27]], worldPointArray4) ? 1 : 0)) {
                return;
            }
        }
        if (bi.llIlllIIlllIII((Object)var20.ak.bx, (Object)S.TEMPLATE_EAST)) {
            void var26;
            WorldPoint var27 = H.CRABS_SINGLE.c(var20.ak);
            WorldPoint[] worldPointArray = new WorldPoint[lIlIlIIlIlII[1]];
            worldPointArray[bi.lIlIlIIlIlII[2]] = var27;
            if (bi.llIlllIIlllIlI(var20.a(lIlIlIIIlllI[lIlIlIIlIlII[28]], worldPointArray) ? 1 : 0)) {
                if (bi.llIlllIIllIlll(var20.bS.isMoving() ? 1 : 0)) {
                    return;
                }
                WorldPoint[] worldPointArray5 = new WorldPoint[lIlIlIIlIlII[1]];
                worldPointArray5[bi.lIlIlIIlIlII[2]] = var27;
                List<WorldPoint> var28 = var20.a(worldPointArray5);
                NPC var29 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (bi.llIlllIIllIlll(var28.contains(nPC.getWorldLocation()) ? 1 : 0) && bi.llIlllIIlllIlI(nPC.isMoving() ? 1 : 0) && bi.llIlllIIlllIlI(nPC.getWorldLocation().equals((Object)var27) ? 1 : 0)) {
                        n2 = lIlIlIIlIlII[1];

                        if ((0xA ^ 0xE) <= 0) {
                            return false;
                        }
                    } else {
                        n2 = lIlIlIIlIlII[2];
                    }
                    return n2 != 0;
                });
                if (bi.llIlllIIlllIIl(var29)) {
                    WorldPoint var30 = var27.createWorldArea(lIlIlIIlIlII[7]).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(var27))).orElse(null);
                    Movement.setDestination((WorldPoint)var30);
                }
                return;
            }
            WorldPoint[] worldPointArray6 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray6[bi.lIlIlIIlIlII[2]] = var23;
            worldPointArray6[bi.lIlIlIIlIlII[1]] = var22;
            worldPointArray6[bi.lIlIlIIlIlII[5]] = var26;
            if (bi.llIlllIIlllIlI(var20.a(lIlIlIIIlllI[lIlIlIIlIlII[29]], worldPointArray6) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray7 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray7[bi.lIlIlIIlIlII[2]] = var23;
            worldPointArray7[bi.lIlIlIIlIlII[1]] = var22;
            worldPointArray7[bi.lIlIlIIlIlII[5]] = var21;
            if (bi.llIlllIIlllIlI(var20.a(lIlIlIIIlllI[lIlIlIIlIlII[30]], worldPointArray7) ? 1 : 0)) {
                return;
            }
            WorldPoint var28 = H.CRABS_DOUBLE_1.c(var20.ak);
            WorldPoint var29 = H.CRABS_DOUBLE_2.c(var20.ak);
            WorldPoint[] worldPointArray8 = new WorldPoint[lIlIlIIlIlII[5]];
            worldPointArray8[bi.lIlIlIIlIlII[2]] = var28;
            worldPointArray8[bi.lIlIlIIlIlII[1]] = var29;
            if (bi.llIlllIIlllIlI(var20.a(lIlIlIIIlllI[lIlIlIIlIlII[31]], worldPointArray8) ? 1 : 0)) {
                return;
            }
        }
    }

    private static boolean llIlllIIllIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private List<WorldPoint> a(WorldPoint ... worldPointArray) {
        void var6_5;
        void var31;
        void var32;
        ArrayList arrayList = new ArrayList();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[46]]));
        if (bi.llIlllIIllIllI(tileObject2)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[45]]);
            return null;
        }
        WorldPoint var33 = var32.getWorldArea().getCenter();
        ArrayList<WorldPoint> var34 = new ArrayList<WorldPoint>();
        WorldPoint var35 = new WorldPoint(lIlIlIIlIlII[2], lIlIlIIlIlII[2], lIlIlIIlIlII[2]);
        int var36 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var36, ((void)var31).length)) {
            bi var37;
            WorldPoint worldPoint;
            System.out.println("bounce: " + String.valueOf(var35) + " | crab: " + String.valueOf(var31[var36]));
            if (bi.llIlllIIlllIlI(var36)) {
                worldPoint = var33;

            } else {
                worldPoint = var35;
            }
            List<WorldPoint> var38 = var37.c(worldPoint, (WorldPoint)var31[var36]);
            var34.addAll(var38);

            var35 = var38.stream().max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var33))).get();
            ++var36;

            if (1 >= 0) continue;
            return null;
        }
        return var6_5;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(String string, NPC nPC) {
        void var39;
        if (bi.llIlllIIllIllI(nPC)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[33]]);
            return lIlIlIIlIlII[2];
        }
        void var40 = var39;
        int var41 = lIlIlIIlIlII[0];
        switch (var40.hashCode()) {
            case -1801391991: {
                if (!bi.llIlllIIllIlll(var40.equals(lIlIlIIIlllI[lIlIlIIlIlII[34]]) ? 1 : 0)) break;
                var41 = lIlIlIIlIlII[2];

                if (1 != 2) break;
                return ((0x44 ^ 0x2C ^ (0x16 ^ 0x2C)) & (61 + 186 - 107 + 100 ^ 111 + 158 - 200 + 93 ^ -1)) != 0;
            }
            case 2115395: {
                if (!bi.llIlllIIllIlll(var40.equals(lIlIlIIIlllI[lIlIlIIlIlII[35]]) ? 1 : 0)) break;
                var41 = lIlIlIIlIlII[1];

                if (2 == 2) break;
                return ((91 + 131 - 188 + 192 ^ 28 + 30 - -58 + 72) & (0x5B ^ 0x41 ^ (0x56 ^ 0x12) ^ -1)) != 0;
            }
            case 64266207: {
                if (!bi.llIlllIIllIlll(var40.equals(lIlIlIIIlllI[lIlIlIIlIlII[36]]) ? 1 : 0)) break;
                var41 = lIlIlIIlIlII[5];

                if ((0x8E ^ 0xA7 ^ (0x89 ^ 0xA4)) > 1) break;
                return ((0x97 ^ 0xBD ^ (0x4D ^ 0x5D)) & (0x36 ^ 0x76 ^ (0xF3 ^ 0x89) ^ -1)) != 0;
            }
            case -1650372460: {
                if (!bi.llIlllIIllIlll(var40.equals(lIlIlIIIlllI[lIlIlIIlIlII[37]]) ? 1 : 0)) break;
                var41 = lIlIlIIlIlII[6];
            }
        }
        switch (var41) {
            case 0: {
                boolean bl2;
                void var42;
                if (bi.llIlllIIlllIlI(var42.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[38]]) ? 1 : 0)) {
                    bl2 = lIlIlIIlIlII[1];

                    if (3 <= 0) {
                        return ((1 ^ (0x41 ^ 2)) & (7 + 80 - -64 + 82 ^ 129 + 150 - 191 + 83 ^ -1)) != 0;
                    }
                } else {
                    bl2 = lIlIlIIlIlII[2];
                }
                return bl2;
            }
            case 1: {
                boolean bl3;
                void var42;
                if (bi.llIlllIIlllIlI(var42.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[39]]) ? 1 : 0)) {
                    bl3 = lIlIlIIlIlII[1];

                    }
                } else {
                    bl3 = lIlIlIIlIlII[2];
                }
                return bl3;
            }
            case 2: {
                return lIlIlIIlIlII[2];
            }
            case 3: {
                boolean bl4;
                void var42;
                if (bi.llIlllIIlllIlI(var42.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[40]]) ? 1 : 0)) {
                    bl4 = lIlIlIIlIlII[1];

                    if (((0x7F ^ 0x4A) & ~(0xBE ^ 0x8B)) != 0) {
                        return false;
                    }
                } else {
                    bl4 = lIlIlIIlIlII[2];
                }
                return bl4;
            }
        }
        System.out.println("couldnt find color: " + string);
        return lIlIlIIlIlII[2];
    }

    private static boolean llIlllIIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

        return String.valueOf(var43);
    }

    private static boolean llIlllIIlllIIl(Object object) {
        return object != null;
    }

    @Subscribe
    private void a(GraphicChanged graphicChanged) {
        Actor actor = graphicChanged.getActor();
        if (bi.llIlllIIllIlll(actor.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[21]]) ? 1 : 0) && bi.llIlllIIllllll(actor.getGraphic(), lIlIlIIlIlII[22])) {
            this.F((NPC)actor);
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[23]]);
        }
    }

    private void E(NPC nPC) {
        Item item2 = Inventory.getFirst(item -> item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[49]]));
        if (bi.llIlllIIlllIIl(item2)) {
            item2.interact(lIlIlIIIlllI[lIlIlIIlIlII[7]]);
        }
        nPC.interact(lIlIlIIIlllI[lIlIlIIlIlII[4]]);
    }

    private static int llIlllIIllllII(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    private void n(String string) {
        int var44;
        String string2 = string;
        int n2 = lIlIlIIlIlII[0];
        switch (string2.hashCode()) {
            case -1801391991: {
                void var45;
                if (!bi.llIlllIIllIlll(var45.equals(lIlIlIIIlllI[lIlIlIIlIlII[41]]) ? 1 : 0)) break;
                var44 = lIlIlIIlIlII[2];

                if (1 >= -1) break;
                return;
            }
            case 2115395: {
                void var45;
                if (!bi.llIlllIIllIlll(var45.equals(lIlIlIIIlllI[lIlIlIIlIlII[42]]) ? 1 : 0)) break;
                var44 = lIlIlIIlIlII[1];

                if (1 >= 0) break;
                return;
            }
            case 64266207: {
                void var45;
                if (!bi.llIlllIIllIlll(var45.equals(lIlIlIIIlllI[lIlIlIIlIlII[43]]) ? 1 : 0)) break;
                var44 = lIlIlIIlIlII[5];

                if (-2 < 0) break;
                return;
            }
            case -1650372460: {
                void var45;
                if (!bi.llIlllIIllIlll(var45.equals(lIlIlIIIlllI[lIlIlIIlIlII[44]]) ? 1 : 0)) break;
                var44 = lIlIlIIlIlII[6];
            }
        }
        switch (var44) {
            case 0: {
                bi var46;
                var46.es();
                return;
            }
            case 1: {
                bi var46;
                var46.eu();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                bi var46;
                var46.ep();
                return;
            }
        }
    }

    private static boolean llIlllIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private void ep() {
        void var2_2;
        void var47;
        int n2 = this.eo();
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = n2;
        if (bi.llIlllIIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIlIlIIlIlII[1]];
        nArray2[bi.lIlIlIIlIlII[2]] = var47;
        Item var48 = Inventory.getFirst((int[])nArray2);
        if (bi.llIlllIIllIllI(var48)) {
            return;
        }
        String[] stringArray = new String[lIlIlIIlIlII[5]];
        stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[8]];
        stringArray[bi.lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[9]];
        var2_2.interact(stringArray);
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bi.llIlllIIllIlll(tileObject.getName().equals(lIlIlIIIlllI[lIlIlIIlIlII[56]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIlII[1]];
                stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[57]];
                if (bi.llIlllIIllIlll(tileObject.hasAction(stringArray) ? 1 : 0) && bi.llIlllIIllIlll(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIlIIlIlII[1];

                    if (3 == 3) return n2 != 0;
                    return ((3 ^ (0x45 ^ 0x67)) & (38 + 33 - 42 + 132 ^ 24 + 127 - 116 + 93 ^ -1)) != 0;
                }
            }
            n2 = lIlIlIIlIlII[2];
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private void a(WorldPoint worldPoint, boolean bl2, WorldPoint ... worldPointArray) {
        void var6_6;
        void var49;
        void var50;
        void var51;
        void var52;
        bi var53;
        System.out.println(Arrays.toString(worldPointArray));
        List<WorldPoint> list = this.a(worldPointArray);
        NPC nPC2 = NPCs.getNearest((WorldPoint)worldPoint, nPC -> {
            int n2;
            if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[50]]) ? 1 : 0) && bi.llIlllIIlllIIl(nPC.getInteracting()) && bi.llIlllIIllIlll(nPC.getInteracting().equals(this.bS) ? 1 : 0) && bi.llIlllIIlllIlI(this.D((NPC)nPC) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];

                }
            } else {
                n2 = lIlIlIIlIlII[2];
            }
            return n2 != 0;
        });
        if (bi.llIlllIIllIllI(nPC2)) {
            this.en();
            return;
        }
        WorldPoint var54 = var53.a((WorldPoint)var52, (NPC)var51, (List<WorldPoint>)var50);
        if (bi.llIlllIIllIlll((int)var49) && bi.llIlllIIllIlll(var51.getWorldLocation().equals((Object)var52) ? 1 : 0) && bi.llIlllIIlllIlI(bi.llIlllIIllllII(var53.bS.getWorldLocation().distanceTo2DHypotenuse((WorldPoint)var52), 1.0f))) {
            var53.E((NPC)var51);
            return;
        }
        if (bi.llIlllIIllIlll(var51.isMoving() ? 1 : 0) && bi.llIlllIIlllIll(var51.distanceTo((Locatable)var53.bS), lIlIlIIlIlII[6])) {
            return;
        }
        Movement.setDestination((WorldPoint)var6_6);
    }

    @Override
    public boolean cg() {
        bi var55;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[59]]));
        if (bi.llIlllIIllIllI(nPC2)) {
            return this.cS();
        }
        if (bi.llIlllIIllIlll(var55.em() ? 1 : 0)) {
            return lIlIlIIlIlII[1];
        }
        this.ev();

        this.ew();
        return lIlIlIIlIlII[1];
    }

    /*
     * WARNING - void declaration
     */
    private void es() {
        void var3_4;
        bi var56;
        int n2 = this.er();
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = n2;
        if (bi.llIlllIIlllIlI(Equipment.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIIlIlII[1]];
            nArray2[bi.lIlIlIIlIlII[2]] = n2;
            Item item = Inventory.getFirst((int[])nArray2);
            if (bi.llIlllIIlllIIl(item)) {
                String[] stringArray = new String[lIlIlIIlIlII[6]];
                stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[10]];
                stringArray[bi.lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[11]];
                stringArray[bi.lIlIlIIlIlII[5]] = lIlIlIIIlllI[lIlIlIIlIlII[12]];
                item.interact(stringArray);
            }
        }
        int var57 = var56.eq();
        int[] nArray3 = new int[lIlIlIIlIlII[1]];
        nArray3[bi.lIlIlIIlIlII[2]] = var57;
        if (bi.llIlllIIllIlll(Equipment.contains((int[])nArray3) ? 1 : 0)) {
            return;
        }
        int[] nArray4 = new int[lIlIlIIlIlII[1]];
        nArray4[bi.lIlIlIIlIlII[2]] = var57;
        Item var58 = Inventory.getFirst((int[])nArray4);
        if (bi.llIlllIIllIllI(var58)) {
            return;
        }
        int n3 = Static.getItemManager().getItemStats(var57, lIlIlIIlIlII[2]).getEquipment().isTwoHanded();
        if (bi.llIlllIIllIlll(Inventory.isFull() ? 1 : 0) && bi.llIlllIIllIlll(n3)) {
            var56.co.x();

            return;
        }
        String[] stringArray = new String[lIlIlIIlIlII[5]];
        stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[13]];
        stringArray[bi.lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[14]];
        var3_4.interact(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private void eu() {
        void var2_2;
        void var59;
        int n2 = this.et();
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = n2;
        if (bi.llIlllIIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIlIlIIlIlII[1]];
        nArray2[bi.lIlIlIIlIlII[2]] = var59;
        Item var60 = Inventory.getFirst((int[])nArray2);
        if (bi.llIlllIIllIllI(var60)) {
            return;
        }
        String[] stringArray = new String[lIlIlIIlIlII[6]];
        stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[15]];
        stringArray[bi.lIlIlIIlIlII[1]] = lIlIlIIIlllI[lIlIlIIlIlII[16]];
        stringArray[bi.lIlIlIIlIlII[5]] = lIlIlIIIlllI[lIlIlIIlIlII[17]];
        var2_2.interact(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(String string, WorldPoint ... worldPointArray) {
        void var4_4;
        void var61;
        bi var62;
        WorldPoint var63;
        void var64;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bi.llIlllIIllIlll(tileObject.getName().contains(string) ? 1 : 0) && bi.llIlllIIllIlll(tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[18]]) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];

                if (-1 != -1) {
                    return false;
                }
            } else {
                n2 = lIlIlIIlIlII[2];
            }
            return n2 != 0;
        });
        if (bi.llIlllIIllIllI(tileObject2)) {
            return lIlIlIIlIlII[1];
        }
        WorldPoint var65 = new WorldPoint(lIlIlIIlIlII[2], lIlIlIIlIlII[2], lIlIlIIlIlII[2]);
        if (bi.llIlllIIlllIlI(((void)var64).length)) {
            return lIlIlIIlIlII[2];
        }
        int var66 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var66, ((void)var64).length)) {
            NPC nPC2;
            NPC var67;
            var65 = var64[var66];
            var63 = var65;
            List var68 = NPCs.getAll(nPC -> {
                int n2;
                if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[48]]) ? 1 : 0) && bi.llIlllIIllIlll(nPC.getWorldLocation().equals((Object)var63) ? 1 : 0)) {
                    n2 = lIlIlIIlIlII[1];

                    }
                } else {
                    n2 = lIlIlIIlIlII[2];
                }
                return n2 != 0;
            });
            if (bi.llIlllIIllllIl(var68.size(), lIlIlIIlIlII[1])) {
                var67 = var63.createWorldArea(lIlIlIIlIlII[7]).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(var63))).orElse(null);
                Movement.setDestination((WorldPoint)var67);
                return lIlIlIIlIlII[2];
            }
            if (bi.llIlllIIllIlll(var68.isEmpty() ? 1 : 0)) {
                nPC2 = null;

            } else {
                nPC2 = var67 = (NPC)var68.get(lIlIlIIlIlII[2]);
            }
            if (bi.llIlllIIllllll(var66, ((void)var64).length - lIlIlIIlIlII[1])) {

                if (-2 <= 0) break;
                return false;
            }
            if (bi.llIlllIIlllIlI(var62.D(var67) ? 1 : 0)) {
                var62.a(var65, lIlIlIIlIlII[1], (WorldPoint[])Arrays.copyOfRange(var64, lIlIlIIlIlII[2], var66 + lIlIlIIlIlII[1]));
                return lIlIlIIlIlII[2];
            }
            ++var66;

            if (-1 < 2) continue;
            return false;
        }
        if (bi.llIlllIIllIlll(var62.a((String)var61, (NPC)(var63 = NPCs.getNearest(arg_0 -> bi.a(var66 = var65, arg_0)))) ? 1 : 0)) {
            var62.n((String)var61);
            var63.interact(lIlIlIIIlllI[lIlIlIIlIlII[32]]);
            var62.sleep(lIlIlIIlIlII[1]);
            return lIlIlIIlIlII[2];
        }
        this.a((WorldPoint)var4_4, lIlIlIIlIlII[2], worldPointArray);
        return lIlIlIIlIlII[2];
    }

    /*
     * WARNING - void declaration
     */
    private void F(NPC nPC) {
        void var2_2;
        void var69;
        bi var70;
        int var71 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var71, var70.en.size())) {
            NPC var72 = var70.en.get(var71).aP();
            if (bi.llIlllIIlllIIl(var72) && bi.llIlllIIlllIII(var72, var69)) {

                if (3 >= 0) break;
                return;
            }
            ++var71;

            if (-(0x65 ^ 0x60) < 0) continue;
            return;
        }
        if (bi.llIlllIIlllllI(var71, var70.en.size())) {
            var70.en.add(new p((NPC)var69, var70.cq.getTickCount()));

            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[19]]);
            return;
        }
        this.en.get((int)var2_2).q(this.cq.getTickCount());
        System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[20]]);
    }

    private static boolean llIlllIIlllIll(int n2, int n3) {
        return n2 < n3;
    }
}

