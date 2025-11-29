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
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

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
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.DEnum;

/* TASK: Handling Prayers -> HandlingprayersTask */
@TaskDesc(name="Handling Prayers", priority=0x7FFFFFFF)
public class HandlingPrayersTask
extends Task {
    private static /* synthetic */ int[] llllIIlllII;
    private static /* synthetic */ String[] llllIIllIll;
    private final /* synthetic */ SquireBarrowsConfig C;

    /*
     * WARNING - void declaration
     */
    private List<Prayer> b(NPC nPC) {
        void var3_3;
        void var12;
        g var21;
        void var4;
        String string = nPC.getName();
        if (g.lIllIlIIlIllII(string)) {
            return List.of();
        }
        ArrayList<Prayer> var11 = new ArrayList<Prayer>();
        if (g.lIllIlIIlIlllI(var4.contains(llllIIllIll[llllIIlllII[0]]) ? 1 : 0)) {
            var11.addAll(var21.C.karilOffensive().I());
            0;
            var11.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            0;
            if (-3 >= 0) {
                return null;
            }
        } else if (g.lIllIlIIlIlllI(var4.contains(llllIIllIll[llllIIlllII[1]]) ? 1 : 0)) {
            var11.addAll(var21.C.ahrimOffensive().I());
            0;
            var11.add(Prayer.PROTECT_FROM_MAGIC);
            0;
            0;
            if (1 <= 0) {
                return null;
            }
        } else if (g.lIllIlIIlIlllI(d.a((Actor)var12) ? 1 : 0)) {
            var11.addAll(var21.C.defaultOffensive().I());
            0;
            var11.add(Prayer.PROTECT_FROM_MELEE);
            0;
            0;
            if (2 == 0) {
                return null;
            }
        } else {
            var11.addAll(var21.C.tunnelOffensive().I());
            0;
            var11.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return var3_3;
    }

    @Inject
    public g(SquireBarrowsConfig squireBarrowsConfig) {
        this.C = squireBarrowsConfig;
    }

    private static void lIllIlIIlIlIll() {
        llllIIlllII = new int[4];
        g.llllIIlllII[0] = (0x77 ^ 0x56 ^ (0xE1 ^ 0x9D)) & (0 + 35 - -33 + 91 ^ 71 + 69 - -8 + 46 ^ -1);
        g.llllIIlllII[1] = 1;
        g.llllIIlllII[2] = 2;
        g.llllIIlllII[3] = 0x4E ^ 0x46;
    }

    private static String lIllIlIIlIlIIl(String var13, String var3) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var18 = var3.toCharArray();
        int var7 = llllIIlllII[0];
        char[] var15 = var13.toCharArray();
        int var16 = var15.length;
        int var24 = llllIIlllII[0];
        while (g.lIllIlIIllIIIl(var24, var16)) {
            char var2 = var15[var24];
            var19.append((char)(var2 ^ var18[var7 % var18.length]));
            0;
            ++var7;
            ++var24;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var19);
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
    private static /* synthetic */ boolean a(Player player, NPC nPC) {
        boolean bl;
        void var22;
        Player var6;
        if (g.lIllIlIIlIlllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) && !g.lIllIlIIlIllll(nPC.getInteracting(), player) || g.lIllIlIIllIIII(var6.getInteracting(), var22)) {
            bl = llllIIlllII[1];
            0;
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
        g.llllIIllIll[g.llllIIlllII[0]] = g."Karil";
        g.llllIIllIll[g.llllIIlllII[1]] = g."Ahrim";
    }

    private static boolean lIllIlIIlIllII(Object object) {
        return object == null;
    }

    private static boolean lIllIlIIlIlllI(int n2) {
        return n2 != 0;
    }

    private static String lIllIlIIlIlIII(String var8, String var20) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), llllIIlllII[3]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llllIIlllII[2], var23);
            return new String(var14.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        g var1;
        void var10;
        Player player = Players.getLocal();
        if (g.lIllIlIIlIllII(player)) {
            return llllIIlllII[0];
        }
        if (g.lIllIlIIlIllIl(Prayers.getPoints())) {
            return llllIIlllII[0];
        }
        NPC var5 = NPCs.getNearest(arg_0 -> g.a((Player)var10, arg_0));
        if (g.lIllIlIIlIllII(var5)) {
            if (g.lIllIlIIlIlllI(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return llllIIlllII[1];
            }
            return llllIIlllII[0];
        }
        List<Prayer> var17 = var1.b(var5);
        if (g.lIllIlIIlIllII(var17)) {
            return llllIIlllII[0];
        }
        Prayers.flick((List)var3_3);
        0;
        return llllIIlllII[1];
    }

    static {
        g.lIllIlIIlIlIll();
        g.lIllIlIIlIlIlI();
    }
}

