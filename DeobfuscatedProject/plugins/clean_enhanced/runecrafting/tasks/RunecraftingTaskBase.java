/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.client.plugins.fw.Task;
import gg.squire.runecrafting.SquireGOTRConfig;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.util.function.BooleanSupplier;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

public abstract class RunecraftingTaskBase
extends Task {
    private  int ba;
    protected static final  int aR;
    private  boolean bb;
    private  int aY;
    protected final  SquireGOTRConfig aW;
    protected final  SquireGOTRPlugin aV;
    protected static final  int aT;
    private final  c[] aX;
    protected static final  int aU;
    private  BooleanSupplier aZ;
    
    protected static final  int aS;

    private static boolean var2(Object object) {
        return object != null;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private boolean ai() {
        h var4;
        if (h.var3(this.aX.length)) {
            return var1[0];
        }
        c[] var5 = var4.aX;
        int var6 = var5.length;
        int var7 = var1[1];
        while (h.var8(var7, var6)) {
            c var9 = var5[var7];
            if (h.var10((Object)var9, (Object)var4.aV.m())) {
                return var1[0];
            }
            ++var7;
            0;
            if (-1 < 0) continue;
            return ((31 + 141 - 111 + 103 ^ 57 + 63 - 102 + 112) & (0x4A ^ 0x2F ^ (0x5D ^ 0x1E) ^ -1)) != 0;
        }
        return var1[1];
    }

    static {
        h.var11();
        aU = var1[4];
        aT = var1[5];
        aR = var1[6];
        aS = var1[7];
    }

    private static boolean var10(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean b(GameObject gameObject) {
        boolean bl;
        void var12;
        void var13;
        WorldPoint worldPoint = Movement.getDestination();
        if (!h.var2(worldPoint) || h.var3(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[1];
        }
        WorldArea var14 = var13.getWorldArea();
        if (!h.var3(var14.contains((WorldPoint)var12) ? 1 : 0) || h.var15(var14.isInMeleeDistance((WorldPoint)var12) ? 1 : 0)) {
            bl = var1[0];
            0;
            
        } else {
            bl = var1[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean a(WorldPoint worldPoint) {
        boolean bl;
        void var16;
        void var17;
        WorldPoint worldPoint2 = Movement.getDestination();
        if (!h.var2(worldPoint2) || h.var3(Players.getLocal().isMoving() ? 1 : 0)) {
            return var1[1];
        }
        if (h.var18(var17.distanceTo((WorldPoint)var16), var1[2])) {
            bl = var1[0];
            0;
            if (2 >= 3) {
                return ((0xE3 ^ 0x9F ^ (0xD6 ^ 0x91)) & (0x6B ^ 3 ^ (0x7F ^ 0x2C) ^ -1)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    protected void a(int n2, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        this.ba = n2;
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    protected boolean aj() {
        return var1[1];
    }

    protected void b(int n2, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        this.ba = n2;
        this.sleep(n2);
    }

    protected void c(int n2, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        if (h.var2(this.aZ)) {
            this.ba = n2;
        }
        this.sleep(n2);
        this.bb = var1[0];
    }

    private static boolean var15(int n2) {
        return n2 != 0;
    }

    private static boolean var18(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var11() {
        var1 = new int[8];
        h.var1[0] = 1;
        h.var1[1] = (207 + 221 - 335 + 139 ^ 130 + 24 - 44 + 69) & (0x7A ^ 0x42 ^ (0xF1 ^ 0x92) ^ -1);
        h.var1[2] = 3;
        h.var1[3] = 0xBA ^ 0xBE;
        h.var1[4] = -(0xFFFFF81F & 0x5FE4) & (0xFFFFFDFF & 0x5E7F);
        h.var1[5] = -(0xFFFFFF9B & 0x7C67) & (0xFFFFFFBF & 0x7F7F);
        h.var1[6] = 0xFFFFECF5 & 0x379F;
        h.var1[7] = 0xFFFFFFEB & 0x1BF7;
    }

    public RunecraftingTaskBase(SquireGOTRPlugin squireGOTRPlugin, c ... cArray) {
        this.aV = squireGOTRPlugin;
        this.aW = squireGOTRPlugin.w();
        this.aX = cArray;
    }

    private static boolean var19(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean ah() {
        boolean bl;
        void var20;
        Player player = Players.getLocal();
        if (h.var3(player.isMoving() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var21 = Movement.getDestination();
        if (!h.var2(var21) || h.var18(var21.distanceTo((Locatable)var20), var1[3])) {
            bl = var1[0];
            0;
            if (-1 > (0x6A ^ 0x37 ^ (0xC ^ 0x55))) {
                return ((163 + 26 - 140 + 160 ^ 31 + 122 - 82 + 87) & (0xF6 ^ 0xBB ^ 2 ^ -1)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }

    public void sleep(int n2) {
        this.aY += n2;
    }

    protected abstract boolean ak();

    public boolean run() {
        h var22;
        if (h.var3(this.aj() ? 1 : 0) && h.var15(this.aW.helperMode() ? 1 : 0)) {
            return var1[1];
        }
        if (!h.var15(var22.ai() ? 1 : 0) || h.var15(var22.aV.l() ? 1 : 0)) {
            return var1[1];
        }
        if (h.var2(var22.aZ) && h.var15(var22.aZ.getAsBoolean() ? 1 : 0)) {
            var22.aY = var22.ba;
        }
        if (h.var19(var22.aY)) {
            var22.aY -= var1[0];
            return var22.bb;
        }
        this.aZ = null;
        this.bb = var1[1];
        return this.ak();
    }
}

