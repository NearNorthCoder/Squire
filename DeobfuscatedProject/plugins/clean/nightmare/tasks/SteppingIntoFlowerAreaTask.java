/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Stepping into flower area", priority=0x7FFFFFFA, blocking=true)
public class SteppingIntoFlowerAreaTask
extends NightmareTaskBase {
    
    private static final  Logger es;

    private static boolean lIIlIIIlllIIlll(Object object) {
        return object == null;
    }

    static {
        aw.lIIlIIIlllIIllI();
        aw.lIIlIIIlllIIlIl();
        es = LoggerFactory.getLogger(SteppingIntoFlowerAreaTask.class);
    }

    @Inject
    protected SteppingIntoFlowerAreaTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    private static boolean lIIlIIIlllIlIII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var6_6;
        aw var1;
        void var2;
        void var3;
        WorldPoint worldPoint2 = this.cL.getLocalPlayer().getWorldLocation();
        RectangularArea rectangularArea = e.ay();
        if (aw.lIIlIIIlllIIlll(rectangularArea)) {
            return llllIlllIIII[0];
        }
        Player var4 = Players.getLocal();
        WorldPoint var5 = Movement.getDestination();
        if (aw.lIIlIIIlllIlIII(var3.contains((WorldPoint)var2) ? 1 : 0)) {
            return llllIlllIIII[0];
        }
        if (aw.lIIlIIIlllIlIIl(var5) && aw.lIIlIIIlllIlIII(var4.isMoving() ? 1 : 0) && aw.lIIlIIIlllIlIII(var3.contains(var5) ? 1 : 0)) {
            return llllIlllIIII[0];
        }
        NPC var6 = SquireNightmarePlugin.d();
        WorldPoint var7 = null;
        if (aw.lIIlIIIlllIlIII(var1.bZ() ? 1 : 0)) {
            Stream stream = var6.getWorldArea().getMeleeTiles(Static.getClient()).stream();
            void v1 = var3;
            Objects.requireNonNull(v1);

            var7 = stream.filter(arg_0 -> ((RectangularArea)v1).contains(arg_0)).filter(worldPoint -> {
                boolean bl;
                if (aw.lIIlIIIlllIlIlI(var6.getWorldArea().contains(worldPoint.getWorldLocation()) ? 1 : 0)) {
                    bl = llllIlllIIII[2];

                    if (2 <= 1) {
                        return ((29 + 41 - 34 + 197 ^ 187 + 94 - 108 + 21) & (0xB5 ^ 0xAA ^ (0x7F ^ 0x4B) ^ -1)) != 0;
                    }
                } else {
                    bl = llllIlllIIII[0];
                }
                return bl;
            }).filter(worldPoint -> {
                boolean bl;
                if (aw.lIIlIIIlllIlIlI(this.cM.Y().contains(worldPoint.getWorldLocation()) ? 1 : 0)) {
                    bl = llllIlllIIII[2];

                    if ((0x5E ^ 0x5A) != (0x2F ^ 0x2B)) {
                        return false;
                    }
                } else {
                    bl = llllIlllIIII[0];
                }
                return bl;
            }).min(Comparator.comparingInt(arg_0 -> aw.d((WorldPoint)var2, arg_0))).orElse(null);
        }
        if (aw.lIIlIIIlllIIlll(var7)) {
            var7 = var3.getNearest();
        }
        if (aw.lIIlIIIlllIIlll(var7)) {
            Object[] objectArray = new Object[llllIlllIIII[1]];
            objectArray[aw.llllIlllIIII[0]] = var3;
            objectArray[aw.llllIlllIIII[2]] = var6.getWorldArea();
            objectArray[aw.llllIlllIIII[3]] = var1.cM.Y();
            Log.error((String)llllIllIlllI[llllIlllIIII[0]], (Object[])objectArray);
            return llllIlllIIII[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return llllIlllIIII[2];
    }

    private static boolean lIIlIIIlllIlIIl(Object object) {
        return object != null;
    }

    private static  int d(WorldPoint worldPoint, WorldPoint worldPoint2) {
        return worldPoint2.getWorldLocation().distanceTo(worldPoint);
    }

    private static boolean lIIlIIIlllIlIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIlllIIlIl() {
        llllIllIlllI = new String[llllIlllIIII[2]];
        aw.llllIllIlllI[aw.llllIlllIIII[0]] = "[AvoidFlowers]: Unable to find a flower to move to. [farea: {}] [pnm: {}] [shadows: {}]";
    }

}

