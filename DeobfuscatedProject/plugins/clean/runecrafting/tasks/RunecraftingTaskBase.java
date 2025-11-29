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

import gg.squire.runecrafting.tasks.GameEnum14;
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

    private static boolean lIIIIIIIIIlllIl(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIIllllI(int n2) {
        return n2 == 0;
    }

    private boolean ai() {
        h var1;
        if (h.lIIIIIIIIIllllI(this.aX.length)) {
            return llIlIIIIlIII[0];
        }
        c[] var2 = var1.aX;
        int var3 = var2.length;
        int var4 = llIlIIIIlIII[1];
        while (h.lIIIIIIIIlIIIIl(var4, var3)) {
            c var5 = var2[var4];
            if (h.lIIIIIIIIlIIIlI((Object)var5, (Object)var1.aV.m())) {
                return llIlIIIIlIII[0];
            }
            ++var4;

            if (-1 < 0) continue;
            return ((31 + 141 - 111 + 103 ^ 57 + 63 - 102 + 112) & (0x4A ^ 0x2F ^ (0x5D ^ 0x1E) ^ -1)) != 0;
        }
        return llIlIIIIlIII[1];
    }

    static {
        h.lIIIIIIIIIlllII();
        aU = llIlIIIIlIII[4];
        aT = llIlIIIIlIII[5];
        aR = llIlIIIIlIII[6];
        aS = llIlIIIIlIII[7];
    }

    private static boolean lIIIIIIIIlIIIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean b(GameObject gameObject) {
        boolean bl;
        void var6;
        void var7;
        WorldPoint worldPoint = Movement.getDestination();
        if (!h.lIIIIIIIIIlllIl(worldPoint) || h.lIIIIIIIIIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        WorldArea var8 = var7.getWorldArea();
        if (!h.lIIIIIIIIIllllI(var8.contains((WorldPoint)var6) ? 1 : 0) || h.lIIIIIIIIIlllll(var8.isInMeleeDistance((WorldPoint)var6) ? 1 : 0)) {
            bl = llIlIIIIlIII[0];

            if (2 == 0) {
                return ((0xB8 ^ 0xA6 ^ (0x86 ^ 0x94)) & (0x30 ^ 0x69 ^ (0xD7 ^ 0x82) ^ -1)) != 0;
            }
        } else {
            bl = llIlIIIIlIII[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean a(WorldPoint worldPoint) {
        boolean bl;
        void var9;
        void var10;
        WorldPoint worldPoint2 = Movement.getDestination();
        if (!h.lIIIIIIIIIlllIl(worldPoint2) || h.lIIIIIIIIIllllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        if (h.lIIIIIIIIlIIIII(var10.distanceTo((WorldPoint)var9), llIlIIIIlIII[2])) {
            bl = llIlIIIIlIII[0];

            if (2 >= 3) {
                return ((0xE3 ^ 0x9F ^ (0xD6 ^ 0x91)) & (0x6B ^ 3 ^ (0x7F ^ 0x2C) ^ -1)) != 0;
            }
        } else {
            bl = llIlIIIIlIII[1];
        }
        return bl;
    }

    protected void a(int n2, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        this.ba = n2;
    }

    private static boolean lIIIIIIIIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    protected boolean aj() {
        return llIlIIIIlIII[1];
    }

    protected void b(int n2, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        this.ba = n2;
        this.sleep(n2);
    }

    protected void c(int n2, BooleanSupplier booleanSupplier) {
        this.aZ = booleanSupplier;
        if (h.lIIIIIIIIIlllIl(this.aZ)) {
            this.ba = n2;
        }
        this.sleep(n2);
        this.bb = llIlIIIIlIII[0];
    }

    private static boolean lIIIIIIIIIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIIIIlIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    public RunecraftingTaskBase(SquireGOTRPlugin squireGOTRPlugin, c ... cArray) {
        this.aV = squireGOTRPlugin;
        this.aW = squireGOTRPlugin.w();
        this.aX = cArray;
    }

    private static boolean lIIIIIIIIlIIIll(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    protected boolean ah() {
        boolean bl;
        void var11;
        Player player = Players.getLocal();
        if (h.lIIIIIIIIIllllI(player.isMoving() ? 1 : 0)) {
            return llIlIIIIlIII[0];
        }
        WorldPoint var12 = Movement.getDestination();
        if (!h.lIIIIIIIIIlllIl(var12) || h.lIIIIIIIIlIIIII(var12.distanceTo((Locatable)var11), llIlIIIIlIII[3])) {
            bl = llIlIIIIlIII[0];

            if (-1 > (0x6A ^ 0x37 ^ (0xC ^ 0x55))) {
                return false;
            }
        } else {
            bl = llIlIIIIlIII[1];
        }
        return bl;
    }

    public void sleep(int n2) {
        this.aY += n2;
    }

    protected abstract boolean ak();

    public boolean run() {
        h var13;
        if (h.lIIIIIIIIIllllI(this.aj() ? 1 : 0) && h.lIIIIIIIIIlllll(this.aW.helperMode() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        if (!h.lIIIIIIIIIlllll(var13.ai() ? 1 : 0) || h.lIIIIIIIIIlllll(var13.aV.l() ? 1 : 0)) {
            return llIlIIIIlIII[1];
        }
        if (h.lIIIIIIIIIlllIl(var13.aZ) && h.lIIIIIIIIIlllll(var13.aZ.getAsBoolean() ? 1 : 0)) {
            var13.aY = var13.ba;
        }
        if (h.lIIIIIIIIlIIIll(var13.aY)) {
            var13.aY -= llIlIIIIlIII[0];
            return var13.bb;
        }
        this.aZ = null;
        this.bb = llIlIIIIlIII[1];
        return this.ak();
    }
}

