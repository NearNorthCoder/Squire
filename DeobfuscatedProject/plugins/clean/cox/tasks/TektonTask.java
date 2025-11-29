/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum30;
import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
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
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Tekton", priority=10000, blocking=true, register=true)
public class TektonTask
extends CoxTaskBase {
    private  n al;
    private  n ak;
    private final  int dI = 660;
     int dJ;
    public final  int dL = 7488;
    
    public final  int dK = 7473;
    public  int dM;
     int dA;
    
    private  int dN;
    private  int dO;
    private  int am;
     int dB;

    private static boolean lllIIIIIIIlIII(Object object) {
        return object == null;
    }

    private static boolean lllIIIIIIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private boolean da() {
        int var1;
        int n2;
        if (aE.lllIIIIIIlIIIl(Combat.getSpecEnergy(), lIlIllIIllll[14])) {
            return lIlIllIIllll[2];
        }
        Item var2 = s.aY();
        if (aE.lllIIIIIIIlIII(var2)) {
            return lIlIllIIllll[2];
        }
        int var3 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
        if (aE.lllIIIIIIIlIlI(var2.getId(), var3)) {
            n2 = lIlIllIIllll[5];

            if (-(9 + 17 - -46 + 90 ^ 143 + 103 - 219 + 140) >= 0) {
                return ((114 + 170 - 88 + 24 ^ 63 + 186 - 198 + 137) & (0x34 ^ 0x7C ^ (0xBA ^ 0x92) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIllIIllll[2];
        }
        if (aE.lllIIIIIIIIlll(var1 = n2)) {
            return lIlIllIIllll[2];
        }
        Combat.toggleSpec();
        return lIlIllIIllll[5];
    }

    private static boolean lllIIIIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIIIIlIIII(Object object, Object object2) {
        return object == object2;
    }

    static {
        aE.lllIIIIIIIIlIl();
        aE.lllIIIIIIIIlII();
    }

    private static boolean lllIIIIIIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aE.lllIIIIIIIIllI(tileObject.getName().equals(lIlIllIIllII[lIlIllIIllll[23]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIIllll[5]];
                stringArray[aE.lIlIllIIllll[2]] = lIlIllIIllII[lIlIllIIllll[24]];
                if (aE.lllIIIIIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && aE.lllIIIIIIIIllI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIllIIllll[5];

                    if (((7 ^ 0x50) & ~(0x4D ^ 0x1A)) <= 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIllIIllll[2];
            return n2 != 0;
        });
    }

    private static boolean lllIIIIIIIIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean cg() {
        WorldPoint lllllllllllllllIllIIlIllIlllllll2;
        aE var4;
        if (aE.lllIIIIIIIIllI(this.co() ? 1 : 0)) {
            return lIlIllIIllll[5];
        }
        WorldPoint var5 = H.TEKTON_START.c(var4.ak);
        TileObject var6 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aE.lllIIIIIIIIllI(tileObject.getName().contains(lIlIllIIllII[lIlIllIIllll[28]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllIIllll[5]];
                stringArray[aE.lIlIllIIllll[2]] = lIlIllIIllII[lIlIllIIllll[29]];
                if (aE.lllIIIIIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllIIllll[5];

                    if (((47 + 80 - 84 + 165 ^ 12 + 161 - -1 + 22) & (0xAB ^ 0x8B ^ (0xB7 ^ 0x83) ^ -1)) < 1) return n2 != 0;
                    return ((0xC ^ 0x29 ^ (0x59 ^ 0x6B)) & (0x88 ^ 0xBC ^ (0x4F ^ 0x6C) ^ -1)) != 0;
                }
            }
            n2 = lIlIllIIllll[2];
            return n2 != 0;
        });
        if (aE.lllIIIIIIIIlll(Reachable.isWalkable((WorldPoint)var5) ? 1 : 0)) {
            if (aE.lllIIIIIIIlIII(var6)) {
                return var4.cS();
            }
            var6.interact(lIlIllIIllII[lIlIllIIllll[2]]);
            return lIlIllIIllll[5];
        }
        NPC var7 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[27]]));
        if (aE.lllIIIIIIIlIII(var7)) {
            return var4.cS();
        }
        var4.db();
        if (!aE.lllIIIIIIIlIIl(var7.getAnimation(), lIlIllIIllll[4]) || aE.lllIIIIIIIlIlI(var7.getAnimation(), lIlIllIIllll[6])) {
            var4.dM += lIlIllIIllll[5];
            System.out.println(var4.dM);
            if (aE.lllIIIIIIIlIll(var4.dM, lIlIllIIllll[5])) {
                var7.interact(lIlIllIIllII[lIlIllIIllll[5]]);
                return lIlIllIIllll[5];
            }
            if (aE.lllIIIIIIIIlll(var4.cp.flinchTekton() ? 1 : 0)) {
                Movement.setDestination((WorldPoint)var4.cY());
                return lIlIllIIllll[5];
            }
            if (aE.lllIIIIIIIlIll(var4.dM, lIlIllIIllll[7]) && aE.lllIIIIIIIIllI(var4.cp.flinchTekton() ? 1 : 0)) {
                WorldPoint var8 = var4.bS.getWorldArea().getMeleeTiles(var4.cq).stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).max(Comparator.comparingInt(worldPoint -> var7.getWorldArea().distanceTo(worldPoint))).orElse(null);
                Movement.setDestination((WorldPoint)var8);
                return lIlIllIIllll[5];
            }
        }
        var4.dM = lIlIllIIllll[2];
        if (aE.lllIIIIIIIIllI(var7.isMoving() ? 1 : 0) && aE.lllIIIIIIIllII(var7.getWorldArea().distanceTo((Locatable)var4.bS), lIlIllIIllll[7])) {
            WorldPoint var8 = H.TEKTON_START.c(var4.ak);
            Projectile lllllllllllllllIllIIlIllIlllllll2 = Projectiles.getNearest(projectile -> {
                int n2;
                if (aE.lllIIIIIIIlIlI(projectile.getId(), lIlIllIIllll[1]) && aE.lllIIIIIIIlIll(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget()).distanceTo(var8), lIlIllIIllll[5])) {
                    n2 = lIlIllIIllll[5];

                    }
                } else {
                    n2 = lIlIllIIllll[2];
                }
                return n2 != 0;
            });
            if (aE.lllIIIIIIIllIl(lllllllllllllllIllIIlIllIlllllll2)) {
                return lIlIllIIllll[2];
            }
            Movement.setDestination((WorldPoint)var8);
            return lIlIllIIllll[5];
        }
        if (aE.lllIIIIIIIlIlI(var7.getPoseAnimation(), lIlIllIIllll[3])) {
            if (aE.lllIIIIIIIllIl(var6)) {
                Movement.setDestination((WorldPoint)var4.cZ());
                return lIlIllIIllll[5];
            }
            WorldPoint var8 = var5.createWorldArea(lIlIllIIllll[8]).toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if (aE.lllIIIIIIIIllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aE.lllIIIIIIIlIlI(var7.getWorldArea().distanceTo(worldPoint), lIlIllIIllll[10])) {
                    n2 = lIlIllIIllll[5];

                    if (((0x5C ^ 0x7E ^ (0x7F ^ 0x1D)) & (0xD5 ^ 0xAF ^ (0x58 ^ 0x62) ^ -1)) != 0) {
                        return ((0x51 ^ 0x54 ^ (0x76 ^ 0x7D)) & (0x44 ^ 0x34 ^ (0xF1 ^ 0x8F) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIllIIllll[2];
                }
                return n2 != 0;
            }).min(Comparator.comparingDouble(worldPoint2 -> worldPoint2.distanceTo2DHypotenuse(var5))).orElse(null);
            if (aE.lllIIIIIIIlIII(var8)) {
                return lIlIllIIllll[2];
            }
            Movement.setDestination((WorldPoint)var8);
            return lIlIllIIllll[5];
        }
        var4.da();

        if (aE.lllIIIIIIIIllI(var7.isMoving() ? 1 : 0)) {
            if (aE.lllIIIIIIIllIl(var4.bS.getInteracting()) && aE.lllIIIIIIIIllI(var4.bS.getInteracting().equals(var7) ? 1 : 0)) {
                return lIlIllIIllll[2];
            }
            var7.interact(lIlIllIIllII[lIlIllIIllll[7]]);
            return lIlIllIIllll[5];
        }
        if (aE.lllIIIIIIIIlll(var4.cp.flinchTekton() ? 1 : 0)) {
            WorldPoint var8 = var4.cX();
            if (aE.lllIIIIIIIlIII(var8)) {
                return lIlIllIIllll[2];
            }
            lllllllllllllllIllIIlIllIlllllll2 = var4.cW();
            if (aE.lllIIIIIIIIllI(lllllllllllllllIllIIlIllIlllllll2.contains(var4.bS.getWorldLocation()) ? 1 : 0)) {
                var4.dJ = lIlIllIIllll[2];
                var4.dA += lIlIllIIllll[5];
                if (aE.lllIIIIIIIlIlI(var4.dA, lIlIllIIllll[5])) {
                    var7.interact(lIlIllIIllII[lIlIllIIllll[9]]);
                    return lIlIllIIllll[5];
                }
                Movement.setDestination((WorldPoint)var8);
                return lIlIllIIllll[5];
            }
            var4.dA = lIlIllIIllll[2];
            WorldPoint var9 = var4.cY();
            if (aE.lllIIIIIIIIllI(var4.bS.isMoving() ? 1 : 0)) {
                return lIlIllIIllll[2];
            }
            if (aE.lllIIIIIIIIllI(var4.bS.isMoving() ? 1 : 0)) {
                return lIlIllIIllll[2];
            }
            Movement.setDestination((WorldPoint)var9);
        }
        int var8 = var7.getAnimation();
        if (aE.lllIIIIIIIIllI(var7.getWorldArea().getMeleeTiles(var4.cq).contains(var4.bS.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIlIllIIllII[lIlIllIIllll[10]]);
            var4.dO = lIlIllIIllll[2];
            lllllllllllllllIllIIlIllIlllllll2 = var4.bS.getWorldArea().getMeleeTiles(var4.cq).stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).max(Comparator.comparingInt(worldPoint -> var7.getWorldArea().distanceTo(worldPoint))).orElse(null);
            Movement.setDestination((WorldPoint)lllllllllllllllIllIIlIllIlllllll2);
            System.out.println(lIlIllIIllII[lIlIllIIllll[8]]);
            return lIlIllIIllll[5];
        }
        System.out.println("last: " + var4.dN + " | current: " + var8 + " | frame: " + var7.getAnimationFrame());
        if (aE.lllIIIIIIIlIIl(var7.getAnimation(), lIlIllIIllll[0]) && aE.lllIIIIIIIlllI(var7.getAnimationFrame(), lIlIllIIllll[11]) && aE.lllIIIIIIIllll(var4.dO)) {
            var4.dN = var7.getAnimation();
            var7.interact(lIlIllIIllII[lIlIllIIllll[12]]);
        }
        this.dO += lIlIllIIllll[5];
        return lIlIllIIllll[5];
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, int n4) {
        int n5;
        void var10;
        void var11;
        void var12;
        if (aE.lllIIIIIIIIlll(n3)) {
            boolean bl2;
            if (!aE.lllIIIIIIIlIll(n2, lIlIllIIllll[17] - n4) || aE.lllIIIIIIlIIIl(n2, n4)) {
                bl2 = lIlIllIIllll[5];

                if (3 < 0) {
                    return false;
                }
            } else {
                bl2 = lIlIllIIllll[2];
            }
            return bl2;
        }
        if (aE.lllIIIIIIIlllI((int)var12, (int)(var11 - var10)) && aE.lllIIIIIIIlIll((int)var12, (int)(var11 + var10))) {
            n5 = lIlIllIIllll[5];

            if (-1 > 3) {
                return false;
            }
        } else {
            n5 = lIlIllIIllll[2];
        }
        return n5 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int z(int n2) {
        int var13 = lIlIllIIllll[2];
        while (aE.lllIIIIIIlIIIl(var13, lIlIllIIllll[10])) {
            void var14;
            aE var15;
            if (aE.lllIIIIIIIIllI(var15.a((int)var14, var13 * lIlIllIIllll[15], lIlIllIIllll[16]) ? 1 : 0)) {
                return var13 * lIlIllIIllll[15];
            }
            ++var13;

            if (3 > 0) continue;
            return (0x94 ^ 0x98 ^ (0x1D ^ 1)) & (118 + 147 - 161 + 57 ^ 161 + 50 - 146 + 112 ^ -1);
        }
        return lIlIllIIllll[0];
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cZ() {
        WorldPoint worldPoint2 = H.TEKTON_START.c(this.ak);
        List list = this.bS.getWorldLocation().createWorldArea(lIlIllIIllll[7]).toWorldPointList();
        int[] nArray = new int[lIlIllIIllll[5]];
        nArray[aE.lIlIllIIllll[2]] = lIlIllIIllll[1];
        List list2 = Projectiles.getAll((int[])nArray);
        ArrayList arrayList = new ArrayList();
        Iterator var16 = list2.iterator();
        while (aE.lllIIIIIIIIllI(var16.hasNext() ? 1 : 0)) {
            void var17;
            aE var18;
            Projectile var19 = (Projectile)var16.next();
            WorldPoint var20 = WorldPoint.fromLocal((Client)var18.cq, (LocalPoint)var19.getTarget());
            var17.addAll(var20.createWorldArea(lIlIllIIllll[5]).toWorldPointList());

            if (((119 + 6 - 64 + 73 ^ 5 + 97 - 34 + 74) & (0x2C ^ 0x25 ^ 1 ^ -1)) == 0) continue;
            return null;
        }
        WorldPoint worldPoint3 = list.stream().filter(worldPoint -> {
            int n2;
            if (aE.lllIIIIIIIIllI(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aE.lllIIIIIIIIlll(arrayList.contains(worldPoint) ? 1 : 0)) {
                n2 = lIlIllIIllll[5];

                if ((0x9F ^ 0x9B) < (6 ^ 2)) {
                    return false;
                }
            } else {
                n2 = lIlIllIIllll[2];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(object -> ((WorldPoint)object).distanceTo((Locatable)this.bS)).thenComparingDouble(object -> ((WorldPoint)object).distanceTo2DHypotenuse(worldPoint2))).orElse(null);
        return worldPoint3;
    }

    private static boolean lllIIIIIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public EquipmentSetup cj() {
        int[] nArray;
        if (aE.lllIIIIIIIlllI(Combat.getSpecEnergy(), lIlIllIIllll[14]) && aE.lllIIIIIIIllIl(nArray = s.aZ())) {
            return s.b(s.aZ());
        }
        return s.b(s.e(N.TEKTON));
    }

    private static boolean lllIIIIIIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lllIIIIIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var21);
    }

    private static void lllIIIIIIIIlII() {
        lIlIllIIllII = new String[lIlIllIIllll[30]];
        aE.lIlIllIIllII[aE.lIlIllIIllll[2]] = "Cross";
        aE.lIlIllIIllII[aE.lIlIllIIllll[5]] = "Attack";
        aE.lIlIllIIllII[aE.lIlIllIIllll[7]] = "Attack";
        aE.lIlIllIIllII[aE.lIlIllIIllll[9]] = "Attack";
        aE.lIlIllIIllII[aE.lIlIllIIllll[10]] = "IN MELEE TILES";
        aE.lIlIllIIllII[aE.lIlIllIIllll[8]] = "moving to stepback";
        aE.lIlIllIIllII[aE.lIlIllIIllll[12]] = "Attack";
        aE.lIlIllIIllII[aE.lIlIllIIllll[13]] = "Drink";
        aE.lIlIllIIllII[aE.lIlIllIIllll[18]] = "Enter";
        aE.lIlIllIIllII[aE.lIlIllIIllll[11]] = "Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[21]] = "Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[22]] = "Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[23]] = "Passage";
        aE.lIlIllIIllII[aE.lIlIllIIllll[24]] = "Enter";
        aE.lIlIllIIllII[aE.lIlIllIIllll[25]] = "Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[26]] = "Stamina";
        aE.lIlIllIIllII[aE.lIlIllIIllll[27]] = "Tekton";
        aE.lIlIllIIllII[aE.lIlIllIIllll[28]] = "Fire";
        aE.lIlIllIIllII[aE.lIlIllIIllll[29]] = "Cross";
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[25]]));
        if (aE.lllIIIIIIIlIII(nPC2)) {
            return null;
        }
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.PROTECT_FROM_MELEE;
        arrayList.add(prayer);

        arrayList.addAll(list);

        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cX() {
        aE var22;
        void var23;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[21]]));
        if (aE.lllIIIIIIIlIII(nPC2)) {
            return null;
        }
        WorldPoint var24 = var23.getWorldLocation();
        System.out.println(var23.getOrientation());
        switch (var22.z(var23.getOrientation())) {
            case 0: {
                return var24.dx(lIlIllIIllll[10]).dy(lIlIllIIllll[9]);
            }
            case 512: {
                return var24.dx(lIlIllIIllll[9]).dy(lIlIllIIllll[0]);
            }
            case 1024: {
                return var24.dx(lIlIllIIllll[0]).dy(lIlIllIIllll[2]);
            }
            case 1536: {
                return var24.dx(lIlIllIIllll[2]).dy(lIlIllIIllll[10]);
            }
        }
        return null;
    }

    @Inject
    protected TektonTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIllIIllll[0];
        this.dI = lIlIllIIllll[1];
        this.dA = lIlIllIIllll[2];
        this.dB = lIlIllIIllll[2];
        this.dJ = lIlIllIIllll[2];
        this.dK = lIlIllIIllll[3];
        this.dL = lIlIllIIllll[4];
        this.dM = lIlIllIIllll[2];
        this.dN = lIlIllIIllll[0];
        this.dO = lIlIllIIllll[2];
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint cY() {
        aE var25;
        void var26;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[11]]));
        if (aE.lllIIIIIIIlIII(nPC2)) {
            return null;
        }
        WorldPoint var27 = var26.getWorldLocation();
        switch (var25.z(var26.getOrientation())) {
            case 1536: {
                return var27.dx(lIlIllIIllll[10]).dy(lIlIllIIllll[9]);
            }
            case 0: {
                return var27.dx(lIlIllIIllll[9]).dy(lIlIllIIllll[0]);
            }
            case 512: {
                return var27.dx(lIlIllIIllll[0]).dy(lIlIllIIllll[2]);
            }
            case 1024: {
                return var27.dx(lIlIllIIllll[2]).dy(lIlIllIIllll[10]);
            }
        }
        return null;
    }

    private static boolean lllIIIIIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIIIIIIIllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean y(int n2) {
        void var28;
        Item item2 = Inventory.getFirst(item -> item.getName().startsWith(lIlIllIIllII[lIlIllIIllll[26]]));
        if (aE.lllIIIIIIIlIII(item2)) {
            return lIlIllIIllll[2];
        }
        if (aE.lllIIIIIIIllII(Movement.getRunEnergy(), (int)var28)) {
            return lIlIllIIllll[2];
        }
        item2.interact(lIlIllIIllII[lIlIllIIllll[13]]);
        return lIlIllIIllll[5];
    }

    private static boolean lllIIIIIIIllII(int n2, int n3) {
        return n2 > n3;
    }

    private List<WorldPoint> cW() {
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIllIIllII[lIlIllIIllll[22]]));
        if (aE.lllIIIIIIIlIII(nPC2)) {
            return null;
        }
        WorldPoint worldPoint = nPC2.getWorldLocation();
        return List.of(worldPoint.dx(lIlIllIIllll[10]).dy(lIlIllIIllll[9]), worldPoint.dx(lIlIllIIllll[9]).dy(lIlIllIIllll[0]), worldPoint.dx(lIlIllIIllll[0]).dy(lIlIllIIllll[2]), worldPoint.dx(lIlIllIIllll[2]).dy(lIlIllIIllll[10]));
    }

    public void db() {
        if (aE.lllIIIIIIIIllI(this.cj().isFullyEquipped() ? 1 : 0) && aE.lllIIIIIIlIIlI(Combat.getAttackStyle(), Combat.AttackStyle.THIRD)) {
            int[] nArray = new int[lIlIllIIllll[7]];
            nArray[aE.lIlIllIIllll[2]] = lIlIllIIllll[19];
            nArray[aE.lIlIllIIllll[5]] = lIlIllIIllll[20];
            if (aE.lllIIIIIIIIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.THIRD);
            }
        }
    }

    private static boolean lllIIIIIIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aE var29;
        if (aE.lllIIIIIIIIllI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)this.al.bs);
            return lIlIllIIllll[5];
        }
        TileObject var30 = var29.cR();
        if (aE.lllIIIIIIIlIII(var30)) {
            return lIlIllIIllll[2];
        }
        if (!aE.lllIIIIIIIIlll(var29.bS.isMoving() ? 1 : 0) || aE.lllIIIIIIIIllI(var29.bS.isAnimating() ? 1 : 0)) {
            return lIlIllIIllll[2];
        }
        var1_1.interact(lIlIllIIllII[lIlIllIIllll[18]]);
        return lIlIllIIllll[5];
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aE.lllIIIIIIlIIII((Object)this.ak.bw, (Object)N.TEKTON)) {
            bl2 = lIlIllIIllll[5];

            if (((0xB8 ^ 0xC3 ^ (0x33 ^ 0x6F)) & (0x18 ^ 7 ^ (0xA5 ^ 0x9D) ^ -1)) >= 1) {
                return ((0xD8 ^ 0xA6 ^ (0x27 ^ 0x6B)) & (0xC7 ^ 0x96 ^ (0x51 ^ 0x32) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIllIIllll[2];
        }
        return bl2;
    }
}

