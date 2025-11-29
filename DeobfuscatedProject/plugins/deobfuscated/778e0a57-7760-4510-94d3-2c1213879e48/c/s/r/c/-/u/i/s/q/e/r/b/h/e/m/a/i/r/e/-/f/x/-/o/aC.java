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

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.H;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
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
public class aC
extends U {
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
        aC lllllllllllllllIllIlllIIlIIIIllI;
        if (aC.llIllIIIIlIlll(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aC.llIllIIIIllIIl(Movement.getDestination()) && aC.llIllIIIIlIlll(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIlIIIlll[1];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllIIlIIIIllI.al.bs);
            return lIlIIlIIIlll[2];
        }
        TileObject lllllllllllllllIllIlllIIlIIIIlIl = lllllllllllllllIllIlllIIlIIIIllI.cR();
        if (aC.llIllIIIIllIII(lllllllllllllllIllIlllIIlIIIIlIl)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllIIlIIIIllI.ak.bq.dx(lIlIIlIIIlll[7]).dy(lIlIIlIIIlll[7]));
            return lIlIIlIIIlll[2];
        }
        if (!aC.llIllIIIIlllII(lllllllllllllllIllIlllIIlIIIIllI.bS.isMoving() ? 1 : 0) || aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIlIIIIllI.bS.isAnimating() ? 1 : 0)) {
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
        Iterator lllllllllllllllIllIlllIIIllllIII = list.iterator();
        while (aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIIllllIII.hasNext() ? 1 : 0)) {
            void lllllllllllllllIllIlllIIIllllIlI;
            void lllllllllllllllIllIlllIIIlllllII;
            aC lllllllllllllllIllIlllIIIlllllIl;
            WorldPoint lllllllllllllllIllIlllIIIlllIlll = (WorldPoint)lllllllllllllllIllIlllIIIllllIII.next();
            if (aC.llIllIIIIlllII(lllllllllllllllIllIlllIIIlllllIl.b((Client)lllllllllllllllIllIlllIIIlllllII, lllllllllllllllIllIlllIIIlllIlll.toWorldArea(), (WorldArea)lllllllllllllllIllIlllIIIllllIlI) ? 1 : 0)) {
                return lIlIIlIIIlll[1];
            }
            0;
            if (null == null) continue;
            return ((0x3F ^ 0x38) & ~(0x38 ^ 0x3F)) != 0;
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
        aC lllllllllllllllIllIlllIIlIIlIlll;
        q lllllllllllllllIllIlllIIlIIlIIll;
        Object lllllllllllllllIllIlllIIlIIlIlII;
        void lllllllllllllllIllIlllIIlIIlIllI;
        List list = NPCs.getAll(nPC -> nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[20]]));
        if (aC.llIllIIIIlIlll(list.isEmpty() ? 1 : 0)) {
            this.cS();
            0;
            return;
        }
        int lllllllllllllllIllIlllIIlIIlIlIl22 = lIlIIlIIIlll[1];
        while (aC.llIllIIIIllIlI(lllllllllllllllIllIlllIIlIIlIlIl22, lllllllllllllllIllIlllIIlIIlIllI.size())) {
            lllllllllllllllIllIlllIIlIIlIlII = (NPC)lllllllllllllllIllIlllIIlIIlIllI.get(lllllllllllllllIllIlllIIlIIlIlIl22);
            if (aC.llIllIIIIllIII(lllllllllllllllIllIlllIIlIIlIlII)) {
                0;
                if (3 > (0xC3 ^ 0xC7)) {
                    return;
                }
            } else {
                lllllllllllllllIllIlllIIlIIlIIll = new q((NPC)lllllllllllllllIllIlllIIlIIlIlII);
                if (aC.llIllIIIIlllII(lllllllllllllllIllIlllIIlIIlIlll.dG.contains(lllllllllllllllIllIlllIIlIIlIIll) ? 1 : 0)) {
                    lllllllllllllllIllIlllIIlIIlIlll.dG.add(lllllllllllllllIllIlllIIlIIlIIll);
                    0;
                    System.out.println("Adding more mystics | index: " + lllllllllllllllIllIlllIIlIIlIlII.getIndex());
                }
            }
            ++lllllllllllllllIllIlllIIlIIlIlIl22;
            0;
            if (null == null) continue;
            return;
        }
        lllllllllllllllIllIlllIIlIIlIlll.dG.removeIf(q2 -> {
            boolean bl2;
            if (aC.llIllIIIIllIII(q2.aP())) {
                bl2 = lIlIIlIIIlll[2];
                0;
                if (3 == ((0x7B ^ 0x64) & ~(0x26 ^ 0x39))) {
                    return ((0x5D ^ 0x3F) & ~(0xFC ^ 0x9E)) != 0;
                }
            } else {
                bl2 = lIlIIlIIIlll[1];
            }
            return bl2;
        });
        0;
        Iterator<q> lllllllllllllllIllIlllIIlIIlIlIl22 = lllllllllllllllIllIlllIIlIIlIlll.dG.iterator();
        while (aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIlIIlIlIl22.hasNext() ? 1 : 0)) {
            lllllllllllllllIllIlllIIlIIlIlII = lllllllllllllllIllIlllIIlIIlIlIl22.next();
            if (aC.llIllIIIIlIlll(((q)lllllllllllllllIllIlllIIlIIlIlII).aR() ? 1 : 0)) {
                0;
                if (null == null) continue;
                return;
            }
            lllllllllllllllIllIlllIIlIIlIIll = ((q)lllllllllllllllIllIlllIIlIIlIlII).aP().getInteracting();
            if (aC.llIllIIIIlllIl(((q)lllllllllllllllIllIlllIIlIIlIlII).aP().getWorldArea().distanceTo((Locatable)lllllllllllllllIllIlllIIlIIlIlll.bS), lIlIIlIIIlll[6]) && aC.llIllIIIIllIIl(lllllllllllllllIllIlllIIlIIlIIll) && aC.llIllIIIIlIlll(((Object)lllllllllllllllIllIlllIIlIIlIIll).equals(lllllllllllllllIllIlllIIlIIlIlll.bS) ? 1 : 0) && aC.llIllIIIIlIlll(((q)lllllllllllllllIllIlllIIlIIlIlII).aP().isMoving() ? 1 : 0)) {
                ((q)lllllllllllllllIllIlllIIlIIlIlII).g(lIlIIlIIIlll[2]);
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

    private static String llIllIIIIlIIll(String lllllllllllllllIllIllIlllllllIIl, String lllllllllllllllIllIllIlllllllIII) {
        try {
            SecretKeySpec lllllllllllllllIllIllIllllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlllllllIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIlll[10]), "DES");
            Cipher lllllllllllllllIllIllIlllllllIll = Cipher.getInstance("DES");
            lllllllllllllllIllIllIlllllllIll.init(lIlIIlIIIlll[3], lllllllllllllllIllIllIllllllllII);
            return new String(lllllllllllllllIllIllIlllllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIlllllllIlI) {
            lllllllllllllllIllIllIlllllllIlI.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIIlIlII(String lllllllllllllllIllIllIlllllIllII, String lllllllllllllllIllIllIlllllIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlllllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIlllllIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIlllllIlllI.init(lIlIIlIIIlll[3], lllllllllllllllIllIllIlllllIllll);
            return new String(lllllllllllllllIllIllIlllllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIlllllIllIl) {
            lllllllllllllllIllIllIlllllIllIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(Client client, Tile tile, Tile tile2) {
        void lllllllllllllllIllIlllIIIIllIllI;
        void lllllllllllllllIllIlllIIIIllIlll;
        Client lllllllllllllllIllIlllIIIIlllIII;
        if (aC.llIllIIIIlllll(tile.getPlane(), tile2.getPlane())) {
            return lIlIIlIIIlll[1];
        }
        CollisionData[] lllllllllllllllIllIlllIIIIllIlIl = lllllllllllllllIllIlllIIIIlllIII.getCollisionMaps();
        if (aC.llIllIIIIllIII(lllllllllllllllIllIlllIIIIllIlIl)) {
            return lIlIIlIIIlll[1];
        }
        int lllllllllllllllIllIlllIIIIllIlII = lllllllllllllllIllIlllIIIIllIlll.getPlane();
        int[][] lllllllllllllllIllIlllIIIIllIIll = lllllllllllllllIllIlllIIIIllIlIl[lllllllllllllllIllIlllIIIIllIlII].getFlags();
        Point lllllllllllllllIllIlllIIIIllIIlI = lllllllllllllllIllIlllIIIIllIlll.getSceneLocation();
        Point lllllllllllllllIllIlllIIIIllIIIl = lllllllllllllllIllIlllIIIIllIllI.getSceneLocation();
        if (aC.llIllIIIIllIll(lllllllllllllllIllIlllIIIIllIIlI.getX(), lllllllllllllllIllIlllIIIIllIIIl.getX()) && aC.llIllIIIIllIll(lllllllllllllllIllIlllIIIIllIIlI.getY(), lllllllllllllllIllIlllIIIIllIIIl.getY())) {
            return lIlIIlIIIlll[2];
        }
        int lllllllllllllllIllIlllIIIIllIIII = lllllllllllllllIllIlllIIIIllIIIl.getX() - lllllllllllllllIllIlllIIIIllIIlI.getX();
        int lllllllllllllllIllIlllIIIIlIllll = lllllllllllllllIllIlllIIIIllIIIl.getY() - lllllllllllllllIllIlllIIIIllIIlI.getY();
        int lllllllllllllllIllIlllIIIIlIlllI = Math.abs(lllllllllllllllIllIlllIIIIllIIII);
        int lllllllllllllllIllIlllIIIIlIllIl = Math.abs(lllllllllllllllIllIlllIIIIlIllll);
        int lllllllllllllllIllIlllIIIIlIllII = lIlIIlIIIlll[9];
        int lllllllllllllllIllIlllIIIIlIlIll = lIlIIlIIIlll[9];
        if (aC.llIllIIIlIIIIl(lllllllllllllllIllIlllIIIIllIIII)) {
            lllllllllllllllIllIlllIIIIlIllII |= lIlIIlIIIlll[10];
            0;
            if ((40 + 109 - -6 + 4 ^ 3 + 43 - -74 + 35) <= 0) {
                return ((0xCA ^ 0xA6 ^ (0x7D ^ 0x73)) & (83 + 71 - 61 + 149 ^ 124 + 65 - 168 + 123 ^ -1)) != 0;
            }
        } else {
            lllllllllllllllIllIlllIIIIlIllII |= lIlIIlIIIlll[11];
        }
        if (aC.llIllIIIlIIIIl(lllllllllllllllIllIlllIIIIlIllll)) {
            lllllllllllllllIllIlllIIIIlIlIll |= lIlIIlIIIlll[3];
            0;
            if (-3 > 0) {
                return ((0x2C ^ 0xC) & ~(0xB5 ^ 0x95)) != 0;
            }
        } else {
            lllllllllllllllIllIlllIIIIlIlIll |= lIlIIlIIIlll[12];
        }
        if (aC.llIllIIIlIIIlI(lllllllllllllllIllIlllIIIIlIlllI, lllllllllllllllIllIlllIIIIlIllIl)) {
            int lllllllllllllllIllIlllIIIIlIIlll;
            int n2;
            int lllllllllllllllIllIlllIIIIlIlIlI = lllllllllllllllIllIlllIIIIllIIlI.getX();
            int lllllllllllllllIllIlllIIIIlIlIIl = lllllllllllllllIllIlllIIIIllIIlI.getY() << lIlIIlIIIlll[7];
            int lllllllllllllllIllIlllIIIIlIlIII = (lllllllllllllllIllIlllIIIIlIllll << lIlIIlIIIlll[7]) / lllllllllllllllIllIlllIIIIlIlllI;
            lllllllllllllllIllIlllIIIIlIlIIl += lIlIIlIIIlll[13];
            if (aC.llIllIIIlIIIIl(lllllllllllllllIllIlllIIIIlIllll)) {
                --lllllllllllllllIllIlllIIIIlIlIIl;
            }
            if (aC.llIllIIIlIIIIl(lllllllllllllllIllIlllIIIIllIIII)) {
                n2 = lIlIIlIIIlll[0];
                0;
                if (null != null) {
                    return ((0x40 ^ 0x17) & ~(0x62 ^ 0x35)) != 0;
                }
            } else {
                n2 = lllllllllllllllIllIlllIIIIlIIlll = lIlIIlIIIlll[2];
            }
            while (aC.llIllIIIIlllll(lllllllllllllllIllIlllIIIIlIlIlI, lllllllllllllllIllIlllIIIIllIIIl.getX())) {
                int lllllllllllllllIllIlllIIIIlIIllI = lllllllllllllllIllIlllIIIIlIlIIl >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIIIllIIll[lllllllllllllllIllIlllIIIIlIlIlI += lllllllllllllllIllIlllIIIIlIIlll][lllllllllllllllIllIlllIIIIlIIllI] & lllllllllllllllIllIlllIIIIlIllII)) {
                    return lIlIIlIIIlll[1];
                }
                int lllllllllllllllIllIlllIIIIlIIlIl = (lllllllllllllllIllIlllIIIIlIlIIl += lllllllllllllllIllIlllIIIIlIlIII) >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlllll(lllllllllllllllIllIlllIIIIlIIlIl, lllllllllllllllIllIlllIIIIlIIllI) && aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIIIllIIll[lllllllllllllllIllIlllIIIIlIlIlI][lllllllllllllllIllIlllIIIIlIIlIl] & lllllllllllllllIllIlllIIIIlIlIll)) {
                    return lIlIIlIIIlll[1];
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
            int lllllllllllllllIllIlllIIIIlIIlll;
            int n3;
            int lllllllllllllllIllIlllIIIIlIlIlI = lllllllllllllllIllIlllIIIIllIIlI.getY();
            int lllllllllllllllIllIlllIIIIlIlIIl = lllllllllllllllIllIlllIIIIllIIlI.getX() << lIlIIlIIIlll[7];
            int lllllllllllllllIllIlllIIIIlIlIII = (lllllllllllllllIllIlllIIIIllIIII << lIlIIlIIIlll[7]) / lllllllllllllllIllIlllIIIIlIllIl;
            lllllllllllllllIllIlllIIIIlIlIIl += lIlIIlIIIlll[13];
            if (aC.llIllIIIlIIIIl(lllllllllllllllIllIlllIIIIllIIII)) {
                --lllllllllllllllIllIlllIIIIlIlIIl;
            }
            if (aC.llIllIIIlIIIIl(lllllllllllllllIllIlllIIIIlIllll)) {
                n3 = lIlIIlIIIlll[0];
                0;
                if ((0x93 ^ 0xA9 ^ (0x23 ^ 0x1D)) < 0) {
                    return ((0xF6 ^ 0x8C ^ (0xAB ^ 0x87)) & (0x5B ^ 0x54 ^ (0x6E ^ 0x37) ^ -1)) != 0;
                }
            } else {
                n3 = lllllllllllllllIllIlllIIIIlIIlll = lIlIIlIIIlll[2];
            }
            while (aC.llIllIIIIlllll(lllllllllllllllIllIlllIIIIlIlIlI, lllllllllllllllIllIlllIIIIllIIIl.getY())) {
                int lllllllllllllllIllIlllIIIIlIIllI = lllllllllllllllIllIlllIIIIlIlIIl >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIIIllIIll[lllllllllllllllIllIlllIIIIlIIllI][lllllllllllllllIllIlllIIIIlIlIlI += lllllllllllllllIllIlllIIIIlIIlll] & lllllllllllllllIllIlllIIIIlIlIll)) {
                    return lIlIIlIIIlll[1];
                }
                int lllllllllllllllIllIlllIIIIlIIlIl = (lllllllllllllllIllIlllIIIIlIlIIl += lllllllllllllllIllIlllIIIIlIlIII) >>> lIlIIlIIIlll[7];
                if (aC.llIllIIIIlllll(lllllllllllllllIllIlllIIIIlIIlIl, lllllllllllllllIllIlllIIIIlIIllI) && aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIIIllIIll[lllllllllllllllIllIlllIIIIlIIlIl][lllllllllllllllIllIlllIIIIlIlIlI] & lllllllllllllllIllIlllIIIIlIllII)) {
                    return lIlIIlIIIlll[1];
                }
                0;
                if (1 > -1) continue;
                return ((0xD9 ^ 0xB8) & ~(0x25 ^ 0x44)) != 0;
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

    private static String llIllIIIIlIIlI(String lllllllllllllllIllIllIllllIlllII, String lllllllllllllllIllIllIllllIlIllI) {
        lllllllllllllllIllIllIllllIlllII = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIllllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIllllIllIlI = new StringBuilder();
        char[] lllllllllllllllIllIllIllllIllIIl = lllllllllllllllIllIllIllllIlIllI.toCharArray();
        int lllllllllllllllIllIllIllllIllIII = lIlIIlIIIlll[1];
        char[] lllllllllllllllIllIllIllllIlIIlI = lllllllllllllllIllIllIllllIlllII.toCharArray();
        int lllllllllllllllIllIllIllllIlIIIl = lllllllllllllllIllIllIllllIlIIlI.length;
        int lllllllllllllllIllIllIllllIlIIII = lIlIIlIIIlll[1];
        while (aC.llIllIIIIllIlI(lllllllllllllllIllIllIllllIlIIII, lllllllllllllllIllIllIllllIlIIIl)) {
            char lllllllllllllllIllIllIllllIlllIl = lllllllllllllllIllIllIllllIlIIlI[lllllllllllllllIllIllIllllIlIIII];
            lllllllllllllllIllIllIllllIllIlI.append((char)(lllllllllllllllIllIllIllllIlllIl ^ lllllllllllllllIllIllIllllIllIIl[lllllllllllllllIllIllIllllIllIII % lllllllllllllllIllIllIllllIllIIl.length]));
            0;
            ++lllllllllllllllIllIllIllllIllIII;
            ++lllllllllllllllIllIllIllllIlIIII;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIllllIllIlI);
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
                    return ((0xE3 ^ 0xB0) & ~(0xCF ^ 0x9C)) != 0;
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
        aC lllllllllllllllIllIlllIIlIlIIIIl;
        this.cV();
        if (aC.llIllIIIIlIlll(this.dG.isEmpty() ? 1 : 0)) {
            return this.cS();
        }
        if (aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIlIlIIIIl.dH ? 1 : 0)) {
            System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[1]]);
            NPC lllllllllllllllIllIlllIIlIlIIIII = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[22]]));
            if (aC.llIllIIIIllIII(lllllllllllllllIllIlllIIlIlIIIII)) {
                return lIlIIlIIIlll[1];
            }
            if (aC.llIllIIIIllIIl(lllllllllllllllIllIlllIIlIlIIIIl.bS.getInteracting()) && aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIlIlIIIIl.bS.getInteracting().getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[2]]) ? 1 : 0)) {
                return lIlIIlIIIlll[2];
            }
            lllllllllllllllIllIlllIIlIlIIIII.interact(lIlIIlIIIllI[lIlIIlIIIlll[3]]);
            return lIlIIlIIIlll[2];
        }
        q lllllllllllllllIllIlllIIlIlIIIII = lllllllllllllllIllIlllIIlIlIIIIl.dG.stream().filter(q2 -> {
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
        if (aC.llIllIIIIllIII(lllllllllllllllIllIlllIIlIlIIIII)) {
            System.out.println(lIlIIlIIIllI[lIlIIlIIIlll[4]]);
            WorldPoint lllllllllllllllIllIlllIIlIIlllll = H.MYSTICS_SAFESPOT.c(lllllllllllllllIllIlllIIlIlIIIIl.ak);
            if (aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIlIlIIIIl.bS.getWorldLocation().equals((Object)lllllllllllllllIllIlllIIlIIlllll) ? 1 : 0)) {
                int lllllllllllllllIllIlllIIlIIllllI = lIlIIlIIIlll[1];
                while (aC.llIllIIIIllIlI(lllllllllllllllIllIlllIIlIIllllI, lllllllllllllllIllIlllIIlIlIIIIl.dG.size())) {
                    q lllllllllllllllIllIlllIIlIIlllIl = lllllllllllllllIllIlllIIlIlIIIIl.dG.get(lllllllllllllllIllIlllIIlIIllllI);
                    if (aC.llIllIIIIllIIl(lllllllllllllllIllIlllIIlIIlllIl.aP()) && aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIlIIlllIl.aP().isMoving() ? 1 : 0)) {
                        return lIlIIlIIIlll[2];
                    }
                    ++lllllllllllllllIllIlllIIlIIllllI;
                    0;
                    if (((215 + 215 - 349 + 160 ^ 157 + 137 - 219 + 97) & (126 + 20 - 14 + 71 ^ 74 + 15 - -28 + 33 ^ -1)) == 0) continue;
                    return ((0xA1 ^ 0x82 ^ (0xFE ^ 0x86)) & (0x7D ^ 0x38 ^ (0xA0 ^ 0xBE) ^ -1)) != 0;
                }
                if (aC.llIllIIIIllIll(lllllllllllllllIllIlllIIlIlIIIIl.dG.size(), NPCs.getAll(nPC -> {
                    int n2;
                    if (aC.llIllIIIIlIlll(nPC.getName().contains(lIlIIlIIIllI[lIlIIlIIIlll[21]]) ? 1 : 0) && aC.llIllIIIIlIlll(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                        n2 = lIlIIlIIIlll[2];
                        0;
                        if (-1 > 1) {
                            return ((0xA5 ^ 0xC4) & ~(0x49 ^ 0x28)) != 0;
                        }
                    } else {
                        n2 = lIlIIlIIIlll[1];
                    }
                    return n2 != 0;
                }).size())) {
                    lllllllllllllllIllIlllIIlIlIIIIl.dH = lIlIIlIIIlll[2];
                }
                return lIlIIlIIIlll[2];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllIIlIIlllll);
            return lIlIIlIIIlll[2];
        }
        List lllllllllllllllIllIlllIIlIIlllll = lllllllllllllllIllIlllIIlIlIIIII.aP().getWorldLocation().createWorldArea(lIlIIlIIIlll[4]).toWorldPointList();
        WorldPoint lllllllllllllllIllIlllIIlIIllllI = lllllllllllllllIllIlllIIlIIlllll.stream().filter(worldPoint -> {
            int n2;
            if (aC.llIllIIIIlIlll(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aC.llIllIIIlIIIII(lllllllllllllllIllIlllIIlIlIIIII.aP().getWorldArea().distanceTo(worldPoint), lIlIIlIIIlll[3]) && aC.llIllIIIIlIlll(this.a(this.cq, lllllllllllllllIllIlllIIlIlIIIII.aP().getWorldArea(), worldPoint.toWorldArea()) ? 1 : 0)) {
                n2 = lIlIIlIIIlll[2];
                0;
                if (null != null) {
                    return ((0x57 ^ 0x11) & ~(0x15 ^ 0x53)) != 0;
                }
            } else {
                n2 = lIlIIlIIIlll[1];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.bS))).orElse(null);
        if (aC.llIllIIIIllIII(lllllllllllllllIllIlllIIlIIllllI)) {
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
            Iterator<q> lllllllllllllllIllIlllIIIIIllIII = this.dG.iterator();
            while (aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIIIIllIII.hasNext() ? 1 : 0)) {
                void lllllllllllllllIllIlllIIIIIllIIl;
                q lllllllllllllllIllIlllIIIIIlIlll = lllllllllllllllIllIlllIIIIIllIII.next();
                if (aC.llIllIIIIllIll(lllllllllllllllIllIlllIIIIIlIlll.aP().getIndex(), (int)lllllllllllllllIllIlllIIIIIllIIl)) {
                    void lllllllllllllllIllIlllIIIIIllIlI;
                    if (aC.llIllIIIIllIll(lllllllllllllllIllIlllIIIIIllIlI.getAnimation(), lIlIIlIIIlll[15])) {
                        Actor lllllllllllllllIllIlllIIIIIlIlIl;
                        Player lllllllllllllllIllIlllIIIIIlIllI = Players.getLocal();
                        if (aC.llIllIIIIllIIl(lllllllllllllllIllIlllIIIIIlIllI) && aC.llIllIIIIllIIl(lllllllllllllllIllIlllIIIIIlIlIl = lllllllllllllllIllIlllIIIIIlIllI.getInteracting()) && aC.llIllIIIIlIlll(lllllllllllllllIllIlllIIIIIlIlIl.equals(lllllllllllllllIllIlllIIIIIllIlI) ? 1 : 0)) {
                            return;
                        }
                        lllllllllllllllIllIlllIIIIIlIlll.g(lIlIIlIIIlll[1]);
                    }
                    if (aC.llIllIIIIllIll(lllllllllllllllIllIlllIIIIIllIlI.getAnimation(), lIlIIlIIIlll[16])) {
                        lllllllllllllllIllIlllIIIIIlIlll.g(lIlIIlIIIlll[2]);
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
        void lllllllllllllllIllIlllIIIlIllllI;
        int lllllllllllllllIllIlllIIIlIlIIII;
        int lllllllllllllllIllIlllIIIlIlIIIl;
        void lllllllllllllllIllIlllIIIlIllIlI;
        int lllllllllllllllIllIlllIIIlIlIIlI;
        void lllllllllllllllIllIlllIIIlIllIll;
        int lllllllllllllllIllIlllIIIlIlIIll;
        void lllllllllllllllIllIlllIIIlIlllll;
        void lllllllllllllllIllIlllIIIlIlllII;
        void lllllllllllllllIllIlllIIIlIlllIl;
        void lllllllllllllllIllIlllIIIllIIIIl;
        int n2 = worldArea.getPlane();
        int n3 = worldArea.getX();
        int n4 = worldArea.getY();
        int n5 = worldArea.getWidth();
        int n6 = worldArea.getHeight();
        if (aC.llIllIIIIlllll(n2, worldArea2.getPlane())) {
            return lIlIIlIIIlll[1];
        }
        LocalPoint lllllllllllllllIllIlllIIIlIllIIl = LocalPoint.fromWorld((Client)lllllllllllllllIllIlllIIIllIIIIl, (int)lllllllllllllllIllIlllIIIlIlllIl, (int)lllllllllllllllIllIlllIIIlIlllII);
        LocalPoint lllllllllllllllIllIlllIIIlIllIII = LocalPoint.fromWorld((Client)lllllllllllllllIllIlllIIIllIIIIl, (int)lllllllllllllllIllIlllIIIlIlllll.getX(), (int)lllllllllllllllIllIlllIIIlIlllll.getY());
        if (!aC.llIllIIIIllIIl(lllllllllllllllIllIlllIIIlIllIIl) || aC.llIllIIIIllIII(lllllllllllllllIllIlllIIIlIllIII)) {
            return lIlIIlIIIlll[1];
        }
        int lllllllllllllllIllIlllIIIlIlIlll = lllllllllllllllIllIlllIIIlIllIIl.getSceneX();
        int lllllllllllllllIllIlllIIIlIlIllI = lllllllllllllllIllIlllIIIlIllIIl.getSceneY();
        int lllllllllllllllIllIlllIIIlIlIlIl = lllllllllllllllIllIlllIIIlIllIII.getSceneX();
        int lllllllllllllllIllIlllIIIlIlIlII = lllllllllllllllIllIlllIIIlIllIII.getSceneY();
        if (aC.llIllIIIIlllIl(lllllllllllllllIllIlllIIIlIlIlIl, lllllllllllllllIllIlllIIIlIlIlll)) {
            lllllllllllllllIllIlllIIIlIlIIll = lllllllllllllllIllIlllIIIlIlIlll;
            0;
            if ((0x79 ^ 0x7C ^ 1) < -1) {
                return ((146 + 82 - 92 + 32 ^ 8 + 16 - -20 + 110) & (41 + 144 - 119 + 97 ^ 88 + 74 - 29 + 12 ^ -1)) != 0;
            }
        } else if (aC.llIllIIIlIIIII(lllllllllllllllIllIlllIIIlIlIlIl, lllllllllllllllIllIlllIIIlIlIlll + lllllllllllllllIllIlllIIIlIllIll - lIlIIlIIIlll[2])) {
            lllllllllllllllIllIlllIIIlIlIIll = lllllllllllllllIllIlllIIIlIlIlll + lllllllllllllllIllIlllIIIlIllIll - lIlIIlIIIlll[2];
            0;
            if (-(0x78 ^ 0x7C) > 0) {
                return ((0x66 ^ 0x39) & ~(0x76 ^ 0x29)) != 0;
            }
        } else {
            lllllllllllllllIllIlllIIIlIlIIll = lllllllllllllllIllIlllIIIlIlIlIl;
        }
        if (aC.llIllIIIIlllIl(lllllllllllllllIllIlllIIIlIlIlII, lllllllllllllllIllIlllIIIlIlIllI)) {
            lllllllllllllllIllIlllIIIlIlIIlI = lllllllllllllllIllIlllIIIlIlIllI;
            0;
            if (-3 > 0) {
                return ((0x9F ^ 0x9B) & ~(0x4F ^ 0x4B)) != 0;
            }
        } else if (aC.llIllIIIlIIIII(lllllllllllllllIllIlllIIIlIlIlII, lllllllllllllllIllIlllIIIlIlIllI + lllllllllllllllIllIlllIIIlIllIlI - lIlIIlIIIlll[2])) {
            lllllllllllllllIllIlllIIIlIlIIlI = lllllllllllllllIllIlllIIIlIlIllI + lllllllllllllllIllIlllIIIlIllIlI - lIlIIlIIIlll[2];
            0;
            if (3 <= 2) {
                return ((0x5A ^ 0x75) & ~(0xE9 ^ 0xC6)) != 0;
            }
        } else {
            lllllllllllllllIllIlllIIIlIlIIlI = lllllllllllllllIllIlllIIIlIlIlII;
        }
        if (aC.llIllIIIIlllIl(lllllllllllllllIllIlllIIIlIlIlll, lllllllllllllllIllIlllIIIlIlIlIl)) {
            lllllllllllllllIllIlllIIIlIlIIIl = lllllllllllllllIllIlllIIIlIlIlIl;
            0;
            if (((0x42 ^ 0x17 ^ (0x1F ^ 0x67)) & (0x1B ^ 0x63 ^ (0xF2 ^ 0xA7) ^ -1)) != 0) {
                return (1 & (1 ^ -1)) != 0;
            }
        } else if (aC.llIllIIIlIIIII(lllllllllllllllIllIlllIIIlIlIlll, lllllllllllllllIllIlllIIIlIlIlIl + lllllllllllllllIllIlllIIIlIlllll.getWidth() - lIlIIlIIIlll[2])) {
            lllllllllllllllIllIlllIIIlIlIIIl = lllllllllllllllIllIlllIIIlIlIlIl + lllllllllllllllIllIlllIIIlIlllll.getWidth() - lIlIIlIIIlll[2];
            0;
            if (null != null) {
                return ((0x21 ^ 0x76 ^ (0x12 ^ 0x1A)) & (0xF4 ^ 0x9F ^ (0x9D ^ 0xA9) ^ -1)) != 0;
            }
        } else {
            lllllllllllllllIllIlllIIIlIlIIIl = lllllllllllllllIllIlllIIIlIlIlll;
        }
        if (aC.llIllIIIIlllIl(lllllllllllllllIllIlllIIIlIlIllI, lllllllllllllllIllIlllIIIlIlIlII)) {
            lllllllllllllllIllIlllIIIlIlIIII = lllllllllllllllIllIlllIIIlIlIlII;
            0;
            if (3 == 0) {
                return ((0x7D ^ 0x25) & ~(0x41 ^ 0x19)) != 0;
            }
        } else if (aC.llIllIIIlIIIII(lllllllllllllllIllIlllIIIlIlIllI, lllllllllllllllIllIlllIIIlIlIlII + lllllllllllllllIllIlllIIIlIlllll.getHeight() - lIlIIlIIIlll[2])) {
            lllllllllllllllIllIlllIIIlIlIIII = lllllllllllllllIllIlllIIIlIlIlII + lllllllllllllllIllIlllIIIlIlllll.getHeight() - lIlIIlIIIlll[2];
            0;
            if (((0x28 ^ 0x15 ^ (0x2A ^ 0x36)) & (0x21 ^ 0x4A ^ (0xEE ^ 0xA4) ^ -1)) != 0) {
                return ((198 + 111 - 281 + 187 ^ 26 + 101 - 109 + 122) & (154 + 110 - 213 + 156 ^ 37 + 18 - 2 + 95 ^ -1)) != 0;
            }
        } else {
            lllllllllllllllIllIlllIIIlIlIIII = lllllllllllllllIllIlllIIIlIlIllI;
        }
        Tile[][][] lllllllllllllllIllIlllIIIlIIllll = lllllllllllllllIllIlllIIIllIIIIl.getScene().getTiles();
        Tile lllllllllllllllIllIlllIIIlIIlllI = lllllllllllllllIllIlllIIIlIIllll[lllllllllllllllIllIlllIIIlIllllI][lllllllllllllllIllIlllIIIlIlIIll][lllllllllllllllIllIlllIIIlIlIIlI];
        Tile lllllllllllllllIllIlllIIIlIIllIl = lllllllllllllllIllIlllIIIlIIllll[lllllllllllllllIllIlllIIIlIlllll.getPlane()][lllllllllllllllIllIlllIIIlIlIIIl][lllllllllllllllIllIlllIIIlIlIIII];
        if (!aC.llIllIIIIllIIl(lllllllllllllllIllIlllIIIlIIlllI) || aC.llIllIIIIllIII(lllllllllllllllIllIlllIIIlIIllIl)) {
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

