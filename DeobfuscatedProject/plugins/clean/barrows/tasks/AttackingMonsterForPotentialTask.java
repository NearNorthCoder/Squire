/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.movement.Reachable;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.GameEnum20;

@TaskDesc(name="Attacking monster for potential", priority=200)
public class AttackingMonsterForPotentialTask
extends Task {
    private final  a ai;
    private final  c aj;
    
    private final  SquireBarrows ah;

    private static boolean lIllIllIIIIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        v var1;
        if (v.lIllIllIIIIIIl(this.ah.g() ? 1 : 0)) {
            return llllIlIllll[0];
        }
        if (v.lIllIllIIIIIlI(var1.ah.h() ? 1 : 0)) {
            return llllIlIllll[0];
        }
        Actor var2 = Players.getLocal().getInteracting();
        if (v.lIllIllIIIIIll(var2) && v.lIllIllIIIIIIl(d.a(var2) ? 1 : 0)) {
            return llllIlIllll[0];
        }
        if (v.lIllIllIIIIIIl(var1.ah.AttackingMonsterForPotentialTask() ? 1 : 0)) {
            return llllIlIllll[0];
        }
        int var3 = var1.aj.d();
        Player var4 = Players.getLocal();
        List var5 = NPCs.getAll(nPC -> {
            int n3;
            if (v.lIllIllIIIIllI(nPC.getInteracting(), var4) && v.lIllIllIIIIIIl(this.aj.c(var3).contains(nPC.getName()) ? 1 : 0)) {
                n3 = llllIlIllll[2];

                if (1 != 1) {
                    return false;
                }
            } else {
                n3 = llllIlIllll[0];
            }
            return n3 != 0;
        });
        NPC var6 = NPCs.getNearest(nPC -> {
            int n2;
            if (v.lIllIllIIIIllI(nPC.getInteracting(), var4) && v.lIllIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                n2 = llllIlIllll[2];

            } else {
                n2 = llllIlIllll[0];
            }
            return n2 != 0;
        });
        if (v.lIllIllIIIIIll(var6) && v.lIllIllIIIIIIl(var5.contains(var6) ? 1 : 0)) {
            if (v.lIllIllIIIIIlI(Gear.isEquipped((int[])var1.ai.B()) ? 1 : 0)) {
                Gear.swapTo((int[])var1.ai.B());

            }
            if (v.lIllIllIIIIlII(var4.getInteracting(), var6)) {
                var6.interact(llllIlIllIl[llllIlIllll[0]]);
                var1.sleep(llllIlIllll[1]);
                return llllIlIllll[2];
            }
            return llllIlIllll[0];
        }
        NPC var7 = NPCs.getNearest(nPC -> {
            int n2;
            if (v.lIllIllIIIIIIl(var5.contains(nPC) ? 1 : 0) && v.lIllIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                n2 = llllIlIllll[2];

                if (((0xC5 ^ 0xBB ^ (0xDE ^ 0xA7)) & (89 + 81 - 139 + 125 ^ 35 + 147 - 34 + 7 ^ -1)) != ((0x79 ^ 0x40 ^ (0x7B ^ 2)) & (21 + 33 - -55 + 20 ^ 156 + 150 - 251 + 138 ^ -1))) {
                    return ((91 + 36 - 15 + 15 ^ (0x6F ^ 0x53)) & (0x48 ^ 0x53 ^ (0x7C ^ 0x24) ^ -1)) != 0;
                }
            } else {
                n2 = llllIlIllll[0];
            }
            return n2 != 0;
        });
        if (!v.lIllIllIIIIIll(var7) || v.lIllIllIIIIIll(var6) && v.lIllIllIIIIIlI(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
            TileObject var8 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (v.lIllIllIIIIIIl(tileObject.getName().equals(llllIlIllIl[llllIlIllll[5]]) ? 1 : 0)) {
                    String[] stringArray = new String[llllIlIllll[1]];
                    stringArray[v.llllIlIllll[0]] = llllIlIllIl[llllIlIllll[6]];
                    stringArray[v.llllIlIllll[2]] = llllIlIllIl[llllIlIllll[7]];
                    if (v.lIllIllIIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llllIlIllll[2];

                        if (-1 < ((89 + 147 - 85 + 2 ^ 29 + 102 - 7 + 71) & (157 + 221 - 256 + 113 ^ 136 + 21 - 33 + 53 ^ -1))) return n2 != 0;
                        return ((0x55 ^ 0x69 ^ (0x1D ^ 0x6B)) & (0xD ^ 0x23 ^ (0xE7 ^ 0x83) ^ -1)) != 0;
                    }
                }
                n2 = llllIlIllll[0];
                return n2 != 0;
            });
            if (v.lIllIllIIIIIll(var8) && v.lIllIllIIIIIlI(Reachable.isInteractable((Locatable)var8) ? 1 : 0)) {
                return llllIlIllll[0];
            }
            TileObject var9 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (v.lIllIllIIIIIIl(tileObject.getName().equals(llllIlIllIl[llllIlIllll[3]]) ? 1 : 0)) {
                    String[] stringArray = new String[llllIlIllll[2]];
                    stringArray[v.llllIlIllll[0]] = llllIlIllIl[llllIlIllll[4]];
                    if (v.lIllIllIIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llllIlIllll[2];

                        if (-1 != ((9 ^ 0x70 ^ (0xB1 ^ 0xAB)) & (0x75 ^ 0x67 ^ (0x75 ^ 4) ^ -1))) return n2 != 0;
                        return ((14 + 124 - 136 + 208 ^ 14 + 66 - -27 + 37) & (2 ^ (0x33 ^ 0x73) ^ -1)) != 0;
                    }
                }
                n2 = llllIlIllll[0];
                return n2 != 0;
            });
            if (v.lIllIllIIIIlIl(var9)) {
                return llllIlIllll[0];
            }
            var9.interact(llllIlIllIl[llllIlIllll[2]]);
            var1.sleep(llllIlIllll[3]);
            return llllIlIllll[2];
        }
        var6_6.interact(llllIlIllIl[llllIlIllll[1]]);
        return llllIlIllll[0];
    }

    private static boolean lIllIllIIIIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIllIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIIIlIl(Object object) {
        return object == null;
    }

    static {
        v.lIllIllIIIIIII();
        v.lIllIlIllllllI();
    }

    private static boolean lIllIllIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIllllllI() {
        llllIlIllIl = new String[llllIlIllll[8]];
        v.llllIlIllIl[v.llllIlIllll[0]] = "Attack";
        v.llllIlIllIl[v.llllIlIllll[2]] = "Open";
        v.llllIlIllIl[v.llllIlIllll[1]] = "Attack";
        v.llllIlIllIl[v.llllIlIllll[3]] = "Door";
        v.llllIlIllIl[v.llllIlIllll[4]] = "Open";
        v.llllIlIllIl[v.llllIlIllll[5]] = "Chest";
        v.llllIlIllIl[v.llllIlIllll[6]] = "Open";
        v.llllIlIllIl[v.llllIlIllll[7]] = "Search";
    }

    private static boolean lIllIllIIIIIll(Object object) {
        return object != null;
    }

        return String.valueOf(var10);
    }

    @Inject
    public AttackingMonsterForPotentialTask(SquireBarrows squireBarrows, a a2, c c2) {
        this.ah = squireBarrows;
        this.ai = a2;
        this.aj = c2;
    }
}

