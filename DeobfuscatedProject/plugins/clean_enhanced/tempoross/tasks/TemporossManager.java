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
        int[] nArray = new int[var1[1]];
        nArray[a.var1[0]] = var1[8];
        if (!a.var3(Inventory.contains((int[])nArray) ? 1 : 0) || a.var4(this.s() ? 1 : 0)) {
            bl = var1[1];
            0;
            if null != null {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
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
        this.h = var1[0];
        this.i = var1[0];
        this.j = var1[1];
        this.k = var1[2];
        this.l = var1[3];
        this.m = var1[4];
        this.n = var1[0];
        this.o = var1[0];
        this.p = var1[0];
        this.q = var1[0];
        this.r = var1[0];
        this.e = squireTempoross;
        this.f = squireTemporossConfig;
    }

    public void u() {
        this.j += var1[1];
        if (a.var4(this.f.solo() ? 1 : 0)) {
            this.n = var1[1];
        }
    }

    public void TemporossManager(c c2) {
        this.s = c2;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public boolean c(NPC nPC) {
        if (a.var4(this.e.TemporossManager((Locatable)nPC) ? 1 : 0)) {
            return this.e.b((SceneEntity)nPC);
        }
        return this.e.b((Locatable)nPC);
    }

    private static void var11() {
        var1 = new int[33];
        a.var1[0] = (85 + 153 - 159 + 105 ^ 34 + 23 - -11 + 62) & (0x4A ^ 7 ^ (0x56 ^ 0x21) ^ -1);
        a.var1[1] = 1;
        a.var1[2] = 0x44 ^ 0x33 ^ (0xFC ^ 0xA3);
        a.var1[3] = 0x81 ^ 0x8E;
        a.var1[4] = 0x94 ^ 0x8D;
        a.var1[5] = 0xFFFFABF5 & 0x574A;
        a.var1[6] = 0xFFFFF77F & 0xFB5;
        a.var1[7] = 0xFFFFF7BF & 0xF74;
        a.var1[8] = -(0xFFFFD46D & 0x2F97) & (0xFFFF87FE & 0x7FBF);
        a.var1[9] = 2;
        a.var1[10] = 3;
        a.var1[11] = 0xFFFFF92B & 0xFFF;
        a.var1[12] = 0xFFFFEFED & 0x743E;
        a.var1[13] = 0x17 ^ 0x45 ^ (0x1C ^ 0x4A);
        a.var1[14] = 0xB ^ 0xE;
        a.var1[15] = 0x1D ^ 0x1B;
        a.var1[16] = 0x6A ^ 0x5F ^ (0x77 ^ 0x52);
        a.var1[17] = 0 ^ 0x42 ^ (0x4C ^ 9);
        a.var1[18] = 93 + 14 - 37 + 71 ^ 83 + 89 - 155 + 116;
        a.var1[19] = 0x79 ^ 0x5F ^ (0x3B ^ 0x14);
        a.var1[20] = 0x5F ^ 0x27 ^ (0x6D ^ 0x1F);
        a.var1[21] = 0x32 ^ 0x39;
        a.var1[22] = 0xA3 ^ 0xAF;
        a.var1[23] = 140 + 175 - 283 + 149 ^ 55 + 2 - 49 + 176;
        a.var1[24] = 0x53 ^ 0x5D;
        a.var1[25] = 0x9F ^ 0x90 ^ (0x72 ^ 0x6C);
        a.var1[26] = 0x1A ^ 8;
        a.var1[27] = 0x86 ^ 0x95;
        a.var1[28] = 0x7B ^ 0x2F ^ (0x39 ^ 0x79);
        a.var1[29] = 105 + 147 - 217 + 115 ^ 49 + 118 - 59 + 23;
        a.var1[30] = 0x13 ^ 5;
        a.var1[31] = 0x21 ^ 0x76 ^ (0x61 ^ 0x21);
        a.var1[32] = 0xBE ^ 0xA6;
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
        void var12;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (a.var13(chatMessageType, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (a.var4(var12.contains(var2[var1[13]]) ? 1 : 0)) {
            var14.r = var1[1];
            var14.i += var1[1];
            var14.s = null;
            System.out.println(var2[var1[14]]);
        }
        if (a.var4(var12.contains(var2[var1[15]]) ? 1 : 0)) {
            String var15 = var12.substring(var1[16], var12.indexOf(var2[var1[17]]));
            String var16 = var15.replace(var2[var1[18]], var2[var1[19]]).replace(var2[var1[20]], var2[var1[21]]);
            int var17 = Integer.parseInt(var16);
            var14.h += var17;
        }
        if (a.var4(var12.toLowerCase().contains(var2[var1[22]]) ? 1 : 0)) {
            var14.p = var1[1];
        }
        if (!a.var3(var12.contains(var2[var1[23]]) ? 1 : 0) || a.var4(var12.contains(var2[var1[24]]) ? 1 : 0)) {
            var14.p = var1[0];
        }
        if (a.var4(var12.contains(var2[var1[3]]) ? 1 : 0)) {
            var14.q = var1[1];
        }
    }

    public boolean TemporossManager(NPC nPC, String string) {
        if (a.var4(this.e.TemporossManager((Locatable)nPC) ? 1 : 0)) {
            return this.e.b((SceneEntity)nPC);
        }
        nPC.interact(string);
        return var1[1];
    }

    public boolean k() {
        int n2;
        int n3 = Players.getLocal().getGraphic();
        int n4 = Players.getLocal().getAnimation();
        if (a.var18(n4, var1[5]) && (!a.var18(n3, var1[6]) || a.var19(n3, var1[7]))) {
            n2 = var1[1];
            0;
            if (1 < 0) {
                return ((192 + 114 - 102 + 50 ^ 163 + 149 - 144 + 4) & (0x2A ^ 0x72 ^ (0x6D ^ 0x67) ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    public void TemporossManager(StopWatch stopWatch) {
        this.g = stopWatch;
    }

    public void y() {
        this.h = var1[0];
        this.i = var1[0];
    }

    public boolean f(WorldPoint worldPoint) {
        if (a.var4(this.e.TemporossManager(worldPoint) ? 1 : 0)) {
            return this.e.e(worldPoint);
        }
        return this.e.b(worldPoint);
    }

    public void d(boolean bl) {
        this.q = bl;
    }

    public TileObject x() {
        return TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[var1[1]];
            stringArray[a.var1[0]] = var2[var1[16]];
            return tileObject.hasAction(stringArray);
        });
    }

    public void b(int n2) {
        this.i = n2;
    }

    public void d(int n2) {
        this.k = n2;
    }

    private static boolean var19(int n2, int n3) {
        return n2 == n3;
    }

    public void TemporossManager(int n2) {
        this.h = n2;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[0];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[0];
        while (a.var29(var28, var27)) {
            char var30 = var26[var28];
            var23.append((char)(var30 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            
            return null;
        }
        return String.valueOf(var23);
    }

    private static boolean var13(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var29(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var31(int n2, int n3) {
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
        if (a.var31(this.f.numberOfBuckets(), this.p())) {
            bl = var1[1];
            0;
            if (2 < 0) {
                return ((0x3C ^ 0x24 ^ (0x3F ^ 0x61)) & (0x15 ^ 0xB ^ (0x65 ^ 0x3D) ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    public SquireTemporossConfig A() {
        return this.f;
    }

    public NPC j() {
        return NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[var1[1]];
            stringArray[a.var1[0]] = var2[var1[30]];
            if (a.var4(nPC.hasAction(stringArray) ? 1 : 0) && a.var31(nPC.getWorldLocation().distanceTo(this.s.Z()), var1[20])) {
                String[] stringArray2 = new String[var1[1]];
                stringArray2[a.var1[0]] = var2[var1[31]];
                if (a.var4(nPC.hasAction(stringArray2) ? 1 : 0) && a.var4(this.e.TemporossManager((Actor)nPC) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (-1 < 0) return n2 != 0;
                    return ((0x20 ^ 0x78) & ~(0xE0 ^ 0xB8)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
    }

    public int n() {
        return Inventory.getCount(item -> {
            int n2;
            if (a.var4(item.getName().contains(var2[var1[26]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[a.var1[0]] = var2[var1[27]];
                if (a.var3(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if (3 >= 3) return n2 != 0;
                    return ((0x53 ^ 0x7E) & ~(0x59 ^ 0x74)) != 0;
                }
            }
            n2 = var1[0];
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
                int[] nArray = new int[var1[1]];
                nArray[a.var1[0]] = var1[11];
                if (!a.var3(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[var1[1]];
                nArray2[a.var1[0]] = var1[12];
                if (!a.var4(Equipment.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n2 = var1[1];
            0;
            if (-1 < 2) return n2 != 0;
            return ((0x8C ^ 0xA1 ^ (0xEC ^ 0xA3)) & (0x55 ^ 0x62 ^ (0x1F ^ 0x4A) ^ -1)) != 0;
        }
        n2 = var1[0];
        return n2 != 0;
    }

    public boolean o() {
        boolean bl;
        if (a.var19(this.f.numberOfBuckets(), this.n())) {
            bl = var1[1];
            0;
            if (((0x39 ^ 0xE ^ (0xA3 ^ 0xB2)) & (0x56 ^ 0x5C ^ (0x23 ^ 0xF) ^ -1)) == 2) {
                return ((0x44 ^ 0x6D ^ (0x70 ^ 1)) & (0xC0 ^ 0x8E ^ (0x97 ^ 0x81) ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    public boolean J() {
        return this.o;
    }

        catch (Exception var37) {
            var37.printStackTrace();
            return null;
        }
    }

    private static boolean var18(int n2, int n3) {
        return n2 != n3;
    }

    public boolean K() {
        return this.p;
    }

    static {
        a.var11();
        a.var38();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean s() {
        int n2;
        String[] stringArray = new String[var1[1]];
        stringArray[a.var1[0]] = var2[var1[0]];
        if (a.var4(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[var1[1]];
            stringArray2[a.var1[0]] = var2[var1[1]];
            if (a.var4(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[var1[1]];
                stringArray3[a.var1[0]] = var2[var1[9]];
                if (a.var4(Equipment.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[var1[1]];
                    stringArray4[a.var1[0]] = var2[var1[10]];
                    if (a.var4(Equipment.contains((String[])stringArray4) ? 1 : 0)) {
                        n2 = var1[1];
                        0;
                        if null == null return n2 != 0;
                        return ((0x60 ^ 0x30) & ~(0xF5 ^ 0xA5)) != 0;
                    }
                }
            }
        }
        n2 = var1[0];
        return n2 != 0;
    }

    public boolean L() {
        return this.q;
    }

    private static void var38() {
        var2 = new String[var1[32]];
        a.var2[a.var1[0]] = "Spirit angler headband";
        a.var2[a.var1[1]] = "Spirit angler top";
        a.var2[a.var1[9]] = "Spirit angler waders";
        a.var2[a.var1[10]] = "Spirit angler boots";
        a.var2[a.var1[13]] = "Subdued in";
        a.var2[a.var1[14]] = "Resetting game state!";
        a.var2[a.var1[15]] = "Reward permits:";
        a.var2[a.var1[17]] = ".";
        a.var2[a.var1[18]] = "<col=ef1020>";
        a.var2[a.var1[19]] = a.var5("DPmS47RX9lQ=", "gAfuR");
        a.var2[a.var1[20]] = "</col>";
        a.var2[a.var1[21]] = a.var5("sKGc9dQOECE=", "oUCnN");
        a.var2[a.var1[22]] = "a colossal wave closes in..";
        a.var2[a.var1[23]] = "the rope keeps you securely";
        a.var2[a.var1[24]] = "the wave slams into you";
        a.var2[a.var1[3]] = "Tempoross is vulnerable";
        a.var2[a.var1[16]] = "Repair";
        a.var2[a.var1[25]] = "Bucket";
        a.var2[a.var1[26]] = "Bucket";
        a.var2[a.var1[27]] = "Empty";
        a.var2[a.var1[28]] = "harpoon";
        a.var2[a.var1[29]] = "harpoon";
        a.var2[a.var1[30]] = "Fill";
        a.var2[a.var1[31]] = "Check-ammo";
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
        if (a.var4(this.m() ? 1 : 0) && a.var4(this.r() ? 1 : 0) && a.var4(this.q() ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (((150 + 214 - 202 + 56 ^ 132 + 70 - 112 + 64) & (0x20 ^ 0x57 ^ (0x42 ^ 0x75) ^ -1)) >= 2) {
                return ((19 + 102 - 113 + 125 ^ 68 + 148 - 68 + 37) & (103 + 106 - 113 + 51 ^ 123 + 25 - 69 + 96 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    public int p() {
        return Inventory.getCount(item -> item.getName().contains(var2[var1[25]]));
    }

    public boolean I() {
        return this.n;
    }

    public void b(boolean bl) {
        this.o = bl;
    }

    public void v() {
        this.r = var1[0];
    }

    public int D() {
        return this.i;
    }

    public void w() {
        this.j = var1[1];
        this.n = var1[0];
        this.q = var1[0];
        this.p = var1[0];
        this.s = null;
    }

    public boolean m() {
        boolean bl;
        if (!a.var3(Inventory.contains(item -> item.getName().toLowerCase().contains(var2[var1[29]])) ? 1 : 0) || a.var4(Equipment.contains(item -> item.getName().toLowerCase().contains(var2[var1[28]])) ? 1 : 0)) {
            bl = var1[1];
            0;
            if null != null {
                return ((68 + 88 - 30 + 60 ^ 18 + 90 - -17 + 28) & (108 + 52 - 19 + 19 ^ 33 + 69 - -12 + 17 ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    public int C() {
        return this.h;
    }

    public StopWatch B() {
        return this.g;
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    public void e(int n2) {
        this.l = n2;
    }
}

