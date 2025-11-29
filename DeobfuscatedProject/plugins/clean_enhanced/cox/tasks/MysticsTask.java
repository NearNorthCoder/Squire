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

import gg.squire.cox.tasks.GameEnum6;
import gg.squire.cox.tasks.GameEnum8;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.NHelper;
import gg.squire.cox.tasks.QHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
extends CoxManager {
    
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
        aC var3;
        if ((Reachable.isWalkable(WorldPointthis.ak.bt) ? 1 : 0)) {
            if ((Movement.getDestination( != null)) && (Movement.getDestination( != 0).equals((Object)this.al.bt) ? 1 : 0)) {
                return 1;
            }
            Movement.setDestination((WorldPoint)var3.al.bs);
            return 2;
        }
        TileObject var4 = var3.cR();
        if var4 == null {
            Movement.setDestination((WorldPoint)var3.ak.bq.dx(7).dy(7));
            return 2;
        }
        if (!(var3.bS.isMoving( == 0) ? 1 : 0) || (var3.bS.isAnimating( != 0) ? 1 : 0)) {
            return 1;
        }
        var1_1.interact(var2[8]);
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Client client, WorldArea worldArea, WorldArea worldArea2) {
        List list = worldArea.toWorldPointList();
        Iterator var5 = list.iterator();
        while ((var5.hasNext( != 0) ? 1 : 0)) {
            void var6;
            void var7;
            aC var8;
            WorldPoint var9 = (WorldPoint)var5.next();
            if ((var8.b((Client == 0)var7, var9.toWorldArea(), (WorldArea)var6) ? 1 : 0)) {
                return 1;
            }
            0;
            if null == null continue;
            return ((0x3F ^ 0x38) & ~(0x38 ^ 0x3F)) != 0;
        }
        return 2;
    }

    /*
     * WARNING - void declaration
     */
    private void cV() {
        aC var10;
        q var11;
        Object var12;
        void var13;
        List list = NPCs.getAll(nPC -> nPC.getName().contains(var2[var1[20]]));
        if ((list.isEmpty( != 0) ? 1 : 0)) {
            this.cS();
            0;
            return;
        }
        int lllllllllllllllIllIlllIIlIIlIlIl22 = 1;
        while ((lllllllllllllllIllIlllIIlIIlIlIl22 < var13.size())) {
            var12 = (NPC)var13.get(lllllllllllllllIllIlllIIlIIlIlIl22);
            if var12 == null {
                0;
                if (3 > (0xC3 ^ 0xC7)) {
                    return;
                }
            } else {
                var11 = new QHelper((NPC)var12);
                if ((var10.dG.contains(var11 == 0) ? 1 : 0)) {
                    var10.dG.add(var11);
                    0;
                    System.out.println("Adding more mystics | index: " + var12.getIndex());
                }
            }
            ++lllllllllllllllIllIlllIIlIIlIlIl22;
            0;
            if null == null continue;
            return;
        }
        var10.dG.removeIf(q2 -> {
            boolean bl2;
            if ((q2.aP( == null))) {
                bl2 = 2;
                0;
                if (3 == ((0x7B ^ 0x64) & ~(0x26 ^ 0x39))) {
                    return ((0x5D ^ 0x3F) & ~(0xFC ^ 0x9E)) != 0;
                }
            } else {
                bl2 = 1;
            }
            return bl2;
        });
        0;
        Iterator<q> lllllllllllllllIllIlllIIlIIlIlIl22 = var10.dG.iterator();
        while ((lllllllllllllllIllIlllIIlIIlIlIl22.hasNext( != 0) ? 1 : 0)) {
            var12 = lllllllllllllllIllIlllIIlIIlIlIl22.next();
            if (((qlllllllllllllllIllIlllIIlIIlIlII).aR() ? 1 : 0)) {
                0;
                if null == null continue;
                return;
            }
            var11 = ((q)var12).aP().getInteracting();
            if ((((q)var12).aP().getWorldArea().distanceTo((Locatable)var10.bS) <= 6) && var11 != null && ((ObjectlllllllllllllllIllIlllIIlIIlIIll).equals(var10.bS) ? 1 : 0) && ((qlllllllllllllllIllIlllIIlIIlIlII).aP().isMoving() ? 1 : 0)) {
                ((q)var12).g(2);
            }
            0;
            if (1 != 0) continue;
            return;
        }
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[var1[10]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[var1[18]];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 2;
                    0;
                    if (2 > 0) return n2 != 0;
                    return ((0xB2 ^ 0x94 ^ (0x4E ^ 0x74)) & (8 + 101 - -28 + 84 ^ 161 + 189 - 249 + 92 ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
    }

    @Inject
    protected MysticsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.dF = new HashSet<Integer>();
        this.dG = new ArrayList<q>();
        this.am = 0;
        this.dH = 1;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(Client client, Tile tile, Tile tile2) {
        void var26;
        void var27;
        Client var28;
        if ((tile.getPlane() != tile2.getPlane())) {
            return 1;
        }
        CollisionData[] var29 = var28.getCollisionMaps();
        if var29 == null {
            return 1;
        }
        int var30 = var27.getPlane();
        int[][] var31 = var29[var30].getFlags();
        Point var32 = var27.getSceneLocation();
        Point var33 = var26.getSceneLocation();
        if ((var32.getX() == var33.getX()) && (var32.getY() == var33.getY())) {
            return 2;
        }
        int var34 = var33.getX() - var32.getX();
        int var35 = var33.getY() - var32.getY();
        int var36 = Math.abs(var34);
        int var37 = Math.abs(var35);
        int var38 = 9;
        int var39 = 9;
        if (var34 < 0) {
            var38 |= var1[10];
            0;
            if ((40 + 109 - -6 + 4 ^ 3 + 43 - -74 + 35) <= 0) {
                return ((0xCA ^ 0xA6 ^ (0x7D ^ 0x73)) & (83 + 71 - 61 + 149 ^ 124 + 65 - 168 + 123 ^ -1)) != 0;
            }
        } else {
            var38 |= var1[11];
        }
        if (var35 < 0) {
            var39 |= 3;
            0;
            if (-3 > 0) {
                return ((0x2C ^ 0xC) & ~(0xB5 ^ 0x95)) != 0;
            }
        } else {
            var39 |= var1[12];
        }
        if (var36 > var37) {
            int var40;
            int n2;
            int var41 = var32.getX();
            int var42 = var32.getY() << 7;
            int var43 = (var35 << 7) / var36;
            var42 += var1[13];
            if (var35 < 0) {
                --var42;
            }
            if (var34 < 0) {
                n2 = 0;
                0;
                if null != null {
                    return ((0x40 ^ 0x17) & ~(0x62 ^ 0x35)) != 0;
                }
            } else {
                n2 = var40 = 2;
            }
            while ((var41 != var33.getX())) {
                int var44 = var42 >>> 7;
                if (var31[var41 += var40][var44] & var38 != 0) {
                    return 1;
                }
                int var45 = (var42 += var43) >>> 7;
                if ((var45 != var44) && (var31[var41][var45] & var39 != 0)) {
                    return 1;
                }
                0;
                if (-1 < 3) continue;
                return ((0x33 ^ 0x79) & ~(0xDA ^ 0x90)) != 0;
            }
            0;
            if (((0x7F ^ 0x3F) & ~(0x23 ^ 0x63)) > 0) {
                return ((0x1F ^ 0x3B) & ~(0xBD ^ 0x99)) != 0;
            }
        } else {
            int var40;
            int n3;
            int var41 = var32.getY();
            int var42 = var32.getX() << 7;
            int var43 = (var34 << 7) / var37;
            var42 += var1[13];
            if (var34 < 0) {
                --var42;
            }
            if (var35 < 0) {
                n3 = 0;
                0;
                if ((0x93 ^ 0xA9 ^ (0x23 ^ 0x1D)) < 0) {
                    return ((0xF6 ^ 0x8C ^ (0xAB ^ 0x87)) & (0x5B ^ 0x54 ^ (0x6E ^ 0x37) ^ -1)) != 0;
                }
            } else {
                n3 = var40 = 2;
            }
            while ((var41 != var33.getY())) {
                int var44 = var42 >>> 7;
                if (var31[var44][var41 += var40] & var39 != 0) {
                    return 1;
                }
                int var45 = (var42 += var43) >>> 7;
                if ((var45 != var44) && (var31[var45][var41] & var38 != 0)) {
                    return 1;
                }
                0;
                if (1 > -1) continue;
                return ((0xD9 ^ 0xB8) & ~(0x25 ^ 0x44)) != 0;
            }
        }
        return 2;
    }

    private static String var46(String var47, String var48) {
        var47 = new String(Base64.getDecoder().decode(var47.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var49 = new StringBuilder();
        char[] var50 = var48.toCharArray();
        int var51 = 1;
        char[] var52 = var47.toCharArray();
        int var53 = var52.length;
        int var54 = 1;
        while (var54 < var53) {
            char var55 = var52[var54];
            var49.append((char)(var55 ^ var50[var51 % var50.length]));
            0;
            ++var51;
            ++var54;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var49);
    }

    @Override
    public List<Prayer> ci() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(var2[6]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = var2[var1[19]];
                if ((nPC.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if (((5 ^ 0x30) & ~(0x80 ^ 0xB5)) > -1) return n2 != 0;
                    return ((0xE3 ^ 0xB0) & ~(0xCF ^ 0x9C)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if nPC2 == null {
            return null;
        }
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.PROTECT_FROM_MAGIC;
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var3_6;
        aC var56;
        this.cV();
        if ((this.dG.isEmpty( != 0) ? 1 : 0)) {
            return this.cS();
        }
        if (var56.dH != 0) {
            System.out.println(var2[1]);
            NPC var57 = NPCs.getNearest(nPC -> nPC.getName().contains(var2[var1[22]]));
            if var57 == null {
                return 1;
            }
            if ((var56.bS.getInteracting( != null)) && (var56.bS.getInteracting( != 0).getName().contains(var2[2]) ? 1 : 0)) {
                return 2;
            }
            var57.interact(var2[3]);
            return 2;
        }
        q var57 = var56.dG.stream().filter(q2 -> {
            int n2;
            if ((q2.aP( != null)) && (q2.aR( == 0) ? 1 : 0)) {
                n2 = 2;
                0;
                if (2 <= 0) {
                    return ((140 + 73 - 184 + 128 ^ 63 + 60 - 90 + 165) & (0x5A ^ 0x2F ^ (0x5F ^ 0x71) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(q2 -> this.bS.getWorldLocation().distanceToPath(this.cq, q2.aP().getWorldLocation()))).orElse(null);
        if var57 == null {
            System.out.println(var2[4]);
            WorldPoint var58 = H.MYSTICS_SAFESPOT.c(var56.ak);
            if ((var56.bS.getWorldLocation( != 0).equals((Object)var58) ? 1 : 0)) {
                int var59 = 1;
                while ((var59 < var56.dG.size())) {
                    q var60 = var56.dG.get(var59);
                    if ((var60.aP( != null)) && (var60.aP( != 0).isMoving() ? 1 : 0)) {
                        return 2;
                    }
                    ++var59;
                    0;
                    if (((215 + 215 - 349 + 160 ^ 157 + 137 - 219 + 97) & (126 + 20 - 14 + 71 ^ 74 + 15 - -28 + 33 ^ -1)) == 0) continue;
                    return ((0xA1 ^ 0x82 ^ (0xFE ^ 0x86)) & (0x7D ^ 0x38 ^ (0xA0 ^ 0xBE) ^ -1)) != 0;
                }
                if ((var56.dG.size() == NPCs.getAll(nPC -> {
                    int n2;
                    if ((nPC.getName( != 0).contains(var2[var1[21]]) ? 1 : 0) && (this.ak.a(LocatablenPC) ? 1 : 0)) {
                        n2 = 2;
                        0;
                        if (-1 > 1) {
                            return ((0xA5 ^ 0xC4) & ~(0x49 ^ 0x28)) != 0;
                        }
                    } else {
                        n2 = 1;
                    }
                    return n2 != 0;
                }).size())) {
                    var56.dH = 2;
                }
                return 2;
            }
            Movement.setDestination((WorldPoint)var58);
            return 2;
        }
        List var58 = var57.aP().getWorldLocation().createWorldArea(4).toWorldPointList();
        WorldPoint var59 = var58.stream().filter(worldPoint -> {
            int n2;
            if ((Reachable.isWalkable(WorldPointworldPoint) ? 1 : 0) && (var57.aP().getWorldArea().distanceTo(worldPoint) >= 3) && (this.a(this.cq, var57.aP( != 0).getWorldArea(), worldPoint.toWorldArea()) ? 1 : 0)) {
                n2 = 2;
                0;
                if null != null {
                    return ((0x57 ^ 0x11) & ~(0x15 ^ 0x53)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.bS))).orElse(null);
        if var59 == null {
            System.out.println(var2[5]);
            return 2;
        }
        Movement.setDestination((WorldPoint)var3_6);
        return 2;
    }

    @Override
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (((Object)this.ak.bw == (Object)this.ak.bw2)N.MYSTICS)) {
            return 2;
        }
        this.dG.clear();
        this.dH = 1;
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=1.0f)
    private void a(AnimationChanged animationChanged) {
        Actor actor = animationChanged.getActor();
        if ((actor.getName( != 0).contains(var2[var1[14]]) ? 1 : 0)) {
            int n2 = ((NPC)actor).getIndex();
            Iterator<q> var61 = this.dG.iterator();
            while ((var61.hasNext( != 0) ? 1 : 0)) {
                void var62;
                q var63 = var61.next();
                if ((var63.aP().getIndex() == (int)var62)) {
                    void var64;
                    if ((var64.getAnimation() == var1[15])) {
                        Actor var65;
                        Player var66 = Players.getLocal();
                        if (var66 != null && (var65 = var66.getInteracting( != null)) && (var65.equalslllllllllllllllIllIlllIIIIIllIlI)) {
                            return;
                        }
                        var63.g(1);
                    }
                    if ((var64.getAnimation() == var1[16])) {
                        var63.g(2);
                    }
                    System.out.println(var2[var1[17]]);
                }
                0;
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
        void var67;
        int var68;
        int var69;
        void var70;
        int var71;
        void var72;
        int var73;
        void var74;
        void var75;
        void var76;
        void var77;
        int n2 = worldArea.getPlane();
        int n3 = worldArea.getX();
        int n4 = worldArea.getY();
        int n5 = worldArea.getWidth();
        int n6 = worldArea.getHeight();
        if ((n2 != worldArea2.getPlane())) {
            return 1;
        }
        LocalPoint var78 = LocalPoint.fromWorld((Client)var77, (int)var76, (int)var75);
        LocalPoint var79 = LocalPoint.fromWorld((Client)var77, (int)var74.getX(), (int)var74.getY());
        if (!var78 != null || var79 == null) {
            return 1;
        }
        int var80 = var78.getSceneX();
        int var81 = var78.getSceneY();
        int var82 = var79.getSceneX();
        int var83 = var79.getSceneY();
        if (var82 <= var80) {
            var73 = var80;
            0;
            if ((0x79 ^ 0x7C ^ 1) < -1) {
                return ((146 + 82 - 92 + 32 ^ 8 + 16 - -20 + 110) & (41 + 144 - 119 + 97 ^ 88 + 74 - 29 + 12 ^ -1)) != 0;
            }
        } else if (var82 >= var80 + var72 - 2) {
            var73 = var80 + var72 - 2;
            0;
            if (-(0x78 ^ 0x7C) > 0) {
                return ((0x66 ^ 0x39) & ~(0x76 ^ 0x29)) != 0;
            }
        } else {
            var73 = var82;
        }
        if (var83 <= var81) {
            var71 = var81;
            0;
            if (-3 > 0) {
                return ((0x9F ^ 0x9B) & ~(0x4F ^ 0x4B)) != 0;
            }
        } else if (var83 >= var81 + var70 - 2) {
            var71 = var81 + var70 - 2;
            0;
            if (3 <= 2) {
                return ((0x5A ^ 0x75) & ~(0xE9 ^ 0xC6)) != 0;
            }
        } else {
            var71 = var83;
        }
        if (var80 <= var82) {
            var69 = var82;
            0;
            if (((0x42 ^ 0x17 ^ (0x1F ^ 0x67)) & (0x1B ^ 0x63 ^ (0xF2 ^ 0xA7) ^ -1)) != 0) {
                return (1 & (1 ^ -1)) != 0;
            }
        } else if ((var80 >= var82 + var74.getWidth() - 2)) {
            var69 = var82 + var74.getWidth() - 2;
            0;
            if null != null {
                return ((0x21 ^ 0x76 ^ (0x12 ^ 0x1A)) & (0xF4 ^ 0x9F ^ (0x9D ^ 0xA9) ^ -1)) != 0;
            }
        } else {
            var69 = var80;
        }
        if (var81 <= var83) {
            var68 = var83;
            0;
            
        } else if ((var81 >= var83 + var74.getHeight() - 2)) {
            var68 = var83 + var74.getHeight() - 2;
            0;
            if (((0x28 ^ 0x15 ^ (0x2A ^ 0x36)) & (0x21 ^ 0x4A ^ (0xEE ^ 0xA4) ^ -1)) != 0) {
                return ((198 + 111 - 281 + 187 ^ 26 + 101 - 109 + 122) & (154 + 110 - 213 + 156 ^ 37 + 18 - 2 + 95 ^ -1)) != 0;
            }
        } else {
            var68 = var81;
        }
        Tile[][][] var84 = var77.getScene().getTiles();
        Tile var85 = var84[var67][var73][var71];
        Tile var86 = var84[var74.getPlane()][var69][var68];
        if (!var85 != null || var86 == null) {
            return 1;
        }
        return aC.a(client, (Tile)var20_20, (Tile)var21_21);
    }

}

