/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 */
package gg.squire.agility.tasks;

import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
import gg.squire.agility.tasks.AHelper;

public class CHelper
implements Locatable {
    private final  String m;
    private final  String n;
    private final  a l;
    private final  WorldPoint o;
    
    private final  boolean p;

    public WorldPoint getWorldLocation() {
        WorldPoint worldPoint;
        if (c.lIIlIlIIlIllll(this.o)) {
            worldPoint = this.o;

            if (3 < 2) {
                return null;
            }
        } else {
            c var1;
            worldPoint = var1.l.i();
        }
        return worldPoint;
    }

    public int distanceTo(Locatable locatable) {
        int n;
        WorldPoint worldPoint = locatable.getWorldLocation();
        if (c.lIIlIlIIlIllll(worldPoint)) {
            n = this.distanceTo(worldPoint);

            if (((0x94 ^ 0xB6) & ~(0x61 ^ 0x43)) != 0) {
                return (0x79 ^ 0x22) & ~(0xE ^ 0x55);
            }
        } else {
            n = lIllIIIIIlI[3];
        }
        return n;
    }

    static {
        c.lIIlIlIIlIlIll();
    }

    public CHelper(a a2, String string, String string2) {
        this(a2, string, string2, lIllIIIIIlI[0], null);
    }

    private static boolean lIIlIlIIlIllIl(int n) {
        return n != 0;
    }

    private static boolean lIIlIlIIlIllll(Object object) {
        return object != null;
    }

    public WorldPoint q() {
        return this.o;
    }

    private static boolean lIIlIlIIlIllII(int n, int n2) {
        return n <= n2;
    }

    public String o() {
        return this.m;
    }

    public CHelper(a a2, String string, String string2, boolean bl, WorldPoint worldPoint) {
        this.l = a2;
        this.m = string;
        this.n = string2;
        this.p = bl;
        this.o = worldPoint;
    }

    public String n() {
        return this.n;
    }

    /*
     * WARNING - void declaration
     */
    public TileObject r() {
        TileObject tileObject;
        TileObject var2;
        c var3;
        TileObject tileObject2 = null;
        WorldPoint worldPoint = this.getWorldLocation();
        if (c.lIIlIlIIlIlllI(worldPoint)) {
            String[] stringArray = new String[lIllIIIIIlI[2]];
            stringArray[c.lIllIIIIIlI[0]] = this.m;
            tileObject2 = TileObjects.getNearest((String[])stringArray);

            if (((0x24 ^ 0x29) & ~(0x6E ^ 0x63)) <= -1) {
                return null;
            }
        } else if (c.lIIlIlIIlIllll(var3.o)) {
            void var4;
            var2 = TileObjects.getNearest((WorldPoint)var4, var3::a);
        }
        if (c.lIIlIlIIlIllll(var2)) {
            tileObject = var2;

            if (3 == 0) {
                return null;
            }
        } else {
            String[] stringArray = new String[lIllIIIIIlI[2]];
            stringArray[c.lIllIIIIIlI[0]] = var3.m;
            tileObject = TileObjects.getNearest((String[])stringArray);
        }
        return tileObject;
    }

    public a m() {
        return this.l;
    }

    private static boolean lIIlIlIIlIlllI(Object object) {
        return object == null;
    }

    public CHelper(a a2, String string, String string2, WorldPoint worldPoint) {
        this(a2, string, string2, lIllIIIIIlI[0], worldPoint);
    }

    public boolean a(TileObject tileObject) {
        int n;
        ScenePoint scenePoint;
        ScenePoint scenePoint2 = ScenePoint.fromWorld((WorldPoint)this.o);
        if (c.lIIlIlIIlIllII(scenePoint2.distanceTo(scenePoint = ScenePoint.fromWorld((WorldPoint)tileObject.getWorldLocation())), lIllIIIIIlI[1]) && c.lIIlIlIIlIllIl(tileObject.getName().equals(this.m) ? 1 : 0)) {
            n = lIllIIIIIlI[2];

            if (((0x59 ^ 3) & ~(6 ^ 0x5C)) != 0) {
                return false;
            }
        } else {
            n = lIllIIIIIlI[0];
        }
        return n != 0;
    }

    public boolean p() {
        return this.p;
    }

    public WorldArea getWorldArea() {
        return new WorldArea(this.l.e(), this.l.f());
    }

    public int distanceTo(WorldPoint worldPoint) {
        int n;
        WorldPoint worldPoint2 = this.getWorldLocation();
        if (c.lIIlIlIIlIllll(worldPoint2)) {
            n = worldPoint2.distanceTo(worldPoint);

        } else {
            n = lIllIIIIIlI[3];
        }
        return n;
    }

    public LocalPoint getLocalLocation() {
        WorldPoint worldPoint = this.getWorldLocation();
        Client client = Static.getClient();
        return LocalPoint.fromWorld((Client)client, (WorldPoint)worldPoint);
    }

    public int s() {
        int n;
        Player player = Players.getLocal();
        if (c.lIIlIlIIlIllll(player)) {
            n = this.distanceTo((Locatable)player);

            if (3 < 0) {
                return (0x38 ^ 0x66 ^ (0x2F ^ 0x3E)) & (0x76 ^ 0x7D ^ (0x81 ^ 0xC5) ^ -1);
            }
        } else {
            n = lIllIIIIIlI[3];
        }
        return n;
    }
}

