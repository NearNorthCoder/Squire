/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.barrows.tasks.BarrowsManager;
import gg.squire.barrows.tasks.GameEnum20;

@TaskDesc(name="Going to house (mid trip)", priority=300, blocking=true)
public class GoingToHouseMidTripTask
extends Task {
    private final  SquireBarrowsConfig ac;
    private final  Client ae;
    private final  SquireBarrows ab;
    
    private final  c ad;

    private static boolean lIllIllIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIllIIlIllI(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIllIIlIIIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        s.lIllIllIIlIIII();
        s.lIllIllIIIllll();
    }

    private boolean N() {
        boolean bl;
        s var1;
        if (s.lIllIllIIlIIll(this.ac.neverRisk() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        if (!s.lIllIllIIlIIll(var1.ab.m() ? 1 : 0) || s.lIllIllIIlIIlI(var1.ab.h() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        Actor var2 = Players.getLocal().getInteracting();
        if (s.lIllIllIIllIII(var2)) {
            boolean bl2;
            NPC var3 = NPCs.getNearest(nPC -> {
                boolean bl;
                if (s.lIllIllIIllIlI(nPC.getInteracting(), Players.getLocal())) {
                    bl = llllIllIlII[4];

                    if (1 < 1) {
                        return false;
                    }
                } else {
                    bl = llllIllIlII[0];
                }
                return bl;
            });
            if (s.lIllIllIIllIII(var3)) {
                return llllIllIlII[4];
            }
            if (!s.lIllIllIIlIIll(d.a((Actor)var3) ? 1 : 0) || s.lIllIllIIllIIl(var3.getHealthRatio(), llllIllIlII[5])) {
                bl2 = llllIllIlII[4];

            } else {
                bl2 = llllIllIlII[0];
            }
            return bl2;
        }
        if (s.lIllIllIIlIIll(var2 instanceof Player)) {
            return llllIllIlII[0];
        }
        List<NPC> var3 = var1.ad.b(var1.ab.d());
        if (s.lIllIllIIlIIll(var3.contains((NPC)var2) ? 1 : 0)) {
            return llllIllIlII[4];
        }
        if (s.lIllIllIIlIIll(var2.getName().equals(d.DHAROK.C()) ? 1 : 0)) {
            return llllIllIlII[0];
        }
        if (!s.lIllIllIIlIIll(d.a((Actor)((NPC)var2)) ? 1 : 0) || s.lIllIllIIllIIl(var2.getHealthRatio(), llllIllIlII[5])) {
            bl = llllIllIlII[4];

            if (2 > 3) {
                return false;
            }
        } else {
            bl = llllIllIlII[0];
        }
        return bl;
    }

    public boolean run() {
        s var4;
        if (s.lIllIllIIlIIIl(Game.getState(), GameState.LOGGED_IN)) {
            return llllIllIlII[0];
        }
        if (s.lIllIllIIlIIlI(var4.ac.restoreMidTrip() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        if (s.lIllIllIIlIIll(var4.ae.isInInstancedRegion() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        if (s.lIllIllIIlIlII(var4.ab.e(), llllIllIlII[1])) {
            return llllIllIlII[0];
        }
        if (s.lIllIllIIlIIll(var4.N() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        int var5 = Prayers.getPoints();
        int var6 = Skills.getLevel((Skill)Skill.PRAYER) - var5;
        if (s.lIllIllIIlIlII(var4.ab.e(), llllIllIlII[2]) && s.lIllIllIIlIlIl(var6, llllIllIlII[3]) && s.lIllIllIIlIIlI(var4.ab.h() ? 1 : 0)) {
            Log.info((String)llllIllIIll[llllIllIlII[0]]);
            TeleportLoader.enterHouse();

            return llllIllIlII[4];
        }
        if (s.lIllIllIIlIllI(var5)) {
            return llllIllIlII[0];
        }
        Item var7 = Inventory.getFirst(item -> item.getName().startsWith(llllIllIIll[llllIllIlII[4]]));
        NPC var8 = NPCs.getNearest(nPC -> {
            int n2;
            if (s.lIllIllIIllIlI(nPC.getInteracting(), Players.getLocal()) && s.lIllIllIIlIIll(d.a((Actor)nPC) ? 1 : 0)) {
                n2 = llllIllIlII[4];

                if (1 <= -1) {
                    return false;
                }
            } else {
                n2 = llllIllIlII[0];
            }
            return n2 != 0;
        });
        if (s.lIllIllIIlIlll(var7) && s.lIllIllIIlIlll(var8)) {
            return llllIllIlII[0];
        }
        TeleportLoader.enterHouse();

        return llllIllIlII[4];
    }

    private static void lIllIllIIIllll() {
        llllIllIIll = new String[llllIllIlII[6]];
        s.llllIllIIll[s.llllIllIlII[0]] = "Going to house (last brother)";
        s.llllIllIIll[s.llllIllIlII[4]] = "Prayer";
    }

    private static boolean lIllIllIIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public GoingToHouseMidTripTask(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig, c c2, Client client) {
        this.ab = squireBarrows;
        this.ac = squireBarrowsConfig;
        this.ad = c2;
        this.ae = client;
    }

    private static boolean lIllIllIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIllIIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIIlIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIllIIllIII(Object object) {
        return object == null;
    }

    private static boolean lIllIllIIlIlII(int n2, int n3) {
        return n2 == n3;
    }
}

