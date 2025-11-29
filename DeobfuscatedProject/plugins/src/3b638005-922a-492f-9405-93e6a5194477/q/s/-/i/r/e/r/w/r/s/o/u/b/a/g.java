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
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

@TaskDesc(name="Handling Prayers", priority=0x7FFFFFFF)
public class g
extends Task {
    private static /* synthetic */ int[] llllIIlllII;
    private static /* synthetic */ String[] llllIIllIll;
    private final /* synthetic */ SquireBarrowsConfig C;

    /*
     * WARNING - void declaration
     */
    private List<Prayer> b(NPC nPC) {
        void var3_3;
        void llllllllllllllllIIIllIlllIIIIIlI;
        g llllllllllllllllIIIllIlllIIIIIll;
        void llllllllllllllllIIIllIlllIIIIIIl;
        String string = nPC.getName();
        if (g.lIllIlIIlIllII(string)) {
            return List.of();
        }
        ArrayList<Prayer> llllllllllllllllIIIllIlllIIIIIII = new ArrayList<Prayer>();
        if (g.lIllIlIIlIlllI(llllllllllllllllIIIllIlllIIIIIIl.contains(llllIIllIll[llllIIlllII[0]]) ? 1 : 0)) {
            llllllllllllllllIIIllIlllIIIIIII.addAll(llllllllllllllllIIIllIlllIIIIIll.C.karilOffensive().I());
            "".length();
            llllllllllllllllIIIllIlllIIIIIII.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        } else if (g.lIllIlIIlIlllI(llllllllllllllllIIIllIlllIIIIIIl.contains(llllIIllIll[llllIIlllII[1]]) ? 1 : 0)) {
            llllllllllllllllIIIllIlllIIIIIII.addAll(llllllllllllllllIIIllIlllIIIIIll.C.ahrimOffensive().I());
            "".length();
            llllllllllllllllIIIllIlllIIIIIII.add(Prayer.PROTECT_FROM_MAGIC);
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        } else if (g.lIllIlIIlIlllI(d.a((Actor)llllllllllllllllIIIllIlllIIIIIlI) ? 1 : 0)) {
            llllllllllllllllIIIllIlllIIIIIII.addAll(llllllllllllllllIIIllIlllIIIIIll.C.defaultOffensive().I());
            "".length();
            llllllllllllllllIIIllIlllIIIIIII.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        } else {
            llllllllllllllllIIIllIlllIIIIIII.addAll(llllllllllllllllIIIllIlllIIIIIll.C.tunnelOffensive().I());
            "".length();
            llllllllllllllllIIIllIlllIIIIIII.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
        }
        return var3_3;
    }

    @Inject
    public g(SquireBarrowsConfig squireBarrowsConfig) {
        this.C = squireBarrowsConfig;
    }

    private static void lIllIlIIlIlIll() {
        llllIIlllII = new int[4];
        g.llllIIlllII[0] = (0x77 ^ 0x56 ^ (0xE1 ^ 0x9D)) & (0 + 35 - -33 + 91 ^ 71 + 69 - -8 + 46 ^ -" ".length());
        g.llllIIlllII[1] = " ".length();
        g.llllIIlllII[2] = "  ".length();
        g.llllIIlllII[3] = 0x4E ^ 0x46;
    }

    private static String lIllIlIIlIlIIl(String llllllllllllllllIIIllIllIlIlllll, String llllllllllllllllIIIllIllIllIIIll) {
        llllllllllllllllIIIllIllIlIlllll = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIllIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIllIllIIIlI = new StringBuilder();
        char[] llllllllllllllllIIIllIllIllIIIIl = llllllllllllllllIIIllIllIllIIIll.toCharArray();
        int llllllllllllllllIIIllIllIllIIIII = llllIIlllII[0];
        char[] llllllllllllllllIIIllIllIlIllIlI = llllllllllllllllIIIllIllIlIlllll.toCharArray();
        int llllllllllllllllIIIllIllIlIllIIl = llllllllllllllllIIIllIllIlIllIlI.length;
        int llllllllllllllllIIIllIllIlIllIII = llllIIlllII[0];
        while (g.lIllIlIIllIIIl(llllllllllllllllIIIllIllIlIllIII, llllllllllllllllIIIllIllIlIllIIl)) {
            char llllllllllllllllIIIllIllIllIIlIl = llllllllllllllllIIIllIllIlIllIlI[llllllllllllllllIIIllIllIlIllIII];
            llllllllllllllllIIIllIllIllIIIlI.append((char)(llllllllllllllllIIIllIllIllIIlIl ^ llllllllllllllllIIIllIllIllIIIIl[llllllllllllllllIIIllIllIllIIIII % llllllllllllllllIIIllIllIllIIIIl.length]));
            "".length();
            ++llllllllllllllllIIIllIllIllIIIII;
            ++llllllllllllllllIIIllIllIlIllIII;
            "".length();
            if (-" ".length() < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllIllIllIIIlI);
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
        void llllllllllllllllIIIllIllIlllllII;
        Player llllllllllllllllIIIllIllIlllllIl;
        if (g.lIllIlIIlIlllI(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) && !g.lIllIlIIlIllll(nPC.getInteracting(), player) || g.lIllIlIIllIIII(llllllllllllllllIIIllIllIlllllIl.getInteracting(), llllllllllllllllIIIllIllIlllllII)) {
            bl = llllIIlllII[1];
            "".length();
            if ("  ".length() <= " ".length()) {
                return ((0x23 ^ 9) & ~(3 ^ 0x29)) != 0;
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
        g.llllIIllIll[g.llllIIlllII[0]] = g.lIllIlIIlIlIII("01tF1GHVyzw=", "kOIEf");
        g.llllIIllIll[g.llllIIlllII[1]] = g.lIllIlIIlIlIIl("LzIkGQw=", "nZVpa");
    }

    private static boolean lIllIlIIlIllII(Object object) {
        return object == null;
    }

    private static boolean lIllIlIIlIlllI(int n2) {
        return n2 != 0;
    }

    private static String lIllIlIIlIlIII(String llllllllllllllllIIIllIllIlllIlII, String llllllllllllllllIIIllIllIlllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIIllIllIlllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), llllIIlllII[3]), "DES");
            Cipher llllllllllllllllIIIllIllIlllIllI = Cipher.getInstance("DES");
            llllllllllllllllIIIllIllIlllIllI.init(llllIIlllII[2], llllllllllllllllIIIllIllIlllIlll);
            return new String(llllllllllllllllIIIllIllIlllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIllIlllIlIl) {
            llllllllllllllllIIIllIllIlllIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        g llllllllllllllllIIIllIlllIIIlIll;
        void llllllllllllllllIIIllIlllIIIlIlI;
        Player player = Players.getLocal();
        if (g.lIllIlIIlIllII(player)) {
            return llllIIlllII[0];
        }
        if (g.lIllIlIIlIllIl(Prayers.getPoints())) {
            return llllIIlllII[0];
        }
        NPC llllllllllllllllIIIllIlllIIIlIIl = NPCs.getNearest(arg_0 -> g.a((Player)llllllllllllllllIIIllIlllIIIlIlI, arg_0));
        if (g.lIllIlIIlIllII(llllllllllllllllIIIllIlllIIIlIIl)) {
            if (g.lIllIlIIlIlllI(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return llllIIlllII[1];
            }
            return llllIIlllII[0];
        }
        List<Prayer> llllllllllllllllIIIllIlllIIIlIII = llllllllllllllllIIIllIlllIIIlIll.b(llllllllllllllllIIIllIlllIIIlIIl);
        if (g.lIllIlIIlIllII(llllllllllllllllIIIllIlllIIIlIII)) {
            return llllIIlllII[0];
        }
        Prayers.flick((List)var3_3);
        "".length();
        return llllIIlllII[1];
    }

    static {
        g.lIllIlIIlIlIll();
        g.lIllIlIIlIlIlI();
    }
}

