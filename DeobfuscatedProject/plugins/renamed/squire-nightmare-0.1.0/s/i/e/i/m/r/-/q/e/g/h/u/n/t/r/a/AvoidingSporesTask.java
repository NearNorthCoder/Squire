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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.A_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j_Unknown;

/* TASK: Avoiding Spores -> AvoidingsporesTask */
@TaskDesc(name="Avoiding Spores", priority=0x7FFFFFFA, blocking=true)
public class AvoidingSporesTask
extends A_Unknown {
    private static /* synthetic */ String[] llllIIIIlIlI;
    private static /* synthetic */ int[] llllIIIIllII;
    private static final /* synthetic */ Logger eC;

    private static void lIIIlllIllIIllI() {
        llllIIIIlIlI = new String[llllIIIIllII[2]];
        ay.llllIIIIlIlI[ay.llllIIIIllII[0]] = ay."[AvoidSpores]: No valid path to move to";
        ay.llllIIIIlIlI[ay.llllIIIIllII[1]] = ay."[AvoidSpores]: Moving to {} from {}";
    }

    private static boolean lIIIlllIllIlIII(int n2) {
        return n2 > 0;
    }

    @Inject
    protected ay(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, e e2) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin, e2);
    }

    @Override
    public boolean bY() {
        if (ay.lIIIlllIllIlIII(this.cM.ap())) {
            return llllIIIIllII[0];
        }
        NPC var7 = SquireNightmarePlugin.d();
        WorldArea var4 = var7.getWorldArea();
        List<WorldArea> var2 = e.ax();
        if (ay.lIIIlllIllIlIIl(var2.isEmpty() ? 1 : 0)) {
            return llllIIIIllII[0];
        }
        Player var1 = Players.getLocal();
        int var10 = var2.stream().anyMatch(worldArea -> worldArea.contains((Locatable)var1)) ? 1 : 0;
        if (ay.lIIIlllIllIlIIl(var10)) {
            ay var8;
            WorldPoint var3 = var8.cT.toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if (ay.lIIIlllIllIlIll(this.cM.Y().contains(worldPoint) ? 1 : 0)) {
                    bl = llllIIIIllII[1];
                    0;
                    if (((0x6E ^ 0x5A) & ~(0x13 ^ 0x27)) != 0) {
                        return false;
                    }
                } else {
                    bl = llllIIIIllII[0];
                }
                return bl;
            }).filter(worldPoint -> {
                boolean bl;
                if (ay.lIIIlllIllIlIll(var4.contains(worldPoint) ? 1 : 0)) {
                    bl = llllIIIIllII[1];
                    0;
                    
                    }
                } else {
                    bl = llllIIIIllII[0];
                }
                return bl;
            }).filter(worldPoint -> var2.stream().noneMatch(worldArea -> worldArea.contains(worldPoint))).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint -> var1.getWorldLocation().distanceTo(worldPoint))).orElse(null);
            if (!ay.lIIIlllIllIlIlI(var3) || ay.lIIIlllIllIlIIl(var1.getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                Log.info((String)llllIIIIlIlI[llllIIIIllII[0]]);
                return llllIIIIllII[0];
            }
            eC.info(llllIIIIlIlI[llllIIIIllII[1]], (Object)var3, (Object)Players.getLocal().getWorldLocation());
            var8.j(var3);
            0;
            return llllIIIIllII[1];
        }
        return llllIIIIllII[0];
    }

    static {
        ay.lIIIlllIllIIlll();
        ay.lIIIlllIllIIllI();
        eC = LoggerFactory.getLogger(AvoidingSporesTask.class);
    }

    private static void lIIIlllIllIIlll() {
        llllIIIIllII = new int[3];
        ay.llllIIIIllII[0] = (0x35 ^ 0x7F) & ~(0xD5 ^ 0x9F);
        ay.llllIIIIllII[1] = 1;
        ay.llllIIIIllII[2] = 2;
    }

    private static String lIIIlllIlIlllIl(String var11, String var9) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(llllIIIIllII[2], var6);
            return new String(var12.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
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

