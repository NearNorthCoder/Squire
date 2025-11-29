/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Avoiding Spores", priority=0x7FFFFFFA, blocking=true)
public class AvoidingSporesTask
extends NightmareTaskBase {

    private static final  Logger eC;

    private static void lIIIlllIllIIllI() {
        llllIIIIlIlI = new String[llllIIIIllII[2]];
        ay.llllIIIIlIlI[ay.llllIIIIllII[0]] = "[AvoidSpores]: No valid path to move to";
        ay.llllIIIIlIlI[ay.llllIIIIllII[1]] = "[AvoidSpores]: Moving to {} from {}";
    }

    private static boolean lIIIlllIllIlIII(int n2) {
        return n2 > 0;
    }

    @Inject
    protected AvoidingSporesTask(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    @Override
    public boolean bY() {
        if (ay.lIIIlllIllIlIII(this.cM.ap())) {
            return llllIIIIllII[0];
        }
        NPC var1 = SquireNightmarePlugin.d();
        WorldArea var2 = var1.getWorldArea();
        List<WorldArea> var3 = e.ax();
        if (ay.lIIIlllIllIlIIl(var3.isEmpty() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        Player var4 = Players.getLocal();
        int var5 = var3.stream().anyMatch(worldArea -> worldArea.contains((Locatable)var4)) ? 1 : 0;
        if (ay.lIIIlllIllIlIIl(var5)) {
            ay var6;
            WorldPoint var7 = var6.cT.toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if (ay.lIIIlllIllIlIll(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                    bl = llllIIIIllII[1];

                    if (((0x6E ^ 0x5A) & ~(0x13 ^ 0x27)) != 0) {
                        return false;
                    }
                } else {
                    bl = llllIIIIllII[0];
                }
                return bl;
            }).filter(worldPoint -> {
                boolean bl;
                if (ay.lIIIlllIllIlIll(var2.contains(worldPoint) ? 1 : 0)) {
                    bl = llllIIIIllII[1];

                    }
                } else {
                    bl = llllIIIIllII[0];
                }
                return bl;
            }).filter(worldPoint -> var3.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> var4.getWorldLocation().distanceTo(worldPoint))).orElse(null);
            if (!ay.lIIIlllIllIlIlI(var7) || ay.lIIIlllIllIlIIl(var4.getWorldLocation().equals((Object)var7) ? 1 : 0)) {
                Log.info((String)llllIIIIlIlI[llllIIIIllII[0]]);
                return llllIIIIllII[0];
            }
            eC.info(llllIIIIlIlI[llllIIIIllII[1]], (Object)var7, (Object)Players.getLocal().getWorldLocation());
            var6.j(var7);

            return llllIIIIllII[1];
        }
        return llllIIIIllII[0];
    }

    static {
        ay.lIIIlllIllIIlll();
        ay.lIIIlllIllIIllI();
        eC = LoggerFactory.getLogger(AvoidingSporesTask.class);
    }

    private static boolean lIIIlllIllIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIllIlIlI(Object object) {
        return object != null;
    }
}

