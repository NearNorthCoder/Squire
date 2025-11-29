/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d;

@TaskDesc(name="Hopping for an empty world", priority=4, blocking=true)
public class n
extends Task {
    private final /* synthetic */ SquireThieving O;
    private static /* synthetic */ int[] lIIllIlIIllll;
    private static /* synthetic */ String[] lIIllIlIIlllI;
    private final /* synthetic */ Predicate<NPC> P;
    private final /* synthetic */ SquireThievingConfig N;

    private static void lIllIIIIIlIlIlI() {
        lIIllIlIIllll = new int[12];
        n.lIIllIlIIllll[0] = (0x20 ^ 0x30) & ~(0x7D ^ 0x6D);
        n.lIIllIlIIllll[1] = -1;
        n.lIIllIlIIllll[2] = 1;
        n.lIIllIlIIllll[3] = 2;
        n.lIIllIlIIllll[4] = 3;
        n.lIIllIlIIllll[5] = 0xBC ^ 0xB8;
        n.lIIllIlIIllll[6] = 0x2D ^ 0x2A ^ 2;
        n.lIIllIlIIllll[7] = 0x4D ^ 0x4B;
        n.lIIllIlIIllll[8] = 0x87 ^ 0x80;
        n.lIIllIlIIllll[9] = 0x91 ^ 0x99;
        n.lIIllIlIIllll[10] = 45 + 73 - -11 + 61 ^ 31 + 62 - 25 + 115;
        n.lIIllIlIIllll[11] = 0xED ^ 0x80 ^ (0x70 ^ 0x17);
    }

    private static String lIllIIIIIlIIllI(String llllllllllllllIllllIIIIlIlIIlIlI, String llllllllllllllIllllIIIIlIlIIIlll) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIIlIlIIllII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIIlIlIIllII.init(lIIllIlIIllll[3], llllllllllllllIllllIIIIlIlIIllIl);
            return new String(llllllllllllllIllllIIIIlIlIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIlIlIIlIll) {
            llllllllllllllIllllIIIIlIlIIlIll.printStackTrace();
            return null;
        }
    }

    @Inject
    public n(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        this.P = nPC -> {
            int n2;
            if (n.lIllIIIIIlIllII(nPC.getName().contains(lIIllIlIIlllI[lIIllIlIIllll[9]]) ? 1 : 0) && n.lIllIIIIIlIllII(nPC.getName().equals(lIIllIlIIlllI[lIIllIlIIllll[10]]) ? 1 : 0)) {
                n2 = lIIllIlIIllll[2];
                0;
                if (((0x6D ^ 0x4E ^ (0xA8 ^ 0x83)) & (0x7B ^ 0x25 ^ (0x7D ^ 0x2B) ^ -1)) != 0) {
                    return ((0x57 ^ 0x10 ^ (0xB0 ^ 0xB8)) & (0x31 ^ 0x72 ^ (0x40 ^ 0x4C) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIIllll[0];
            }
            return n2 != 0;
        };
        this.N = squireThievingConfig;
        this.O = squireThieving;
    }

    private static void lIllIIIIIlIlIIl() {
        lIIllIlIIlllI = new String[lIIllIlIIllll[11]];
        n.lIIllIlIIlllI[n.lIIllIlIIllll[0]] = n."Hopping to go back to saved world {}";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[2]] = n."Housed NPCs: {}";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[3]] = n."Hopping because there are {} NPCs in our house";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[4]] = n."Hopping because player {} is in the area blackjacking!";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[5]] = n."Rana the Dyer";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[6]] = n."Villager";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[7]] = n."Pick-up";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[8]] = n."Dismiss";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[9]] = n."Rana";
        n.lIIllIlIIlllI[n.lIIllIlIIllll[10]] = n."Villager";
    }

    /*
     * WARNING - void declaration
     */
    private boolean C() {
        void var2_2;
        World llllllllllllllIllllIIIIllIIIIlll;
        n llllllllllllllIllllIIIIllIIIlIIl;
        if (n.lIllIIIIIlIllII(Shop.isOpen() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
        }
        int llllllllllllllIllllIIIIllIIIlIII = llllllllllllllIllllIIIIllIIIlIIl.O.e();
        if (n.lIllIIIIIllIIIl(Worlds.getCurrentId(), llllllllllllllIllllIIIIllIIIlIII)) {
            llllllllllllllIllllIIIIllIIIlIIl.O.a(lIIllIlIIllll[1]);
            return lIIllIlIIllll[2];
        }
        if (n.lIllIIIIIlIllIl(llllllllllllllIllllIIIIllIIIlIII, lIIllIlIIllll[1])) {
            llllllllllllllIllllIIIIllIIIIlll = Worlds.getFirst((int)llllllllllllllIllllIIIIllIIIlIII);
            0;
            if (1 == 0) {
                return ((0x1A ^ 0x54 ^ (8 ^ 0x60)) & (0x30 ^ 0x6F ^ (0xD1 ^ 0xA8) ^ -1)) != 0;
            }
        } else {
            llllllllllllllIllllIIIIllIIIIlll = Worlds.getFirst(world -> {
                int n2;
                if (n.lIllIIIIIlIllII(world.isNormal() ? 1 : 0) && n.lIllIIIIIllIIIl(world.getLocation(), Worlds.getCurrentWorld().getLocation()) && n.lIllIIIIIlIllII(world.isMembers() ? 1 : 0) && n.lIllIIIIIlIlllI(world.getId(), Worlds.getCurrentId())) {
                    n2 = lIIllIlIIllll[2];
                    0;
                    if (1 == 2) {
                        return ((0xAA ^ 0xA3 ^ (0xAE ^ 0x8E)) & (0x74 ^ 0x43 ^ (0x19 ^ 7) ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIlIIllll[0];
                }
                return n2 != 0;
            });
        }
        if (n.lIllIIIIIllIIII(llllllllllllllIllllIIIIllIIIIlll) && n.lIllIIIIIllIIII(llllllllllllllIllllIIIIllIIIIlll = Worlds.getFirst(world -> {
            int n2;
            if (n.lIllIIIIIlIllII(world.isNormal() ? 1 : 0) && n.lIllIIIIIlIllII(world.isMembers() ? 1 : 0) && n.lIllIIIIIllIIIl(world.getLocation(), Worlds.getCurrentWorld().getLocation())) {
                n2 = lIIllIlIIllll[2];
                0;
                if (((0xF ^ 0x79 ^ (0x5B ^ 0x1D)) & (0xE6 ^ 0xBB ^ (0x26 ^ 0x4B) ^ -1)) > 3) {
                    return ((30 + 154 - 74 + 65 ^ 115 + 78 - 124 + 80) & (0x1C ^ 7 ^ (0x1D ^ 0x3C) ^ -1)) != 0;
                }
            } else {
                n2 = lIIllIlIIllll[0];
            }
            return n2 != 0;
        }))) {
            return lIIllIlIIllll[0];
        }
        Worlds.hopTo((World)var2_2);
        return lIIllIlIIllll[2];
    }

    private static boolean lIllIIIIIlIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIIIlIllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIllIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIlIllIl(int n2, int n3) {
        return n2 != n3;
    }

    static {
        n.lIllIIIIIlIlIlI();
        n.lIllIIIIIlIlIIl();
    }

    private static String lIllIIIIIlIIlll(String llllllllllllllIllllIIIIlIllIIlll, String llllllllllllllIllllIIIIlIllIlIll) {
        llllllllllllllIllllIIIIlIllIIlll = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIIIlIllIlIlI = new StringBuilder();
        char[] llllllllllllllIllllIIIIlIllIlIIl = llllllllllllllIllllIIIIlIllIlIll.toCharArray();
        int llllllllllllllIllllIIIIlIllIlIII = lIIllIlIIllll[0];
        char[] llllllllllllllIllllIIIIlIllIIIlI = llllllllllllllIllllIIIIlIllIIlll.toCharArray();
        int llllllllllllllIllllIIIIlIllIIIIl = llllllllllllllIllllIIIIlIllIIIlI.length;
        int llllllllllllllIllllIIIIlIllIIIII = lIIllIlIIllll[0];
        while (n.lIllIIIIIllIlII(llllllllllllllIllllIIIIlIllIIIII, llllllllllllllIllllIIIIlIllIIIIl)) {
            char llllllllllllllIllllIIIIlIllIllIl = llllllllllllllIllllIIIIlIllIIIlI[llllllllllllllIllllIIIIlIllIIIII];
            llllllllllllllIllllIIIIlIllIlIlI.append((char)(llllllllllllllIllllIIIIlIllIllIl ^ llllllllllllllIllllIIIIlIllIlIIl[llllllllllllllIllllIIIIlIllIlIII % llllllllllllllIllllIIIIlIllIlIIl.length]));
            0;
            ++llllllllllllllIllllIIIIlIllIlIII;
            ++llllllllllllllIllllIIIIlIllIIIII;
            0;
            if ((0xC0 ^ 0xC4) > 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIIIIlIllIlIlI);
    }

    private static boolean lIllIIIIIlIllll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIIIIIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIlIlIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIIIllIIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        n llllllllllllllIllllIIIIllIIlIIlI;
        if (n.lIllIIIIIlIlIll((Object)this.N.method(), (Object)b.BLACK_JACK)) {
            return lIIllIlIIllll[0];
        }
        if (n.lIllIIIIIlIllII(llllllllllllllIllllIIIIllIIlIIlI.O.i() ? 1 : 0)) {
            return lIIllIlIIllll[0];
        }
        d llllllllllllllIllllIIIIllIIlIIIl = llllllllllllllIllllIIIIllIIlIIlI.O.b();
        c llllllllllllllIllllIIIIllIIlIIII = llllllllllllllIllllIIIIllIIlIIIl.t();
        List llllllllllllllIllllIIIIllIIIllll = NPCs.getAll(nPC -> {
            int n2;
            if (n.lIllIIIIIlIllII(llllllllllllllIllllIIIIllIIlIIIl.t().p().contains((Locatable)nPC) ? 1 : 0) && n.lIllIIIIIllIIll(nPC.getName().equals(lIIllIlIIlllI[lIIllIlIIllll[5]]) ? 1 : 0) && n.lIllIIIIIllIIll(nPC.getName().equals(lIIllIlIIlllI[lIIllIlIIllll[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIlIIllll[2]];
                stringArray[n.lIIllIlIIllll[0]] = lIIllIlIIlllI[lIIllIlIIllll[7]];
                if (n.lIllIIIIIllIIll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIllIlIIllll[2]];
                    stringArray2[n.lIIllIlIIllll[0]] = lIIllIlIIlllI[lIIllIlIIllll[8]];
                    if (n.lIllIIIIIllIIll(nPC.hasAction(stringArray2) ? 1 : 0)) {
                        n2 = lIIllIlIIllll[2];
                        0;
                        if (((0x6F ^ 0x5C) & ~(0xA1 ^ 0x92)) >= ((0x1D ^ 0x2C) & ~(0x51 ^ 0x60))) return n2 != 0;
                        return ((0x8D ^ 0xB4) & ~(0x5F ^ 0x66)) != 0;
                    }
                }
            }
            n2 = lIIllIlIIllll[0];
            return n2 != 0;
        });
        if (n.lIllIIIIIlIllIl(llllllllllllllIllllIIIIllIIlIIlI.O.e(), lIIllIlIIllll[1]) && n.lIllIIIIIlIllIl(Worlds.getCurrentId(), llllllllllllllIllllIIIIllIIlIIlI.O.e())) {
            Object[] objectArray = new Object[lIIllIlIIllll[2]];
            objectArray[n.lIIllIlIIllll[0]] = llllllllllllllIllllIIIIllIIlIIlI.O.e();
            Log.info((String)lIIllIlIIlllI[lIIllIlIIllll[0]], (Object[])objectArray);
            return llllllllllllllIllllIIIIllIIlIIlI.C();
        }
        if (n.lIllIIIIIlIlllI(llllllllllllllIllllIIIIllIIIllll.size(), lIIllIlIIllll[2])) {
            Object[] objectArray = new Object[lIIllIlIIllll[2]];
            objectArray[n.lIIllIlIIllll[0]] = llllllllllllllIllllIIIIllIIIllll;
            Log.info((String)lIIllIlIIlllI[lIIllIlIIllll[2]], (Object[])objectArray);
            Object[] objectArray2 = new Object[lIIllIlIIllll[2]];
            objectArray2[n.lIIllIlIIllll[0]] = llllllllllllllIllllIIIIllIIIllll.size();
            Log.info((String)lIIllIlIIlllI[lIIllIlIIllll[3]], (Object[])objectArray2);
            return llllllllllllllIllllIIIIllIIlIIlI.C();
        }
        if (n.lIllIIIIIlIlIll(Game.getState(), GameState.LOGGED_IN)) {
            boolean bl;
            if (n.lIllIIIIIlIllll(Game.getState(), GameState.HOPPING)) {
                bl = lIIllIlIIllll[2];
                0;
                if ((0x11 ^ 0x30 ^ (0x9D ^ 0xB8)) < 0) {
                    return ((103 + 108 - 116 + 73 ^ 121 + 28 - 138 + 118) & (0x74 ^ 0x54 ^ (0xE ^ 7) ^ -1)) != 0;
                }
            } else {
                bl = lIIllIlIIllll[0];
            }
            return bl;
        }
        Player llllllllllllllIllllIIIIllIIIlllI = Players.getLocal();
        Player llllllllllllllIllllIIIIllIIIllIl = Players.getNearest(player2 -> {
            int n2;
            if (n.lIllIIIIIlIlIll(player2, llllllllllllllIllllIIIIllIIIlllI) && n.lIllIIIIIlIllII(llllllllllllllIllllIIIIllIIlIIII.p().contains((Locatable)player2) ? 1 : 0) && n.lIllIIIIIllIIlI(player2.getInteracting())) {
                n2 = lIIllIlIIllll[2];
                0;
                if (((0x31 ^ 0x14) & ~(0xBC ^ 0x99)) != ((0xCD ^ 0xC3) & ~(0x40 ^ 0x4E))) {
                    return (2 & ~2) != 0;
                }
            } else {
                n2 = lIIllIlIIllll[0];
            }
            return n2 != 0;
        });
        if (n.lIllIIIIIllIIII(llllllllllllllIllllIIIIllIIIllIl)) {
            return lIIllIlIIllll[0];
        }
        Object[] objectArray = new Object[lIIllIlIIllll[2]];
        objectArray[n.lIIllIlIIllll[0]] = var5_5.getName();
        Log.info((String)lIIllIlIIlllI[lIIllIlIIllll[4]], (Object[])objectArray);
        return this.C();
    }

    private static boolean lIllIIIIIllIIII(Object object) {
        return object == null;
    }

    private static String lIllIIIIIlIlIII(String llllllllllllllIllllIIIIlIlIlIlll, String llllllllllllllIllllIIIIlIlIlIllI) {
        try {
            SecretKeySpec llllllllllllllIllllIIIIlIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), lIIllIlIIllll[9]), "DES");
            Cipher llllllllllllllIllllIIIIlIlIllIIl = Cipher.getInstance("DES");
            llllllllllllllIllllIIIIlIlIllIIl.init(lIIllIlIIllll[3], llllllllllllllIllllIIIIlIlIllIlI);
            return new String(llllllllllllllIllllIIIIlIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIIlIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIIIIlIlIllIII) {
            llllllllllllllIllllIIIIlIlIllIII.printStackTrace();
            return null;
        }
    }
}

