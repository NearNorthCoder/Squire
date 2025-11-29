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
        if (c.var2(this.o)) {
            worldPoint = this.o;
            0;
            if (3 < 2) {
                return null;
            }
        } else {
            c var3;
            worldPoint = var3.l.i();
        }
        return worldPoint;
    }

    public int distanceTo(Locatable locatable) {
        int n;
        WorldPoint worldPoint = locatable.getWorldLocation();
        if (c.var2(worldPoint)) {
            n = this.distanceTo(worldPoint);
            0;
            if (((0x94 ^ 0xB6) & ~(0x61 ^ 0x43)) != 0) {
                return (0x79 ^ 0x22) & ~(0xE ^ 0x55);
            }
        } else {
            n = var1[3];
        }
        return n;
    }

    static {
        c.var4();
    }

    public CHelper(a a2, String string, String string2) {
        this(a2, string, string2, var1[0], null);
    }

    private static boolean var5(int n) {
        return n != 0;
    }

    private static boolean var2(Object object) {
        return object != null;
    }

    public WorldPoint q() {
        return this.o;
    }

    private static boolean var6(int n, int n2) {
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
        TileObject var7;
        c var8;
        TileObject tileObject2 = null;
        WorldPoint worldPoint = this.getWorldLocation();
        if (c.var9(worldPoint)) {
            String[] stringArray = new String[var1[2]];
            stringArray[c.var1[0]] = this.m;
            tileObject2 = TileObjects.getNearest((String[])stringArray);
            0;
            if (((0x24 ^ 0x29) & ~(0x6E ^ 0x63)) <= -1) {
                return null;
            }
        } else if (c.var2(var8.o)) {
            void var10;
            var7 = TileObjects.getNearest((WorldPoint)var10, var8::a);
        }
        if (c.var2(var7)) {
            tileObject = var7;
            0;
            
        } else {
            String[] stringArray = new String[var1[2]];
            stringArray[c.var1[0]] = var8.m;
            tileObject = TileObjects.getNearest((String[])stringArray);
        }
        return tileObject;
    }

    public a m() {
        return this.l;
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    public CHelper(a a2, String string, String string2, WorldPoint worldPoint) {
        this(a2, string, string2, var1[0], worldPoint);
    }

    public boolean a(TileObject tileObject) {
        int n;
        ScenePoint scenePoint;
        ScenePoint scenePoint2 = ScenePoint.fromWorld((WorldPoint)this.o);
        if (c.var6(scenePoint2.distanceTo(scenePoint = ScenePoint.fromWorld((WorldPoint)tileObject.getWorldLocation())), var1[1]) && c.var5(tileObject.getName().equals(this.m) ? 1 : 0)) {
            n = var1[2];
            0;
            if (((0x59 ^ 3) & ~(6 ^ 0x5C)) != 0) {
                return ((0x19 ^ 0x36) & ~(0xBE ^ 0x91)) != 0;
            }
        } else {
            n = var1[0];
        }
        return n != 0;
    }

    public boolean p() {
        return this.p;
    }

    private static void var4() {
        var1 = new int[4];
        c.var1[0] = (60 + 109 - 47 + 25 ^ 21 + 101 - -13 + 22) & (0xC9 ^ 0xAD ^ (0x53 ^ 0x39) ^ -1);
        c.var1[1] = 3;
        c.var1[2] = 1;
        c.var1[3] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
    }

    public WorldArea getWorldArea() {
        return new WorldArea(this.l.e(), this.l.f());
    }

    public int distanceTo(WorldPoint worldPoint) {
        int n;
        WorldPoint worldPoint2 = this.getWorldLocation();
        if (c.var2(worldPoint2)) {
            n = worldPoint2.distanceTo(worldPoint);
            0;
            if (-2 >= 0) {
                return (169 + 81 - 136 + 70 ^ 38 + 40 - -93 + 5) & (0x53 ^ 0xE ^ (0xD7 ^ 0x82) ^ -1);
            }
        } else {
            n = var1[3];
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
        if (c.var2(player)) {
            n = this.distanceTo((Locatable)player);
            0;
            if (3 < 0) {
                return (0x38 ^ 0x66 ^ (0x2F ^ 0x3E)) & (0x76 ^ 0x7D ^ (0x81 ^ 0xC5) ^ -1);
            }
        } else {
            n = var1[3];
        }
        return n;
    }
}

