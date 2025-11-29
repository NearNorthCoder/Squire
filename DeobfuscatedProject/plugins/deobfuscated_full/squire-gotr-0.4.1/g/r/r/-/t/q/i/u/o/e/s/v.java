/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

/* TASK: Placing a cell -> PlacingacellTask */
@TaskDesc(name="Placing a cell", priority=3, blocking=true)
public class v
extends h {
    private static final /* synthetic */ Comparator<TileObject> be;
    private static /* synthetic */ int[] llIIlllIIlll;
    private static /* synthetic */ String[] llIIlllIIllI;

    private static boolean lllllllIIllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllllllIIlIllI() {
        llIIlllIIlll = new int[11];
        v.llIIlllIIlll[0] = 2;
        v.llIIlllIIlll[1] = (35 + 116 - 23 + 39 ^ 47 + 83 - 67 + 81) & (8 ^ 0x7B ^ (0x4E ^ 0xA) ^ -1);
        v.llIIlllIIlll[2] = 1;
        v.llIIlllIIlll[3] = 87 + 107 - 98 + 47 ^ 55 + 31 - -14 + 59;
        v.llIIlllIIlll[4] = 0x22 ^ 0x77 ^ (0xE6 ^ 0x93);
        v.llIIlllIIlll[5] = 3;
        v.llIIlllIIlll[6] = -1;
        v.llIIlllIIlll[7] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        v.llIIlllIIlll[8] = 96 + 61 - 130 + 116 ^ 21 + 54 - 49 + 113;
        v.llIIlllIIlll[9] = 42 + 21 - 23 + 155 ^ 197 + 130 - 190 + 61;
        v.llIIlllIIlll[10] = 0x6B ^ 0x6D;
    }

    private static boolean lllllllIIlllII(Object object) {
        return object != null;
    }

    private static String lllllllIIlIIll(String var15, String var1) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var7 = var1.toCharArray();
        int var20 = llIIlllIIlll[1];
        char[] var17 = var15.toCharArray();
        int var12 = var17.length;
        int var18 = llIIlllIIlll[1];
        while (v.lllllllIIlllIl(var18, var12)) {
            char var22 = var17[var18];
            var5.append((char)(var22 ^ var7[var20 % var7.length]));
            0;
            ++var20;
            ++var18;
            0;
            if ((0x1D ^ 0x4A ^ (0x45 ^ 0x17)) > 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean lllllllIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public v(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIIlll[0]];
        cArray[v.llIIlllIIlll[1]] = c.ACTIVE;
        cArray[v.llIIlllIIlll[2]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lllllllIIllIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var4_4;
        TileObject var8;
        int var11;
        int n2;
        v var19;
        void var4;
        Item item = this.aV.e();
        if (!v.lllllllIIlIlll(this.aV.g() ? 1 : 0) || v.lllllllIIllIII(item)) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIlIlll(var4.getName().contains(llIIlllIIllI[llIIlllIIlll[1]]) ? 1 : 0) && v.lllllllIIlIlll(var19.aW.craftGuardian() ? 1 : 0)) {
            return llIIlllIIlll[1];
        }
        Player var16 = Players.getLocal();
        if (!v.lllllllIIllIIl(SquireGOTRPlugin.g.contains((Locatable)var16) ? 1 : 0) || v.lllllllIIlIlll(SquireGOTRPlugin.h.contains((Locatable)var16) ? 1 : 0)) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIlIlll(var4.getName().contains(llIIlllIIllI[llIIlllIIlll[2]]) ? 1 : 0)) {
            n2 = llIIlllIIlll[3];
            0;
            if (-3 > 0) {
                return false;
            }
        } else {
            n2 = var11 = llIIlllIIlll[4];
        }
        if (v.lllllllIIllIII(var8 = (TileObject)TileObjects.getAll(tileObject -> tileObject.getName().contains(llIIlllIIllI[llIIlllIIlll[5]])).stream().min(be.thenComparing(TileObject::getId).thenComparing(tileObject -> tileObject.distanceTo((Locatable)var16))).orElse(null))) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIllIlI(var8.distanceTo((Locatable)var16), var11)) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIlIlll(var16.isMoving() ? 1 : 0)) {
            return llIIlllIIlll[2];
        }
        var4_4.interact(llIIlllIIllI[llIIlllIIlll[0]]);
        return llIIlllIIlll[2];
    }

    private static String lllllllIIlIlII(String var10, String var3) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(llIIlllIIlll[0], var9);
            return new String(var14.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static void lllllllIIlIlIl() {
        llIIlllIIllI = new String[llIIlllIIlll[10]];
        v.llIIlllIIllI[v.llIIlllIIlll[1]] = v."Overcharged";
        v.llIIlllIIllI[v.llIIlllIIlll[2]] = v."Weak";
        v.llIIlllIIllI[v.llIIlllIIlll[0]] = v."Place-cell";
        v.llIIlllIIllI[v.llIIlllIIlll[5]] = v."cell tile";
        v.llIIlllIIllI[v.llIIlllIIlll[8]] = v."null";
        v.llIIlllIIllI[v.llIIlllIIlll[9]] = v."null";
    }

    private static boolean lllllllIIlIlll(int n2) {
        return n2 != 0;
    }

    static {
        v.lllllllIIlIllI();
        v.lllllllIIlIlIl();
        be = (tileObject, tileObject2) -> {
            void var4_4;
            int n2;
            int n3;
            void var2;
            void var21;
            NPC nPC2 = NPCs.getNearest((WorldPoint)tileObject.getWorldLocation(), nPC -> {
                boolean bl;
                if (!v.lllllllIIlllII(nPC.getName()) || v.lllllllIIlIlll(llIIlllIIllI[llIIlllIIlll[9]].equals(nPC.getName()) ? 1 : 0)) {
                    bl = llIIlllIIlll[2];
                    0;
                    if (((0x74 ^ 0x7A) & ~(0x69 ^ 0x67)) > 0) {
                        return false;
                    }
                } else {
                    bl = llIIlllIIlll[1];
                }
                return bl;
            });
            NPC nPC3 = NPCs.getNearest((WorldPoint)tileObject2.getWorldLocation(), nPC -> {
                int n2;
                if (!v.lllllllIIlllII(nPC.getName()) || v.lllllllIIlIlll(llIIlllIIllI[llIIlllIIlll[8]].equals(nPC.getName()) ? 1 : 0)) {
                    n2 = llIIlllIIlll[2];
                    0;
                    if (3 == 2) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIIlll[1];
                }
                return n2 != 0;
            });
            if (v.lllllllIIllIII(nPC2) && v.lllllllIIllIII(nPC3)) {
                return llIIlllIIlll[1];
            }
            if (v.lllllllIIllIII(var21)) {
                return llIIlllIIlll[2];
            }
            if (v.lllllllIIllIII(var2)) {
                return llIIlllIIlll[6];
            }
            if (v.lllllllIIllIll(var21.getHealthRatio(), llIIlllIIlll[6])) {
                n3 = llIIlllIIlll[7];
                0;
                if (-2 >= 0) {
                    return (0xB3 ^ 0xAC) & ~(0x91 ^ 0x8E);
                }
            } else {
                int var13;
                n3 = var13 = var21.getHealthRatio();
            }
            if (v.lllllllIIllIll(var2.getHealthRatio(), llIIlllIIlll[6])) {
                n2 = llIIlllIIlll[7];
                0;
                if (((0x6A ^ 0x4C ^ 3) & (0x4D ^ 0x71 ^ (0x64 ^ 0x7D) ^ -1)) != 0) {
                    return (3 ^ (0x4B ^ 0x6A)) & (6 + 48 - -97 + 13 ^ 103 + 26 - 88 + 93 ^ -1);
                }
            } else {
                n2 = var2.getHealthRatio();
            }
            int n4 = n2;
            return Integer.compare((int)var4_4, n4);
        };
    }

    private static boolean lllllllIIllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllllIIllIIl(int n2) {
        return n2 == 0;
    }
}

