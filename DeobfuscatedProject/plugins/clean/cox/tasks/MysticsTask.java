/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.CollisionData
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.Prayer
 *  net.runelite.api.Tile
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum30;
import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.q;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.CollisionData;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Prayer;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Mystics", priority=10000, blocking=true, register=true)
public class MysticsTask
extends CoxTaskBase {
    
    private  boolean dH;
    private  n al;
    private  List<q> dG;
    
    private  n ak;
    private  Set<Integer> dF;
    private  int am;

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aC var1;
        if (aC.llIllIIIIlIlll(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aC.llIllIIIIllIIl(Movement.getDestination()) && aC.llIllIIIIlIlll(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIlIIIlll[1];
            }
            Movement.setDestination((WorldPoint)var1.al.bs);
            return lIlIIlIIIlll[2];
        }
        TileObject var2 = var1.cR();
        if (aC.llIllIIIIllIII(var2)) {
            Movement.setDestination((WorldPoint)var1.ak.bq.dx(lIlIIlIIIlll[7]).dy(lIlIIlIIIlll[7]));
            return lIlIIlIIIlll[2];
        }
        if (!aC.llIllIIIIlllII(var1.bS.isMoving() ? 1 : 0) || aC.llIllIIIIlIlll(var1.bS.isAnimating() ? 1 : 0)) {
            return lIlIIlIIIlll[1];
        }
        var1_1.interact(lIlIIlIIIllI[lIlIIlIIIlll[8]]);
        return lIlIIlIIIlll[2];
    }

    private static boolean llIllIIIIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIIIllIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Client client, WorldArea worldArea, WorldArea worldArea2) {
        List list = worldArea.toWorldPointList();
        Iterator var3 = list.iterator();
        while (aC.llIllIIIIlIlll(var3.hasNext() ? 1 : 0)) {
            void var4;
            void var5;
            aC var6;
            WorldPoint var7 = (WorldPoint)var3.next();
            if (aC.llIllIIIIlllII(var6.b((Client)var5, var7.toWorldArea(), (WorldArea)var4) ? 1 : 0)) {
                return lIlIIlIIIlll[1];
            }

            return false;
        }
        return lIlIIlIIIlll[2];
    }

    private static boolean llIllIIIlIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private void cV() {
        aC var8;
        q var9;
        Object var10;
        void var11;
        List list = NPCs.getAll(nPC -> nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[20]]));
        if (aC.llIllIIIIlIlll(list.isEmpty() ? 1 : 0)) {
            this.cS();

            return;
        }
        int lllllllllllllllIllIlllIIlIIlIlIl22 = lIlIIlIIIlll[1];
        while (aC.llIllIIIIllIlI(lllllllllllllllIllIlllIIlIIlIlIl22, var11.size())) {
            var10 = (NPC)var11.get(lllllllllllllllIllIlllIIlIIlIlIl22);
            if (aC.llIllIIIIllIII(var10)) {

                if (3 > (0xC3 ^ 0xC7)) {
                    return;
                }
            } else {
                var9 = new q((NPC)var10);
                if (aC.llIllIIIIlllII(var8.dG.contains(var9) ? 1 : 0)) {
                    var8.dG.add(var9);

                    System.out.println("Adding more mystics | index: " + var10.getIndex());
                }
            }
            ++lllllllllllllllIllIlllIIlIIlIlIl22;

            return;
        }
        var8.dG.removeIf(q2 -> {
            boolean bl2;
            if (aC.llIllIIIIllIII(q2.aP())) {
                bl2 = lIlIIlIIIlll[2];

                if (3 == ((0x7B ^ 0x64) & ~(0x26 ^ 0x39))) {
                    return false;
                }
            } else {
                bl2 = lIlIIlIIIlll[1];
            }
            return bl2;
        });

        Iterator<q> lllllllllllllllIllIlllIIlIIlIlIl22 = var8.dG.iterator();
        while (aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIlIIlIlIl22.hasNext() ? 1 : 0)) {
            var10 = lllllllllllllllIllIlllIIlIIlIlIl22.next();
            if (aC.llIllIIIIlIlll(((q)var10).aR() ? 1 : 0)) {

                return;
            }
            var9 = ((q)var10).aP().getInteracting();
            if (aC.llIllIIIIlllIl(((q)var10).aP().getWorldArea().distanceTo((Locatable)var8.bS), lIlIIlIIIlll[6]) && aC.llIllIIIIllIIl(var9) && aC.llIllIIIIlIlll(((Object)var9).equals(var8.bS) ? 1 : 0) && aC.llIllIIIIlIlll(((q)var10).aP().isMoving() ? 1 : 0)) {
                ((q)var10).g(lIlIIlIIIlll[2]);
            }

            if (1 != 0) continue;
            return;
        }
    }

    private static boolean llIllIIIIlIlll(int n2) {
        return n2 != 0;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aC.llIllIIIIlIlll(tileObject.getName().equals(lIlIIlIIIllI[lIlIIlIIIlll[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIIlll[2]];
                stringArray[aC.lIlIIlIIIlll[1]] = lIlIIlIIIllI[lIlIIlIIIlll[18]];
                if (aC.llIllIIIIlIlll(tileObject.hasAction(stringArray) ? 1 : 0) && aC.llIllIIIIlIlll(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIlIIIlll[2];

                    if (2 > 0) return n2 != 0;
                    return ((0xB2 ^ 0x94 ^ (0x4E ^ 0x74)) & (8 + 101 - -28 + 84 ^ 161 + 189 - 249 + 92 ^ -1)) != 0;
                }
            }
            n2 = lIlIIlIIIlll[1];
            return n2 != 0;
        });
    }

    @Inject
    protected MysticsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dF = new HashSet<Integer>();
        this.dG = new ArrayList<q>();
        this.am = lIlIIlIIIlll[0];
        this.dH = lIlIIlIIIlll[1];
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIIIIlllII(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIIIIlllll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(Client client, Tile tile, Tile tile2) {
        void var12;
        void var13;
        Client var14;
        if (aC.llIllIIIIlllll(tile.getPlane(), tile2.getPlane())) {
            return lIlIIlIIIlll[1];
        }
        CollisionData[] var15 = var14.getCollisionMaps();
        if (aC.llIllIIIIllIII(var15)) {
            return lIlIIlIIIlll[1];
        }
        int var16 = var13.getPlane();
        int[][] var17 = var15[var16].getFlags();
        Point var18 = var13.getSceneLocation();
        Point var19 = var12.getSceneLocation();
        if (aC.llIllIIIIllIll(var18.getX(), var19.getX()) && aC.llIllIIIIllIll(var18.getY(), var19.getY())) {
            return lIlIIlIIIlll[2];
        }
        int var20 = var19.getX() - var18.getX();
        int var21 = var19.getY() - var18.getY();
        int var22 = Math.abs(var20);
        int var23 = Math.abs(var21);
        int var24 = lIlIIlIIIlll[9];
        int var25 = lIlIIlIIIlll[9];
        if (aC.llIllIIIlIIIIl(var20)) {
            var24 |= lIlIIlIIIlll[10];

            if ((40 + 109 - -6 + 4 ^ 3 + 43 - -74 + 35) <= 0) {
                return ((0xCA ^ 0xA6 ^ (0x7D ^ 0x73)) & (83 + 71 - 61 + 149 ^ 124 + 65 - 168 + 123 ^ -1)) != 0;
            }
        } else {
            var24 |= lIlIIlIIIlll[11];
        }
        if (aC.llIllIIIlIIIIl(var21)) {
            var25 |= lIlIIlIIIlll[3];

        } else {
            var25 |= lIlIIlIIIlll[12];
        }
        if (aC.llIllIIIlIIIlI(var22, var23)) {
            int var26;
            int n2;
            int var27 = var18.getX();
            int var28 = var18.getY() << lIlIIlIIIlll[7];
            int var29 = (var21 << lIlIIlIIIlll[7]) / var22;
            var28 += lIlIIlIIIlll[13];
            if (aC.llIllIIIlIIIIl(var21)) {
                --var28;
            }
            if (aC.llIllIIIlIIIIl(var20)) {
                n2 = lIlIIlIIIlll[0];

                }
            } else {
                n2 = var26 = lIlIIlIIIlll[2];
            }
            while (aC.llIllIIIIlllll(var27, var19.getX())) {
                int var30 = var28 >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlIlll(var17[var27 += var26][var30] & var24)) {
                    return lIlIIlIIIlll[1];
                }
                int var31 = (var28 += var29) >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlllll(var31, var30) && aC.llIllIIIIlIlll(var17[var27][var31] & var25)) {
                    return lIlIIlIIIlll[1];
                }

                if (-1 < 3) continue;
                return false;
            }

            if (((0x7F ^ 0x3F) & ~(0x23 ^ 0x63)) > 0) {
                return false;
            }
        } else {
            int var26;
            int n3;
            int var27 = var18.getY();
            int var28 = var18.getX() << lIlIIlIIIlll[7];
            int var29 = (var20 << lIlIIlIIIlll[7]) / var23;
            var28 += lIlIIlIIIlll[13];
            if (aC.llIllIIIlIIIIl(var20)) {
                --var28;
            }
            if (aC.llIllIIIlIIIIl(var21)) {
                n3 = lIlIIlIIIlll[0];

                if ((0x93 ^ 0xA9 ^ (0x23 ^ 0x1D)) < 0) {
                    return ((0xF6 ^ 0x8C ^ (0xAB ^ 0x87)) & (0x5B ^ 0x54 ^ (0x6E ^ 0x37) ^ -1)) != 0;
                }
            } else {
                n3 = var26 = lIlIIlIIIlll[2];
            }
            while (aC.llIllIIIIlllll(var27, var19.getY())) {
                int var30 = var28 >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlIlll(var17[var30][var27 += var26] & var25)) {
                    return lIlIIlIIIlll[1];
                }
                int var31 = (var28 += var29) >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlllll(var31, var30) && aC.llIllIIIIlIlll(var17[var31][var27] & var24)) {
                    return lIlIIlIIIlll[1];
                }

                if (1 > -1) continue;
                return false;
            }
        }
        return lIlIIlIIIlll[2];
    }

    private static boolean llIllIIIIllIII(Object object) {
        return object == null;
    }

    private static boolean llIllIIIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var32);
    }

    static {
        aC.llIllIIIIlIllI();
        aC.llIllIIIIlIlIl();
    }

    @Override
    public List<Prayer> ci() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aC.llIllIIIIlIlll(nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIIIlll[2]];
                stringArray[aC.lIlIIlIIIlll[1]] = lIlIIlIIIllI[lIlIIlIIIlll[19]];
                if (aC.llIllIIIIlIlll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIIIlll[2];

                    if (((5 ^ 0x30) & ~(0x80 ^ 0xB5)) > -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIlIIIlll[1];
            return n2 != 0;
        });
        if (aC.llIllIIIIllIII(nPC2)) {
            return null;
        }
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.PROTECT_FROM_MAGIC;
        arrayList.add(prayer);

        arrayList.addAll(list);

        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var3_6;
        aC var33;
        this.cV();
        if (aC.llIllIIIIlIlll(this.dG.isEmpty() ? 1 : 0)) {
            return this.cS();
        }
        if (aC.llIllIIIIlIlll(var33.dH ? 1 : 0)) {
            System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[1]]);
            NPC var34 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[22]]));
            if (aC.llIllIIIIllIII(var34)) {
                return lIlIIlIIIlll[1];
            }
            if (aC.llIllIIIIllIIl(var33.bS.getInteracting()) && aC.llIllIIIIlIlll(var33.bS.getInteracting().getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[2]]) ? 1 : 0)) {
                return lIlIIlIIIlll[2];
            }
            var34.interact(lIlIIlIIIllI[lIlIIlIIIlll[3]]);
            return lIlIIlIIIlll[2];
        }
        q var34 = var33.dG.stream().filter(q2 -> {
            int n2;
            if (aC.llIllIIIIllIIl(q2.aP()) && aC.llIllIIIIlllII(q2.aR() ? 1 : 0)) {
                n2 = lIlIIlIIIlll[2];

                if (2 <= 0) {
                    return ((140 + 73 - 184 + 128 ^ 63 + 60 - 90 + 165) & (0x5A ^ 0x2F ^ (0x5F ^ 0x71) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIlIIIlll[1];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(q2 -> this.bS.getWorldLocation().distanceToPath(this.cq, q2.aP().getWorldLocation()))).orElse(null);
        if (aC.llIllIIIIllIII(var34)) {
            System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[4]]);
            WorldPoint var35 = H.MYSTICS_SAFESPOT.c(var33.ak);
            if (aC.llIllIIIIlIlll(var33.bS.getWorldLocation().equals((Object)var35) ? 1 : 0)) {
                int var36 = lIlIIlIIIlll[1];
                while (aC.llIllIIIIllIlI(var36, var33.dG.size())) {
                    q var37 = var33.dG.get(var36);
                    if (aC.llIllIIIIllIIl(var37.aP()) && aC.llIllIIIIlIlll(var37.aP().isMoving() ? 1 : 0)) {
                        return lIlIIlIIIlll[2];
                    }
                    ++var36;

                    if (((215 + 215 - 349 + 160 ^ 157 + 137 - 219 + 97) & (126 + 20 - 14 + 71 ^ 74 + 15 - -28 + 33 ^ -1)) == 0) continue;
                    return ((0xA1 ^ 0x82 ^ (0xFE ^ 0x86)) & (0x7D ^ 0x38 ^ (0xA0 ^ 0xBE) ^ -1)) != 0;
                }
                if (aC.llIllIIIIllIll(var33.dG.size(), NPCs.getAll(nPC -> {
                    int n2;
                    if (aC.llIllIIIIlIlll(nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[21]]) ? 1 : 0) && aC.llIllIIIIlIlll(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                        n2 = lIlIIlIIIlll[2];

                        if (-1 > 1) {
                            return false;
                        }
                    } else {
                        n2 = lIlIIlIIIlll[1];
                    }
                    return n2 != 0;
                }).size())) {
                    var33.dH = lIlIIlIIIlll[2];
                }
                return lIlIIlIIIlll[2];
            }
            Movement.setDestination((WorldPoint)var35);
            return lIlIIlIIIlll[2];
        }
        List var35 = var34.aP().getWorldLocation().createWorldArea(lIlIIlIIIlll[4]).toWorldPointList();
        WorldPoint var36 = var35.stream().filter(worldPoint -> {
            int n2;
            if (aC.llIllIIIIlIlll(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aC.llIllIIIlIIIII(var34.aP().getWorldArea().distanceTo(worldPoint), lIlIIlIIIlll[3]) && aC.llIllIIIIlIlll(this.a(this.cq, var34.aP().getWorldArea(), worldPoint.toWorldArea()) ? 1 : 0)) {
                n2 = lIlIIlIIIlll[2];

                }
            } else {
                n2 = lIlIIlIIIlll[1];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.bS))).orElse(null);
        if (aC.llIllIIIIllIII(var36)) {
            System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[5]]);
            return lIlIIlIIIlll[2];
        }
        Movement.setDestination((WorldPoint)var3_6);
        return lIlIIlIIIlll[2];
    }

    @Override
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aC.llIllIIIIllllI((Object)this.ak.bw, (Object)N.MYSTICS)) {
            return lIlIIlIIIlll[2];
        }
        this.dG.clear();
        this.dH = lIlIIlIIIlll[1];
        return lIlIIlIIIlll[1];
    }

    private static void llIllIIIIlIlIl() {
        lIlIIlIIIllI = new String[lIlIIlIIIlll[23]];
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[1]] = "reached safespot";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[2]] = "Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[3]] = "Attack";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[4]] = "no mystics that need luring";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[5]] = "couldnt find safe";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[8]] = "Enter";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[14]] = "Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[17]] = "mystic changed animation";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[10]] = "Passage";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[18]] = "Enter";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[6]] = "Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[19]] = "Attack";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[20]] = "Skeletal Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[21]] = "Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[22]] = "Mystic";
    }

    private static boolean llIllIIIlIIIIl(int n2) {
        return n2 < 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=1.0f)
    private void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if (aC.llIllIIIIlIlll(actor.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[14]]) ? 1 : 0)) {
            int n2 = ((NPC)actor).getIndex();
            Iterator<q> var38 = this.dG.iterator();
            while (aC.llIllIIIIlIlll(var38.hasNext() ? 1 : 0)) {
                void var39;
                q var40 = var38.next();
                if (aC.llIllIIIIllIll(var40.aP().getIndex(), (int)var39)) {
                    void var41;
                    if (aC.llIllIIIIllIll(var41.getAnimation(), lIlIIlIIIlll[15])) {
                        Actor var42;
                        Player var43 = Players.getLocal();
                        if (aC.llIllIIIIllIIl(var43) && aC.llIllIIIIllIIl(var42 = var43.getInteracting()) && aC.llIllIIIIlIlll(var42.equals(var41) ? 1 : 0)) {
                            return;
                        }
                        var40.g(lIlIIlIIIlll[1]);
                    }
                    if (aC.llIllIIIIllIll(var41.getAnimation(), lIlIIlIIIlll[16])) {
                        var40.g(lIlIIlIIIlll[2]);
                    }
                    System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[17]]);
                }

                if (2 == 2) continue;
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(Client client, WorldArea worldArea, WorldArea worldArea2) {
        void var21_21;
        void var20_20;
        void var44;
        int var45;
        int var46;
        void var47;
        int var48;
        void var49;
        int var50;
        void var51;
        void var52;
        void var53;
        void var54;
        int n2 = worldArea.getPlane();
        int n3 = worldArea.getX();
        int n4 = worldArea.getY();
        int n5 = worldArea.getWidth();
        int n6 = worldArea.getHeight();
        if (aC.llIllIIIIlllll(n2, worldArea2.getPlane())) {
            return lIlIIlIIIlll[1];
        }
        LocalPoint var55 = LocalPoint.fromWorld((Client)var54, (int)var53, (int)var52);
        LocalPoint var56 = LocalPoint.fromWorld((Client)var54, (int)var51.getX(), (int)var51.getY());
        if (!aC.llIllIIIIllIIl(var55) || aC.llIllIIIIllIII(var56)) {
            return lIlIIlIIIlll[1];
        }
        int var57 = var55.getSceneX();
        int var58 = var55.getSceneY();
        int var59 = var56.getSceneX();
        int var60 = var56.getSceneY();
        if (aC.llIllIIIIlllIl(var59, var57)) {
            var50 = var57;

            if ((0x79 ^ 0x7C ^ 1) < -1) {
                return false;
            }
        } else if (aC.llIllIIIlIIIII(var59, var57 + var49 - lIlIIlIIIlll[2])) {
            var50 = var57 + var49 - lIlIIlIIIlll[2];

            if (-(0x78 ^ 0x7C) > 0) {
                return false;
            }
        } else {
            var50 = var59;
        }
        if (aC.llIllIIIIlllIl(var60, var58)) {
            var48 = var58;

        } else if (aC.llIllIIIlIIIII(var60, var58 + var47 - lIlIIlIIIlll[2])) {
            var48 = var58 + var47 - lIlIIlIIIlll[2];

            if (3 <= 2) {
                return false;
            }
        } else {
            var48 = var60;
        }
        if (aC.llIllIIIIlllIl(var57, var59)) {
            var46 = var59;

            if (((0x42 ^ 0x17 ^ (0x1F ^ 0x67)) & (0x1B ^ 0x63 ^ (0xF2 ^ 0xA7) ^ -1)) != 0) {
                return (1 & (1 ^ -1)) != 0;
            }
        } else if (aC.llIllIIIlIIIII(var57, var59 + var51.getWidth() - lIlIIlIIIlll[2])) {
            var46 = var59 + var51.getWidth() - lIlIIlIIIlll[2];

            }
        } else {
            var46 = var57;
        }
        if (aC.llIllIIIIlllIl(var58, var60)) {
            var45 = var60;

            if (3 == 0) {
                return false;
            }
        } else if (aC.llIllIIIlIIIII(var58, var60 + var51.getHeight() - lIlIIlIIIlll[2])) {
            var45 = var60 + var51.getHeight() - lIlIIlIIIlll[2];

            if (((0x28 ^ 0x15 ^ (0x2A ^ 0x36)) & (0x21 ^ 0x4A ^ (0xEE ^ 0xA4) ^ -1)) != 0) {
                return false;
            }
        } else {
            var45 = var58;
        }
        Tile[][][] var61 = var54.getScene().getTiles();
        Tile var62 = var61[var44][var50][var48];
        Tile var63 = var61[var51.getPlane()][var46][var45];
        if (!aC.llIllIIIIllIIl(var62) || aC.llIllIIIIllIII(var63)) {
            return lIlIIlIIIlll[1];
        }
        return aC.a(client, (Tile)var20_20, (Tile)var21_21);
    }

    private static boolean llIllIIIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllIIIIllllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllIIIIllIll(int n2, int n3) {
        return n2 == n3;
    }

}

