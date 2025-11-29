/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum8;
import gg.squire.wintertodt.tasks.BHelper;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Lighting Brazier", priority=2, blocking=true, register=true)
public class LightingBrazierTask
extends Task {
    
    public static final  int Y;
    private final  SquireWintertodtConfig aa;
    private final  b Z;
    private  int ab;

    private static boolean llIIIIllIlIIIll(Object object) {
        return object != null;
    }

    @Inject
    public LightingBrazierTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.ab = lIlIlllllIIII[0];
        this.Z = b2;
        this.aa = squireWintertodtConfig;
    }

        return String.valueOf(var1);
    }

    static {
        o.llIIIIllIIlllII();
        o.llIIIIllIIlIlll();
        Y = lIlIlllllIIII[7];
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!o.llIIIIllIIlllIl(string.contains(lIlIllllIlllI[lIlIlllllIIII[2]]) ? 1 : 0) || o.llIIIIllIIlllll(string.contains(lIlIllllIlllI[lIlIlllllIIII[6]]) ? 1 : 0)) {
            o var2;
            var2.sleep(lIlIlllllIIII[0]);
        }
    }

    private static boolean llIIIIllIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIIIllIlIIIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIIllIIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIllIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIllIlIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        o var3;
        if (o.llIIIIllIIlllIl(this.Z.i() ? 1 : 0)) {
            return lIlIlllllIIII[0];
        }
        a var4 = var3.Z.q();
        Player var5 = Players.getLocal();
        if (o.llIIIIllIIllllI(var3.Z.k(), lIlIlllllIIII[1])) {
            if (o.llIIIIllIIlllll(var3.Z.s() ? 1 : 0)) {
                return lIlIlllllIIII[2];
            }
            if (!o.llIIIIllIIlllIl(var5.isMoving() ? 1 : 0) || o.llIIIIllIlIIIII(var4.b().distanceTo((Locatable)var5), lIlIlllllIIII[3])) {
                return lIlIlllllIIII[0];
            }
            Movement.walk((WorldPoint)var4.b());
            return lIlIlllllIIII[2];
        }
        if (o.llIIIIllIlIIIIl(var4.b().distanceTo((Locatable)var5), lIlIlllllIIII[3])) {
            return lIlIlllllIIII[0];
        }
        NPC var6 = NPCs.getNearest((WorldPoint)var4.b(), nPC -> {
            int n2;
            if (o.llIIIIllIlIIlIl(nPC.getId(), lIlIlllllIIII[7]) && o.llIIIIllIlIIlII(nPC.distanceTo(var4.b()), lIlIlllllIIII[5])) {
                n2 = lIlIlllllIIII[2];

                if ((0xF5 ^ 0xB3 ^ (0x1A ^ 0x58)) != (8 + 47 - -3 + 69 ^ (0xC4 ^ 0xBF))) {
                    return ((0xF ^ 0x3E ^ (0x50 ^ 0x36)) & (181 + 101 - 44 + 14 ^ 78 + 151 - 180 + 122 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllllIIII[0];
            }
            return n2 != 0;
        });
        if (o.llIIIIllIlIIIlI(var6)) {
            if (o.llIIIIllIlIIIIl(var3.ab, lIlIlllllIIII[4])) {
                var3.Z.r();
                var3.ab = lIlIlllllIIII[0];
                return lIlIlllllIIII[0];
            }
            if (o.llIIIIllIlIIIII(var4.b().distanceTo((Locatable)Players.getLocal()), lIlIlllllIIII[5])) {
                var3.ab += lIlIlllllIIII[2];
            }
            return lIlIlllllIIII[0];
        }
        TileObject var7 = TileObjects.getNearest((WorldPoint)var4.b(), tileObject -> {
            int n2;
            if (o.llIIIIllIlIIIll(tileObject.getName()) && o.llIIIIllIIlllll(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllIlllI[lIlIlllllIIII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlllllIIII[2]];
                stringArray[o.lIlIlllllIIII[0]] = lIlIllllIlllI[lIlIlllllIIII[1]];
                if (o.llIIIIllIIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && o.llIIIIllIlIIlII(var4.b().distanceTo((Locatable)tileObject), lIlIlllllIIII[3])) {
                    n2 = lIlIlllllIIII[2];

                    if (3 > 2) return n2 != 0;
                    return ((36 + 126 - 157 + 235 ^ 135 + 23 - 46 + 56) & (0xD1 ^ 0xB7 ^ (0x8F ^ 0xB1) ^ -1)) != 0;
                }
            }
            n2 = lIlIlllllIIII[0];
            return n2 != 0;
        });
        if (o.llIIIIllIlIIIlI(var7)) {
            return lIlIlllllIIII[0];
        }
        this.ab = lIlIlllllIIII[0];
        var4_4.interact(lIlIllllIlllI[lIlIlllllIIII[0]]);
        this.sleep(lIlIlllllIIII[6]);
        return lIlIlllllIIII[2];
    }

    private static void llIIIIllIIlIlll() {
        lIlIllllIlllI = new String[lIlIlllllIIII[8]];
        o.lIlIllllIlllI[o.lIlIlllllIIII[0]] = "Light";
        o.lIlIllllIlllI[o.lIlIlllllIIII[2]] = "seeps into your bones";
        o.lIlIllllIlllI[o.lIlIlllllIIII[6]] = "Congratulations";
        o.lIlIllllIlllI[o.lIlIlllllIIII[3]] = "brazier";
        o.lIlIllllIlllI[o.lIlIlllllIIII[1]] = "Light";
    }

    private static boolean llIIIIllIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIIllIIlllIl(int n2) {
        return n2 == 0;
    }
}

