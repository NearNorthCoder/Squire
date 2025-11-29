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
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.o;

@TaskDesc(name="Depositing fish into cannon", priority=15, blocking=true)
public class p
extends o {
    private static /* synthetic */ String[] lIIlllIIIIllI;
    private static /* synthetic */ int[] lIIlllIIIlIIl;

    @Inject
    protected p(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIlIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static String lIllIIlIIIllIlI(String llllllllllllllIlllIllIIIlllllIIl, String llllllllllllllIlllIllIIIlllllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIIlllllIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIIlllllIll.init(lIIlllIIIlIIl[2], llllllllllllllIlllIllIIIllllllII);
            return new String(llllllllllllllIlllIllIIIlllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIIlllllIlI) {
            llllllllllllllIlllIllIIIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIlIIIllllI(String llllllllllllllIlllIllIIlIIIIIlII, String llllllllllllllIlllIllIIlIIIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIlIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIIl[17]), "DES");
            Cipher llllllllllllllIlllIllIIlIIIIlIII = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIlIIIIlIII.init(lIIlllIIIlIIl[2], llllllllllllllIlllIllIIlIIIIlIIl);
            return new String(llllllllllllllIlllIllIIlIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIlIIIIIlll) {
            llllllllllllllIlllIllIIlIIIIIlll.printStackTrace();
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
        p llllllllllllllIlllIllIIlIIlIlIlI;
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
                        return ((0x78 ^ 0x37) & ~(0x1C ^ 0x53)) != 0;
                    }
                }
                n2 = lIIlllIIIlIIl[3];
                return n2 != 0;
            }).size()) && !p.lIllIIlIIlIlIll(this.ar.I() ? 1 : 0) || !p.lIllIIlIIlIlllI(llllllllllllllIlllIllIIlIIlIlIlI.au.b(), lIIlllIIIlIIl[1]) || p.lIllIIlIIlIllIl(llllllllllllllIlllIllIIlIIlIlIlI.au.b())) {
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
        if (p.lIllIIlIIlIllIl(llllllllllllllIlllIllIIlIIlIlIlI.ar.L() ? 1 : 0)) {
            bl = lIIlllIIIlIIl[0];
            0;
            if (2 != 0) return bl;
            return ((0xB6 ^ 0x82) & ~(0x2A ^ 0x1E)) != 0;
        }
        bl = lIIlllIIIlIIl[3];
        return bl;
    }

    private static String lIllIIlIIlIIIII(String llllllllllllllIlllIllIIIlllIIlII, String llllllllllllllIlllIllIIIlllIIIll) {
        llllllllllllllIlllIllIIIlllIIlII = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIIlllIIlll = new StringBuilder();
        char[] llllllllllllllIlllIllIIIlllIIllI = llllllllllllllIlllIllIIIlllIIIll.toCharArray();
        int llllllllllllllIlllIllIIIlllIIlIl = lIIlllIIIlIIl[3];
        char[] llllllllllllllIlllIllIIIllIlllll = llllllllllllllIlllIllIIIlllIIlII.toCharArray();
        int llllllllllllllIlllIllIIIllIllllI = llllllllllllllIlllIllIIIllIlllll.length;
        int llllllllllllllIlllIllIIIllIlllIl = lIIlllIIIlIIl[3];
        while (p.lIllIIlIIlIlllI(llllllllllllllIlllIllIIIllIlllIl, llllllllllllllIlllIllIIIllIllllI)) {
            char llllllllllllllIlllIllIIIlllIlIlI = llllllllllllllIlllIllIIIllIlllll[llllllllllllllIlllIllIIIllIlllIl];
            llllllllllllllIlllIllIIIlllIIlll.append((char)(llllllllllllllIlllIllIIIlllIlIlI ^ llllllllllllllIlllIllIIIlllIIllI[llllllllllllllIlllIllIIIlllIIlIl % llllllllllllllIlllIllIIIlllIIllI.length]));
            0;
            ++llllllllllllllIlllIllIIIlllIIlIl;
            ++llllllllllllllIlllIllIIIllIlllIl;
            0;
            if ((117 + 46 - 66 + 34 ^ 23 + 5 - -64 + 42) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIIlllIIlll);
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
        void llllllllllllllIlllIllIIlIIlIIIII;
        void llllllllllllllIlllIllIIlIIlIIIIl;
        p llllllllllllllIlllIllIIlIIlIIIlI;
        c c2 = this.ar.N();
        NPC nPC2 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[lIIlllIIIlIIl[0]];
            stringArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[11]];
            if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray) ? 1 : 0) && p.lIllIIlIIllIIII(nPC.getWorldLocation().distanceTo(c2.Z()), lIIlllIIIlIIl[12])) {
                void llllllllllllllIlllIllIIlIIIlIIIl;
                p llllllllllllllIlllIllIIlIIIlIIll;
                void llllllllllllllIlllIllIIlIIIlIIlI;
                String[] stringArray2 = new String[lIIlllIIIlIIl[0]];
                stringArray2[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[13]];
                if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray2) ? 1 : 0) && (p.lIllIIlIIlIlIll(c2.aj() ? 1 : 0) && !p.lIllIIlIIlIllIl(this.au.c(nPC.getWorldLocation().dx(lIIlllIIIlIIl[8])) ? 1 : 0) || p.lIllIIlIIlIllIl(llllllllllllllIlllIllIIlIIIlIIlI.aj() ? 1 : 0) && p.lIllIIlIIlIlIll(llllllllllllllIlllIllIIlIIIlIIll.au.c(llllllllllllllIlllIllIIlIIIlIIIl.getWorldLocation().dx(lIIlllIIIlIIl[0])) ? 1 : 0))) {
                    boolean bl;
                    String[] stringArray3 = new String[lIIlllIIIlIIl[0]];
                    stringArray3[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[14]];
                    NPC llllllllllllllIlllIllIIlIIIlIIII = NPCs.getNearest((WorldPoint)llllllllllllllIlllIllIIlIIIlIIIl.getWorldLocation(), (String[])stringArray3);
                    if (!p.lIllIIlIIllIIIl(llllllllllllllIlllIllIIlIIIlIIII) || p.lIllIIlIIlIllII(llllllllllllllIlllIllIIlIIIlIIII.getAnimation(), lIIlllIIIlIIl[15])) {
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
        if (p.lIllIIlIIlIlIll(llllllllllllllIlllIllIIlIIlIIIlI.au.a(llllllllllllllIlllIllIIlIIlIIIIl.ai()) ? 1 : 0)) {
            return llllllllllllllIlllIllIIlIIlIIIlI.au.e(llllllllllllllIlllIllIIlIIlIIIIl.ai());
        }
        Player llllllllllllllIlllIllIIlIIIlllll = Players.getLocal();
        if (p.lIllIIlIIlIlIll(llllllllllllllIlllIllIIlIIlIIIII.equals(llllllllllllllIlllIllIIlIIIlllll.getInteracting()) ? 1 : 0)) {
            if (p.lIllIIlIIllIIII(llllllllllllllIlllIllIIlIIlIIIlI.au.a(), lIIlllIIIlIIl[6])) {
                NPC llllllllllllllIlllIllIIlIIIllllI = NPCs.getNearest(nPC -> {
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
                if (p.lIllIIlIIllIIIl(llllllllllllllIlllIllIIlIIIllllI)) {
                    Movement.walk((WorldPoint)llllllllllllllIlllIllIIlIIIlllll.getWorldLocation());
                    return lIIlllIIIlIIl[0];
                }
                int[] nArray = new int[lIIlllIIIlIIl[0]];
                nArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[7];
                TileObject llllllllllllllIlllIllIIlIIIlllIl = TileObjects.getNearest((int[])nArray);
                if (p.lIllIIlIIllIIIl(llllllllllllllIlllIllIIlIIIlllIl)) {
                    Movement.walk((WorldPoint)llllllllllllllIlllIllIIlIIIlllll.getWorldLocation());
                    return lIIlllIIIlIIl[0];
                }
                return lIIlllIIIlIIl[0];
            }
            return lIIlllIIIlIIl[0];
        }
        if (p.lIllIIlIIlIlIll(llllllllllllllIlllIllIIlIIlIIIlI.as.solo() ? 1 : 0)) {
            if (p.lIllIIlIIlIllIl(llllllllllllllIlllIllIIlIIlIIIIl.ai().equals((Object)llllllllllllllIlllIllIIlIIIlllll.getWorldLocation()) ? 1 : 0)) {
                return llllllllllllllIlllIllIIlIIlIIIlI.au.b(llllllllllllllIlllIllIIlIIlIIIIl.ai());
            }
        } else {
            WorldPoint llllllllllllllIlllIllIIlIIIllllI;
            if (p.lIllIIlIIlIlIll(llllllllllllllIlllIllIIlIIlIIIIl.aj() ? 1 : 0)) {
                llllllllllllllIlllIllIIlIIIllllI = llllllllllllllIlllIllIIlIIlIIIII.getWorldLocation().dx(lIIlllIIIlIIl[8]);
                0;
                if (1 <= (2 & (2 ^ -1))) {
                    return ((0xC8 ^ 0x9E ^ (0x7D ^ 0x34)) & (70 + 96 - 159 + 122 ^ 137 + 135 - 188 + 74 ^ -1)) != 0;
                }
            } else {
                llllllllllllllIlllIllIIlIIIllllI = llllllllllllllIlllIllIIlIIlIIIII.getWorldLocation().dx(lIIlllIIIlIIl[0]);
            }
            if (p.lIllIIlIIlIllIl(llllllllllllllIlllIllIIlIIIllllI.equals((Object)llllllllllllllIlllIllIIlIIIlllll.getWorldLocation()) ? 1 : 0)) {
                return llllllllllllllIlllIllIIlIIlIIIlI.au.b(llllllllllllllIlllIllIIlIIIllllI);
            }
        }
        if (p.lIllIIlIIlIlIll(llllllllllllllIlllIllIIlIIlIIIlI.as.solo() ? 1 : 0) && p.lIllIIlIIllIIII(llllllllllllllIlllIllIIlIIlIIIlI.au.a(), llllllllllllllIlllIllIIlIIlIIIlI.ar.H())) {
            NPC llllllllllllllIlllIllIIlIIIlllIl = NPCs.getNearest(nPC -> {
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
            if (p.lIllIIlIIllIIIl(llllllllllllllIlllIllIIlIIIlllIl)) {
                return lIIlllIIIlIIl[0];
            }
            int[] nArray = new int[lIIlllIIIlIIl[0]];
            nArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[7];
            TileObject llllllllllllllIlllIllIIlIIIlllII = TileObjects.getNearest((int[])nArray);
            if (p.lIllIIlIIllIIIl(llllllllllllllIlllIllIIlIIIlllII)) {
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

