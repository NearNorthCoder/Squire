/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.nightmare.tasks.NightmareManager;
import gg.squire.nightmare.tasks.NightmareManager;

public abstract class NightmareTaskBase
extends Task {
    protected  NPC cS;
    private static final  Logger cH;
    protected final  int[] cN;
    protected final  j cJ;
    protected  WorldArea cT;
    protected final  SquireNightmarePlugin cM;
    
    protected final  SquireNightmareConfig cK;
    protected  boolean cR;
    protected static final  int cI;
    protected  boolean cO;
    protected  boolean cQ;
    protected final  Client cL;
    protected  boolean cP;

    private static boolean lIIlIIIIlllIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIIIIlllIlll(Object object) {
        return object != null;
    }

    protected boolean bZ() {
        return this.cO;
    }

    protected NightmareTaskBase(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.cJ = j2;
        this.cL = client;
        this.cK = squireNightmareConfig;
        this.cM = squireNightmarePlugin;
        this.cN = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void lIIlIIIIlllIIII() {
        llllIlIlIIlI = new String[llllIlIlIIll[1]];
        C.llllIlIlIIlI[C.llllIlIlIIll[0]] = "sleepwalker";
        C.llllIlIlIIlI[C.llllIlIlIIll[3]] = "husk";
        C.llllIlIlIIlI[C.llllIlIlIIll[5]] = "parasite";
    }

    public boolean run() {
        int n2;
        int n3;
        int n4;
        C var1;
        int n5;
        if (C.lIIlIIIIlllIlII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIlIlIIll[0];
        }
        if (C.lIIlIIIIlllIlIl(Players.getLocal().getWorldLocation().getPlane(), llllIlIlIIll[1])) {
            return llllIlIlIIll[0];
        }
        if (C.lIIlIIIIlllIlII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (C.lIIlIIIIlllIllI(NPCs.getAll(nPC -> SquireNightmarePlugin.r.contains(nPC.getId())).size(), llllIlIlIIll[2])) {
            n5 = llllIlIlIIll[3];

            if ((0x6B ^ 0x6E) == 0) {
                return false;
            }
        } else {
            var1.cO = llllIlIlIIll[0];
            n5 = var1.cO ? 1 : 0;
        }
        if (C.lIIlIIIIlllIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (C.lIIlIIIIllllIIl(nPC.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[5]]) ? 1 : 0) && C.lIIlIIIIlllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIlIIll[3];

                if (2 > 3) {
                    return false;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        }))) {
            n4 = llllIlIlIIll[3];

            if (2 <= 0) {
                return ((112 + 155 - 171 + 86 ^ 97 + 63 - 33 + 62) & (0x6E ^ 0xC ^ (0x33 ^ 0x5A) ^ -1)) != 0;
            }
        } else {
            var1.cP = llllIlIlIIll[0];
            n4 = var1.cP ? 1 : 0;
        }
        if (C.lIIlIIIIlllIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (C.lIIlIIIIllllIIl(nPC.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[3]]) ? 1 : 0) && C.lIIlIIIIlllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIlIIll[3];

                if (((0x58 ^ 7 ^ (0xD8 ^ 0xB1)) & (0x4E ^ 0x1F ^ (0x21 ^ 0x46) ^ -1)) > (0x1C ^ 0x7A ^ (0x49 ^ 0x2B))) {
                    return ((0xFC ^ 0xAA ^ (0x54 ^ 0x16)) & (50 + 134 - 52 + 42 ^ 10 + 170 - 131 + 137 ^ -1)) != 0;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        }))) {
            n3 = llllIlIlIIll[3];

            if (2 < 0) {
                return ((0xC4 ^ 0xB7 ^ (0x3F ^ 5)) & (193 + 93 - 180 + 99 ^ 76 + 0 - 36 + 92 ^ -1)) != 0;
            }
        } else {
            var1.cQ = llllIlIlIIll[0];
            n3 = var1.cQ ? 1 : 0;
        }
        if (C.lIIlIIIIlllIlll(NPCs.getNearest(nPC -> {
            int n2;
            if (C.lIIlIIIIllllIIl(nPC.getName().equalsIgnoreCase(llllIlIlIIlI[llllIlIlIIll[0]]) ? 1 : 0) && C.lIIlIIIIlllIlII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIlIIll[3];

                if (1 > (0xB8 ^ 0xBC)) {
                    return false;
                }
            } else {
                n2 = llllIlIlIIll[0];
            }
            return n2 != 0;
        }))) {
            n2 = llllIlIlIIll[3];

            }
        } else {
            n2 = llllIlIlIIll[0];
        }
        var1.cR = n2;
        this.cS = SquireNightmarePlugin.d();
        this.cT = e.aw();
        return this.bY();
    }

    public abstract boolean bY();

    /*
     * WARNING - void declaration
     */
    protected List<WorldPoint> a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        void var2;
        void var3;
        WorldPoint var4;
        WorldPoint worldPoint3 = worldPoint2;
        int n2 = llllIlIlIIll[0];
        LinkedList<WorldPoint> linkedList = new LinkedList<WorldPoint>();
        linkedList.add(worldPoint2);

        while (C.lIIlIIIIlllIlII((var4 = var4.dx((int)Math.signum(var3.getX() - var4.getX())).dy((int)Math.signum(var3.getY() - var4.getY()))).equals((Object)var3) ? 1 : 0) && C.lIIlIIIIllllIII((int)(++var2), llllIlIlIIll[4])) {
            void var5;
            var5.add(var4);

            return null;
        }
        linkedList.add(worldPoint);

        Collections.reverse(linkedList);
        return linkedList;
    }

    static {
        C.lIIlIIIIlllIIll();
        C.lIIlIIIIlllIIII();
        cI = llllIlIlIIll[6];
        cH = LoggerFactory.getLogger(NightmareTaskBase.class);
    }

    private static boolean lIIlIIIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIlllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIlllIllI(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var6);
    }

    private static boolean lIIlIIIIllllIIl(int n2) {
        return n2 != 0;
    }
}

