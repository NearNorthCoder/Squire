/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.commons.StopWatch
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.StopWatch;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import gg.squire.tempoross.tasks.TemporossManager;

@Singleton
public class TemporossManager {
    private final  SquireTemporossConfig f;
    private  int h;
    private  boolean p;
    private  c s;
    private  boolean q;
    private  boolean r;
    private  int i;
    private  int l;
    private  int j;
    
    private final  SquireTempoross e;
    private  StopWatch g;
    private  int k;
    private  int m;
    private  boolean o;
    
    private  boolean n;

    public void TemporossManager(boolean bl) {
        this.n = bl;
    }

    public int F() {
        return this.k;
    }

    public boolean r() {
        boolean bl;
        int[] nArray = new int[lIIllIllllIII[1]];
        nArray[a.lIIllIllllIII[0]] = lIIllIllllIII[8];
        if (!a.lIllIIIlllIIlll(Inventory.contains((int[])nArray) ? 1 : 0) || a.lIllIIIlllIIllI(this.s() ? 1 : 0)) {
            bl = lIIllIllllIII[1];

            }
        } else {
            bl = lIIllIllllIII[0];
        }
        return bl;
    }

    public boolean M() {
        return this.r;
    }

    public int H() {
        return this.m;
    }

    public c N() {
        return this.s;
    }

    @Inject
    public TemporossManager(SquireTempoross squireTempoross, SquireTemporossConfig squireTemporossConfig) {
        this.h = lIIllIllllIII[0];
        this.i = lIIllIllllIII[0];
        this.j = lIIllIllllIII[1];
        this.k = lIIllIllllIII[2];
        this.l = lIIllIllllIII[3];
        this.m = lIIllIllllIII[4];
        this.n = lIIllIllllIII[0];
        this.o = lIIllIllllIII[0];
        this.p = lIIllIllllIII[0];
        this.q = lIIllIllllIII[0];
        this.r = lIIllIllllIII[0];
        this.e = squireTempoross;
        this.f = squireTemporossConfig;
    }

    public void u() {
        this.j += lIIllIllllIII[1];
        if (a.lIllIIIlllIIllI(this.f.solo() ? 1 : 0)) {
            this.n = lIIllIllllIII[1];
        }
    }

    public void TemporossManager(c c2) {
        this.s = c2;
    }

    public boolean c(NPC nPC) {
        if (a.lIllIIIlllIIllI(this.e.TemporossManager((Locatable)nPC) ? 1 : 0)) {
            return this.e.b((SceneEntity)nPC);
        }
        return this.e.b((Locatable)nPC);
    }

    public void c(int n2) {
        this.j = n2;
    }

    public SquireTempoross z() {
        return this.e;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void TemporossManager(ChatMessage chatMessage) {
        void var1;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (a.lIllIIIlllIlIIl(chatMessageType, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (a.lIllIIIlllIIllI(var1.contains(lIIllIlllIllI[lIIllIllllIII[13]]) ? 1 : 0)) {
            var2.r = lIIllIllllIII[1];
            var2.i += lIIllIllllIII[1];
            var2.s = null;
            System.out.println(lIIllIlllIllI[lIIllIllllIII[14]]);
        }
        if (a.lIllIIIlllIIllI(var1.contains(lIIllIlllIllI[lIIllIllllIII[15]]) ? 1 : 0)) {
            String var3 = var1.substring(lIIllIllllIII[16], var1.indexOf(lIIllIlllIllI[lIIllIllllIII[17]]));
            String var4 = var3.replace(lIIllIlllIllI[lIIllIllllIII[18]], lIIllIlllIllI[lIIllIllllIII[19]]).replace(lIIllIlllIllI[lIIllIllllIII[20]], lIIllIlllIllI[lIIllIllllIII[21]]);
            int var5 = Integer.parseInt(var4);
            var2.h += var5;
        }
        if (a.lIllIIIlllIIllI(var1.toLowerCase().contains(lIIllIlllIllI[lIIllIllllIII[22]]) ? 1 : 0)) {
            var2.p = lIIllIllllIII[1];
        }
        if (!a.lIllIIIlllIIlll(var1.contains(lIIllIlllIllI[lIIllIllllIII[23]]) ? 1 : 0) || a.lIllIIIlllIIllI(var1.contains(lIIllIlllIllI[lIIllIllllIII[24]]) ? 1 : 0)) {
            var2.p = lIIllIllllIII[0];
        }
        if (a.lIllIIIlllIIllI(var1.contains(lIIllIlllIllI[lIIllIllllIII[3]]) ? 1 : 0)) {
            var2.q = lIIllIllllIII[1];
        }
    }

    public boolean TemporossManager(NPC nPC, String string) {
        if (a.lIllIIIlllIIllI(this.e.TemporossManager((Locatable)nPC) ? 1 : 0)) {
            return this.e.b((SceneEntity)nPC);
        }
        nPC.interact(string);
        return lIIllIllllIII[1];
    }

    public boolean k() {
        int n2;
        int n3 = Players.getLocal().getGraphic();
        int n4 = Players.getLocal().getAnimation();
        if (a.lIllIIIlllIIlII(n4, lIIllIllllIII[5]) && (!a.lIllIIIlllIIlII(n3, lIIllIllllIII[6]) || a.lIllIIIlllIIlIl(n3, lIIllIllllIII[7]))) {
            n2 = lIIllIllllIII[1];

            if (1 < 0) {
                return ((192 + 114 - 102 + 50 ^ 163 + 149 - 144 + 4) & (0x2A ^ 0x72 ^ (0x6D ^ 0x67) ^ -1)) != 0;
            }
        } else {
            n2 = lIIllIllllIII[0];
        }
        return n2 != 0;
    }

    public void TemporossManager(StopWatch stopWatch) {
        this.g = stopWatch;
    }

    public void y() {
        this.h = lIIllIllllIII[0];
        this.i = lIIllIllllIII[0];
    }

    public boolean f(WorldPoint worldPoint) {
        if (a.lIllIIIlllIIllI(this.e.TemporossManager(worldPoint) ? 1 : 0)) {
            return this.e.e(worldPoint);
        }
        return this.e.b(worldPoint);
    }

    public void d(boolean bl) {
        this.q = bl;
    }

    public TileObject x() {
        return TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIIllIllllIII[1]];
            stringArray[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[16]];
            return tileObject.hasAction(stringArray);
        });
    }

    public void b(int n2) {
        this.i = n2;
    }

    public void d(int n2) {
        this.k = n2;
    }

    private static boolean lIllIIIlllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public void TemporossManager(int n2) {
        this.h = n2;
    }

        return String.valueOf(var6);
    }

    private static boolean lIllIIIlllIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIlllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlllIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    public void c(boolean bl) {
        this.p = bl;
    }

    public int E() {
        return this.j;
    }

    public boolean q() {
        boolean bl;
        if (a.lIllIIIlllIlIII(this.f.numberOfBuckets(), this.p())) {
            bl = lIIllIllllIII[1];

            if (2 < 0) {
                return ((0x3C ^ 0x24 ^ (0x3F ^ 0x61)) & (0x15 ^ 0xB ^ (0x65 ^ 0x3D) ^ -1)) != 0;
            }
        } else {
            bl = lIIllIllllIII[0];
        }
        return bl;
    }

    public SquireTemporossConfig A() {
        return this.f;
    }

    public NPC j() {
        return NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIIllIllllIII[1]];
            stringArray[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[30]];
            if (a.lIllIIIlllIIllI(nPC.hasAction(stringArray) ? 1 : 0) && a.lIllIIIlllIlIII(nPC.getWorldLocation().distanceTo(this.s.Z()), lIIllIllllIII[20])) {
                String[] stringArray2 = new String[lIIllIllllIII[1]];
                stringArray2[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[31]];
                if (a.lIllIIIlllIIllI(nPC.hasAction(stringArray2) ? 1 : 0) && a.lIllIIIlllIIllI(this.e.TemporossManager((Actor)nPC) ? 1 : 0)) {
                    n2 = lIIllIllllIII[1];

                    if (-1 < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllIllllIII[0];
            return n2 != 0;
        });
    }

    public int n() {
        return Inventory.getCount(item -> {
            int n2;
            if (a.lIllIIIlllIIllI(item.getName().contains(lIIllIlllIllI[lIIllIllllIII[26]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIllllIII[1]];
                stringArray[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[27]];
                if (a.lIllIIIlllIIlll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIllllIII[1];

                    if (3 >= 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllIllllIII[0];
            return n2 != 0;
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean t() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[lIIllIllllIII[1]];
                nArray[a.lIIllIllllIII[0]] = lIIllIllllIII[11];
                if (!a.lIllIIIlllIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIllIllllIII[1]];
                nArray2[a.lIIllIllllIII[0]] = lIIllIllllIII[12];
                if (!a.lIllIIIlllIIllI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n2 = lIIllIllllIII[1];

            if (-1 < 2) return n2 != 0;
            return ((0x8C ^ 0xA1 ^ (0xEC ^ 0xA3)) & (0x55 ^ 0x62 ^ (0x1F ^ 0x4A) ^ -1)) != 0;
        }
        n2 = lIIllIllllIII[0];
        return n2 != 0;
    }

    public boolean o() {
        boolean bl;
        if (a.lIllIIIlllIIlIl(this.f.numberOfBuckets(), this.n())) {
            bl = lIIllIllllIII[1];

            if (((0x39 ^ 0xE ^ (0xA3 ^ 0xB2)) & (0x56 ^ 0x5C ^ (0x23 ^ 0xF) ^ -1)) == 2) {
                return ((0x44 ^ 0x6D ^ (0x70 ^ 1)) & (0xC0 ^ 0x8E ^ (0x97 ^ 0x81) ^ -1)) != 0;
            }
        } else {
            bl = lIIllIllllIII[0];
        }
        return bl;
    }

    private static boolean lIllIIIlllIIllI(int n2) {
        return n2 != 0;
    }

    public boolean J() {
        return this.o;
    }

    private static boolean lIllIIIlllIIlII(int n2, int n3) {
        return n2 != n3;
    }

    public boolean K() {
        return this.p;
    }

    static {
        a.lIllIIIlllIIIll();
        a.lIllIIIllIllIII();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean s() {
        int n2;
        String[] stringArray = new String[lIIllIllllIII[1]];
        stringArray[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[0]];
        if (a.lIllIIIlllIIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIllIllllIII[1]];
            stringArray2[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[1]];
            if (a.lIllIIIlllIIllI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIllIllllIII[1]];
                stringArray3[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[9]];
                if (a.lIllIIIlllIIllI(Equipment.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIllIllllIII[1]];
                    stringArray4[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[10]];
                    if (a.lIllIIIlllIIllI(Equipment.contains((String[])stringArray4) ? 1 : 0)) {
                        n2 = lIIllIllllIII[1];

                        if (null == null) return n2 != 0;
                        return false;
                    }
                }
            }
        }
        n2 = lIIllIllllIII[0];
        return n2 != 0;
    }

    public boolean L() {
        return this.q;
    }

    private static void lIllIIIllIllIII() {
        lIIllIlllIllI = new String[lIIllIllllIII[32]];
        a.lIIllIlllIllI[a.lIIllIllllIII[0]] = "Spirit angler headband";
        a.lIIllIlllIllI[a.lIIllIllllIII[1]] = "Spirit angler top";
        a.lIIllIlllIllI[a.lIIllIllllIII[9]] = "Spirit angler waders";
        a.lIIllIlllIllI[a.lIIllIllllIII[10]] = "Spirit angler boots";
        a.lIIllIlllIllI[a.lIIllIllllIII[13]] = "Subdued in";
        a.lIIllIlllIllI[a.lIIllIllllIII[14]] = "Resetting game state!";
        a.lIIllIlllIllI[a.lIIllIllllIII[15]] = "Reward permits:";
        a.lIIllIlllIllI[a.lIIllIllllIII[17]] = ".";
        a.lIIllIlllIllI[a.lIIllIllllIII[18]] = "<col=ef1020>";
        a.lIIllIlllIllI[a.lIIllIllllIII[19]] = a.lIllIIIllIlIlll("DPmS47RX9lQ=", "gAfuR");
        a.lIIllIlllIllI[a.lIIllIllllIII[20]] = "</col>";
        a.lIIllIlllIllI[a.lIIllIllllIII[21]] = a.lIllIIIllIlIlll("sKGc9dQOECE=", "oUCnN");
        a.lIIllIlllIllI[a.lIIllIllllIII[22]] = "a colossal wave closes in..";
        a.lIIllIlllIllI[a.lIIllIllllIII[23]] = "the rope keeps you securely";
        a.lIIllIlllIllI[a.lIIllIllllIII[24]] = "the wave slams into you";
        a.lIIllIlllIllI[a.lIIllIllllIII[3]] = "Tempoross is vulnerable";
        a.lIIllIlllIllI[a.lIIllIllllIII[16]] = "Repair";
        a.lIIllIlllIllI[a.lIIllIllllIII[25]] = "Bucket";
        a.lIIllIlllIllI[a.lIIllIllllIII[26]] = "Bucket";
        a.lIIllIlllIllI[a.lIIllIllllIII[27]] = "Empty";
        a.lIIllIlllIllI[a.lIIllIllllIII[28]] = "harpoon";
        a.lIIllIlllIllI[a.lIIllIllllIII[29]] = "harpoon";
        a.lIIllIlllIllI[a.lIIllIllllIII[30]] = "Fill";
        a.lIIllIlllIllI[a.lIIllIllllIII[31]] = "Check-ammo";
    }

    public void f(int n2) {
        this.m = n2;
    }

    public void e(boolean bl) {
        this.r = bl;
    }

    public int G() {
        return this.l;
    }

    public boolean l() {
        int n2;
        if (a.lIllIIIlllIIllI(this.m() ? 1 : 0) && a.lIllIIIlllIIllI(this.r() ? 1 : 0) && a.lIllIIIlllIIllI(this.q() ? 1 : 0)) {
            n2 = lIIllIllllIII[1];

            if (((150 + 214 - 202 + 56 ^ 132 + 70 - 112 + 64) & (0x20 ^ 0x57 ^ (0x42 ^ 0x75) ^ -1)) >= 2) {
                return false;
            }
        } else {
            n2 = lIIllIllllIII[0];
        }
        return n2 != 0;
    }

    public int p() {
        return Inventory.getCount(item -> item.getName().contains(lIIllIlllIllI[lIIllIllllIII[25]]));
    }

    public boolean I() {
        return this.n;
    }

    public void b(boolean bl) {
        this.o = bl;
    }

    public void v() {
        this.r = lIIllIllllIII[0];
    }

    public int D() {
        return this.i;
    }

    public void w() {
        this.j = lIIllIllllIII[1];
        this.n = lIIllIllllIII[0];
        this.q = lIIllIllllIII[0];
        this.p = lIIllIllllIII[0];
        this.s = null;
    }

    public boolean m() {
        boolean bl;
        if (!a.lIllIIIlllIIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIllllIII[29]])) ? 1 : 0) || a.lIllIIIlllIIllI(Equipment.contains(item -> item.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIllllIII[28]])) ? 1 : 0)) {
            bl = lIIllIllllIII[1];

            }
        } else {
            bl = lIIllIllllIII[0];
        }
        return bl;
    }

    public int C() {
        return this.h;
    }

    public StopWatch B() {
        return this.g;
    }

    private static boolean lIllIIIlllIIlll(int n2) {
        return n2 == 0;
    }

    public void e(int n2) {
        this.l = n2;
    }
}

