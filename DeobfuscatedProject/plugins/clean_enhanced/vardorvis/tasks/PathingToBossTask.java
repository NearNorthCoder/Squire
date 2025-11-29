/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.util.stream.IntStream;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;

@TaskDesc(name="Pathing to Boss", priority=2147483547, blocking=true)
public class PathingToBossTask
extends VardorvisTaskBase {
    private static  WorldPoint ai;
    private static final  int ah;
    private final  int am = 4661;
    private  WorldArea an;
    
    private final  SquireVardorvisConfig al;
    
    private final  SquireVardorvis aj;
    private final  e ak;

    @Inject
    public PathingToBossTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.am = var1[0];
        this.an = new WorldArea(new WorldPoint(var1[1], var1[2], var1[3]), new WorldPoint(var1[4], var1[5], var1[3]));
        this.aj = squireVardorvis;
        this.ak = squireVardorvis.j();
        this.al = squireVardorvisConfig;
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean run() {
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(this.aj.h() ? 1 : 0)) {
            return var1[3];
        }
        return this.l();
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void a(String string, String string2, int n2, Player player) {
        void var7;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n3;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var8(tileObject.getId(), n2) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(tileObject.getName().equals(string) ? 1 : 0)) {
                String[] stringArray = new String[var1[6]];
                stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[3]] = string2;
                if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n3 = var1[6];
                    0;
                    if (((74 + 106 - 159 + 107 ^ 55 + 50 - 22 + 60) & (34 + 9 - 30 + 125 ^ 78 + 34 - 80 + 101 ^ -1)) <= 0) return n3 != 0;
                    return ((99 + 43 - 30 + 29 ^ 34 + 152 - 44 + 35) & (0xAC ^ 0xB7 ^ (0x99 ^ 0xBE) ^ -1)) != 0;
                }
            }
            n3 = var1[3];
            return n3 != 0;
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var9(tileObject2)) {
            return;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(var7.isMoving() ? 1 : 0)) {
            return;
        }
        tileObject2.interact(string2);
    }

    private static void var6() {
        var2 = new String[var1[15]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."No";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[6]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Rocks";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[7]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Climb-over";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[10]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Ring of shadows";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[11]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Teleport";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var2[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[9]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Ring of shadows";
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var8(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean S() {
        int n3;
        s var16;
        void var17;
        int[] nArray = this.w.getMapRegions();
        int var18 = var1[3];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var3(var18, ((void)var17).length)) {
            ++var18;
            0;
            
            return ((0x4D ^ 0x7A) & ~(0xA8 ^ 0x9F)) != 0;
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(IntStream.of((int[])var17).noneMatch(n2 -> {
            boolean bl;
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var8(n2, var1[0])) {
                bl = var1[6];
                0;
                if (-2 > 0) {
                    return ((13 + 81 - -39 + 108 ^ 42 + 110 - 129 + 124) & (154 + 186 - 186 + 60 ^ 114 + 125 - 146 + 87 ^ -1)) != 0;
                }
            } else {
                bl = var1[3];
            }
            return bl;
        }) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var8(var16.w.getVarbitValue(var1[12]), var1[6])) {
            String[] stringArray = new String[var1[6]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[3]] = var2[var1[9]];
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n3 = var1[6];
                0;
                if (-3 <= 0) return n3 != 0;
                return ((60 + 8 - 2 + 103 ^ 6 + 58 - 59 + 146) & (45 + 33 - 13 + 122 ^ 100 + 32 - 15 + 16 ^ -1)) != 0;
            }
        }
        n3 = var1[3];
        return n3 != 0;
    }

    private static String var19(String var20, String var21) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var24 = var1[3];
        char[] var25 = var20.toCharArray();
        int var26 = var25.length;
        int var27 = var1[3];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var3(var27, var26)) {
            char var28 = var25[var27];
            var22.append((char)(var28 ^ var23[var24 % var23.length]));
            0;
            ++var24;
            ++var27;
            0;
            if (((0x83 ^ 0xBC ^ (0x6A ^ 0xF)) & (175 + 184 - 141 + 19 ^ 149 + 82 - 136 + 88 ^ -1)) != 1) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static void var5() {
        var1 = new int[17];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[0] = 0xFFFF9AFD & 0x7737;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[1] = 0xFFFFD6DF & 0x2D79;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[2] = -(0xFFFFEAB5 & 0x77DB) & (0xFFFFEFFF & 0x7FF3);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[3] = (33 + 135 - 110 + 107 ^ 69 + 112 - 151 + 139) & (0xE ^ 0x4A ^ (0x2E ^ 0x66) ^ -1);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[4] = 0xFFFF8F6C & 0x74F3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[5] = -(0xFFFFF75D & 0x5AB7) & (0xFFFFDF7F & Short.MAX_VALUE);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[6] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[7] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[8] = 0xFFFFDD57 & 0xE3FF;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[9] = 0xA ^ 0x7B ^ (0xFB ^ 0x8F);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[10] = 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[11] = 0x75 ^ 0x45 ^ (0x64 ^ 0x50);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[12] = 0xFFFFBF2F & 0x7BF4;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[13] = 0xFFFF9D5F & 0x66FD;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[14] = -(0xFFFFFAE4 & 0x779F) & (0xFFFFFFFF & 0x7FE7);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[15] = 146 + 45 - 46 + 39 ^ 179 + 137 - 301 + 175;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[16] = 19 + 70 - -4 + 48 ^ 125 + 5 - 40 + 43;
    }

    @Override
    public boolean l() {
        s var29;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return var1[3];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(var29.aj.i() ? 1 : 0)) {
            return var1[6];
        }
        Player var30 = Players.getLocal();
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var9(var30)) {
            return var1[3];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(var29.an.contains((Locatable)var30) ? 1 : 0)) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(Dialog.isViewingOptions() ? 1 : 0)) {
                String[] stringArray = new String[var1[6]];
                stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[3]] = var2[var1[3]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return var1[6];
            }
            var29.a(var2[var1[6]], var2[var1[7]], var1[8], var30);
            return var1[6];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(var29.S() ? 1 : 0)) {
            if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(Dialog.isOpen() ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var4(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)var1[9]);
                0;
            }
            String[] stringArray = new String[var1[6]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s.var1[3]] = var2[var1[10]];
            Item var31 = Inventory.getFirst((String[])stringArray);
            var31.interact(var2[var1[11]]);
            return var1[6];
        }
        Movement.walkTo((WorldPoint)ai);
        0;
        return var1[6];
    }

    private static boolean var9(Object object) {
        return object == null;
    }
}

