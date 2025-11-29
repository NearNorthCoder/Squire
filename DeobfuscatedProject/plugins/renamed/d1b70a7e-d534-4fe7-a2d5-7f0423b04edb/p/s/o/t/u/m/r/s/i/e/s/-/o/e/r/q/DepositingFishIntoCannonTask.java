/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.o_Unknown;

/* TASK: Depositing fish into cannon -> DepositingfishintocannonTask */
@TaskDesc(name="Depositing fish into cannon", priority=15, blocking=true)
public class DepositingFishIntoCannonTask
extends o_Unknown {
    private static /* synthetic */ String[] lIIlllIIIIllI;
    private static /* synthetic */ int[] lIIlllIIIlIIl;

    @Inject
    protected p(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIlIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static String lIllIIlIIIllIlI(String var21, String var1) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var30 = Cipher.getInstance("Blowfish");
            var30.init(lIIlllIIIlIIl[2], var15);
            return new String(var30.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIlIIIllllI(String var8, String var27) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var27.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIIl[17]), "DES");
            Cipher var31 = Cipher.getInstance("DES");
            var31.init(lIIlllIIIlIIl[2], var16);
            return new String(var31.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIllll(Object object) {
        return object == null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ak() {
        boolean bl;
        p var17;
        if (p.lIllIIlIIlIlIll(this.as.solo() ? 1 : 0)) {
            int n2;
            if (!p.lIllIIlIIlIllII(this.ar.E(), lIIlllIIIlIIl[0]) || p.lIllIIlIIlIllIl(NPCs.getAll(nPC -> {
                int n2;
                if (p.lIllIIlIIllIIlI(nPC.getId(), lIIlllIIIlIIl[9])) {
                    String[] stringArray = new String[lIIlllIIIlIIl[0]];
                    stringArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[16]];
                    if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIlllIIIlIIl[0];
                        0;
                        if (-(0x50 ^ 0x55) < 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIIlllIIIlIIl[3];
                return n2 != 0;
            }).size()) && !p.lIllIIlIIlIlIll(this.ar.I() ? 1 : 0) || !p.lIllIIlIIlIlllI(var17.au.b(), lIIlllIIIlIIl[1]) || p.lIllIIlIIlIllIl(var17.au.b())) {
                int[] nArray = new int[lIIlllIIIlIIl[2]];
                nArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[4];
                nArray[p.lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[5];
                if (p.lIllIIlIIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = lIIlllIIIlIIl[0];
                    0;
                    if (((0x88 ^ 0x8D ^ (0x40 ^ 6)) & (0xFD ^ 0xAE ^ (0x8C ^ 0x9C) ^ -1)) >= 0) return n2 != 0;
                    return ((73 + 87 - 137 + 125 ^ 2 + 72 - -46 + 70) & (0x5F ^ 0x19 ^ (0x60 ^ 0xC) ^ -1)) != 0;
                }
            }
            n2 = lIIlllIIIlIIl[3];
            return n2 != 0;
        }
        if (p.lIllIIlIIlIllIl(var17.ar.L() ? 1 : 0)) {
            bl = lIIlllIIIlIIl[0];
            0;
            if (2 != 0) return bl;
            return false;
        }
        bl = lIIlllIIIlIIl[3];
        return bl;
    }

    private static String lIllIIlIIlIIIII(String var6, String var4) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var28 = var4.toCharArray();
        int var11 = lIIlllIIIlIIl[3];
        char[] var12 = var6.toCharArray();
        int var7 = var12.length;
        int var20 = lIIlllIIIlIIl[3];
        while (p.lIllIIlIIlIlllI(var20, var7)) {
            char var25 = var12[var20];
            var29.append((char)(var25 ^ var28[var11 % var28.length]));
            0;
            ++var11;
            ++var20;
            0;
            if ((117 + 46 - 66 + 34 ^ 23 + 5 - -64 + 42) > 0) continue;
            return null;
        }
        return String.valueOf(var29);
    }

    private static boolean lIllIIlIIllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIllIIlIIlIIIIl() {
        lIIlllIIIIllI = new String[lIIlllIIIlIIl[17]];
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[3]] = p."ammo crate null in dep fish";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[0]] = p."Fill";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[2]] = p."Douse";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[10]] = p."Douse";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[11]] = p."Fill";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[13]] = p."Check-ammo";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[14]] = p."Cannoneer";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[16]] = p."Douse";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var18;
        void var5;
        p var10;
        c c2 = this.ar.N();
        NPC nPC2 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[lIIlllIIIlIIl[0]];
            stringArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[11]];
            if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray) ? 1 : 0) && p.lIllIIlIIllIIII(nPC.getWorldLocation().distanceTo(c2.Z()), lIIlllIIIlIIl[12])) {
                void var2;
                p var23;
                void var19;
                String[] stringArray2 = new String[lIIlllIIIlIIl[0]];
                stringArray2[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[13]];
                if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray2) ? 1 : 0) && (p.lIllIIlIIlIlIll(c2.aj() ? 1 : 0) && !p.lIllIIlIIlIllIl(this.au.c(nPC.getWorldLocation().dx(lIIlllIIIlIIl[8])) ? 1 : 0) || p.lIllIIlIIlIllIl(var19.aj() ? 1 : 0) && p.lIllIIlIIlIlIll(var23.au.c(var2.getWorldLocation().dx(lIIlllIIIlIIl[0])) ? 1 : 0))) {
                    boolean bl;
                    String[] stringArray3 = new String[lIIlllIIIlIIl[0]];
                    stringArray3[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[14]];
                    NPC var14 = NPCs.getNearest((WorldPoint)var2.getWorldLocation(), (String[])stringArray3);
                    if (!p.lIllIIlIIllIIIl(var14) || p.lIllIIlIIlIllII(var14.getAnimation(), lIIlllIIIlIIl[15])) {
                        bl = lIIlllIIIlIIl[0];
                        0;
                        if (1 != 1) {
                            return ((0x98 ^ 0xA7 ^ (0x8D ^ 0xB5)) & (140 + 15 - 110 + 131 ^ 150 + 70 - 42 + 5 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlllIIIlIIl[3];
                    }
                    return bl;
                }
            }
            return lIIlllIIIlIIl[3];
        });
        if (p.lIllIIlIIlIllll(nPC2)) {
            System.out.println(lIIlllIIIIllI[lIIlllIIIlIIl[3]]);
            return lIIlllIIIlIIl[3];
        }
        if (p.lIllIIlIIlIlIll(var10.au.a(var5.ai()) ? 1 : 0)) {
            return var10.au.e(var5.ai());
        }
        Player var9 = Players.getLocal();
        if (p.lIllIIlIIlIlIll(var18.equals(var9.getInteracting()) ? 1 : 0)) {
            if (p.lIllIIlIIllIIII(var10.au.a(), lIIlllIIIlIIl[6])) {
                NPC var24 = NPCs.getNearest(nPC -> {
                    int n2;
                    block3: {
                        block2: {
                            if (!p.lIllIIlIIlIllII(nPC.getId(), lIIlllIIIlIIl[7])) break block2;
                            if (!p.lIllIIlIIllIIlI(nPC.getId(), lIIlllIIIlIIl[9])) break block3;
                            String[] stringArray = new String[lIIlllIIIlIIl[0]];
                            stringArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[10]];
                            if (!p.lIllIIlIIlIlIll(nPC.hasAction(stringArray) ? 1 : 0)) break block3;
                        }
                        n2 = lIIlllIIIlIIl[0];
                        0;
                        if (null == null) return n2 != 0;
                        return ((0xEE ^ 0xAF ^ (0xDE ^ 0x83)) & (0x56 ^ 0x14 ^ (0xE5 ^ 0xBB) ^ -1)) != 0;
                    }
                    n2 = lIIlllIIIlIIl[3];
                    return n2 != 0;
                });
                if (p.lIllIIlIIlIllIl(Movement.shouldWalk() ? 1 : 0)) {
                    return lIIlllIIIlIIl[3];
                }
                if (p.lIllIIlIIllIIIl(var24)) {
                    Movement.walk((WorldPoint)var9.getWorldLocation());
                    return lIIlllIIIlIIl[0];
                }
                int[] nArray = new int[lIIlllIIIlIIl[0]];
                nArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[7];
                TileObject var26 = TileObjects.getNearest((int[])nArray);
                if (p.lIllIIlIIllIIIl(var26)) {
                    Movement.walk((WorldPoint)var9.getWorldLocation());
                    return lIIlllIIIlIIl[0];
                }
                return lIIlllIIIlIIl[0];
            }
            return lIIlllIIIlIIl[0];
        }
        if (p.lIllIIlIIlIlIll(var10.as.solo() ? 1 : 0)) {
            if (p.lIllIIlIIlIllIl(var5.ai().equals((Object)var9.getWorldLocation()) ? 1 : 0)) {
                return var10.au.b(var5.ai());
            }
        } else {
            WorldPoint var24;
            if (p.lIllIIlIIlIlIll(var5.aj() ? 1 : 0)) {
                var24 = var18.getWorldLocation().dx(lIIlllIIIlIIl[8]);
                0;
                if (1 <= (2 & (2 ^ -1))) {
                    return ((0xC8 ^ 0x9E ^ (0x7D ^ 0x34)) & (70 + 96 - 159 + 122 ^ 137 + 135 - 188 + 74 ^ -1)) != 0;
                }
            } else {
                var24 = var18.getWorldLocation().dx(lIIlllIIIlIIl[0]);
            }
            if (p.lIllIIlIIlIllIl(var24.equals((Object)var9.getWorldLocation()) ? 1 : 0)) {
                return var10.au.b(var24);
            }
        }
        if (p.lIllIIlIIlIlIll(var10.as.solo() ? 1 : 0) && p.lIllIIlIIllIIII(var10.au.a(), var10.ar.H())) {
            NPC var26 = NPCs.getNearest(nPC -> {
                int n2;
                if (p.lIllIIlIIllIIlI(nPC.getId(), lIIlllIIIlIIl[9])) {
                    String[] stringArray = new String[lIIlllIIIlIIl[0]];
                    stringArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[2]];
                    if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIlllIIIlIIl[0];
                        0;
                        if (1 >= 0) return n2 != 0;
                        return ((0x6F ^ 0x3A ^ (0x15 ^ 0x68)) & (39 + 231 - 263 + 232 ^ 15 + 85 - 98 + 197 ^ -1)) != 0;
                    }
                }
                n2 = lIIlllIIIlIIl[3];
                return n2 != 0;
            });
            if (p.lIllIIlIIllIIIl(var26)) {
                return lIIlllIIIlIIl[0];
            }
            int[] nArray = new int[lIIlllIIIlIIl[0]];
            nArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[7];
            TileObject var3 = TileObjects.getNearest((int[])nArray);
            if (p.lIllIIlIIllIIIl(var3)) {
                return lIIlllIIIlIIl[0];
            }
        }
        nPC2.interact(lIIlllIIIIllI[lIIlllIIIlIIl[0]]);
        return lIIlllIIIlIIl[0];
    }

    private static boolean lIllIIlIIllIIIl(Object object) {
        return object != null;
    }

    static {
        p.lIllIIlIIlIlIlI();
        p.lIllIIlIIlIIIIl();
    }

    private static boolean lIllIIlIIlIllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIIlIIllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIIlIIlIlIlI() {
        lIIlllIIIlIIl = new int[18];
        p.lIIlllIIIlIIl[0] = 1;
        p.lIIlllIIIlIIl[1] = 0xB3 ^ 0x89;
        p.lIIlllIIIlIIl[2] = 2;
        p.lIIlllIIIlIIl[3] = (0x74 ^ 0x67 ^ (0x4C ^ 0x45)) & (0x9A ^ 0xAE ^ (0x9C ^ 0xB2) ^ -1);
        p.lIIlllIIIlIIl[4] = 0xFFFFEBFD & 0x77DF;
        p.lIIlllIIIlIIl[5] = 0xFFFFEFFC & 0x73DF;
        p.lIIlllIIIlIIl[6] = 69 + 3 - 71 + 145 ^ 131 + 95 - 164 + 78;
        p.lIIlllIIIlIIl[7] = 0xFFFFFDFE & 0xA22F;
        p.lIIlllIIIlIIl[8] = -1;
        p.lIIlllIIIlIIl[9] = 0xFFFFB9DF & 0x67E3;
        p.lIIlllIIIlIIl[10] = 3;
        p.lIIlllIIIlIIl[11] = 0x5A ^ 0x23 ^ (0xC0 ^ 0xBD);
        p.lIIlllIIIlIIl[12] = 0x66 ^ 0x7C ^ (0xBA ^ 0xAA);
        p.lIIlllIIIlIIl[13] = 139 + 43 - 163 + 167 ^ 175 + 72 - 85 + 29;
        p.lIIlllIIIlIIl[14] = 0x81 ^ 0xAB ^ (0xD ^ 0x21);
        p.lIIlllIIIlIIl[15] = 0xFFFFDF2B & 0x3CFF;
        p.lIIlllIIIlIIl[16] = 0x48 ^ 0x4F;
        p.lIIlllIIIlIIl[17] = 0x6F ^ 0x67;
    }
}

