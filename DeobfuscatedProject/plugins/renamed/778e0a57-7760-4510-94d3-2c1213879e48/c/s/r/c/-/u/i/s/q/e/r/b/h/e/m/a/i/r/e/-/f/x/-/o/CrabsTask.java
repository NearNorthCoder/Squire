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
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.HEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.SEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.p;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s_Unknown;
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

/* TASK: Crabs -> CrabsTask */
@TaskDesc(name="Crabs", priority=10000, blocking=true, register=true)
public class CrabsTask
extends U_Unknown {
    private /* synthetic */ n al;
    private /* synthetic */ int am;
    private /* synthetic */ n ak;
    private /* synthetic */ int dB;
    private static /* synthetic */ String[] lIlIlIIIlllI;
    /* synthetic */ List<p> en;
    private static /* synthetic */ int[] lIlIlIIlIlII;

    static {
        bi.llIlllIIllIlIl();
        bi.llIlllIIllIlII();
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bi var88;
        if (bi.llIlllIIllIlll(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bi.llIlllIIlllIIl(Movement.getDestination()) && bi.llIlllIIllIlll(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIlIIlIlII[2];
            }
            Movement.setDestination((WorldPoint)var88.al.bs);
            return lIlIlIIlIlII[1];
        }
        TileObject var53 = var88.cR();
        if (bi.llIlllIIllIllI(var53)) {
            return lIlIlIIlIlII[2];
        }
        if (!bi.llIlllIIlllIlI(var88.bS.isMoving() ? 1 : 0) || bi.llIlllIIllIlll(var88.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIIlIlII[2];
        }
        var1_1.interact(lIlIlIIIlllI[lIlIlIIlIlII[2]]);
        return lIlIlIIlIlII[1];
    }

    private void en() {
        bi var75;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[51]]) ? 1 : 0) && bi.llIlllIIlllIlI(this.D((NPC)nPC) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];
                0;
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
        if (bi.llIlllIIlllIll(var75.cq.getTickCount() - var75.dB, lIlIlIIlIlII[4])) {
            return;
        }
        nPC2.interact(lIlIlIIIlllI[lIlIlIIlIlII[5]]);
        this.dB = this.cq.getTickCount();
    }

    @Inject
    protected bi(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
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
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[2]] = bi."Enter";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[1]] = bi."Take";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[5]] = bi."Attack";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[6]] = bi."trying to compare crab that doesnt exist";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[7]] = bi."Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[4]] = bi."Smash";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[8]] = bi."Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[9]] = bi."Equip";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[10]] = bi."Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[11]] = bi."Equip";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[12]] = bi."Wear";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[13]] = bi."Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[14]] = bi."Equip";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[15]] = bi."Wield";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[16]] = bi."Equip";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[17]] = bi."Wear";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[19]] = bi."Adding stunned crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[20]] = bi."Updating stunned crabs";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[21]] = bi."Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[23]] = bi."Found a crab to update";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[24]] = bi."Cyan";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[25]] = bi."Black";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[26]] = bi."Magenta";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[27]] = bi."Yellow";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[28]] = bi."Magenta";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[29]] = bi."Yellow";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[30]] = bi."Black";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[31]] = bi."Cyan";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[32]] = bi."Attack";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[33]] = bi."no crab?";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[34]] = bi."Magenta";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[35]] = bi."Cyan";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[36]] = bi."Black";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[37]] = bi."Yellow";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[38]] = bi."green";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[39]] = bi."red";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[40]] = bi."blue";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[41]] = bi."Magenta";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[42]] = bi."Cyan";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[43]] = bi."Black";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[44]] = bi."Yellow";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[45]] = bi."Cant find start";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[46]] = bi."Glowing carving";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[47]] = bi."Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[48]] = bi."Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[18]] = bi."crystal";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[49]] = bi."Dragon warhammer";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[50]] = bi."Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[51]] = bi."Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[52]] = bi."Hammer";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[53]] = bi."Take";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[54]] = bi."Dragon warhammer";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[55]] = bi."Dragon warhammer";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[56]] = bi."Passage";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[57]] = bi."Enter";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[58]] = bi."Jewelled Crab";
        bi.lIlIlIIIlllI[bi.lIlIlIIlIlII[59]] = bi."Jewelled Crab";
    }

    private boolean ev() {
        bi var70;
        int var76 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var76, var70.en.size())) {
            p var31 = var70.en.get(var76);
            if (bi.llIlllIIlllIIl(var31)) {
                if (bi.llIlllIIllIllI(var31.aP())) {
                    0;
                    if (((0x63 ^ 0x64) & ~(0x9E ^ 0x99)) < 0) {
                        return false;
                    }
                } else {
                    int var89 = var70.cq.getTickCount() - var31.aQ();
                    if (bi.llIlllIIllllIl(var89, lIlIlIIlIlII[18])) {
                        var70.en.clear();
                        return lIlIlIIlIlII[1];
                    }
                }
            }
            ++var76;
            0;
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
        Item var65 = Inventory.getFirst(item -> item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[55]]));
        Item var77 = Equipment.getFirst(item -> item.getName().startsWith(lIlIlIIIlllI[lIlIlIIlIlII[54]]));
        if (!bi.llIlllIIllIllI(var65) || bi.llIlllIIlllIIl(var77)) {
            return lIlIlIIlIlII[2];
        }
        if (bi.llIlllIIllIlll(Inventory.isFull() ? 1 : 0)) {
            bi var28;
            var28.co.x();
            0;
            return lIlIlIIlIlII[1];
        }
        TileObject var30 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bi.llIlllIIllIlll(tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[52]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlIlII[1]];
                stringArray[bi.lIlIlIIlIlII[2]] = lIlIlIIIlllI[lIlIlIIlIlII[53]];
                if (bi.llIlllIIllIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlIlII[1];
                    0;
                    if (((0x4B ^ 0x5C ^ (0xF0 ^ 0x85)) & (0xF5 ^ 0x9A ^ (0xBC ^ 0xB1) ^ -1)) == 0) return n2 != 0;
                    return ((26 + 17 - -51 + 91 ^ 110 + 149 - 155 + 73) & (0xA8 ^ 0xB2 ^ (0x28 ^ 0x3A) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIIlIlII[2];
            return n2 != 0;
        });
        if (bi.llIlllIIllIllI(var30)) {
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
                0;
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

    private static /* synthetic */ boolean a(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[47]]) ? 1 : 0) && bi.llIlllIIllIlll(nPC.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = lIlIlIIlIlII[1];
            0;
            
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
        bi var21;
        if (bi.llIlllIIllIllI(nPC)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[6]]);
            return lIlIlIIlIlII[2];
        }
        int var16 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var16, var21.en.size())) {
            p var23 = var21.en.get(var16);
            if (bi.llIlllIIlllIIl(var23)) {
                void var85;
                if (bi.llIlllIIllIllI(var23.aP())) {
                    0;
                    if (1 <= 0) {
                        return ((0x56 ^ 0x21 ^ (0x27 ^ 0x11)) & (163 + 149 - 285 + 226 ^ 1 + 185 - 121 + 123 ^ -1)) != 0;
                    }
                } else if (!bi.llIlllIIlllIlI(var23.aP().equals(var85) ? 1 : 0) || bi.llIlllIIllIlll(var85.getWorldLocation().equals((Object)var23.aP().getWorldLocation()) ? 1 : 0)) {
                    return lIlIlIIlIlII[1];
                }
            }
            ++var16;
            0;
            
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
        void var8;
        List var64;
        int var32;
        void var68;
        List<Object> list = new ArrayList<WorldPoint>();
        if (bi.llIlllIIllllll(worldPoint.getWorldX(), worldPoint2.getWorldX())) {
            int n2 = Math.abs(worldPoint2.getWorldY() - worldPoint.getWorldY());
            if (bi.llIlllIIllllIl(worldPoint2.getWorldY(), worldPoint.getWorldY())) {
                list = new WorldArea(worldPoint, lIlIlIIlIlII[1], n2).toWorldPointList();
                0;
                if (1 == 3) {
                    return null;
                }
            } else {
                var64 = new WorldArea((WorldPoint)var68, lIlIlIIlIlII[1], var32).toWorldPointList();
            }
        }
        if (bi.llIlllIIllllll(var8.getWorldY(), var68.getWorldY())) {
            var32 = Math.abs(var68.getWorldX() - var8.getWorldX());
            if (bi.llIlllIIllllIl(var68.getWorldX(), var8.getWorldX())) {
                var64 = new WorldArea((WorldPoint)var8, var32, lIlIlIIlIlII[1]).toWorldPointList();
                0;
                
                }
            } else {
                list = new WorldArea((WorldPoint)var68, var32, lIlIlIIlIlII[1]).toWorldPointList();
            }
        }
        list.remove(worldPoint2);
        0;
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
            0;
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
        bi var35;
        void var83;
        void var87;
        void var10;
        WorldPoint worldPoint = H.CRABS_BASE_1.c(this.ak);
        WorldPoint worldPoint3 = H.CRABS_BASE_2.c(this.ak);
        WorldPoint worldPoint4 = H.CRABS_MOVABLE_1.c(this.ak);
        WorldPoint worldPoint5 = H.CRABS_MOVABLE_2.c(this.ak);
        WorldPoint worldPoint6 = H.CRABS_MOVABLE_3.c(this.ak);
        WorldPoint worldPoint7 = H.CRABS_MOVABLE_4.c(this.ak);
        if (bi.llIlllIIlllIII((Object)this.ak.bx, (Object)S.TEMPLATE_WEST)) {
            void var12;
            void var38;
            WorldPoint[] worldPointArray = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray[bi.lIlIlIIlIlII[2]] = worldPoint;
            worldPointArray[bi.lIlIlIIlIlII[1]] = worldPoint3;
            worldPointArray[bi.lIlIlIIlIlII[5]] = worldPoint4;
            if (bi.llIlllIIlllIlI(this.a(lIlIlIIIlllI[lIlIlIIlIlII[24]], worldPointArray) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray2 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray2[bi.lIlIlIIlIlII[2]] = var10;
            worldPointArray2[bi.lIlIlIIlIlII[1]] = var87;
            worldPointArray2[bi.lIlIlIIlIlII[5]] = var83;
            if (bi.llIlllIIlllIlI(var35.a(lIlIlIIIlllI[lIlIlIIlIlII[25]], worldPointArray2) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray3 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray3[bi.lIlIlIIlIlII[2]] = var10;
            worldPointArray3[bi.lIlIlIIlIlII[1]] = var87;
            worldPointArray3[bi.lIlIlIIlIlII[5]] = var38;
            if (bi.llIlllIIlllIlI(var35.a(lIlIlIIIlllI[lIlIlIIlIlII[26]], worldPointArray3) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray4 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray4[bi.lIlIlIIlIlII[2]] = var10;
            worldPointArray4[bi.lIlIlIIlIlII[1]] = var87;
            worldPointArray4[bi.lIlIlIIlIlII[5]] = var12;
            if (bi.llIlllIIlllIlI(var35.a(lIlIlIIIlllI[lIlIlIIlIlII[27]], worldPointArray4) ? 1 : 0)) {
                return;
            }
        }
        if (bi.llIlllIIlllIII((Object)var35.ak.bx, (Object)S.TEMPLATE_EAST)) {
            void var57;
            WorldPoint var47 = H.CRABS_SINGLE.c(var35.ak);
            WorldPoint[] worldPointArray = new WorldPoint[lIlIlIIlIlII[1]];
            worldPointArray[bi.lIlIlIIlIlII[2]] = var47;
            if (bi.llIlllIIlllIlI(var35.a(lIlIlIIIlllI[lIlIlIIlIlII[28]], worldPointArray) ? 1 : 0)) {
                if (bi.llIlllIIllIlll(var35.bS.isMoving() ? 1 : 0)) {
                    return;
                }
                WorldPoint[] worldPointArray5 = new WorldPoint[lIlIlIIlIlII[1]];
                worldPointArray5[bi.lIlIlIIlIlII[2]] = var47;
                List<WorldPoint> var79 = var35.a(worldPointArray5);
                NPC var46 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (bi.llIlllIIllIlll(var79.contains(nPC.getWorldLocation()) ? 1 : 0) && bi.llIlllIIlllIlI(nPC.isMoving() ? 1 : 0) && bi.llIlllIIlllIlI(nPC.getWorldLocation().equals((Object)var47) ? 1 : 0)) {
                        n2 = lIlIlIIlIlII[1];
                        0;
                        if ((0xA ^ 0xE) <= 0) {
                            return false;
                        }
                    } else {
                        n2 = lIlIlIIlIlII[2];
                    }
                    return n2 != 0;
                });
                if (bi.llIlllIIlllIIl(var46)) {
                    WorldPoint var66 = var47.createWorldArea(lIlIlIIlIlII[7]).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(var47))).orElse(null);
                    Movement.setDestination((WorldPoint)var66);
                }
                return;
            }
            WorldPoint[] worldPointArray6 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray6[bi.lIlIlIIlIlII[2]] = var10;
            worldPointArray6[bi.lIlIlIIlIlII[1]] = var87;
            worldPointArray6[bi.lIlIlIIlIlII[5]] = var57;
            if (bi.llIlllIIlllIlI(var35.a(lIlIlIIIlllI[lIlIlIIlIlII[29]], worldPointArray6) ? 1 : 0)) {
                return;
            }
            WorldPoint[] worldPointArray7 = new WorldPoint[lIlIlIIlIlII[6]];
            worldPointArray7[bi.lIlIlIIlIlII[2]] = var10;
            worldPointArray7[bi.lIlIlIIlIlII[1]] = var87;
            worldPointArray7[bi.lIlIlIIlIlII[5]] = var83;
            if (bi.llIlllIIlllIlI(var35.a(lIlIlIIIlllI[lIlIlIIlIlII[30]], worldPointArray7) ? 1 : 0)) {
                return;
            }
            WorldPoint var79 = H.CRABS_DOUBLE_1.c(var35.ak);
            WorldPoint var46 = H.CRABS_DOUBLE_2.c(var35.ak);
            WorldPoint[] worldPointArray8 = new WorldPoint[lIlIlIIlIlII[5]];
            worldPointArray8[bi.lIlIlIIlIlII[2]] = var79;
            worldPointArray8[bi.lIlIlIIlIlII[1]] = var46;
            if (bi.llIlllIIlllIlI(var35.a(lIlIlIIIlllI[lIlIlIIlIlII[31]], worldPointArray8) ? 1 : 0)) {
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
        void var78;
        void var67;
        ArrayList arrayList = new ArrayList();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[46]]));
        if (bi.llIlllIIllIllI(tileObject2)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[45]]);
            return null;
        }
        WorldPoint var52 = var67.getWorldArea().getCenter();
        ArrayList<WorldPoint> var48 = new ArrayList<WorldPoint>();
        WorldPoint var81 = new WorldPoint(lIlIlIIlIlII[2], lIlIlIIlIlII[2], lIlIlIIlIlII[2]);
        int var2 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var2, ((void)var78).length)) {
            bi var18;
            WorldPoint worldPoint;
            System.out.println("bounce: " + String.valueOf(var81) + " | crab: " + String.valueOf(var78[var2]));
            if (bi.llIlllIIlllIlI(var2)) {
                worldPoint = var52;
                0;
                if (-2 >= 0) {
                    return null;
                }
            } else {
                worldPoint = var81;
            }
            List<WorldPoint> var43 = var18.c(worldPoint, (WorldPoint)var78[var2]);
            var48.addAll(var43);
            0;
            var81 = var43.stream().max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var52))).get();
            ++var2;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return var6_5;
    }

    private static void llIlllIIllIlIl() {
        lIlIlIIlIlII = new int[61];
        bi.lIlIlIIlIlII[0] = -1;
        bi.lIlIlIIlIlII[1] = 1;
        bi.lIlIlIIlIlII[2] = (0x42 ^ 0x59) & ~(0x25 ^ 0x3E);
        bi.lIlIlIIlIlII[3] = 0xFFFF896F & 0x7FBB;
        bi.lIlIlIIlIlII[4] = 0xD ^ 0x73 ^ (0x79 ^ 2);
        bi.lIlIlIIlIlII[5] = 2;
        bi.lIlIlIIlIlII[6] = 3;
        bi.lIlIlIIlIlII[7] = 20 + 24 - 2 + 128 ^ 111 + 149 - 244 + 158;
        bi.lIlIlIIlIlII[8] = 110 + 118 - 149 + 95 ^ 18 + 100 - -31 + 19;
        bi.lIlIlIIlIlII[9] = 0x49 ^ 0x4E;
        bi.lIlIlIIlIlII[10] = 0xFF ^ 0xA6 ^ (0xEF ^ 0xBE);
        bi.lIlIlIIlIlII[11] = 58 + 57 - -26 + 60 ^ 172 + 104 - 111 + 27;
        bi.lIlIlIIlIlII[12] = 0x95 ^ 0x9F;
        bi.lIlIlIIlIlII[13] = 35 + 137 - 68 + 60 ^ 169 + 144 - 176 + 38;
        bi.lIlIlIIlIlII[14] = 3 + 145 - 37 + 69 ^ 154 + 91 - 211 + 150;
        bi.lIlIlIIlIlII[15] = 0xCB ^ 0xC6;
        bi.lIlIlIIlIlII[16] = 0x27 ^ 0x29;
        bi.lIlIlIIlIlII[17] = 0x50 ^ 0x5F;
        bi.lIlIlIIlIlII[18] = 0x94 ^ 0xA6 ^ (0x9C ^ 0x83);
        bi.lIlIlIIlIlII[19] = 0x8F ^ 0x9F;
        bi.lIlIlIIlIlII[20] = 22 + 35 - 47 + 121 ^ 81 + 130 - 127 + 62;
        bi.lIlIlIIlIlII[21] = 0x35 ^ 0x27;
        bi.lIlIlIIlIlII[22] = 13 + 30 - 39 + 241;
        bi.lIlIlIIlIlII[23] = 0xB9 ^ 0xAA;
        bi.lIlIlIIlIlII[24] = 0x16 ^ 2;
        bi.lIlIlIIlIlII[25] = 0xA2 ^ 0xB5 ^ 2;
        bi.lIlIlIIlIlII[26] = 0x40 ^ 0x56;
        bi.lIlIlIIlIlII[27] = 0xD3 ^ 0xA9 ^ (0x59 ^ 0x34);
        bi.lIlIlIIlIlII[28] = 0xA5 ^ 0xA0 ^ (0x7C ^ 0x61);
        bi.lIlIlIIlIlII[29] = 141 + 5 - 57 + 53 ^ 137 + 121 - 186 + 79;
        bi.lIlIlIIlIlII[30] = 0x4D ^ 0x57;
        bi.lIlIlIIlIlII[31] = 77 + 111 - 150 + 110 ^ 123 + 125 - 138 + 33;
        bi.lIlIlIIlIlII[32] = 0x7E ^ 0x62;
        bi.lIlIlIIlIlII[33] = 0x7A ^ 0x55 ^ (0x20 ^ 0x12);
        bi.lIlIlIIlIlII[34] = 0x13 ^ 0xD;
        bi.lIlIlIIlIlII[35] = 81 + 129 - 202 + 211 ^ 69 + 96 - 87 + 118;
        bi.lIlIlIIlIlII[36] = 0x58 ^ 0x62 ^ (0x41 ^ 0x5B);
        bi.lIlIlIIlIlII[37] = 0xB4 ^ 0x95;
        bi.lIlIlIIlIlII[38] = 0x57 ^ 0x38 ^ (0x16 ^ 0x5B);
        bi.lIlIlIIlIlII[39] = 0xA0 ^ 0x83;
        bi.lIlIlIIlIlII[40] = 0x62 ^ 0x46;
        bi.lIlIlIIlIlII[41] = 7 ^ 0x22;
        bi.lIlIlIIlIlII[42] = 0x94 ^ 0xB2;
        bi.lIlIlIIlIlII[43] = 0x20 ^ 7;
        bi.lIlIlIIlIlII[44] = 0xEE ^ 0xC6;
        bi.lIlIlIIlIlII[45] = 0x54 ^ 0x52 ^ (0xE ^ 0x21);
        bi.lIlIlIIlIlII[46] = 0x70 ^ 0x5A;
        bi.lIlIlIIlIlII[47] = 0x94 ^ 0xBF;
        bi.lIlIlIIlIlII[48] = 0x81 ^ 0x88 ^ (0x33 ^ 0x16);
        bi.lIlIlIIlIlII[49] = 0xF4 ^ 0x91 ^ (0xFA ^ 0xB1);
        bi.lIlIlIIlIlII[50] = 68 + 54 - 77 + 130 ^ 72 + 100 - 160 + 116;
        bi.lIlIlIIlIlII[51] = 0x22 ^ 0x5E ^ (0xD4 ^ 0x98);
        bi.lIlIlIIlIlII[52] = 0x59 ^ 0x68;
        bi.lIlIlIIlIlII[53] = 0x1D ^ 0x2F;
        bi.lIlIlIIlIlII[54] = 0x6B ^ 0x58;
        bi.lIlIlIIlIlII[55] = 0x52 ^ 0x6C ^ (0x72 ^ 0x78);
        bi.lIlIlIIlIlII[56] = 0x4F ^ 0x7A;
        bi.lIlIlIIlIlII[57] = 0x32 ^ 4;
        bi.lIlIlIIlIlII[58] = 0x84 ^ 0xB3;
        bi.lIlIlIIlIlII[59] = 0x52 ^ 0x6A;
        bi.lIlIlIIlIlII[60] = 0xED ^ 0x90 ^ (0x30 ^ 0x74);
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(String string, NPC nPC) {
        void var15;
        if (bi.llIlllIIllIllI(nPC)) {
            System.out.println(lIlIlIIIlllI[lIlIlIIlIlII[33]]);
            return lIlIlIIlIlII[2];
        }
        void var74 = var15;
        int var24 = lIlIlIIlIlII[0];
        switch (var74.hashCode()) {
            case -1801391991: {
                if (!bi.llIlllIIllIlll(var74.equals(lIlIlIIIlllI[lIlIlIIlIlII[34]]) ? 1 : 0)) break;
                var24 = lIlIlIIlIlII[2];
                0;
                if (1 != 2) break;
                return ((0x44 ^ 0x2C ^ (0x16 ^ 0x2C)) & (61 + 186 - 107 + 100 ^ 111 + 158 - 200 + 93 ^ -1)) != 0;
            }
            case 2115395: {
                if (!bi.llIlllIIllIlll(var74.equals(lIlIlIIIlllI[lIlIlIIlIlII[35]]) ? 1 : 0)) break;
                var24 = lIlIlIIlIlII[1];
                0;
                if (2 == 2) break;
                return ((91 + 131 - 188 + 192 ^ 28 + 30 - -58 + 72) & (0x5B ^ 0x41 ^ (0x56 ^ 0x12) ^ -1)) != 0;
            }
            case 64266207: {
                if (!bi.llIlllIIllIlll(var74.equals(lIlIlIIIlllI[lIlIlIIlIlII[36]]) ? 1 : 0)) break;
                var24 = lIlIlIIlIlII[5];
                0;
                if ((0x8E ^ 0xA7 ^ (0x89 ^ 0xA4)) > 1) break;
                return ((0x97 ^ 0xBD ^ (0x4D ^ 0x5D)) & (0x36 ^ 0x76 ^ (0xF3 ^ 0x89) ^ -1)) != 0;
            }
            case -1650372460: {
                if (!bi.llIlllIIllIlll(var74.equals(lIlIlIIIlllI[lIlIlIIlIlII[37]]) ? 1 : 0)) break;
                var24 = lIlIlIIlIlII[6];
            }
        }
        switch (var24) {
            case 0: {
                boolean bl2;
                void var22;
                if (bi.llIlllIIlllIlI(var22.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[38]]) ? 1 : 0)) {
                    bl2 = lIlIlIIlIlII[1];
                    0;
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
                void var22;
                if (bi.llIlllIIlllIlI(var22.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[39]]) ? 1 : 0)) {
                    bl3 = lIlIlIIlIlII[1];
                    0;
                    
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
                void var22;
                if (bi.llIlllIIlllIlI(var22.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[40]]) ? 1 : 0)) {
                    bl4 = lIlIlIIlIlII[1];
                    0;
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

    private static String llIlllIIIllIlI(String var42, String var49) {
        var42 = new String(Base64.getDecoder().decode(var42.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var69 = new StringBuilder();
        char[] var56 = var49.toCharArray();
        int var6 = lIlIlIIlIlII[2];
        char[] var33 = var42.toCharArray();
        int var19 = var33.length;
        int var60 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var60, var19)) {
            char var55 = var33[var60];
            var69.append((char)(var55 ^ var56[var6 % var56.length]));
            0;
            ++var6;
            ++var60;
            0;
            if ((0xB0 ^ 0x92 ^ (0x2C ^ 0xA)) != 0) continue;
            return null;
        }
        return String.valueOf(var69);
    }

    private static boolean llIlllIIlllIIl(Object object) {
        return object != null;
    }

    private static String llIlllIIIllIII(String var58, String var86) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var86.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlIlIIlIlII[5], var4);
            return new String(var14.doFinal(Base64.getDecoder().decode(var58.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
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
        int var84;
        String string2 = string;
        int n2 = lIlIlIIlIlII[0];
        switch (string2.hashCode()) {
            case -1801391991: {
                void var51;
                if (!bi.llIlllIIllIlll(var51.equals(lIlIlIIIlllI[lIlIlIIlIlII[41]]) ? 1 : 0)) break;
                var84 = lIlIlIIlIlII[2];
                0;
                if (1 >= -1) break;
                return;
            }
            case 2115395: {
                void var51;
                if (!bi.llIlllIIllIlll(var51.equals(lIlIlIIIlllI[lIlIlIIlIlII[42]]) ? 1 : 0)) break;
                var84 = lIlIlIIlIlII[1];
                0;
                if (1 >= 0) break;
                return;
            }
            case 64266207: {
                void var51;
                if (!bi.llIlllIIllIlll(var51.equals(lIlIlIIIlllI[lIlIlIIlIlII[43]]) ? 1 : 0)) break;
                var84 = lIlIlIIlIlII[5];
                0;
                if (-2 < 0) break;
                return;
            }
            case -1650372460: {
                void var51;
                if (!bi.llIlllIIllIlll(var51.equals(lIlIlIIIlllI[lIlIlIIlIlII[44]]) ? 1 : 0)) break;
                var84 = lIlIlIIlIlII[6];
            }
        }
        switch (var84) {
            case 0: {
                bi var1;
                var1.es();
                return;
            }
            case 1: {
                bi var1;
                var1.eu();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                bi var1;
                var1.ep();
                return;
            }
        }
    }

    private static boolean llIlllIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIlllIIIllIIl(String var44, String var82) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var82.getBytes(StandardCharsets.UTF_8)), lIlIlIIlIlII[10]), "DES");
            Cipher var39 = Cipher.getInstance("DES");
            var39.init(lIlIlIIlIlII[5], var11);
            return new String(var39.doFinal(Base64.getDecoder().decode(var44.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void ep() {
        void var2_2;
        void var17;
        int n2 = this.eo();
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = n2;
        if (bi.llIlllIIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIlIlIIlIlII[1]];
        nArray2[bi.lIlIlIIlIlII[2]] = var17;
        Item var54 = Inventory.getFirst((int[])nArray2);
        if (bi.llIlllIIllIllI(var54)) {
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
                    0;
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
        void var40;
        void var29;
        void var63;
        void var41;
        bi var34;
        System.out.println(Arrays.toString(worldPointArray));
        List<WorldPoint> list = this.a(worldPointArray);
        NPC nPC2 = NPCs.getNearest((WorldPoint)worldPoint, nPC -> {
            int n2;
            if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[50]]) ? 1 : 0) && bi.llIlllIIlllIIl(nPC.getInteracting()) && bi.llIlllIIllIlll(nPC.getInteracting().equals(this.bS) ? 1 : 0) && bi.llIlllIIlllIlI(this.D((NPC)nPC) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];
                0;
                
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
        WorldPoint lllllllllllllllIllIlIIlIllIllllI = var34.a((WorldPoint)var41, (NPC)var63, (List<WorldPoint>)var29);
        if (bi.llIlllIIllIlll((int)var40) && bi.llIlllIIllIlll(var63.getWorldLocation().equals((Object)var41) ? 1 : 0) && bi.llIlllIIlllIlI(bi.llIlllIIllllII(var34.bS.getWorldLocation().distanceTo2DHypotenuse((WorldPoint)var41), 1.0f))) {
            var34.E((NPC)var63);
            return;
        }
        if (bi.llIlllIIllIlll(var63.isMoving() ? 1 : 0) && bi.llIlllIIlllIll(var63.distanceTo((Locatable)var34.bS), lIlIlIIlIlII[6])) {
            return;
        }
        Movement.setDestination((WorldPoint)var6_6);
    }

    @Override
    public boolean cg() {
        bi var13;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[59]]));
        if (bi.llIlllIIllIllI(nPC2)) {
            return this.cS();
        }
        if (bi.llIlllIIllIlll(var13.em() ? 1 : 0)) {
            return lIlIlIIlIlII[1];
        }
        this.ev();
        0;
        this.ew();
        return lIlIlIIlIlII[1];
    }

    /*
     * WARNING - void declaration
     */
    private void es() {
        void var3_4;
        bi var59;
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
        int var73 = var59.eq();
        int[] nArray3 = new int[lIlIlIIlIlII[1]];
        nArray3[bi.lIlIlIIlIlII[2]] = var73;
        if (bi.llIlllIIllIlll(Equipment.contains((int[])nArray3) ? 1 : 0)) {
            return;
        }
        int[] nArray4 = new int[lIlIlIIlIlII[1]];
        nArray4[bi.lIlIlIIlIlII[2]] = var73;
        Item var80 = Inventory.getFirst((int[])nArray4);
        if (bi.llIlllIIllIllI(var80)) {
            return;
        }
        int n3 = Static.getItemManager().getItemStats(var73, lIlIlIIlIlII[2]).getEquipment().isTwoHanded();
        if (bi.llIlllIIllIlll(Inventory.isFull() ? 1 : 0) && bi.llIlllIIllIlll(n3)) {
            var59.co.x();
            0;
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
        void var9;
        int n2 = this.et();
        int[] nArray = new int[lIlIlIIlIlII[1]];
        nArray[bi.lIlIlIIlIlII[2]] = n2;
        if (bi.llIlllIIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return;
        }
        int[] nArray2 = new int[lIlIlIIlIlII[1]];
        nArray2[bi.lIlIlIIlIlII[2]] = var9;
        Item var7 = Inventory.getFirst((int[])nArray2);
        if (bi.llIlllIIllIllI(var7)) {
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
        void var25;
        bi var3;
        WorldPoint var71;
        void var61;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (bi.llIlllIIllIlll(tileObject.getName().contains(string) ? 1 : 0) && bi.llIlllIIllIlll(tileObject.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[18]]) ? 1 : 0)) {
                n2 = lIlIlIIlIlII[1];
                0;
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
        WorldPoint var62 = new WorldPoint(lIlIlIIlIlII[2], lIlIlIIlIlII[2], lIlIlIIlIlII[2]);
        if (bi.llIlllIIlllIlI(((void)var61).length)) {
            return lIlIlIIlIlII[2];
        }
        int var37 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var37, ((void)var61).length)) {
            NPC nPC2;
            NPC var26;
            var62 = var61[var37];
            var71 = var62;
            List var50 = NPCs.getAll(nPC -> {
                int n2;
                if (bi.llIlllIIllIlll(nPC.getName().contains(lIlIlIIIlllI[lIlIlIIlIlII[48]]) ? 1 : 0) && bi.llIlllIIllIlll(nPC.getWorldLocation().equals((Object)var71) ? 1 : 0)) {
                    n2 = lIlIlIIlIlII[1];
                    0;
                    
                    }
                } else {
                    n2 = lIlIlIIlIlII[2];
                }
                return n2 != 0;
            });
            if (bi.llIlllIIllllIl(var50.size(), lIlIlIIlIlII[1])) {
                var26 = var71.createWorldArea(lIlIlIIlIlII[7]).toWorldPointList().stream().filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceToHypotenuse(var71))).orElse(null);
                Movement.setDestination((WorldPoint)var26);
                return lIlIlIIlIlII[2];
            }
            if (bi.llIlllIIllIlll(var50.isEmpty() ? 1 : 0)) {
                nPC2 = null;
                0;
                if (-1 > 0) {
                    return false;
                }
            } else {
                nPC2 = var26 = (NPC)var50.get(lIlIlIIlIlII[2]);
            }
            if (bi.llIlllIIllllll(var37, ((void)var61).length - lIlIlIIlIlII[1])) {
                0;
                if (-2 <= 0) break;
                return false;
            }
            if (bi.llIlllIIlllIlI(var3.D(var26) ? 1 : 0)) {
                var3.a(var62, lIlIlIIlIlII[1], (WorldPoint[])Arrays.copyOfRange(var61, lIlIlIIlIlII[2], var37 + lIlIlIIlIlII[1]));
                return lIlIlIIlIlII[2];
            }
            ++var37;
            0;
            if (-1 < 2) continue;
            return false;
        }
        if (bi.llIlllIIllIlll(var3.a((String)var25, (NPC)(var71 = NPCs.getNearest(arg_0 -> bi.a(var37 = var62, arg_0)))) ? 1 : 0)) {
            var3.n((String)var25);
            var71.interact(lIlIlIIIlllI[lIlIlIIlIlII[32]]);
            var3.sleep(lIlIlIIlIlII[1]);
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
        void var36;
        bi var45;
        int var72 = lIlIlIIlIlII[2];
        while (bi.llIlllIIlllIll(var72, var45.en.size())) {
            NPC var5 = var45.en.get(var72).aP();
            if (bi.llIlllIIlllIIl(var5) && bi.llIlllIIlllIII(var5, var36)) {
                0;
                if (3 >= 0) break;
                return;
            }
            ++var72;
            0;
            if (-(0x65 ^ 0x60) < 0) continue;
            return;
        }
        if (bi.llIlllIIlllllI(var72, var45.en.size())) {
            var45.en.add(new p((NPC)var36, var45.cq.getTickCount()));
            0;
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

