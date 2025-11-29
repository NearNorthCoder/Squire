/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.TileObjects
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Singleton;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.TileObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j_Unknown;

@Singleton
public class e_Unknown {
    private static final /* synthetic */ Logger bk;
    private static final /* synthetic */ int[] bl;
    private static /* synthetic */ int[] lllIlllllIII;
    private /* synthetic */ WorldArea bn;
    private static final /* synthetic */ int[] bm;

    private static boolean lIIIlllIIlIllIl(Object object) {
        return object == null;
    }

    public WorldArea az() {
        return this.bn;
    }

    private static boolean lIIIlllIIlIlllI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public static RectangularArea ay() {
        void var4_4;
        void var3_3;
        void var2_2;
        void var1_1;
        void var9;
        List<TileObject> list = j.aW();
        if (e.lIIIlllIIlIIlll(list.isEmpty() ? 1 : 0)) {
            return null;
        }
        int var6 = lllIlllllIII[6];
        int var7 = lllIlllllIII[6];
        int var4 = Integer.MIN_VALUE;
        int var2 = Integer.MIN_VALUE;
        Iterator var10 = var9.iterator();
        while (e.lIIIlllIIlIIlll(var10.hasNext() ? 1 : 0)) {
            TileObject var5 = (TileObject)var10.next();
            var6 = Math.min(var6, var5.getWorldLocation().getX());
            var7 = Math.min(var7, var5.getWorldLocation().getY());
            var4 = Math.max(var4, var5.getWorldLocation().getX());
            var2 = Math.max(var2, var5.getWorldLocation().getY());
            0;
            if (((0x41 ^ 0x65) & ~(0x34 ^ 0x10)) <= 0) continue;
            return null;
        }
        return new RectangularArea((int)var1_1, (int)var2_2, (int)var3_3, (int)var4_4, lllIlllllIII[7]);
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3 = lllIlllllIII[8];
        int n4 = lllIlllllIII[4];
        WorldArea worldArea = this.az();
        int n5 = n4 * lllIlllllIII[8];
        if (e.lIIIlllIIlIllIl(worldArea)) {
            n2 = lllIlllllIII[9];
            0;
            if (-1 > (0x4E ^ 0x4A)) {
                return (0x1F ^ 0x3F) & ~(0x35 ^ 0x15);
            }
        } else {
            void var11;
            n2 = var11.hashCode();
        }
        n4 = n5 + n2;
        return n4;
    }

    private static boolean lIIIlllIIlIIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIIlllIIlIIllI() {
        lllIlllllIII = new int[16];
        e.lllIlllllIII[0] = 0x45 ^ 0x24 ^ (0x66 ^ 0x14);
        e.lllIlllllIII[1] = 2;
        e.lllIlllllIII[2] = (0x54 ^ 0x60) & ~(0x95 ^ 0xA1);
        e.lllIlllllIII[3] = -(79 + 93 - 69 + 30) & (0xFFFF93FF & 0xFFEF);
        e.lllIlllllIII[4] = 1;
        e.lllIlllllIII[5] = -(0xFFFFFFF6 & 0x649F) & (0xFFFFFFFF & 0xF7FF);
        e.lllIlllllIII[6] = 0xFFFFFFFF & Integer.MAX_VALUE;
        e.lllIlllllIII[7] = 3;
        e.lllIlllllIII[8] = 0xAE ^ 0x95;
        e.lllIlllllIII[9] = 0xFC ^ 0x89 ^ (0x58 ^ 6);
        e.lllIlllllIII[10] = 0xFFFFB5FA & 0x6EDF;
        e.lllIlllllIII[11] = -(0xFFFFDFF7 & 0x382D) & (0xFFFFFEFF & 0x3DFF);
        e.lllIlllllIII[12] = 0xFFFFE7FD & 0x3CDE;
        e.lllIlllllIII[13] = 0xFFFFFFFB & 0x24E7;
        e.lllIlllllIII[14] = -(0xFFFF8B5F & 0x7FBB) & (0xFFFFFFFE & 0x2FFF);
        e.lllIlllllIII[15] = -(0xFFFFD4F3 & 0x6B0F) & (0xFFFFF7FF & 0x6CE7);
    }

    static {
        e.lIIIlllIIlIIllI();
        bk = LoggerFactory.getLogger(e.class);
        int[] nArray = new int[lllIlllllIII[7]];
        nArray[e.lllIlllllIII[2]] = lllIlllllIII[10];
        nArray[e.lllIlllllIII[4]] = lllIlllllIII[11];
        nArray[e.lllIlllllIII[1]] = lllIlllllIII[12];
        bl = nArray;
        int[] nArray2 = new int[lllIlllllIII[7]];
        nArray2[e.lllIlllllIII[2]] = lllIlllllIII[13];
        nArray2[e.lllIlllllIII[4]] = lllIlllllIII[14];
        nArray2[e.lllIlllllIII[1]] = lllIlllllIII[15];
        bm = nArray2;
    }

    public static List<WorldArea> ax() {
        int[] nArray = new int[lllIlllllIII[1]];
        nArray[e.lllIlllllIII[2]] = lllIlllllIII[3];
        nArray[e.lllIlllllIII[4]] = lllIlllllIII[5];
        List list = TileObjects.getAll((int[])nArray);
        if (e.lIIIlllIIlIIlll(list.isEmpty() ? 1 : 0)) {
            return new ArrayList<WorldArea>();
        }
        return list.stream().map(tileObject -> tileObject.getWorldLocation().toWorldArea(lllIlllllIII[7], lllIlllllIII[7])).collect(Collectors.toList());
    }

    public e() {
        this.bn = null;
    }

    public String toString() {
        return "AreaManager(drawArea=" + this.az() + ")";
    }

    private static boolean lIIIlllIIlIlIIl(Object object, Object object2) {
        return object == object2;
    }

    public static WorldArea aw() {
        WorldPoint worldPoint = SquireNightmarePlugin.e();
        return worldPoint.toWorldArea(lllIlllllIII[0], lllIlllllIII[0]);
    }

    public void c(WorldArea worldArea) {
        this.bn = worldArea;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block9: {
            block10: {
                WorldArea var3;
                WorldArea var8;
                block8: {
                    e var13;
                    void var1;
                    if (e.lIIIlllIIlIlIIl(object, this)) {
                        return lllIlllllIII[4];
                    }
                    if (e.lIIIlllIIlIlIll(var1 instanceof e)) {
                        return lllIlllllIII[2];
                    }
                    e var12 = (e)var1;
                    if (e.lIIIlllIIlIlIll(var12.a(var13) ? 1 : 0)) {
                        return lllIlllllIII[2];
                    }
                    var8 = var13.az();
                    var3 = var12.az();
                    if (!e.lIIIlllIIlIllIl(var8)) break block8;
                    if (!e.lIIIlllIIlIlllI(var3)) break block9;
                    0;
                    
                    }
                    break block10;
                }
                if (!e.lIIIlllIIlIlIll(var8.equals(var3) ? 1 : 0)) break block9;
            }
            return lllIlllllIII[2];
        }
        return lllIlllllIII[4];
    }

    private static boolean lIIIlllIIlIlIll(int n2) {
        return n2 == 0;
    }

    protected boolean a(Object object) {
        return object instanceof e;
    }
}

