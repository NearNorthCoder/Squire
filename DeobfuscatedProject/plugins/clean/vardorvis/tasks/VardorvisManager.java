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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.h;

@Singleton
public class VardorvisManager {
     List<Integer> O;
    
     Set<Integer> M;
    
    final  SquireVardorvis I;
    final  Client J;
     List<h> N;
     int K;
     int L;

    private static boolean lIllllIIlIllllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int a(int n2, int n3) {
        void var1;
        void var2;
        if (e.lIllllIIlIlllll(n2, lIlIIllllllII[4])) {
            if (e.lIllllIIlIlllll(n3, lIlIIllllllII[4])) {
                return lIlIIllllllII[2];
            }
            if (e.lIllllIIlIlllll((int)var2, lIlIIllllllII[1])) {
                return lIlIIllllllII[0];
            }
            if (e.lIllllIIlIlllll((int)var2, lIlIIllllllII[7])) {
                return lIlIIllllllII[1];
            }
        }
        if (e.lIllllIIlIlllll((int)var1, lIlIIllllllII[7])) {
            if (e.lIllllIIlIlllll((int)var2, lIlIIllllllII[4])) {
                return lIlIIllllllII[5];
            }
            if (e.lIllllIIlIlllll((int)var2, lIlIIllllllII[1])) {
                return lIlIIllllllII[4];
            }
            if (e.lIllllIIlIlllll((int)var2, lIlIIllllllII[7])) {
                return lIlIIllllllII[6];
            }
        }
        if (e.lIllllIIlIlllll((int)var1, lIlIIllllllII[1])) {
            if (e.lIllllIIlIlllll((int)var2, lIlIIllllllII[4])) {
                return lIlIIllllllII[8];
            }
            if (e.lIllllIIlIlllll((int)var2, lIlIIllllllII[7])) {
                return lIlIIllllllII[9];
            }
        }
        return lIlIIllllllII[10];
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
        e var3;
        void var4;
        String string = chatMessage.getMessage();
        if (e.lIllllIIllIIIII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && e.lIllllIIllIIIII(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (e.lIllllIIlIllllI(var4.contains(lIlIIlllllIll[lIlIIllllllII[3]]) ? 1 : 0)) {
            var3.x();
            System.out.println(lIlIIlllllIll[lIlIIllllllII[1]]);
            var3.I.a();
        }
        if (e.lIllllIIlIllllI(var4.contains(lIlIIlllllIll[lIlIIllllllII[0]]) ? 1 : 0)) {
            var3.I.d(lIlIIllllllII[1]);
            var3.x();
        }
    }

    static {
        e.lIllllIIlIlllII();
        e.lIllllIIlIllIll();
    }

    public List<h> C() {
        return this.N;
    }

    @Subscribe(priority=-2.1474836E9f)
    public void a(GameTick gameTick) {
        e var5;
        if (e.lIllllIIlIlllIl(this.O.size())) {
            System.out.println("Axes spawned: " + String.valueOf(this.O));
        }
        int var6 = var5.J.getTickCount();
        if (e.lIllllIIlIllllI(var5.O.contains(lIlIIllllllII[0]) ? 1 : 0)) {
            if (e.lIllllIIlIllllI(var5.O.contains(lIlIIllllllII[1]) ? 1 : 0) && e.lIllllIIlIllllI(var5.O.contains(lIlIIllllllII[2]) ? 1 : 0)) {
                var5.N.add(new h(var6 + lIlIIllllllII[1], lIlIIllllllII[3], lIlIIllllllII[1]));

                if (3 < 1) {
                    return;
                }
            } else if (e.lIllllIIlIllllI(var5.O.contains(lIlIIllllllII[1]) ? 1 : 0)) {
                var5.N.add(new h(var6 + lIlIIllllllII[1], lIlIIllllllII[1], lIlIIllllllII[3]));

            } else {
                var5.N.add(new h(var6 + lIlIIllllllII[1], lIlIIllllllII[3], lIlIIllllllII[3]));

            }
        }
        if (e.lIllllIIlIllllI(var5.O.contains(lIlIIllllllII[4]) ? 1 : 0)) {
            if (e.lIllllIIlIllllI(var5.O.contains(lIlIIllllllII[5]) ? 1 : 0) && e.lIllllIIlIllllI(var5.O.contains(lIlIIllllllII[6]) ? 1 : 0)) {
                var5.N.add(new h(var6 + lIlIIllllllII[4], lIlIIllllllII[3], lIlIIllllllII[1]));

                if ((0x1A ^ 0x1E) <= 0) {
                    return;
                }
            } else if (e.lIllllIIlIllllI(var5.O.contains(lIlIIllllllII[5]) ? 1 : 0)) {
                var5.N.add(new h(var6 + lIlIIllllllII[4], lIlIIllllllII[1], lIlIIllllllII[3]));

                if (((121 + 22 - 37 + 47 ^ 93 + 62 - 62 + 87) & (112 + 86 - 178 + 113 ^ 86 + 101 - 42 + 23 ^ -1)) >= 1) {
                    return;
                }
            } else {
                var5.N.add(new h(var6 + lIlIIllllllII[4], lIlIIllllllII[3], lIlIIllllllII[3]));

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
        if (e.lIllllIIlIlllll(nPC.getId(), g.V)) {
            int n2 = Static.getClient().getTickCount();
            WorldPoint worldPoint = this.m();
            int n3 = worldPoint.getWorldX();
            int n4 = worldPoint.getWorldY();
            int n5 = nPC.getWorldX();
            int n6 = nPC.getWorldY();
            int n7 = n3 - n5;
            int n8 = n4 - n6;
            this.O.add(this.a(n7, n8));

        }
    }

    private static void lIllllIIlIllIll() {
        lIlIIlllllIll = new String[lIlIIllllllII[2]];
        e.lIlIIlllllIll[e.lIlIIllllllII[3]] = "Your Vardorvis kill count is";
        e.lIlIIlllllIll[e.lIlIIllllllII[1]] = "Finishing kill";
        e.lIlIIlllllIll[e.lIlIIllllllII[0]] = "Oh dear, you are dead!";
    }

    private static boolean lIllllIIlIlllIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIllllIIlIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllllIIllIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIllllIIllIIIII(Object object, Object object2) {
        return object != object2;
    }

    private WorldPoint m() {
        int[] nArray = new int[lIlIIllllllII[1]];
        nArray[e.lIlIIllllllII[3]] = g.R;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (e.lIllllIIllIIIIl(tileObject)) {
            return new WorldPoint(lIlIIllllllII[3], lIlIIllllllII[3], lIlIIllllllII[3]);
        }
        return tileObject.getWorldLocation().dx(lIlIIllllllII[0]).dy(lIlIIllllllII[5]);
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
        return Vars.getBit((int)lIlIIllllllII[11]);
    }
}

