/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.vardorvis.SquireVardorvis;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.HHelper;

@Singleton
public class VardorvisManager {
     List<Integer> O;
    
     Set<Integer> M;
    
    final  SquireVardorvis I;
    final  Client J;
     List<h> N;
     int K;
     int L;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int a(int n2, int n3) {
        void var4;
        void var5;
        if (e.var6(n2, var1[4])) {
            if (e.var6(n3, var1[4])) {
                return var1[2];
            }
            if (e.var6((int)var5, var1[1])) {
                return var1[0];
            }
            if (e.var6((int)var5, var1[7])) {
                return var1[1];
            }
        }
        if (e.var6((int)var4, var1[7])) {
            if (e.var6((int)var5, var1[4])) {
                return var1[5];
            }
            if (e.var6((int)var5, var1[1])) {
                return var1[4];
            }
            if (e.var6((int)var5, var1[7])) {
                return var1[6];
            }
        }
        if (e.var6((int)var4, var1[1])) {
            if (e.var6((int)var5, var1[4])) {
                return var1[8];
            }
            if (e.var6((int)var5, var1[7])) {
                return var1[9];
            }
        }
        return var1[10];
    }

    public Set<Integer> B() {
        return this.M;
    }

    public void x() {
        this.I.b();
        this.M.clear();
        this.O.clear();
        this.N.clear();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(ChatMessage chatMessage) {
        e var7;
        void var8;
        String string = chatMessage.getMessage();
        if (e.var9(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && e.var9(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (e.var3(var8.contains(var2[var1[3]]) ? 1 : 0)) {
            var7.x();
            System.out.println(var2[var1[1]]);
            var7.I.a();
        }
        if (e.var3(var8.contains(var2[var1[0]]) ? 1 : 0)) {
            var7.I.d(var1[1]);
            var7.x();
        }
    }

    private static void var10() {
        var1 = new int[12];
        e.var1[0] = 2;
        e.var1[1] = 1;
        e.var1[2] = 3;
        e.var1[3] = (0x10 ^ 0x47 ^ (0xE6 ^ 0x9A)) & (0x20 ^ 0x2F ^ (0x38 ^ 0x1C) ^ -1);
        e.var1[4] = 0x48 ^ 0x57 ^ (0xAE ^ 0xB7);
        e.var1[5] = 0x35 ^ 0x30;
        e.var1[6] = 138 + 58 - 179 + 153 ^ 69 + 2 - -61 + 41;
        e.var1[7] = -(0x52 ^ 4 ^ (0xF0 ^ 0xA2));
        e.var1[8] = 0x2E ^ 0x2A;
        e.var1[9] = 0x24 ^ 0x2C;
        e.var1[10] = -1;
        e.var1[11] = 0xFFFF9FD7 & 0x77FB;
    }

    static {
        e.var10();
        e.var11();
    }

    public List<h> C() {
        return this.N;
    }

    @Subscribe(priority=-2.1474836E9f)
    public void a(GameTick gameTick) {
        e var12;
        if (e.var13(this.O.size())) {
            System.out.println("Axes spawned: " + String.valueOf(this.O));
        }
        int var14 = var12.J.getTickCount();
        if (e.var3(var12.O.contains(var1[0]) ? 1 : 0)) {
            if (e.var3(var12.O.contains(var1[1]) ? 1 : 0) && e.var3(var12.O.contains(var1[2]) ? 1 : 0)) {
                var12.N.add(new HHelper(var14 + var1[1], var1[3], var1[1]));
                0;
                0;
                if (3 < 1) {
                    return;
                }
            } else if (e.var3(var12.O.contains(var1[1]) ? 1 : 0)) {
                var12.N.add(new HHelper(var14 + var1[1], var1[1], var1[3]));
                0;
                0;
                if (-3 > 0) {
                    return;
                }
            } else {
                var12.N.add(new HHelper(var14 + var1[1], var1[3], var1[3]));
                0;
            }
        }
        if (e.var3(var12.O.contains(var1[4]) ? 1 : 0)) {
            if (e.var3(var12.O.contains(var1[5]) ? 1 : 0) && e.var3(var12.O.contains(var1[6]) ? 1 : 0)) {
                var12.N.add(new HHelper(var14 + var1[4], var1[3], var1[1]));
                0;
                0;
                if ((0x1A ^ 0x1E) <= 0) {
                    return;
                }
            } else if (e.var3(var12.O.contains(var1[5]) ? 1 : 0)) {
                var12.N.add(new HHelper(var14 + var1[4], var1[1], var1[3]));
                0;
                0;
                if (((121 + 22 - 37 + 47 ^ 93 + 62 - 62 + 87) & (112 + 86 - 178 + 113 ^ 86 + 101 - 42 + 23 ^ -1)) >= 1) {
                    return;
                }
            } else {
                var12.N.add(new HHelper(var14 + var1[4], var1[3], var1[3]));
                0;
            }
        }
        this.O.clear();
    }

    public int A() {
        return this.L;
    }

    public List<Integer> D() {
        return this.O;
    }

    @Subscribe(priority=2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (e.var6(nPC.getId(), g.V)) {
            int n2 = Static.getClient().getTickCount();
            WorldPoint worldPoint = this.m();
            int n3 = worldPoint.getWorldX();
            int n4 = worldPoint.getWorldY();
            int n5 = nPC.getWorldX();
            int n6 = nPC.getWorldY();
            int n7 = n3 - n5;
            int n8 = n4 - n6;
            this.O.add(this.a(n7, n8));
            0;
        }
    }

    private static void var11() {
        var2 = new String[var1[2]];
        e.var2[e.var1[3]] = "Your Vardorvis kill count is";
        e.var2[e.var1[1]] = "Finishing kill";
        e.var2[e.var1[0]] = "Oh dear, you are dead!";
    }

    private static boolean var13(int n2) {
        return n2 > 0;
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    private static boolean var9(Object object, Object object2) {
        return object != object2;
    }

    private WorldPoint m() {
        int[] nArray = new int[var1[1]];
        nArray[e.var1[3]] = g.R;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (e.var15(tileObject)) {
            return new WorldPoint(var1[3], var1[3], var1[3]);
        }
        return tileObject.getWorldLocation().dx(var1[0]).dy(var1[5]);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public int z() {
        return this.K;
    }

    @Inject
    public VardorvisManager(SquireVardorvis squireVardorvis, Client client) {
        this.M = new HashSet<Integer>();
        this.N = new ArrayList<h>();
        this.O = new ArrayList<Integer>();
        this.I = squireVardorvis;
        this.J = client;
    }

    public int y() {
        return Vars.getBit((int)var1[11]);
    }
}

