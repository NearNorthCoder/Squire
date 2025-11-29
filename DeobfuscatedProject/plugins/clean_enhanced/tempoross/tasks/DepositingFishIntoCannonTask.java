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

    private static boolean var3(int n2) {
        return n2 != 0;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var17(Object object) {
        return object == null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ak() {
        boolean bl;
        p var18;
        if (p.var3(this.as.solo() ? 1 : 0)) {
            int n2;
            if (!p.var19(this.ar.E(), var2[0]) || p.var20(NPCs.getAll(nPC -> {
                int n2;
                if (p.var21(nPC.getId(), var2[9])) {
                    String[] stringArray = new String[var2[0]];
                    stringArray[p.var2[3]] = var1[var2[16]];
                    if (p.var3(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var2[0];
                        0;
                        if (-(0x50 ^ 0x55) < 0) return n2 != 0;
                        return ((0x78 ^ 0x37) & ~(0x1C ^ 0x53)) != 0;
                    }
                }
                n2 = var2[3];
                return n2 != 0;
            }).size()) && !p.var3(this.ar.I() ? 1 : 0) || !p.var10(var18.au.b(), var2[1]) || p.var20(var18.au.b())) {
                int[] nArray = new int[var2[2]];
                nArray[p.var2[3]] = var2[4];
                nArray[p.var2[0]] = var2[5];
                if (p.var3(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    n2 = var2[0];
                    0;
                    if (((0x88 ^ 0x8D ^ (0x40 ^ 6)) & (0xFD ^ 0xAE ^ (0x8C ^ 0x9C) ^ -1)) >= 0) return n2 != 0;
                    return ((73 + 87 - 137 + 125 ^ 2 + 72 - -46 + 70) & (0x5F ^ 0x19 ^ (0x60 ^ 0xC) ^ -1)) != 0;
                }
            }
            n2 = var2[3];
            return n2 != 0;
        }
        if (p.var20(var18.ar.L() ? 1 : 0)) {
            bl = var2[0];
            0;
            if (2 != 0) return bl;
            return ((0xB6 ^ 0x82) & ~(0x2A ^ 0x1E)) != 0;
        }
        bl = var2[3];
        return bl;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[3];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[3];
        while (p.var10(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if ((117 + 46 - 66 + 34 ^ 23 + 5 - -64 + 42) > 0) continue;
            return null;
        }
        return String.valueOf(var25);
    }

    private static boolean var32(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var33() {
        var1 = new String[var2[17]];
        p.var1[p.var2[3]] = "ammo crate null in dep fish";
        p.var1[p.var2[0]] = "Fill";
        p.var1[p.var2[2]] = "Douse";
        p.var1[p.var2[10]] = "Douse";
        p.var1[p.var2[11]] = "Fill";
        p.var1[p.var2[13]] = "Check-ammo";
        p.var1[p.var2[14]] = "Cannoneer";
        p.var1[p.var2[16]] = "Douse";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var34;
        void var35;
        p var36;
        c c2 = this.ar.N();
        NPC nPC2 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[var2[0]];
            stringArray[p.var2[3]] = var1[var2[11]];
            if (p.var3(nPC.hasAction(stringArray) ? 1 : 0) && p.var32(nPC.getWorldLocation().distanceTo(c2.Z()), var2[12])) {
                void var37;
                p var38;
                void var39;
                String[] stringArray2 = new String[var2[0]];
                stringArray2[p.var2[3]] = var1[var2[13]];
                if (p.var3(nPC.hasAction(stringArray2) ? 1 : 0) && (p.var3(c2.aj() ? 1 : 0) && !p.var20(this.au.c(nPC.getWorldLocation().dx(var2[8])) ? 1 : 0) || p.var20(var39.aj() ? 1 : 0) && p.var3(var38.au.c(var37.getWorldLocation().dx(var2[0])) ? 1 : 0))) {
                    boolean bl;
                    String[] stringArray3 = new String[var2[0]];
                    stringArray3[p.var2[3]] = var1[var2[14]];
                    NPC var40 = NPCs.getNearest((WorldPoint)var37.getWorldLocation(), (String[])stringArray3);
                    if (!p.var41(var40) || p.var19(var40.getAnimation(), var2[15])) {
                        bl = var2[0];
                        0;
                        if (1 != 1) {
                            return ((0x98 ^ 0xA7 ^ (0x8D ^ 0xB5)) & (140 + 15 - 110 + 131 ^ 150 + 70 - 42 + 5 ^ -1)) != 0;
                        }
                    } else {
                        bl = var2[3];
                    }
                    return bl;
                }
            }
            return var2[3];
        });
        if (p.var17(nPC2)) {
            System.out.println(var1[var2[3]]);
            return var2[3];
        }
        if (p.var3(var36.au.a(var35.ai()) ? 1 : 0)) {
            return var36.au.e(var35.ai());
        }
        Player var42 = Players.getLocal();
        if (p.var3(var34.equals(var42.getInteracting()) ? 1 : 0)) {
            if (p.var32(var36.au.a(), var2[6])) {
                NPC var43 = NPCs.getNearest(nPC -> {
                    int n2;
                    block3: {
                        block2: {
                            if (!p.var19(nPC.getId(), var2[7])) break block2;
                            if (!p.var21(nPC.getId(), var2[9])) break block3;
                            String[] stringArray = new String[var2[0]];
                            stringArray[p.var2[3]] = var1[var2[10]];
                            if (!p.var3(nPC.hasAction(stringArray) ? 1 : 0)) break block3;
                        }
                        n2 = var2[0];
                        0;
                        if null == null return n2 != 0;
                        return ((0xEE ^ 0xAF ^ (0xDE ^ 0x83)) & (0x56 ^ 0x14 ^ (0xE5 ^ 0xBB) ^ -1)) != 0;
                    }
                    n2 = var2[3];
                    return n2 != 0;
                });
                if (p.var20(Movement.shouldWalk() ? 1 : 0)) {
                    return var2[3];
                }
                if (p.var41(var43)) {
                    Movement.walk((WorldPoint)var42.getWorldLocation());
                    return var2[0];
                }
                int[] nArray = new int[var2[0]];
                nArray[p.var2[3]] = var2[7];
                TileObject var44 = TileObjects.getNearest((int[])nArray);
                if (p.var41(var44)) {
                    Movement.walk((WorldPoint)var42.getWorldLocation());
                    return var2[0];
                }
                return var2[0];
            }
            return var2[0];
        }
        if (p.var3(var36.as.solo() ? 1 : 0)) {
            if (p.var20(var35.ai().equals((Object)var42.getWorldLocation()) ? 1 : 0)) {
                return var36.au.b(var35.ai());
            }
        } else {
            WorldPoint var43;
            if (p.var3(var35.aj() ? 1 : 0)) {
                var43 = var34.getWorldLocation().dx(var2[8]);
                0;
                if (1 <= (2 & (2 ^ -1))) {
                    return ((0xC8 ^ 0x9E ^ (0x7D ^ 0x34)) & (70 + 96 - 159 + 122 ^ 137 + 135 - 188 + 74 ^ -1)) != 0;
                }
            } else {
                var43 = var34.getWorldLocation().dx(var2[0]);
            }
            if (p.var20(var43.equals((Object)var42.getWorldLocation()) ? 1 : 0)) {
                return var36.au.b(var43);
            }
        }
        if (p.var3(var36.as.solo() ? 1 : 0) && p.var32(var36.au.a(), var36.ar.H())) {
            NPC var44 = NPCs.getNearest(nPC -> {
                int n2;
                if (p.var21(nPC.getId(), var2[9])) {
                    String[] stringArray = new String[var2[0]];
                    stringArray[p.var2[3]] = var1[var2[2]];
                    if (p.var3(nPC.hasAction(stringArray) ? 1 : 0)) {
                        n2 = var2[0];
                        0;
                        if (1 >= 0) return n2 != 0;
                        return ((0x6F ^ 0x3A ^ (0x15 ^ 0x68)) & (39 + 231 - 263 + 232 ^ 15 + 85 - 98 + 197 ^ -1)) != 0;
                    }
                }
                n2 = var2[3];
                return n2 != 0;
            });
            if (p.var41(var44)) {
                return var2[0];
            }
            int[] nArray = new int[var2[0]];
            nArray[p.var2[3]] = var2[7];
            TileObject var45 = TileObjects.getNearest((int[])nArray);
            if (p.var41(var45)) {
                return var2[0];
            }
        }
        nPC2.interact(var1[var2[0]]);
        return var2[0];
    }

    private static boolean var41(Object object) {
        return object != null;
    }

    static {
        p.var46();
        p.var33();
    }

    private static boolean var20(int n2) {
        return n2 == 0;
    }

    private static boolean var19(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var21(int n2, int n3) {
        return n2 == n3;
    }

    private static void var46() {
        var2 = new int[18];
        p.var2[0] = 1;
        p.var2[1] = 0xB3 ^ 0x89;
        p.var2[2] = 2;
        p.var2[3] = (0x74 ^ 0x67 ^ (0x4C ^ 0x45)) & (0x9A ^ 0xAE ^ (0x9C ^ 0xB2) ^ -1);
        p.var2[4] = 0xFFFFEBFD & 0x77DF;
        p.var2[5] = 0xFFFFEFFC & 0x73DF;
        p.var2[6] = 69 + 3 - 71 + 145 ^ 131 + 95 - 164 + 78;
        p.var2[7] = 0xFFFFFDFE & 0xA22F;
        p.var2[8] = -1;
        p.var2[9] = 0xFFFFB9DF & 0x67E3;
        p.var2[10] = 3;
        p.var2[11] = 0x5A ^ 0x23 ^ (0xC0 ^ 0xBD);
        p.var2[12] = 0x66 ^ 0x7C ^ (0xBA ^ 0xAA);
        p.var2[13] = 139 + 43 - 163 + 167 ^ 175 + 72 - 85 + 29;
        p.var2[14] = 0x81 ^ 0xAB ^ (0xD ^ 0x21);
        p.var2[15] = 0xFFFFDF2B & 0x3CFF;
        p.var2[16] = 0x48 ^ 0x4F;
        p.var2[17] = 0x6F ^ 0x67;
    }
}

