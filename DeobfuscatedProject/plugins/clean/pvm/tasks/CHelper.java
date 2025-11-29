/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.pvm.tasks;

import gg.squire.api.InventorySetup;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import gg.squire.pvm.tasks.GameEnum;

@Singleton
public class CHelper {
    
    public static final  int z;
    public static final  WorldPoint F;
    public static final  WorldArea C;
    @Inject
    private  SquireShamanConfig c;
    public static final  WorldPoint G;
    
    public static final  WorldArea A;
    public static final  int x;
    public static final  WorldPoint I;
    public static final  WorldPoint D;
    public static final  WorldPoint E;
    public static final  WorldArea B;
    public static final  WorldPoint H;
    public static final  int y;

    public boolean a(WorldPoint worldPoint) {
        return this.n().stream().noneMatch(list -> list.contains(worldPoint));
    }

    private static boolean lIlIlllIlIlIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIlllIlIIllll() {
        lIIllIIIIlIII = new String[lIIllIIIIlIIl[1]];
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIII[s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[2]] = s.h.-.m.a.n.u.r.i.s.q.a.s.e."rune pouch";
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIII[s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[0]] = s.h.-.m.a.n.u.r.i.s.q.a.s.e."Lizardman shaman";
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIII[s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIIllIIIIlIIl[12]] = s.h.-.m.a.n.u.r.i.s.q.a.s.e."Spawn";
    }

    private static boolean lIlIlllIlIlIlll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public InventorySetup r() {
        void var1;
        c var2;
        InventorySetup inventorySetup = new InventorySetup().add(this.c.food().w(), this.c.foodAmount()).add(this.c.cure().u(), this.c.amountOfRemedies()).add(this.c.teleportItem().u(), lIIllIIIIlIIl[0]).add(this.c.rangePotion().u(), this.c.rangePotionAmount()).add(lIIllIIIIlIIl[4], this.c.prayerPotionAmount());
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(this.c.boneCrusher() ? 1 : 0)) {
            inventorySetup.add(lIIllIIIIlIIl[5], lIIllIIIIlIIl[0]);

        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(var2.c.stamina() ? 1 : 0)) {
            var1.add(item -> {
                int n2;
                if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIlIl(item.getId(), lIIllIIIIlIIl[10]) && s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIllI(item.getId(), lIIllIIIIlIIl[11])) {
                    n2 = lIIllIIIIlIIl[0];

                    if (2 > 3) {
                        return false;
                    }
                } else {
                    n2 = lIIllIIIIlIIl[2];
                }
                return n2 != 0;
            }, lIIllIIIIlIIl[0]);

        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(var2.c.teleportItem().D() ? 1 : 0)) {
            var1.add(item -> {
                boolean bl;
                if (!s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIlII(item.getId(), lIIllIIIIlIIl[8]) || s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIll(item.getId(), lIIllIIIIlIIl[9])) {
                    bl = lIIllIIIIlIIl[0];

                    if (-1 == 3) {
                        return (1 & ~1) != 0;
                    }
                } else {
                    bl = lIIllIIIIlIIl[2];
                }
                return bl;
            }, lIIllIIIIlIIl[0]);

        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(var2.c.alch() ? 1 : 0)) {
            if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(var2.c.runePouch() ? 1 : 0)) {
                var1.add(item -> item.getName().toLowerCase().contains(lIIllIIIIlIII[lIIllIIIIlIIl[2]]), lIIllIIIIlIIl[0]);

                }
            } else {
                var1.add(lIIllIIIIlIIl[6]);

                var1.add(lIIllIIIIlIIl[7]);

            }
        }
        return inventorySetup;
    }

    private static boolean lIlIlllIlIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    public WorldPoint a(WorldPoint worldPoint, NPC nPC) {
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIlI(this.a(nPC))) {
            return null;
        }
        return this.a(nPC).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(worldPoint))).orElse(null);
    }

    public g t() {
        return this.c.room();
    }

    public WorldArea p() {
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        return new WorldArea(worldPoint.getX() - lIIllIIIIlIIl[0], worldPoint.getY() - lIIllIIIIlIIl[0], lIIllIIIIlIIl[1], lIIllIIIIlIIl[1], lIIllIIIIlIIl[2]);
    }

    private static boolean lIlIlllIlIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public Set<List<WorldPoint>> n() {
        HashSet<List<WorldPoint>> hashSet = new HashSet<List<WorldPoint>>();
        List list = NPCs.getAll(nPC -> {
            int n2;
            if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(nPC.getName().equals(lIIllIIIIlIII[lIIllIIIIlIIl[12]]) ? 1 : 0) && s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIll(nPC.getAnimation(), lIIllIIIIlIIl[13])) {
                n2 = lIIllIIIIlIIl[0];

                if (((0xA6 ^ 0x8A) & ~(0xBD ^ 0x91)) == 2) {
                    return false;
                }
            } else {
                n2 = lIIllIIIIlIIl[2];
            }
            return n2 != 0;
        });
        Iterator var3 = list.iterator();
        while (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(var3.hasNext() ? 1 : 0)) {
            void var4;
            NPC var5 = (NPC)var3.next();
            WorldPoint var6 = var5.getWorldLocation();
            WorldArea var7 = new WorldArea(var6.getX() - lIIllIIIIlIIl[0], var6.getY() - lIIllIIIIlIIl[0], lIIllIIIIlIIl[1], lIIllIIIIlIIl[1], lIIllIIIIlIIl[2]);
            var4.add(var7.toWorldPointList());

            if (3 <= (0x9A ^ 0x9E)) continue;
            return null;
        }
        return hashSet;
    }

    public List<WorldPoint> a(NPC nPC) {
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIlI(nPC)) {
            return null;
        }
        return nPC.getWorldArea().toWorldPointList();
    }

    private static boolean lIlIlllIlIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIII();
        s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIIllll();
        y = lIIllIIIIlIIl[14];
        z = lIIllIIIIlIIl[13];
        x = lIIllIIIIlIIl[3];
        A = new WorldArea(lIIllIIIIlIIl[15], lIIllIIIIlIIl[16], lIIllIIIIlIIl[17], lIIllIIIIlIIl[17], lIIllIIIIlIIl[2]);
        B = new WorldArea(lIIllIIIIlIIl[18], lIIllIIIIlIIl[16], lIIllIIIIlIIl[17], lIIllIIIIlIIl[17], lIIllIIIIlIIl[2]);
        C = new WorldArea(lIIllIIIIlIIl[19], lIIllIIIIlIIl[16], lIIllIIIIlIIl[17], lIIllIIIIlIIl[17], lIIllIIIIlIIl[2]);
        D = new WorldPoint(lIIllIIIIlIIl[15], lIIllIIIIlIIl[20], lIIllIIIIlIIl[2]);
        E = new WorldPoint(lIIllIIIIlIIl[18], lIIllIIIIlIIl[20], lIIllIIIIlIIl[2]);
        F = new WorldPoint(lIIllIIIIlIIl[19], lIIllIIIIlIIl[21], lIIllIIIIlIIl[2]);
        G = new WorldPoint(lIIllIIIIlIIl[22], lIIllIIIIlIIl[23], lIIllIIIIlIIl[2]);
        H = new WorldPoint(lIIllIIIIlIIl[24], lIIllIIIIlIIl[25], lIIllIIIIlIIl[2]);
        I = new WorldPoint(lIIllIIIIlIIl[22], lIIllIIIIlIIl[23], lIIllIIIIlIIl[2]);
    }

    public boolean s() {
        return this.c.room().x().contains((Locatable)Players.getLocal());
    }

    private static boolean lIlIlllIlIlIIlI(Object object) {
        return object == null;
    }

    public NPC o() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIIl(nPC.getName().equals(lIIllIIIIlIII[lIIllIIIIlIIl[0]]) ? 1 : 0) && s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIlll(nPC.getInteracting(), Players.getLocal())) {
                n2 = lIIllIIIIlIIl[0];

                }
            } else {
                n2 = lIIllIIIIlIIl[2];
            }
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    public boolean q() {
        boolean bl;
        void var8;
        NPC nPC = this.o();
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIlI(nPC)) {
            return lIIllIIIIlIIl[2];
        }
        if (s.h.-.m.a.n.u.r.i.s.q.a.s.e.c.lIlIlllIlIlIIll(var8.getAnimation(), lIIllIIIIlIIl[3])) {
            bl = lIIllIIIIlIIl[0];

            if (3 > 3) {
                return false;
            }
        } else {
            bl = lIIllIIIIlIIl[2];
        }
        return bl;
    }

    private static boolean lIlIlllIlIlIIll(int n2, int n3) {
        return n2 == n3;
    }
}

