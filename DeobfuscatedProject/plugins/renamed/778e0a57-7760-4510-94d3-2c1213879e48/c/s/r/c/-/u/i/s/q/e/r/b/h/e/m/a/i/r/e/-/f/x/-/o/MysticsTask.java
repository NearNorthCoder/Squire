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
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.HEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.q_Unknown;
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

/* TASK: Mystics -> MysticsTask */
@TaskDesc(name="Mystics", priority=10000, blocking=true, register=true)
public class MysticsTask
extends U_Unknown {
    private static /* synthetic */ int[] lIlIIlIIIlll;
    private /* synthetic */ boolean dH;
    private /* synthetic */ n al;
    private /* synthetic */ List<q> dG;
    private static /* synthetic */ String[] lIlIIlIIIllI;
    private /* synthetic */ n ak;
    private /* synthetic */ Set<Integer> dF;
    private /* synthetic */ int am;

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aC var68;
        if (aC.llIllIIIIlIlll(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aC.llIllIIIIllIIl(Movement.getDestination()) && aC.llIllIIIIlIlll(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIlIIIlll[1];
            }
            Movement.setDestination((WorldPoint)var68.al.bs);
            return lIlIIlIIIlll[2];
        }
        TileObject var63 = var68.cR();
        if (aC.llIllIIIIllIII(var63)) {
            Movement.setDestination((WorldPoint)var68.ak.bq.dx(lIlIIlIIIlll[7]).dy(lIlIIlIIIlll[7]));
            return lIlIIlIIIlll[2];
        }
        if (!aC.llIllIIIIlllII(var68.bS.isMoving() ? 1 : 0) || aC.llIllIIIIlIlll(var68.bS.isAnimating() ? 1 : 0)) {
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
        Iterator var42 = list.iterator();
        while (aC.llIllIIIIlIlll(var42.hasNext() ? 1 : 0)) {
            void var45;
            void var34;
            aC var46;
            WorldPoint var17 = (WorldPoint)var42.next();
            if (aC.llIllIIIIlllII(var46.b((Client)var34, var17.toWorldArea(), (WorldArea)var45) ? 1 : 0)) {
                return lIlIIlIIIlll[1];
            }
            0;
            
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
        aC var69;
        q var61;
        Object var51;
        void var3;
        List list = NPCs.getAll(nPC -> nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[20]]));
        if (aC.llIllIIIIlIlll(list.isEmpty() ? 1 : 0)) {
            this.cS();
            0;
            return;
        }
        int lllllllllllllllIllIlllIIlIIlIlIl22 = lIlIIlIIIlll[1];
        while (aC.llIllIIIIllIlI(lllllllllllllllIllIlllIIlIIlIlIl22, var3.size())) {
            var51 = (NPC)var3.get(lllllllllllllllIllIlllIIlIIlIlIl22);
            if (aC.llIllIIIIllIII(var51)) {
                0;
                if (3 > (0xC3 ^ 0xC7)) {
                    return;
                }
            } else {
                var61 = new q((NPC)var51);
                if (aC.llIllIIIIlllII(var69.dG.contains(var61) ? 1 : 0)) {
                    var69.dG.add(var61);
                    0;
                    System.out.println("Adding more mystics | index: " + var51.getIndex());
                }
            }
            ++lllllllllllllllIllIlllIIlIIlIlIl22;
            0;
            
            return;
        }
        var69.dG.removeIf(q2 -> {
            boolean bl2;
            if (aC.llIllIIIIllIII(q2.aP())) {
                bl2 = lIlIIlIIIlll[2];
                0;
                if (3 == ((0x7B ^ 0x64) & ~(0x26 ^ 0x39))) {
                    return false;
                }
            } else {
                bl2 = lIlIIlIIIlll[1];
            }
            return bl2;
        });
        0;
        Iterator<q> lllllllllllllllIllIlllIIlIIlIlIl22 = var69.dG.iterator();
        while (aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIlIIlIlIl22.hasNext() ? 1 : 0)) {
            var51 = lllllllllllllllIllIlllIIlIIlIlIl22.next();
            if (aC.llIllIIIIlIlll(((q)var51).aR() ? 1 : 0)) {
                0;
                
                return;
            }
            var61 = ((q)var51).aP().getInteracting();
            if (aC.llIllIIIIlllIl(((q)var51).aP().getWorldArea().distanceTo((Locatable)var69.bS), lIlIIlIIIlll[6]) && aC.llIllIIIIllIIl(var61) && aC.llIllIIIIlIlll(((Object)var61).equals(var69.bS) ? 1 : 0) && aC.llIllIIIIlIlll(((q)var51).aP().isMoving() ? 1 : 0)) {
                ((q)var51).g(lIlIIlIIIlll[2]);
            }
            0;
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
                    0;
                    if (2 > 0) return n2 != 0;
                    return ((0xB2 ^ 0x94 ^ (0x4E ^ 0x74)) & (8 + 101 - -28 + 84 ^ 161 + 189 - 249 + 92 ^ -1)) != 0;
                }
            }
            n2 = lIlIIlIIIlll[1];
            return n2 != 0;
        });
    }

    @Inject
    protected aC(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
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

    private static String llIllIIIIlIIll(String var58, String var74) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var74.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIlll[10]), "DES");
            Cipher var59 = Cipher.getInstance("DES");
            var59.init(lIlIIlIIIlll[3], var7);
            return new String(var59.doFinal(Base64.getDecoder().decode(var58.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIIlIlII(String var1, String var26) {
        try {
            SecretKeySpec var65 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var26.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var39 = Cipher.getInstance("Blowfish");
            var39.init(lIlIIlIIIlll[3], var65);
            return new String(var39.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var73) {
            var73.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(Client client, Tile tile, Tile tile2) {
        void var54;
        void var70;
        Client var8;
        if (aC.llIllIIIIlllll(tile.getPlane(), tile2.getPlane())) {
            return lIlIIlIIIlll[1];
        }
        CollisionData[] var28 = var8.getCollisionMaps();
        if (aC.llIllIIIIllIII(var28)) {
            return lIlIIlIIIlll[1];
        }
        int var72 = var70.getPlane();
        int[][] var5 = var28[var72].getFlags();
        Point var55 = var70.getSceneLocation();
        Point var56 = var54.getSceneLocation();
        if (aC.llIllIIIIllIll(var55.getX(), var56.getX()) && aC.llIllIIIIllIll(var55.getY(), var56.getY())) {
            return lIlIIlIIIlll[2];
        }
        int var47 = var56.getX() - var55.getX();
        int var40 = var56.getY() - var55.getY();
        int var60 = Math.abs(var47);
        int var12 = Math.abs(var40);
        int var24 = lIlIIlIIIlll[9];
        int var71 = lIlIIlIIIlll[9];
        if (aC.llIllIIIlIIIIl(var47)) {
            var24 |= lIlIIlIIIlll[10];
            0;
            if ((40 + 109 - -6 + 4 ^ 3 + 43 - -74 + 35) <= 0) {
                return ((0xCA ^ 0xA6 ^ (0x7D ^ 0x73)) & (83 + 71 - 61 + 149 ^ 124 + 65 - 168 + 123 ^ -1)) != 0;
            }
        } else {
            var24 |= lIlIIlIIIlll[11];
        }
        if (aC.llIllIIIlIIIIl(var40)) {
            var71 |= lIlIIlIIIlll[3];
            0;
            if (-3 > 0) {
                return false;
            }
        } else {
            var71 |= lIlIIlIIIlll[12];
        }
        if (aC.llIllIIIlIIIlI(var60, var12)) {
            int var22;
            int n2;
            int var76 = var55.getX();
            int var36 = var55.getY() << lIlIIlIIIlll[7];
            int var31 = (var40 << lIlIIlIIIlll[7]) / var60;
            var36 += lIlIIlIIIlll[13];
            if (aC.llIllIIIlIIIIl(var40)) {
                --var36;
            }
            if (aC.llIllIIIlIIIIl(var47)) {
                n2 = lIlIIlIIIlll[0];
                0;
                
                }
            } else {
                n2 = var22 = lIlIIlIIIlll[2];
            }
            while (aC.llIllIIIIlllll(var76, var56.getX())) {
                int var62 = var36 >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlIlll(var5[var76 += var22][var62] & var24)) {
                    return lIlIIlIIIlll[1];
                }
                int var32 = (var36 += var31) >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlllll(var32, var62) && aC.llIllIIIIlIlll(var5[var76][var32] & var71)) {
                    return lIlIIlIIIlll[1];
                }
                0;
                if (-1 < 3) continue;
                return false;
            }
            0;
            if (((0x7F ^ 0x3F) & ~(0x23 ^ 0x63)) > 0) {
                return false;
            }
        } else {
            int var22;
            int n3;
            int var76 = var55.getY();
            int var36 = var55.getX() << lIlIIlIIIlll[7];
            int var31 = (var47 << lIlIIlIIIlll[7]) / var12;
            var36 += lIlIIlIIIlll[13];
            if (aC.llIllIIIlIIIIl(var47)) {
                --var36;
            }
            if (aC.llIllIIIlIIIIl(var40)) {
                n3 = lIlIIlIIIlll[0];
                0;
                if ((0x93 ^ 0xA9 ^ (0x23 ^ 0x1D)) < 0) {
                    return ((0xF6 ^ 0x8C ^ (0xAB ^ 0x87)) & (0x5B ^ 0x54 ^ (0x6E ^ 0x37) ^ -1)) != 0;
                }
            } else {
                n3 = var22 = lIlIIlIIIlll[2];
            }
            while (aC.llIllIIIIlllll(var76, var56.getY())) {
                int var62 = var36 >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlIlll(var5[var62][var76 += var22] & var71)) {
                    return lIlIIlIIIlll[1];
                }
                int var32 = (var36 += var31) >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlllll(var32, var62) && aC.llIllIIIIlIlll(var5[var32][var76] & var24)) {
                    return lIlIIlIIIlll[1];
                }
                0;
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

    private static String llIllIIIIlIIlI(String var20, String var19) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var35 = new StringBuilder();
        char[] var25 = var19.toCharArray();
        int var78 = lIlIIlIIIlll[1];
        char[] var44 = var20.toCharArray();
        int var75 = var44.length;
        int var9 = lIlIIlIIIlll[1];
        while (aC.llIllIIIIllIlI(var9, var75)) {
            char var80 = var44[var9];
            var35.append((char)(var80 ^ var25[var78 % var25.length]));
            0;
            ++var78;
            ++var9;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var35);
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
                    0;
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
        aC var52;
        this.cV();
        if (aC.llIllIIIIlIlll(this.dG.isEmpty() ? 1 : 0)) {
            return this.cS();
        }
        if (aC.llIllIIIIlIlll(var52.dH ? 1 : 0)) {
            System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[1]]);
            NPC var64 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[22]]));
            if (aC.llIllIIIIllIII(var64)) {
                return lIlIIlIIIlll[1];
            }
            if (aC.llIllIIIIllIIl(var52.bS.getInteracting()) && aC.llIllIIIIlIlll(var52.bS.getInteracting().getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[2]]) ? 1 : 0)) {
                return lIlIIlIIIlll[2];
            }
            var64.interact(lIlIIlIIIllI[lIlIIlIIIlll[3]]);
            return lIlIIlIIIlll[2];
        }
        q var64 = var52.dG.stream().filter(q2 -> {
            int n2;
            if (aC.llIllIIIIllIIl(q2.aP()) && aC.llIllIIIIlllII(q2.aR() ? 1 : 0)) {
                n2 = lIlIIlIIIlll[2];
                0;
                if (2 <= 0) {
                    return ((140 + 73 - 184 + 128 ^ 63 + 60 - 90 + 165) & (0x5A ^ 0x2F ^ (0x5F ^ 0x71) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIlIIIlll[1];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(q2 -> this.bS.getWorldLocation().distanceToPath(this.cq, q2.aP().getWorldLocation()))).orElse(null);
        if (aC.llIllIIIIllIII(var64)) {
            System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[4]]);
            WorldPoint var23 = H.MYSTICS_SAFESPOT.c(var52.ak);
            if (aC.llIllIIIIlIlll(var52.bS.getWorldLocation().equals((Object)var23) ? 1 : 0)) {
                int var50 = lIlIIlIIIlll[1];
                while (aC.llIllIIIIllIlI(var50, var52.dG.size())) {
                    q var29 = var52.dG.get(var50);
                    if (aC.llIllIIIIllIIl(var29.aP()) && aC.llIllIIIIlIlll(var29.aP().isMoving() ? 1 : 0)) {
                        return lIlIIlIIIlll[2];
                    }
                    ++var50;
                    0;
                    if (((215 + 215 - 349 + 160 ^ 157 + 137 - 219 + 97) & (126 + 20 - 14 + 71 ^ 74 + 15 - -28 + 33 ^ -1)) == 0) continue;
                    return ((0xA1 ^ 0x82 ^ (0xFE ^ 0x86)) & (0x7D ^ 0x38 ^ (0xA0 ^ 0xBE) ^ -1)) != 0;
                }
                if (aC.llIllIIIIllIll(var52.dG.size(), NPCs.getAll(nPC -> {
                    int n2;
                    if (aC.llIllIIIIlIlll(nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[21]]) ? 1 : 0) && aC.llIllIIIIlIlll(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                        n2 = lIlIIlIIIlll[2];
                        0;
                        if (-1 > 1) {
                            return false;
                        }
                    } else {
                        n2 = lIlIIlIIIlll[1];
                    }
                    return n2 != 0;
                }).size())) {
                    var52.dH = lIlIIlIIIlll[2];
                }
                return lIlIIlIIIlll[2];
            }
            Movement.setDestination((WorldPoint)var23);
            return lIlIIlIIIlll[2];
        }
        List var23 = var64.aP().getWorldLocation().createWorldArea(lIlIIlIIIlll[4]).toWorldPointList();
        WorldPoint var50 = var23.stream().filter(worldPoint -> {
            int n2;
            if (aC.llIllIIIIlIlll(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aC.llIllIIIlIIIII(var64.aP().getWorldArea().distanceTo(worldPoint), lIlIIlIIIlll[3]) && aC.llIllIIIIlIlll(this.a(this.cq, var64.aP().getWorldArea(), worldPoint.toWorldArea()) ? 1 : 0)) {
                n2 = lIlIIlIIIlll[2];
                0;
                
                }
            } else {
                n2 = lIlIIlIIIlll[1];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.bS))).orElse(null);
        if (aC.llIllIIIIllIII(var50)) {
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
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[1]] = aC."reached safespot";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[2]] = aC."Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[3]] = aC."Attack";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[4]] = aC."no mystics that need luring";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[5]] = aC."couldnt find safe";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[8]] = aC."Enter";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[14]] = aC."Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[17]] = aC."mystic changed animation";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[10]] = aC."Passage";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[18]] = aC."Enter";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[6]] = aC."Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[19]] = aC."Attack";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[20]] = aC."Skeletal Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[21]] = aC."Mystic";
        aC.lIlIIlIIIllI[aC.lIlIIlIIIlll[22]] = aC."Mystic";
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
            Iterator<q> var11 = this.dG.iterator();
            while (aC.llIllIIIIlIlll(var11.hasNext() ? 1 : 0)) {
                void var33;
                q var13 = var11.next();
                if (aC.llIllIIIIllIll(var13.aP().getIndex(), (int)var33)) {
                    void var43;
                    if (aC.llIllIIIIllIll(var43.getAnimation(), lIlIIlIIIlll[15])) {
                        Actor var37;
                        Player var6 = Players.getLocal();
                        if (aC.llIllIIIIllIIl(var6) && aC.llIllIIIIllIIl(var37 = var6.getInteracting()) && aC.llIllIIIIlIlll(var37.equals(var43) ? 1 : 0)) {
                            return;
                        }
                        var13.g(lIlIIlIIIlll[1]);
                    }
                    if (aC.llIllIIIIllIll(var43.getAnimation(), lIlIIlIIIlll[16])) {
                        var13.g(lIlIIlIIIlll[2]);
                    }
                    System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[17]]);
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
        void var49;
        int var66;
        int var81;
        void var57;
        int var14;
        void var79;
        int var16;
        void var48;
        void var27;
        void var21;
        void var10;
        int n2 = worldArea.getPlane();
        int n3 = worldArea.getX();
        int n4 = worldArea.getY();
        int n5 = worldArea.getWidth();
        int n6 = worldArea.getHeight();
        if (aC.llIllIIIIlllll(n2, worldArea2.getPlane())) {
            return lIlIIlIIIlll[1];
        }
        LocalPoint var41 = LocalPoint.fromWorld((Client)var10, (int)var21, (int)var27);
        LocalPoint var67 = LocalPoint.fromWorld((Client)var10, (int)var48.getX(), (int)var48.getY());
        if (!aC.llIllIIIIllIIl(var41) || aC.llIllIIIIllIII(var67)) {
            return lIlIIlIIIlll[1];
        }
        int var77 = var41.getSceneX();
        int var15 = var41.getSceneY();
        int var4 = var67.getSceneX();
        int var18 = var67.getSceneY();
        if (aC.llIllIIIIlllIl(var4, var77)) {
            var16 = var77;
            0;
            if ((0x79 ^ 0x7C ^ 1) < -1) {
                return false;
            }
        } else if (aC.llIllIIIlIIIII(var4, var77 + var79 - lIlIIlIIIlll[2])) {
            var16 = var77 + var79 - lIlIIlIIIlll[2];
            0;
            if (-(0x78 ^ 0x7C) > 0) {
                return false;
            }
        } else {
            var16 = var4;
        }
        if (aC.llIllIIIIlllIl(var18, var15)) {
            var14 = var15;
            0;
            if (-3 > 0) {
                return false;
            }
        } else if (aC.llIllIIIlIIIII(var18, var15 + var57 - lIlIIlIIIlll[2])) {
            var14 = var15 + var57 - lIlIIlIIIlll[2];
            0;
            if (3 <= 2) {
                return false;
            }
        } else {
            var14 = var18;
        }
        if (aC.llIllIIIIlllIl(var77, var4)) {
            var81 = var4;
            0;
            if (((0x42 ^ 0x17 ^ (0x1F ^ 0x67)) & (0x1B ^ 0x63 ^ (0xF2 ^ 0xA7) ^ -1)) != 0) {
                return (1 & (1 ^ -1)) != 0;
            }
        } else if (aC.llIllIIIlIIIII(var77, var4 + var48.getWidth() - lIlIIlIIIlll[2])) {
            var81 = var4 + var48.getWidth() - lIlIIlIIIlll[2];
            0;
            
            }
        } else {
            var81 = var77;
        }
        if (aC.llIllIIIIlllIl(var15, var18)) {
            var66 = var18;
            0;
            if (3 == 0) {
                return false;
            }
        } else if (aC.llIllIIIlIIIII(var15, var18 + var48.getHeight() - lIlIIlIIIlll[2])) {
            var66 = var18 + var48.getHeight() - lIlIIlIIIlll[2];
            0;
            if (((0x28 ^ 0x15 ^ (0x2A ^ 0x36)) & (0x21 ^ 0x4A ^ (0xEE ^ 0xA4) ^ -1)) != 0) {
                return false;
            }
        } else {
            var66 = var15;
        }
        Tile[][][] var38 = var10.getScene().getTiles();
        Tile var30 = var38[var49][var16][var14];
        Tile var53 = var38[var48.getPlane()][var81][var66];
        if (!aC.llIllIIIIllIIl(var30) || aC.llIllIIIIllIII(var53)) {
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

    private static void llIllIIIIlIllI() {
        lIlIIlIIIlll = new int[24];
        aC.lIlIIlIIIlll[0] = -1;
        aC.lIlIIlIIIlll[1] = (0x8C ^ 0x9D ^ (0x69 ^ 0x44)) & (0x43 ^ 0x55 ^ (0x3A ^ 0x10) ^ -1);
        aC.lIlIIlIIIlll[2] = 1;
        aC.lIlIIlIIIlll[3] = 2;
        aC.lIlIIlIIIlll[4] = 3;
        aC.lIlIIlIIIlll[5] = 0x60 ^ 0x36 ^ (0x61 ^ 0x33);
        aC.lIlIIlIIIlll[6] = 0xC ^ 6;
        aC.lIlIIlIIIlll[7] = 0x51 ^ 0x41;
        aC.lIlIIlIIIlll[8] = 0x12 ^ 0x5A ^ (0xF1 ^ 0xBC);
        aC.lIlIIlIIIlll[9] = 0xFFFFE545 & 0x241BBA;
        aC.lIlIIlIIIlll[10] = 0xB0 ^ 0x96 ^ (0x37 ^ 0x19);
        aC.lIlIIlIIIlll[11] = 2 + (0x5A ^ 0x5D) - (0x76 ^ 0x71) + (0xB9 ^ 0xC7);
        aC.lIlIIlIIIlll[12] = 0x92 ^ 0xB2;
        aC.lIlIIlIIIlll[13] = 0xFFFFAB49 & 0xD4B6;
        aC.lIlIIlIIIlll[14] = 0x93 ^ 0x95;
        aC.lIlIIlIIIlll[15] = 0xFFFFD7BA & 0x3DDD;
        aC.lIlIIlIIIlll[16] = -(0xFFFFECFF & 0x3391) & (0xFFFFBDFF & 0x77FF);
        aC.lIlIIlIIIlll[17] = 0x30 ^ 0x37;
        aC.lIlIIlIIIlll[18] = 0xF8 ^ 0xA1 ^ (0xE8 ^ 0xB8);
        aC.lIlIIlIIIlll[19] = 86 + 4 - 55 + 93 ^ 132 + 130 - 142 + 19;
        aC.lIlIIlIIIlll[20] = 0xB9 ^ 0xB5;
        aC.lIlIIlIIIlll[21] = 0x69 ^ 0x64;
        aC.lIlIIlIIIlll[22] = 0x4B ^ 0x45;
        aC.lIlIIlIIIlll[23] = 0x6D ^ 0x62;
    }
}

