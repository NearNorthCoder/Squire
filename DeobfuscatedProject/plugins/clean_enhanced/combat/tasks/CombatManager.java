/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package gg.squire.combat.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

@Singleton
public class CombatManager {

    private final  SquireBlueDragonKillerConfig n;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private void l() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n;
            if ((nPC.isDead( == 0) ? 1 : 0) && (nPC.getInteracting() == nPC.getInteracting()2))) {
                n = 1;
                0;
                if (((0x31 ^ 0x2C) & ~(0x77 ^ 0x6A)) >= (0x5B ^ 0x5F)) {
                    return ((0x82 ^ 0xC7) & ~(0x5C ^ 0x19)) != 0;
                }
            } else {
                n = 0;
            }
            return n != 0;
        });
        if nPC2 == null {
            return;
        }
        nPC2.interact(var2[1]);
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 0;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 0;
        while (var17 < lllllllllllllllIlllIlIlIlIlIIIII2) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public boolean n() {
        return this.n.dragonLocation().p().contains(Players.getLocal().getWorldLocation());
    }

    public NPC j() {
        return NPCs.getNearest(nPC -> {
            int n;
            if ((nPC.isDead( == 0) ? 1 : 0) && (nPC.getName( != 0).equals(var2[3]) ? 1 : 0) && (nPC.getWorldArea( != 0).hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) {
                n = 1;
                0;
                if (((35 + 92 - 110 + 117 ^ 108 + 50 - 19 + 0) & (0xA ^ 0x38 ^ (0xFD ^ 0xC2) ^ -1)) != ((70 + 73 - 22 + 82 ^ 131 + 119 - 189 + 72) & (142 + 119 - 205 + 140 ^ 76 + 92 - 70 + 40 ^ -1))) {
                    return ((210 + 153 - 152 + 24 ^ 139 + 117 - 190 + 130) & (0x2A ^ 0x43 ^ (0x62 ^ 0x24) ^ -1)) != 0;
                }
            } else {
                n = 0;
            }
            return n != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    public void k() {
        void var1_1;
        NPC var19;
        a var20;
        if ((Players.getLocal( != null).getInteracting())) {
            return;
        }
        if ((var20.m( != 0) ? 1 : 0)) {
            var20.l();
        }
        if ((var19 = var20.j( == null))) {
            return;
        }
        var1_1.interact(var2[0]);
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean m() {
        boolean bl;
        block4: {
            block3: {
                block2: {
                    Actor actor = Players.getLocal().getInteracting();
                    if (!actor != null) break block2;
                    String[] stringArray = new String[1];
                    stringArray[0] = var2[2];
                    if (!(actor.hasAction(stringArray == 0) ? 1 : 0)) break block3;
                }
                if (!(NPCs.getAll(nPC -> {
                    boolean bl;
                    if ((nPC.getInteracting( == 0) == nPC.getInteracting( == 0)2))) {
                        bl = 1;
                        0;
                        if (((0xC6 ^ 0x88 ^ (0x57 ^ 0x79)) & (0x29 ^ 0x2F ^ (0xE7 ^ 0x81) ^ -1)) > 0) {
                            return ((0x60 ^ 0x67 ^ (0x2C ^ 0x66)) & (135 + 41 - 83 + 153 ^ 40 + 9 - -63 + 75 ^ -1)) != 0;
                        }
                    } else {
                        bl = 0;
                    }
                    return bl;
                }).isEmpty() ? 1 : 0)) break block4;
            }
            bl = 1;
            0;
            if (-1 >= -1) return bl;
            return ((0x15 ^ 0x59) & ~(0x7F ^ 0x33)) != 0;
        }
        bl = 0;
        return bl;
    }

    @Inject
    public CombatManager(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.n = squireBlueDragonKillerConfig;
    }

}

