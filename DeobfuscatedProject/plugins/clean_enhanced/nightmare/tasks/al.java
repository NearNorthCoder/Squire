/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

public abstract class al
extends NightmareManager {
    private static final  Logger eb;
    
    protected final  f ec;

    public abstract EquipmentSetup cq();

    @Override
    public boolean bY() {
        if (al.var2(this.cK.assistantMode() ? 1 : 0)) {
            return var1[0];
        }
        return this.cr();
    }

    public boolean x(NPC nPC) {
        return this.ec.a(nPC, this.cq());
    }

    private static void var3() {
        var1 = new int[2];
        al.var1[0] = (0x6F ^ 0x38 ^ (0x43 ^ 0x2F)) & (3 ^ 0x29 ^ (0x18 ^ 9) ^ -1);
        al.var1[1] = 1;
    }

    protected boolean cw() {
        int n2;
        TileObject tileObject = j.aV();
        RectangularArea rectangularArea = e.ay();
        Player player = Players.getLocal();
        if (al.var4(tileObject) && al.var4(rectangularArea) && al.var5(rectangularArea.contains(player.getWorldLocation()) ? 1 : 0)) {
            n2 = var1[1];
            0;
            if ((0x6A ^ 0x64 ^ (0x33 ^ 0x39)) < 3) {
                return ((0x1C ^ 0x40 ^ (0x11 ^ 0x57)) & (142 + 78 - 131 + 88 ^ 61 + 80 - -23 + 7 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    protected boolean cx() {
        List<WorldArea> list = e.ax();
        if (al.var5(list.isEmpty() ? 1 : 0)) {
            WorldPoint worldPoint = Players.getLocal().getWorldLocation();
            return list.stream().anyMatch(worldArea -> worldArea.contains(worldPoint));
        }
        return var1[0];
    }

    protected boolean cy() {
        return this.cS.getWorldArea().contains(Players.getLocal().getWorldLocation());
    }

    private static boolean var6(int n2, int n3) {
        return n2 != n3;
    }

    protected al(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, f f2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
        this.ec = f2;
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    static {
        al.var3();
        eb = LoggerFactory.getLogger(al.class);
    }

    protected boolean cv() {
        return this.cM.Y().contains(Players.getLocal().getWorldLocation());
    }

    protected boolean cz() {
        int n2;
        if (al.var2(Players.getLocal().isMoving() ? 1 : 0) && al.var4(Movement.getDestination())) {
            n2 = var1[1];
            0;
            if (3 <= 0) {
                return ((0x4F ^ 0x12) & ~(0xE9 ^ 0xB4)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    public abstract boolean cr();

    private static boolean var7(int n2) {
        return n2 > 0;
    }

    protected boolean cu() {
        int n2;
        al var8;
        if (al.var6(this.cM.ap(), var1[1]) && al.var5(this.cz() ? 1 : 0) && !al.var2(this.cv() ? 1 : 0) || al.var7(var8.cM.ap()) && al.var2(var8.cy() ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (3 <= 0) {
                return ((0x4F ^ 0xD) & ~(0x57 ^ 0x15)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }
}

