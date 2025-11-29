/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.a_Unknown;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.FEnum;

/* TASK: Doing Vyre stuff -> DoingvyrestuffTask */
@TaskDesc(name="Doing Vyre stuff", priority=133337, blocking=true)
public class DoingVyreStuffTask
extends a_Unknown {
    private final /* synthetic */ int[] at;
    private static /* synthetic */ int[] lIIllIlIlllIl;
    private final /* synthetic */ WorldArea ap;
    private final /* synthetic */ WorldArea aq;
    private static /* synthetic */ String[] lIIllIlIlllII;
    private final /* synthetic */ WorldPoint as;
    private final /* synthetic */ WorldPoint ar;

    private static boolean lIllIIIIlllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private boolean a(Actor actor) {
        boolean bl;
        if (!A.lIllIIIIllIlIlI(this.ap.contains(actor.getWorldLocation()) ? 1 : 0) || A.lIllIIIIllIllII(this.aq.contains(actor.getWorldLocation()) ? 1 : 0)) {
            bl = lIIllIlIlllIl[12];
            0;
            if (2 > 2) {
                return false;
            }
        } else {
            bl = lIIllIlIlllIl[4];
        }
        return bl;
    }

    private static boolean lIllIIIIllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private TileObject I() {
        String[] stringArray = new String[lIIllIlIlllIl[12]];
        stringArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllII[lIIllIlIlllIl[14]];
        return TileObjects.getNearest((WorldPoint)this.ar, (String[])stringArray);
    }

    private boolean J() {
        TileObject tileObject = this.I();
        if (A.lIllIIIIllIlIll(tileObject)) {
            return lIIllIlIlllIl[4];
        }
        String[] stringArray = new String[lIIllIlIlllIl[12]];
        stringArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllII[lIIllIlIlllIl[10]];
        return tileObject.hasAction(stringArray);
    }

    private static boolean lIllIIIIllIlIll(Object object) {
        return object == null;
    }

    private static String lIllIIIIllIIlIl(String var17, String var15) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var10 = var15.toCharArray();
        int var1 = lIIllIlIlllIl[4];
        char[] var14 = var17.toCharArray();
        int var19 = var14.length;
        int var16 = lIIllIlIlllIl[4];
        while (A.lIllIIIIllIllIl(var16, var19)) {
            char var25 = var14[var16];
            var24.append((char)(var25 ^ var10[var1 % var10.length]));
            0;
            ++var1;
            ++var16;
            0;
            
            return null;
        }
        return String.valueOf(var24);
    }

    private static void lIllIIIIllIIlll() {
        lIIllIlIlllII = new String[lIIllIlIlllIl[2]];
        A.lIIllIlIlllII[A.lIIllIlIlllIl[4]] = A."Close";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[12]] = A."Wear";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[14]] = A."Door";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[10]] = A."Close";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[3]] = A."We are at {}, the destination is {}. Equality: {}";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[17]] = A."Close";
        A.lIIllIlIlllII[A.lIIllIlIlllIl[7]] = A."Open";
    }

    private static boolean lIllIIIIllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(boolean bl) {
        WorldPoint worldPoint;
        A var22;
        void var6;
        TileObject tileObject = this.I();
        if (!A.lIllIIIIllIlllI(tileObject) || A.lIllIIIIllIlIlI(this.J() ? 1 : 0)) {
            return lIIllIlIlllIl[4];
        }
        Player var20 = Players.getLocal();
        if (A.lIllIIIIllIlIll(var20)) {
            return lIIllIlIlllIl[4];
        }
        if (A.lIllIIIIllIllII((int)var6)) {
            worldPoint = var22.ar;
            0;
            if (((116 + 177 - 252 + 193 ^ 121 + 9 - 65 + 131) & (0x57 ^ 0x33 ^ (0xCD ^ 0x87) ^ -1)) >= (0x2C ^ 0x4B ^ (0xCD ^ 0xAE))) {
                return false;
            }
        } else {
            worldPoint = var22.as;
        }
        WorldPoint var12 = worldPoint;
        int n2 = var20.getWorldLocation().equals((Object)var12);
        Object[] objectArray = new Object[lIIllIlIlllIl[10]];
        objectArray[A.lIIllIlIlllIl[4]] = var20.getWorldLocation();
        objectArray[A.lIIllIlIlllIl[12]] = var12;
        objectArray[A.lIIllIlIlllIl[14]] = n2 != 0;
        Log.info((String)lIIllIlIlllII[lIIllIlIlllIl[3]], (Object[])objectArray);
        if (A.lIllIIIIllIlIlI(n2)) {
            Movement.setDestination((WorldPoint)var12);
            0;
            if (-(0xD6 ^ 0x81 ^ (0xDA ^ 0x89)) > 0) {
                return ((0xD5 ^ 0xB5 ^ (0xCC ^ 0xBB)) & (0xFF ^ 0xC2 ^ (0xEF ^ 0xC5) ^ -1)) != 0;
            }
        } else {
            void var11;
            String[] stringArray = new String[lIIllIlIlllIl[14]];
            stringArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllII[lIIllIlIlllIl[17]];
            stringArray[A.lIIllIlIlllIl[12]] = lIIllIlIlllII[lIIllIlIlllIl[7]];
            var11.interact(stringArray);
        }
        return lIIllIlIlllIl[12];
    }

    private static boolean lIllIIIIllIllII(int n2) {
        return n2 != 0;
    }

    static {
        A.lIllIIIIllIlIII();
        A.lIllIIIIllIIlll();
    }

    private static boolean lIllIIIIllIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static String lIllIIIIllIIllI(String var21, String var9) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIIllIlIlllIl[14], var18);
            return new String(var2.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIllIlIII() {
        lIIllIlIlllIl = new int[18];
        A.lIIllIlIlllIl[0] = 0xFFFFAFFF & 0x5E4D;
        A.lIIllIlIlllIl[1] = -(0xFFFFE7E9 & 0x5A5F) & (0xFFFFFF7B & 0x4FFE);
        A.lIIllIlIlllIl[2] = 73 + 90 - 132 + 100 ^ 109 + 106 - 162 + 79;
        A.lIIllIlIlllIl[3] = 0x12 ^ 0x16;
        A.lIIllIlIlllIl[4] = (125 + 108 - 223 + 144 ^ 13 + 97 - 96 + 158) & (0x6A ^ 0xE ^ (0xA ^ 0x58) ^ -1);
        A.lIIllIlIlllIl[5] = -(0xFFFFFF44 & 0x71BF) & (0xFFFFFF7B & 0x7FD7);
        A.lIIllIlIlllIl[6] = -(0xFFFFFEDB & 0x63B4) & (0xFFFFEFBF & Short.MAX_VALUE);
        A.lIIllIlIlllIl[7] = 0x67 ^ 0x61;
        A.lIIllIlIlllIl[8] = -(41 + 49 - -13 + 58) & (0xFFFFDEFF & 0x2FEE);
        A.lIIllIlIlllIl[9] = 0xFFFFFDBF & 0xF71;
        A.lIIllIlIlllIl[10] = 3;
        A.lIIllIlIlllIl[11] = -(0xFFFF8D9E & 0x77ED) & (0xFFFFFFEF & 0x65FF);
        A.lIIllIlIlllIl[12] = 1;
        A.lIIllIlIlllIl[13] = -(0xFFFF990F & 0x6EF9) & (0xFFFFED7E & 0x7AEF);
        A.lIIllIlIlllIl[14] = 2;
        A.lIIllIlIlllIl[15] = 0xFFFFF168 & 0x6EFF;
        A.lIIllIlIlllIl[16] = -(0xFFFFBECF & 0x4B33) & (0xFFFFFFEF & 0x2FFB);
        A.lIIllIlIlllIl[17] = 6 + 115 - 7 + 41 ^ 62 + 63 - -16 + 17;
    }

    private static boolean lIllIIIIllIlllI(Object object) {
        return object != null;
    }

    @Override
    public boolean l() {
        Player var4;
        A var7;
        if (A.lIllIIIIllIlIIl((Object)this.p.pickpocketTarget(), (Object)f.VYRE)) {
            return lIIllIlIlllIl[4];
        }
        if (A.lIllIIIIllIlIlI(var7.o.f().equals((Object)var7.ar) ? 1 : 0)) {
            var7.o.a(var7.ar);
        }
        if (A.lIllIIIIllIlIll(var4 = Players.getLocal())) {
            return lIIllIlIlllIl[4];
        }
        if (A.lIllIIIIllIllII(var7.o() ? 1 : 0)) {
            return lIIllIlIlllIl[4];
        }
        TileObject var26 = var7.I();
        if (A.lIllIIIIllIlIll(var26)) {
            return lIIllIlIlllIl[4];
        }
        if (A.lIllIIIIllIllII(var7.a((Actor)var4) ? 1 : 0) && A.lIllIIIIllIllII(var7.J() ? 1 : 0) && A.lIllIIIIllIlIlI(var7.o.j() ? 1 : 0)) {
            var26.interact(lIIllIlIlllII[lIIllIlIlllIl[4]]);
            return lIIllIlIlllIl[12];
        }
        if (A.lIllIIIIllIllII(var7.o.j() ? 1 : 0)) {
            if (A.lIllIIIIllIllII(Inventory.contains((int[])var7.at) ? 1 : 0)) {
                int[] var5 = var7.at;
                int var23 = var5.length;
                int var3 = lIIllIlIlllIl[4];
                while (A.lIllIIIIllIllIl(var3, var23)) {
                    int var8 = var5[var3];
                    int[] nArray = new int[lIIllIlIlllIl[12]];
                    nArray[A.lIIllIlIlllIl[4]] = var8;
                    Inventory.getFirst((int[])nArray).interact(lIIllIlIlllII[lIIllIlIlllIl[12]]);
                    ++var3;
                    0;
                    if (-2 <= 0) continue;
                    return ((39 + 202 - 203 + 208 ^ 119 + 107 - 87 + 38) & (0x43 ^ 0x16 ^ (0x7F ^ 0x6D) ^ -1)) != 0;
                }
                return lIIllIlIlllIl[12];
            }
            return var7.e(lIIllIlIlllIl[4]);
        }
        if (A.lIllIIIIllIlIlI(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIlIlllIl[4];
        }
        NPC var5 = var7.H();
        if (A.lIllIIIIllIllII(var7.a((Actor)var5) ? 1 : 0)) {
            var7.o.a(Worlds.getCurrentId());
            0;
            if (1 < 0) {
                return false;
            }
        } else {
            var7.o.a(lIIllIlIlllIl[4]);
            World var23 = Worlds.getCurrentWorld();
            Worlds.hopTo((World)Worlds.getRandom(world2 -> {
                int n2;
                if (A.lIllIIIIllIllII(world2.isNormal() ? 1 : 0) && A.lIllIIIIllIllll(world2.getLocation(), var23.getLocation()) && A.lIllIIIIlllIIII(world2.getId(), var23.getId()) && A.lIllIIIIllIllII(world2.isMembers() ? 1 : 0)) {
                    n2 = lIIllIlIlllIl[12];
                    0;
                    if (3 < 0) {
                        return ((0x20 ^ 0x34 ^ (0x15 ^ 0x63)) & (115 + 116 - 91 + 94 ^ 28 + 11 - -96 + 1 ^ -1)) != 0;
                    }
                } else {
                    n2 = lIIllIlIlllIl[4];
                }
                return n2 != 0;
            }));
        }
        if (!A.lIllIIIIllIllII(var7.a((Actor)var4) ? 1 : 0) || A.lIllIIIIllIllII(Reachable.isInteractable((Locatable)var5) ? 1 : 0)) {
            return var7.e(lIIllIlIlllIl[12]);
        }
        return lIIllIlIlllIl[4];
    }

    @Inject
    public A(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
        this.ap = new WorldArea(lIIllIlIlllIl[0], lIIllIlIlllIl[1], lIIllIlIlllIl[2], lIIllIlIlllIl[3], lIIllIlIlllIl[4]);
        this.aq = new WorldArea(lIIllIlIlllIl[5], lIIllIlIlllIl[6], lIIllIlIlllIl[3], lIIllIlIlllIl[7], lIIllIlIlllIl[4]);
        this.ar = new WorldPoint(lIIllIlIlllIl[8], lIIllIlIlllIl[1], lIIllIlIlllIl[4]);
        this.as = new WorldPoint(lIIllIlIlllIl[8], lIIllIlIlllIl[9], lIIllIlIlllIl[4]);
        int[] nArray = new int[lIIllIlIlllIl[10]];
        nArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllIl[11];
        nArray[A.lIIllIlIlllIl[12]] = lIIllIlIlllIl[13];
        nArray[A.lIIllIlIlllIl[14]] = lIIllIlIlllIl[15];
        this.at = nArray;
    }

    private static boolean lIllIIIIllIlIlI(int n2) {
        return n2 == 0;
    }

    private NPC H() {
        int[] nArray = new int[lIIllIlIlllIl[12]];
        nArray[A.lIIllIlIlllIl[4]] = lIIllIlIlllIl[16];
        return NPCs.getNearest((int[])nArray);
    }
}

