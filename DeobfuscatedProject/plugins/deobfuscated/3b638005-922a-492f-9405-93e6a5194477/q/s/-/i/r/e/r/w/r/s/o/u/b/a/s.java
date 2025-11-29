/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.api.widgets.Prayers
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Prayers;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.c;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

@TaskDesc(name="Going to house (mid trip)", priority=300, blocking=true)
public class s
extends Task {
    private final /* synthetic */ SquireBarrowsConfig ac;
    private final /* synthetic */ Client ae;
    private final /* synthetic */ SquireBarrows ab;
    private static /* synthetic */ String[] llllIllIIll;
    private final /* synthetic */ c ad;
    private static /* synthetic */ int[] llllIllIlII;

    private static boolean lIllIllIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIllIIIllIl(String llllllllllllllllIIIllIIIIllllIll, String llllllllllllllllIIIllIIIIlllllII) {
        try {
            SecretKeySpec llllllllllllllllIIIllIIIlIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIIIlllllII.getBytes(StandardCharsets.UTF_8)), llllIllIlII[7]), "DES");
            Cipher llllllllllllllllIIIllIIIIlllllll = Cipher.getInstance("DES");
            llllllllllllllllIIIllIIIIlllllll.init(llllIllIlII[6], llllllllllllllllIIIllIIIlIIIIIII);
            return new String(llllllllllllllllIIIllIIIIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIIIIllllllI) {
            llllllllllllllllIIIllIIIIllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlIllI(int n2) {
        return n2 > 0;
    }

    private static void lIllIllIIlIIII() {
        llllIllIlII = new int[8];
        s.llllIllIlII[0] = (0x13 ^ 0x5E) & ~(0x37 ^ 0x7A);
        s.llllIllIlII[1] = 130 + 124 - 167 + 75 ^ 3 + 120 - 26 + 67;
        s.llllIllIlII[2] = 0xE9 ^ 0xA5 ^ (0x67 ^ 0x2E);
        s.llllIllIlII[3] = 0x9A ^ 0x83;
        s.llllIllIlII[4] = 1;
        s.llllIllIlII[5] = 0x33 ^ 0x65 ^ (0x36 ^ 0x6A);
        s.llllIllIlII[6] = 2;
        s.llllIllIlII[7] = 0xDB ^ 0xC1 ^ (0x6E ^ 0x7C);
    }

    private static boolean lIllIllIIlIIIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        s.lIllIllIIlIIII();
        s.lIllIllIIIllll();
    }

    private boolean N() {
        boolean bl;
        s llllllllllllllllIIIllIIIlIIIlIll;
        if (s.lIllIllIIlIIll(this.ac.neverRisk() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        if (!s.lIllIllIIlIIll(llllllllllllllllIIIllIIIlIIIlIll.ab.m() ? 1 : 0) || s.lIllIllIIlIIlI(llllllllllllllllIIIllIIIlIIIlIll.ab.h() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        Actor llllllllllllllllIIIllIIIlIIIlIlI = Players.getLocal().getInteracting();
        if (s.lIllIllIIllIII(llllllllllllllllIIIllIIIlIIIlIlI)) {
            boolean bl2;
            NPC llllllllllllllllIIIllIIIlIIIlIIl = NPCs.getNearest(nPC -> {
                boolean bl;
                if (s.lIllIllIIllIlI(nPC.getInteracting(), Players.getLocal())) {
                    bl = llllIllIlII[4];
                    0;
                    if (1 < 1) {
                        return ((0xEA ^ 0x8B) & ~(0x5A ^ 0x3B)) != 0;
                    }
                } else {
                    bl = llllIllIlII[0];
                }
                return bl;
            });
            if (s.lIllIllIIllIII(llllllllllllllllIIIllIIIlIIIlIIl)) {
                return llllIllIlII[4];
            }
            if (!s.lIllIllIIlIIll(d.a((Actor)llllllllllllllllIIIllIIIlIIIlIIl) ? 1 : 0) || s.lIllIllIIllIIl(llllllllllllllllIIIllIIIlIIIlIIl.getHealthRatio(), llllIllIlII[5])) {
                bl2 = llllIllIlII[4];
                0;
                if (-2 > 0) {
                    return ((0x7D ^ 0x2D) & ~(0xCE ^ 0x9E)) != 0;
                }
            } else {
                bl2 = llllIllIlII[0];
            }
            return bl2;
        }
        if (s.lIllIllIIlIIll(llllllllllllllllIIIllIIIlIIIlIlI instanceof Player)) {
            return llllIllIlII[0];
        }
        List<NPC> llllllllllllllllIIIllIIIlIIIlIIl = llllllllllllllllIIIllIIIlIIIlIll.ad.b(llllllllllllllllIIIllIIIlIIIlIll.ab.d());
        if (s.lIllIllIIlIIll(llllllllllllllllIIIllIIIlIIIlIIl.contains((NPC)llllllllllllllllIIIllIIIlIIIlIlI) ? 1 : 0)) {
            return llllIllIlII[4];
        }
        if (s.lIllIllIIlIIll(llllllllllllllllIIIllIIIlIIIlIlI.getName().equals(d.DHAROK.C()) ? 1 : 0)) {
            return llllIllIlII[0];
        }
        if (!s.lIllIllIIlIIll(d.a((Actor)((NPC)llllllllllllllllIIIllIIIlIIIlIlI)) ? 1 : 0) || s.lIllIllIIllIIl(llllllllllllllllIIIllIIIlIIIlIlI.getHealthRatio(), llllIllIlII[5])) {
            bl = llllIllIlII[4];
            0;
            if (2 > 3) {
                return ((0xD ^ 0x13) & ~(0x34 ^ 0x2A)) != 0;
            }
        } else {
            bl = llllIllIlII[0];
        }
        return bl;
    }

    public boolean run() {
        s llllllllllllllllIIIllIIIlIIlIIll;
        if (s.lIllIllIIlIIIl(Game.getState(), GameState.LOGGED_IN)) {
            return llllIllIlII[0];
        }
        if (s.lIllIllIIlIIlI(llllllllllllllllIIIllIIIlIIlIIll.ac.restoreMidTrip() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        if (s.lIllIllIIlIIll(llllllllllllllllIIIllIIIlIIlIIll.ae.isInInstancedRegion() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        if (s.lIllIllIIlIlII(llllllllllllllllIIIllIIIlIIlIIll.ab.e(), llllIllIlII[1])) {
            return llllIllIlII[0];
        }
        if (s.lIllIllIIlIIll(llllllllllllllllIIIllIIIlIIlIIll.N() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        int llllllllllllllllIIIllIIIlIIlIIlI = Prayers.getPoints();
        int llllllllllllllllIIIllIIIlIIlIIIl = Skills.getLevel((Skill)Skill.PRAYER) - llllllllllllllllIIIllIIIlIIlIIlI;
        if (s.lIllIllIIlIlII(llllllllllllllllIIIllIIIlIIlIIll.ab.e(), llllIllIlII[2]) && s.lIllIllIIlIlIl(llllllllllllllllIIIllIIIlIIlIIIl, llllIllIlII[3]) && s.lIllIllIIlIIlI(llllllllllllllllIIIllIIIlIIlIIll.ab.h() ? 1 : 0)) {
            Log.info((String)llllIllIIll[llllIllIlII[0]]);
            TeleportLoader.enterHouse();
            0;
            return llllIllIlII[4];
        }
        if (s.lIllIllIIlIllI(llllllllllllllllIIIllIIIlIIlIIlI)) {
            return llllIllIlII[0];
        }
        Item llllllllllllllllIIIllIIIlIIlIIII = Inventory.getFirst(item -> item.getName().startsWith(llllIllIIll[llllIllIlII[4]]));
        NPC llllllllllllllllIIIllIIIlIIIllll = NPCs.getNearest(nPC -> {
            int n2;
            if (s.lIllIllIIllIlI(nPC.getInteracting(), Players.getLocal()) && s.lIllIllIIlIIll(d.a((Actor)nPC) ? 1 : 0)) {
                n2 = llllIllIlII[4];
                0;
                if (1 <= -1) {
                    return ((0x33 ^ 0x37) & ~(0x64 ^ 0x60)) != 0;
                }
            } else {
                n2 = llllIllIlII[0];
            }
            return n2 != 0;
        });
        if (s.lIllIllIIlIlll(llllllllllllllllIIIllIIIlIIlIIII) && s.lIllIllIIlIlll(llllllllllllllllIIIllIIIlIIIllll)) {
            return llllIllIlII[0];
        }
        TeleportLoader.enterHouse();
        0;
        return llllIllIlII[4];
    }

    private static void lIllIllIIIllll() {
        llllIllIIll = new String[llllIllIlII[6]];
        s.llllIllIIll[s.llllIllIlII[0]] = s."Going to house (last brother)";
        s.llllIllIIll[s.llllIllIlII[4]] = s."Prayer";
    }

    private static boolean lIllIllIIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public s(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig, c c2, Client client) {
        this.ab = squireBarrows;
        this.ac = squireBarrowsConfig;
        this.ad = c2;
        this.ae = client;
    }

    private static boolean lIllIllIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIllIIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIIlIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllIIllIII(Object object) {
        return object == null;
    }

    private static String lIllIllIIIlllI(String llllllllllllllllIIIllIIIIllIlllI, String llllllllllllllllIIIllIIIIllIllIl) {
        try {
            SecretKeySpec llllllllllllllllIIIllIIIIlllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIIIIlllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIIIIlllIIlI.init(llllIllIlII[6], llllllllllllllllIIIllIIIIlllIIll);
            return new String(llllllllllllllllIIIllIIIIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIIIIlllIIIl) {
            llllllllllllllllIIIllIIIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlIlII(int n2, int n3) {
        return n2 == n3;
    }
}

