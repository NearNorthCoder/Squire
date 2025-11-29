/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.barrows.tasks.GameEnum20;

@TaskDesc(name="Handling Prayers", priority=0x7FFFFFFF)
public class HandlingPrayersTask
extends Task {

    private final  SquireBarrowsConfig C;

    /*
     * WARNING - void declaration
     */
    private List<Prayer> b(NPC nPC) {
        void var3_3;
        void var1;
        g var2;
        void var3;
        String string = nPC.getName();
        if (g.lIllIlIIlIllII(string)) {
            return List.of();
        }
        ArrayList<Prayer> var4 = new ArrayList<Prayer>();
        if (g.lIllIlIIlIlllI(var3.contains(llllIIllIll[llllIIlllII[0]]) ? 1 : 0)) {
            var4.addAll(var2.C.karilOffensive().I());

            var4.add(Prayer.PROTECT_FROM_MISSILES);

        } else if (g.lIllIlIIlIlllI(var3.contains(llllIIllIll[llllIIlllII[1]]) ? 1 : 0)) {
            var4.addAll(var2.C.ahrimOffensive().I());

            var4.add(Prayer.PROTECT_FROM_MAGIC);

            if (1 <= 0) {
                return null;
            }
        } else if (g.lIllIlIIlIlllI(d.a((Actor)var1) ? 1 : 0)) {
            var4.addAll(var2.C.defaultOffensive().I());

            var4.add(Prayer.PROTECT_FROM_MELEE);

            if (2 == 0) {
                return null;
            }
        } else {
            var4.addAll(var2.C.tunnelOffensive().I());

            var4.add(Prayer.PROTECT_FROM_MELEE);

        }
        return var3_3;
    }

    @Inject
    public HandlingPrayersTask(SquireBarrowsConfig squireBarrowsConfig) {
        this.C = squireBarrowsConfig;
    }

        return String.valueOf(var5);
    }

    private static boolean lIllIlIIlIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIIllIIII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(Player player, NPC nPC) {
        boolean bl;
        void var6;
        Player var7;
        if (g.lIllIlIIlIlllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) && !g.lIllIlIIlIllll(nPC.getInteracting(), player) || g.lIllIlIIllIIII(var7.getInteracting(), var6)) {
            bl = llllIIlllII[1];

            if (2 <= 1) {
                return false;
            }
        } else {
            bl = llllIIlllII[0];
        }
        return bl;
    }

    private static boolean lIllIlIIlIllll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIlIIllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIIlIlIlI() {
        llllIIllIll = new String[llllIIlllII[2]];
        g.llllIIllIll[g.llllIIlllII[0]] = "Karil";
        g.llllIIllIll[g.llllIIlllII[1]] = "Ahrim";
    }

    private static boolean lIllIlIIlIllII(Object object) {
        return object == null;
    }

    private static boolean lIllIlIIlIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        g var8;
        void var9;
        Player player = Players.getLocal();
        if (g.lIllIlIIlIllII(player)) {
            return llllIIlllII[0];
        }
        if (g.lIllIlIIlIllIl(Prayers.getPoints())) {
            return llllIIlllII[0];
        }
        NPC var10 = NPCs.getNearest(arg_0 -> g.a((Player)var9, arg_0));
        if (g.lIllIlIIlIllII(var10)) {
            if (g.lIllIlIIlIlllI(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return llllIIlllII[1];
            }
            return llllIIlllII[0];
        }
        List<Prayer> var11 = var8.b(var10);
        if (g.lIllIlIIlIllII(var11)) {
            return llllIIlllII[0];
        }
        Prayers.flick((List)var3_3);

        return llllIIlllII[1];
    }

    static {
        g.lIllIlIIlIlIll();
        g.lIllIlIIlIlIlI();
    }
}

