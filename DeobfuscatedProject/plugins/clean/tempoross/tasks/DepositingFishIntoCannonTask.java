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
package gg.squire.tempoross.tasks;

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
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Depositing fish into cannon", priority=15, blocking=true)
public class DepositingFishIntoCannonTask
extends TemporossTaskBase {

    @Inject
    protected DepositingFishIntoCannonTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIlIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIIlIlllI(int n2, int n3) {
        return n2 < n3;
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
        p var1;
        if (p.lIllIIlIIlIlIll(this.as.solo() ? 1 : 0)) {
            int n2;
            if (!p.lIllIIlIIlIllII(this.ar.E(), lIIlllIIIlIIl[0]) || p.lIllIIlIIlIllIl(NPCs.getAll(nPC -> {
                int n2;
                if (p.lIllIIlIIllIIlI(nPC.getId(), lIIlllIIIlIIl[9])) {
                    String[] stringArray = new String[lIIlllIIIlIIl[0]];
                    stringArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[16]];
                    if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIlllIIIlIIl[0];

                        if (-(0x50 ^ 0x55) < 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIIlllIIIlIIl[3];
                return n2 != 0;
            }).size()) && !p.lIllIIlIIlIlIll(this.ar.I() ? 1 : 0) || !p.lIllIIlIIlIlllI(var1.au.b(), lIIlllIIIlIIl[1]) || p.lIllIIlIIlIllIl(var1.au.b())) {
                int[] nArray = new int[lIIlllIIIlIIl[2]];
                nArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[4];
                nArray[p.lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[5];
                if (p.lIllIIlIIlIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = lIIlllIIIlIIl[0];

                    if (((0x88 ^ 0x8D ^ (0x40 ^ 6)) & (0xFD ^ 0xAE ^ (0x8C ^ 0x9C) ^ -1)) >= 0) return n2 != 0;
                    return ((73 + 87 - 137 + 125 ^ 2 + 72 - -46 + 70) & (0x5F ^ 0x19 ^ (0x60 ^ 0xC) ^ -1)) != 0;
                }
            }
            n2 = lIIlllIIIlIIl[3];
            return n2 != 0;
        }
        if (p.lIllIIlIIlIllIl(var1.ar.L() ? 1 : 0)) {
            bl = lIIlllIIIlIIl[0];

            if (2 != 0) return bl;
            return false;
        }
        bl = lIIlllIIIlIIl[3];
        return bl;
    }

        return String.valueOf(var2);
    }

    private static boolean lIllIIlIIllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIllIIlIIlIIIIl() {
        lIIlllIIIIllI = new String[lIIlllIIIlIIl[17]];
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[3]] = "ammo crate null in dep fish";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[0]] = "Fill";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[2]] = "Douse";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[10]] = "Douse";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[11]] = "Fill";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[13]] = "Check-ammo";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[14]] = "Cannoneer";
        p.lIIlllIIIIllI[p.lIIlllIIIlIIl[16]] = "Douse";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var3;
        void var4;
        p var5;
        c c2 = this.ar.N();
        NPC nPC2 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[lIIlllIIIlIIl[0]];
            stringArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[11]];
            if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray) ? 1 : 0) && p.lIllIIlIIllIIII(nPC.getWorldLocation().distanceTo(c2.Z()), lIIlllIIIlIIl[12])) {
                void var6;
                p var7;
                void var8;
                String[] stringArray2 = new String[lIIlllIIIlIIl[0]];
                stringArray2[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[13]];
                if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray2) ? 1 : 0) && (p.lIllIIlIIlIlIll(c2.aj() ? 1 : 0) && !p.lIllIIlIIlIllIl(this.au.c(nPC.getWorldLocation().dx(lIIlllIIIlIIl[8])) ? 1 : 0) || p.lIllIIlIIlIllIl(var8.aj() ? 1 : 0) && p.lIllIIlIIlIlIll(var7.au.c(var6.getWorldLocation().dx(lIIlllIIIlIIl[0])) ? 1 : 0))) {
                    boolean bl;
                    String[] stringArray3 = new String[lIIlllIIIlIIl[0]];
                    stringArray3[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[14]];
                    NPC var9 = NPCs.getNearest((WorldPoint)var6.getWorldLocation(), (String[])stringArray3);
                    if (!p.lIllIIlIIllIIIl(var9) || p.lIllIIlIIlIllII(var9.getAnimation(), lIIlllIIIlIIl[15])) {
                        bl = lIIlllIIIlIIl[0];

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
        if (p.lIllIIlIIlIlIll(var5.au.a(var4.ai()) ? 1 : 0)) {
            return var5.au.e(var4.ai());
        }
        Player var10 = Players.getLocal();
        if (p.lIllIIlIIlIlIll(var3.equals(var10.getInteracting()) ? 1 : 0)) {
            if (p.lIllIIlIIllIIII(var5.au.a(), lIIlllIIIlIIl[6])) {
                NPC var11 = NPCs.getNearest(nPC -> {
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

                        if (null == null) return n2 != 0;
                        return ((0xEE ^ 0xAF ^ (0xDE ^ 0x83)) & (0x56 ^ 0x14 ^ (0xE5 ^ 0xBB) ^ -1)) != 0;
                    }
                    n2 = lIIlllIIIlIIl[3];
                    return n2 != 0;
                });
                if (p.lIllIIlIIlIllIl(Movement.shouldWalk() ? 1 : 0)) {
                    return lIIlllIIIlIIl[3];
                }
                if (p.lIllIIlIIllIIIl(var11)) {
                    Movement.walk((WorldPoint)var10.getWorldLocation());
                    return lIIlllIIIlIIl[0];
                }
                int[] nArray = new int[lIIlllIIIlIIl[0]];
                nArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[7];
                TileObject var12 = TileObjects.getNearest((int[])nArray);
                if (p.lIllIIlIIllIIIl(var12)) {
                    Movement.walk((WorldPoint)var10.getWorldLocation());
                    return lIIlllIIIlIIl[0];
                }
                return lIIlllIIIlIIl[0];
            }
            return lIIlllIIIlIIl[0];
        }
        if (p.lIllIIlIIlIlIll(var5.as.solo() ? 1 : 0)) {
            if (p.lIllIIlIIlIllIl(var4.ai().equals((Object)var10.getWorldLocation()) ? 1 : 0)) {
                return var5.au.b(var4.ai());
            }
        } else {
            WorldPoint var11;
            if (p.lIllIIlIIlIlIll(var4.aj() ? 1 : 0)) {
                var11 = var3.getWorldLocation().dx(lIIlllIIIlIIl[8]);

                if (1 <= (2 & (2 ^ -1))) {
                    return ((0xC8 ^ 0x9E ^ (0x7D ^ 0x34)) & (70 + 96 - 159 + 122 ^ 137 + 135 - 188 + 74 ^ -1)) != 0;
                }
            } else {
                var11 = var3.getWorldLocation().dx(lIIlllIIIlIIl[0]);
            }
            if (p.lIllIIlIIlIllIl(var11.equals((Object)var10.getWorldLocation()) ? 1 : 0)) {
                return var5.au.b(var11);
            }
        }
        if (p.lIllIIlIIlIlIll(var5.as.solo() ? 1 : 0) && p.lIllIIlIIllIIII(var5.au.a(), var5.ar.H())) {
            NPC var12 = NPCs.getNearest(nPC -> {
                int n2;
                if (p.lIllIIlIIllIIlI(nPC.getId(), lIIlllIIIlIIl[9])) {
                    String[] stringArray = new String[lIIlllIIIlIIl[0]];
                    stringArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[2]];
                    if (p.lIllIIlIIlIlIll(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIlllIIIlIIl[0];

                        if (1 >= 0) return n2 != 0;
                        return ((0x6F ^ 0x3A ^ (0x15 ^ 0x68)) & (39 + 231 - 263 + 232 ^ 15 + 85 - 98 + 197 ^ -1)) != 0;
                    }
                }
                n2 = lIIlllIIIlIIl[3];
                return n2 != 0;
            });
            if (p.lIllIIlIIllIIIl(var12)) {
                return lIIlllIIIlIIl[0];
            }
            int[] nArray = new int[lIIlllIIIlIIl[0]];
            nArray[p.lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[7];
            TileObject var13 = TileObjects.getNearest((int[])nArray);
            if (p.lIllIIlIIllIIIl(var13)) {
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

}

