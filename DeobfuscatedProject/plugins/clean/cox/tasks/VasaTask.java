/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
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
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Vasa", priority=10000, blocking=true)
public class VasaTask
extends CoxTaskBase {
    private  int dB;
    private  NPC dQ;
    private  WorldPoint dR;
    private  n ak;
    private  int am;
    private  n al;
    
    private  NPC dP;

    private static void llIlIIlllIIIIl() {
        lIlIIIIIIIIl = new String[lIlIIIIIIIlI[25]];
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[1]] = "Attack";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[2]] = "Enter";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[4]] = "vasa in path, repositioning";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[6]] = "Attack";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[7]] = "Attacking";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[9]] = "Attack";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[10]] = "animation is -1";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[13]] = "flame is null";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[14]] = "Cross";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[15]] = "Take";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[16]] = "Xeric's";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[17]] = "fire";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[18]] = "Cross";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[19]] = "Vasa";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[20]] = "Attack";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[3]] = "Glowing crystal";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[5]] = "Attack";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[21]] = "Passage";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[22]] = "Enter";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[23]] = "Vasa";
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[24]] = "Rocks";
    }

    private boolean cT() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aF.llIlIIlllIIlII(tileObject.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[17]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIIlI[2]];
                stringArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[18]];
                if (aF.llIlIIlllIIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];

                    if (-3 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIIIIIlI[1];
            return n2 != 0;
        });
        if (aF.llIlIIlllIIlll(tileObject2)) {
            System.out.println(lIlIIIIIIIIl[lIlIIIIIIIlI[13]]);
            return lIlIIIIIIIlI[1];
        }
        tileObject2.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[14]]);
        return lIlIIIIIIIlI[2];
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[23]]));
        if (aF.llIlIIlllIIlll(nPC2)) {
            return null;
        }
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.PROTECT_FROM_MISSILES;
        arrayList.add(prayer);

        arrayList.addAll(list);

        return arrayList;
    }

    private static boolean llIlIIlllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private NPC de() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (aF.llIlIIlllIIlII(nPC.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIIlI[2]];
                stringArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[5]];
                if (aF.llIlIIlllIIlII(nPC.hasAction(stringArray) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];

                    if (1 < (9 ^ 0xD)) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIIIIIlI[1];
            return n2 != 0;
        });
    }

    private void dg() {
        WorldPoint worldPoint = this.ak.bq;
    }

    private static  int c(NPC nPC, Object object) {
        return nPC.getWorldArea().distanceTo((WorldPoint)object);
    }

    private static boolean llIlIIlllIllII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean dj() {
        aF var1;
        void var2;
        NPC nPC = this.df();
        if (aF.llIlIIlllIIlll(nPC)) {
            return lIlIIIIIIIlI[1];
        }
        if (aF.llIlIIlllIlIlI(var2.getAnimation(), lIlIIIIIIIlI[0])) {
            System.out.print(lIlIIIIIIIIl[lIlIIIIIIIlI[10]]);
            return lIlIIIIIIIlI[1];
        }
        if (aF.llIlIIlllIlIll(var2.getWorldArea().distanceTo((Locatable)var1.bS), lIlIIIIIIIlI[6])) {
            WorldPoint var3 = var1.bS.getWorldLocation().createWorldArea(lIlIIIIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).max(Comparator.comparingInt(arg_0 -> aF.c((NPC)var2, arg_0)).thenComparingDouble(object -> -this.bS.distanceTo((WorldPoint)object))).orElse(null);
            if (aF.llIlIIlllIIlll(var3)) {
                return lIlIIIIIIIlI[1];
            }
            Movement.setDestination((WorldPoint)var3);
            return lIlIIIIIIIlI[2];
        }
        return lIlIIIIIIIlI[1];
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aF.llIlIIlllIIlII(tileObject.getName().equals(lIlIIIIIIIIl[lIlIIIIIIIlI[21]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIIlI[2]];
                stringArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[22]];
                if (aF.llIlIIlllIIlII(tileObject.hasAction(stringArray) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];

                    if (((0x2A ^ 0x7F ^ (0x2C ^ 0x39)) & (127 + 189 - 102 + 33 ^ 19 + 58 - 27 + 133 ^ -1)) < (0x5D ^ 0x15 ^ (0x5A ^ 0x16))) return n2 != 0;
                    return ((0xBD ^ 0xB2 ^ (0x38 ^ 0xC)) & (211 + 198 - 275 + 116 ^ 127 + 123 - 117 + 60 ^ -1)) != 0;
                }
            }
            n2 = lIlIIIIIIIlI[1];
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private boolean j(boolean bl2) {
        WorldPoint var4;
        aF var5;
        void var6;
        this.dP = this.df();
        if (aF.llIlIIlllIIlll(this.dP)) {
            return lIlIIIIIIIlI[1];
        }
        if (aF.llIlIIlllIIlII((int)var6) && aF.llIlIIlllIIlII(var5.di() ? 1 : 0)) {
            System.out.println(lIlIIIIIIIIl[lIlIIIIIIIlI[4]]);
            Movement.setDestination((WorldPoint)var5.dd());
            return lIlIIIIIIIlI[2];
        }
        if (aF.llIlIIlllIlIII(var5.cq.getTickCount() - var5.dB, lIlIIIIIIIlI[2])) {
            var5.dP.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[6]]);
            var5.dB = var5.cq.getTickCount();
            var5.dR = var5.bS.getWorldLocation();
            System.out.println(lIlIIIIIIIIl[lIlIIIIIIIlI[7]]);
            return lIlIIIIIIIlI[2];
        }
        ArrayList var7 = new ArrayList();
        var7.addAll(var5.dR.createWorldArea(lIlIIIIIIIlI[2]).toWorldPointList());

        int[] nArray = new int[lIlIIIIIIIlI[2]];
        nArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIlI[8];
        List var8 = Projectiles.getAll((int[])nArray);
        WorldPoint var9 = var8.iterator();
        while (aF.llIlIIlllIIlII(var9.hasNext() ? 1 : 0)) {
            Projectile var10 = (Projectile)var9.next();
            if (aF.llIlIIlllIIlll(var10)) {

                return false;
            }
            var4 = WorldPoint.fromLocal((Client)var5.cq, (LocalPoint)var10.getTarget());
            var7.addAll(var4.createWorldArea(lIlIIIIIIIlI[2]).toWorldPointList());

            if (2 <= 2) continue;
            return false;
        }
        if (aF.llIlIIlllIIlII(var7.contains(var5.bS.getWorldLocation()) ? 1 : 0)) {
            if (aF.llIlIIlllIIlII((int)var6)) {
                int n2;
                var9 = var5.dd();
                if (aF.llIlIIlllIIlII(var5.cp.vasaToggle() ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[9];

                } else {
                    n2 = lIlIIIIIIIlI[7];
                }
                int var10 = n2;
                var4 = var5.bS.getWorldLocation().createWorldArea(lIlIIIIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
                    int n2;
                    if (aF.llIlIIlllIIlII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aF.llIlIIlllIlIIl(var7.contains(worldPoint) ? 1 : 0)) {
                        n2 = lIlIIIIIIIlI[2];

                        if (((123 + 94 - 117 + 43 ^ 36 + 96 - 6 + 44) & (5 + 22 - -21 + 98 ^ 10 + 165 - 112 + 120 ^ -1)) < -1) {
                            return ((0xAE ^ 0xC5 ^ (0x7F ^ 0x37)) & (0xE1 ^ 0x98 ^ (0x79 ^ 0x23) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIlIIIIIIIlI[1];
                    }
                    return n2 != 0;
                }).min(Comparator.comparingInt(object -> Math.abs(var10 - this.dP.getWorldArea().distanceTo((WorldPoint)object))).thenComparingInt(object -> ((WorldPoint)object).distanceToPath(this.cq, var9))).orElse(null);
                Movement.setDestination((WorldPoint)var4);
                return lIlIIIIIIIlI[2];
            }
            var9 = var5.bS.getWorldLocation().createWorldArea(lIlIIIIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if (aF.llIlIIlllIIlII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aF.llIlIIlllIlIIl(var7.contains(worldPoint) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];

                    if (1 <= (2 & (2 ^ -1))) {
                        return ((0xDC ^ 0x87 ^ (0x76 ^ 0x6A)) & (1 ^ 0x22 ^ (0x64 ^ 0) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIlIIIIIIIlI[1];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> Math.abs(lIlIIIIIIIlI[7] - this.dP.getWorldArea().distanceTo(worldPoint)))).orElse(null);
            Movement.setDestination((WorldPoint)var9);
            return lIlIIIIIIIlI[2];
        }
        this.dP.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[9]]);
        return lIlIIIIIIIlI[2];
    }

    static {
        aF.llIlIIlllIIIlI();
        aF.llIlIIlllIIIIl();
    }

    private NPC df() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (aF.llIlIIlllIIlII(nPC.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[19]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIIlI[2]];
                stringArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[20]];
                if (aF.llIlIIlllIIlII(nPC.hasAction(stringArray) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];

                    if ((0x7E ^ 0x7A) == (0x8D ^ 0x89)) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIIIIIlI[1];
            return n2 != 0;
        });
    }

    private static boolean llIlIIlllIlIII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aF var11;
        if (aF.llIlIIlllIIlII(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aF.llIlIIlllIIlIl(Movement.getDestination()) && aF.llIlIIlllIIlII(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIIIIIIlI[1];
            }
            Movement.setDestination((WorldPoint)var11.al.bs);
            return lIlIIIIIIIlI[2];
        }
        TileObject var12 = var11.cR();
        if (aF.llIlIIlllIIlll(var12)) {
            Movement.setDestination((WorldPoint)var11.ak.bq.dx(lIlIIIIIIIlI[5]).dy(lIlIIIIIIIlI[5]));
            return lIlIIIIIIIlI[2];
        }
        if (!aF.llIlIIlllIlIIl(var11.bS.isMoving() ? 1 : 0) || aF.llIlIIlllIIlII(var11.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIIIIIlI[1];
        }
        var1_1.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[2]]);
        return lIlIIIIIIIlI[2];
    }

    private static boolean llIlIIlllIllIl(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var13);
    }

    private static boolean llIlIIlllIIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cU() {
        void var1_1;
        aF var14;
        if (aF.llIlIIlllIIlII(Inventory.isFull() ? 1 : 0)) {
            return lIlIIIIIIIlI[1];
        }
        TileItem var15 = TileItems.getNearest(tileItem -> {
            int n2;
            if (aF.llIlIIlllIIlII(tileItem.getName().startsWith(lIlIIIIIIIIl[lIlIIIIIIIlI[16]]) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)tileItem) ? 1 : 0) && aF.llIlIIlllIIlII(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIIIIIIlI[2];

                if (-(0x49 ^ 0x4D) > 0) {
                    return false;
                }
            } else {
                n2 = lIlIIIIIIIlI[1];
            }
            return n2 != 0;
        });
        if (aF.llIlIIlllIIlll(var15)) {
            return lIlIIIIIIIlI[1];
        }
        var1_1.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[15]]);
        return lIlIIIIIIIlI[2];
    }

    private boolean di() {
        aF var16;
        NPC nPC = this.de();
        if (aF.llIlIIlllIIlll(nPC)) {
            return lIlIIIIIIIlI[1];
        }
        WorldPoint var17 = var16.dd();
        List var18 = var16.bS.getWorldLocation().pathTo(var16.cq, var17);
        Iterator var19 = var18.iterator();
        while (aF.llIlIIlllIIlII(var19.hasNext() ? 1 : 0)) {
            WorldPoint var20 = (WorldPoint)var19.next();
            if (aF.llIlIIlllIIlII(var16.dP.getWorldArea().contains(var20) ? 1 : 0)) {
                return lIlIIIIIIIlI[2];
            }

            if (((0x69 ^ 0x76) & ~(0x5C ^ 0x43)) == 0) continue;
            return ((0x8E ^ 0xB0) & ~(0x4B ^ 0x75) & ~((0xEB ^ 0x89) & ~(0x3A ^ 0x58))) != 0;
        }
        return lIlIIIIIIIlI[1];
    }

    @Inject
    protected VasaTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIIIIIlI[0];
        this.dB = lIlIIIIIIIlI[0];
        this.dR = new WorldPoint(lIlIIIIIIIlI[1], lIlIIIIIIIlI[1], lIlIIIIIIIlI[1]);
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint dd() {
        void var2_2;
        void var21;
        NPC nPC = this.de();
        if (aF.llIlIIlllIIlll(nPC)) {
            return null;
        }
        List var22 = var21.getWorldArea().getMeleeTiles(Static.getClient()).stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).collect(Collectors.toList());
        if (aF.llIlIIlllIIlII(var22.isEmpty() ? 1 : 0)) {
            return null;
        }
        WorldPoint var23 = (WorldPoint)var22.get(lIlIIIIIIIlI[1]);
        List var24 = var22.stream().filter(worldPoint2 -> {
            boolean bl2;
            if (!aF.llIlIIlllIlIlI(worldPoint2.getWorldX(), var23.getWorldX()) || aF.llIlIIlllIllIl(worldPoint2.getWorldY(), var23.getWorldY())) {
                bl2 = lIlIIIIIIIlI[2];

                if (3 != 3) {
                    return false;
                }
            } else {
                bl2 = lIlIIIIIIIlI[1];
            }
            return bl2;
        }).collect(Collectors.toList());
        var22.removeAll(var24);

        if (aF.llIlIIlllIlIII(var22.size(), var24.size())) {
            return (WorldPoint)var24.get(lIlIIIIIIIlI[1]);
        }
        return (WorldPoint)var2_2.get(lIlIIIIIIIlI[1]);
    }

    /*
     * WARNING - void declaration
     */
    private boolean dc() {
        aF var25;
        void var26;
        NPC nPC = this.de();
        NPC nPC2 = this.df();
        if (!aF.llIlIIlllIIlIl(nPC) || aF.llIlIIlllIIlll(nPC2)) {
            return lIlIIIIIIIlI[1];
        }
        if (aF.llIlIIlllIIlII(var26.isDead() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var25.ak.bq.dx(lIlIIIIIIIlI[3]).dy(lIlIIIIIIIlI[3]));
            return lIlIIIIIIIlI[2];
        }
        var25.db();
        if (aF.llIlIIlllIIlIl(var25.bS.getInteracting()) && aF.llIlIIlllIIlII(var25.bS.getInteracting().equals(var26) ? 1 : 0)) {
            return lIlIIIIIIIlI[1];
        }
        WorldPoint var27 = var25.dd();
        if (aF.llIlIIlllIlIII(var25.bS.distanceTo(var27), lIlIIIIIIIlI[4])) {
            Movement.setDestination((WorldPoint)var27);
            return lIlIIIIIIIlI[2];
        }
        nPC.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[1]]);
        return lIlIIIIIIIlI[2];
    }

    private static boolean llIlIIlllIlIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean cg() {
        aF var28;
        if (aF.llIlIIlllIIIll(this.bS.distanceTo(this.ak.bs), lIlIIIIIIIlI[2]) && aF.llIlIIlllIIlII(this.cT() ? 1 : 0)) {
            return lIlIIIIIIIlI[2];
        }
        int var29 = aG.dk();
        System.out.println("state: " + aG.dk());
        NPC var30 = NPCs.getNearest(nPC -> {
            int n2;
            if (aF.llIlIIlllIIlII(nPC.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[24]]) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIIIIIIIlI[2];

                }
            } else {
                n2 = lIlIIIIIIIlI[1];
            }
            return n2 != 0;
        });
        if (aF.llIlIIlllIIlIl(var30)) {
            Movement.setDestination((WorldPoint)var30.getWorldArea().getRandom());
            return lIlIIIIIIIlI[2];
        }
        switch (var29) {
            case 0: {
                if (aF.llIlIIlllIIlII(var28.cU() ? 1 : 0)) {
                    return lIlIIIIIIIlI[2];
                }
                return var28.cS();
            }
            case 3: {
                return var28.dc();
            }
            case 2: {
                return var28.j(lIlIIIIIIIlI[2]);
            }
            case 4: {
                return var28.j(lIlIIIIIIIlI[1]);
            }
            case 1: {
                return var28.dj();
            }
        }
        return lIlIIIIIIIlI[2];
    }

    public void db() {
        if (aF.llIlIIlllIIlII(this.cj().isFullyEquipped() ? 1 : 0) && aF.llIlIIlllIllII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            int[] nArray = new int[lIlIIIIIIIlI[4]];
            nArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIlI[11];
            nArray[aF.lIlIIIIIIIlI[2]] = lIlIIIIIIIlI[12];
            if (aF.llIlIIlllIIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
            }
        }
    }

    private void dh() {
    }

    private static boolean llIlIIlllIIlIl(Object object) {
        return object != null;
    }

    private static boolean llIlIIlllIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIlllIIlll(Object object) {
        return object == null;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.VASA));
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aF.llIlIIlllIIllI((Object)this.ak.bw, (Object)N.VASA)) {
            bl2 = lIlIIIIIIIlI[2];

            if (1 < 0) {
                return ((0x9F ^ 0xBC ^ (0x38 ^ 0x25)) & (0x77 ^ 0x30 ^ (0x5F ^ 0x26) ^ -1)) != 0;
            }
        } else {
            bl2 = lIlIIIIIIIlI[1];
        }
        return bl2;
    }

    private static boolean llIlIIlllIlIlI(int n2, int n3) {
        return n2 != n3;
    }
}

