/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.hunter.tasks.GameEnum;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.hunter.SquireHunterConfig;
import java.util.function.Predicate;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

public abstract class HunterManager
extends HunterTaskBase {

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    protected i H() {
        return this.z().pitfallAnimal();
    }

    private boolean a(NPC nPC) {
        RectangularArea rectangularArea = this.H().w();
        if (x.var4(rectangularArea)) {
            return var1[1];
        }
        return rectangularArea.contains(nPC.getWorldLocation());
    }

    private static void var5() {
        var2 = new String[var1[4]];
        x.var2[x.var1[0]] = "Collapsed trap";
        x.var2[x.var1[1]] = "Dismantle";
        x.var2[x.var1[2]] = "Spiked pit";
        x.var2[x.var1[3]] = "Jump";
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    protected TileObject a(boolean bl) {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.var18(var2[var1[0]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[x.var1[0]] = var2[var1[1]];
                if (x.var3(tileObject.hasAction(stringArray) ? 1 : 0, bl)) {
                    n2 = var1[1];
                    0;
                    if (((0x4A ^ 0x57 ^ (0x3A ^ 0x18)) & (82 + 77 - 146 + 160 ^ 73 + 113 - 105 + 65 ^ -1)) != 2) return n2 != 0;
                    return ((0xD8 ^ 0x91 ^ (0xD4 ^ 0xAC)) & (124 + 95 - 82 + 50 ^ 32 + 111 - 69 + 64 ^ -1)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
    }

    protected TileObject F() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.var18(var2[var1[2]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[x.var1[0]] = var2[var1[3]];
                if (x.var18(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-3 <= 0) return n2 != 0;
                    return ((0x55 ^ 0x36) & ~(0x10 ^ 0x73)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
    }

    public HunterManager(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.PITFALL);
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var1[0];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var1[0];
        while (x.var28(var27, var26)) {
            char var29 = var25[var27];
            var22.append((char)(var29 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var22);
    }

    protected NPC D() {
        return this.a((NPC nPC) -> {
            boolean bl;
            if (x.var4(nPC.getInteracting())) {
                bl = var1[1];
                0;
                if (((0xA6 ^ 0x83 ^ (0 ^ 6)) & (75 + 116 - 101 + 46 ^ 30 + 29 - -68 + 44 ^ -1)) >= 1) {
                    return ((29 + 90 - 81 + 145 ^ 101 + 7 - 48 + 69) & (0xED ^ 0xC3 ^ (0x11 ^ 9) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
    }

    private static boolean var28(int n2, int n3) {
        return n2 < n3;
    }

    protected NPC E() {
        return this.a((NPC nPC) -> {
            boolean bl;
            if (x.var30(nPC.getInteracting(), Players.getLocal())) {
                bl = var1[1];
                0;
                if ((10 + 13 - -64 + 44 ^ 108 + 77 - 117 + 67) < ((0x52 ^ 0x7B ^ (0xC4 ^ 0xC3)) & (9 + 127 - 38 + 31 ^ 137 + 113 - 96 + 21 ^ -1))) {
                    return ((0x3B ^ 0xF ^ (0x8C ^ 0x9E)) & (0xCF ^ 0xC6 ^ (0x49 ^ 0x66) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    protected NPC a(Predicate<NPC> predicate) {
        WorldPoint worldPoint;
        TileObject tileObject = this.G();
        if (x.var4(tileObject)) {
            worldPoint = Players.getLocal().getWorldLocation();
            0;
            if (((0x1F ^ 0x23) & ~(0xBB ^ 0x87)) > ((0x14 ^ 0x2E) & ~(0x1B ^ 0x21))) {
                return null;
            }
        } else {
            void var31;
            worldPoint = var31.getWorldLocation();
        }
        WorldPoint worldPoint2 = worldPoint;
        return NPCs.getNearest((WorldPoint)worldPoint2, predicate.and(nPC -> {
            int n2;
            if (x.var18(this.H().v().equalsIgnoreCase(nPC.getName()) ? 1 : 0) && x.var18(this.a((NPC)nPC) ? 1 : 0)) {
                n2 = var1[1];
                0;
                if (-2 > 0) {
                    return ((5 ^ 0x68 ^ (0x3C ^ 0xC)) & (0x3A ^ 0x51 ^ (0x19 ^ 0x2F) ^ -1) & ((0x46 ^ 0x4E ^ (0x2F ^ 0x7A)) & (3 ^ (0xDC ^ 0x82) ^ -1) ^ -1)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        }));
    }

    private static boolean var18(int n2) {
        return n2 != 0;
    }

    private static boolean var30(Object object, Object object2) {
        return object == object2;
    }

    static {
        x.var32();
        x.var5();
    }

    private static void var32() {
        var1 = new int[6];
        x.var1[0] = (0x6B ^ 0x58) & ~(0xA8 ^ 0x9B);
        x.var1[1] = 1;
        x.var1[2] = 2;
        x.var1[3] = 3;
        x.var1[4] = 83 + 169 - 128 + 75 ^ 190 + 6 - 125 + 124;
        x.var1[5] = 0x9F ^ 0x97;
    }

    private static boolean var33(Object object) {
        return object != null;
    }

    protected TileObject G() {
        x var34;
        TileObject var35;
        TileObject tileObject = this.F();
        if (x.var33(tileObject)) {
            return var35;
        }
        var35 = var34.a(var1[0]);
        if (x.var33(var35)) {
            return var35;
        }
        return this.a(var1[1]);
    }
}

