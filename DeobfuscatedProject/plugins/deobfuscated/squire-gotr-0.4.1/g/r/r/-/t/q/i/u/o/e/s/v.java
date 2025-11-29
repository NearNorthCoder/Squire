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

    private static String lllllllIIlIIll(String lllllllllllllllIlIIlIllllIllIllI, String lllllllllllllllIlIIlIllllIllIlIl) {
        lllllllllllllllIlIIlIllllIllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllllIlllIIl = new StringBuilder();
        char[] lllllllllllllllIlIIlIllllIlllIII = lllllllllllllllIlIIlIllllIllIlIl.toCharArray();
        int lllllllllllllllIlIIlIllllIllIlll = llIIlllIIlll[1];
        char[] lllllllllllllllIlIIlIllllIllIIIl = lllllllllllllllIlIIlIllllIllIllI.toCharArray();
        int lllllllllllllllIlIIlIllllIllIIII = lllllllllllllllIlIIlIllllIllIIIl.length;
        int lllllllllllllllIlIIlIllllIlIllll = llIIlllIIlll[1];
        while (v.lllllllIIlllIl(lllllllllllllllIlIIlIllllIlIllll, lllllllllllllllIlIIlIllllIllIIII)) {
            char lllllllllllllllIlIIlIllllIllllII = lllllllllllllllIlIIlIllllIllIIIl[lllllllllllllllIlIIlIllllIlIllll];
            lllllllllllllllIlIIlIllllIlllIIl.append((char)(lllllllllllllllIlIIlIllllIllllII ^ lllllllllllllllIlIIlIllllIlllIII[lllllllllllllllIlIIlIllllIllIlll % lllllllllllllllIlIIlIllllIlllIII.length]));
            0;
            ++lllllllllllllllIlIIlIllllIllIlll;
            ++lllllllllllllllIlIIlIllllIlIllll;
            0;
            if ((0x1D ^ 0x4A ^ (0x45 ^ 0x17)) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIllllIlllIIl);
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
        TileObject lllllllllllllllIlIIlIllllllIIIll;
        int lllllllllllllllIlIIlIllllllIIlII;
        int n2;
        v lllllllllllllllIlIIlIllllllIIlll;
        void lllllllllllllllIlIIlIllllllIIllI;
        Item item = this.aV.e();
        if (!v.lllllllIIlIlll(this.aV.g() ? 1 : 0) || v.lllllllIIllIII(item)) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIlIlll(lllllllllllllllIlIIlIllllllIIllI.getName().contains(llIIlllIIllI[llIIlllIIlll[1]]) ? 1 : 0) && v.lllllllIIlIlll(lllllllllllllllIlIIlIllllllIIlll.aW.craftGuardian() ? 1 : 0)) {
            return llIIlllIIlll[1];
        }
        Player lllllllllllllllIlIIlIllllllIIlIl = Players.getLocal();
        if (!v.lllllllIIllIIl(SquireGOTRPlugin.g.contains((Locatable)lllllllllllllllIlIIlIllllllIIlIl) ? 1 : 0) || v.lllllllIIlIlll(SquireGOTRPlugin.h.contains((Locatable)lllllllllllllllIlIIlIllllllIIlIl) ? 1 : 0)) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIlIlll(lllllllllllllllIlIIlIllllllIIllI.getName().contains(llIIlllIIllI[llIIlllIIlll[2]]) ? 1 : 0)) {
            n2 = llIIlllIIlll[3];
            0;
            if (-3 > 0) {
                return ((3 ^ 0x1E) & ~(0x4E ^ 0x53)) != 0;
            }
        } else {
            n2 = lllllllllllllllIlIIlIllllllIIlII = llIIlllIIlll[4];
        }
        if (v.lllllllIIllIII(lllllllllllllllIlIIlIllllllIIIll = (TileObject)TileObjects.getAll(tileObject -> tileObject.getName().contains(llIIlllIIllI[llIIlllIIlll[5]])).stream().min(be.thenComparing(TileObject::getId).thenComparing(tileObject -> tileObject.distanceTo((Locatable)lllllllllllllllIlIIlIllllllIIlIl))).orElse(null))) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIllIlI(lllllllllllllllIlIIlIllllllIIIll.distanceTo((Locatable)lllllllllllllllIlIIlIllllllIIlIl), lllllllllllllllIlIIlIllllllIIlII)) {
            return llIIlllIIlll[1];
        }
        if (v.lllllllIIlIlll(lllllllllllllllIlIIlIllllllIIlIl.isMoving() ? 1 : 0)) {
            return llIIlllIIlll[2];
        }
        var4_4.interact(llIIlllIIllI[llIIlllIIlll[0]]);
        return llIIlllIIlll[2];
    }

    private static String lllllllIIlIlII(String lllllllllllllllIlIIlIlllllIIlIIl, String lllllllllllllllIlIIlIlllllIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllllIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllllIIllIl.init(llIIlllIIlll[0], lllllllllllllllIlIIlIlllllIIlllI);
            return new String(lllllllllllllllIlIIlIlllllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlllllIIllII) {
            lllllllllllllllIlIIlIlllllIIllII.printStackTrace();
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
            void lllllllllllllllIlIIlIlllllIllIIl;
            void lllllllllllllllIlIIlIlllllIllIlI;
            NPC nPC2 = NPCs.getNearest((WorldPoint)tileObject.getWorldLocation(), nPC -> {
                boolean bl;
                if (!v.lllllllIIlllII(nPC.getName()) || v.lllllllIIlIlll(llIIlllIIllI[llIIlllIIlll[9]].equals(nPC.getName()) ? 1 : 0)) {
                    bl = llIIlllIIlll[2];
                    0;
                    if (((0x74 ^ 0x7A) & ~(0x69 ^ 0x67)) > 0) {
                        return ((0x98 ^ 0xBC) & ~(0x1C ^ 0x38)) != 0;
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
                        return ((0xE1 ^ 0xAF) & ~(0x7D ^ 0x33)) != 0;
                    }
                } else {
                    n2 = llIIlllIIlll[1];
                }
                return n2 != 0;
            });
            if (v.lllllllIIllIII(nPC2) && v.lllllllIIllIII(nPC3)) {
                return llIIlllIIlll[1];
            }
            if (v.lllllllIIllIII(lllllllllllllllIlIIlIlllllIllIlI)) {
                return llIIlllIIlll[2];
            }
            if (v.lllllllIIllIII(lllllllllllllllIlIIlIlllllIllIIl)) {
                return llIIlllIIlll[6];
            }
            if (v.lllllllIIllIll(lllllllllllllllIlIIlIlllllIllIlI.getHealthRatio(), llIIlllIIlll[6])) {
                n3 = llIIlllIIlll[7];
                0;
                if (-2 >= 0) {
                    return (0xB3 ^ 0xAC) & ~(0x91 ^ 0x8E);
                }
            } else {
                int lllllllllllllllIlIIlIlllllIllIII;
                n3 = lllllllllllllllIlIIlIlllllIllIII = lllllllllllllllIlIIlIlllllIllIlI.getHealthRatio();
            }
            if (v.lllllllIIllIll(lllllllllllllllIlIIlIlllllIllIIl.getHealthRatio(), llIIlllIIlll[6])) {
                n2 = llIIlllIIlll[7];
                0;
                if (((0x6A ^ 0x4C ^ 3) & (0x4D ^ 0x71 ^ (0x64 ^ 0x7D) ^ -1)) != 0) {
                    return (3 ^ (0x4B ^ 0x6A)) & (6 + 48 - -97 + 13 ^ 103 + 26 - 88 + 93 ^ -1);
                }
            } else {
                n2 = lllllllllllllllIlIIlIlllllIllIIl.getHealthRatio();
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

